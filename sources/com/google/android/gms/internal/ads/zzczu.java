package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzczu extends zzdcz implements zzcyf, zzczk {
    private final zzfcr zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzczu(Set set, zzfcr zzfcr) {
        super(set);
        this.zzb = zzfcr;
    }

    private final void zzb() {
        zzs zzs;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhC)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzs = this.zzb.zzag) != null && zzs.zza == 3) {
            zzt(new zzczt(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzczw zzczw) {
        zzczw.zzh(this.zzb.zzag);
    }

    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    public final void zzq() {
        int i10 = this.zzb.zzb;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zzb();
        }
    }
}
