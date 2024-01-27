package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzblm;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzei extends zzblm {
    final /* synthetic */ zzej zza;

    /* synthetic */ zzei(zzej zzej, zzeh zzeh) {
        this.zza = zzej;
    }

    public final void zzb(List list) {
        int i10;
        ArrayList arrayList;
        synchronized (this.zza.zzb) {
            this.zza.zzd = false;
            this.zza.zze = true;
            arrayList = new ArrayList(this.zza.zzc);
            this.zza.zzc.clear();
        }
        InitializationStatus zzd = zzej.zzy(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(zzd);
        }
    }
}
