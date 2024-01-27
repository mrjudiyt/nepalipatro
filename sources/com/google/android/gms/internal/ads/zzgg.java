package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgg extends zzgc {
    private zzgn zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgg() {
        super(false);
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        int i13 = zzfk.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    public final long zzb(zzgn zzgn) {
        zzi(zzgn);
        this.zza = zzgn;
        Uri normalizeScheme = zzgn.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzdx.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = zzfk.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw zzcc.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
                }
            } else {
                this.zzb = URLDecoder.decode(str, zzfsi.zza.name()).getBytes(zzfsi.zzc);
            }
            long j10 = zzgn.zzf;
            int length = this.zzb.length;
            if (j10 <= ((long) length)) {
                int i11 = (int) j10;
                this.zzc = i11;
                int i12 = length - i11;
                this.zzd = i12;
                long j11 = zzgn.zzg;
                if (j11 != -1) {
                    this.zzd = (int) Math.min((long) i12, j11);
                }
                zzj(zzgn);
                long j12 = zzgn.zzg;
                return j12 != -1 ? j12 : (long) this.zzd;
            }
            this.zzb = null;
            throw new zzgj(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw zzcc.zzb("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), (Throwable) null);
    }

    public final Uri zzc() {
        zzgn zzgn = this.zza;
        if (zzgn != null) {
            return zzgn.zza;
        }
        return null;
    }

    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
