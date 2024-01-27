package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgjb {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;

    /* synthetic */ zzgjb(zzgix zzgix, zzgja zzgja) {
        this.zza = new HashMap(zzgix.zza);
        this.zzb = new HashMap(zzgix.zzb);
    }

    public final Class zza(Class cls) {
        if (this.zzb.containsKey(cls)) {
            return ((zzgce) this.zzb.get(cls)).zza();
        }
        String obj = cls.toString();
        throw new GeneralSecurityException("No input primitive class for " + obj + " available");
    }

    public final Object zzb(zzgbe zzgbe, Class cls) {
        zzgiz zzgiz = new zzgiz(zzgbe.getClass(), cls, (zzgiy) null);
        if (this.zza.containsKey(zzgiz)) {
            return ((zzgiu) this.zza.get(zzgiz)).zza(zzgbe);
        }
        String obj = zzgiz.toString();
        throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available");
    }

    public final Object zzc(zzgcd zzgcd, Class cls) {
        if (this.zzb.containsKey(cls)) {
            zzgce zzgce = (zzgce) this.zzb.get(cls);
            if (zzgcd.zzc().equals(zzgce.zza()) && zzgce.zza().equals(zzgcd.zzc())) {
                return zzgce.zzc(zzgcd);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
