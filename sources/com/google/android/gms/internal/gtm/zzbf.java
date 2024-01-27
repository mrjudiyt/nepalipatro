package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.UUID;

@ShowFirstParty
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzbf extends zzj<zzbf> {
    private int zza;

    public zzbf() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            leastSignificantBits = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Preconditions.checkNotZero(leastSignificantBits);
        this.zza = leastSignificantBits;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", (Object) null);
        Boolean bool = Boolean.FALSE;
        hashMap.put("interstitial", bool);
        hashMap.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, bool);
        hashMap.put("screenId", Integer.valueOf(this.zza));
        hashMap.put("referrerScreenId", 0);
        hashMap.put("referrerScreenName", (Object) null);
        hashMap.put("referrerUri", (Object) null);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzbf zzbf = (zzbf) zzj;
        TextUtils.isEmpty((CharSequence) null);
        int i10 = this.zza;
        if (i10 != 0) {
            zzbf.zza = i10;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            TextUtils.isEmpty((CharSequence) null);
        }
    }

    public final int zzd() {
        return this.zza;
    }
}
