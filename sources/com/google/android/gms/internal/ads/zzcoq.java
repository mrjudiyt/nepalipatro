package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcoq implements zzfza {
    public final /* synthetic */ Uri.Builder zza;

    public /* synthetic */ zzcoq(Uri.Builder builder) {
        this.zza = builder;
    }

    public final e zza(Object obj) {
        zzbca zzbca = zzbci.zzjx;
        Uri.Builder builder = this.zza;
        builder.appendQueryParameter((String) zzba.zzc().zzb(zzbca), "12");
        return zzfzt.zzh(builder.toString());
    }
}
