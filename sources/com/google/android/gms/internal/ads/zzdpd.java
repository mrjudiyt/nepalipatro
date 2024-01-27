package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdpd implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdpd(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* synthetic */ Object zzb() {
        int i10 = ((zzcxc) this.zzc).zza().zzo.zza;
        if (i10 == 0) {
            throw null;
        } else if (i10 - 1 != 0) {
            return ((zzekg) this.zzb).zzb();
        } else {
            return ((zzekg) this.zza).zzb();
        }
    }
}
