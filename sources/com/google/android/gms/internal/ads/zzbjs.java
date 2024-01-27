package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzx;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbjs implements zzx {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    zzbjs(zzbju zzbju, boolean z10, zza zza2, Map map, Map map2) {
        this.zzb = z10;
        this.zzc = zza2;
        this.zzd = map;
        this.zze = map2;
    }

    public final void zza(boolean z10) {
        if (!this.zza) {
            if (z10 && this.zzb) {
                ((zzdfd) this.zzc).zzbK();
            }
            this.zza = true;
            this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z10));
            ((zzbmd) this.zzc).zzd("openIntentAsync", this.zzd);
        }
    }

    public final void zzb(int i10) {
    }
}
