package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzfto implements zzftm {
    private static final zzftm zza = zzftn.zza;
    private volatile zzftm zzb;
    private Object zzc;

    zzfto(zzftm zzftm) {
        this.zzb = zzftm;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    public final Object zza() {
        zzftm zzftm = this.zzb;
        zzftm zzftm2 = zza;
        if (zzftm != zzftm2) {
            synchronized (this) {
                if (this.zzb != zzftm2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzftm2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
