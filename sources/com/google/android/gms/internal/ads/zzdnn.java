package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdnn extends zzbge {
    private final String zza;
    private final zzdje zzb;
    private final zzdjj zzc;

    public zzdnn(String str, zzdje zzdje, zzdjj zzdjj) {
        this.zza = str;
        this.zzb = zzdje;
        this.zzc = zzdjj;
    }

    public final Bundle zzb() {
        return this.zzc.zzd();
    }

    public final zzdq zzc() {
        return this.zzc.zzj();
    }

    public final zzbfg zzd() {
        return this.zzc.zzl();
    }

    public final zzbfo zze() {
        return this.zzc.zzo();
    }

    public final IObjectWrapper zzf() {
        return this.zzc.zzv();
    }

    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzh() {
        return this.zzc.zzx();
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

    public final List zzm() {
        return this.zzc.zzG();
    }

    public final void zzn() {
        this.zzb.zzb();
    }

    public final void zzo(Bundle bundle) {
        this.zzb.zzE(bundle);
    }

    public final void zzp(Bundle bundle) {
        this.zzb.zzJ(bundle);
    }

    public final boolean zzq(Bundle bundle) {
        return this.zzb.zzW(bundle);
    }
}
