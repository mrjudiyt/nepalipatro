package com.bumptech.glide.load.resource.bitmap;

import a3.j;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import e2.g;
import e2.i;
import h2.c;

/* compiled from: BitmapDrawableDecoder */
public class a<DataType> implements i<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final i<DataType, Bitmap> f5857a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f5858b;

    public a(Resources resources, i<DataType, Bitmap> iVar) {
        this.f5858b = (Resources) j.d(resources);
        this.f5857a = (i) j.d(iVar);
    }

    public c<BitmapDrawable> a(DataType datatype, int i10, int i11, g gVar) {
        return r.e(this.f5858b, this.f5857a.a(datatype, i10, i11, gVar));
    }

    public boolean b(DataType datatype, g gVar) {
        return this.f5857a.b(datatype, gVar);
    }
}
