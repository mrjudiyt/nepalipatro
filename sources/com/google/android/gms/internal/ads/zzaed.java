package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaed extends zzaca {
    private final long zza;

    public zzaed(zzabn zzabn, long j10) {
        super(zzabn);
        zzdx.zzd(zzabn.zzf() >= j10);
        this.zza = j10;
    }

    public final long zzd() {
        return super.zzd() - this.zza;
    }

    public final long zze() {
        return super.zze() - this.zza;
    }

    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
