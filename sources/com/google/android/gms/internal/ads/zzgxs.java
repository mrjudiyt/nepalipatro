package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgxs extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgxs zzb;
    private zzgui zzd = zzgtz.zzaN();

    static {
        zzgxs zzgxs = new zzgxs();
        zzb = zzgxs;
        zzgtz.zzaU(zzgxs.class, zzgxs);
    }

    private zzgxs() {
    }

    public static zzgxr zza() {
        return (zzgxr) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgxs zzgxs, zzgxq zzgxq) {
        zzgxq.getClass();
        zzgui zzgui = zzgxs.zzd;
        if (!zzgui.zzc()) {
            zzgxs.zzd = zzgtz.zzaO(zzgui);
        }
        zzgxs.zzd.add(zzgxq);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgxq.class});
        } else if (i11 == 3) {
            return new zzgxs();
        } else {
            if (i11 == 4) {
                return new zzgxr((zzgxo) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
