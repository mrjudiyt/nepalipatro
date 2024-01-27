package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;

@ShowFirstParty
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzba extends zzj<zzba> {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zzc);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.zza));
        hashMap.put("screenHeight", Integer.valueOf(this.zzb));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzba zzba = (zzba) zzj;
        int i10 = this.zza;
        if (i10 != 0) {
            zzba.zza = i10;
        }
        int i11 = this.zzb;
        if (i11 != 0) {
            zzba.zzb = i11;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzba.zzc = this.zzc;
        }
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
