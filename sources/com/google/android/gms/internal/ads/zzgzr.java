package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgzr extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgzr zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgyt zzg;
    private zzgyx zzh;
    private int zzi;
    private zzgue zzj = zzgtz.zzaJ();
    private String zzk = "";
    private int zzl;
    private zzgui zzm = zzgtz.zzaN();
    private byte zzn = 2;

    static {
        zzgzr zzgzr = new zzgzr();
        zzb = zzgzr;
        zzgtz.zzaU(zzgzr.class, zzgzr);
    }

    private zzgzr() {
    }

    public static zzgzq zzc() {
        return (zzgzq) zzb.zzaA();
    }

    static /* synthetic */ void zzf(zzgzr zzgzr, int i10) {
        zzgzr.zzd |= 1;
        zzgzr.zze = i10;
    }

    static /* synthetic */ void zzg(zzgzr zzgzr, String str) {
        str.getClass();
        zzgzr.zzd |= 2;
        zzgzr.zzf = str;
    }

    static /* synthetic */ void zzh(zzgzr zzgzr, zzgyt zzgyt) {
        zzgyt.getClass();
        zzgzr.zzg = zzgyt;
        zzgzr.zzd |= 4;
    }

    static /* synthetic */ void zzi(zzgzr zzgzr, String str) {
        str.getClass();
        zzgui zzgui = zzgzr.zzm;
        if (!zzgui.zzc()) {
            zzgzr.zzm = zzgtz.zzaO(zzgui);
        }
        zzgzr.zzm.add(str);
    }

    static /* synthetic */ void zzj(zzgzr zzgzr, int i10) {
        zzgzr.zzl = i10 - 1;
        zzgzr.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzn);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgzo.zza, "zzm"});
        } else if (i11 == 3) {
            return new zzgzr();
        } else {
            if (i11 == 4) {
                return new zzgzq((zzgxt) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzn = b10;
            return null;
        }
    }

    public final String zze() {
        return this.zzf;
    }
}
