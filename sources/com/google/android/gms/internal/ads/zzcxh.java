package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcxh implements zzhbc {
    private final zzcxg zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzcxh(zzcxg zzcxg, zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4) {
        this.zza = zzcxg;
        this.zzb = zzhbp;
        this.zzc = zzhbp2;
        this.zzd = zzhbp3;
        this.zze = zzhbp4;
    }

    public final /* synthetic */ Object zzb() {
        String str;
        Context context = (Context) this.zzb.zzb();
        zzcaz zza2 = ((zzcio) this.zzc).zza();
        zzfcr zza3 = ((zzctn) this.zzd).zza();
        zzbxq zzbxq = new zzbxq();
        zzbxr zzbxr = zza3.zzC;
        if (zzbxr == null) {
            return null;
        }
        zzfcx zzfcx = zza3.zzu;
        if (zzfcx == null) {
            str = null;
        } else {
            str = zzfcx.zzb;
        }
        return new zzbxp(context, zza2, zzbxr, str, zzbxq);
    }
}
