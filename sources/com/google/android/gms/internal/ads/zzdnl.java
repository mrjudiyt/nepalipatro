package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdnl extends zzbgc {
    private final String zza;
    private final zzdje zzb;
    private final zzdjj zzc;

    public zzdnl(String str, zzdje zzdje, zzdjj zzdjj) {
        this.zza = str;
        this.zzb = zzdje;
        this.zzc = zzdjj;
    }

    public final double zzb() {
        return this.zzc.zza();
    }

    public final Bundle zzc() {
        return this.zzc.zzd();
    }

    public final zzdq zzd() {
        return this.zzc.zzj();
    }

    public final zzbfg zze() {
        return this.zzc.zzl();
    }

    public final zzbfo zzf() {
        return this.zzc.zzn();
    }

    public final IObjectWrapper zzg() {
        return this.zzc.zzv();
    }

    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzi() {
        return this.zzc.zzy();
    }

    public final String zzj() {
        return this.zzc.zzz();
    }

    public final String zzk() {
        return this.zzc.zzB();
    }

    public final String zzl() {
        return this.zza;
    }

    public final String zzm() {
        return this.zzc.zzD();
    }

    public final String zzn() {
        return this.zzc.zzE();
    }

    public final List zzo() {
        return this.zzc.zzG();
    }

    public final void zzp() {
        this.zzb.zzb();
    }

    public final void zzq(Bundle bundle) {
        this.zzb.zzE(bundle);
    }

    public final void zzr(Bundle bundle) {
        this.zzb.zzJ(bundle);
    }

    public final boolean zzs(Bundle bundle) {
        return this.zzb.zzW(bundle);
    }
}
