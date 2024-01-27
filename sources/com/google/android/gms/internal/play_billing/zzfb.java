package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class zzfb extends zzcb implements zzdg {
    /* access modifiers changed from: private */
    public static final zzfb zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzfj zzh;
    private zzfs zzi;

    static {
        zzfb zzfb = new zzfb();
        zzb = zzfb;
        zzcb.zzp(zzfb.class, zzfb);
    }

    private zzfb() {
    }

    static /* synthetic */ void zzA(zzfb zzfb, int i10) {
        zzfb.zzg = i10 - 1;
        zzfb.zzd |= 1;
    }

    public static zzfa zzv() {
        return (zzfa) zzb.zzg();
    }

    public static zzfb zzx(byte[] bArr, zzbn zzbn) {
        return (zzfb) zzcb.zzj(zzb, bArr, zzbn);
    }

    static /* synthetic */ void zzy(zzfb zzfb, zzfj zzfj) {
        zzfj.getClass();
        zzfb.zzh = zzfj;
        zzfb.zzd |= 2;
    }

    static /* synthetic */ void zzz(zzfb zzfb, zzfw zzfw) {
        zzfw.getClass();
        zzfb.zzf = zzfw;
        zzfb.zze = 4;
    }

    /* access modifiers changed from: protected */
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzfc.zza, "zzh", "zzi", zzfw.class});
        } else if (i11 == 3) {
            return new zzfb();
        } else {
            if (i11 == 4) {
                return new zzfa((zzez) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
