package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.e;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzesu implements zzfyz {
    public final /* synthetic */ zzesx zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ Bundle zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzesu(zzesx zzesx, String str, List list, Bundle bundle, boolean z10, boolean z11) {
        this.zza = zzesx;
        this.zzb = str;
        this.zzc = list;
        this.zzd = bundle;
        this.zze = z10;
        this.zzf = z11;
    }

    public final e zza() {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
