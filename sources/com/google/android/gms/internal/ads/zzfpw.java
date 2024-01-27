package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfpw extends zzfpu {
    private static zzfpw zzc;

    private zzfpw(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfpw zzj(Context context) {
        zzfpw zzfpw;
        synchronized (zzfpw.class) {
            if (zzc == null) {
                zzc = new zzfpw(context);
            }
            zzfpw = zzc;
        }
        return zzfpw;
    }

    public final zzfpt zzh(long j10, boolean z10) {
        zzfpt zzb;
        synchronized (zzfpw.class) {
            zzb = zzb((String) null, (String) null, j10, z10);
        }
        return zzb;
    }

    public final zzfpt zzi(String str, String str2, long j10, boolean z10) {
        zzfpt zzb;
        synchronized (zzfpw.class) {
            zzb = zzb(str, str2, j10, z10);
        }
        return zzb;
    }

    public final void zzk() {
        synchronized (zzfpw.class) {
            zzf(false);
        }
    }

    public final void zzl() {
        synchronized (zzfpw.class) {
            zzf(true);
        }
    }
}
