package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdpf implements zzhbc {
    private final zzhbp zza;

    public zzdpf(zzhbp zzhbp) {
        this.zza = zzhbp;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzayf zzayf;
        if (((zzcxc) this.zza).zza().zzo.zza == 3) {
            zzayf = zzayf.REWARDED_INTERSTITIAL;
        } else {
            zzayf = zzayf.REWARD_BASED_VIDEO_AD;
        }
        zzhbk.zzb(zzayf);
        return zzayf;
    }
}
