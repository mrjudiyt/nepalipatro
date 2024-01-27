package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfya extends zzfyb {
    public static int zza(long j10) {
        int i10 = (int) j10;
        zzfsw.zzg(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int zzb(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static int zzc(long j10) {
        if (j10 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }
}
