package com.google.android.gms.internal.ads;

import com.facebook.internal.AnalyticsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public enum zzeeo {
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    zzc(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    
    private final String zze;

    private zzeeo(String str) {
        this.zze = str;
    }

    public final String toString() {
        return this.zze;
    }
}
