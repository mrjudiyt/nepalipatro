package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzein {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    zzein(String str, String str2, int i10, long j10, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = j10;
        this.zze = num;
    }

    public final String toString() {
        String str = this.zza + "." + this.zzc + "." + this.zzd;
        if (!TextUtils.isEmpty(this.zzb)) {
            str = str + "." + this.zzb;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzbA)).booleanValue() || this.zze == null || TextUtils.isEmpty(this.zzb)) {
            return str;
        }
        return str + "." + this.zze;
    }
}
