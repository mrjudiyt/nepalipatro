package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbya {
    private final Clock zza;
    private final zzbxy zzb;

    zzbya(Clock clock, zzbxy zzbxy) {
        this.zza = clock;
        this.zzb = zzbxy;
    }

    public static zzbya zza(Context context) {
        return zzbyz.zzd(context).zzb();
    }

    public final void zzb(int i10, long j10) {
        this.zzb.zzb(i10, j10);
    }

    public final void zzc() {
        this.zzb.zza();
    }

    public final void zzd(zzff zzff) {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }

    public final void zze() {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }
}
