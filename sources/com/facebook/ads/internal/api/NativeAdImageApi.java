package com.facebook.ads.internal.api;

import androidx.annotation.Keep;

@Keep
public interface NativeAdImageApi {
    int getHeight();

    String getUrl();

    int getWidth();
}
