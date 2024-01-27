package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzez {
    private double zza = 60.0d;
    private long zzb;
    private final Object zzc = new Object();
    private final String zzd = "tracking";
    private final Clock zze;

    public zzez(int i10, long j10, String str, Clock clock) {
        this.zze = clock;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            long currentTimeMillis = this.zze.currentTimeMillis();
            double d10 = this.zza;
            if (d10 < 60.0d) {
                double d11 = ((double) (currentTimeMillis - this.zzb)) / 2000.0d;
                if (d11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    d10 = Math.min(60.0d, d10 + d11);
                    this.zza = d10;
                }
            }
            this.zzb = currentTimeMillis;
            if (d10 >= 1.0d) {
                this.zza = d10 - 4.0d;
                return true;
            }
            String str = this.zzd;
            StringBuilder sb = new StringBuilder(str.length() + 34);
            sb.append("Excessive ");
            sb.append(str);
            sb.append(" detected; call ignored.");
            zzfa.zze(sb.toString());
            return false;
        }
    }
}
