package s8;

import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import o8.q;
import r8.d;
import r8.g;
import y8.p;

/* compiled from: IntrinsicsJvm.kt */
class c {

    /* compiled from: IntrinsicsJvm.kt */
    public static final class a extends j {

        /* renamed from: h  reason: collision with root package name */
        private int f16467h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p f16468i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f16469j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, p pVar, Object obj) {
            super(dVar);
            this.f16468i = pVar;
            this.f16469j = obj;
            m.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f16467h;
            if (i10 == 0) {
                this.f16467h = 1;
                o8.m.b(obj);
                m.d(this.f16468i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) c0.b(this.f16468i, 2)).invoke(this.f16469j, this);
            } else if (i10 == 1) {
                this.f16467h = 2;
                o8.m.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        private int f16470h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p f16471i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f16472j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f16471i = pVar;
            this.f16472j = obj;
            m.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f16470h;
            if (i10 == 0) {
                this.f16470h = 1;
                o8.m.b(obj);
                m.d(this.f16471i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) c0.b(this.f16471i, 2)).invoke(this.f16472j, this);
            } else if (i10 == 1) {
                this.f16470h = 2;
                o8.m.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> d<q> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        m.f(pVar, "<this>");
        m.f(dVar, "completion");
        d<? super T> a10 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, a10);
        }
        g context = a10.getContext();
        if (context == r8.h.f16410h) {
            return new a(a10, pVar, r10);
        }
        return new b(a10, context, pVar, r10);
    }

    public static <T> d<T> b(d<? super T> dVar) {
        d<Object> intercepted;
        m.f(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
