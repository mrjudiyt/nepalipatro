package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzedx implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzl zza;

    public /* synthetic */ zzedx(zzl zzl) {
        this.zza = zzl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        zzl zzl = this.zza;
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
