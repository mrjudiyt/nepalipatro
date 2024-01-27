package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzbh extends zzj<zzbh> {
    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("variableName", (Object) null);
        hashMap.put("timeInMillis", 0L);
        hashMap.put("category", (Object) null);
        hashMap.put(Constants.ScionAnalytics.PARAM_LABEL, (Object) null);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzbh zzbh = (zzbh) zzj;
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
    }
}
