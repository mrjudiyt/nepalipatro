package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdns extends zzbhk {
    private final String zza;
    private final zzdje zzb;
    private final zzdjj zzc;
    private final zzdso zzd;

    public zzdns(String str, zzdje zzdje, zzdjj zzdjj, zzdso zzdso) {
        this.zza = str;
        this.zzb = zzdje;
        this.zzc = zzdjj;
        this.zzd = zzdso;
    }

    public final void zzA() {
        this.zzb.zzF();
    }

    public final void zzB(Bundle bundle) {
        this.zzb.zzJ(bundle);
    }

    public final void zzC() {
        this.zzb.zzL();
    }

    public final void zzD(zzcs zzcs) {
        this.zzb.zzM(zzcs);
    }

    public final void zzE(zzdg zzdg) {
        try {
            if (!zzdg.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e10) {
            zzcat.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzb.zzN(zzdg);
    }

    public final void zzF(zzbhi zzbhi) {
        this.zzb.zzO(zzbhi);
    }

    public final boolean zzG() {
        return this.zzb.zzT();
    }

    public final boolean zzH() {
        return !this.zzc.zzH().isEmpty() && this.zzc.zzk() != null;
    }

    public final boolean zzI(Bundle bundle) {
        return this.zzb.zzW(bundle);
    }

    public final double zze() {
        return this.zzc.zza();
    }

    public final Bundle zzf() {
        return this.zzc.zzd();
    }

    public final zzdn zzg() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzgJ)).booleanValue()) {
            return null;
        }
        return this.zzb.zzl();
    }

    public final zzdq zzh() {
        return this.zzc.zzj();
    }

    public final zzbfg zzi() {
        return this.zzc.zzl();
    }

    public final zzbfl zzj() {
        return this.zzb.zzc().zza();
    }

    public final zzbfo zzk() {
        return this.zzc.zzn();
    }

    public final IObjectWrapper zzl() {
        return this.zzc.zzv();
    }

    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzn() {
        return this.zzc.zzx();
    }

    public final String zzo() {
        return this.zzc.zzy();
    }

    public final String zzp() {
        return this.zzc.zzz();
    }

    public final String zzq() {
        return this.zzc.zzB();
    }

    public final String zzr() {
        return this.zza;
    }

    public final String zzs() {
        return this.zzc.zzD();
    }

    public final String zzt() {
        return this.zzc.zzE();
    }

    public final List zzu() {
        return this.zzc.zzG();
    }

    public final List zzv() {
        if (zzH()) {
            return this.zzc.zzH();
        }
        return Collections.emptyList();
    }

    public final void zzw() {
        this.zzb.zzt();
    }

    public final void zzx() {
        this.zzb.zzb();
    }

    public final void zzy(zzcw zzcw) {
        this.zzb.zzA(zzcw);
    }

    public final void zzz(Bundle bundle) {
        this.zzb.zzE(bundle);
    }
}
