package com.google.android.exoplayer2;

import a6.e;
import a6.m0;
import a6.p;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b6.h;
import b6.l;
import b6.x;
import b6.z;
import c6.f;
import com.google.android.exoplayer2.b;
import com.google.android.exoplayer2.d;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.y0;
import e4.n;
import e4.u;
import e4.v;
import f4.i1;
import g4.f;
import g5.r;
import g5.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k4.g;
import o5.j;
import y5.o;
import z5.m;

/* compiled from: SimpleExoPlayer */
public class x0 extends e {
    /* access modifiers changed from: private */
    public boolean A;
    private TextureView B;
    private int C;
    private int D;
    private int E;
    /* access modifiers changed from: private */
    public h4.d F;
    /* access modifiers changed from: private */
    public h4.d G;
    private int H;
    private g4.d I;
    private float J;
    /* access modifiers changed from: private */
    public boolean K;
    /* access modifiers changed from: private */
    public List<o5.a> L;
    private boolean M;
    private boolean N;
    /* access modifiers changed from: private */
    public PriorityTaskManager O;
    /* access modifiers changed from: private */
    public boolean P;
    private boolean Q;
    /* access modifiers changed from: private */
    public i4.a R;
    /* access modifiers changed from: private */
    public z S;

    /* renamed from: b  reason: collision with root package name */
    protected final w0[] f7798b;

    /* renamed from: c  reason: collision with root package name */
    private final e f7799c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f7800d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final e0 f7801e;

    /* renamed from: f  reason: collision with root package name */
    private final c f7802f;

    /* renamed from: g  reason: collision with root package name */
    private final d f7803g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArraySet<l> f7804h;

    /* renamed from: i  reason: collision with root package name */
    private final CopyOnWriteArraySet<f> f7805i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArraySet<j> f7806j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final CopyOnWriteArraySet<x4.f> f7807k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArraySet<i4.b> f7808l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final i1 f7809m;

    /* renamed from: n  reason: collision with root package name */
    private final b f7810n;

    /* renamed from: o  reason: collision with root package name */
    private final d f7811o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final y0 f7812p;

    /* renamed from: q  reason: collision with root package name */
    private final b1 f7813q;

    /* renamed from: r  reason: collision with root package name */
    private final c1 f7814r;

    /* renamed from: s  reason: collision with root package name */
    private final long f7815s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public e4.j f7816t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public e4.j f7817u;

    /* renamed from: v  reason: collision with root package name */
    private AudioTrack f7818v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public Object f7819w;

    /* renamed from: x  reason: collision with root package name */
    private Surface f7820x;

    /* renamed from: y  reason: collision with root package name */
    private SurfaceHolder f7821y;

    /* renamed from: z  reason: collision with root package name */
    private c6.f f7822z;

    /* compiled from: SimpleExoPlayer */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Context f7823a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final u f7824b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public a6.b f7825c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public long f7826d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public o f7827e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public r f7828f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public e4.l f7829g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public z5.e f7830h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public i1 f7831i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public Looper f7832j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public PriorityTaskManager f7833k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public g4.d f7834l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public boolean f7835m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public int f7836n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public boolean f7837o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public boolean f7838p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public int f7839q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public boolean f7840r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public v f7841s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public long f7842t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public long f7843u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public i0 f7844v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public long f7845w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public long f7846x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public boolean f7847y;

        /* renamed from: z  reason: collision with root package name */
        private boolean f7848z;

        public b(Context context) {
            this(context, new e4.e(context), new g());
        }

        public b A(i0 i0Var) {
            a6.a.f(!this.f7848z);
            this.f7844v = i0Var;
            return this;
        }

        public b B(e4.l lVar) {
            a6.a.f(!this.f7848z);
            this.f7829g = lVar;
            return this;
        }

        public x0 z() {
            a6.a.f(!this.f7848z);
            this.f7848z = true;
            return new x0(this);
        }

        public b(Context context, u uVar, k4.o oVar) {
            this(context, uVar, new y5.f(context), new com.google.android.exoplayer2.source.e(context, oVar), new e4.d(), m.m(context), new i1(a6.b.f146a));
        }

        public b(Context context, u uVar, o oVar, r rVar, e4.l lVar, z5.e eVar, i1 i1Var) {
            this.f7823a = context;
            this.f7824b = uVar;
            this.f7827e = oVar;
            this.f7828f = rVar;
            this.f7829g = lVar;
            this.f7830h = eVar;
            this.f7831i = i1Var;
            this.f7832j = m0.N();
            this.f7834l = g4.d.f8846f;
            this.f7836n = 0;
            this.f7839q = 1;
            this.f7840r = true;
            this.f7841s = v.f8143g;
            this.f7842t = 5000;
            this.f7843u = 15000;
            this.f7844v = new f.b().a();
            this.f7825c = a6.b.f146a;
            this.f7845w = 500;
            this.f7846x = 2000;
        }
    }

    /* compiled from: SimpleExoPlayer */
    private final class c implements x, com.google.android.exoplayer2.audio.a, j, x4.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, f.a, d.b, b.C0110b, y0.b, t0.c, e4.g {
        private c() {
        }

        public void A(Surface surface) {
            x0.this.N0((Object) null);
        }

        public /* synthetic */ void B(w wVar, y5.l lVar) {
            n.s(this, wVar, lVar);
        }

        public /* synthetic */ void C(e4.j jVar) {
            b6.m.a(this, jVar);
        }

        public /* synthetic */ void D(k0 k0Var) {
            n.f(this, k0Var);
        }

        public void E(h4.d dVar) {
            x0.this.f7809m.E(dVar);
            e4.j unused = x0.this.f7816t = null;
            h4.d unused2 = x0.this.F = null;
        }

        public void F(String str) {
            x0.this.f7809m.F(str);
        }

        public void G(String str, long j10, long j11) {
            x0.this.f7809m.G(str, j10, j11);
        }

        public /* synthetic */ void H(boolean z10) {
            n.p(this, z10);
        }

        public void I(h4.d dVar) {
            x0.this.f7809m.I(dVar);
            e4.j unused = x0.this.f7817u = null;
            h4.d unused2 = x0.this.G = null;
        }

        public /* synthetic */ void J(t0 t0Var, t0.d dVar) {
            n.b(this, t0Var, dVar);
        }

        public void K(int i10, long j10) {
            x0.this.f7809m.K(i10, j10);
        }

        public void L(e4.j jVar, h4.e eVar) {
            e4.j unused = x0.this.f7817u = jVar;
            x0.this.f7809m.L(jVar, eVar);
        }

        public void M(int i10, boolean z10) {
            Iterator it = x0.this.f7808l.iterator();
            while (it.hasNext()) {
                ((i4.b) it.next()).M(i10, z10);
            }
        }

        public /* synthetic */ void N(e4.j jVar) {
            g4.g.a(this, jVar);
        }

        public /* synthetic */ void O(boolean z10, int i10) {
            n.k(this, z10, i10);
        }

        public /* synthetic */ void P(boolean z10) {
            e4.f.a(this, z10);
        }

        public void R(Object obj, long j10) {
            x0.this.f7809m.R(obj, j10);
            if (x0.this.f7819w == obj) {
                Iterator it = x0.this.f7804h.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).U();
                }
            }
        }

        public void S(h4.d dVar) {
            h4.d unused = x0.this.G = dVar;
            x0.this.f7809m.S(dVar);
        }

        public /* synthetic */ void V(j0 j0Var, int i10) {
            n.e(this, j0Var, i10);
        }

        public void X(List<o5.a> list) {
            List unused = x0.this.L = list;
            Iterator it = x0.this.f7806j.iterator();
            while (it.hasNext()) {
                ((j) it.next()).X(list);
            }
        }

        public void Y(long j10) {
            x0.this.f7809m.Y(j10);
        }

        public void a(boolean z10) {
            if (x0.this.K != z10) {
                boolean unused = x0.this.K = z10;
                x0.this.z0();
            }
        }

        public void a0(Exception exc) {
            x0.this.f7809m.a0(exc);
        }

        public /* synthetic */ void b(e4.m mVar) {
            n.g(this, mVar);
        }

        public void b0(Exception exc) {
            x0.this.f7809m.b0(exc);
        }

        public void c(Exception exc) {
            x0.this.f7809m.c(exc);
        }

        public void c0(boolean z10, int i10) {
            x0.this.Q0();
        }

        public /* synthetic */ void d(int i10) {
            n.n(this, i10);
        }

        public void e(z zVar) {
            z unused = x0.this.S = zVar;
            x0.this.f7809m.e(zVar);
            Iterator it = x0.this.f7804h.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                lVar.e(zVar);
                lVar.Q(zVar.f5137a, zVar.f5138b, zVar.f5139c, zVar.f5140d);
            }
        }

        public /* synthetic */ void f(t0.f fVar, t0.f fVar2, int i10) {
            n.m(this, fVar, fVar2, i10);
        }

        public /* synthetic */ void g(int i10) {
            n.h(this, i10);
        }

        public /* synthetic */ void h(boolean z10) {
            n.d(this, z10);
        }

        public /* synthetic */ void i(int i10) {
            n.l(this, i10);
        }

        public void i0(int i10, long j10, long j11) {
            x0.this.f7809m.i0(i10, j10, j11);
        }

        public void j(String str) {
            x0.this.f7809m.j(str);
        }

        public /* synthetic */ void j0(PlaybackException playbackException) {
            n.j(this, playbackException);
        }

        public void k(h4.d dVar) {
            h4.d unused = x0.this.F = dVar;
            x0.this.f7809m.k(dVar);
        }

        public void l(int i10) {
            i4.a Y = x0.n0(x0.this.f7812p);
            if (!Y.equals(x0.this.R)) {
                i4.a unused = x0.this.R = Y;
                Iterator it = x0.this.f7808l.iterator();
                while (it.hasNext()) {
                    ((i4.b) it.next()).e0(Y);
                }
            }
        }

        public /* synthetic */ void m(List list) {
            n.q(this, list);
        }

        public void m0(long j10, int i10) {
            x0.this.f7809m.m0(j10, i10);
        }

        public void n() {
            x0.this.P0(false, -1, 3);
        }

        public void o(String str, long j10, long j11) {
            x0.this.f7809m.o(str, j10, j11);
        }

        public /* synthetic */ void o0(boolean z10) {
            n.c(this, z10);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            x0.this.M0(surfaceTexture);
            x0.this.y0(i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            x0.this.N0((Object) null);
            x0.this.y0(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            x0.this.y0(i10, i11);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void p(x4.a aVar) {
            x0.this.f7809m.p(aVar);
            x0.this.f7801e.V0(aVar);
            Iterator it = x0.this.f7807k.iterator();
            while (it.hasNext()) {
                ((x4.f) it.next()).p(aVar);
            }
        }

        public void q(boolean z10) {
            if (x0.this.O == null) {
                return;
            }
            if (z10 && !x0.this.P) {
                x0.this.O.a(0);
                boolean unused = x0.this.P = true;
            } else if (!z10 && x0.this.P) {
                x0.this.O.b(0);
                boolean unused2 = x0.this.P = false;
            }
        }

        public /* synthetic */ void r() {
            n.o(this);
        }

        public /* synthetic */ void s(PlaybackException playbackException) {
            n.i(this, playbackException);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            x0.this.y0(i11, i12);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (x0.this.A) {
                x0.this.N0(surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (x0.this.A) {
                x0.this.N0((Object) null);
            }
            x0.this.y0(0, 0);
        }

        public /* synthetic */ void t(t0.b bVar) {
            n.a(this, bVar);
        }

        public void u(boolean z10) {
            x0.this.Q0();
        }

        public /* synthetic */ void v(a1 a1Var, int i10) {
            n.r(this, a1Var, i10);
        }

        public void w(float f10) {
            x0.this.E0();
        }

        public void x(int i10) {
            x0.this.Q0();
        }

        public void y(e4.j jVar, h4.e eVar) {
            e4.j unused = x0.this.f7816t = jVar;
            x0.this.f7809m.y(jVar, eVar);
        }

        public void z(int i10) {
            boolean t02 = x0.this.t0();
            x0.this.P0(t02, i10, x0.u0(t02, i10));
        }
    }

    /* compiled from: SimpleExoPlayer */
    private static final class d implements h, c6.a, u0.b {

        /* renamed from: h  reason: collision with root package name */
        private h f7850h;

        /* renamed from: i  reason: collision with root package name */
        private c6.a f7851i;

        /* renamed from: j  reason: collision with root package name */
        private h f7852j;

        /* renamed from: k  reason: collision with root package name */
        private c6.a f7853k;

        private d() {
        }

        public void a(long j10, float[] fArr) {
            c6.a aVar = this.f7853k;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            c6.a aVar2 = this.f7851i;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        public void g() {
            c6.a aVar = this.f7853k;
            if (aVar != null) {
                aVar.g();
            }
            c6.a aVar2 = this.f7851i;
            if (aVar2 != null) {
                aVar2.g();
            }
        }

        public void i(long j10, long j11, e4.j jVar, MediaFormat mediaFormat) {
            h hVar = this.f7852j;
            if (hVar != null) {
                hVar.i(j10, j11, jVar, mediaFormat);
            }
            h hVar2 = this.f7850h;
            if (hVar2 != null) {
                hVar2.i(j10, j11, jVar, mediaFormat);
            }
        }

        public void r(int i10, Object obj) {
            if (i10 == 6) {
                this.f7850h = (h) obj;
            } else if (i10 == 7) {
                this.f7851i = (c6.a) obj;
            } else if (i10 == 10000) {
                c6.f fVar = (c6.f) obj;
                if (fVar == null) {
                    this.f7852j = null;
                    this.f7853k = null;
                    return;
                }
                this.f7852j = fVar.getVideoFrameMetadataListener();
                this.f7853k = fVar.getCameraMotionListener();
            }
        }
    }

    protected x0(b bVar) {
        x0 x0Var;
        e eVar = new e();
        this.f7799c = eVar;
        try {
            Context applicationContext = bVar.f7823a.getApplicationContext();
            this.f7800d = applicationContext;
            i1 b10 = bVar.f7831i;
            this.f7809m = b10;
            this.O = bVar.f7833k;
            this.I = bVar.f7834l;
            this.C = bVar.f7839q;
            this.K = bVar.f7838p;
            this.f7815s = bVar.f7846x;
            c cVar = new c();
            this.f7802f = cVar;
            d dVar = new d();
            this.f7803g = dVar;
            this.f7804h = new CopyOnWriteArraySet<>();
            this.f7805i = new CopyOnWriteArraySet<>();
            this.f7806j = new CopyOnWriteArraySet<>();
            this.f7807k = new CopyOnWriteArraySet<>();
            this.f7808l = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(bVar.f7832j);
            w0[] a10 = bVar.f7824b.a(handler, cVar, cVar, cVar, cVar);
            this.f7798b = a10;
            this.J = 1.0f;
            if (m0.f205a < 21) {
                this.H = x0(0);
            } else {
                this.H = e4.c.a(applicationContext);
            }
            this.L = Collections.emptyList();
            this.M = true;
            e eVar2 = eVar;
            d dVar2 = dVar;
            Handler handler2 = handler;
            e0 e0Var = r1;
            c cVar2 = cVar;
            try {
                e0 e0Var2 = new e0(a10, bVar.f7827e, bVar.f7828f, bVar.f7829g, bVar.f7830h, b10, bVar.f7840r, bVar.f7841s, bVar.f7842t, bVar.f7843u, bVar.f7844v, bVar.f7845w, bVar.f7847y, bVar.f7825c, bVar.f7832j, this, new t0.b.a().c(20, 21, 22, 23, 24, 25, 26, 27).e());
                x0Var = this;
                try {
                    x0Var.f7801e = e0Var;
                    c cVar3 = cVar2;
                    e0Var.Z(cVar3);
                    e0Var.Y(cVar3);
                    if (bVar.f7826d > 0) {
                        e0Var.g0(bVar.f7826d);
                    }
                    Handler handler3 = handler2;
                    b bVar2 = new b(bVar.f7823a, handler3, cVar3);
                    x0Var.f7810n = bVar2;
                    bVar2.b(bVar.f7837o);
                    d dVar3 = new d(bVar.f7823a, handler3, cVar3);
                    x0Var.f7811o = dVar3;
                    dVar3.m(bVar.f7835m ? x0Var.I : null);
                    y0 y0Var = new y0(bVar.f7823a, handler3, cVar3);
                    x0Var.f7812p = y0Var;
                    y0Var.h(m0.a0(x0Var.I.f8850c));
                    b1 b1Var = new b1(bVar.f7823a);
                    x0Var.f7813q = b1Var;
                    b1Var.a(bVar.f7836n != 0);
                    c1 c1Var = new c1(bVar.f7823a);
                    x0Var.f7814r = c1Var;
                    c1Var.a(bVar.f7836n == 2);
                    x0Var.R = n0(y0Var);
                    x0Var.S = z.f5135e;
                    x0Var.D0(1, 102, Integer.valueOf(x0Var.H));
                    x0Var.D0(2, 102, Integer.valueOf(x0Var.H));
                    x0Var.D0(1, 3, x0Var.I);
                    x0Var.D0(2, 4, Integer.valueOf(x0Var.C));
                    x0Var.D0(1, 101, Boolean.valueOf(x0Var.K));
                    d dVar4 = dVar2;
                    x0Var.D0(2, 6, dVar4);
                    x0Var.D0(6, 7, dVar4);
                    eVar2.e();
                } catch (Throwable th) {
                    th = th;
                    x0Var.f7799c.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                x0Var = this;
                x0Var.f7799c.e();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            x0Var = this;
            x0Var.f7799c.e();
            throw th;
        }
    }

    private void C0() {
        if (this.f7822z != null) {
            this.f7801e.d0(this.f7803g).n(10000).m((Object) null).l();
            this.f7822z.d(this.f7802f);
            this.f7822z = null;
        }
        TextureView textureView = this.B;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f7802f) {
                p.h("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.B.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.B = null;
        }
        SurfaceHolder surfaceHolder = this.f7821y;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f7802f);
            this.f7821y = null;
        }
    }

    private void D0(int i10, int i11, Object obj) {
        for (w0 w0Var : this.f7798b) {
            if (w0Var.j() == i10) {
                this.f7801e.d0(w0Var).n(i11).m(obj).l();
            }
        }
    }

    /* access modifiers changed from: private */
    public void E0() {
        D0(1, 2, Float.valueOf(this.J * this.f7811o.g()));
    }

    /* access modifiers changed from: private */
    public void M0(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        N0(surface);
        this.f7820x = surface;
    }

    /* access modifiers changed from: private */
    public void N0(Object obj) {
        boolean z10;
        ArrayList<u0> arrayList = new ArrayList<>();
        w0[] w0VarArr = this.f7798b;
        int length = w0VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            w0 w0Var = w0VarArr[i10];
            if (w0Var.j() == 2) {
                arrayList.add(this.f7801e.d0(w0Var).n(1).m(obj).l());
            }
            i10++;
        }
        Object obj2 = this.f7819w;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (u0 a10 : arrayList) {
                    a10.a(this.f7815s);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f7819w;
            Surface surface = this.f7820x;
            if (obj3 == surface) {
                surface.release();
                this.f7820x = null;
            }
        }
        this.f7819w = obj;
        if (z10) {
            this.f7801e.j1(false, ExoPlaybackException.e(new ExoTimeoutException(3), 1003));
        }
    }

    /* access modifiers changed from: private */
    public void P0(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.f7801e.f1(z11, i12, i11);
    }

    /* access modifiers changed from: private */
    public void Q0() {
        int w02 = w0();
        boolean z10 = true;
        if (w02 != 1) {
            if (w02 == 2 || w02 == 3) {
                boolean o02 = o0();
                b1 b1Var = this.f7813q;
                if (!t0() || o02) {
                    z10 = false;
                }
                b1Var.b(z10);
                this.f7814r.b(t0());
                return;
            } else if (w02 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f7813q.b(false);
        this.f7814r.b(false);
    }

    private void R0() {
        this.f7799c.b();
        if (Thread.currentThread() != p0().getThread()) {
            String C2 = m0.C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), p0().getThread().getName());
            if (!this.M) {
                p.i("SimpleExoPlayer", C2, this.N ? null : new IllegalStateException());
                this.N = true;
                return;
            }
            throw new IllegalStateException(C2);
        }
    }

    /* access modifiers changed from: private */
    public static i4.a n0(y0 y0Var) {
        return new i4.a(0, y0Var.d(), y0Var.c());
    }

    /* access modifiers changed from: private */
    public static int u0(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private int x0(int i10) {
        AudioTrack audioTrack = this.f7818v;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i10)) {
            this.f7818v.release();
            this.f7818v = null;
        }
        if (this.f7818v == null) {
            this.f7818v = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f7818v.getAudioSessionId();
    }

    /* access modifiers changed from: private */
    public void y0(int i10, int i11) {
        if (i10 != this.D || i11 != this.E) {
            this.D = i10;
            this.E = i11;
            this.f7809m.f0(i10, i11);
            Iterator<l> it = this.f7804h.iterator();
            while (it.hasNext()) {
                it.next().f0(i10, i11);
            }
        }
    }

    /* access modifiers changed from: private */
    public void z0() {
        this.f7809m.a(this.K);
        Iterator<g4.f> it = this.f7805i.iterator();
        while (it.hasNext()) {
            it.next().a(this.K);
        }
    }

    public void A0() {
        R0();
        boolean t02 = t0();
        int p10 = this.f7811o.p(t02, 2);
        P0(t02, p10, u0(t02, p10));
        this.f7801e.X0();
    }

    public void B0() {
        AudioTrack audioTrack;
        R0();
        if (m0.f205a < 21 && (audioTrack = this.f7818v) != null) {
            audioTrack.release();
            this.f7818v = null;
        }
        this.f7810n.b(false);
        this.f7812p.g();
        this.f7813q.b(false);
        this.f7814r.b(false);
        this.f7811o.i();
        this.f7801e.Y0();
        this.f7809m.N2();
        C0();
        Surface surface = this.f7820x;
        if (surface != null) {
            surface.release();
            this.f7820x = null;
        }
        if (this.P) {
            ((PriorityTaskManager) a6.a.e(this.O)).b(0);
            this.P = false;
        }
        this.L = Collections.emptyList();
        this.Q = true;
    }

    public void F0(g4.d dVar, boolean z10) {
        R0();
        if (!this.Q) {
            if (!m0.c(this.I, dVar)) {
                this.I = dVar;
                D0(1, 3, dVar);
                this.f7812p.h(m0.a0(dVar.f8850c));
                this.f7809m.T(dVar);
                Iterator<g4.f> it = this.f7805i.iterator();
                while (it.hasNext()) {
                    it.next().T(dVar);
                }
            }
            d dVar2 = this.f7811o;
            if (!z10) {
                dVar = null;
            }
            dVar2.m(dVar);
            boolean t02 = t0();
            int p10 = this.f7811o.p(t02, w0());
            P0(t02, p10, u0(t02, p10));
        }
    }

    public void G0(k kVar) {
        R0();
        this.f7801e.b1(kVar);
    }

    public void H0(boolean z10) {
        R0();
        int p10 = this.f7811o.p(z10, w0());
        P0(z10, p10, u0(z10, p10));
    }

    public void I0(e4.m mVar) {
        R0();
        this.f7801e.g1(mVar);
    }

    public void J0(int i10) {
        R0();
        this.f7801e.h1(i10);
    }

    public void K0(boolean z10) {
        R0();
        this.f7801e.i1(z10);
    }

    public void L0(boolean z10) {
        R0();
        if (this.K != z10) {
            this.K = z10;
            D0(1, 101, Boolean.valueOf(z10));
            z0();
        }
    }

    public void O0(float f10) {
        R0();
        float q10 = m0.q(f10, 0.0f, 1.0f);
        if (this.J != q10) {
            this.J = q10;
            E0();
            this.f7809m.w(q10);
            Iterator<g4.f> it = this.f7805i.iterator();
            while (it.hasNext()) {
                it.next().w(q10);
            }
        }
    }

    public boolean a() {
        R0();
        return this.f7801e.a();
    }

    public long b() {
        R0();
        return this.f7801e.b();
    }

    public void c(int i10, long j10) {
        R0();
        this.f7809m.M2();
        this.f7801e.c(i10, j10);
    }

    @Deprecated
    public void d(boolean z10) {
        R0();
        this.f7811o.p(t0(), 1);
        this.f7801e.d(z10);
        this.L = Collections.emptyList();
    }

    public int e() {
        R0();
        return this.f7801e.e();
    }

    public int f() {
        R0();
        return this.f7801e.f();
    }

    public int g() {
        R0();
        return this.f7801e.g();
    }

    @Deprecated
    public void g0(g4.f fVar) {
        a6.a.e(fVar);
        this.f7805i.add(fVar);
    }

    public int h() {
        R0();
        return this.f7801e.h();
    }

    @Deprecated
    public void h0(i4.b bVar) {
        a6.a.e(bVar);
        this.f7808l.add(bVar);
    }

    public long i() {
        R0();
        return this.f7801e.i();
    }

    @Deprecated
    public void i0(t0.c cVar) {
        a6.a.e(cVar);
        this.f7801e.Z(cVar);
    }

    public int j() {
        R0();
        return this.f7801e.j();
    }

    public void j0(t0.e eVar) {
        a6.a.e(eVar);
        g0(eVar);
        m0(eVar);
        l0(eVar);
        k0(eVar);
        h0(eVar);
        i0(eVar);
    }

    public a1 k() {
        R0();
        return this.f7801e.k();
    }

    @Deprecated
    public void k0(x4.f fVar) {
        a6.a.e(fVar);
        this.f7807k.add(fVar);
    }

    public boolean l() {
        R0();
        return this.f7801e.l();
    }

    @Deprecated
    public void l0(j jVar) {
        a6.a.e(jVar);
        this.f7806j.add(jVar);
    }

    public long m() {
        R0();
        return this.f7801e.m();
    }

    @Deprecated
    public void m0(l lVar) {
        a6.a.e(lVar);
        this.f7804h.add(lVar);
    }

    public boolean o0() {
        R0();
        return this.f7801e.f0();
    }

    public Looper p0() {
        return this.f7801e.h0();
    }

    public int q0() {
        return this.H;
    }

    public long r0() {
        R0();
        return this.f7801e.i0();
    }

    public long s0() {
        R0();
        return this.f7801e.m0();
    }

    public boolean t0() {
        R0();
        return this.f7801e.p0();
    }

    public e4.m v0() {
        R0();
        return this.f7801e.q0();
    }

    public int w0() {
        R0();
        return this.f7801e.r0();
    }
}
