package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbnr {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzboa zzc;
    private zzboa zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzboa zza(Context context, zzcaz zzcaz, zzfjh zzfjh) {
        zzboa zzboa;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzboa(zzc(context), zzcaz, (String) zzba.zzc().zzb(zzbci.zza), zzfjh);
            }
            zzboa = this.zzc;
        }
        return zzboa;
    }

    public final zzboa zzb(Context context, zzcaz zzcaz, zzfjh zzfjh) {
        zzboa zzboa;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzboa(zzc(context), zzcaz, (String) zzbel.zzb.zze(), zzfjh);
            }
            zzboa = this.zzd;
        }
        return zzboa;
    }
}
