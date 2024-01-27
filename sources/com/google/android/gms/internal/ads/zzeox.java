package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeox implements zzfsk {
    public static final /* synthetic */ zzeox zza = new zzeox();

    private /* synthetic */ zzeox() {
    }

    public final Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzepb(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
