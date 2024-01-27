package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbqt extends zzaum implements zzbqv {
    zzbqt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final zzdq zze() {
        Parcel zzbg = zzbg(5, zza());
        zzdq zzb = zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbrj zzf() {
        Parcel zzbg = zzbg(2, zza());
        zzbrj zzbrj = (zzbrj) zzauo.zza(zzbg, zzbrj.CREATOR);
        zzbg.recycle();
        return zzbrj;
    }

    public final zzbrj zzg() {
        Parcel zzbg = zzbg(3, zza());
        zzbrj zzbrj = (zzbrj) zzauo.zza(zzbg, zzbrj.CREATOR);
        zzbg.recycle();
        return zzbrj;
    }

    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzq zzq, zzbqy zzbqy) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzauo.zzd(zza, bundle);
        zzauo.zzd(zza, bundle2);
        zzauo.zzd(zza, zzq);
        zzauo.zzf(zza, zzbqy);
        zzbh(1, zza);
    }

    public final void zzi(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqg zzbqg, zzbpd zzbpd) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqg);
        zzauo.zzf(zza, zzbpd);
        zzbh(23, zza);
    }

    public final void zzj(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqj zzbqj, zzbpd zzbpd, zzq zzq) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqj);
        zzauo.zzf(zza, zzbpd);
        zzauo.zzd(zza, zzq);
        zzbh(13, zza);
    }

    public final void zzk(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqj zzbqj, zzbpd zzbpd, zzq zzq) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqj);
        zzauo.zzf(zza, zzbpd);
        zzauo.zzd(zza, zzq);
        zzbh(21, zza);
    }

    public final void zzl(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqm zzbqm, zzbpd zzbpd) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqm);
        zzauo.zzf(zza, zzbpd);
        zzbh(14, zza);
    }

    public final void zzm(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqp zzbqp, zzbpd zzbpd) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqp);
        zzauo.zzf(zza, zzbpd);
        zzbh(18, zza);
    }

    public final void zzn(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqp zzbqp, zzbpd zzbpd, zzbfc zzbfc) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqp);
        zzauo.zzf(zza, zzbpd);
        zzauo.zzd(zza, zzbfc);
        zzbh(22, zza);
    }

    public final void zzo(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqs zzbqs, zzbpd zzbpd) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqs);
        zzauo.zzf(zza, zzbpd);
        zzbh(20, zza);
    }

    public final void zzp(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqs zzbqs, zzbpd zzbpd) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqs);
        zzauo.zzf(zza, zzbpd);
        zzbh(16, zza);
    }

    public final void zzq(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(19, zza);
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(24, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(15, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(17, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
