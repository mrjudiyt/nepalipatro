package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaws;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbwc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbs extends zzaum implements zzbu {
    zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void zzA() {
        zzbh(11, zza());
    }

    public final void zzB() {
        zzbh(6, zza());
    }

    public final void zzC(zzbe zzbe) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbe);
        zzbh(20, zza);
    }

    public final void zzD(zzbh zzbh) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbh);
        zzbh(7, zza);
    }

    public final void zzE(zzby zzby) {
        throw null;
    }

    public final void zzF(zzq zzq) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzq);
        zzbh(13, zza);
    }

    public final void zzG(zzcb zzcb) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzcb);
        zzbh(8, zza);
    }

    public final void zzH(zzaws zzaws) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzaws);
        zzbh(40, zza);
    }

    public final void zzI(zzw zzw) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzw);
        zzbh(39, zza);
    }

    public final void zzJ(zzci zzci) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzci);
        zzbh(45, zza);
    }

    public final void zzK(zzdu zzdu) {
        throw null;
    }

    public final void zzL(boolean z10) {
        Parcel zza = zza();
        int i10 = zzauo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(34, zza);
    }

    public final void zzM(zzbte zzbte) {
        throw null;
    }

    public final void zzN(boolean z10) {
        Parcel zza = zza();
        int i10 = zzauo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(22, zza);
    }

    public final void zzO(zzbdg zzbdg) {
        throw null;
    }

    public final void zzP(zzdg zzdg) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzdg);
        zzbh(42, zza);
    }

    public final void zzQ(zzbth zzbth, String str) {
        throw null;
    }

    public final void zzR(String str) {
        throw null;
    }

    public final void zzS(zzbwc zzbwc) {
        throw null;
    }

    public final void zzT(String str) {
        throw null;
    }

    public final void zzU(zzfl zzfl) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzfl);
        zzbh(29, zza);
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(44, zza);
    }

    public final void zzX() {
        throw null;
    }

    public final boolean zzY() {
        Parcel zzbg = zzbg(23, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzZ() {
        throw null;
    }

    public final boolean zzaa(zzl zzl) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzl);
        Parcel zzbg = zzbg(4, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final void zzab(zzcf zzcf) {
        throw null;
    }

    public final Bundle zzd() {
        throw null;
    }

    public final zzq zzg() {
        Parcel zzbg = zzbg(12, zza());
        zzq zzq = (zzq) zzauo.zza(zzbg, zzq.CREATOR);
        zzbg.recycle();
        return zzq;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 33
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbh
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbh r1 = (com.google.android.gms.ads.internal.client.zzbh) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzbf r2 = new com.google.android.gms.ads.internal.client.zzbf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbs.zzi():com.google.android.gms.ads.internal.client.zzbh");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 32
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzcb
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzcb r1 = (com.google.android.gms.ads.internal.client.zzcb) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzbz r2 = new com.google.android.gms.ads.internal.client.zzbz
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbs.zzj():com.google.android.gms.ads.internal.client.zzcb");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzdn zzk() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 41
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzdn
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzdn r1 = (com.google.android.gms.ads.internal.client.zzdn) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdl r2 = new com.google.android.gms.ads.internal.client.zzdl
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbs.zzk():com.google.android.gms.ads.internal.client.zzdn");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 26
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzdq
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzdq r1 = (com.google.android.gms.ads.internal.client.zzdq) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdo r2 = new com.google.android.gms.ads.internal.client.zzdo
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbs.zzl():com.google.android.gms.ads.internal.client.zzdq");
    }

    public final IObjectWrapper zzn() {
        Parcel zzbg = zzbg(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final String zzr() {
        Parcel zzbg = zzbg(31, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzs() {
        throw null;
    }

    public final String zzt() {
        throw null;
    }

    public final void zzx() {
        zzbh(2, zza());
    }

    public final void zzy(zzl zzl, zzbk zzbk) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, zzbk);
        zzbh(43, zza);
    }

    public final void zzz() {
        zzbh(5, zza());
    }
}
