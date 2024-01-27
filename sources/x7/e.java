package x7;

import com.facebook.internal.NativeProtocol;
import ea.a0;
import ea.g;
import ea.x;
import ea.z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: FramedStream */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    long f17186a = 0;

    /* renamed from: b  reason: collision with root package name */
    long f17187b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f17188c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final d f17189d;

    /* renamed from: e  reason: collision with root package name */
    private final List<f> f17190e;

    /* renamed from: f  reason: collision with root package name */
    private List<f> f17191f;

    /* renamed from: g  reason: collision with root package name */
    private final c f17192g;

    /* renamed from: h  reason: collision with root package name */
    final b f17193h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final d f17194i = new d();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final d f17195j = new d();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public a f17196k = null;

    /* compiled from: FramedStream */
    final class b implements x {

        /* renamed from: h  reason: collision with root package name */
        private final ea.e f17197h = new ea.e();
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public boolean f17198i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public boolean f17199j;

        b() {
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            x7.e.b(r11.f17200k).y();
            x7.e.c(r11.f17200k);
            r9 = java.lang.Math.min(r11.f17200k.f17187b, r11.f17197h.w0());
            r1 = r11.f17200k;
            r1.f17187b -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void q(boolean r12) {
            /*
                r11 = this;
                x7.e r0 = x7.e.this
                monitor-enter(r0)
                x7.e r1 = x7.e.this     // Catch:{ all -> 0x0097 }
                x7.e$d r1 = r1.f17195j     // Catch:{ all -> 0x0097 }
                r1.r()     // Catch:{ all -> 0x0097 }
            L_0x000c:
                x7.e r1 = x7.e.this     // Catch:{ all -> 0x008c }
                long r2 = r1.f17187b     // Catch:{ all -> 0x008c }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x002a
                boolean r2 = r11.f17199j     // Catch:{ all -> 0x008c }
                if (r2 != 0) goto L_0x002a
                boolean r2 = r11.f17198i     // Catch:{ all -> 0x008c }
                if (r2 != 0) goto L_0x002a
                x7.a r1 = r1.f17196k     // Catch:{ all -> 0x008c }
                if (r1 != 0) goto L_0x002a
                x7.e r1 = x7.e.this     // Catch:{ all -> 0x008c }
                r1.z()     // Catch:{ all -> 0x008c }
                goto L_0x000c
            L_0x002a:
                x7.e r1 = x7.e.this     // Catch:{ all -> 0x0097 }
                x7.e$d r1 = r1.f17195j     // Catch:{ all -> 0x0097 }
                r1.y()     // Catch:{ all -> 0x0097 }
                x7.e r1 = x7.e.this     // Catch:{ all -> 0x0097 }
                r1.k()     // Catch:{ all -> 0x0097 }
                x7.e r1 = x7.e.this     // Catch:{ all -> 0x0097 }
                long r1 = r1.f17187b     // Catch:{ all -> 0x0097 }
                ea.e r3 = r11.f17197h     // Catch:{ all -> 0x0097 }
                long r3 = r3.w0()     // Catch:{ all -> 0x0097 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0097 }
                x7.e r1 = x7.e.this     // Catch:{ all -> 0x0097 }
                long r2 = r1.f17187b     // Catch:{ all -> 0x0097 }
                long r2 = r2 - r9
                r1.f17187b = r2     // Catch:{ all -> 0x0097 }
                monitor-exit(r0)     // Catch:{ all -> 0x0097 }
                x7.e$d r0 = r1.f17195j
                r0.r()
                x7.e r0 = x7.e.this     // Catch:{ all -> 0x0081 }
                x7.d r5 = r0.f17189d     // Catch:{ all -> 0x0081 }
                x7.e r0 = x7.e.this     // Catch:{ all -> 0x0081 }
                int r6 = r0.f17188c     // Catch:{ all -> 0x0081 }
                if (r12 == 0) goto L_0x0070
                ea.e r12 = r11.f17197h     // Catch:{ all -> 0x0081 }
                long r0 = r12.w0()     // Catch:{ all -> 0x0081 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x0070
                r12 = 1
                r7 = 1
                goto L_0x0072
            L_0x0070:
                r12 = 0
                r7 = 0
            L_0x0072:
                ea.e r8 = r11.f17197h     // Catch:{ all -> 0x0081 }
                r5.a1(r6, r7, r8, r9)     // Catch:{ all -> 0x0081 }
                x7.e r12 = x7.e.this
                x7.e$d r12 = r12.f17195j
                r12.y()
                return
            L_0x0081:
                r12 = move-exception
                x7.e r0 = x7.e.this
                x7.e$d r0 = r0.f17195j
                r0.y()
                throw r12
            L_0x008c:
                r12 = move-exception
                x7.e r1 = x7.e.this     // Catch:{ all -> 0x0097 }
                x7.e$d r1 = r1.f17195j     // Catch:{ all -> 0x0097 }
                r1.y()     // Catch:{ all -> 0x0097 }
                throw r12     // Catch:{ all -> 0x0097 }
            L_0x0097:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0097 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.e.b.q(boolean):void");
        }

        public void F0(ea.e eVar, long j10) {
            this.f17197h.F0(eVar, j10);
            while (this.f17197h.w0() >= 16384) {
                q(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f17197h.w0() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f17197h.w0() <= 0) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            q(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            x7.e.d(r8.f17200k).a1(x7.e.e(r8.f17200k), true, (ea.e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
            r2 = r8.f17200k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f17198i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
            x7.e.d(r8.f17200k).flush();
            x7.e.a(r8.f17200k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f17200k.f17193h.f17199j != false) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                x7.e r0 = x7.e.this
                monitor-enter(r0)
                boolean r1 = r8.f17198i     // Catch:{ all -> 0x0058 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                x7.e r0 = x7.e.this
                x7.e$b r0 = r0.f17193h
                boolean r0 = r0.f17199j
                r1 = 1
                if (r0 != 0) goto L_0x0040
                ea.e r0 = r8.f17197h
                long r2 = r0.w0()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                ea.e r0 = r8.f17197h
                long r2 = r0.w0()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0040
                r8.q(r1)
                goto L_0x001f
            L_0x002d:
                x7.e r0 = x7.e.this
                x7.d r2 = r0.f17189d
                x7.e r0 = x7.e.this
                int r3 = r0.f17188c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.a1(r3, r4, r5, r6)
            L_0x0040:
                x7.e r2 = x7.e.this
                monitor-enter(r2)
                r8.f17198i = r1     // Catch:{ all -> 0x0055 }
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                x7.e r0 = x7.e.this
                x7.d r0 = r0.f17189d
                r0.flush()
                x7.e r0 = x7.e.this
                r0.j()
                return
            L_0x0055:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                throw r0
            L_0x0058:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.e.b.close():void");
        }

        public a0 d() {
            return e.this.f17195j;
        }

        public void flush() {
            synchronized (e.this) {
                e.this.k();
            }
            while (this.f17197h.w0() > 0) {
                q(false);
                e.this.f17189d.flush();
            }
        }
    }

    /* compiled from: FramedStream */
    private final class c implements z {

        /* renamed from: h  reason: collision with root package name */
        private final ea.e f17201h;

        /* renamed from: i  reason: collision with root package name */
        private final ea.e f17202i;

        /* renamed from: j  reason: collision with root package name */
        private final long f17203j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f17204k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f17205l;

        private void q() {
            if (this.f17204k) {
                throw new IOException("stream closed");
            } else if (e.this.f17196k != null) {
                throw new IOException("stream was reset: " + e.this.f17196k);
            }
        }

        private void w() {
            e.this.f17194i.r();
            while (this.f17202i.w0() == 0 && !this.f17205l && !this.f17204k && e.this.f17196k == null) {
                try {
                    e.this.z();
                } finally {
                    e.this.f17194i.y();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
            r11 = x7.e.d(r8.f17206m);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            x7.e.d(r8.f17206m).f17138u += r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
            if (x7.e.d(r8.f17206m).f17138u < ((long) (x7.e.d(r8.f17206m).f17140w.e(com.facebook.internal.NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) / 2))) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
            x7.e.d(r8.f17206m).f1(0, x7.e.d(r8.f17206m).f17138u);
            x7.e.d(r8.f17206m).f17138u = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
            return r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long S(ea.e r9, long r10) {
            /*
                r8 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00ac
                x7.e r2 = x7.e.this
                monitor-enter(r2)
                r8.w()     // Catch:{ all -> 0x00a9 }
                r8.q()     // Catch:{ all -> 0x00a9 }
                ea.e r3 = r8.f17202i     // Catch:{ all -> 0x00a9 }
                long r3 = r3.w0()     // Catch:{ all -> 0x00a9 }
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x001d
                r9 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                return r9
            L_0x001d:
                ea.e r3 = r8.f17202i     // Catch:{ all -> 0x00a9 }
                long r4 = r3.w0()     // Catch:{ all -> 0x00a9 }
                long r10 = java.lang.Math.min(r10, r4)     // Catch:{ all -> 0x00a9 }
                long r9 = r3.S(r9, r10)     // Catch:{ all -> 0x00a9 }
                x7.e r11 = x7.e.this     // Catch:{ all -> 0x00a9 }
                long r3 = r11.f17186a     // Catch:{ all -> 0x00a9 }
                long r3 = r3 + r9
                r11.f17186a = r3     // Catch:{ all -> 0x00a9 }
                x7.d r11 = r11.f17189d     // Catch:{ all -> 0x00a9 }
                x7.n r11 = r11.f17140w     // Catch:{ all -> 0x00a9 }
                r5 = 65536(0x10000, float:9.18355E-41)
                int r11 = r11.e(r5)     // Catch:{ all -> 0x00a9 }
                int r11 = r11 / 2
                long r6 = (long) r11     // Catch:{ all -> 0x00a9 }
                int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x005c
                x7.e r11 = x7.e.this     // Catch:{ all -> 0x00a9 }
                x7.d r11 = r11.f17189d     // Catch:{ all -> 0x00a9 }
                x7.e r3 = x7.e.this     // Catch:{ all -> 0x00a9 }
                int r3 = r3.f17188c     // Catch:{ all -> 0x00a9 }
                x7.e r4 = x7.e.this     // Catch:{ all -> 0x00a9 }
                long r6 = r4.f17186a     // Catch:{ all -> 0x00a9 }
                r11.f1(r3, r6)     // Catch:{ all -> 0x00a9 }
                x7.e r11 = x7.e.this     // Catch:{ all -> 0x00a9 }
                r11.f17186a = r0     // Catch:{ all -> 0x00a9 }
            L_0x005c:
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                x7.e r11 = x7.e.this
                x7.d r11 = r11.f17189d
                monitor-enter(r11)
                x7.e r2 = x7.e.this     // Catch:{ all -> 0x00a6 }
                x7.d r2 = r2.f17189d     // Catch:{ all -> 0x00a6 }
                long r3 = r2.f17138u     // Catch:{ all -> 0x00a6 }
                long r3 = r3 + r9
                r2.f17138u = r3     // Catch:{ all -> 0x00a6 }
                x7.e r2 = x7.e.this     // Catch:{ all -> 0x00a6 }
                x7.d r2 = r2.f17189d     // Catch:{ all -> 0x00a6 }
                long r2 = r2.f17138u     // Catch:{ all -> 0x00a6 }
                x7.e r4 = x7.e.this     // Catch:{ all -> 0x00a6 }
                x7.d r4 = r4.f17189d     // Catch:{ all -> 0x00a6 }
                x7.n r4 = r4.f17140w     // Catch:{ all -> 0x00a6 }
                int r4 = r4.e(r5)     // Catch:{ all -> 0x00a6 }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x00a6 }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x00a4
                x7.e r2 = x7.e.this     // Catch:{ all -> 0x00a6 }
                x7.d r2 = r2.f17189d     // Catch:{ all -> 0x00a6 }
                r3 = 0
                x7.e r4 = x7.e.this     // Catch:{ all -> 0x00a6 }
                x7.d r4 = r4.f17189d     // Catch:{ all -> 0x00a6 }
                long r4 = r4.f17138u     // Catch:{ all -> 0x00a6 }
                r2.f1(r3, r4)     // Catch:{ all -> 0x00a6 }
                x7.e r2 = x7.e.this     // Catch:{ all -> 0x00a6 }
                x7.d r2 = r2.f17189d     // Catch:{ all -> 0x00a6 }
                r2.f17138u = r0     // Catch:{ all -> 0x00a6 }
            L_0x00a4:
                monitor-exit(r11)     // Catch:{ all -> 0x00a6 }
                return r9
            L_0x00a6:
                r9 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x00a6 }
                throw r9
            L_0x00a9:
                r9 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                throw r9
            L_0x00ac:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.e.c.S(ea.e, long):long");
        }

        public void close() {
            synchronized (e.this) {
                this.f17204k = true;
                this.f17202i.a();
                e.this.notifyAll();
            }
            e.this.j();
        }

        public a0 d() {
            return e.this.f17194i;
        }

        /* access modifiers changed from: package-private */
        public void u(g gVar, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            while (j10 > 0) {
                synchronized (e.this) {
                    z10 = this.f17205l;
                    z11 = true;
                    z12 = this.f17202i.w0() + j10 > this.f17203j;
                }
                if (z12) {
                    gVar.skip(j10);
                    e.this.n(a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z10) {
                    gVar.skip(j10);
                    return;
                } else {
                    long S = gVar.S(this.f17201h, j10);
                    if (S != -1) {
                        j10 -= S;
                        synchronized (e.this) {
                            if (this.f17202i.w0() != 0) {
                                z11 = false;
                            }
                            this.f17202i.o(this.f17201h);
                            if (z11) {
                                e.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        private c(long j10) {
            this.f17201h = new ea.e();
            this.f17202i = new ea.e();
            this.f17203j = j10;
        }
    }

    /* compiled from: FramedStream */
    class d extends ea.d {
        d() {
        }

        /* access modifiers changed from: protected */
        public IOException t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void x() {
            e.this.n(a.CANCEL);
        }

        public void y() {
            if (s()) {
                throw t((IOException) null);
            }
        }
    }

    e(int i10, d dVar, boolean z10, boolean z11, List<f> list) {
        Objects.requireNonNull(dVar, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.f17188c = i10;
        this.f17189d = dVar;
        this.f17187b = (long) dVar.f17141x.e(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        c cVar = new c((long) dVar.f17140w.e(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST));
        this.f17192g = cVar;
        b bVar = new b();
        this.f17193h = bVar;
        boolean unused = cVar.f17205l = z11;
        boolean unused2 = bVar.f17199j = z10;
        this.f17190e = list;
    }

    /* access modifiers changed from: private */
    public void j() {
        boolean z10;
        boolean t10;
        synchronized (this) {
            z10 = !this.f17192g.f17205l && this.f17192g.f17204k && (this.f17193h.f17199j || this.f17193h.f17198i);
            t10 = t();
        }
        if (z10) {
            l(a.CANCEL);
        } else if (!t10) {
            this.f17189d.W0(this.f17188c);
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        if (this.f17193h.f17198i) {
            throw new IOException("stream closed");
        } else if (this.f17193h.f17199j) {
            throw new IOException("stream finished");
        } else if (this.f17196k != null) {
            throw new IOException("stream was reset: " + this.f17196k);
        }
    }

    private boolean m(a aVar) {
        synchronized (this) {
            if (this.f17196k != null) {
                return false;
            }
            if (this.f17192g.f17205l && this.f17193h.f17199j) {
                return false;
            }
            this.f17196k = aVar;
            notifyAll();
            this.f17189d.W0(this.f17188c);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public void z() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public a0 A() {
        return this.f17195j;
    }

    /* access modifiers changed from: package-private */
    public void i(long j10) {
        this.f17187b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public void l(a aVar) {
        if (m(aVar)) {
            this.f17189d.d1(this.f17188c, aVar);
        }
    }

    public void n(a aVar) {
        if (m(aVar)) {
            this.f17189d.e1(this.f17188c, aVar);
        }
    }

    public int o() {
        return this.f17188c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r3.f17194i.y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<x7.f> p() {
        /*
            r3 = this;
            monitor-enter(r3)
            x7.e$d r0 = r3.f17194i     // Catch:{ all -> 0x003d }
            r0.r()     // Catch:{ all -> 0x003d }
        L_0x0006:
            java.util.List<x7.f> r0 = r3.f17191f     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            x7.a r0 = r3.f17196k     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            r3.z()     // Catch:{ all -> 0x0036 }
            goto L_0x0006
        L_0x0012:
            x7.e$d r0 = r3.f17194i     // Catch:{ all -> 0x003d }
            r0.y()     // Catch:{ all -> 0x003d }
            java.util.List<x7.f> r0 = r3.f17191f     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x001d
            monitor-exit(r3)
            return r0
        L_0x001d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r1.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "stream was reset: "
            r1.append(r2)     // Catch:{ all -> 0x003d }
            x7.a r2 = r3.f17196k     // Catch:{ all -> 0x003d }
            r1.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003d }
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0036:
            r0 = move-exception
            x7.e$d r1 = r3.f17194i     // Catch:{ all -> 0x003d }
            r1.y()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.e.p():java.util.List");
    }

    public x q() {
        synchronized (this) {
            if (this.f17191f == null) {
                if (!s()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f17193h;
    }

    public z r() {
        return this.f17192g;
    }

    public boolean s() {
        if (this.f17189d.f17126i == ((this.f17188c & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized boolean t() {
        if (this.f17196k != null) {
            return false;
        }
        if ((this.f17192g.f17205l || this.f17192g.f17204k) && ((this.f17193h.f17199j || this.f17193h.f17198i) && this.f17191f != null)) {
            return false;
        }
        return true;
    }

    public a0 u() {
        return this.f17194i;
    }

    /* access modifiers changed from: package-private */
    public void v(g gVar, int i10) {
        this.f17192g.u(gVar, (long) i10);
    }

    /* access modifiers changed from: package-private */
    public void w() {
        boolean t10;
        synchronized (this) {
            boolean unused = this.f17192g.f17205l = true;
            t10 = t();
            notifyAll();
        }
        if (!t10) {
            this.f17189d.W0(this.f17188c);
        }
    }

    /* access modifiers changed from: package-private */
    public void x(List<f> list, g gVar) {
        a aVar = null;
        boolean z10 = true;
        synchronized (this) {
            if (this.f17191f == null) {
                if (gVar.a()) {
                    aVar = a.PROTOCOL_ERROR;
                } else {
                    this.f17191f = list;
                    z10 = t();
                    notifyAll();
                }
            } else if (gVar.d()) {
                aVar = a.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f17191f);
                arrayList.addAll(list);
                this.f17191f = arrayList;
            }
        }
        if (aVar != null) {
            n(aVar);
        } else if (!z10) {
            this.f17189d.W0(this.f17188c);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void y(a aVar) {
        if (this.f17196k == null) {
            this.f17196k = aVar;
            notifyAll();
        }
    }
}
