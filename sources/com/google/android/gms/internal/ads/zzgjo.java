package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgjo {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    /* synthetic */ zzgjo(zzgji zzgji, zzgjn zzgjn) {
        this.zza = new HashMap(zzgji.zza);
        this.zzb = new HashMap(zzgji.zzb);
        this.zzc = new HashMap(zzgji.zzc);
        this.zzd = new HashMap(zzgji.zzd);
    }

    public final zzgbe zza(zzgjh zzgjh, zzgch zzgch) {
        zzgjk zzgjk = new zzgjk(zzgjh.getClass(), zzgjh.zzd(), (zzgjj) null);
        if (this.zzb.containsKey(zzgjk)) {
            return ((zzghp) this.zzb.get(zzgjk)).zza(zzgjh, zzgch);
        }
        String obj = zzgjk.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }

    public final zzgjh zzb(zzgbw zzgbw, Class cls) {
        zzgjm zzgjm = new zzgjm(zzgbw.getClass(), cls, (zzgjl) null);
        if (this.zzc.containsKey(zzgjm)) {
            return ((zzgiq) this.zzc.get(zzgjm)).zza(zzgbw);
        }
        String obj = zzgjm.toString();
        throw new GeneralSecurityException("No Key Format serializer for " + obj + " available");
    }

    public final boolean zzg(zzgjh zzgjh) {
        return this.zzb.containsKey(new zzgjk(zzgjh.getClass(), zzgjh.zzd(), (zzgjj) null));
    }
}
