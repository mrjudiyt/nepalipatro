package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.m;
import o1.i;
import w1.d;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f4784a = m.f("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Intent f4785h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Context f4786i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f4787j;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4785h = intent;
            this.f4786i = context;
            this.f4787j = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f4785h.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f4785h.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f4785h.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f4785h.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                m.c().a(ConstraintProxyUpdateReceiver.f4784a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                d.a(this.f4786i, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                d.a(this.f4786i, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                d.a(this.f4786i, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                d.a(this.f4786i, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f4787j.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            m.c().a(f4784a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
        } else {
            i.m(context).r().b(new a(intent, context, goAsync()));
        }
    }
}
