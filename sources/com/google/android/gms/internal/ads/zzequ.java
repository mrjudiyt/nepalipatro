package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.appevents.AppEventsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzequ implements zzetv {
    public final String zza;
    public final boolean zzb;

    public zzequ(String str, boolean z10) {
        this.zza = str;
        this.zzb = z10;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
    }
}
