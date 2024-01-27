package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbmk implements zzchn {
    public final /* synthetic */ zzbmv zza;

    public /* synthetic */ zzbmk(zzbmv zzbmv) {
        this.zza = zzbmv;
    }

    public final void zza() {
        long currentTimeMillis = zzt.zzB().currentTimeMillis();
        zzbmv zzbmv = this.zza;
        long j10 = zzbmv.zzc;
        ArrayList arrayList = zzbmv.zzb;
        arrayList.add(Long.valueOf(currentTimeMillis - j10));
        String valueOf = String.valueOf(arrayList.get(0));
        zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + valueOf + " ms.");
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new zzbmr(zzbmv.zza, zzbmv.zzd, zzbmv.zze, arrayList, j10), (long) ((Integer) zzba.zzc().zzb(zzbci.zzc)).intValue());
    }
}
