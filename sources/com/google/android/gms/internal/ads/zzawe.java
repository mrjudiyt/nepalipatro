package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzawe {
    final long zza;
    final String zzb;
    final int zzc;

    zzawe(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzawe)) {
            zzawe zzawe = (zzawe) obj;
            return zzawe.zza == this.zza && zzawe.zzc == this.zzc;
        }
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
