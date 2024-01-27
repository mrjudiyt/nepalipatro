package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaxt {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzaxt(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        this.zza = inputStream;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = j10;
        this.zze = z12;
    }

    public static zzaxt zzb(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        return new zzaxt(inputStream, z10, z11, j10, z12);
    }

    public final long zza() {
        return this.zzd;
    }

    public final InputStream zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
