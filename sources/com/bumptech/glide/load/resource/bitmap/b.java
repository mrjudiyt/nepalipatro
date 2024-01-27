package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import e2.c;
import e2.g;
import e2.j;
import i2.e;
import java.io.File;

/* compiled from: BitmapDrawableEncoder */
public class b implements j<BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final e f5859a;

    /* renamed from: b  reason: collision with root package name */
    private final j<Bitmap> f5860b;

    public b(e eVar, j<Bitmap> jVar) {
        this.f5859a = eVar;
        this.f5860b = jVar;
    }

    public c b(g gVar) {
        return this.f5860b.b(gVar);
    }

    /* renamed from: c */
    public boolean a(h2.c<BitmapDrawable> cVar, File file, g gVar) {
        return this.f5860b.a(new e(cVar.get().getBitmap(), this.f5859a), file, gVar);
    }
}
