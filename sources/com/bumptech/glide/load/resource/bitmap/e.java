package com.bumptech.glide.load.resource.bitmap;

import a3.j;
import a3.k;
import android.graphics.Bitmap;
import h2.b;
import h2.c;

/* compiled from: BitmapResource */
public class e implements c<Bitmap>, b {

    /* renamed from: h  reason: collision with root package name */
    private final Bitmap f5865h;

    /* renamed from: i  reason: collision with root package name */
    private final i2.e f5866i;

    public e(Bitmap bitmap, i2.e eVar) {
        this.f5865h = (Bitmap) j.e(bitmap, "Bitmap must not be null");
        this.f5866i = (i2.e) j.e(eVar, "BitmapPool must not be null");
    }

    public static e e(Bitmap bitmap, i2.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, eVar);
    }

    public void a() {
        this.f5866i.c(this.f5865h);
    }

    public int b() {
        return k.h(this.f5865h);
    }

    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    /* renamed from: d */
    public Bitmap get() {
        return this.f5865h;
    }

    public void initialize() {
        this.f5865h.prepareToDraw();
    }
}
