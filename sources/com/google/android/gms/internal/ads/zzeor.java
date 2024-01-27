package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzw;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeor implements zzetv {
    private final zzw zza;
    private final zzcaz zzb;
    private final boolean zzc;

    public zzeor(zzw zzw, zzcaz zzcaz, boolean z10) {
        this.zza = zzw;
        this.zzb = zzcaz;
        this.zzc = z10;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) zzba.zzc().zzb(zzbci.zzfe)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzff)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        zzw zzw = this.zza;
        if (zzw != null) {
            int i10 = zzw.zza;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
