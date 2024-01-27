package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzegz implements zzdhf {
    private final zzfcr zza;
    private final zzbqv zzb;
    private final AdFormat zzc;
    private zzcyd zzd = null;

    zzegz(zzfcr zzfcr, zzbqv zzbqv, AdFormat adFormat) {
        this.zza = zzfcr;
        this.zzb = zzbqv;
        this.zzc = adFormat;
    }

    public final void zza(boolean z10, Context context, zzcxy zzcxy) {
        boolean z11;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                z11 = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else if (ordinal != 2) {
                if (ordinal == 6) {
                    z11 = this.zzb.zzr(ObjectWrapper.wrap(context));
                }
                throw new zzdhe("Adapter failed to show.");
            } else {
                z11 = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (z11) {
                if (this.zzd != null) {
                    if (!((Boolean) zzba.zzc().zzb(zzbci.zzbu)).booleanValue() && this.zza.zzaa == 2) {
                        this.zzd.zza();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new zzdhe("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdhe(th);
        }
    }

    public final void zzb(zzcyd zzcyd) {
        this.zzd = zzcyd;
    }
}
