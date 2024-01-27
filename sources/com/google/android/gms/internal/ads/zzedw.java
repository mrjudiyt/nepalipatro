package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzedw implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzedz zza;
    public final /* synthetic */ zzl zzb;

    public /* synthetic */ zzedw(zzedz zzedz, zzl zzl) {
        this.zza = zzedz;
        this.zzb = zzl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.zzn(this.zzb, dialogInterface);
    }
}
