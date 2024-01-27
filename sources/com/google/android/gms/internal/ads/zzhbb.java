package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhbb implements zzhbp, zzhaw {
    private static final Object zza = new Object();
    private volatile zzhbp zzb;
    private volatile Object zzc = zza;

    private zzhbb(zzhbp zzhbp) {
        this.zzb = zzhbp;
    }

    public static zzhaw zza(zzhbp zzhbp) {
        if (zzhbp instanceof zzhaw) {
            return (zzhaw) zzhbp;
        }
        Objects.requireNonNull(zzhbp);
        return new zzhbb(zzhbp);
    }

    public static zzhbp zzc(zzhbp zzhbp) {
        return zzhbp instanceof zzhbb ? zzhbp : new zzhbb(zzhbp);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
