package com.bumptech.glide.load.resource.bitmap;

import a3.a;
import android.graphics.Bitmap;
import e2.i;
import h2.c;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder */
public class g implements i<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final k f5867a;

    public g(k kVar) {
        this.f5867a = kVar;
    }

    /* renamed from: c */
    public c<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, e2.g gVar) {
        return this.f5867a.f(a.f(byteBuffer), i10, i11, gVar);
    }

    /* renamed from: d */
    public boolean b(ByteBuffer byteBuffer, e2.g gVar) {
        return this.f5867a.q(byteBuffer);
    }
}
