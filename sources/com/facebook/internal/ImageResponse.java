package com.facebook.internal;

import android.graphics.Bitmap;
import kotlin.jvm.internal.m;

/* compiled from: ImageResponse.kt */
public final class ImageResponse {
    private final Bitmap bitmap;
    private final Exception error;
    private final boolean isCachedRedirect;
    private final ImageRequest request;

    public ImageResponse(ImageRequest imageRequest, Exception exc, boolean z10, Bitmap bitmap2) {
        m.f(imageRequest, "request");
        this.request = imageRequest;
        this.error = exc;
        this.isCachedRedirect = z10;
        this.bitmap = bitmap2;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Exception getError() {
        return this.error;
    }

    public final ImageRequest getRequest() {
        return this.request;
    }

    public final boolean isCachedRedirect() {
        return this.isCachedRedirect;
    }
}
