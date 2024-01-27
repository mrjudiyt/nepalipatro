package com.google.android.exoplayer2.drm;

import a6.f;
import a6.g;
import a6.m0;
import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.upstream.g;
import j4.p;
import j4.u;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

class DefaultDrmSession implements DrmSession {

    /* renamed from: a  reason: collision with root package name */
    public final List<h.b> f6477a;

    /* renamed from: b  reason: collision with root package name */
    private final n f6478b;

    /* renamed from: c  reason: collision with root package name */
    private final a f6479c;

    /* renamed from: d  reason: collision with root package name */
    private final b f6480d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6481e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6482f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f6483g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, String> f6484h;

    /* renamed from: i  reason: collision with root package name */
    private final g<i.a> f6485i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.g f6486j;

    /* renamed from: k  reason: collision with root package name */
    final q f6487k;

    /* renamed from: l  reason: collision with root package name */
    final UUID f6488l;

    /* renamed from: m  reason: collision with root package name */
    final e f6489m;

    /* renamed from: n  reason: collision with root package name */
    private int f6490n;

    /* renamed from: o  reason: collision with root package name */
    private int f6491o;

    /* renamed from: p  reason: collision with root package name */
    private HandlerThread f6492p;

    /* renamed from: q  reason: collision with root package name */
    private c f6493q;

    /* renamed from: r  reason: collision with root package name */
    private p f6494r;

    /* renamed from: s  reason: collision with root package name */
    private DrmSession.DrmSessionException f6495s;

    /* renamed from: t  reason: collision with root package name */
    private byte[] f6496t;

    /* renamed from: u  reason: collision with root package name */
    private byte[] f6497u;

    /* renamed from: v  reason: collision with root package name */
    private n.a f6498v;

    /* renamed from: w  reason: collision with root package name */
    private n.d f6499w;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    public interface a {
        void a(Exception exc, boolean z10);

        void b(DefaultDrmSession defaultDrmSession);

        void c();
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i10);

        void b(DefaultDrmSession defaultDrmSession, int i10);
    }

    @SuppressLint({"HandlerLeak"})
    private class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6500a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            IOException iOException;
            MediaDrmCallbackException mediaDrmCallbackException2 = mediaDrmCallbackException;
            d dVar = (d) message.obj;
            if (!dVar.f6503b) {
                return false;
            }
            int i10 = dVar.f6506e + 1;
            dVar.f6506e = i10;
            if (i10 > DefaultDrmSession.this.f6486j.d(3)) {
                return false;
            }
            g5.h hVar = new g5.h(dVar.f6502a, mediaDrmCallbackException2.f6549h, mediaDrmCallbackException2.f6550i, mediaDrmCallbackException2.f6551j, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f6504c, mediaDrmCallbackException2.f6552k);
            g5.i iVar = new g5.i(3);
            if (mediaDrmCallbackException.getCause() instanceof IOException) {
                iOException = (IOException) mediaDrmCallbackException.getCause();
            } else {
                iOException = new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause());
            }
            long a10 = DefaultDrmSession.this.f6486j.a(new g.c(hVar, iVar, iOException, dVar.f6506e));
            if (a10 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f6500a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), a10);
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(g5.h.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages((Object) null);
            this.f6500a = true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$d r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession.d) r0
                int r1 = r6.what     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                if (r1 == 0) goto L_0x0020
                r2 = 1
                if (r1 != r2) goto L_0x001a
                com.google.android.exoplayer2.drm.DefaultDrmSession r1 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                com.google.android.exoplayer2.drm.q r2 = r1.f6487k     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f6488l     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f6505d     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                com.google.android.exoplayer2.drm.n$a r3 = (com.google.android.exoplayer2.drm.n.a) r3     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.a(r1, r3)     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x001a:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                r1.<init>()     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                throw r1     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
            L_0x0020:
                com.google.android.exoplayer2.drm.DefaultDrmSession r1 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                com.google.android.exoplayer2.drm.q r2 = r1.f6487k     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f6488l     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f6505d     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                com.google.android.exoplayer2.drm.n$d r3 = (com.google.android.exoplayer2.drm.n.d) r3     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.b(r1, r3)     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x002f:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                a6.p.i(r2, r3, r1)
                goto L_0x0040
            L_0x0038:
                r1 = move-exception
                boolean r2 = r5.a(r6, r1)
                if (r2 == 0) goto L_0x0040
                return
            L_0x0040:
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                com.google.android.exoplayer2.upstream.g r2 = r2.f6486j
                long r3 = r0.f6502a
                r2.c(r3)
                monitor-enter(r5)
                boolean r2 = r5.f6500a     // Catch:{ all -> 0x0065 }
                if (r2 != 0) goto L_0x0063
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ all -> 0x0065 }
                com.google.android.exoplayer2.drm.DefaultDrmSession$e r2 = r2.f6489m     // Catch:{ all -> 0x0065 }
                int r6 = r6.what     // Catch:{ all -> 0x0065 }
                java.lang.Object r0 = r0.f6505d     // Catch:{ all -> 0x0065 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0065 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0065 }
                r6.sendToTarget()     // Catch:{ all -> 0x0065 }
            L_0x0063:
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                return
            L_0x0065:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.c.handleMessage(android.os.Message):void");
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f6502a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6503b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6504c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f6505d;

        /* renamed from: e  reason: collision with root package name */
        public int f6506e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f6502a = j10;
            this.f6503b = z10;
            this.f6504c = j11;
            this.f6505d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                DefaultDrmSession.this.B(obj, obj2);
            } else if (i10 == 1) {
                DefaultDrmSession.this.v(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, n nVar, a aVar, b bVar, List<h.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, q qVar, Looper looper, com.google.android.exoplayer2.upstream.g gVar) {
        if (i10 == 1 || i10 == 3) {
            a6.a.e(bArr);
        }
        this.f6488l = uuid;
        this.f6479c = aVar;
        this.f6480d = bVar;
        this.f6478b = nVar;
        this.f6481e = i10;
        this.f6482f = z10;
        this.f6483g = z11;
        if (bArr != null) {
            this.f6497u = bArr;
            this.f6477a = null;
        } else {
            this.f6477a = Collections.unmodifiableList((List) a6.a.e(list));
        }
        this.f6484h = hashMap;
        this.f6487k = qVar;
        this.f6485i = new a6.g<>();
        this.f6486j = gVar;
        this.f6490n = 2;
        this.f6489m = new e(looper);
    }

    /* access modifiers changed from: private */
    public void B(Object obj, Object obj2) {
        if (obj != this.f6499w) {
            return;
        }
        if (this.f6490n == 2 || r()) {
            this.f6499w = null;
            if (obj2 instanceof Exception) {
                this.f6479c.a((Exception) obj2, false);
                return;
            }
            try {
                this.f6478b.j((byte[]) obj2);
                this.f6479c.c();
            } catch (Exception e10) {
                this.f6479c.a(e10, true);
            }
        }
    }

    private boolean C() {
        if (r()) {
            return true;
        }
        try {
            byte[] e10 = this.f6478b.e();
            this.f6496t = e10;
            this.f6494r = this.f6478b.c(e10);
            this.f6490n = 3;
            n(new b(3));
            a6.a.e(this.f6496t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f6479c.b(this);
            return false;
        } catch (Exception e11) {
            u(e11, 1);
            return false;
        }
    }

    private void D(byte[] bArr, int i10, boolean z10) {
        try {
            this.f6498v = this.f6478b.k(bArr, this.f6477a, i10, this.f6484h);
            ((c) m0.j(this.f6493q)).b(1, a6.a.e(this.f6498v), z10);
        } catch (Exception e10) {
            w(e10, true);
        }
    }

    private boolean F() {
        try {
            this.f6478b.f(this.f6496t, this.f6497u);
            return true;
        } catch (Exception e10) {
            u(e10, 1);
            return false;
        }
    }

    private void n(f<i.a> fVar) {
        for (i.a accept : this.f6485i.j()) {
            fVar.accept(accept);
        }
    }

    private void o(boolean z10) {
        if (!this.f6483g) {
            byte[] bArr = (byte[]) m0.j(this.f6496t);
            int i10 = this.f6481e;
            if (i10 == 0 || i10 == 1) {
                if (this.f6497u == null) {
                    D(bArr, 1, z10);
                } else if (this.f6490n == 4 || F()) {
                    long p10 = p();
                    if (this.f6481e == 0 && p10 <= 60) {
                        StringBuilder sb = new StringBuilder(88);
                        sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
                        sb.append(p10);
                        a6.p.b("DefaultDrmSession", sb.toString());
                        D(bArr, 2, z10);
                    } else if (p10 <= 0) {
                        u(new KeysExpiredException(), 2);
                    } else {
                        this.f6490n = 4;
                        n(j4.c.f15369a);
                    }
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    a6.a.e(this.f6497u);
                    a6.a.e(this.f6496t);
                    D(this.f6497u, 3, z10);
                }
            } else if (this.f6497u == null || F()) {
                D(bArr, 2, z10);
            }
        }
    }

    private long p() {
        if (!e4.c.f8048d.equals(this.f6488l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) a6.a.e(u.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean r() {
        int i10 = this.f6490n;
        return i10 == 3 || i10 == 4;
    }

    private void u(Exception exc, int i10) {
        this.f6495s = new DrmSession.DrmSessionException(exc, k.a(exc, i10));
        a6.p.d("DefaultDrmSession", "DRM session error", exc);
        n(new c(exc));
        if (this.f6490n != 4) {
            this.f6490n = 1;
        }
    }

    /* access modifiers changed from: private */
    public void v(Object obj, Object obj2) {
        if (obj == this.f6498v && r()) {
            this.f6498v = null;
            if (obj2 instanceof Exception) {
                w((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f6481e == 3) {
                    this.f6478b.i((byte[]) m0.j(this.f6497u), bArr);
                    n(j4.b.f15368a);
                    return;
                }
                byte[] i10 = this.f6478b.i(this.f6496t, bArr);
                int i11 = this.f6481e;
                if (!((i11 != 2 && (i11 != 0 || this.f6497u == null)) || i10 == null || i10.length == 0)) {
                    this.f6497u = i10;
                }
                this.f6490n = 4;
                n(j4.a.f15367a);
            } catch (Exception e10) {
                w(e10, true);
            }
        }
    }

    private void w(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f6479c.b(this);
        } else {
            u(exc, z10 ? 1 : 2);
        }
    }

    private void x() {
        if (this.f6481e == 0 && this.f6490n == 4) {
            m0.j(this.f6496t);
            o(false);
        }
    }

    public void A(Exception exc, boolean z10) {
        u(exc, z10 ? 1 : 3);
    }

    public void E() {
        this.f6499w = this.f6478b.d();
        ((c) m0.j(this.f6493q)).b(0, a6.a.e(this.f6499w), true);
    }

    public void a(i.a aVar) {
        boolean z10 = false;
        a6.a.f(this.f6491o >= 0);
        if (aVar != null) {
            this.f6485i.a(aVar);
        }
        int i10 = this.f6491o + 1;
        this.f6491o = i10;
        if (i10 == 1) {
            if (this.f6490n == 2) {
                z10 = true;
            }
            a6.a.f(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f6492p = handlerThread;
            handlerThread.start();
            this.f6493q = new c(this.f6492p.getLooper());
            if (C()) {
                o(true);
            }
        } else if (aVar != null && r() && this.f6485i.b(aVar) == 1) {
            aVar.k(this.f6490n);
        }
        this.f6480d.a(this, this.f6491o);
    }

    public void b(i.a aVar) {
        a6.a.f(this.f6491o > 0);
        int i10 = this.f6491o - 1;
        this.f6491o = i10;
        if (i10 == 0) {
            this.f6490n = 0;
            ((e) m0.j(this.f6489m)).removeCallbacksAndMessages((Object) null);
            ((c) m0.j(this.f6493q)).c();
            this.f6493q = null;
            ((HandlerThread) m0.j(this.f6492p)).quit();
            this.f6492p = null;
            this.f6494r = null;
            this.f6495s = null;
            this.f6498v = null;
            this.f6499w = null;
            byte[] bArr = this.f6496t;
            if (bArr != null) {
                this.f6478b.g(bArr);
                this.f6496t = null;
            }
        }
        if (aVar != null) {
            this.f6485i.c(aVar);
            if (this.f6485i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f6480d.b(this, this.f6491o);
    }

    public final UUID c() {
        return this.f6488l;
    }

    public final int d() {
        return this.f6490n;
    }

    public boolean e() {
        return this.f6482f;
    }

    public Map<String, String> f() {
        byte[] bArr = this.f6496t;
        if (bArr == null) {
            return null;
        }
        return this.f6478b.b(bArr);
    }

    public final p g() {
        return this.f6494r;
    }

    public final DrmSession.DrmSessionException h() {
        if (this.f6490n == 1) {
            return this.f6495s;
        }
        return null;
    }

    public boolean q(byte[] bArr) {
        return Arrays.equals(this.f6496t, bArr);
    }

    public void y(int i10) {
        if (i10 == 2) {
            x();
        }
    }

    public void z() {
        if (C()) {
            o(true);
        }
    }
}
