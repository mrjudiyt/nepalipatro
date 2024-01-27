package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfjp extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzfjp zzb;
    /* access modifiers changed from: private */
    public zzgui zzd = zzgtz.zzaN();

    static {
        zzfjp zzfjp = new zzfjp();
        zzb = zzfjp;
        zzgtz.zzaU(zzfjp.class, zzfjp);
    }

    private zzfjp() {
    }

    public static zzfjm zzc() {
        return (zzfjm) zzb.zzaA();
    }

    static /* synthetic */ void zzf(zzfjp zzfjp, zzfjo zzfjo) {
        zzfjo.getClass();
        zzgui zzgui = zzfjp.zzd;
        if (!zzgui.zzc()) {
            zzfjp.zzd = zzgtz.zzaO(zzgui);
        }
        zzfjp.zzd.add(zzfjo);
    }

    public final int zza() {
        return this.zzd.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfjo.class});
        } else if (i11 == 3) {
            return new zzfjp();
        } else {
            if (i11 == 4) {
                return new zzfjm((zzfjl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
