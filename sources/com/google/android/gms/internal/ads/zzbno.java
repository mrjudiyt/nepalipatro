package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbno implements zzbmf, zzbnn {
    private final zzbnn zza;
    private final HashSet zzb = new HashSet();

    public zzbno(zzbnn zzbnn) {
        this.zza = zzbnn;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbme.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbjj) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbjj) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbme.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbme.zzb(this, str, jSONObject);
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbme.zzd(this, str, jSONObject);
    }

    public final void zzq(String str, zzbjj zzbjj) {
        this.zza.zzq(str, zzbjj);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbjj));
    }

    public final void zzr(String str, zzbjj zzbjj) {
        this.zza.zzr(str, zzbjj);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbjj));
    }
}
