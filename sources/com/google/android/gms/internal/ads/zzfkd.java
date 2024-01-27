package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfkd {
    private final zzfkl zza;
    private final zzfkl zzb;
    private final zzfkh zzc;
    private final zzfkk zzd;

    private zzfkd(zzfkh zzfkh, zzfkk zzfkk, zzfkl zzfkl, zzfkl zzfkl2, boolean z10) {
        this.zzc = zzfkh;
        this.zzd = zzfkk;
        this.zza = zzfkl;
        if (zzfkl2 == null) {
            this.zzb = zzfkl.NONE;
        } else {
            this.zzb = zzfkl2;
        }
    }

    public static zzfkd zza(zzfkh zzfkh, zzfkk zzfkk, zzfkl zzfkl, zzfkl zzfkl2, boolean z10) {
        zzfls.zzb(zzfkk, "ImpressionType is null");
        zzfls.zzb(zzfkl, "Impression owner is null");
        if (zzfkl == zzfkl.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (zzfkh == zzfkh.DEFINED_BY_JAVASCRIPT && zzfkl == zzfkl.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (zzfkk != zzfkk.DEFINED_BY_JAVASCRIPT || zzfkl != zzfkl.NATIVE) {
            return new zzfkd(zzfkh, zzfkk, zzfkl, zzfkl2, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfln.zze(jSONObject, "impressionOwner", this.zza);
        zzfln.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfln.zze(jSONObject, "creativeType", this.zzc);
        zzfln.zze(jSONObject, "impressionType", this.zzd);
        zzfln.zze(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
