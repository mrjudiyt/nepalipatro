package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzejx implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzejx(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejw((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzdpc) this.zzc.zzb());
    }
}
