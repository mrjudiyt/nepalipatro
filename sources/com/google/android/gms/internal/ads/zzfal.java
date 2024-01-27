package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfal implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzfal(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    /* renamed from: zza */
    public final zzfai zzb() {
        zzbzw zzbzw;
        Context context = (Context) this.zza.zzb();
        zzfew zzfew = (zzfew) this.zzb.zzb();
        zzffo zzffo = (zzffo) this.zzc.zzb();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgn)).booleanValue()) {
            zzbzw = zzt.zzo().zzh().zzh();
        } else {
            zzbzw = zzt.zzo().zzh().zzi();
        }
        boolean z10 = false;
        if (zzbzw != null && zzbzw.zzh()) {
            z10 = true;
        }
        if (((Integer) zzba.zzc().zzb(zzbci.zzgp)).intValue() > 0) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzgm)).booleanValue() || z10) {
                zzffn zza2 = zzffo.zza(zzffe.Rewarded, context, zzfew, new zzezm(new zzezj()));
                zzezy zzezy = new zzezy(new zzezx());
                zzffa zzffa = zza2.zza;
                zzgad zzgad = zzcbg.zza;
                return new zzezo(zzezy, new zzezu(zzffa, zzgad), zza2.zzb, zza2.zza.zza().zzf, zzgad);
            }
        }
        return new zzezx();
    }
}
