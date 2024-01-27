package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzayq extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzayq zzb;
    private zzgui zzd = zzgtz.zzaN();

    static {
        zzayq zzayq = new zzayq();
        zzb = zzayq;
        zzgtz.zzaU(zzayq.class, zzayq);
    }

    private zzayq() {
    }

    public static zzayk zza() {
        return (zzayk) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzayq zzayq, zzayj zzayj) {
        zzayj.getClass();
        zzgui zzgui = zzayq.zzd;
        if (!zzgui.zzc()) {
            zzayq.zzd = zzgtz.zzaO(zzgui);
        }
        zzayq.zzd.add(zzayj);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzayj.class});
        } else if (i11 == 3) {
            return new zzayq();
        } else {
            if (i11 == 4) {
                return new zzayk((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
