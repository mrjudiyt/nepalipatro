package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdir implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzdir(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcqb((Executor) this.zzb.zzb(), new zzcpn((Context) this.zzc.zzb(), (zzaus) this.zza.zzb()), (Clock) this.zzd.zzb());
    }
}
