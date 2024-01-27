package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzget {
    private zzgfd zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    private zzget() {
    }

    /* synthetic */ zzget(zzges zzges) {
    }

    public final zzget zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzget zzb(zzgry zzgry) {
        this.zzb = zzgry;
        return this;
    }

    public final zzget zzc(zzgfd zzgfd) {
        this.zza = zzgfd;
        return this;
    }

    public final zzgev zzd() {
        zzgry zzgry;
        zzgrx zzb2;
        zzgfd zzgfd = this.zza;
        if (zzgfd == null || (zzgry = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgfd.zza() != zzgry.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgfd.zzc() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zzc() || this.zzc == null) {
            if (this.zza.zzb() == zzgfb.zzc) {
                zzb2 = zzgrx.zzb(new byte[0]);
            } else if (this.zza.zzb() == zzgfb.zzb) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzb() == zzgfb.zza) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
            }
            return new zzgev(this.zza, this.zzb, zzb2, this.zzc, (zzgeu) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
