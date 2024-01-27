package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbwn extends zzaum implements zzbwp {
    zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public final Bundle zzb() {
        Parcel zzbg = zzbg(9, zza());
        Bundle bundle = (Bundle) zzauo.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final zzdn zzc() {
        Parcel zzbg = zzbg(12, zza());
        zzdn zzb = zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbwm zzd() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 11
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbwm
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbwm r1 = (com.google.android.gms.internal.ads.zzbwm) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbwk r2 = new com.google.android.gms.internal.ads.zzbwk
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwn.zzd():com.google.android.gms.internal.ads.zzbwm");
    }

    public final String zze() {
        throw null;
    }

    public final void zzf(zzl zzl, zzbww zzbww) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, zzbww);
        zzbh(1, zza);
    }

    public final void zzg(zzl zzl, zzbww zzbww) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzl);
        zzauo.zzf(zza, zzbww);
        zzbh(14, zza);
    }

    public final void zzh(boolean z10) {
        Parcel zza = zza();
        int i10 = zzauo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(15, zza);
    }

    public final void zzi(zzdd zzdd) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzdd);
        zzbh(8, zza);
    }

    public final void zzj(zzdg zzdg) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzdg);
        zzbh(13, zza);
    }

    public final void zzk(zzbws zzbws) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbws);
        zzbh(2, zza);
    }

    public final void zzl(zzbxd zzbxd) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbxd);
        zzbh(7, zza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) {
        throw null;
    }

    public final boolean zzo() {
        throw null;
    }

    public final void zzp(zzbwx zzbwx) {
        throw null;
    }
}
