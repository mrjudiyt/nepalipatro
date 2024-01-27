package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import i2.b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k0.a;

/* compiled from: ExifInterfaceImageHeaderParser */
public final class n implements ImageHeaderParser {
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int b(InputStream inputStream, b bVar) {
        int d10 = new a(inputStream).d("Orientation", 1);
        if (d10 == 0) {
            return -1;
        }
        return d10;
    }

    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
