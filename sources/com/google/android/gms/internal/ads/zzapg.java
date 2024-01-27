package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzapg extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzapg zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt;
    private long zzu;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzapg zzapg = new zzapg();
        zzb = zzapg;
        zzgtz.zzaU(zzapg.class, zzapg);
    }

    private zzapg() {
    }

    public static zzapf zza() {
        return (zzapf) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzapg zzapg, long j10) {
        zzapg.zzd |= 1;
        zzapg.zze = j10;
    }

    static /* synthetic */ void zze(zzapg zzapg, long j10) {
        zzapg.zzd |= 2;
        zzapg.zzf = j10;
    }

    static /* synthetic */ void zzf(zzapg zzapg, long j10) {
        zzapg.zzd |= 4;
        zzapg.zzg = j10;
    }

    static /* synthetic */ void zzg(zzapg zzapg, long j10) {
        zzapg.zzd |= 8;
        zzapg.zzh = j10;
    }

    static /* synthetic */ void zzh(zzapg zzapg) {
        zzapg.zzd &= -9;
        zzapg.zzh = -1;
    }

    static /* synthetic */ void zzi(zzapg zzapg, long j10) {
        zzapg.zzd |= 16;
        zzapg.zzi = j10;
    }

    static /* synthetic */ void zzj(zzapg zzapg, long j10) {
        zzapg.zzd |= 32;
        zzapg.zzj = j10;
    }

    static /* synthetic */ void zzk(zzapg zzapg, long j10) {
        zzapg.zzd |= 128;
        zzapg.zzl = j10;
    }

    static /* synthetic */ void zzl(zzapg zzapg, long j10) {
        zzapg.zzd |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzapg.zzm = j10;
    }

    static /* synthetic */ void zzm(zzapg zzapg, long j10) {
        zzapg.zzd |= 512;
        zzapg.zzn = j10;
    }

    static /* synthetic */ void zzn(zzapg zzapg, long j10) {
        zzapg.zzd |= 2048;
        zzapg.zzp = j10;
    }

    static /* synthetic */ void zzo(zzapg zzapg, long j10) {
        zzapg.zzd |= 4096;
        zzapg.zzq = j10;
    }

    static /* synthetic */ void zzp(zzapg zzapg, long j10) {
        zzapg.zzd |= 8192;
        zzapg.zzr = j10;
    }

    static /* synthetic */ void zzq(zzapg zzapg, long j10) {
        zzapg.zzd |= 16384;
        zzapg.zzs = j10;
    }

    static /* synthetic */ void zzr(zzapg zzapg, long j10) {
        zzapg.zzd |= 32768;
        zzapg.zzt = j10;
    }

    static /* synthetic */ void zzs(zzapg zzapg, long j10) {
        zzapg.zzd |= NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        zzapg.zzu = j10;
    }

    static /* synthetic */ void zzt(zzapg zzapg, long j10) {
        zzapg.zzd |= 131072;
        zzapg.zzv = j10;
    }

    static /* synthetic */ void zzu(zzapg zzapg, long j10) {
        zzapg.zzd |= 262144;
        zzapg.zzw = j10;
    }

    static /* synthetic */ void zzv(zzapg zzapg, int i10) {
        zzapg.zzk = i10 - 1;
        zzapg.zzd |= 64;
    }

    static /* synthetic */ void zzw(zzapg zzapg, int i10) {
        zzapg.zzo = i10 - 1;
        zzapg.zzd |= 1024;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgud zzgud = zzapp.zza;
            return zzgtz.zzaR(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgud, "zzl", "zzm", "zzn", "zzo", zzgud, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        } else if (i11 == 3) {
            return new zzapg();
        } else {
            if (i11 == 4) {
                return new zzapf((zzaol) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
