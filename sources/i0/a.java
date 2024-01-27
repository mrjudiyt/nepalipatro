package i0;

import android.content.Context;
import g0.c;
import g0.e;
import h0.b;
import i9.a1;
import i9.l0;
import i9.m0;
import i9.m2;
import i9.u1;
import j0.d;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import y8.l;

/* compiled from: PreferenceDataStoreDelegate.kt */
public final class a {

    /* renamed from: i0.a$a  reason: collision with other inner class name */
    /* compiled from: PreferenceDataStoreDelegate.kt */
    static final class C0148a extends n implements l<Context, List<? extends c<d>>> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0148a f9058h = new C0148a();

        C0148a() {
            super(1);
        }

        /* renamed from: a */
        public final List<c<d>> invoke(Context context) {
            m.f(context, "it");
            return p.e();
        }
    }

    public static final a9.a<Context, e<d>> a(String str, b<d> bVar, l<? super Context, ? extends List<? extends c<d>>> lVar, l0 l0Var) {
        m.f(str, "name");
        m.f(lVar, "produceMigrations");
        m.f(l0Var, "scope");
        return new c(str, bVar, lVar, l0Var);
    }

    public static /* synthetic */ a9.a b(String str, b bVar, l lVar, l0 l0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = C0148a.f9058h;
        }
        if ((i10 & 8) != 0) {
            a1 a1Var = a1.f14897a;
            l0Var = m0.a(a1.b().Y(m2.b((u1) null, 1, (Object) null)));
        }
        return a(str, bVar, lVar, l0Var);
    }
}
