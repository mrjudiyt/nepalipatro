package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzepq implements zzetv {
    public final double zza;
    public final boolean zzb;

    public zzepq(double d10, boolean z10) {
        this.zza = d10;
        this.zzb = z10;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza2 = zzfdz.zza(bundle, DeviceRequestsHelper.DEVICE_INFO_DEVICE);
        bundle.putBundle(DeviceRequestsHelper.DEVICE_INFO_DEVICE, zza2);
        Bundle zza3 = zzfdz.zza(zza2, "battery");
        zza2.putBundle("battery", zza3);
        zza3.putBoolean("is_charging", this.zzb);
        zza3.putDouble("battery_level", this.zza);
    }
}
