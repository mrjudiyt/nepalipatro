package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcoo implements zzfza {
    public final /* synthetic */ zzcou zza;
    public final /* synthetic */ Uri.Builder zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ InputEvent zzd;

    public /* synthetic */ zzcoo(zzcou zzcou, Uri.Builder builder, String str, InputEvent inputEvent) {
        this.zza = zzcou;
        this.zzb = builder;
        this.zzc = str;
        this.zzd = inputEvent;
    }

    public final e zza(Object obj) {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, (Integer) obj);
    }
}
