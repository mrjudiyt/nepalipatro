package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdjd implements zzfzp {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdje zzb;

    zzdjd(zzdje zzdje, View view) {
        this.zzb = zzdje;
        this.zza = view;
    }

    public final void zza(Throwable th) {
        zzt.zzo().zzu(th, "omid native display exp");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzab(this.zza, (zzfkc) obj);
    }
}
