package t1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.m;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.analytics.FirebaseAnalytics;
import x1.a;

/* compiled from: BatteryNotLowTracker */
public class b extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    private static final String f11573i = m.f("BatteryNotLowTracker");

    public b(Context context, a aVar) {
        super(context, aVar);
    }

    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            m.c().a(f11573i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                d(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                d(Boolean.FALSE);
            }
        }
    }

    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.f11579b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            m.c().b(f11573i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
