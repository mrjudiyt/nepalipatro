package e4;

import a6.r;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.w0;
import g5.t;

/* compiled from: BaseRenderer */
public abstract class a implements w0, s {

    /* renamed from: h  reason: collision with root package name */
    private final int f8033h;

    /* renamed from: i  reason: collision with root package name */
    private final k f8034i = new k();

    /* renamed from: j  reason: collision with root package name */
    private t f8035j;

    /* renamed from: k  reason: collision with root package name */
    private int f8036k;

    /* renamed from: l  reason: collision with root package name */
    private int f8037l;

    /* renamed from: m  reason: collision with root package name */
    private t f8038m;

    /* renamed from: n  reason: collision with root package name */
    private j[] f8039n;

    /* renamed from: o  reason: collision with root package name */
    private long f8040o;

    /* renamed from: p  reason: collision with root package name */
    private long f8041p;

    /* renamed from: q  reason: collision with root package name */
    private long f8042q = Long.MIN_VALUE;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8043r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f8044s;

    public a(int i10) {
        this.f8033h = i10;
    }

    /* access modifiers changed from: protected */
    public final ExoPlaybackException A(Throwable th, j jVar, boolean z10, int i10) {
        int i11;
        if (jVar != null && !this.f8044s) {
            this.f8044s = true;
            try {
                int c10 = r.c(a(jVar));
                this.f8044s = false;
                i11 = c10;
            } catch (ExoPlaybackException unused) {
                this.f8044s = false;
            } catch (Throwable th2) {
                this.f8044s = false;
                throw th2;
            }
            return ExoPlaybackException.b(th, b(), D(), jVar, i11, z10, i10);
        }
        i11 = 4;
        return ExoPlaybackException.b(th, b(), D(), jVar, i11, z10, i10);
    }

    /* access modifiers changed from: protected */
    public final t B() {
        return (t) a6.a.e(this.f8035j);
    }

    /* access modifiers changed from: protected */
    public final k C() {
        this.f8034i.a();
        return this.f8034i;
    }

    /* access modifiers changed from: protected */
    public final int D() {
        return this.f8036k;
    }

    /* access modifiers changed from: protected */
    public final j[] E() {
        return (j[]) a6.a.e(this.f8039n);
    }

    /* access modifiers changed from: protected */
    public final boolean F() {
        return k() ? this.f8043r : ((t) a6.a.e(this.f8038m)).e();
    }

    /* access modifiers changed from: protected */
    public abstract void G();

    /* access modifiers changed from: protected */
    public void H(boolean z10, boolean z11) {
    }

    /* access modifiers changed from: protected */
    public abstract void I(long j10, boolean z10);

    /* access modifiers changed from: protected */
    public void J() {
    }

    /* access modifiers changed from: protected */
    public void K() {
    }

    /* access modifiers changed from: protected */
    public void L() {
    }

    /* access modifiers changed from: protected */
    public abstract void M(j[] jVarArr, long j10, long j11);

    /* access modifiers changed from: protected */
    public final int N(k kVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        int i11 = ((t) a6.a.e(this.f8038m)).i(kVar, decoderInputBuffer, i10);
        if (i11 == -4) {
            if (decoderInputBuffer.p()) {
                this.f8042q = Long.MIN_VALUE;
                if (this.f8043r) {
                    return -4;
                }
                return -3;
            }
            long j10 = decoderInputBuffer.f6471l + this.f8040o;
            decoderInputBuffer.f6471l = j10;
            this.f8042q = Math.max(this.f8042q, j10);
        } else if (i11 == -5) {
            j jVar = (j) a6.a.e(kVar.f8131b);
            if (jVar.f8100w != Long.MAX_VALUE) {
                kVar.f8131b = jVar.b().i0(jVar.f8100w + this.f8040o).E();
            }
        }
        return i11;
    }

    /* access modifiers changed from: protected */
    public int O(long j10) {
        return ((t) a6.a.e(this.f8038m)).o(j10 - this.f8040o);
    }

    public final int d() {
        return this.f8037l;
    }

    public final void f(int i10) {
        this.f8036k = i10;
    }

    public final t getStream() {
        return this.f8038m;
    }

    public final void h() {
        boolean z10 = true;
        if (this.f8037l != 1) {
            z10 = false;
        }
        a6.a.f(z10);
        this.f8034i.a();
        this.f8037l = 0;
        this.f8038m = null;
        this.f8039n = null;
        this.f8043r = false;
        G();
    }

    public final int j() {
        return this.f8033h;
    }

    public final boolean k() {
        return this.f8042q == Long.MIN_VALUE;
    }

    public final void l() {
        this.f8043r = true;
    }

    public final s m() {
        return this;
    }

    public /* synthetic */ void o(float f10, float f11) {
        q.a(this, f10, f11);
    }

    public int p() {
        return 0;
    }

    public void r(int i10, Object obj) {
    }

    public final void reset() {
        a6.a.f(this.f8037l == 0);
        this.f8034i.a();
        J();
    }

    public final void s() {
        ((t) a6.a.e(this.f8038m)).a();
    }

    public final void start() {
        boolean z10 = true;
        if (this.f8037l != 1) {
            z10 = false;
        }
        a6.a.f(z10);
        this.f8037l = 2;
        K();
    }

    public final void stop() {
        a6.a.f(this.f8037l == 2);
        this.f8037l = 1;
        L();
    }

    public final long t() {
        return this.f8042q;
    }

    public final void u(j[] jVarArr, t tVar, long j10, long j11) {
        a6.a.f(!this.f8043r);
        this.f8038m = tVar;
        if (this.f8042q == Long.MIN_VALUE) {
            this.f8042q = j10;
        }
        this.f8039n = jVarArr;
        this.f8040o = j11;
        M(jVarArr, j10, j11);
    }

    public final void v(long j10) {
        this.f8043r = false;
        this.f8041p = j10;
        this.f8042q = j10;
        I(j10, false);
    }

    public final boolean w() {
        return this.f8043r;
    }

    public final void x(t tVar, j[] jVarArr, t tVar2, long j10, boolean z10, boolean z11, long j11, long j12) {
        long j13 = j10;
        boolean z12 = z10;
        a6.a.f(this.f8037l == 0);
        this.f8035j = tVar;
        this.f8037l = 1;
        this.f8041p = j13;
        H(z12, z11);
        u(jVarArr, tVar2, j11, j12);
        I(j13, z12);
    }

    public r y() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final ExoPlaybackException z(Throwable th, j jVar, int i10) {
        return A(th, jVar, false, i10);
    }
}
