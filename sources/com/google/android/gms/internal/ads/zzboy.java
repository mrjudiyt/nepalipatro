package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzboy extends zzaum implements zzbpa {
    zzboy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbpd zzbpd) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzl);
        zza.writeString(str);
        zzauo.zzf(zza, zzbpd);
        zzbh(28, zza);
    }

    public final void zzB(zzl zzl, String str, String str2) {
        throw null;
    }

    public final void zzC(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbpd zzbpd) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzl);
        zza.writeString(str);
        zzauo.zzf(zza, zzbpd);
        zzbh(32, zza);
    }

    public final void zzD(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(21, zza);
    }

    public final void zzE() {
        zzbh(8, zza());
    }

    public final void zzF() {
        zzbh(9, zza());
    }

    public final void zzG(boolean z10) {
        Parcel zza = zza();
        int i10 = zzauo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(25, zza);
    }

    public final void zzH(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(39, zza);
    }

    public final void zzI() {
        zzbh(4, zza());
    }

    public final void zzJ(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(37, zza);
    }

    public final void zzK(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(30, zza);
    }

    public final void zzL() {
        zzbh(12, zza());
    }

    public final boolean zzM() {
        Parcel zzbg = zzbg(22, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzN() {
        Parcel zzbg = zzbg(13, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbpi zzO() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 15
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbpi
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbpi r1 = (com.google.android.gms.internal.ads.zzbpi) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbpi r2 = new com.google.android.gms.internal.ads.zzbpi
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzboy.zzO():com.google.android.gms.internal.ads.zzbpi");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbpj zzP() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 16
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbpj
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbpj r1 = (com.google.android.gms.internal.ads.zzbpj) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbpj r2 = new com.google.android.gms.internal.ads.zzbpj
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzboy.zzP():com.google.android.gms.internal.ads.zzbpj");
    }

    public final Bundle zze() {
        throw null;
    }

    public final Bundle zzf() {
        throw null;
    }

    public final Bundle zzg() {
        throw null;
    }

    public final zzdq zzh() {
        Parcel zzbg = zzbg(26, zza());
        zzdq zzb = zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbgi zzi() {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbpg zzj() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 36
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbpg
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbpg r1 = (com.google.android.gms.internal.ads.zzbpg) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbpe r2 = new com.google.android.gms.internal.ads.zzbpe
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzboy.zzj():com.google.android.gms.internal.ads.zzbpg");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbpm zzk() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 27
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbpm
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbpm r1 = (com.google.android.gms.internal.ads.zzbpm) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbpk r2 = new com.google.android.gms.internal.ads.zzbpk
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzboy.zzk():com.google.android.gms.internal.ads.zzbpm");
    }

    public final zzbrj zzl() {
        Parcel zzbg = zzbg(33, zza());
        zzbrj zzbrj = (zzbrj) zzauo.zza(zzbg, zzbrj.CREATOR);
        zzbg.recycle();
        return zzbrj;
    }

    public final zzbrj zzm() {
        Parcel zzbg = zzbg(34, zza());
        zzbrj zzbrj = (zzbrj) zzauo.zza(zzbg, zzbrj.CREATOR);
        zzbg.recycle();
        return zzbrj;
    }

    public final IObjectWrapper zzn() {
        Parcel zzbg = zzbg(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final void zzo() {
        zzbh(5, zza());
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbwh zzbwh, String str2) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzl);
        zza.writeString((String) null);
        zzauo.zzf(zza, zzbwh);
        zza.writeString(str2);
        zzbh(10, zza);
    }

    public final void zzq(IObjectWrapper iObjectWrapper, zzblk zzblk, List list) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzblk);
        zza.writeTypedList(list);
        zzbh(31, zza);
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzbwh zzbwh, List list) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbwh);
        zza.writeStringList(list);
        zzbh(23, zza);
    }

    public final void zzs(zzl zzl, String str) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzl);
        zza.writeString(str);
        zzbh(11, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbpd zzbpd) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzl);
        zza.writeString(str);
        zzauo.zzf(zza, zzbpd);
        zzbh(38, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, zzbpd zzbpd) {
        throw null;
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbpd zzbpd) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzq);
        zzauo.zzd(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzf(zza, zzbpd);
        zzbh(6, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbpd zzbpd) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzq);
        zzauo.zzd(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzf(zza, zzbpd);
        zzbh(35, zza);
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbpd zzbpd) {
        throw null;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbpd zzbpd) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzf(zza, zzbpd);
        zzbh(7, zza);
    }

    public final void zzz(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbpd zzbpd, zzbfc zzbfc, List list) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzf(zza, zzbpd);
        zzauo.zzd(zza, zzbfc);
        zza.writeStringList(list);
        zzbh(14, zza);
    }
}
