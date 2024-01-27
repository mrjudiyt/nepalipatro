package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class zzfm extends zzcb implements zzdg {
    /* access modifiers changed from: private */
    public static final zzfm zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzfm zzfm = new zzfm();
        zzb = zzfm;
        zzcb.zzp(zzfm.class, zzfm);
    }

    private zzfm() {
    }

    public static zzfl zzv() {
        return (zzfl) zzb.zzg();
    }

    static /* synthetic */ void zzx(zzfm zzfm, String str) {
        str.getClass();
        zzfm.zzd |= 1;
        zzfm.zze = str;
    }

    static /* synthetic */ void zzy(zzfm zzfm, String str) {
        str.getClass();
        zzfm.zzd |= 2;
        zzfm.zzf = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzfm();
        } else {
            if (i11 == 4) {
                return new zzfl((zzfk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
