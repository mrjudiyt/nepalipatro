package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbsa extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsa(zzbfg zzbfg) {
        try {
            this.zzb = zzbfg.zzg();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            this.zzb = "";
        }
        try {
            for (Object next : zzbfg.zzh()) {
                zzbfo zzg = next instanceof IBinder ? zzbfn.zzg((IBinder) next) : null;
                if (zzg != null) {
                    this.zza.add(new zzbsc(zzg));
                }
            }
        } catch (RemoteException e11) {
            zzcat.zzh("", e11);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
