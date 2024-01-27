package g0;

import com.google.android.gms.common.api.Api;
import i9.l0;
import i9.n0;
import i9.u1;
import java.util.concurrent.atomic.AtomicInteger;
import k9.g;
import k9.h;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import o8.q;
import r8.d;
import y8.l;
import y8.p;

/* compiled from: SimpleActor.kt */
public final class k<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final l0 f8699a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p<T, d<? super q>, Object> f8700b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k9.d<T> f8701c = g.b(Api.BaseClientBuilder.API_PRIORITY_OTHER, (k9.a) null, (l) null, 6, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f8702d = new AtomicInteger(0);

    /* compiled from: SimpleActor.kt */
    static final class a extends n implements l<Throwable, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l<Throwable, q> f8703h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ k<T> f8704i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, q> f8705j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l<? super Throwable, q> lVar, k<T> kVar, p<? super T, ? super Throwable, q> pVar) {
            super(1);
            this.f8703h = lVar;
            this.f8704i = kVar;
            this.f8705j = pVar;
        }

        public final void a(Throwable th) {
            q qVar;
            this.f8703h.invoke(th);
            this.f8704i.f8701c.g(th);
            do {
                Object f10 = h.f(this.f8704i.f8701c.b());
                if (f10 == null) {
                    qVar = null;
                    continue;
                } else {
                    this.f8705j.invoke(f10, th);
                    qVar = q.f16189a;
                    continue;
                }
            } while (qVar != null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f16189a;
        }
    }

    @f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    /* compiled from: SimpleActor.kt */
    static final class b extends kotlin.coroutines.jvm.internal.k implements p<l0, d<? super q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        Object f8706h;

        /* renamed from: i  reason: collision with root package name */
        int f8707i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ k<T> f8708j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k<T> kVar, d<? super b> dVar) {
            super(2, dVar);
            this.f8708j = kVar;
        }

        public final d<q> create(Object obj, d<?> dVar) {
            return new b(this.f8708j, dVar);
        }

        public final Object invoke(l0 l0Var, d<? super q> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(q.f16189a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = s8.d.c()
                int r1 = r7.f8707i
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                o8.m.b(r8)
                r8 = r7
                goto L_0x006e
            L_0x0013:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001b:
                java.lang.Object r1 = r7.f8706h
                y8.p r1 = (y8.p) r1
                o8.m.b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L_0x0060
            L_0x0026:
                o8.m.b(r8)
                g0.k<T> r8 = r7.f8708j
                java.util.concurrent.atomic.AtomicInteger r8 = r8.f8702d
                int r8 = r8.get()
                if (r8 <= 0) goto L_0x0037
                r8 = 1
                goto L_0x0038
            L_0x0037:
                r8 = 0
            L_0x0038:
                if (r8 == 0) goto L_0x007d
                r8 = r7
            L_0x003b:
                g0.k<T> r1 = r8.f8708j
                i9.l0 r1 = r1.f8699a
                i9.m0.e(r1)
                g0.k<T> r1 = r8.f8708j
                y8.p r1 = r1.f8700b
                g0.k<T> r4 = r8.f8708j
                k9.d r4 = r4.f8701c
                r8.f8706h = r1
                r8.f8707i = r3
                java.lang.Object r4 = r4.e(r8)
                if (r4 != r0) goto L_0x005b
                return r0
            L_0x005b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L_0x0060:
                r5 = 0
                r0.f8706h = r5
                r0.f8707i = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L_0x006c
                return r1
            L_0x006c:
                r8 = r0
                r0 = r1
            L_0x006e:
                g0.k<T> r1 = r8.f8708j
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f8702d
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L_0x003b
                o8.q r8 = o8.q.f16189a
                return r8
            L_0x007d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k(l0 l0Var, l<? super Throwable, q> lVar, p<? super T, ? super Throwable, q> pVar, p<? super T, ? super d<? super q>, ? extends Object> pVar2) {
        m.f(l0Var, "scope");
        m.f(lVar, "onComplete");
        m.f(pVar, "onUndeliveredElement");
        m.f(pVar2, "consumeMessage");
        this.f8699a = l0Var;
        this.f8700b = pVar2;
        u1 u1Var = (u1) l0Var.i().h(u1.f14995d);
        if (u1Var != null) {
            u1Var.y0(new a(lVar, this, pVar));
        }
    }

    public final void e(T t10) {
        Object n10 = this.f8701c.n(t10);
        if (n10 instanceof h.a) {
            Throwable e10 = h.e(n10);
            if (e10 == null) {
                e10 = new ClosedSendChannelException("Channel was closed normally");
            }
            throw e10;
        } else if (!h.i(n10)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f8702d.getAndIncrement() == 0) {
            u1 unused = i.d(this.f8699a, (r8.g) null, (n0) null, new b(this, (d<? super b>) null), 3, (Object) null);
        }
    }
}
