package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdkz implements zzbjj {
    public final /* synthetic */ zzdld zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ WindowManager zzc;

    public /* synthetic */ zzdkz(zzdld zzdld, View view, WindowManager windowManager) {
        this.zza = zzdld;
        this.zzb = view;
        this.zzc = windowManager;
    }

    public final void zza(Object obj, Map map) {
        this.zza.zze(this.zzb, this.zzc, (zzcgb) obj, map);
    }
}
