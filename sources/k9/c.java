package k9;

import e9.e;
import i9.l;
import kotlin.jvm.internal.j;
import n9.j0;
import o8.q;
import y8.p;

/* compiled from: BufferedChannel.kt */
public final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final i<Object> f15504a = new i(-1, (i) null, (b) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f15505b = m0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f15506c = m0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final j0 f15507d = new j0("BUFFERED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final j0 f15508e = new j0("SHOULD_BUFFER");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final j0 f15509f = new j0("S_RESUMING_BY_RCV");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final j0 f15510g = new j0("RESUMING_BY_EB");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final j0 f15511h = new j0("POISONED");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final j0 f15512i = new j0("DONE_RCV");
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final j0 f15513j = new j0("INTERRUPTED_SEND");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final j0 f15514k = new j0("INTERRUPTED_RCV");

    /* renamed from: l  reason: collision with root package name */
    private static final j0 f15515l = new j0("CHANNEL_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final j0 f15516m = new j0("SUSPEND");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final j0 f15517n = new j0("SUSPEND_NO_WAITER");
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final j0 f15518o = new j0("FAILED");
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final j0 f15519p = new j0("NO_RECEIVE_RESULT");
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final j0 f15520q = new j0("CLOSE_HANDLER_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final j0 f15521r = new j0("CLOSE_HANDLER_INVOKED");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final j0 f15522s = new j0("NO_CLOSE_CAUSE");

    /* compiled from: BufferedChannel.kt */
    /* synthetic */ class a extends j implements p<Long, i<E>, i<E>> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f15523h = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final i<E> c(long j10, i<E> iVar) {
            return c.x(j10, iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Number) obj).longValue(), (i) obj2);
        }
    }

    /* access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 != Integer.MAX_VALUE) {
            return (long) i10;
        }
        return Long.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    public static final <T> boolean B(l<? super T> lVar, T t10, y8.l<? super Throwable, q> lVar2) {
        Object m10 = lVar.m(t10, (Object) null, lVar2);
        if (m10 == null) {
            return false;
        }
        lVar.p(m10);
        return true;
    }

    static /* synthetic */ boolean C(l lVar, Object obj, y8.l lVar2, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar2 = null;
        }
        return B(lVar, obj, lVar2);
    }

    /* access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0) + j10;
    }

    /* access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* access modifiers changed from: private */
    public static final <E> i<E> x(long j10, i<E> iVar) {
        return new i(j10, iVar, iVar.u(), 0);
    }

    public static final <E> e<i<E>> y() {
        return a.f15523h;
    }

    public static final j0 z() {
        return f15515l;
    }
}
