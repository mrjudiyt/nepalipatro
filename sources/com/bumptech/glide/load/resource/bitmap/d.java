package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import h2.c;
import i2.e;
import i2.f;
import n2.a;

/* compiled from: BitmapImageDecoderResourceDecoder */
public final class d extends a<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    private final e f5864b = new f();

    /* access modifiers changed from: protected */
    public c<Bitmap> c(ImageDecoder.Source source, int i10, int i11, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(decodeBitmap.getWidth());
            sb.append("x");
            sb.append(decodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i10);
            sb.append("x");
            sb.append(i11);
            sb.append("]");
        }
        return new e(decodeBitmap, this.f5864b);
    }
}
