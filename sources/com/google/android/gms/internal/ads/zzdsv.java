package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdsv implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ zzdsw zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdsv(zzdsw zzdsw, String str) {
        this.zza = zzdsw;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zzd(this.zzb, sharedPreferences, str);
    }
}
