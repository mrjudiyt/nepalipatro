package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzbox;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzcm extends zzaum implements zzco {
    zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final float zze() {
        Parcel zzbg = zzbg(7, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final String zzf() {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzg() {
        Parcel zzbg = zzbg(13, zza());
        ArrayList<zzblg> createTypedArrayList = zzbg.createTypedArrayList(zzblg.CREATOR);
        zzbg.recycle();
        return createTypedArrayList;
    }

    public final void zzh(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(10, zza);
    }

    public final void zzi() {
        zzbh(15, zza());
    }

    public final void zzj(boolean z10) {
        Parcel zza = zza();
        int i10 = zzauo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(17, zza);
    }

    public final void zzk() {
        zzbh(1, zza());
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zza.writeString((String) null);
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(6, zza);
    }

    public final void zzm(zzda zzda) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzda);
        zzbh(16, zza);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzbh(5, zza);
    }

    public final void zzo(zzbox zzbox) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbox);
        zzbh(11, zza);
    }

    public final void zzp(boolean z10) {
        Parcel zza = zza();
        int i10 = zzauo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(4, zza);
    }

    public final void zzq(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzbh(2, zza);
    }

    public final void zzr(String str) {
        throw null;
    }

    public final void zzs(zzbln zzbln) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbln);
        zzbh(12, zza);
    }

    public final void zzt(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(18, zza);
    }

    public final void zzu(zzff zzff) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzff);
        zzbh(14, zza);
    }

    public final boolean zzv() {
        Parcel zzbg = zzbg(8, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
