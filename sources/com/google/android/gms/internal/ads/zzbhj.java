package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbhj extends zzaum implements zzbhl {
    zzbhj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final void zzA() {
        zzbh(28, zza());
    }

    public final void zzB(Bundle bundle) {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzbh(17, zza);
    }

    public final void zzC() {
        zzbh(27, zza());
    }

    public final void zzD(zzcs zzcs) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzcs);
        zzbh(26, zza);
    }

    public final void zzE(zzdg zzdg) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzdg);
        zzbh(32, zza);
    }

    public final void zzF(zzbhi zzbhi) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbhi);
        zzbh(21, zza);
    }

    public final boolean zzG() {
        Parcel zzbg = zzbg(30, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzH() {
        Parcel zzbg = zzbg(24, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzI(Bundle bundle) {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        Parcel zzbg = zzbg(16, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final double zze() {
        Parcel zzbg = zzbg(8, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    public final Bundle zzf() {
        Parcel zzbg = zzbg(20, zza());
        Bundle bundle = (Bundle) zzauo.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final zzdn zzg() {
        Parcel zzbg = zzbg(31, zza());
        zzdn zzb = zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzdq zzh() {
        Parcel zzbg = zzbg(11, zza());
        zzdq zzb = zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbfg zzi() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 14
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbfg
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbfg r1 = (com.google.android.gms.internal.ads.zzbfg) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbfe r2 = new com.google.android.gms.internal.ads.zzbfe
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhj.zzi():com.google.android.gms.internal.ads.zzbfg");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbfl zzj() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 29
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbfl
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbfl r1 = (com.google.android.gms.internal.ads.zzbfl) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbfj r2 = new com.google.android.gms.internal.ads.zzbfj
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhj.zzj():com.google.android.gms.internal.ads.zzbfl");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbfo zzk() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 5
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbfo
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzbfo r1 = (com.google.android.gms.internal.ads.zzbfo) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzbfm r2 = new com.google.android.gms.internal.ads.zzbfm
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhj.zzk():com.google.android.gms.internal.ads.zzbfo");
    }

    public final IObjectWrapper zzl() {
        Parcel zzbg = zzbg(19, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzm() {
        Parcel zzbg = zzbg(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final String zzn() {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzp() {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzq() {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzr() {
        Parcel zzbg = zzbg(12, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzs() {
        Parcel zzbg = zzbg(10, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzt() {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzu() {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzauo.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final List zzv() {
        Parcel zzbg = zzbg(23, zza());
        ArrayList zzb = zzauo.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final void zzw() {
        zzbh(22, zza());
    }

    public final void zzx() {
        zzbh(13, zza());
    }

    public final void zzy(zzcw zzcw) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzcw);
        zzbh(25, zza);
    }

    public final void zzz(Bundle bundle) {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzbh(15, zza);
    }
}
