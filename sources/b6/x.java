package b6;

import a6.m0;
import android.os.Handler;
import android.os.SystemClock;
import e4.j;
import h4.d;
import h4.e;

/* compiled from: VideoRendererEventListener */
public interface x {

    /* compiled from: VideoRendererEventListener */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f5132a;

        /* renamed from: b  reason: collision with root package name */
        private final x f5133b;

        public a(Handler handler, x xVar) {
            this.f5132a = xVar != null ? (Handler) a6.a.e(handler) : null;
            this.f5133b = xVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((x) m0.j(this.f5133b)).o(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((x) m0.j(this.f5133b)).j(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(d dVar) {
            dVar.c();
            ((x) m0.j(this.f5133b)).E(dVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((x) m0.j(this.f5133b)).K(i10, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void u(d dVar) {
            ((x) m0.j(this.f5133b)).k(dVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(j jVar, e eVar) {
            ((x) m0.j(this.f5133b)).C(jVar);
            ((x) m0.j(this.f5133b)).y(jVar, eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((x) m0.j(this.f5133b)).R(obj, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((x) m0.j(this.f5133b)).m0(j10, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((x) m0.j(this.f5133b)).b0(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(z zVar) {
            ((x) m0.j(this.f5133b)).e(zVar);
        }

        public void A(Object obj) {
            if (this.f5132a != null) {
                this.f5132a.post(new u(this, obj, SystemClock.elapsedRealtime()));
            }
        }

        public void B(long j10, int i10) {
            Handler handler = this.f5132a;
            if (handler != null) {
                handler.post(new o(this, j10, i10));
            }
        }

        public void C(Exception exc) {
            Handler handler = this.f5132a;
            if (handler != null) {
                handler.post(new t(this, exc));
            }
        }

        public void D(z zVar) {
            Handler handler = this.f5132a;
            if (handler != null) {
                handler.post(new p(this, zVar));
            }
        }

        public void k(String str, long j10, long j11) {
            Handler handler = this.f5132a;
            if (handler != null) {
                handler.post(new w(this, str, j10, j11));
            }
        }

        public void l(String str) {
            Handler handler = this.f5132a;
            if (handler != null) {
                handler.post(new v(this, str));
            }
        }

        public void m(d dVar) {
            dVar.c();
            Handler handler = this.f5132a;
            if (handler != null) {
                handler.post(new r(this, dVar));
            }
        }

        public void n(int i10, long j10) {
            Handler handler = this.f5132a;
            if (handler != null) {
                handler.post(new n(this, i10, j10));
            }
        }

        public void o(d dVar) {
            Handler handler = this.f5132a;
            if (handler != null) {
                handler.post(new s(this, dVar));
            }
        }

        public void p(j jVar, e eVar) {
            Handler handler = this.f5132a;
            if (handler != null) {
                handler.post(new q(this, jVar, eVar));
            }
        }
    }

    @Deprecated
    void C(j jVar);

    void E(d dVar);

    void K(int i10, long j10);

    void R(Object obj, long j10);

    void b0(Exception exc);

    void e(z zVar);

    void j(String str);

    void k(d dVar);

    void m0(long j10, int i10);

    void o(String str, long j10, long j11);

    void y(j jVar, e eVar);
}
