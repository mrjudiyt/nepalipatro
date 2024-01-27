package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbpb extends zzaum implements zzbpd {
    zzbpb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void zze() {
        zzbh(1, zza());
    }

    public final void zzf() {
        zzbh(2, zza());
    }

    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(3, zza);
    }

    public final void zzh(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(23, zza);
    }

    public final void zzi(int i10, String str) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeString(str);
        zzbh(22, zza);
    }

    public final void zzj(int i10) {
        throw null;
    }

    public final void zzk(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(24, zza);
    }

    public final void zzl(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(21, zza);
    }

    public final void zzm() {
        zzbh(8, zza());
    }

    public final void zzn() {
        zzbh(4, zza());
    }

    public final void zzo() {
        zzbh(6, zza());
    }

    public final void zzp() {
        zzbh(5, zza());
    }

    public final void zzq(String str, String str2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(9, zza);
    }

    public final void zzr(zzbgi zzbgi, String str) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgi);
        zza.writeString(str);
        zzbh(10, zza);
    }

    public final void zzs(zzbwi zzbwi) {
        throw null;
    }

    public final void zzt(zzbwm zzbwm) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbwm);
        zzbh(16, zza);
    }

    public final void zzu() {
        zzbh(18, zza());
    }

    public final void zzv() {
        zzbh(11, zza());
    }

    public final void zzw() {
        zzbh(15, zza());
    }

    public final void zzx() {
        zzbh(20, zza());
    }

    public final void zzy() {
        zzbh(13, zza());
    }
}
