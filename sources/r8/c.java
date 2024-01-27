package r8;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;
import o8.q;
import r8.g;
import y8.p;

/* compiled from: CoroutineContextImpl.kt */
public final class c implements g, Serializable {

    /* renamed from: h  reason: collision with root package name */
    private final g f16400h;

    /* renamed from: i  reason: collision with root package name */
    private final g.b f16401i;

    /* compiled from: CoroutineContextImpl.kt */
    private static final class a implements Serializable {

        /* renamed from: i  reason: collision with root package name */
        public static final C0274a f16402i = new C0274a((kotlin.jvm.internal.g) null);

        /* renamed from: h  reason: collision with root package name */
        private final g[] f16403h;

        /* renamed from: r8.c$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineContextImpl.kt */
        public static final class C0274a {
            private C0274a() {
            }

            public /* synthetic */ C0274a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public a(g[] gVarArr) {
            m.f(gVarArr, "elements");
            this.f16403h = gVarArr;
        }

        private final Object readResolve() {
            g[] gVarArr = this.f16403h;
            g gVar = h.f16410h;
            for (g Y : gVarArr) {
                gVar = gVar.Y(Y);
            }
            return gVar;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    static final class b extends n implements p<String, g.b, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f16404h = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, g.b bVar) {
            m.f(str, "acc");
            m.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: r8.c$c  reason: collision with other inner class name */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C0275c extends n implements p<q, g.b, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g[] f16405h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ x f16406i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0275c(g[] gVarArr, x xVar) {
            super(2);
            this.f16405h = gVarArr;
            this.f16406i = xVar;
        }

        public final void a(q qVar, g.b bVar) {
            m.f(qVar, "<anonymous parameter 0>");
            m.f(bVar, "element");
            g[] gVarArr = this.f16405h;
            x xVar = this.f16406i;
            int i10 = xVar.f15574h;
            xVar.f15574h = i10 + 1;
            gVarArr[i10] = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((q) obj, (g.b) obj2);
            return q.f16189a;
        }
    }

    public c(g gVar, g.b bVar) {
        m.f(gVar, ViewHierarchyConstants.DIMENSION_LEFT_KEY);
        m.f(bVar, "element");
        this.f16400h = gVar;
        this.f16401i = bVar;
    }

    private final boolean b(g.b bVar) {
        return m.a(h(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (b(cVar.f16401i)) {
            g gVar = cVar.f16400h;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                m.d(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((g.b) gVar);
            }
        }
        return false;
    }

    private final int d() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f16400h;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    private final Object writeReplace() {
        int d10 = d();
        g[] gVarArr = new g[d10];
        x xVar = new x();
        w(q.f16189a, new C0275c(gVarArr, xVar));
        if (xVar.f15574h == d10) {
            return new a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public g W(g.c<?> cVar) {
        m.f(cVar, Constants.KEY);
        if (this.f16401i.h(cVar) != null) {
            return this.f16400h;
        }
        g W = this.f16400h.W(cVar);
        if (W == this.f16400h) {
            return this;
        }
        if (W == h.f16410h) {
            return this.f16401i;
        }
        return new c(W, this.f16401i);
    }

    public g Y(g gVar) {
        return g.a.a(this, gVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.d() != d() || !cVar.c(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <E extends g.b> E h(g.c<E> cVar) {
        m.f(cVar, Constants.KEY);
        c cVar2 = this;
        while (true) {
            E h10 = cVar2.f16401i.h(cVar);
            if (h10 != null) {
                return h10;
            }
            g gVar = cVar2.f16400h;
            if (!(gVar instanceof c)) {
                return gVar.h(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f16400h.hashCode() + this.f16401i.hashCode();
    }

    public String toString() {
        return '[' + ((String) w("", b.f16404h)) + ']';
    }

    public <R> R w(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        m.f(pVar, "operation");
        return pVar.invoke(this.f16400h.w(r10, pVar), this.f16401i);
    }
}
