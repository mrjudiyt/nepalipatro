package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zztm implements zzgi {
    private final zzgi zza;
    private final int zzb;
    private final zztl zzc;
    private final byte[] zzd;
    private int zze;

    public zztm(zzgi zzgi, int i10, zztl zztl) {
        zzdx.zzd(i10 > 0);
        this.zza = zzgi;
        this.zzb = i10;
        this.zzc = zztl;
        this.zzd = new byte[1];
        this.zze = i10;
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        int i12 = this.zze;
        if (i12 == 0) {
            int i13 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i14 = (this.zzd[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr2 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int zza2 = this.zza.zza(bArr2, i13, i15);
                        if (zza2 != -1) {
                            i13 += zza2;
                            i15 -= zza2;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr2[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.zzc.zza(new zzfb(bArr2, i14));
                    }
                }
                i12 = this.zzb;
                this.zze = i12;
            }
            return -1;
        }
        int zza3 = this.zza.zza(bArr, i10, Math.min(i12, i11));
        if (zza3 != -1) {
            this.zze -= zza3;
        }
        return zza3;
    }

    public final long zzb(zzgn zzgn) {
        throw new UnsupportedOperationException();
    }

    public final Uri zzc() {
        return this.zza.zzc();
    }

    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    public final Map zze() {
        return this.zza.zze();
    }

    public final void zzf(zzhk zzhk) {
        Objects.requireNonNull(zzhk);
        this.zza.zzf(zzhk);
    }
}
