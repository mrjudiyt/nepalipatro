package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.i;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.ServiceStarter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@KeepForSdk
public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context2) {
        this.context = context2;
        this.executor = i.f3908h;
    }

    private static Task<Integer> bindToMessagingService(Context context2, Intent intent, boolean z10) {
        WithinAppServiceConnection serviceConnection = getServiceConnection(context2, ServiceStarter.ACTION_MESSAGING_EVENT);
        if (!z10) {
            return serviceConnection.sendIntent(intent).continueWith(i.f3908h, d.f13952a);
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context2)) {
            WakeLockHolder.sendWakefulServiceIntent(context2, serviceConnection, intent);
        } else {
            serviceConnection.sendIntent(intent);
        }
        return Tasks.forResult(-1);
    }

    private static WithinAppServiceConnection getServiceConnection(Context context2, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            if (fcmServiceConn == null) {
                fcmServiceConn = new WithinAppServiceConnection(context2, str);
            }
            withinAppServiceConnection = fcmServiceConn;
        }
        return withinAppServiceConnection;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$bindToMessagingService$3(Task task) {
        return -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startMessagingService$1(Task task) {
        return 403;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Task lambda$startMessagingService$2(Context context2, Intent intent, boolean z10, Task task) {
        return (!PlatformVersion.isAtLeastO() || ((Integer) task.getResult()).intValue() != 402) ? task : bindToMessagingService(context2, intent, z10).continueWith(i.f3908h, e.f13954a);
    }

    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    public static void setServiceConnection(WithinAppServiceConnection withinAppServiceConnection) {
        synchronized (lock) {
            fcmServiceConn = withinAppServiceConnection;
        }
    }

    @KeepForSdk
    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_BINARY_DATA_BASE_64);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(EXTRA_BINARY_DATA_BASE_64);
        }
        return startMessagingService(this.context, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> startMessagingService(Context context2, Intent intent) {
        boolean z10 = true;
        boolean z11 = PlatformVersion.isAtLeastO() && context2.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z10 = false;
        }
        if (!z11 || z10) {
            return Tasks.call(this.executor, new f(context2, intent)).continueWithTask(this.executor, new c(context2, intent, z10));
        }
        return bindToMessagingService(context2, intent, z10);
    }

    public FcmBroadcastProcessor(Context context2, ExecutorService executorService) {
        this.context = context2;
        this.executor = executorService;
    }
}
