package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzkq {
    /* access modifiers changed from: private */
    public long zza;
    /* access modifiers changed from: private */
    public float zzb;
    /* access modifiers changed from: private */
    public long zzc;

    public zzkq() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    /* synthetic */ zzkq(zzks zzks, zzkp zzkp) {
        this.zza = zzks.zza;
        this.zzb = zzks.zzb;
        this.zzc = zzks.zzc;
    }

    public final zzkq zzd(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzdx.zzd(z10);
        this.zzc = j10;
        return this;
    }

    public final zzkq zze(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzkq zzf(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzdx.zzd(z10);
        this.zzb = f10;
        return this;
    }

    public final zzks zzg() {
        return new zzks(this, (zzkr) null);
    }
}
