package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfis {
    public static zzfit zza(Context context, int i10) {
        boolean z10;
        if (zzfjh.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        z10 = ((Boolean) zzbdu.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        z10 = ((Boolean) zzbdu.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        z10 = ((Boolean) zzbdu.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                z10 = ((Boolean) zzbdu.zze.zze()).booleanValue();
            }
            if (z10) {
                return new zzfiv(context, i10);
            }
        }
        return new zzfjq();
    }

    public static zzfit zzb(Context context, int i10, int i11, zzl zzl) {
        zzfit zza = zza(context, i10);
        if (!(zza instanceof zzfiv)) {
            return zza;
        }
        zza.zzh();
        zza.zzm(i11);
        if (zzfjd.zze(zzl.zzp)) {
            zza.zze(zzl.zzp);
        }
        return zza;
    }
}
