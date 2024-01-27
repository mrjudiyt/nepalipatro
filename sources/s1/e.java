package s1;

import android.content.Context;
import android.os.Build;
import androidx.work.m;
import androidx.work.n;
import r1.b;
import t1.g;
import v1.p;
import x1.a;

/* compiled from: NetworkMeteredController */
public class e extends c<b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f11317e = m.f("NetworkMeteredCtrlr");

    public e(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(p pVar) {
        return pVar.f12264j.b() == n.METERED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            m.c().a(f11317e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.a();
        } else if (!bVar.a() || !bVar.b()) {
            return true;
        } else {
            return false;
        }
    }
}
