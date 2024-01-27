package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzezh implements zzfza {
    public final /* synthetic */ zzezj zza;
    public final /* synthetic */ zzffj zzb;
    public final /* synthetic */ zzcue zzc;

    public /* synthetic */ zzezh(zzezj zzezj, zzffj zzffj, zzcue zzcue) {
        this.zza = zzezj;
        this.zzb = zzffj;
        this.zzc = zzcue;
    }

    public final e zza(Object obj) {
        zzfde zzfde = (zzfde) obj;
        this.zzb.zzb = zzfde;
        Iterator it = zzfde.zzb.zza.iterator();
        boolean z10 = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((zzfcr) it.next()).zza.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z10 = true;
                    }
                }
            } else if (z10) {
                return this.zzc.zzi(zzfzt.zzh(zzfde));
            }
        }
        return zzfzt.zzh((Object) null);
    }
}
