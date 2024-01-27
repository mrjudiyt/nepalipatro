package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzdo extends zzaum implements zzdq {
    zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final float zze() {
        throw null;
    }

    public final float zzf() {
        throw null;
    }

    public final float zzg() {
        throw null;
    }

    public final int zzh() {
        Parcel zzbg = zzbg(5, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzdt zzi() {
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzdt
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzdt r1 = (com.google.android.gms.ads.internal.client.zzdt) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdr r2 = new com.google.android.gms.ads.internal.client.zzdr
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzdo.zzi():com.google.android.gms.ads.internal.client.zzdt");
    }

    public final void zzj(boolean z10) {
        Parcel zza = zza();
        int i10 = zzauo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(3, zza);
    }

    public final void zzk() {
        zzbh(2, zza());
    }

    public final void zzl() {
        zzbh(1, zza());
    }

    public final void zzm(zzdt zzdt) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzdt);
        zzbh(8, zza);
    }

    public final void zzn() {
        zzbh(13, zza());
    }

    public final boolean zzo() {
        Parcel zzbg = zzbg(12, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzp() {
        Parcel zzbg = zzbg(10, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzq() {
        Parcel zzbg = zzbg(4, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
