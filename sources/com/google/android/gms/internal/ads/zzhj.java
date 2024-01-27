package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhj implements zzgi {
    private final zzgi zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzhj(zzgi zzgi) {
        this.zza = zzgi;
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        int zza2 = this.zza.zza(bArr, i10, i11);
        if (zza2 != -1) {
            this.zzb += (long) zza2;
        }
        return zza2;
    }

    public final long zzb(zzgn zzgn) {
        this.zzc = zzgn.zza;
        this.zzd = Collections.emptyMap();
        long zzb2 = this.zza.zzb(zzgn);
        Uri zzc2 = zzc();
        Objects.requireNonNull(zzc2);
        this.zzc = zzc2;
        this.zzd = zze();
        return zzb2;
    }

    public final Uri zzc() {
        return this.zza.zzc();
    }

    public final void zzd() {
        this.zza.zzd();
    }

    public final Map zze() {
        return this.zza.zze();
    }

    public final void zzf(zzhk zzhk) {
        Objects.requireNonNull(zzhk);
        this.zza.zzf(zzhk);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}
