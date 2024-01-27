package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcix implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcix(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    /* renamed from: zza */
    public final zzbvr zzb() {
        Context zza2 = ((zzcic) this.zza).zza();
        zzfjh zzfjh = (zzfjh) this.zzb.zzb();
        zzboa zzb2 = zzt.zzf().zzb(zza2, zzcaz.zza(), zzfjh);
        zzbnu zzbnu = zzbnx.zza;
        zzb2.zza("google.afma.request.getAdDictionary", zzbnu, zzbnu);
        return new zzbvq(zza2, zzt.zzf().zzb(zza2, zzcaz.zza(), zzfjh).zza("google.afma.sdkConstants.getSdkConstants", zzbnu, zzbnu));
    }
}
