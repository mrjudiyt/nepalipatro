package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzerk implements zzetv {
    public final Bundle zza;

    public zzerk(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza2 = zzfdz.zza(bundle, DeviceRequestsHelper.DEVICE_INFO_DEVICE);
        zza2.putBundle("android_mem_info", this.zza);
        bundle.putBundle(DeviceRequestsHelper.DEVICE_INFO_DEVICE, zza2);
    }
}
