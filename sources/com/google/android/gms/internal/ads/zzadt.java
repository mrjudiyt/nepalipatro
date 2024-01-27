package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzadt extends zzady {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzadt(zzacs zzacs) {
        super(zzacs);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzfb zzfb) {
        if (!this.zzc) {
            int zzl = zzfb.zzl();
            int i10 = zzl >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(zzl >> 2) & 3];
                zzak zzak = new zzak();
                zzak.zzU("audio/mpeg");
                zzak.zzy(1);
                zzak.zzV(i11);
                this.zza.zzl(zzak.zzac());
                this.zzd = true;
            } else if (i10 == 7 || i10 == 8) {
                zzak zzak2 = new zzak();
                zzak2.zzU(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzak2.zzy(1);
                zzak2.zzV(8000);
                this.zza.zzl(zzak2.zzac());
                this.zzd = true;
            } else if (i10 != 10) {
                throw new zzadx("Audio format not supported: " + i10);
            }
            this.zzc = true;
        } else {
            zzfb.zzH(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzfb zzfb, long j10) {
        if (this.zze == 2) {
            int zza = zzfb.zza();
            this.zza.zzr(zzfb, zza);
            this.zza.zzt(j10, 1, zza, 0, (zzacr) null);
            return true;
        }
        int zzl = zzfb.zzl();
        if (zzl == 0 && !this.zzd) {
            int zza2 = zzfb.zza();
            byte[] bArr = new byte[zza2];
            zzfb.zzC(bArr, 0, zza2);
            zzaaj zza3 = zzaak.zza(bArr);
            zzak zzak = new zzak();
            zzak.zzU("audio/mp4a-latm");
            zzak.zzz(zza3.zzc);
            zzak.zzy(zza3.zzb);
            zzak.zzV(zza3.zza);
            zzak.zzK(Collections.singletonList(bArr));
            this.zza.zzl(zzak.zzac());
            this.zzd = true;
            return false;
        } else if (this.zze == 10 && zzl != 1) {
            return false;
        } else {
            int zza4 = zzfb.zza();
            this.zza.zzr(zzfb, zza4);
            this.zza.zzt(j10, 1, zza4, 0, (zzacr) null);
            return true;
        }
    }
}
