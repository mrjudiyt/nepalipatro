package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcwq;
import com.google.android.gms.internal.ads.zzfhl;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzhbc;
import com.google.android.gms.internal.ads.zzhbp;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzai implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzai(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfhr) this.zza.zzb()).zzb(zzfhl.GENERATE_SIGNALS, ((zzcwq) this.zzc).zzb().zzc()).zzf(((zzal) this.zzb).zzb()).zzi((long) ((Integer) zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS).zza();
    }
}
