package r2;

import a3.j;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.h;
import e2.k;
import i2.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifFrameLoader */
class g {

    /* renamed from: a  reason: collision with root package name */
    private final d2.a f10837a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f10838b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f10839c;

    /* renamed from: d  reason: collision with root package name */
    final h f10840d;

    /* renamed from: e  reason: collision with root package name */
    private final e f10841e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10842f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10843g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10844h;

    /* renamed from: i  reason: collision with root package name */
    private com.bumptech.glide.g<Bitmap> f10845i;

    /* renamed from: j  reason: collision with root package name */
    private a f10846j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10847k;

    /* renamed from: l  reason: collision with root package name */
    private a f10848l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f10849m;

    /* renamed from: n  reason: collision with root package name */
    private k<Bitmap> f10850n;

    /* renamed from: o  reason: collision with root package name */
    private a f10851o;

    /* renamed from: p  reason: collision with root package name */
    private d f10852p;

    /* renamed from: q  reason: collision with root package name */
    private int f10853q;

    /* renamed from: r  reason: collision with root package name */
    private int f10854r;

    /* renamed from: s  reason: collision with root package name */
    private int f10855s;

    /* compiled from: GifFrameLoader */
    static class a extends x2.a<Bitmap> {

        /* renamed from: k  reason: collision with root package name */
        private final Handler f10856k;

        /* renamed from: l  reason: collision with root package name */
        final int f10857l;

        /* renamed from: m  reason: collision with root package name */
        private final long f10858m;

        /* renamed from: n  reason: collision with root package name */
        private Bitmap f10859n;

        a(Handler handler, int i10, long j10) {
            this.f10856k = handler;
            this.f10857l = i10;
            this.f10858m = j10;
        }

        /* access modifiers changed from: package-private */
        public Bitmap d() {
            return this.f10859n;
        }

        /* renamed from: e */
        public void b(Bitmap bitmap, y2.b<? super Bitmap> bVar) {
            this.f10859n = bitmap;
            this.f10856k.sendMessageAtTime(this.f10856k.obtainMessage(1, this), this.f10858m);
        }

        public void j(Drawable drawable) {
            this.f10859n = null;
        }
    }

    /* compiled from: GifFrameLoader */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader */
    private class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                g.this.f10840d.k((a) message.obj);
                return false;
            }
        }
    }

    /* compiled from: GifFrameLoader */
    interface d {
        void a();
    }

    g(com.bumptech.glide.b bVar, d2.a aVar, int i10, int i11, k<Bitmap> kVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, (Handler) null, i(com.bumptech.glide.b.t(bVar.h()), i10, i11), kVar, bitmap);
    }

    private static e2.e g() {
        return new z2.b(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.g<Bitmap> i(h hVar, int i10, int i11) {
        return hVar.e().a(((w2.h) ((w2.h) w2.h.Y(h2.a.f8937b).W(true)).R(true)).K(i10, i11));
    }

    private void l() {
        if (this.f10842f && !this.f10843g) {
            if (this.f10844h) {
                j.a(this.f10851o == null, "Pending target must be null when starting from the first frame");
                this.f10837a.f();
                this.f10844h = false;
            }
            a aVar = this.f10851o;
            if (aVar != null) {
                this.f10851o = null;
                m(aVar);
                return;
            }
            this.f10843g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f10837a.d());
            this.f10837a.b();
            this.f10848l = new a(this.f10838b, this.f10837a.g(), uptimeMillis);
            this.f10845i.a(w2.h.Z(g())).j0(this.f10837a).f0(this.f10848l);
        }
    }

    private void n() {
        Bitmap bitmap = this.f10849m;
        if (bitmap != null) {
            this.f10841e.c(bitmap);
            this.f10849m = null;
        }
    }

    private void p() {
        if (!this.f10842f) {
            this.f10842f = true;
            this.f10847k = false;
            l();
        }
    }

    private void q() {
        this.f10842f = false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f10839c.clear();
        n();
        q();
        a aVar = this.f10846j;
        if (aVar != null) {
            this.f10840d.k(aVar);
            this.f10846j = null;
        }
        a aVar2 = this.f10848l;
        if (aVar2 != null) {
            this.f10840d.k(aVar2);
            this.f10848l = null;
        }
        a aVar3 = this.f10851o;
        if (aVar3 != null) {
            this.f10840d.k(aVar3);
            this.f10851o = null;
        }
        this.f10837a.clear();
        this.f10847k = true;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f10837a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.f10846j;
        return aVar != null ? aVar.d() : this.f10849m;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        a aVar = this.f10846j;
        if (aVar != null) {
            return aVar.f10857l;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Bitmap e() {
        return this.f10849m;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f10837a.c();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f10855s;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f10837a.h() + this.f10853q;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f10854r;
    }

    /* access modifiers changed from: package-private */
    public void m(a aVar) {
        d dVar = this.f10852p;
        if (dVar != null) {
            dVar.a();
        }
        this.f10843g = false;
        if (this.f10847k) {
            this.f10838b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f10842f) {
            this.f10851o = aVar;
        } else {
            if (aVar.d() != null) {
                n();
                a aVar2 = this.f10846j;
                this.f10846j = aVar;
                for (int size = this.f10839c.size() - 1; size >= 0; size--) {
                    this.f10839c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f10838b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [e2.k, e2.k<android.graphics.Bitmap>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(e2.k<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            java.lang.Object r0 = a3.j.d(r3)
            e2.k r0 = (e2.k) r0
            r2.f10850n = r0
            java.lang.Object r0 = a3.j.d(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f10849m = r0
            com.bumptech.glide.g<android.graphics.Bitmap> r0 = r2.f10845i
            w2.h r1 = new w2.h
            r1.<init>()
            w2.a r3 = r1.T(r3)
            com.bumptech.glide.g r3 = r0.a(r3)
            r2.f10845i = r3
            int r3 = a3.k.h(r4)
            r2.f10853q = r3
            int r3 = r4.getWidth()
            r2.f10854r = r3
            int r3 = r4.getHeight()
            r2.f10855s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.g.o(e2.k, android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: package-private */
    public void r(b bVar) {
        if (this.f10847k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f10839c.contains(bVar)) {
            boolean isEmpty = this.f10839c.isEmpty();
            this.f10839c.add(bVar);
            if (isEmpty) {
                p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    public void s(b bVar) {
        this.f10839c.remove(bVar);
        if (this.f10839c.isEmpty()) {
            q();
        }
    }

    g(e eVar, h hVar, d2.a aVar, Handler handler, com.bumptech.glide.g<Bitmap> gVar, k<Bitmap> kVar, Bitmap bitmap) {
        this.f10839c = new ArrayList();
        this.f10840d = hVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f10841e = eVar;
        this.f10838b = handler;
        this.f10845i = gVar;
        this.f10837a = aVar;
        o(kVar, bitmap);
    }
}
