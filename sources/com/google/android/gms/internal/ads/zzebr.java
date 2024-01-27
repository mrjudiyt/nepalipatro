package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzebr implements zzdag, zzcyz, zzcxo {
    private final zzfia zza;
    private final zzfib zzb;
    private final zzcag zzc;

    public zzebr(zzfia zzfia, zzfib zzfib, zzcag zzcag) {
        this.zza = zzfia;
        this.zzb = zzfib;
        this.zzc = zzcag;
    }

    public final void zzbF(zze zze) {
        zzfia zzfia = this.zza;
        zzfia.zza(NativeProtocol.WEB_DIALOG_ACTION, "ftl");
        zzfia.zza("ftl", String.valueOf(zze.zza));
        zzfia.zza("ed", zze.zzc);
        this.zzb.zzb(this.zza);
    }

    public final void zzbr(zzbvg zzbvg) {
        this.zza.zzi(zzbvg.zza);
    }

    public final void zzbs(zzfde zzfde) {
        this.zza.zzh(zzfde, this.zzc);
    }

    public final void zzr() {
        zzfia zzfia = this.zza;
        zzfia.zza(NativeProtocol.WEB_DIALOG_ACTION, "loaded");
        this.zzb.zzb(zzfia);
    }
}
