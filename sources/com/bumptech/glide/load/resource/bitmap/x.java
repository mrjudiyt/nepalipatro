package com.bumptech.glide.load.resource.bitmap;

import a3.k;
import android.graphics.Bitmap;
import e2.g;
import e2.i;
import h2.c;

/* compiled from: UnitBitmapDecoder */
public final class x implements i<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder */
    private static final class a implements c<Bitmap> {

        /* renamed from: h  reason: collision with root package name */
        private final Bitmap f5933h;

        a(Bitmap bitmap) {
            this.f5933h = bitmap;
        }

        public void a() {
        }

        public int b() {
            return k.h(this.f5933h);
        }

        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        /* renamed from: d */
        public Bitmap get() {
            return this.f5933h;
        }
    }

    /* renamed from: c */
    public c<Bitmap> a(Bitmap bitmap, int i10, int i11, g gVar) {
        return new a(bitmap);
    }

    /* renamed from: d */
    public boolean b(Bitmap bitmap, g gVar) {
        return true;
    }
}
