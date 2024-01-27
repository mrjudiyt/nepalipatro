package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfcn implements OnAdMetadataChangedListener {
    final /* synthetic */ zzby zza;
    final /* synthetic */ zzfco zzb;

    zzfcn(zzfco zzfco, zzby zzby) {
        this.zzb = zzfco;
        this.zza = zzby;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
