package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzbd extends zzj<zzbd> {
    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", (Object) null);
        hashMap.put(Constants.FATAL, Boolean.FALSE);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzbd zzbd = (zzbd) zzj;
        TextUtils.isEmpty((CharSequence) null);
    }
}
