package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzepi implements zzetv {
    private final Integer zza;

    private zzepi(Integer num) {
        this.zza = num;
    }

    static /* bridge */ /* synthetic */ zzepi zzb() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzju)).booleanValue()) {
            return new zzepi((Integer) null);
        }
        zzt.zzp();
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            i10 = SdkExtensions.getExtensionVersion(1000000);
        }
        return new zzepi(Integer.valueOf(i10));
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
