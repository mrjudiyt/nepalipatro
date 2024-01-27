package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzevq implements zzfza {
    public static final /* synthetic */ zzevq zza = new zzevq();

    private /* synthetic */ zzevq() {
    }

    public final e zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzfzt.zzh(new zzevt((String) null, -1));
        }
        return zzfzt.zzh(new zzevt(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
