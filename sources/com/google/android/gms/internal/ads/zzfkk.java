package com.google.android.gms.internal.ads;

import com.google.firebase.ktx.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public enum zzfkk {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED(BuildConfig.VERSION_NAME),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    
    private final String zzj;

    private zzfkk(String str) {
        this.zzj = str;
    }

    public final String toString() {
        return this.zzj;
    }
}
