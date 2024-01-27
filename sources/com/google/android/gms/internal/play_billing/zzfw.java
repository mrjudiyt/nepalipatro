package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class zzfw extends zzcb implements zzdg {
    /* access modifiers changed from: private */
    public static final zzfw zzb;
    private int zzd;
    private int zze;

    static {
        zzfw zzfw = new zzfw();
        zzb = zzfw;
        zzcb.zzp(zzfw.class, zzfw);
    }

    private zzfw() {
    }

    public static zzfu zzv() {
        return (zzfu) zzb.zzg();
    }

    static /* synthetic */ void zzx(zzfw zzfw, int i10) {
        zzfw.zze = i10 - 1;
        zzfw.zzd |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzfv.zza});
        } else if (i11 == 3) {
            return new zzfw();
        } else {
            if (i11 == 4) {
                return new zzfu((zzft) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
