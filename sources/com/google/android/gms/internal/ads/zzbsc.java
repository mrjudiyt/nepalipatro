package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbsc extends NativeAd.Image {
    private final zzbfo zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;

    public zzbsc(zzbfo zzbfo) {
        Drawable drawable;
        double d10;
        this.zza = zzbfo;
        Uri uri = null;
        try {
            IObjectWrapper zzf = zzbfo.zzf();
            if (zzf != null) {
                drawable = (Drawable) ObjectWrapper.unwrap(zzf);
                this.zzb = drawable;
                uri = this.zza.zze();
                this.zzc = uri;
                d10 = this.zza.zzb();
                this.zzd = d10;
                this.zza.zzd();
                this.zza.zzc();
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
        try {
            this.zza.zzd();
        } catch (RemoteException e13) {
            zzcat.zzh("", e13);
        }
        try {
            this.zza.zzc();
        } catch (RemoteException e14) {
            zzcat.zzh("", e14);
        }
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
}
