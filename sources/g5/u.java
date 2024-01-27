package g5;

import a6.a;
import android.net.Uri;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.j0;

/* compiled from: SinglePeriodTimeline */
public final class u extends a1 {

    /* renamed from: p  reason: collision with root package name */
    private static final Object f8905p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private static final j0 f8906q = new j0.c().d("SinglePeriodTimeline").h(Uri.EMPTY).a();

    /* renamed from: c  reason: collision with root package name */
    private final long f8907c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8908d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8909e;

    /* renamed from: f  reason: collision with root package name */
    private final long f8910f;

    /* renamed from: g  reason: collision with root package name */
    private final long f8911g;

    /* renamed from: h  reason: collision with root package name */
    private final long f8912h;

    /* renamed from: i  reason: collision with root package name */
    private final long f8913i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f8914j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f8915k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f8916l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f8917m;

    /* renamed from: n  reason: collision with root package name */
    private final j0 f8918n;

    /* renamed from: o  reason: collision with root package name */
    private final j0.f f8919o;

    public u(long j10, boolean z10, boolean z11, boolean z12, Object obj, j0 j0Var) {
        this(j10, j10, 0, 0, z10, z11, z12, obj, j0Var);
    }

    public int b(Object obj) {
        return f8905p.equals(obj) ? 0 : -1;
    }

    public a1.b g(int i10, a1.b bVar, boolean z10) {
        a.c(i10, 0, 1);
        return bVar.n((Object) null, z10 ? f8905p : null, 0, this.f8910f, -this.f8912h);
    }

    public int i() {
        return 1;
    }

    public Object m(int i10) {
        a.c(i10, 0, 1);
        return f8905p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r1 > r5) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.a1.c o(int r25, com.google.android.exoplayer2.a1.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            a6.a.c(r3, r1, r2)
            long r1 = r0.f8913i
            boolean r14 = r0.f8915k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x002e
            boolean r5 = r0.f8916l
            if (r5 != 0) goto L_0x002e
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x002e
            long r5 = r0.f8911g
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0027
        L_0x0024:
            r16 = r3
            goto L_0x0030
        L_0x0027:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x002e
            goto L_0x0024
        L_0x002e:
            r16 = r1
        L_0x0030:
            java.lang.Object r4 = com.google.android.exoplayer2.a1.c.f6241r
            com.google.android.exoplayer2.j0 r5 = r0.f8918n
            java.lang.Object r6 = r0.f8917m
            long r7 = r0.f8907c
            long r9 = r0.f8908d
            long r11 = r0.f8909e
            boolean r13 = r0.f8914j
            com.google.android.exoplayer2.j0$f r15 = r0.f8919o
            long r1 = r0.f8911g
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f8912h
            r22 = r1
            r3 = r26
            com.google.android.exoplayer2.a1$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.u.o(int, com.google.android.exoplayer2.a1$c, long):com.google.android.exoplayer2.a1$c");
    }

    public int p() {
        return 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, j0 j0Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, j0Var, z12 ? j0Var.f6745c : null);
    }

    public u(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, j0 j0Var, j0.f fVar) {
        this.f8907c = j10;
        this.f8908d = j11;
        this.f8909e = j12;
        this.f8910f = j13;
        this.f8911g = j14;
        this.f8912h = j15;
        this.f8913i = j16;
        this.f8914j = z10;
        this.f8915k = z11;
        this.f8916l = z12;
        this.f8917m = obj;
        this.f8918n = (j0) a.e(j0Var);
        this.f8919o = fVar;
    }
}
