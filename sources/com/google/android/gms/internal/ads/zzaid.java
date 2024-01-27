package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaid extends zzain {
    private zzabz zza;
    private zzaic zzb;

    zzaid() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final long zza(zzfb zzfb) {
        if (!zzd(zzfb.zzI())) {
            return -1;
        }
        int i10 = (zzfb.zzI()[2] & 255) >> 4;
        if (i10 != 6) {
            if (i10 == 7) {
                i10 = 7;
            }
            int zza2 = zzabv.zza(zzfb, i10);
            zzfb.zzG(0);
            return (long) zza2;
        }
        zzfb.zzH(4);
        zzfb.zzv();
        int zza22 = zzabv.zza(zzfb, i10);
        zzfb.zzG(0);
        return (long) zza22;
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(zzfb zzfb, long j10, zzaik zzaik) {
        byte[] zzI = zzfb.zzI();
        zzabz zzabz = this.zza;
        if (zzabz == null) {
            zzabz zzabz2 = new zzabz(zzI, 17);
            this.zza = zzabz2;
            zzaik.zza = zzabz2.zzc(Arrays.copyOfRange(zzI, 9, zzfb.zzd()), (zzby) null);
            return true;
        } else if ((zzI[0] & Byte.MAX_VALUE) == 3) {
            zzaby zzb2 = zzabw.zzb(zzfb);
            zzabz zzf = zzabz.zzf(zzb2);
            this.zza = zzf;
            this.zzb = new zzaic(zzf, zzb2);
            return true;
        } else if (!zzd(zzI)) {
            return true;
        } else {
            zzaic zzaic = this.zzb;
            if (zzaic != null) {
                zzaic.zza(j10);
                zzaik.zzb = this.zzb;
            }
            Objects.requireNonNull(zzaik.zza);
            return false;
        }
    }
}
