package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaij extends zzain {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzaij() {
    }

    public static boolean zzd(zzfb zzfb) {
        return zzk(zzfb, zza);
    }

    private static boolean zzk(zzfb zzfb, byte[] bArr) {
        if (zzfb.zza() < 8) {
            return false;
        }
        int zzc2 = zzfb.zzc();
        byte[] bArr2 = new byte[8];
        zzfb.zzC(bArr2, 0, 8);
        zzfb.zzG(zzc2);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public final long zza(zzfb zzfb) {
        return zzg(zzaci.zzd(zzfb.zzI()));
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(zzfb zzfb, long j10, zzaik zzaik) {
        if (zzk(zzfb, zza)) {
            byte[] copyOf = Arrays.copyOf(zzfb.zzI(), zzfb.zzd());
            byte b10 = copyOf[9] & 255;
            List zze = zzaci.zze(copyOf);
            if (zzaik.zza != null) {
                return true;
            }
            zzak zzak = new zzak();
            zzak.zzU("audio/opus");
            zzak.zzy(b10);
            zzak.zzV(48000);
            zzak.zzK(zze);
            zzaik.zza = zzak.zzac();
            return true;
        } else if (zzk(zzfb, zzb)) {
            zzdx.zzb(zzaik.zza);
            if (this.zzc) {
                return true;
            }
            this.zzc = true;
            zzfb.zzH(8);
            zzby zzb2 = zzacy.zzb(zzfvs.zzk(zzacy.zzc(zzfb, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzak zzb3 = zzaik.zza.zzb();
            zzb3.zzO(zzb2.zzd(zzaik.zza.zzk));
            zzaik.zza = zzb3.zzac();
            return true;
        } else {
            zzdx.zzb(zzaik.zza);
            return false;
        }
    }
}
