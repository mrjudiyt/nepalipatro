package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzegi implements zzdhf {
    public final /* synthetic */ zzcbl zza;

    public /* synthetic */ zzegi(zzcbl zzcbl) {
        this.zza = zzcbl;
    }

    public final void zza(boolean z10, Context context, zzcxy zzcxy) {
        zzcbl zzcbl = this.zza;
        try {
            zzt.zzi();
            zzm.zza(context, (AdOverlayInfoParcel) zzcbl.get(), true);
        } catch (Exception unused) {
        }
    }
}
