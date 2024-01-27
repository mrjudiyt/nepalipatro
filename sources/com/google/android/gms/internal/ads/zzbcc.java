package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbcc {
    public static final SharedPreferences zza(Context context) {
        return context.getSharedPreferences("google_ads_flags", 0);
    }
}
