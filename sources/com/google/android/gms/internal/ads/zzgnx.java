package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgnx extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgnx zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzgnx zzgnx = new zzgnx();
        zzb = zzgnx;
        zzgtz.zzaU(zzgnx.class, zzgnx);
    }

    private zzgnx() {
    }

    public static zzgnw zzc() {
        return (zzgnw) zzb.zzaA();
    }

    public static zzgnx zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgnx) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgnx();
        } else {
            if (i11 == 4) {
                return new zzgnw((zzgnv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
