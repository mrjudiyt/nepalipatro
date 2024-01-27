package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzbgi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    Drawable getMainImage();

    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(Drawable drawable);

    zzbgi zza();

    boolean zzb();
}
