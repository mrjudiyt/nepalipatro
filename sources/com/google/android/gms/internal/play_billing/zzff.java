package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class zzff extends zzcb implements zzdg {
    /* access modifiers changed from: private */
    public static final zzff zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        zzff zzff = new zzff();
        zzb = zzff;
        zzcb.zzp(zzff.class, zzff);
    }

    private zzff() {
    }

    public static zzfe zzv() {
        return (zzfe) zzb.zzg();
    }

    static /* synthetic */ void zzx(zzff zzff, zzfw zzfw) {
        zzfw.getClass();
        zzff.zzf = zzfw;
        zzff.zze = 2;
    }

    static /* synthetic */ void zzy(zzff zzff, int i10) {
        zzff.zzg = i10 - 1;
        zzff.zzd |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzfc.zza, zzfw.class});
        } else if (i11 == 3) {
            return new zzff();
        } else {
            if (i11 == 4) {
                return new zzfe((zzfd) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
