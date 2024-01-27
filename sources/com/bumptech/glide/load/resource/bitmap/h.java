package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import e2.g;
import e2.i;
import h2.c;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder */
public final class h implements i<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final d f5868a = new d();

    /* renamed from: c */
    public c<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, g gVar) {
        return this.f5868a.a(ImageDecoder.createSource(byteBuffer), i10, i11, gVar);
    }

    /* renamed from: d */
    public boolean b(ByteBuffer byteBuffer, g gVar) {
        return true;
    }
}
