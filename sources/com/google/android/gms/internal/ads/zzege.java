package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzege extends zzbqi {
    final /* synthetic */ zzegf zza;
    private final zzeex zzb;

    /* synthetic */ zzege(zzegf zzegf, zzeex zzeex, zzegd zzegd) {
        this.zza = zzegf;
        this.zzb = zzeex;
    }

    public final void zze(String str) {
        ((zzegq) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) {
        ((zzegq) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzegq) this.zzb.zzc).zzo();
    }

    public final void zzh(zzbpg zzbpg) {
        this.zza.zzd = zzbpg;
        ((zzegq) this.zzb.zzc).zzo();
    }
}
