package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbev {
    private final Context zza;

    public zzbev(Context context) {
        this.zza = context;
    }

    public final void zza(zzbuf zzbuf) {
        try {
            ((zzbew) zzcax.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbeu.zza)).zze(zzbuf);
        } catch (zzcaw e10) {
            zzcat.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
        } catch (RemoteException e11) {
            zzcat.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e11.getMessage())));
        }
    }
}
