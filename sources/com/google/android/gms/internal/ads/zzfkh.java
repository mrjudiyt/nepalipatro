package com.google.android.gms.internal.ads;

import com.facebook.internal.AnalyticsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public enum zzfkh {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    zzd(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO),
    AUDIO("audio");
    
    private final String zzg;

    private zzfkh(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
