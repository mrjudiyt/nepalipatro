package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzu implements Callable {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ List zzb;
    public final /* synthetic */ IObjectWrapper zzc;

    public /* synthetic */ zzu(zzaa zzaa, List list, IObjectWrapper iObjectWrapper) {
        this.zza = zzaa;
        this.zzb = list;
        this.zzc = iObjectWrapper;
    }

    public final Object call() {
        return this.zza.zzC(this.zzb, this.zzc);
    }
}
