package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgdb extends zzgcl {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgcz zze;
    private final zzgcy zzf;

    /* synthetic */ zzgdb(int i10, int i11, int i12, int i13, zzgcz zzgcz, zzgcy zzgcy, zzgda zzgda) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzgcz;
        this.zzf = zzgcy;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgdb)) {
            return false;
        }
        zzgdb zzgdb = (zzgdb) obj;
        return zzgdb.zza == this.zza && zzgdb.zzb == this.zzb && zzgdb.zzc == this.zzc && zzgdb.zzd == this.zzd && zzgdb.zze == this.zze && zzgdb.zzf == this.zzf;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgdb.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        zzgcy zzgcy = this.zzf;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(zzgcy);
        return "AesCtrHmacAead Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final zzgcy zze() {
        return this.zzf;
    }

    public final zzgcz zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zze != zzgcz.zzc;
    }
}
