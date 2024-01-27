package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcwl implements zzcyz, zzcyg {
    private final Context zza;
    private final zzfcr zzb;
    private final zzbta zzc;

    public zzcwl(Context context, zzfcr zzfcr, zzbta zzbta) {
        this.zza = context;
        this.zzb = zzfcr;
        this.zzc = zzbta;
    }

    public final void zzbn(Context context) {
    }

    public final void zzbp(Context context) {
    }

    public final void zzbq(Context context) {
    }

    public final void zzr() {
        zzbtb zzbtb = this.zzb.zzaf;
        if (zzbtb != null && zzbtb.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zzb.zzaf.zzb.isEmpty()) {
                arrayList.add(this.zzb.zzaf.zzb);
            }
        }
    }
}
