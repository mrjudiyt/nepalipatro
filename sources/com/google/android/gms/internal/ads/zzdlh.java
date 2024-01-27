package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdlh implements zzfzp {
    final /* synthetic */ zzdli zza;

    zzdlh(zzdli zzdli) {
        this.zza = zzdli;
    }

    public final void zza(Throwable th) {
        zzt.zzo().zzu(th, "omid native display exp");
    }

    /* renamed from: zzc */
    public final void zzb(List list) {
        try {
            zzcgb zzcgb = (zzcgb) list.get(0);
            if (zzcgb != null) {
                this.zza.zzb(zzcgb);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            zzt.zzo().zzu(e10, "omid native display exp");
        }
    }
}
