package com.google.android.exoplayer2.audio;

import a6.m0;
import android.os.Handler;
import e4.j;
import g4.h;
import g4.i;
import g4.k;
import g4.l;
import g4.m;
import g4.n;
import g4.o;
import g4.p;
import g4.q;
import h4.d;
import h4.e;

/* compiled from: AudioRendererEventListener */
public interface a {

    /* renamed from: com.google.android.exoplayer2.audio.a$a  reason: collision with other inner class name */
    /* compiled from: AudioRendererEventListener */
    public static final class C0109a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f6331a;

        /* renamed from: b  reason: collision with root package name */
        private final a f6332b;

        public C0109a(Handler handler, a aVar) {
            this.f6331a = aVar != null ? (Handler) a6.a.e(handler) : null;
            this.f6332b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((a) m0.j(this.f6332b)).i0(i10, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((a) m0.j(this.f6332b)).a0(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((a) m0.j(this.f6332b)).c(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j10, long j11) {
            ((a) m0.j(this.f6332b)).G(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((a) m0.j(this.f6332b)).F(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(d dVar) {
            dVar.c();
            ((a) m0.j(this.f6332b)).I(dVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(d dVar) {
            ((a) m0.j(this.f6332b)).S(dVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(j jVar, e eVar) {
            ((a) m0.j(this.f6332b)).N(jVar);
            ((a) m0.j(this.f6332b)).L(jVar, eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(long j10) {
            ((a) m0.j(this.f6332b)).Y(j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(boolean z10) {
            ((a) m0.j(this.f6332b)).a(z10);
        }

        public void B(long j10) {
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new i(this, j10));
            }
        }

        public void C(boolean z10) {
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new q(this, z10));
            }
        }

        public void D(int i10, long j10, long j11) {
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new h(this, i10, j10, j11));
            }
        }

        public void k(Exception exc) {
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new m(this, exc));
            }
        }

        public void l(Exception exc) {
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new n(this, exc));
            }
        }

        public void m(String str, long j10, long j11) {
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new p(this, str, j10, j11));
            }
        }

        public void n(String str) {
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new o(this, str));
            }
        }

        public void o(d dVar) {
            dVar.c();
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new k(this, dVar));
            }
        }

        public void p(d dVar) {
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new l(this, dVar));
            }
        }

        public void q(j jVar, e eVar) {
            Handler handler = this.f6331a;
            if (handler != null) {
                handler.post(new g4.j(this, jVar, eVar));
            }
        }
    }

    void F(String str);

    void G(String str, long j10, long j11);

    void I(d dVar);

    void L(j jVar, e eVar);

    @Deprecated
    void N(j jVar);

    void S(d dVar);

    void Y(long j10);

    void a(boolean z10);

    void a0(Exception exc);

    void c(Exception exc);

    void i0(int i10, long j10, long j11);
}
