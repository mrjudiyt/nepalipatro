package com.google.android.gms.internal.ads;

import com.facebook.internal.AnalyticsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public enum zzfkf {
    HTML("html"),
    NATIVE(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE),
    JAVASCRIPT("javascript");
    
    private final String zze;

    private zzfkf(String str) {
        this.zze = str;
    }

    public final String toString() {
        return this.zze;
    }
}
