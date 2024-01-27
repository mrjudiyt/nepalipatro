package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzenu implements zzetw {
    private final zzgad zza;
    private final zzfdn zzb;
    private final zzfea zzc;

    zzenu(zzgad zzgad, zzfdn zzfdn, zzfea zzfea) {
        this.zza = zzgad;
        this.zzb = zzfdn;
        this.zzc = zzfea;
    }

    public final int zza() {
        return 5;
    }

    public final e zzb() {
        return this.zza.zzb(new zzent(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzenv zzc() {
        String str = null;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhf)).booleanValue() && "requester_type_2".equals(zzf.zzb(this.zzb.zzd))) {
            str = zzfea.zza();
        }
        return new zzenv(str);
    }
}
