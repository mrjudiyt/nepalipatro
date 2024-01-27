package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfmh extends zzfmd {
    public zzfmh(zzflw zzflw, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzflw, hashSet, jSONObject, j10);
    }

    private final void zzc(String str) {
        zzfku zza = zzfku.zza();
        if (zza != null) {
            for (zzfkg zzfkg : zza.zzc()) {
                if (this.zza.contains(zzfkg.zzh())) {
                    zzfkg.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
