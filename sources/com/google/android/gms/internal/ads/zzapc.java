package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzapc extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzapc zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzapc zzapc = new zzapc();
        zzb = zzapc;
        zzgtz.zzaU(zzapc.class, zzapc);
    }

    private zzapc() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzaor.zza, "zzf"});
        } else if (i11 == 3) {
            return new zzapc();
        } else {
            if (i11 == 4) {
                return new zzapb((zzaol) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
