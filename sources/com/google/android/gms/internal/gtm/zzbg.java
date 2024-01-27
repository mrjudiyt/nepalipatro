package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.HashMap;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzbg extends zzj<zzbg> {
    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("network", (Object) null);
        hashMap.put(NativeProtocol.WEB_DIALOG_ACTION, (Object) null);
        hashMap.put("target", (Object) null);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzbg zzbg = (zzbg) zzj;
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
        TextUtils.isEmpty((CharSequence) null);
    }
}
