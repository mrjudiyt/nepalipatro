package com.google.android.exoplayer2.drm;

import a6.m0;
import a6.p;
import a6.t;
import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.n;
import com.google.common.collect.b0;
import com.google.common.collect.f1;
import com.google.common.collect.k1;
import com.google.common.collect.x;
import j4.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class DefaultDrmSessionManager implements j {

    /* renamed from: c  reason: collision with root package name */
    private final UUID f6508c;

    /* renamed from: d  reason: collision with root package name */
    private final n.c f6509d;

    /* renamed from: e  reason: collision with root package name */
    private final q f6510e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, String> f6511f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f6512g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f6513h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f6514i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final f f6515j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g f6516k;

    /* renamed from: l  reason: collision with root package name */
    private final g f6517l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final long f6518m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final List<DefaultDrmSession> f6519n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Set<e> f6520o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Set<DefaultDrmSession> f6521p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f6522q;

    /* renamed from: r  reason: collision with root package name */
    private n f6523r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public DefaultDrmSession f6524s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public DefaultDrmSession f6525t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Looper f6526u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public Handler f6527v;

    /* renamed from: w  reason: collision with root package name */
    private int f6528w;

    /* renamed from: x  reason: collision with root package name */
    private byte[] f6529x;

    /* renamed from: y  reason: collision with root package name */
    volatile d f6530y;

    public static final class MissingSchemeDataException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private MissingSchemeDataException(java.util.UUID r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 29
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Media does not support uuid: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException.<init>(java.util.UUID):void");
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, String> f6531a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private UUID f6532b = e4.c.f8048d;

        /* renamed from: c  reason: collision with root package name */
        private n.c f6533c = o.f6588d;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6534d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f6535e = new int[0];

        /* renamed from: f  reason: collision with root package name */
        private boolean f6536f;

        /* renamed from: g  reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.g f6537g = new com.google.android.exoplayer2.upstream.f();

        /* renamed from: h  reason: collision with root package name */
        private long f6538h = 300000;

        public DefaultDrmSessionManager a(q qVar) {
            return new DefaultDrmSessionManager(this.f6532b, this.f6533c, qVar, this.f6531a, this.f6534d, this.f6535e, this.f6536f, this.f6537g, this.f6538h);
        }

        public b b(boolean z10) {
            this.f6534d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f6536f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (!(i10 == 2 || i10 == 1)) {
                    z10 = false;
                }
                a6.a.a(z10);
            }
            this.f6535e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, n.c cVar) {
            this.f6532b = (UUID) a6.a.e(uuid);
            this.f6533c = (n.c) a6.a.e(cVar);
            return this;
        }
    }

    private class c implements n.b {
        private c() {
        }

        public void a(n nVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) a6.a.e(DefaultDrmSessionManager.this.f6530y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f6519n) {
                    if (defaultDrmSession.q(bArr)) {
                        defaultDrmSession.y(message.what);
                        return;
                    }
                }
            }
        }
    }

    private class e implements j.b {

        /* renamed from: b  reason: collision with root package name */
        private final i.a f6541b;

        /* renamed from: c  reason: collision with root package name */
        private DrmSession f6542c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6543d;

        public e(i.a aVar) {
            this.f6541b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(e4.j jVar) {
            if (DefaultDrmSessionManager.this.f6522q != 0 && !this.f6543d) {
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                this.f6542c = defaultDrmSessionManager.s((Looper) a6.a.e(defaultDrmSessionManager.f6526u), this.f6541b, jVar, false);
                DefaultDrmSessionManager.this.f6520o.add(this);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e() {
            if (!this.f6543d) {
                DrmSession drmSession = this.f6542c;
                if (drmSession != null) {
                    drmSession.b(this.f6541b);
                }
                DefaultDrmSessionManager.this.f6520o.remove(this);
                this.f6543d = true;
            }
        }

        public void c(e4.j jVar) {
            ((Handler) a6.a.e(DefaultDrmSessionManager.this.f6527v)).post(new e(this, jVar));
        }

        public void release() {
            m0.z0((Handler) a6.a.e(DefaultDrmSessionManager.this.f6527v), new d(this));
        }
    }

    private class f implements DefaultDrmSession.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<DefaultDrmSession> f6545a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private DefaultDrmSession f6546b;

        public f(DefaultDrmSessionManager defaultDrmSessionManager) {
        }

        public void a(Exception exc, boolean z10) {
            this.f6546b = null;
            x<DefaultDrmSession> n10 = x.n(this.f6545a);
            this.f6545a.clear();
            k1<DefaultDrmSession> g10 = n10.iterator();
            while (g10.hasNext()) {
                g10.next().A(exc, z10);
            }
        }

        public void b(DefaultDrmSession defaultDrmSession) {
            this.f6545a.add(defaultDrmSession);
            if (this.f6546b == null) {
                this.f6546b = defaultDrmSession;
                defaultDrmSession.E();
            }
        }

        public void c() {
            this.f6546b = null;
            x<DefaultDrmSession> n10 = x.n(this.f6545a);
            this.f6545a.clear();
            k1<DefaultDrmSession> g10 = n10.iterator();
            while (g10.hasNext()) {
                g10.next().z();
            }
        }

        public void d(DefaultDrmSession defaultDrmSession) {
            this.f6545a.remove(defaultDrmSession);
            if (this.f6546b == defaultDrmSession) {
                this.f6546b = null;
                if (!this.f6545a.isEmpty()) {
                    DefaultDrmSession next = this.f6545a.iterator().next();
                    this.f6546b = next;
                    next.E();
                }
            }
        }
    }

    private class g implements DefaultDrmSession.b {
        private g() {
        }

        public void a(DefaultDrmSession defaultDrmSession, int i10) {
            if (DefaultDrmSessionManager.this.f6518m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f6521p.remove(defaultDrmSession);
                ((Handler) a6.a.e(DefaultDrmSessionManager.this.f6527v)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        public void b(DefaultDrmSession defaultDrmSession, int i10) {
            if (i10 == 1 && DefaultDrmSessionManager.this.f6522q > 0 && DefaultDrmSessionManager.this.f6518m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f6521p.add(defaultDrmSession);
                ((Handler) a6.a.e(DefaultDrmSessionManager.this.f6527v)).postAtTime(new f(defaultDrmSession), defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f6518m);
            } else if (i10 == 0) {
                DefaultDrmSessionManager.this.f6519n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f6524s == defaultDrmSession) {
                    DefaultDrmSession unused = DefaultDrmSessionManager.this.f6524s = null;
                }
                if (DefaultDrmSessionManager.this.f6525t == defaultDrmSession) {
                    DefaultDrmSession unused2 = DefaultDrmSessionManager.this.f6525t = null;
                }
                DefaultDrmSessionManager.this.f6515j.d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f6518m != -9223372036854775807L) {
                    ((Handler) a6.a.e(DefaultDrmSessionManager.this.f6527v)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f6521p.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.B();
        }
    }

    private void A(Looper looper) {
        if (this.f6530y == null) {
            this.f6530y = new d(looper);
        }
    }

    /* access modifiers changed from: private */
    public void B() {
        if (this.f6523r != null && this.f6522q == 0 && this.f6519n.isEmpty() && this.f6520o.isEmpty()) {
            ((n) a6.a.e(this.f6523r)).release();
            this.f6523r = null;
        }
    }

    private void C() {
        k1<e> g10 = b0.n(this.f6520o).iterator();
        while (g10.hasNext()) {
            g10.next().release();
        }
    }

    private void E(DrmSession drmSession, i.a aVar) {
        drmSession.b(aVar);
        if (this.f6518m != -9223372036854775807L) {
            drmSession.b((i.a) null);
        }
    }

    /* access modifiers changed from: private */
    public DrmSession s(Looper looper, i.a aVar, e4.j jVar, boolean z10) {
        List<h.b> list;
        A(looper);
        h hVar = jVar.f8099v;
        if (hVar == null) {
            return z(t.l(jVar.f8096s), z10);
        }
        DefaultDrmSession defaultDrmSession = null;
        if (this.f6529x == null) {
            list = x((h) a6.a.e(hVar), this.f6508c, false);
            if (list.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f6508c);
                p.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new m(new DrmSession.DrmSessionException(missingSchemeDataException, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f6512g) {
            Iterator<DefaultDrmSession> it = this.f6519n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (m0.c(next.f6477a, list)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f6525t;
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = w(list, false, aVar, z10);
            if (!this.f6512g) {
                this.f6525t = defaultDrmSession;
            }
            this.f6519n.add(defaultDrmSession);
        } else {
            defaultDrmSession.a(aVar);
        }
        return defaultDrmSession;
    }

    private static boolean t(DrmSession drmSession) {
        if (drmSession.d() != 1 || (m0.f205a >= 19 && !(((DrmSession.DrmSessionException) a6.a.e(drmSession.h())).getCause() instanceof ResourceBusyException))) {
            return false;
        }
        return true;
    }

    private boolean u(h hVar) {
        if (this.f6529x != null) {
            return true;
        }
        if (x(hVar, this.f6508c, true).isEmpty()) {
            if (hVar.f6568k != 1 || !hVar.f(0).e(e4.c.f8046b)) {
                return false;
            }
            String valueOf = String.valueOf(this.f6508c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 72);
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(valueOf);
            p.h("DefaultDrmSessionMgr", sb.toString());
        }
        String str = hVar.f6567j;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (m0.f205a >= 25) {
                return true;
            }
            return false;
        } else if ("cbc1".equals(str) || "cens".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    private DefaultDrmSession v(List<h.b> list, boolean z10, i.a aVar) {
        a6.a.e(this.f6523r);
        List<h.b> list2 = list;
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f6508c, this.f6523r, this.f6515j, this.f6517l, list2, this.f6528w, this.f6514i | z10, z10, this.f6529x, this.f6511f, this.f6510e, (Looper) a6.a.e(this.f6526u), this.f6516k);
        defaultDrmSession.a(aVar);
        if (this.f6518m != -9223372036854775807L) {
            defaultDrmSession.a((i.a) null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession w(List<h.b> list, boolean z10, i.a aVar, boolean z11) {
        DefaultDrmSession v10 = v(list, z10, aVar);
        if (t(v10) && !this.f6521p.isEmpty()) {
            k1<DefaultDrmSession> g10 = b0.n(this.f6521p).iterator();
            while (g10.hasNext()) {
                g10.next().b((i.a) null);
            }
            E(v10, aVar);
            v10 = v(list, z10, aVar);
        }
        if (!t(v10) || !z11 || this.f6520o.isEmpty()) {
            return v10;
        }
        C();
        E(v10, aVar);
        return v(list, z10, aVar);
    }

    private static List<h.b> x(h hVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(hVar.f6568k);
        for (int i10 = 0; i10 < hVar.f6568k; i10++) {
            h.b f10 = hVar.f(i10);
            if ((f10.e(uuid) || (e4.c.f8047c.equals(uuid) && f10.e(e4.c.f8046b))) && (f10.f6573l != null || z10)) {
                arrayList.add(f10);
            }
        }
        return arrayList;
    }

    private synchronized void y(Looper looper) {
        Looper looper2 = this.f6526u;
        if (looper2 == null) {
            this.f6526u = looper;
            this.f6527v = new Handler(looper);
        } else {
            a6.a.f(looper2 == looper);
            a6.a.e(this.f6527v);
        }
    }

    private DrmSession z(int i10, boolean z10) {
        n nVar = (n) a6.a.e(this.f6523r);
        if ((q.class.equals(nVar.a()) && q.f9435d) || m0.o0(this.f6513h, i10) == -1 || j4.t.class.equals(nVar.a())) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f6524s;
        if (defaultDrmSession == null) {
            DefaultDrmSession w10 = w(x.s(), true, (i.a) null, z10);
            this.f6519n.add(w10);
            this.f6524s = w10;
        } else {
            defaultDrmSession.a((i.a) null);
        }
        return this.f6524s;
    }

    public void D(int i10, byte[] bArr) {
        a6.a.f(this.f6519n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            a6.a.e(bArr);
        }
        this.f6528w = i10;
        this.f6529x = bArr;
    }

    public j.b a(Looper looper, i.a aVar, e4.j jVar) {
        a6.a.f(this.f6522q > 0);
        y(looper);
        e eVar = new e(aVar);
        eVar.c(jVar);
        return eVar;
    }

    public Class<? extends j4.p> b(e4.j jVar) {
        Class<? extends j4.p> a10 = ((n) a6.a.e(this.f6523r)).a();
        h hVar = jVar.f8099v;
        if (hVar != null) {
            return u(hVar) ? a10 : j4.t.class;
        }
        if (m0.o0(this.f6513h, t.l(jVar.f8096s)) != -1) {
            return a10;
        }
        return null;
    }

    public final void c() {
        int i10 = this.f6522q;
        this.f6522q = i10 + 1;
        if (i10 == 0) {
            if (this.f6523r == null) {
                n a10 = this.f6509d.a(this.f6508c);
                this.f6523r = a10;
                a10.h(new c());
            } else if (this.f6518m != -9223372036854775807L) {
                for (int i11 = 0; i11 < this.f6519n.size(); i11++) {
                    this.f6519n.get(i11).a((i.a) null);
                }
            }
        }
    }

    public DrmSession d(Looper looper, i.a aVar, e4.j jVar) {
        a6.a.f(this.f6522q > 0);
        y(looper);
        return s(looper, aVar, jVar, true);
    }

    public final void release() {
        int i10 = this.f6522q - 1;
        this.f6522q = i10;
        if (i10 == 0) {
            if (this.f6518m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f6519n);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((DefaultDrmSession) arrayList.get(i11)).b((i.a) null);
                }
            }
            C();
            B();
        }
    }

    private DefaultDrmSessionManager(UUID uuid, n.c cVar, q qVar, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, com.google.android.exoplayer2.upstream.g gVar, long j10) {
        a6.a.e(uuid);
        a6.a.b(!e4.c.f8046b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f6508c = uuid;
        this.f6509d = cVar;
        this.f6510e = qVar;
        this.f6511f = hashMap;
        this.f6512g = z10;
        this.f6513h = iArr;
        this.f6514i = z11;
        this.f6516k = gVar;
        this.f6515j = new f(this);
        this.f6517l = new g();
        this.f6528w = 0;
        this.f6519n = new ArrayList();
        this.f6520o = f1.f();
        this.f6521p = f1.f();
        this.f6518m = j10;
    }
}
