package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;

/* compiled from: DownsampleStrategy */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f5870a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final j f5871b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final j f5872c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final j f5873d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final j f5874e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f5875f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final j f5876g;

    /* renamed from: h  reason: collision with root package name */
    public static final e2.f<j> f5877h;

    /* renamed from: i  reason: collision with root package name */
    static final boolean f5878i = (Build.VERSION.SDK_INT >= 19);

    /* compiled from: DownsampleStrategy */
    private static class a extends j {
        a() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* compiled from: DownsampleStrategy */
    private static class b extends j {
        b() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i11) / ((float) i13), ((float) i10) / ((float) i12)));
            int i14 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i14 = 0;
            }
            return 1.0f / ((float) (max << i14));
        }
    }

    /* compiled from: DownsampleStrategy */
    private static class c extends j {
        c() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            if (b(i10, i11, i12, i13) == 1.0f) {
                return g.QUALITY;
            }
            return j.f5872c.a(i10, i11, i12, i13);
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, j.f5872c.b(i10, i11, i12, i13));
        }
    }

    /* compiled from: DownsampleStrategy */
    private static class d extends j {
        d() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
        }
    }

    /* compiled from: DownsampleStrategy */
    private static class e extends j {
        e() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            if (j.f5878i) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            if (j.f5878i) {
                return Math.min(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* compiled from: DownsampleStrategy */
    private static class f extends j {
        f() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f5874e = dVar;
        f5876g = dVar;
        f5877h = e2.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
