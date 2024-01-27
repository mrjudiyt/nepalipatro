package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zztp extends zztk {
    public static final Object zzd = new Object();
    private final Object zze;
    /* access modifiers changed from: private */
    public final Object zzf;

    private zztp(zzcv zzcv, Object obj, Object obj2) {
        super(zzcv);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zztp zzq(zzbp zzbp) {
        return new zztp(new zztq(zzbp), zzcu.zza, zzd);
    }

    public static zztp zzr(zzcv zzcv, Object obj, Object obj2) {
        return new zztp(zzcv, obj, obj2);
    }

    public final int zza(Object obj) {
        Object obj2;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return this.zzc.zza(obj);
    }

    public final zzcs zzd(int i10, zzcs zzcs, boolean z10) {
        this.zzc.zzd(i10, zzcs, z10);
        if (zzfk.zzE(zzcs.zzc, this.zzf) && z10) {
            zzcs.zzc = zzd;
        }
        return zzcs;
    }

    public final zzcu zze(int i10, zzcu zzcu, long j10) {
        this.zzc.zze(i10, zzcu, j10);
        if (zzfk.zzE(zzcu.zzc, this.zze)) {
            zzcu.zzc = zzcu.zza;
        }
        return zzcu;
    }

    public final Object zzf(int i10) {
        Object zzf2 = this.zzc.zzf(i10);
        return zzfk.zzE(zzf2, this.zzf) ? zzd : zzf2;
    }

    public final zztp zzp(zzcv zzcv) {
        return new zztp(zzcv, this.zze, this.zzf);
    }
}
