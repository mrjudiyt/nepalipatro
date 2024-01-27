package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzpq {
    private Boolean zza;

    public zzpq() {
    }

    public zzpq(Context context) {
    }

    public final zzoq zza(zzam zzam, zzk zzk) {
        Objects.requireNonNull(zzam);
        Objects.requireNonNull(zzk);
        int i10 = zzfk.zza;
        if (i10 < 29 || zzam.zzA == -1) {
            return zzoq.zza;
        }
        Boolean bool = this.zza;
        if (bool != null) {
            bool.booleanValue();
        } else {
            Boolean bool2 = Boolean.FALSE;
            this.zza = bool2;
            bool2.booleanValue();
        }
        String str = zzam.zzm;
        Objects.requireNonNull(str);
        int zza2 = zzcb.zza(str, zzam.zzj);
        if (zza2 == 0 || i10 < zzfk.zzf(zza2)) {
            return zzoq.zza;
        }
        int zzg = zzfk.zzg(zzam.zzz);
        if (zzg == 0) {
            return zzoq.zza;
        }
        try {
            AudioFormat zzu = zzfk.zzu(zzam.zzA, zzg, zza2);
            if (i10 >= 31) {
                return zzpp.zza(zzu, zzk.zza().zza, false);
            }
            return zzpo.zza(zzu, zzk.zza().zza, false);
        } catch (IllegalArgumentException unused) {
            return zzoq.zza;
        }
    }
}
