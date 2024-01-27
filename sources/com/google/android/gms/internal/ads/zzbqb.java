package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbqb extends zzbpc {
    private final Adapter zza;
    private final zzbwh zzb;

    zzbqb(Adapter adapter, zzbwh zzbwh) {
        this.zza = adapter;
        this.zzb = zzbwh;
    }

    public final void zze() {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzf() {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzg(int i10) {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzg(ObjectWrapper.wrap(this.zza), i10);
        }
    }

    public final void zzh(zze zze) {
    }

    public final void zzi(int i10, String str) {
    }

    public final void zzj(int i10) {
    }

    public final void zzk(zze zze) {
    }

    public final void zzl(String str) {
    }

    public final void zzm() {
    }

    public final void zzn() {
    }

    public final void zzo() {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzp() {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzq(String str, String str2) {
    }

    public final void zzr(zzbgi zzbgi, String str) {
    }

    public final void zzs(zzbwi zzbwi) {
    }

    public final void zzt(zzbwm zzbwm) {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzm(ObjectWrapper.wrap(this.zza), new zzbwi(zzbwm.zzf(), zzbwm.zze()));
        }
    }

    public final void zzu() {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzv() {
    }

    public final void zzw() {
    }

    public final void zzx() {
    }

    public final void zzy() {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
