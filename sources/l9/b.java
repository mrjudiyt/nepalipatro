package l9;

import kotlin.coroutines.jvm.internal.f;
import o8.q;
import r8.d;
import r8.g;
import r8.h;
import y8.p;

/* compiled from: Builders.kt */
final class b<T> extends c<T> {

    /* renamed from: l  reason: collision with root package name */
    private final p<k9.p<? super T>, d<? super q>, Object> f15650l;

    @f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {334}, m = "collectTo")
    /* compiled from: Builders.kt */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f15651h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f15652i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b<T> f15653j;

        /* renamed from: k  reason: collision with root package name */
        int f15654k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, d<? super a> dVar) {
            super(dVar);
            this.f15653j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f15652i = obj;
            this.f15654k |= Integer.MIN_VALUE;
            return this.f15653j.c((k9.p) null, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(p pVar, g gVar, int i10, k9.a aVar, int i11, kotlin.jvm.internal.g gVar2) {
        this(pVar, (i11 & 2) != 0 ? h.f16410h : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? k9.a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(k9.p<? super T> r5, r8.d<? super o8.q> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof l9.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            l9.b$a r0 = (l9.b.a) r0
            int r1 = r0.f15654k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15654k = r1
            goto L_0x0018
        L_0x0013:
            l9.b$a r0 = new l9.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f15652i
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f15654k
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f15651h
            k9.p r5 = (k9.p) r5
            o8.m.b(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            o8.m.b(r6)
            r0.f15651h = r5
            r0.f15654k = r3
            java.lang.Object r6 = super.c(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r5 = r5.o()
            if (r5 == 0) goto L_0x004c
            o8.q r5 = o8.q.f16189a
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.b.c(k9.p, r8.d):java.lang.Object");
    }

    public b(p<? super k9.p<? super T>, ? super d<? super q>, ? extends Object> pVar, g gVar, int i10, k9.a aVar) {
        super(pVar, gVar, i10, aVar);
        this.f15650l = pVar;
    }
}
