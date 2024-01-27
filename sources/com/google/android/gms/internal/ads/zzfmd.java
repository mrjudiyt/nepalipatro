package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfmd extends zzfme {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfmd(zzflw zzflw, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzflw);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
