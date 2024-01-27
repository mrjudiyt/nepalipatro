package androidx.window.layout;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import l9.e;
import o8.q;
import r8.d;
import y8.p;

/* compiled from: WindowInfoTrackerImpl.kt */
public final class s implements q {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4658d = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final x f4659b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final p f4660c;

    /* compiled from: WindowInfoTrackerImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
    /* compiled from: WindowInfoTrackerImpl.kt */
    static final class b extends k implements p<e<? super u>, d<? super q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        Object f4661h;

        /* renamed from: i  reason: collision with root package name */
        Object f4662i;

        /* renamed from: j  reason: collision with root package name */
        int f4663j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f4664k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ s f4665l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Activity f4666m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(s sVar, Activity activity, d<? super b> dVar) {
            super(2, dVar);
            this.f4665l = sVar;
            this.f4666m = activity;
        }

        /* access modifiers changed from: private */
        public static final void f(k9.d dVar, u uVar) {
            m.e(uVar, "info");
            dVar.n(uVar);
        }

        /* renamed from: c */
        public final Object invoke(e<? super u> eVar, d<? super q> dVar) {
            return ((b) create(eVar, dVar)).invokeSuspend(q.f16189a);
        }

        public final d<q> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f4665l, this.f4666m, dVar);
            bVar.f4664k = obj;
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0070 A[Catch:{ all -> 0x009e }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[Catch:{ all -> 0x009e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = s8.d.c()
                int r1 = r9.f4663j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0039
                if (r1 == r3) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                java.lang.Object r1 = r9.f4662i
                k9.f r1 = (k9.f) r1
                java.lang.Object r4 = r9.f4661h
                androidx.core.util.a r4 = (androidx.core.util.a) r4
                java.lang.Object r5 = r9.f4664k
                l9.e r5 = (l9.e) r5
                o8.m.b(r10)     // Catch:{ all -> 0x00a0 }
                r10 = r5
                goto L_0x0060
            L_0x001f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0027:
                java.lang.Object r1 = r9.f4662i
                k9.f r1 = (k9.f) r1
                java.lang.Object r4 = r9.f4661h
                androidx.core.util.a r4 = (androidx.core.util.a) r4
                java.lang.Object r5 = r9.f4664k
                l9.e r5 = (l9.e) r5
                o8.m.b(r10)     // Catch:{ all -> 0x00a0 }
                r6 = r5
                r5 = r9
                goto L_0x0073
            L_0x0039:
                o8.m.b(r10)
                java.lang.Object r10 = r9.f4664k
                l9.e r10 = (l9.e) r10
                r1 = 10
                k9.a r4 = k9.a.DROP_OLDEST
                r5 = 4
                r6 = 0
                k9.d r1 = k9.g.b(r1, r4, r6, r5, r6)
                androidx.window.layout.t r4 = new androidx.window.layout.t
                r4.<init>(r1)
                androidx.window.layout.s r5 = r9.f4665l
                androidx.window.layout.p r5 = r5.f4660c
                android.app.Activity r6 = r9.f4666m
                androidx.privacysandbox.ads.adservices.topics.i r7 = androidx.privacysandbox.ads.adservices.topics.i.f3908h
                r5.b(r6, r7, r4)
                k9.f r1 = r1.iterator()     // Catch:{ all -> 0x00a0 }
            L_0x0060:
                r5 = r9
            L_0x0061:
                r5.f4664k = r10     // Catch:{ all -> 0x009e }
                r5.f4661h = r4     // Catch:{ all -> 0x009e }
                r5.f4662i = r1     // Catch:{ all -> 0x009e }
                r5.f4663j = r3     // Catch:{ all -> 0x009e }
                java.lang.Object r6 = r1.b(r5)     // Catch:{ all -> 0x009e }
                if (r6 != r0) goto L_0x0070
                return r0
            L_0x0070:
                r8 = r6
                r6 = r10
                r10 = r8
            L_0x0073:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x009e }
                boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x009e }
                if (r10 == 0) goto L_0x0092
                java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x009e }
                androidx.window.layout.u r10 = (androidx.window.layout.u) r10     // Catch:{ all -> 0x009e }
                r5.f4664k = r6     // Catch:{ all -> 0x009e }
                r5.f4661h = r4     // Catch:{ all -> 0x009e }
                r5.f4662i = r1     // Catch:{ all -> 0x009e }
                r5.f4663j = r2     // Catch:{ all -> 0x009e }
                java.lang.Object r10 = r6.emit(r10, r5)     // Catch:{ all -> 0x009e }
                if (r10 != r0) goto L_0x0090
                return r0
            L_0x0090:
                r10 = r6
                goto L_0x0061
            L_0x0092:
                androidx.window.layout.s r10 = r5.f4665l
                androidx.window.layout.p r10 = r10.f4660c
                r10.a(r4)
                o8.q r10 = o8.q.f16189a
                return r10
            L_0x009e:
                r10 = move-exception
                goto L_0x00a2
            L_0x00a0:
                r10 = move-exception
                r5 = r9
            L_0x00a2:
                androidx.window.layout.s r0 = r5.f4665l
                androidx.window.layout.p r0 = r0.f4660c
                r0.a(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.s.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public s(x xVar, p pVar) {
        m.f(xVar, "windowMetricsCalculator");
        m.f(pVar, "windowBackend");
        this.f4659b = xVar;
        this.f4660c = pVar;
    }

    public l9.d<u> a(Activity activity) {
        m.f(activity, "activity");
        return l9.f.i(new b(this, activity, (d<? super b>) null));
    }
}
