package s1;

import android.content.Context;
import android.os.Build;
import androidx.work.m;
import androidx.work.n;
import r1.b;
import t1.g;
import v1.p;
import x1.a;

/* compiled from: NetworkNotRoamingController */
public class f extends c<b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f11318e = m.f("NetworkNotRoamingCtrlr");

    public f(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(p pVar) {
        return pVar.f12264j.b() == n.NOT_ROAMING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT < 24) {
            m.c().a(f11318e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar.a();
        } else if (!bVar.a() || !bVar.c()) {
            return true;
        } else {
            return false;
        }
    }
}
