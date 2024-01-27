package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgji {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    public zzgji() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgji zza(zzghp zzghp) {
        zzgjk zzgjk = new zzgjk(zzghp.zzd(), zzghp.zzc(), (zzgjj) null);
        if (this.zzb.containsKey(zzgjk)) {
            zzghp zzghp2 = (zzghp) this.zzb.get(zzgjk);
            if (!zzghp2.equals(zzghp) || !zzghp.equals(zzghp2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgjk.toString()));
            }
        } else {
            this.zzb.put(zzgjk, zzghp);
        }
        return this;
    }

    public final zzgji zzb(zzght zzght) {
        zzgjm zzgjm = new zzgjm(zzght.zzb(), zzght.zzc(), (zzgjl) null);
        if (this.zza.containsKey(zzgjm)) {
            zzght zzght2 = (zzght) this.zza.get(zzgjm);
            if (!zzght2.equals(zzght) || !zzght.equals(zzght2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgjm.toString()));
            }
        } else {
            this.zza.put(zzgjm, zzght);
        }
        return this;
    }

    public final zzgji zzc(zzgim zzgim) {
        zzgjk zzgjk = new zzgjk(zzgim.zzc(), zzgim.zzb(), (zzgjj) null);
        if (this.zzd.containsKey(zzgjk)) {
            zzgim zzgim2 = (zzgim) this.zzd.get(zzgjk);
            if (!zzgim2.equals(zzgim) || !zzgim.equals(zzgim2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgjk.toString()));
            }
        } else {
            this.zzd.put(zzgjk, zzgim);
        }
        return this;
    }

    public final zzgji zzd(zzgiq zzgiq) {
        zzgjm zzgjm = new zzgjm(zzgiq.zzc(), zzgiq.zzd(), (zzgjl) null);
        if (this.zzc.containsKey(zzgjm)) {
            zzgiq zzgiq2 = (zzgiq) this.zzc.get(zzgjm);
            if (!zzgiq2.equals(zzgiq) || !zzgiq.equals(zzgiq2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgjm.toString()));
            }
        } else {
            this.zzc.put(zzgjm, zzgiq);
        }
        return this;
    }

    public zzgji(zzgjo zzgjo) {
        this.zza = new HashMap(zzgjo.zza);
        this.zzb = new HashMap(zzgjo.zzb);
        this.zzc = new HashMap(zzgjo.zzc);
        this.zzd = new HashMap(zzgjo.zzd);
    }
}
