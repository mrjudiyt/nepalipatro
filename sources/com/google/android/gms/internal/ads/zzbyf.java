package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbyf extends zzbyz {
    private final Clock zzb;
    private final zzbyf zzc = this;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;
    private final zzhbp zzk;

    /* synthetic */ zzbyf(Context context, Clock clock, zzg zzg2, zzbyy zzbyy, zzbye zzbye) {
        this.zzb = clock;
        zzhbc zza = zzhbd.zza(context);
        this.zzd = zza;
        zzhbc zza2 = zzhbd.zza(zzg2);
        this.zze = zza2;
        zzhbc zza3 = zzhbd.zza(zzbyy);
        this.zzf = zza3;
        this.zzg = zzhbb.zzc(new zzbxx(zza, zza2, zza3));
        zzhbc zza4 = zzhbd.zza(clock);
        this.zzh = zza4;
        zzhbp zzc2 = zzhbb.zzc(new zzbxz(zza4, zza2, zza3));
        this.zzi = zzc2;
        zzbyb zzbyb = new zzbyb(zza4, zzc2);
        this.zzj = zzbyb;
        this.zzk = zzhbb.zzc(new zzbze(zza, zzbyb));
    }

    /* access modifiers changed from: package-private */
    public final zzbxw zza() {
        return (zzbxw) this.zzg.zzb();
    }

    /* access modifiers changed from: package-private */
    public final zzbya zzb() {
        return new zzbya(this.zzb, (zzbxy) this.zzi.zzb());
    }

    /* access modifiers changed from: package-private */
    public final zzbzd zzc() {
        return (zzbzd) this.zzk.zzb();
    }
}
