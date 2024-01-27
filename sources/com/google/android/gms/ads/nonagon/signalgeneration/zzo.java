package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzfza;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzo implements zzfza {
    public final /* synthetic */ zzaa zza;

    public /* synthetic */ zzo(zzaa zzaa) {
        this.zza = zzaa;
    }

    public final e zza(Object obj) {
        return zzfzt.zzm(this.zza.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzp(this.zza, (Uri) obj), this.zza.zzk);
    }
}
