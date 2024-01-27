package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.appevents.AppEventsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzenj implements zzetv {
    private final boolean zza;

    public zzenj(boolean z10) {
        this.zza = z10;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
    }
}
