package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgpx extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgpx zzb;
    private String zzd = "";

    static {
        zzgpx zzgpx = new zzgpx();
        zzb = zzgpx;
        zzgtz.zzaU(zzgpx.class, zzgpx);
    }

    private zzgpx() {
    }

    public static zzgpx zzc() {
        return zzb;
    }

    public static zzgpx zzd(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgpx) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzgpx();
        } else {
            if (i11 == 4) {
                return new zzgpw((zzgpv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zze() {
        return this.zzd;
    }
}
