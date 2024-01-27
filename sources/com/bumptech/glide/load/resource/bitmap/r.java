package com.bumptech.glide.load.resource.bitmap;

import a3.j;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import h2.b;
import h2.c;

/* compiled from: LazyBitmapDrawableResource */
public final class r implements c<BitmapDrawable>, b {

    /* renamed from: h  reason: collision with root package name */
    private final Resources f5913h;

    /* renamed from: i  reason: collision with root package name */
    private final c<Bitmap> f5914i;

    private r(Resources resources, c<Bitmap> cVar) {
        this.f5913h = (Resources) j.d(resources);
        this.f5914i = (c) j.d(cVar);
    }

    public static c<BitmapDrawable> e(Resources resources, c<Bitmap> cVar) {
        if (cVar == null) {
            return null;
        }
        return new r(resources, cVar);
    }

    public void a() {
        this.f5914i.a();
    }

    public int b() {
        return this.f5914i.b();
    }

    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    /* renamed from: d */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f5913h, this.f5914i.get());
    }

    public void initialize() {
        c<Bitmap> cVar = this.f5914i;
        if (cVar instanceof b) {
            ((b) cVar).initialize();
        }
    }
}
