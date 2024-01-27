package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzayh extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzayh zzb;
    private int zzd;
    private int zze;
    private int zzf = 1000;
    private zzayx zzg;
    private zzayz zzh;
    private zzgui zzi = zzgtz.zzaN();
    private zzazb zzj;
    private zzbal zzk;
    private zzbab zzl;
    private zzazp zzm;
    private zzazr zzn;
    private zzgui zzo = zzgtz.zzaN();

    static {
        zzayh zzayh = new zzayh();
        zzb = zzayh;
        zzgtz.zzaU(zzayh.class, zzayh);
    }

    private zzayh() {
    }

    public static zzayh zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzayh zzayh, zzayf zzayf) {
        zzayh.zze = zzayf.zza();
        zzayh.zzd |= 1;
    }

    static /* synthetic */ void zzf(zzayh zzayh, zzayz zzayz) {
        zzayz.getClass();
        zzayh.zzh = zzayz;
        zzayh.zzd |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zzaye.zza, "zzf", zzazi.zza, "zzg", "zzh", "zzi", zzayv.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzbax.class});
        } else if (i11 == 3) {
            return new zzayh();
        } else {
            if (i11 == 4) {
                return new zzayg((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzayz zzd() {
        zzayz zzayz = this.zzh;
        return zzayz == null ? zzayz.zzc() : zzayz;
    }
}
