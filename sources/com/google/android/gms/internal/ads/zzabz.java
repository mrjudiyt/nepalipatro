package com.google.android.gms.internal.ads;

import io.flutter.embedding.android.KeyboardMap;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzabz {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzaby zzk;
    private final zzby zzl;

    private zzabz(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, zzaby zzaby, zzby zzby) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j10;
        this.zzk = zzaby;
        this.zzl = zzby;
    }

    public zzabz(byte[] bArr, int i10) {
        zzfa zzfa = new zzfa(bArr, bArr.length);
        zzfa.zzj(i10 * 8);
        this.zza = zzfa.zzd(16);
        this.zzb = zzfa.zzd(16);
        this.zzc = zzfa.zzd(24);
        this.zzd = zzfa.zzd(24);
        int zzd2 = zzfa.zzd(20);
        this.zze = zzd2;
        this.zzf = zzi(zzd2);
        this.zzg = zzfa.zzd(3) + 1;
        int zzd3 = zzfa.zzd(5) + 1;
        this.zzh = zzd3;
        this.zzi = zzh(zzd3);
        int zzd4 = zzfa.zzd(4);
        int zzd5 = zzfa.zzd(32);
        int i11 = zzfk.zza;
        this.zzj = ((((long) zzd4) & KeyboardMap.kValueMask) << 32) | (((long) zzd5) & KeyboardMap.kValueMask);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j10) {
        return Math.max(0, Math.min((j10 * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final zzam zzc(byte[] bArr, zzby zzby) {
        bArr[4] = Byte.MIN_VALUE;
        zzby zzd2 = zzd(zzby);
        zzak zzak = new zzak();
        zzak.zzU("audio/flac");
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzak.zzN(i10);
        zzak.zzy(this.zzg);
        zzak.zzV(this.zze);
        zzak.zzK(Collections.singletonList(bArr));
        zzak.zzO(zzd2);
        return zzak.zzac();
    }

    public final zzby zzd(zzby zzby) {
        zzby zzby2 = this.zzl;
        return zzby2 == null ? zzby : zzby2.zzd(zzby);
    }

    public final zzabz zze(List list) {
        return new zzabz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzby(list)));
    }

    public final zzabz zzf(zzaby zzaby) {
        return new zzabz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzaby, this.zzl);
    }

    public final zzabz zzg(List list) {
        return new zzabz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzacy.zzb(list)));
    }
}
