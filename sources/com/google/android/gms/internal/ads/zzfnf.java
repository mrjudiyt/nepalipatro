package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfnf implements OnFailureListener {
    public final /* synthetic */ zzfnj zza;

    public /* synthetic */ zzfnf(zzfnj zzfnj) {
        this.zza = zzfnj;
    }

    public final void onFailure(Exception exc) {
        this.zza.zzf(exc);
    }
}
