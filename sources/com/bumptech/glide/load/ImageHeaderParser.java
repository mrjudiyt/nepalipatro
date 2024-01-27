package com.bumptech.glide.load;

import i2.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: h  reason: collision with root package name */
        private final boolean f5634h;

        private ImageType(boolean z10) {
            this.f5634h = z10;
        }

        public boolean hasAlpha() {
            return this.f5634h;
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(InputStream inputStream, b bVar);

    ImageType c(InputStream inputStream);
}
