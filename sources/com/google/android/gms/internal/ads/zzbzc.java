package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbzc implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbzd zza;
    private final String zzb;

    public zzbzc(zzbzd zzbzd, String str) {
        this.zza = zzbzd;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzbzb zzbzb : this.zza.zzb) {
                zzbzb.zza.zzb(zzbzb.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
