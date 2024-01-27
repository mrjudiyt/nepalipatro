package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzapi extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzapi zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzapi zzapi = new zzapi();
        zzb = zzapi;
        zzgtz.zzaU(zzapi.class, zzapi);
    }

    private zzapi() {
    }

    public static zzaph zza() {
        return (zzaph) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzapi zzapi, long j10) {
        zzapi.zzd |= 1;
        zzapi.zze = j10;
    }

    static /* synthetic */ void zze(zzapi zzapi, long j10) {
        zzapi.zzd |= 4;
        zzapi.zzg = j10;
    }

    static /* synthetic */ void zzf(zzapi zzapi, long j10) {
        zzapi.zzd |= 8;
        zzapi.zzh = j10;
    }

    static /* synthetic */ void zzg(zzapi zzapi, long j10) {
        zzapi.zzd |= 16;
        zzapi.zzi = j10;
    }

    static /* synthetic */ void zzh(zzapi zzapi, long j10) {
        zzapi.zzd |= 32;
        zzapi.zzj = j10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i11 == 3) {
            return new zzapi();
        } else {
            if (i11 == 4) {
                return new zzaph((zzaol) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
