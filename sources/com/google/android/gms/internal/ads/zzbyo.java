package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbyo implements zzbyx {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbyo(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    public final void zza(zzchs zzchs) {
        Context context = this.zza;
        zzchs.zzs(ObjectWrapper.wrap(context), this.zzb, context.getPackageName());
    }
}
