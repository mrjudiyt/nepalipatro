package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
class SyncTask implements Runnable {
    /* access modifiers changed from: private */
    public final FirebaseInstanceId iid;
    private final long nextDelaySeconds;
    @VisibleForTesting
    ExecutorService processorExecutor = FirebaseIidExecutors.newCachedSingleThreadExecutor();
    private final PowerManager.WakeLock syncWakeLock;

    @VisibleForTesting
    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    static class ConnectivityChangeReceiver extends BroadcastReceiver {
        private SyncTask task;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.task = syncTask;
        }

        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.task;
            if (syncTask != null && syncTask.isDeviceConnected()) {
                FirebaseInstanceId.isDebugLogEnabled();
                this.task.iid.enqueueTaskWithDelaySeconds(this.task, 0);
                this.task.getContext().unregisterReceiver(this);
                this.task = null;
            }
        }

        public void registerReceiver() {
            FirebaseInstanceId.isDebugLogEnabled();
            this.task.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @VisibleForTesting
    SyncTask(FirebaseInstanceId firebaseInstanceId, long j10) {
        this.iid = firebaseInstanceId;
        this.nextDelaySeconds = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.iid.getApp().getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    public boolean isDeviceConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean maybeRefreshToken() {
        if (!this.iid.tokenNeedsRefresh(this.iid.getTokenWithoutTriggeringSync())) {
            return true;
        }
        try {
            return this.iid.blockingGetMasterToken() != null;
        } catch (IOException e10) {
            if (GmsRpc.isErrorMessageForRetryableError(e10.getMessage())) {
                String message = e10.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                return false;
            } else if (e10.getMessage() == null) {
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            this.iid.setSyncScheduledOrRunning(true);
            if (!this.iid.isGmsCorePresent()) {
                this.iid.setSyncScheduledOrRunning(false);
                if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                    return;
                }
            } else if (!ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) || isDeviceConnected()) {
                if (maybeRefreshToken()) {
                    this.iid.setSyncScheduledOrRunning(false);
                } else {
                    this.iid.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                }
                if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                    return;
                }
            } else {
                new ConnectivityChangeReceiver(this).registerReceiver();
                if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                    return;
                }
            }
        } catch (IOException e10) {
            String message = e10.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            this.iid.setSyncScheduledOrRunning(false);
            if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                return;
            }
        } catch (Throwable th) {
            if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
            throw th;
        }
        this.syncWakeLock.release();
    }
}
