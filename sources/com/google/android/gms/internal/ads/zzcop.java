package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcop implements zzfza {
    public final /* synthetic */ zzcou zza;
    public final /* synthetic */ Uri.Builder zzb;

    public /* synthetic */ zzcop(zzcou zzcou, Uri.Builder builder) {
        this.zza = zzcou;
        this.zzb = builder;
    }

    public final e zza(Object obj) {
        return this.zza.zze(this.zzb, (Throwable) obj);
    }
}
