package com.google.android.exoplayer2.source.dash;

import a6.m0;
import a6.y;
import android.os.Handler;
import android.os.Message;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.u;
import e4.j;
import e4.k;
import i5.f;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k4.a0;
import k4.b0;
import z5.g;

/* compiled from: PlayerEmsgHandler */
public final class e implements Handler.Callback {

    /* renamed from: h  reason: collision with root package name */
    private final z5.b f7257h;

    /* renamed from: i  reason: collision with root package name */
    private final b f7258i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final z4.b f7259j = new z4.b();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Handler f7260k = m0.y(this);

    /* renamed from: l  reason: collision with root package name */
    private final TreeMap<Long, Long> f7261l = new TreeMap<>();

    /* renamed from: m  reason: collision with root package name */
    private k5.c f7262m;

    /* renamed from: n  reason: collision with root package name */
    private long f7263n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7264o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7265p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f7266q;

    /* compiled from: PlayerEmsgHandler */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f7267a;

        /* renamed from: b  reason: collision with root package name */
        public final long f7268b;

        public a(long j10, long j11) {
            this.f7267a = j10;
            this.f7268b = j11;
        }
    }

    /* compiled from: PlayerEmsgHandler */
    public interface b {
        void a();

        void b(long j10);
    }

    /* compiled from: PlayerEmsgHandler */
    public final class c implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final u f7269a;

        /* renamed from: b  reason: collision with root package name */
        private final k f7270b = new k();

        /* renamed from: c  reason: collision with root package name */
        private final x4.e f7271c = new x4.e();

        /* renamed from: d  reason: collision with root package name */
        private long f7272d = -9223372036854775807L;

        c(z5.b bVar) {
            this.f7269a = u.l(bVar);
        }

        private x4.e g() {
            this.f7271c.k();
            if (this.f7269a.S(this.f7270b, this.f7271c, 0, false) != -4) {
                return null;
            }
            this.f7271c.u();
            return this.f7271c;
        }

        private void k(long j10, long j11) {
            e.this.f7260k.sendMessage(e.this.f7260k.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f7269a.K(false)) {
                x4.e g10 = g();
                if (g10 != null) {
                    long j10 = g10.f6471l;
                    x4.a a10 = e.this.f7259j.a(g10);
                    if (a10 != null) {
                        z4.a aVar = (z4.a) a10.d(0);
                        if (e.h(aVar.f13188h, aVar.f13189i)) {
                            m(j10, aVar);
                        }
                    }
                }
            }
            this.f7269a.s();
        }

        private void m(long j10, z4.a aVar) {
            long c10 = e.f(aVar);
            if (c10 != -9223372036854775807L) {
                k(j10, c10);
            }
        }

        public /* synthetic */ void a(y yVar, int i10) {
            a0.b(this, yVar, i10);
        }

        public int b(g gVar, int i10, boolean z10, int i11) {
            return this.f7269a.c(gVar, i10, z10);
        }

        public /* synthetic */ int c(g gVar, int i10, boolean z10) {
            return a0.a(this, gVar, i10, z10);
        }

        public void d(j jVar) {
            this.f7269a.d(jVar);
        }

        public void e(long j10, int i10, int i11, int i12, b0.a aVar) {
            this.f7269a.e(j10, i10, i11, i12, aVar);
            l();
        }

        public void f(y yVar, int i10, int i11) {
            this.f7269a.a(yVar, i10);
        }

        public boolean h(long j10) {
            return e.this.j(j10);
        }

        public void i(f fVar) {
            long j10 = this.f7272d;
            if (j10 == -9223372036854775807L || fVar.f9314h > j10) {
                this.f7272d = fVar.f9314h;
            }
            e.this.m(fVar);
        }

        public boolean j(f fVar) {
            long j10 = this.f7272d;
            return e.this.n(j10 != -9223372036854775807L && j10 < fVar.f9313g);
        }

        public void n() {
            this.f7269a.T();
        }
    }

    public e(k5.c cVar, b bVar, z5.b bVar2) {
        this.f7262m = cVar;
        this.f7258i = bVar;
        this.f7257h = bVar2;
    }

    private Map.Entry<Long, Long> e(long j10) {
        return this.f7261l.ceilingEntry(Long.valueOf(j10));
    }

    /* access modifiers changed from: private */
    public static long f(z4.a aVar) {
        try {
            return m0.x0(m0.D(aVar.f13192l));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f7261l.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f7261l.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f7261l.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f7264o) {
            this.f7265p = true;
            this.f7264o = false;
            this.f7258i.a();
        }
    }

    private void l() {
        this.f7258i.b(this.f7263n);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f7261l.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) it.next().getKey()).longValue() < this.f7262m.f9652h) {
                it.remove();
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (this.f7266q) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f7267a, aVar.f7268b);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j(long j10) {
        k5.c cVar = this.f7262m;
        boolean z10 = false;
        if (!cVar.f9648d) {
            return false;
        }
        if (this.f7265p) {
            return true;
        }
        Map.Entry<Long, Long> e10 = e(cVar.f9652h);
        if (e10 != null && e10.getValue().longValue() < j10) {
            this.f7263n = e10.getKey().longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f7257h);
    }

    /* access modifiers changed from: package-private */
    public void m(f fVar) {
        this.f7264o = true;
    }

    /* access modifiers changed from: package-private */
    public boolean n(boolean z10) {
        if (!this.f7262m.f9648d) {
            return false;
        }
        if (this.f7265p) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f7266q = true;
        this.f7260k.removeCallbacksAndMessages((Object) null);
    }

    public void q(k5.c cVar) {
        this.f7265p = false;
        this.f7263n = -9223372036854775807L;
        this.f7262m = cVar;
        p();
    }
}
