package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzzi extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzzg zzd;
    private boolean zze;

    /* synthetic */ zzzi(zzzg zzzg, SurfaceTexture surfaceTexture, boolean z10, zzzh zzzh) {
        super(surfaceTexture);
        this.zzd = zzzg;
        this.zza = z10;
    }

    public static zzzi zza(Context context, boolean z10) {
        int i10 = 0;
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzdx.zzf(z11);
        zzzg zzzg = new zzzg();
        if (z10) {
            i10 = zzb;
        }
        return zzzg.zza(i10);
    }

    public static synchronized boolean zzb(Context context) {
        int i10;
        synchronized (zzzi.class) {
            if (!zzc) {
                zzb = zzeg.zzc(context) ? zzeg.zzd() ? 1 : 2 : 0;
                zzc = true;
            }
            i10 = zzb;
        }
        return i10 != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
