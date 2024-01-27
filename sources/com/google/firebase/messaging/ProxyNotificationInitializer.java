package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import androidx.privacysandbox.ads.adservices.topics.i;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

final class ProxyNotificationInitializer {
    private static final String MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED = "firebase_messaging_notification_delegation_enabled";

    private ProxyNotificationInitializer() {
    }

    private static boolean allowedToUse(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    static void initialize(Context context) {
        if (!ProxyNotificationPreferences.isProxyNotificationInitialized(context)) {
            setEnableProxyNotification(i.f3908h, context, shouldEnableProxyNotification(context));
        }
    }

    static boolean isProxyNotificationEnabled(Context context) {
        if (!PlatformVersion.isAtLeastQ()) {
            return false;
        }
        if (!allowedToUse(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("error retrieving notification delegate for package ");
            sb.append(context.getPackageName());
            return false;
        } else if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setEnableProxyNotification$0(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        try {
            if (!allowedToUse(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("error configuring notification delegate for package ");
                sb.append(context.getPackageName());
                return;
            }
            ProxyNotificationPreferences.setProxyNotificationsInitialized(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            taskCompletionSource.trySetResult(null);
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    @TargetApi(29)
    static Task<Void> setEnableProxyNotification(Executor executor, Context context, boolean z10) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new y(context, z10, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private static boolean shouldEnableProxyNotification(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
