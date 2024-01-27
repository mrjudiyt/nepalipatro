package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfpx extends zzfpu {
    private static zzfpx zzc;

    private zzfpx(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfpx zzi(Context context) {
        zzfpx zzfpx;
        synchronized (zzfpx.class) {
            if (zzc == null) {
                zzc = new zzfpx(context);
            }
            zzfpx = zzc;
        }
        return zzfpx;
    }

    public final zzfpt zzh(long j10, boolean z10) {
        synchronized (zzfpx.class) {
            if (!zzo()) {
                zzfpt zzfpt = new zzfpt();
                return zzfpt;
            }
            zzfpt zzb = zzb((String) null, (String) null, j10, z10);
            return zzb;
        }
    }

    public final void zzj() {
        synchronized (zzfpx.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z10) {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z10));
    }

    public final void zzn(boolean z10) {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z10));
        if (!z10) {
            zzj();
        }
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
