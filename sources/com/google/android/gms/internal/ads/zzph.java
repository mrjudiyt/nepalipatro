package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzph extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzph(int i10, zzam zzam, boolean z10) {
        super("AudioTrack write failed: " + i10);
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzam;
    }
}
