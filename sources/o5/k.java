package o5;

import a6.m0;
import a6.p;
import a6.t;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import e4.a;
import e4.j;
import e4.r;
import java.util.Collections;
import java.util.List;

/* compiled from: TextRenderer */
public final class k extends a implements Handler.Callback {
    private int A;
    private j B;
    private f C;
    private h D;
    private i E;
    private i F;
    private int G;
    private long H;

    /* renamed from: t  reason: collision with root package name */
    private final Handler f10436t;

    /* renamed from: u  reason: collision with root package name */
    private final j f10437u;

    /* renamed from: v  reason: collision with root package name */
    private final g f10438v;

    /* renamed from: w  reason: collision with root package name */
    private final e4.k f10439w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f10440x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10441y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f10442z;

    public k(j jVar, Looper looper) {
        this(jVar, looper, g.f10432a);
    }

    private void P() {
        Y(Collections.emptyList());
    }

    private long Q() {
        if (this.G == -1) {
            return Long.MAX_VALUE;
        }
        a6.a.e(this.E);
        if (this.G >= this.E.f()) {
            return Long.MAX_VALUE;
        }
        return this.E.d(this.G);
    }

    private void R(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.B);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        p.d("TextRenderer", sb.toString(), subtitleDecoderException);
        P();
        W();
    }

    private void S() {
        this.f10442z = true;
        this.C = this.f10438v.b((j) a6.a.e(this.B));
    }

    private void T(List<a> list) {
        this.f10437u.X(list);
    }

    private void U() {
        this.D = null;
        this.G = -1;
        i iVar = this.E;
        if (iVar != null) {
            iVar.s();
            this.E = null;
        }
        i iVar2 = this.F;
        if (iVar2 != null) {
            iVar2.s();
            this.F = null;
        }
    }

    private void V() {
        U();
        ((f) a6.a.e(this.C)).release();
        this.C = null;
        this.A = 0;
    }

    private void W() {
        V();
        S();
    }

    private void Y(List<a> list) {
        Handler handler = this.f10436t;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            T(list);
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
        this.B = null;
        this.H = -9223372036854775807L;
        P();
        V();
    }

    /* access modifiers changed from: protected */
    public void I(long j10, boolean z10) {
        P();
        this.f10440x = false;
        this.f10441y = false;
        this.H = -9223372036854775807L;
        if (this.A != 0) {
            W();
            return;
        }
        U();
        ((f) a6.a.e(this.C)).flush();
    }

    /* access modifiers changed from: protected */
    public void M(j[] jVarArr, long j10, long j11) {
        this.B = jVarArr[0];
        if (this.C != null) {
            this.A = 1;
        } else {
            S();
        }
    }

    public void X(long j10) {
        a6.a.f(w());
        this.H = j10;
    }

    public int a(j jVar) {
        if (this.f10438v.a(jVar)) {
            return r.a(jVar.L == null ? 4 : 2);
        } else if (t.r(jVar.f8096s)) {
            return r.a(1);
        } else {
            return r.a(0);
        }
    }

    public String b() {
        return "TextRenderer";
    }

    public boolean c() {
        return this.f10441y;
    }

    public boolean e() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            T((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public void q(long j10, long j11) {
        boolean z10;
        if (w()) {
            long j12 = this.H;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                U();
                this.f10441y = true;
            }
        }
        if (!this.f10441y) {
            if (this.F == null) {
                ((f) a6.a.e(this.C)).a(j10);
                try {
                    this.F = (i) ((f) a6.a.e(this.C)).b();
                } catch (SubtitleDecoderException e10) {
                    R(e10);
                    return;
                }
            }
            if (d() == 2) {
                if (this.E != null) {
                    long Q = Q();
                    z10 = false;
                    while (Q <= j10) {
                        this.G++;
                        Q = Q();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                i iVar = this.F;
                if (iVar != null) {
                    if (iVar.p()) {
                        if (!z10 && Q() == Long.MAX_VALUE) {
                            if (this.A == 2) {
                                W();
                            } else {
                                U();
                                this.f10441y = true;
                            }
                        }
                    } else if (iVar.f8970i <= j10) {
                        i iVar2 = this.E;
                        if (iVar2 != null) {
                            iVar2.s();
                        }
                        this.G = iVar.a(j10);
                        this.E = iVar;
                        this.F = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    a6.a.e(this.E);
                    Y(this.E.e(j10));
                }
                if (this.A != 2) {
                    while (!this.f10440x) {
                        try {
                            h hVar = this.D;
                            if (hVar == null) {
                                hVar = (h) ((f) a6.a.e(this.C)).c();
                                if (hVar != null) {
                                    this.D = hVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.A == 1) {
                                hVar.r(4);
                                ((f) a6.a.e(this.C)).d(hVar);
                                this.D = null;
                                this.A = 2;
                                return;
                            }
                            int N = N(this.f10439w, hVar, 0);
                            if (N == -4) {
                                if (hVar.p()) {
                                    this.f10440x = true;
                                    this.f10442z = false;
                                } else {
                                    j jVar = this.f10439w.f8131b;
                                    if (jVar != null) {
                                        hVar.f10433p = jVar.f8100w;
                                        hVar.u();
                                        this.f10442z &= !hVar.q();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f10442z) {
                                    ((f) a6.a.e(this.C)).d(hVar);
                                    this.D = null;
                                }
                            } else if (N == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e11) {
                            R(e11);
                            return;
                        }
                    }
                }
            }
        }
    }

    public k(j jVar, Looper looper, g gVar) {
        super(3);
        Handler handler;
        this.f10437u = (j) a6.a.e(jVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = m0.w(looper, this);
        }
        this.f10436t = handler;
        this.f10438v = gVar;
        this.f10439w = new e4.k();
        this.H = -9223372036854775807L;
    }
}
