package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzace {
    private final zzfb zza = new zzfb(10);

    public final zzby zza(zzabn zzabn, zzafe zzafe) {
        zzby zzby = null;
        int i10 = 0;
        while (true) {
            try {
                ((zzabc) zzabn).zzm(this.zza.zzI(), 0, 10, false);
                this.zza.zzG(0);
                if (this.zza.zzn() != 4801587) {
                    break;
                }
                this.zza.zzH(3);
                int zzk = this.zza.zzk();
                int i11 = zzk + 10;
                if (zzby == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.zza.zzI(), 0, bArr, 0, 10);
                    ((zzabc) zzabn).zzm(bArr, 10, zzk, false);
                    zzby = zzafg.zza(bArr, i11, zzafe, new zzaeh());
                } else {
                    ((zzabc) zzabn).zzl(zzk, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzabn.zzj();
        ((zzabc) zzabn).zzl(i10, false);
        return zzby;
    }
}
