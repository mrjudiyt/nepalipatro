package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.dynamiclinks.DynamicLink;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeuf implements zzetv {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzeuf(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = z10;
        this.zzf = i13;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z10 = true;
        zzfdz.zzf(bundle, "carrier", this.zza, !TextUtils.isEmpty(this.zza));
        int i10 = this.zzb;
        if (i10 == -2) {
            z10 = false;
        }
        zzfdz.zze(bundle, "cnt", i10, z10);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, this.zzd);
        Bundle zza2 = zzfdz.zza(bundle, DeviceRequestsHelper.DEVICE_INFO_DEVICE);
        bundle.putBundle(DeviceRequestsHelper.DEVICE_INFO_DEVICE, zza2);
        Bundle zza3 = zzfdz.zza(zza2, "network");
        zza2.putBundle("network", zza3);
        zza3.putInt("active_network_state", this.zzf);
        zza3.putBoolean("active_network_metered", this.zze);
    }
}
