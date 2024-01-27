package e6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import f6.r;
import f6.s;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final class i extends r {
    public i(Context context) {
        super(new s("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f14578a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f14578a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f14578a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState f10 = InstallState.f(intent, this.f14578a);
        this.f14578a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", f10);
        c(f10);
    }
}
