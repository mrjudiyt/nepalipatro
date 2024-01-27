package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfcg implements OnAdMetadataChangedListener {
    final /* synthetic */ zzdd zza;
    final /* synthetic */ zzfci zzb;

    zzfcg(zzfci zzfci, zzdd zzdd) {
        this.zzb = zzfci;
        this.zza = zzdd;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzi != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
