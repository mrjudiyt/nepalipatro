package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzn implements Callable {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ Uri zzb;
    public final /* synthetic */ IObjectWrapper zzc;

    public /* synthetic */ zzn(zzaa zzaa, Uri uri, IObjectWrapper iObjectWrapper) {
        this.zza = zzaa;
        this.zzb = uri;
        this.zzc = iObjectWrapper;
    }

    public final Object call() {
        return this.zza.zzm(this.zzb, this.zzc);
    }
}
