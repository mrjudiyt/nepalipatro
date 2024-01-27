package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbst extends zzaum implements zzbsv {
    zzbst(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final boolean zzH() {
        Parcel zzbg = zzbg(11, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final void zzh(int i10, int i11, Intent intent) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeInt(i11);
        zzauo.zzd(zza, intent);
        zzbh(12, zza);
    }

    public final void zzi() {
        zzbh(10, zza());
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(13, zza);
    }

    public final void zzl(Bundle bundle) {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzbh(1, zza);
    }

    public final void zzm() {
        zzbh(8, zza());
    }

    public final void zzo() {
        zzbh(5, zza());
    }

    public final void zzp(int i10, String[] strArr, int[] iArr) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbh(15, zza);
    }

    public final void zzq() {
        zzbh(2, zza());
    }

    public final void zzr() {
        zzbh(4, zza());
    }

    public final void zzs(Bundle bundle) {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        Parcel zzbg = zzbg(6, zza);
        if (zzbg.readInt() != 0) {
            bundle.readFromParcel(zzbg);
        }
        zzbg.recycle();
    }

    public final void zzt() {
        zzbh(3, zza());
    }

    public final void zzu() {
        zzbh(7, zza());
    }

    public final void zzv() {
        zzbh(14, zza());
    }

    public final void zzx() {
        zzbh(9, zza());
    }
}
