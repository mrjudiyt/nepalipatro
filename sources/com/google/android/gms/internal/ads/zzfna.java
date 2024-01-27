package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfna {
    public static zzfoj zza(Context context, int i10, int i11, String str, String str2, String str3, zzfmq zzfmq) {
        return new zzfmz(context, 1, i11, str, str2, AppEventsConstants.EVENT_PARAM_VALUE_YES, zzfmq).zzb(50000);
    }
}
