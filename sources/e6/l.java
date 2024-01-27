package e6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import h6.a;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    private final w f14261a;

    /* renamed from: b  reason: collision with root package name */
    private final i f14262b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14263c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f14264d = new Handler(Looper.getMainLooper());

    l(w wVar, i iVar, Context context) {
        this.f14261a = wVar;
        this.f14262b = iVar;
        this.f14263c = context;
    }

    public final boolean a(a aVar, Activity activity, d dVar, int i10) {
        if (activity == null) {
            return false;
        }
        return f(aVar, new k(this, activity), dVar, i10);
    }

    public final Task<Void> b() {
        return this.f14261a.d(this.f14263c.getPackageName());
    }

    public final Task<a> c() {
        return this.f14261a.e(this.f14263c.getPackageName());
    }

    public final boolean d(a aVar, int i10, Activity activity, int i11) {
        d c10 = d.c(i10);
        if (activity == null) {
            return false;
        }
        return f(aVar, new k(this, activity), c10, i11);
    }

    public final synchronized void e(a aVar) {
        this.f14262b.b(aVar);
    }

    public final boolean f(a aVar, g6.a aVar2, d dVar, int i10) {
        if (aVar == null || aVar2 == null || dVar == null || !aVar.f(dVar) || aVar.m()) {
            return false;
        }
        aVar.l();
        aVar2.a(aVar.j(dVar).getIntentSender(), i10, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
