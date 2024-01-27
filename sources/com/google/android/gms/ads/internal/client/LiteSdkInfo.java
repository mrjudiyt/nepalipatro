package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbox;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(Context context) {
    }

    public zzbox getAdapterCreator() {
        return new zzbou();
    }

    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, 233702000, "22.5.0");
    }
}
