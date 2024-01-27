package com.google.android.exoplayer2.upstream;

import a6.j0;
import a6.m0;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import z5.p;

public final class Loader implements p {

    /* renamed from: d  reason: collision with root package name */
    public static final c f7662d = h(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f7663e = h(true, -9223372036854775807L);

    /* renamed from: f  reason: collision with root package name */
    public static final c f7664f = new c(2, -9223372036854775807L);

    /* renamed from: g  reason: collision with root package name */
    public static final c f7665g = new c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f7666a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public d<? extends e> f7667b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public IOException f7668c;

    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedLoaderException(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                java.lang.String r3 = java.lang.String.valueOf(r1)
                int r3 = r3.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException.<init>(java.lang.Throwable):void");
        }
    }

    public interface b<T extends e> {
        void k(T t10, long j10, long j11, boolean z10);

        void l(T t10, long j10, long j11);

        c s(T t10, long j10, long j11, IOException iOException, int i10);
    }

    public static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f7669a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f7670b;

        public boolean c() {
            int i10 = this.f7669a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f7669a = i10;
            this.f7670b = j10;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final int f7671h;

        /* renamed from: i  reason: collision with root package name */
        private final T f7672i;

        /* renamed from: j  reason: collision with root package name */
        private final long f7673j;

        /* renamed from: k  reason: collision with root package name */
        private b<T> f7674k;

        /* renamed from: l  reason: collision with root package name */
        private IOException f7675l;

        /* renamed from: m  reason: collision with root package name */
        private int f7676m;

        /* renamed from: n  reason: collision with root package name */
        private Thread f7677n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f7678o;

        /* renamed from: p  reason: collision with root package name */
        private volatile boolean f7679p;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f7672i = t10;
            this.f7674k = bVar;
            this.f7671h = i10;
            this.f7673j = j10;
        }

        private void b() {
            this.f7675l = null;
            Loader.this.f7666a.execute((Runnable) a6.a.e(Loader.this.f7667b));
        }

        private void c() {
            d unused = Loader.this.f7667b = null;
        }

        private long d() {
            return (long) Math.min((this.f7676m - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f7679p = z10;
            this.f7675l = null;
            if (hasMessages(0)) {
                this.f7678o = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f7678o = true;
                    this.f7672i.c();
                    Thread thread = this.f7677n;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) a6.a.e(this.f7674k)).k(this.f7672i, elapsedRealtime, elapsedRealtime - this.f7673j, true);
                this.f7674k = null;
            }
        }

        public void e(int i10) {
            IOException iOException = this.f7675l;
            if (iOException != null && this.f7676m > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            a6.a.f(Loader.this.f7667b == null);
            d unused = Loader.this.f7667b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        public void handleMessage(Message message) {
            long j10;
            if (!this.f7679p) {
                int i10 = message.what;
                if (i10 == 0) {
                    b();
                } else if (i10 != 3) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = elapsedRealtime - this.f7673j;
                    b bVar = (b) a6.a.e(this.f7674k);
                    if (this.f7678o) {
                        bVar.k(this.f7672i, elapsedRealtime, j11, false);
                        return;
                    }
                    int i11 = message.what;
                    if (i11 == 1) {
                        try {
                            bVar.l(this.f7672i, elapsedRealtime, j11);
                        } catch (RuntimeException e10) {
                            a6.p.d("LoadTask", "Unexpected exception handling load completed", e10);
                            IOException unused = Loader.this.f7668c = new UnexpectedLoaderException(e10);
                        }
                    } else if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f7675l = iOException;
                        int i12 = this.f7676m + 1;
                        this.f7676m = i12;
                        c s10 = bVar.s(this.f7672i, elapsedRealtime, j11, iOException, i12);
                        if (s10.f7669a == 3) {
                            IOException unused2 = Loader.this.f7668c = this.f7675l;
                        } else if (s10.f7669a != 2) {
                            if (s10.f7669a == 1) {
                                this.f7676m = 1;
                            }
                            if (s10.f7670b != -9223372036854775807L) {
                                j10 = s10.f7670b;
                            } else {
                                j10 = d();
                            }
                            f(j10);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f7678o;
                    this.f7677n = Thread.currentThread();
                }
                if (z10) {
                    String simpleName = this.f7672i.getClass().getSimpleName();
                    j0.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    this.f7672i.b();
                    j0.c();
                }
                synchronized (this) {
                    this.f7677n = null;
                    Thread.interrupted();
                }
                if (!this.f7679p) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e10) {
                if (!this.f7679p) {
                    obtainMessage(2, e10).sendToTarget();
                }
            } catch (Exception e11) {
                if (!this.f7679p) {
                    a6.p.d("LoadTask", "Unexpected exception loading stream", e11);
                    obtainMessage(2, new UnexpectedLoaderException(e11)).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                if (!this.f7679p) {
                    a6.p.d("LoadTask", "OutOfMemory error loading stream", e12);
                    obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
                }
            } catch (Error e13) {
                if (!this.f7679p) {
                    a6.p.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            } catch (Throwable th) {
                j0.c();
                throw th;
            }
        }
    }

    public interface e {
        void b();

        void c();
    }

    public interface f {
        void j();
    }

    private static final class g implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final f f7681h;

        public g(f fVar) {
            this.f7681h = fVar;
        }

        public void run() {
            this.f7681h.j();
        }
    }

    public Loader(String str) {
        String valueOf = String.valueOf(str);
        this.f7666a = m0.r0(valueOf.length() != 0 ? "ExoPlayer:Loader:".concat(valueOf) : new String("ExoPlayer:Loader:"));
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void a() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) a6.a.h(this.f7667b)).a(false);
    }

    public void g() {
        this.f7668c = null;
    }

    public boolean i() {
        return this.f7668c != null;
    }

    public boolean j() {
        return this.f7667b != null;
    }

    public void k(int i10) {
        IOException iOException = this.f7668c;
        if (iOException == null) {
            d<? extends e> dVar = this.f7667b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f7671h;
                }
                dVar.e(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void l() {
        m((f) null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f7667b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f7666a.execute(new g(fVar));
        }
        this.f7666a.shutdown();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        this.f7668c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) a6.a.h(Looper.myLooper()), t10, bVar, i10, elapsedRealtime).f(0);
        return elapsedRealtime;
    }
}
