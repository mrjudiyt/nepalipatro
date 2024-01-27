package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfdx {
    private final zzfcr zza;
    private final zzfcv zzb;
    private final zzedo zzc;
    private final zzfjx zzd;
    private final zzfje zze;
    private final zzcou zzf;

    public zzfdx(zzedo zzedo, zzfjx zzfjx, zzfcr zzfcr, zzfcv zzfcv, zzcou zzcou, zzfje zzfje) {
        this.zza = zzfcr;
        this.zzb = zzfcv;
        this.zzc = zzedo;
        this.zzd = zzfjx;
        this.zzf = zzcou;
        this.zze = zzfje;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i10) {
        if (!this.zza.zzak) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzedq(zzt.zzB().currentTimeMillis(), this.zzb.zzb, str, i10));
    }

    public final void zzc(List list, int i10) {
        e eVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzju)).booleanValue()) {
                eVar = this.zzf.zzc(str, zzay.zze());
            } else {
                eVar = zzfzt.zzh(str);
            }
            zzfzt.zzr(eVar, new zzfdw(this, i10), zzcbg.zza);
        }
    }
}
