package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfmi extends zzfmd {
    public zzfmi(zzflw zzflw, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzflw, hashSet, jSONObject, j10);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfln.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzfku zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfku.zza()) != null) {
            for (zzfkg zzfkg : zza.zzc()) {
                if (this.zza.contains(zzfkg.zzh())) {
                    zzfkg.zzg().zzf(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
