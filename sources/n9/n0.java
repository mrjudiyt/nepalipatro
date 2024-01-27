package n9;

import i9.n2;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import r8.g;
import y8.p;

/* compiled from: ThreadContext.kt */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f15826a = new j0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final p<Object, g.b, Object> f15827b = a.f15830h;

    /* renamed from: c  reason: collision with root package name */
    private static final p<n2<?>, g.b, n2<?>> f15828c = b.f15831h;

    /* renamed from: d  reason: collision with root package name */
    private static final p<r0, g.b, r0> f15829d = c.f15832h;

    /* compiled from: ThreadContext.kt */
    static final class a extends n implements p<Object, g.b, Object> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f15830h = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof n2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class b extends n implements p<n2<?>, g.b, n2<?>> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f15831h = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final n2<?> invoke(n2<?> n2Var, g.b bVar) {
            if (n2Var != null) {
                return n2Var;
            }
            if (bVar instanceof n2) {
                return (n2) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class c extends n implements p<r0, g.b, r0> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f15832h = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final r0 invoke(r0 r0Var, g.b bVar) {
            if (bVar instanceof n2) {
                n2 n2Var = (n2) bVar;
                r0Var.a(n2Var, n2Var.I0(r0Var.f15844a));
            }
            return r0Var;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj != f15826a) {
            if (obj instanceof r0) {
                ((r0) obj).b(gVar);
                return;
            }
            Object w10 = gVar.w(null, f15828c);
            m.d(w10, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((n2) w10).r0(gVar, obj);
        }
    }

    public static final Object b(g gVar) {
        Object w10 = gVar.w(0, f15827b);
        m.c(w10);
        return w10;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f15826a;
        }
        if (obj instanceof Integer) {
            return gVar.w(new r0(gVar, ((Number) obj).intValue()), f15829d);
        }
        m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((n2) obj).I0(gVar);
    }
}
