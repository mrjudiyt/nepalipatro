package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import e2.f;
import e2.g;
import e2.j;
import i2.b;

/* compiled from: BitmapEncoder */
public class c implements j<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    public static final f<Integer> f5861b = f.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c  reason: collision with root package name */
    public static final f<Bitmap.CompressFormat> f5862c = f.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a  reason: collision with root package name */
    private final b f5863a;

    public c(b bVar) {
        this.f5863a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, g gVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) gVar.c(f5862c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public e2.c b(g gVar) {
        return e2.c.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:36|37)|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00af */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[SYNTHETIC, Splitter:B:36:0x00ac] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(h2.c<android.graphics.Bitmap> r9, java.io.File r10, e2.g r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.d(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            b3.b.c(r4, r2, r3, r1)
            long r2 = a3.f.b()     // Catch:{ all -> 0x00b0 }
            e2.f<java.lang.Integer> r4 = f5861b     // Catch:{ all -> 0x00b0 }
            java.lang.Object r4 = r11.c(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00b0 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00b0 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0058 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0058 }
            i2.b r10 = r8.f5863a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            if (r10 == 0) goto L_0x0045
            f2.c r10 = new f2.c     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            i2.b r6 = r8.f5863a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r6 = r10
            goto L_0x0046
        L_0x0045:
            r6 = r7
        L_0x0046:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x0058 }
            r6.close()     // Catch:{ IOException -> 0x0058 }
            r5 = 1
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x0051:
            r9 = move-exception
            r6 = r7
            goto L_0x00aa
        L_0x0054:
            r6 = r7
            goto L_0x0058
        L_0x0056:
            r9 = move-exception
            goto L_0x00aa
        L_0x0058:
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0060
            goto L_0x004d
        L_0x0060:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00b0 }
            if (r10 == 0) goto L_0x00a6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r10.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "Compressed with type: "
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            r10.append(r1)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = " of size "
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            int r0 = a3.k.h(r9)     // Catch:{ all -> 0x00b0 }
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = " in "
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            double r0 = a3.f.a(r2)     // Catch:{ all -> 0x00b0 }
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = ", options format: "
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            e2.f<android.graphics.Bitmap$CompressFormat> r0 = f5862c     // Catch:{ all -> 0x00b0 }
            java.lang.Object r11 = r11.c(r0)     // Catch:{ all -> 0x00b0 }
            r10.append(r11)     // Catch:{ all -> 0x00b0 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00b0 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00b0 }
            r10.append(r9)     // Catch:{ all -> 0x00b0 }
        L_0x00a6:
            b3.b.d()
            return r5
        L_0x00aa:
            if (r6 == 0) goto L_0x00af
            r6.close()     // Catch:{ IOException -> 0x00af }
        L_0x00af:
            throw r9     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r9 = move-exception
            b3.b.d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.c.a(h2.c, java.io.File, e2.g):boolean");
    }
}
