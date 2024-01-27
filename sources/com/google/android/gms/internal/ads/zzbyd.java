package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbyd {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzbyy zzd;

    private zzbyd() {
    }

    /* synthetic */ zzbyd(zzbyc zzbyc) {
    }

    public final zzbyd zza(zzg zzg) {
        this.zzc = zzg;
        return this;
    }

    public final zzbyd zzb(Context context) {
        Objects.requireNonNull(context);
        this.zza = context;
        return this;
    }

    public final zzbyd zzc(Clock clock) {
        Objects.requireNonNull(clock);
        this.zzb = clock;
        return this;
    }

    public final zzbyd zzd(zzbyy zzbyy) {
        this.zzd = zzbyy;
        return this;
    }

    public final zzbyz zze() {
        zzhbk.zzc(this.zza, Context.class);
        zzhbk.zzc(this.zzb, Clock.class);
        zzhbk.zzc(this.zzc, zzg.class);
        zzhbk.zzc(this.zzd, zzbyy.class);
        return new zzbyf(this.zza, this.zzb, this.zzc, this.zzd, (zzbye) null);
    }
}
