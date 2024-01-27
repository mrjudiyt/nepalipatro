package com.bumptech.glide.load.resource.bitmap;

import a3.a;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import e2.g;
import e2.i;
import h2.c;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder */
public final class q implements i<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final d f5912a = new d();

    /* renamed from: c */
    public c<Bitmap> a(InputStream inputStream, int i10, int i11, g gVar) {
        return this.f5912a.a(ImageDecoder.createSource(a.b(inputStream)), i10, i11, gVar);
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, g gVar) {
        return true;
    }
}
