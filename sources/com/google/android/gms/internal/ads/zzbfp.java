package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbfp extends NativeAd.Image {
    private final zzbfo zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbfp(zzbfo zzbfo) {
        Drawable drawable;
        double d10;
        int i10;
        this.zza = zzbfo;
        Uri uri = null;
        try {
            IObjectWrapper zzf2 = zzbfo.zzf();
            if (zzf2 != null) {
                drawable = (Drawable) ObjectWrapper.unwrap(zzf2);
                this.zzb = drawable;
                uri = this.zza.zze();
                this.zzc = uri;
                d10 = this.zza.zzb();
                this.zzd = d10;
                int i11 = -1;
                i10 = this.zza.zzd();
                this.zze = i10;
                i11 = this.zza.zzc();
                this.zzf = i11;
            }
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
        drawable = null;
        this.zzb = drawable;
        try {
            uri = this.zza.zze();
        } catch (RemoteException e11) {
            zzcat.zzh("", e11);
        }
        this.zzc = uri;
        try {
            d10 = this.zza.zzb();
        } catch (RemoteException e12) {
            zzcat.zzh("", e12);
            d10 = 1.0d;
        }
        this.zzd = d10;
        int i112 = -1;
        try {
            i10 = this.zza.zzd();
        } catch (RemoteException e13) {
            zzcat.zzh("", e13);
            i10 = -1;
        }
        this.zze = i10;
        try {
            i112 = this.zza.zzc();
        } catch (RemoteException e14) {
            zzcat.zzh("", e14);
        }
        this.zzf = i112;
    }

    public final Drawable getDrawable() {
        return this.zzb;
    }

    public final double getScale() {
        return this.zzd;
    }

    public final Uri getUri() {
        return this.zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zze;
    }
}
