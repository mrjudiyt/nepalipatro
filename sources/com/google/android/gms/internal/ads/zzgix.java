package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgix {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;

    private zzgix() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgix zza(zzgiu zzgiu) {
        zzgiz zzgiz = new zzgiz(zzgiu.zzc(), zzgiu.zzd(), (zzgiy) null);
        if (this.zza.containsKey(zzgiz)) {
            zzgiu zzgiu2 = (zzgiu) this.zza.get(zzgiz);
            if (!zzgiu2.equals(zzgiu) || !zzgiu.equals(zzgiu2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgiz.toString()));
            }
        } else {
            this.zza.put(zzgiz, zzgiu);
        }
        return this;
    }

    public final zzgix zzb(zzgce zzgce) {
        Map map = this.zzb;
        Class zzb2 = zzgce.zzb();
        if (map.containsKey(zzb2)) {
            zzgce zzgce2 = (zzgce) this.zzb.get(zzb2);
            if (!zzgce2.equals(zzgce) || !zzgce.equals(zzgce2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb2.toString()));
            }
        } else {
            this.zzb.put(zzb2, zzgce);
        }
        return this;
    }

    /* synthetic */ zzgix(zzgiw zzgiw) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* synthetic */ zzgix(zzgjb zzgjb, zzgiw zzgiw) {
        this.zza = new HashMap(zzgjb.zza);
        this.zzb = new HashMap(zzgjb.zzb);
    }
}
