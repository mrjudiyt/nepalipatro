package com.google.android.gms.internal.ads;

import com.google.firebase.ktx.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public enum zzeep {
    BEGIN_TO_RENDER("beginToRender"),
    DEFINED_BY_JAVASCRIPT("definedByJavascript"),
    ONE_PIXEL("onePixel"),
    UNSPECIFIED(BuildConfig.VERSION_NAME);
    
    private final String zzf;

    private zzeep(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
