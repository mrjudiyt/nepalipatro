package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfxb implements Comparator {
    protected zzfxb() {
    }

    public static zzfxb zzb(Comparator comparator) {
        if (comparator instanceof zzfxb) {
            return (zzfxb) comparator;
        }
        return new zzfvd(comparator);
    }

    public static zzfxb zzc() {
        return zzfwz.zza;
    }

    public abstract int compare(Object obj, Object obj2);

    public zzfxb zza() {
        return new zzfxk(this);
    }
}
