package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhbo implements zzhbp {
    private static final Object zza = new Object();
    private volatile zzhbp zzb;
    private volatile Object zzc = zza;

    private zzhbo(zzhbp zzhbp) {
        this.zzb = zzhbp;
    }

    public static zzhbp zza(zzhbp zzhbp) {
        return ((zzhbp instanceof zzhbo) || (zzhbp instanceof zzhbb)) ? zzhbp : new zzhbo(zzhbp);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhbp zzhbp = this.zzb;
        if (zzhbp == null) {
            return this.zzc;
        }
        Object zzb2 = zzhbp.zzb();
        this.zzc = zzb2;
        this.zzb = null;
        return zzb2;
    }
}
