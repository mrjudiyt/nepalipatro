package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbko {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbkk zzc;

    public zzbko(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbci.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzjo)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.length() > ((Integer) zzba.zzc().zzb(zzbci.zzjq)).intValue()) {
            zzcat.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    private final void zzd() {
        if (this.zzc == null) {
            this.zzc = zzay.zza().zzl(this.zza, new zzbou(), this.zzb);
        }
    }

    public final void zza() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjo)).booleanValue()) {
            zzd();
            zzbkk zzbkk = this.zzc;
            if (zzbkk != null) {
                try {
                    zzbkk.zze();
                } catch (RemoteException e10) {
                    zzcat.zzl("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbkk zzbkk = this.zzc;
        if (zzbkk == null) {
            return false;
        }
        try {
            zzbkk.zzf(str);
            return true;
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            return true;
        }
    }
}
