package t1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.m;

/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f11574h = m.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f11575g = new a();

    /* compiled from: BroadcastReceiverConstraintTracker */
    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, x1.a aVar) {
        super(context, aVar);
    }

    public void e() {
        m.c().a(f11574h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f11579b.registerReceiver(this.f11575g, g());
    }

    public void f() {
        m.c().a(f11574h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f11579b.unregisterReceiver(this.f11575g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
