package y7;

import com.squareup.okhttp.internal.http.RouteException;
import ea.a0;
import ea.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import v7.a;
import v7.i;
import w7.b;
import w7.g;
import w7.h;

/* compiled from: StreamAllocation */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final a f17443a;

    /* renamed from: b  reason: collision with root package name */
    private final i f17444b;

    /* renamed from: c  reason: collision with root package name */
    private o f17445c;

    /* renamed from: d  reason: collision with root package name */
    private z7.a f17446d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17447e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17448f;

    /* renamed from: g  reason: collision with root package name */
    private j f17449g;

    public q(i iVar, a aVar) {
        this.f17444b = iVar;
        this.f17443a = aVar;
    }

    private void d(IOException iOException) {
        synchronized (this.f17444b) {
            if (this.f17445c != null) {
                z7.a aVar = this.f17446d;
                if (aVar.f17539g == 0) {
                    this.f17445c.a(aVar.a(), iOException);
                } else {
                    this.f17445c = null;
                }
            }
        }
        c();
    }

    private void e(boolean z10, boolean z11, boolean z12) {
        z7.a aVar;
        z7.a aVar2;
        synchronized (this.f17444b) {
            aVar = null;
            if (z12) {
                try {
                    this.f17449g = null;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z11) {
                this.f17447e = true;
            }
            z7.a aVar3 = this.f17446d;
            if (aVar3 != null) {
                if (z10) {
                    aVar3.f17543k = true;
                }
                if (this.f17449g == null && (this.f17447e || aVar3.f17543k)) {
                    o(aVar3);
                    z7.a aVar4 = this.f17446d;
                    if (aVar4.f17539g > 0) {
                        this.f17445c = null;
                    }
                    if (aVar4.f17542j.isEmpty()) {
                        this.f17446d.f17544l = System.nanoTime();
                        if (b.f16991b.c(this.f17444b, this.f17446d)) {
                            aVar2 = this.f17446d;
                            this.f17446d = null;
                            aVar = aVar2;
                        }
                    }
                    aVar2 = null;
                    this.f17446d = null;
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            h.d(aVar.i());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r7 = new z7.a(r8.f17445c.g());
        a(r7);
        r1 = r8.f17444b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        w7.b.f16991b.f(r8.f17444b, r7);
        r8.f17446d = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r8.f17448f != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        r7.c(r9, r10, r11, r8.f17443a.c(), r12);
        p().a(r7.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        throw new java.io.IOException("Canceled");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private z7.a f(int r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            v7.i r0 = r8.f17444b
            monitor-enter(r0)
            boolean r1 = r8.f17447e     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x008f
            y7.j r1 = r8.f17449g     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x0087
            boolean r1 = r8.f17448f     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x007f
            z7.a r1 = r8.f17446d     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.f17543k     // Catch:{ all -> 0x0097 }
            if (r2 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return r1
        L_0x0019:
            w7.b r1 = w7.b.f16991b     // Catch:{ all -> 0x0097 }
            v7.i r2 = r8.f17444b     // Catch:{ all -> 0x0097 }
            v7.a r3 = r8.f17443a     // Catch:{ all -> 0x0097 }
            z7.a r1 = r1.d(r2, r3, r8)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0029
            r8.f17446d = r1     // Catch:{ all -> 0x0097 }
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return r1
        L_0x0029:
            y7.o r1 = r8.f17445c     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x003a
            y7.o r1 = new y7.o     // Catch:{ all -> 0x0097 }
            v7.a r2 = r8.f17443a     // Catch:{ all -> 0x0097 }
            w7.g r3 = r8.p()     // Catch:{ all -> 0x0097 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0097 }
            r8.f17445c = r1     // Catch:{ all -> 0x0097 }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            y7.o r0 = r8.f17445c
            v7.z r0 = r0.g()
            z7.a r7 = new z7.a
            r7.<init>(r0)
            r8.a(r7)
            v7.i r1 = r8.f17444b
            monitor-enter(r1)
            w7.b r0 = w7.b.f16991b     // Catch:{ all -> 0x007c }
            v7.i r2 = r8.f17444b     // Catch:{ all -> 0x007c }
            r0.f(r2, r7)     // Catch:{ all -> 0x007c }
            r8.f17446d = r7     // Catch:{ all -> 0x007c }
            boolean r0 = r8.f17448f     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            v7.a r0 = r8.f17443a
            java.util.List r5 = r0.c()
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r1.c(r2, r3, r4, r5, r6)
            w7.g r9 = r8.p()
            v7.z r10 = r7.a()
            r9.a(r10)
            return r7
        L_0x0074:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x007c }
            java.lang.String r10 = "Canceled"
            r9.<init>(r10)     // Catch:{ all -> 0x007c }
            throw r9     // Catch:{ all -> 0x007c }
        L_0x007c:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            throw r9
        L_0x007f:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = "Canceled"
            r9.<init>(r10)     // Catch:{ all -> 0x0097 }
            throw r9     // Catch:{ all -> 0x0097 }
        L_0x0087:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = "stream != null"
            r9.<init>(r10)     // Catch:{ all -> 0x0097 }
            throw r9     // Catch:{ all -> 0x0097 }
        L_0x008f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = "released"
            r9.<init>(r10)     // Catch:{ all -> 0x0097 }
            throw r9     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.q.f(int, int, int, boolean):z7.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.j(r8) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private z7.a g(int r4, int r5, int r6, boolean r7, boolean r8) {
        /*
            r3 = this;
        L_0x0000:
            z7.a r0 = r3.f(r4, r5, r6, r7)
            v7.i r1 = r3.f17444b
            monitor-enter(r1)
            int r2 = r0.f17539g     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.j(r8)
            if (r1 == 0) goto L_0x0015
            return r0
        L_0x0015:
            r3.c()
            goto L_0x0000
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.q.g(int, int, int, boolean, boolean):z7.a");
    }

    private boolean h(RouteException routeException) {
        IOException c10 = routeException.c();
        if (c10 instanceof ProtocolException) {
            return false;
        }
        if (c10 instanceof InterruptedIOException) {
            return c10 instanceof SocketTimeoutException;
        }
        if ((!(c10 instanceof SSLHandshakeException) || !(c10.getCause() instanceof CertificateException)) && !(c10 instanceof SSLPeerUnverifiedException)) {
            return true;
        }
        return false;
    }

    private boolean i(IOException iOException) {
        if (!(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException)) {
            return true;
        }
        return false;
    }

    private void o(z7.a aVar) {
        int size = aVar.f17542j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (aVar.f17542j.get(i10).get() == this) {
                aVar.f17542j.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private g p() {
        return b.f16991b.g(this.f17444b);
    }

    public void a(z7.a aVar) {
        aVar.f17542j.add(new WeakReference(this));
    }

    public synchronized z7.a b() {
        return this.f17446d;
    }

    public void c() {
        e(true, false, true);
    }

    public j j(int i10, int i11, int i12, boolean z10, boolean z11) {
        j jVar;
        try {
            z7.a g10 = g(i10, i11, i12, z10, z11);
            if (g10.f17538f != null) {
                jVar = new f(this, g10.f17538f);
            } else {
                g10.i().setSoTimeout(i11);
                a0 d10 = g10.f17540h.d();
                long j10 = (long) i11;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                d10.g(j10, timeUnit);
                g10.f17541i.d().g((long) i12, timeUnit);
                jVar = new e(this, g10.f17540h, g10.f17541i);
            }
            synchronized (this.f17444b) {
                g10.f17539g++;
                this.f17449g = jVar;
            }
            return jVar;
        } catch (IOException e10) {
            throw new RouteException(e10);
        }
    }

    public void k() {
        e(true, false, false);
    }

    public boolean l(RouteException routeException) {
        if (this.f17446d != null) {
            d(routeException.c());
        }
        o oVar = this.f17445c;
        return (oVar == null || oVar.c()) && h(routeException);
    }

    public boolean m(IOException iOException, x xVar) {
        z7.a aVar = this.f17446d;
        if (aVar != null) {
            int i10 = aVar.f17539g;
            d(iOException);
            if (i10 == 1) {
                return false;
            }
        }
        boolean z10 = xVar == null || (xVar instanceof n);
        o oVar = this.f17445c;
        return (oVar == null || oVar.c()) && i(iOException) && z10;
    }

    public void n() {
        e(false, true, false);
    }

    public void q(j jVar) {
        synchronized (this.f17444b) {
            if (jVar != null) {
                if (jVar == this.f17449g) {
                }
            }
            throw new IllegalStateException("expected " + this.f17449g + " but was " + jVar);
        }
        e(false, false, true);
    }

    public String toString() {
        return this.f17443a.toString();
    }
}
