package f6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import j6.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    protected final s f14578a;

    /* renamed from: b  reason: collision with root package name */
    private final IntentFilter f14579b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14580c;

    /* renamed from: d  reason: collision with root package name */
    protected final Set f14581d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private q f14582e = null;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f14583f = false;

    protected r(s sVar, IntentFilter intentFilter, Context context) {
        this.f14578a = sVar;
        this.f14579b = intentFilter;
        this.f14580c = e0.a(context);
    }

    private final void d() {
        q qVar;
        if (!this.f14581d.isEmpty() && this.f14582e == null) {
            q qVar2 = new q(this, (p) null);
            this.f14582e = qVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f14580c.registerReceiver(qVar2, this.f14579b, 2);
            } else {
                this.f14580c.registerReceiver(qVar2, this.f14579b);
            }
        }
        if (this.f14581d.isEmpty() && (qVar = this.f14582e) != null) {
            this.f14580c.unregisterReceiver(qVar);
            this.f14582e = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(a aVar) {
        this.f14578a.d("registerListener", new Object[0]);
        d.a(aVar, "Registered Play Core listener should not be null.");
        this.f14581d.add(aVar);
        d();
    }

    public final synchronized void c(Object obj) {
        Iterator it = new HashSet(this.f14581d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(obj);
        }
    }
}
