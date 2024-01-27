package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzbc extends zzj<zzbc> {
    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", (Object) null);
        hashMap.put(NativeProtocol.WEB_DIALOG_ACTION, (Object) null);
        hashMap.put(Constants.ScionAnalytics.PARAM_LABEL, (Object) null);
        hashMap.put("value", 0L);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzbc zzbc = (zzbc) zzj;
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
    }
}
