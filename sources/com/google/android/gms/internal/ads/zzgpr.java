package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgpr extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgpr zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgui zze = zzgtz.zzaN();

    static {
        zzgpr zzgpr = new zzgpr();
        zzb = zzgpr;
        zzgtz.zzaU(zzgpr.class, zzgpr);
    }

    private zzgpr() {
    }

    public static zzgpo zza() {
        return (zzgpo) zzb.zzaA();
    }

    static /* synthetic */ void zze(zzgpr zzgpr, zzgpq zzgpq) {
        zzgpq.getClass();
        zzgui zzgui = zzgpr.zze;
        if (!zzgui.zzc()) {
            zzgpr.zze = zzgtz.zzaO(zzgui);
        }
        zzgpr.zze.add(zzgpq);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgpq.class});
        } else if (i11 == 3) {
            return new zzgpr();
        } else {
            if (i11 == 4) {
                return new zzgpo((zzgpn) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
