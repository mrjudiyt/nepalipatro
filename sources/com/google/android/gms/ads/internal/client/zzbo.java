package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbmb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbo extends zzaum implements zzbq {
    zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 1
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbn
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbn r1 = (com.google.android.gms.ads.internal.client.zzbn) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.ads.internal.client.zzbl r2 = new com.google.android.gms.ads.internal.client.zzbl
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbo.zze():com.google.android.gms.ads.internal.client.zzbn");
    }

    public final void zzf(zzbgm zzbgm) {
        throw null;
    }

    public final void zzg(zzbgp zzbgp) {
        throw null;
    }

    public final void zzh(String str, zzbgv zzbgv, zzbgs zzbgs) {
        Parcel zza = zza();
        zza.writeString(str);
        zzauo.zzf(zza, zzbgv);
        zzauo.zzf(zza, zzbgs);
        zzbh(5, zza);
    }

    public final void zzi(zzbmb zzbmb) {
        throw null;
    }

    public final void zzj(zzbgz zzbgz, zzq zzq) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgz);
        zzauo.zzd(zza, zzq);
        zzbh(8, zza);
    }

    public final void zzk(zzbhc zzbhc) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbhc);
        zzbh(10, zza);
    }

    public final void zzl(zzbh zzbh) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbh);
        zzbh(2, zza);
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel zza = zza();
        zzauo.zzd(zza, adManagerAdViewOptions);
        zzbh(15, zza);
    }

    public final void zzn(zzbls zzbls) {
        throw null;
    }

    public final void zzo(zzbfc zzbfc) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbfc);
        zzbh(6, zza);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    public final void zzq(zzcf zzcf) {
        throw null;
    }
}
