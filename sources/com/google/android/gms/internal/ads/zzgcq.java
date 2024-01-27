package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgcq {
    private zzgdb zza = null;
    private zzgry zzb = null;
    private zzgry zzc = null;
    private Integer zzd = null;

    private zzgcq() {
    }

    /* synthetic */ zzgcq(zzgcp zzgcp) {
    }

    public final zzgcq zza(zzgry zzgry) {
        this.zzb = zzgry;
        return this;
    }

    public final zzgcq zzb(zzgry zzgry) {
        this.zzc = zzgry;
        return this;
    }

    public final zzgcq zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgcq zzd(zzgdb zzgdb) {
        this.zza = zzgdb;
        return this;
    }

    public final zzgcs zze() {
        zzgrx zzb2;
        zzgdb zzgdb = this.zza;
        if (zzgdb != null) {
            zzgry zzgry = this.zzb;
            if (zzgry == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            } else if (zzgdb.zza() != zzgry.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            } else if (zzgdb.zzb() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            } else if (this.zza.zzg() && this.zzd == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zzg() || this.zzd == null) {
                if (this.zza.zzf() == zzgcz.zzc) {
                    zzb2 = zzgrx.zzb(new byte[0]);
                } else if (this.zza.zzf() == zzgcz.zzb) {
                    zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
                } else if (this.zza.zzf() == zzgcz.zza) {
                    zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                }
                return new zzgcs(this.zza, this.zzb, this.zzc, zzb2, this.zzd, (zzgcr) null);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        } else {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
    }
}
