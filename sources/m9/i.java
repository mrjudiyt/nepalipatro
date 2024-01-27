package m9;

import i9.x1;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l9.e;
import o8.l;
import o8.q;
import r8.g;
import r8.h;
import y8.p;

/* compiled from: SafeCollector.kt */
public final class i<T> extends d implements e<T> {

    /* renamed from: h  reason: collision with root package name */
    public final e<T> f15764h;

    /* renamed from: i  reason: collision with root package name */
    public final g f15765i;

    /* renamed from: j  reason: collision with root package name */
    public final int f15766j;

    /* renamed from: k  reason: collision with root package name */
    private g f15767k;

    /* renamed from: l  reason: collision with root package name */
    private r8.d<? super q> f15768l;

    /* compiled from: SafeCollector.kt */
    static final class a extends n implements p<Integer, g.b, Integer> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f15769h = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public i(e<? super T> eVar, g gVar) {
        super(g.f15759h, h.f16410h);
        this.f15764h = eVar;
        this.f15765i = gVar;
        this.f15766j = ((Number) gVar.w(0, a.f15769h)).intValue();
    }

    private final void a(g gVar, g gVar2, T t10) {
        if (gVar2 instanceof e) {
            f((e) gVar2, t10);
        }
        k.a(this, gVar);
    }

    private final Object c(r8.d<? super q> dVar, T t10) {
        g context = dVar.getContext();
        x1.f(context);
        g gVar = this.f15767k;
        if (gVar != context) {
            a(context, gVar, t10);
            this.f15767k = context;
        }
        this.f15768l = dVar;
        y8.q a10 = j.f15770a;
        e<T> eVar = this.f15764h;
        m.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        m.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a10.invoke(eVar, t10, this);
        if (!m.a(invoke, d.c())) {
            this.f15768l = null;
        }
        return invoke;
    }

    private final void f(e eVar, Object obj) {
        throw new IllegalStateException(i.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + eVar.f15757h + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t10, r8.d<? super q> dVar) {
        try {
            Object c10 = c(dVar, t10);
            if (c10 == d.c()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return c10 == d.c() ? c10 : q.f16189a;
        } catch (Throwable th) {
            this.f15767k = new e(th, dVar.getContext());
            throw th;
        }
    }

    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        r8.d<? super q> dVar = this.f15768l;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    public g getContext() {
        g gVar = this.f15767k;
        return gVar == null ? h.f16410h : gVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable b10 = l.b(obj);
        if (b10 != null) {
            this.f15767k = new e(b10, getContext());
        }
        r8.d<? super q> dVar = this.f15768l;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return d.c();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
