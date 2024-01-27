package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.common.util.concurrent.e;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfjd {
    public static void zza(e eVar, zzfje zzfje, zzfit zzfit) {
        zzg(eVar, zzfje, zzfit, false);
    }

    public static void zzb(e eVar, zzfje zzfje, zzfit zzfit) {
        zzg(eVar, zzfje, zzfit, true);
    }

    public static void zzc(e eVar, zzfje zzfje, zzfit zzfit) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            zzfzt.zzr(zzfzk.zzu(eVar), new zzfjc(zzfje, zzfit), zzcbg.zzf);
        }
    }

    public static void zzd(e eVar, zzfit zzfit) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            zzfzt.zzr(zzfzk.zzu(eVar), new zzfja(zzfit), zzcbg.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzba.zzc().zzb(zzbci.zziz), str);
    }

    public static int zzf(zzfdn zzfdn) {
        int zze = zzf.zze(zzfdn) - 1;
        return (zze == 0 || zze == 1) ? 7 : 23;
    }

    private static void zzg(e eVar, zzfje zzfje, zzfit zzfit, boolean z10) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            zzfzt.zzr(zzfzk.zzu(eVar), new zzfjb(zzfje, zzfit, z10), zzcbg.zzf);
        }
    }
}
