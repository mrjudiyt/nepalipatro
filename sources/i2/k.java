package i2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBitmapPool */
public class k implements e {

    /* renamed from: k  reason: collision with root package name */
    private static final Bitmap.Config f9252k = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    private final l f9253a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Bitmap.Config> f9254b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9255c;

    /* renamed from: d  reason: collision with root package name */
    private final a f9256d;

    /* renamed from: e  reason: collision with root package name */
    private long f9257e;

    /* renamed from: f  reason: collision with root package name */
    private long f9258f;

    /* renamed from: g  reason: collision with root package name */
    private int f9259g;

    /* renamed from: h  reason: collision with root package name */
    private int f9260h;

    /* renamed from: i  reason: collision with root package name */
    private int f9261i;

    /* renamed from: j  reason: collision with root package name */
    private int f9262j;

    /* compiled from: LruBitmapPool */
    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool */
    private static final class b implements a {
        b() {
        }

        public void a(Bitmap bitmap) {
        }

        public void b(Bitmap bitmap) {
        }
    }

    k(long j10, l lVar, Set<Bitmap.Config> set) {
        this.f9255c = j10;
        this.f9257e = j10;
        this.f9253a = lVar;
        this.f9254b = set;
        this.f9256d = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f9252k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f9259g);
        sb.append(", misses=");
        sb.append(this.f9260h);
        sb.append(", puts=");
        sb.append(this.f9261i);
        sb.append(", evictions=");
        sb.append(this.f9262j);
        sb.append(", currentSize=");
        sb.append(this.f9258f);
        sb.append(", maxSize=");
        sb.append(this.f9257e);
        sb.append("\nStrategy=");
        sb.append(this.f9253a);
    }

    private void j() {
        q(this.f9257e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            hashSet.add((Object) null);
        }
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l l() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new n();
        }
        return new c();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap d10;
        f(config);
        d10 = this.f9253a.d(i10, i11, config != null ? config : f9252k);
        if (d10 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f9253a.b(i10, i11, config));
            }
            this.f9260h++;
        } else {
            this.f9259g++;
            this.f9258f -= (long) this.f9253a.e(d10);
            this.f9256d.a(d10);
            p(d10);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f9253a.b(i10, i11, config));
        }
        h();
        return d10;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f9258f > j10) {
            Bitmap a10 = this.f9253a.a();
            if (a10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    i();
                }
                this.f9258f = 0;
                return;
            }
            this.f9256d.a(a10);
            this.f9258f -= (long) this.f9253a.e(a10);
            this.f9262j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f9253a.f(a10));
            }
            h();
            a10.recycle();
        }
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i10);
        }
        if (i10 >= 40 || (Build.VERSION.SDK_INT >= 23 && i10 >= 20)) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    public void b() {
        q(0);
    }

    public synchronized void c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f9253a.e(bitmap)) <= this.f9257e) {
                        if (this.f9254b.contains(bitmap.getConfig())) {
                            int e10 = this.f9253a.e(bitmap);
                            this.f9253a.c(bitmap);
                            this.f9256d.b(bitmap);
                            this.f9261i++;
                            this.f9258f += (long) e10;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Put bitmap in pool=");
                                sb.append(this.f9253a.f(bitmap));
                            }
                            h();
                            j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f9253a.f(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f9254b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        if (m10 == null) {
            return g(i10, i11, config);
        }
        m10.eraseColor(0);
        return m10;
    }

    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        return m10 == null ? g(i10, i11, config) : m10;
    }

    public long n() {
        return this.f9257e;
    }

    public k(long j10) {
        this(j10, l(), k());
    }
}
