package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzghk {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzghk(Map map, Map map2, zzghj zzghj) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzghi zza() {
        return new zzghi((zzghh) null);
    }

    public final Enum zzb(Object obj) {
        Enum enumR = (Enum) this.zzb.get(obj);
        if (enumR != null) {
            return enumR;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum enumR) {
        Object obj = this.zza.get(enumR);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(enumR)));
    }
}
