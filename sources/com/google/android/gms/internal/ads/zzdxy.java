package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdxy extends zzbvb {
    final /* synthetic */ zzdxz zza;

    protected zzdxy(zzdxz zzdxz) {
        this.zza = zzdxz;
    }

    public final void zze(zzbb zzbb) {
        this.zza.zza.zzd(zzbb.zza());
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
