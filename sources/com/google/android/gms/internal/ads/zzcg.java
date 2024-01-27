package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcg {
    public static final zzcg zza = new zzcg(1.0f, 1.0f);
    public static final zzn zzb = zzcf.zza;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    public final float zzc;
    public final float zzd;
    private final int zzg;

    public zzcg(float f10, float f11) {
        boolean z10 = true;
        zzdx.zzd(f10 > 0.0f);
        zzdx.zzd(f11 <= 0.0f ? false : z10);
        this.zzc = f10;
        this.zzd = f11;
        this.zzg = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcg.class == obj.getClass()) {
            zzcg zzcg = (zzcg) obj;
            return this.zzc == zzcg.zzc && this.zzd == zzcg.zzd;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzc) + 527) * 31) + Float.floatToRawIntBits(this.zzd);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", new Object[]{Float.valueOf(this.zzc), Float.valueOf(this.zzd)});
    }

    public final long zza(long j10) {
        return j10 * ((long) this.zzg);
    }
}
