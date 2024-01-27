package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzew extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzez zza;

    public zzew(zzez zzez) {
        this.zza = zzez;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        boolean z10 = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        zzez zzez = this.zza;
        if (true == z10) {
            i10 = 10;
        }
        zzez.zzc(zzez, i10);
    }
}
