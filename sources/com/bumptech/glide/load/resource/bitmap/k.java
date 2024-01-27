package com.bumptech.glide.load.resource.bitmap;

import a3.j;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.bitmap.p;
import com.facebook.internal.NativeProtocol;
import e2.f;
import e2.g;
import e2.h;
import f2.m;
import h2.c;
import i2.e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: Downsampler */
public final class k {

    /* renamed from: f  reason: collision with root package name */
    public static final f<e2.b> f5882f = f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", e2.b.f7991j);

    /* renamed from: g  reason: collision with root package name */
    public static final f<h> f5883g = f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", h.SRGB);
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final f<j> f5884h = j.f5877h;

    /* renamed from: i  reason: collision with root package name */
    public static final f<Boolean> f5885i;

    /* renamed from: j  reason: collision with root package name */
    public static final f<Boolean> f5886j;

    /* renamed from: k  reason: collision with root package name */
    private static final Set<String> f5887k = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: l  reason: collision with root package name */
    private static final b f5888l = new a();

    /* renamed from: m  reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f5889m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: n  reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f5890n = a3.k.f(0);

    /* renamed from: a  reason: collision with root package name */
    private final e f5891a;

    /* renamed from: b  reason: collision with root package name */
    private final DisplayMetrics f5892b;

    /* renamed from: c  reason: collision with root package name */
    private final i2.b f5893c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ImageHeaderParser> f5894d;

    /* renamed from: e  reason: collision with root package name */
    private final o f5895e = o.a();

    /* compiled from: Downsampler */
    class a implements b {
        a() {
        }

        public void a(e eVar, Bitmap bitmap) {
        }

        public void b() {
        }
    }

    /* compiled from: Downsampler */
    public interface b {
        void a(e eVar, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f5885i = f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f5886j = f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public k(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, e eVar, i2.b bVar) {
        this.f5894d = list;
        this.f5892b = (DisplayMetrics) j.d(displayMetrics);
        this.f5891a = (e) j.d(eVar);
        this.f5893c = (i2.b) j.d(bVar);
    }

    private static int a(double d10) {
        int l10 = l(d10);
        int x10 = x(((double) l10) * d10);
        return x((d10 / ((double) (((float) x10) / ((float) l10)))) * ((double) x10));
    }

    private void b(p pVar, e2.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        if (!this.f5895e.e(i10, i11, options, z10, z11)) {
            if (bVar == e2.b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z12 = false;
            try {
                z12 = pVar.d().hasAlpha();
            } catch (IOException unused) {
                if (Log.isLoggable("Downsampler", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header, format ");
                    sb.append(bVar);
                }
            }
            Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, p pVar, b bVar, e eVar, j jVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        double d10;
        ImageHeaderParser.ImageType imageType2 = imageType;
        j jVar2 = jVar;
        int i21 = i11;
        int i22 = i12;
        int i23 = i13;
        int i24 = i14;
        BitmapFactory.Options options2 = options;
        if (i21 <= 0 || i22 <= 0) {
            String str = "x";
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType2);
                sb.append(" with target [");
                sb.append(i23);
                sb.append(str);
                sb.append(i24);
                sb.append("]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i15 = i21;
            i16 = i22;
        } else {
            i16 = i21;
            i15 = i22;
        }
        float b10 = jVar2.b(i16, i15, i23, i24);
        if (b10 > 0.0f) {
            j.g a10 = jVar2.a(i16, i15, i23, i24);
            if (a10 != null) {
                float f10 = (float) i16;
                float f11 = (float) i15;
                int x10 = i16 / x((double) (b10 * f10));
                int x11 = i15 / x((double) (b10 * f11));
                j.g gVar = j.g.MEMORY;
                if (a10 == gVar) {
                    i17 = Math.max(x10, x11);
                } else {
                    i17 = Math.min(x10, x11);
                }
                int i25 = Build.VERSION.SDK_INT;
                String str2 = "x";
                String str3 = "Downsampler";
                if (i25 > 23 || !f5887k.contains(options2.outMimeType)) {
                    int max = Math.max(1, Integer.highestOneBit(i17));
                    if (a10 == gVar && ((float) max) < 1.0f / b10) {
                        max <<= 1;
                    }
                    i18 = max;
                } else {
                    i18 = 1;
                }
                options2.inSampleSize = i18;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i18, 8);
                    i19 = (int) Math.ceil((double) (f10 / min));
                    i20 = (int) Math.ceil((double) (f11 / min));
                    int i26 = i18 / 8;
                    if (i26 > 0) {
                        i19 /= i26;
                        i20 /= i26;
                    }
                } else {
                    if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f12 = (float) i18;
                        i19 = (int) Math.floor((double) (f10 / f12));
                        d10 = Math.floor((double) (f11 / f12));
                    } else if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                        if (i25 >= 24) {
                            float f13 = (float) i18;
                            i19 = Math.round(f10 / f13);
                            i20 = Math.round(f11 / f13);
                        } else {
                            float f14 = (float) i18;
                            i19 = (int) Math.floor((double) (f10 / f14));
                            d10 = Math.floor((double) (f11 / f14));
                        }
                    } else if (i16 % i18 == 0 && i15 % i18 == 0) {
                        i19 = i16 / i18;
                        i20 = i15 / i18;
                    } else {
                        int[] m10 = m(pVar, options2, bVar, eVar);
                        i19 = m10[0];
                        i20 = m10[1];
                    }
                    i20 = (int) d10;
                }
                double b11 = (double) jVar2.b(i19, i20, i23, i24);
                if (i25 >= 19) {
                    options2.inTargetDensity = a(b11);
                    options2.inDensity = l(b11);
                }
                if (s(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable(str3, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculate scaling, source: [");
                    sb2.append(i11);
                    String str4 = str2;
                    sb2.append(str4);
                    sb2.append(i12);
                    sb2.append("], degreesToRotate: ");
                    sb2.append(i10);
                    sb2.append(", target: [");
                    sb2.append(i23);
                    sb2.append(str4);
                    sb2.append(i24);
                    sb2.append("], power of two scaled: [");
                    sb2.append(i19);
                    sb2.append(str4);
                    sb2.append(i20);
                    sb2.append("], exact scale factor: ");
                    sb2.append(b10);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(i18);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(b11);
                    sb2.append(", target density: ");
                    sb2.append(options2.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options2.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i27 = i22;
        String str5 = "x";
        int i28 = i21;
        throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + jVar2 + ", source: [" + i28 + str5 + i27 + "], target: [" + i23 + str5 + i24 + "]");
    }

    private c<Bitmap> e(p pVar, int i10, int i11, g gVar, b bVar) {
        g gVar2 = gVar;
        byte[] bArr = (byte[]) this.f5893c.e(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, byte[].class);
        BitmapFactory.Options k10 = k();
        k10.inTempStorage = bArr;
        e2.b bVar2 = (e2.b) gVar2.c(f5882f);
        h hVar = (h) gVar2.c(f5883g);
        j jVar = (j) gVar2.c(j.f5877h);
        boolean booleanValue = ((Boolean) gVar2.c(f5885i)).booleanValue();
        f fVar = f5886j;
        try {
            return e.e(h(pVar, k10, jVar, bVar2, hVar, gVar2.c(fVar) != null && ((Boolean) gVar2.c(fVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f5891a);
        } finally {
            v(k10);
            this.f5893c.d(bArr);
        }
    }

    private Bitmap h(p pVar, BitmapFactory.Options options, j jVar, e2.b bVar, h hVar, boolean z10, int i10, int i11, boolean z11, b bVar2) {
        int i12;
        int i13;
        k kVar;
        int i14;
        ColorSpace colorSpace;
        int i15;
        int i16;
        BitmapFactory.Options options2 = options;
        b bVar3 = bVar2;
        long b10 = a3.f.b();
        int[] m10 = m(pVar, options2, bVar3, this.f5891a);
        boolean z12 = false;
        int i17 = m10[0];
        int i18 = m10[1];
        String str = options2.outMimeType;
        boolean z13 = (i17 == -1 || i18 == -1) ? false : z10;
        int a10 = pVar.a();
        int e10 = w.e(a10);
        boolean h10 = w.h(a10);
        int i19 = i10;
        if (i19 == Integer.MIN_VALUE) {
            i13 = i11;
            i12 = r(e10) ? i18 : i17;
        } else {
            i13 = i11;
            i12 = i19;
        }
        int i20 = i13 == Integer.MIN_VALUE ? r(e10) ? i17 : i18 : i13;
        ImageHeaderParser.ImageType d10 = pVar.d();
        e eVar = this.f5891a;
        ImageHeaderParser.ImageType imageType = d10;
        c(d10, pVar, bVar2, eVar, jVar, e10, i17, i18, i12, i20, options);
        int i21 = a10;
        String str2 = str;
        int i22 = i18;
        int i23 = i17;
        b bVar4 = bVar3;
        BitmapFactory.Options options3 = options2;
        b(pVar, bVar, z13, h10, options, i12, i20);
        int i24 = Build.VERSION.SDK_INT;
        boolean z14 = i24 >= 19;
        if (options3.inSampleSize == 1 || z14) {
            kVar = this;
            if (kVar.z(imageType)) {
                if (i23 < 0 || i22 < 0 || !z11 || !z14) {
                    float f10 = s(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i25 = options3.inSampleSize;
                    float f11 = (float) i25;
                    float f12 = f10;
                    i16 = Math.round(((float) ((int) Math.ceil((double) (((float) i23) / f11)))) * f12);
                    i15 = Math.round(((float) ((int) Math.ceil((double) (((float) i22) / f11)))) * f12);
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Calculated target [");
                        sb.append(i16);
                        sb.append("x");
                        sb.append(i15);
                        sb.append("] for source [");
                        sb.append(i23);
                        sb.append("x");
                        sb.append(i22);
                        sb.append("], sampleSize: ");
                        sb.append(i25);
                        sb.append(", targetDensity: ");
                        sb.append(options3.inTargetDensity);
                        sb.append(", density: ");
                        sb.append(options3.inDensity);
                        sb.append(", density multiplier: ");
                        sb.append(f12);
                    }
                } else {
                    i16 = i12;
                    i15 = i20;
                }
                if (i16 > 0 && i15 > 0) {
                    y(options3, kVar.f5891a, i16, i15);
                }
            }
        } else {
            kVar = this;
        }
        if (i24 >= 28) {
            if (hVar == h.DISPLAY_P3 && (colorSpace = options3.outColorSpace) != null && colorSpace.isWideGamut()) {
                z12 = true;
            }
            options3.inPreferredColorSpace = ColorSpace.get(z12 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i24 >= 26) {
            options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap i26 = i(pVar, options3, bVar4, kVar.f5891a);
        bVar4.a(kVar.f5891a, i26);
        if (Log.isLoggable("Downsampler", 2)) {
            i14 = i21;
            t(i23, i22, str2, options, i26, i10, i11, b10);
        } else {
            i14 = i21;
        }
        Bitmap bitmap = null;
        if (i26 != null) {
            i26.setDensity(kVar.f5892b.densityDpi);
            bitmap = w.i(kVar.f5891a, i26, i14);
            if (!i26.equals(bitmap)) {
                kVar.f5891a.c(i26);
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.p r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.k.b r6, i2.e r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L_0x000a
            r6.b()
            r4.c()
        L_0x000a:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.w.d()
            r3.lock()
            android.graphics.Bitmap r4 = r4.b(r5)     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.w.d()
            r5.unlock()
            return r4
        L_0x0023:
            r4 = move-exception
            goto L_0x0049
        L_0x0025:
            r3 = move-exception
            java.io.IOException r0 = u(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0023 }
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0048
            r7.c(r1)     // Catch:{ IOException -> 0x0047 }
            r1 = 0
            r5.inBitmap = r1     // Catch:{ IOException -> 0x0047 }
            android.graphics.Bitmap r4 = i(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0047 }
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.w.d()
            r5.unlock()
            return r4
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0048:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0049:
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.w.d()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.k.i(com.bumptech.glide.load.resource.bitmap.p, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.k$b, i2.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (k.class) {
            Queue<BitmapFactory.Options> queue = f5890n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(p pVar, BitmapFactory.Options options, b bVar, e eVar) {
        options.inJustDecodeBounds = true;
        i(pVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean s(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.k.s(android.graphics.BitmapFactory$Options):boolean");
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(j(bitmap));
        sb.append(" from [");
        sb.append(i10);
        sb.append("x");
        sb.append(i11);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(n(options));
        sb.append(" for [");
        sb.append(i12);
        sb.append("x");
        sb.append(i13);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(a3.f.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f5890n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, e eVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f5889m.contains(imageType);
    }

    public c<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, g gVar) {
        return e(new p.b(parcelFileDescriptor, this.f5894d, this.f5893c), i10, i11, gVar, f5888l);
    }

    public c<Bitmap> f(InputStream inputStream, int i10, int i11, g gVar) {
        return g(inputStream, i10, i11, gVar, f5888l);
    }

    public c<Bitmap> g(InputStream inputStream, int i10, int i11, g gVar, b bVar) {
        return e(new p.a(inputStream, this.f5894d, this.f5893c), i10, i11, gVar, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return m.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
