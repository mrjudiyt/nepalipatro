package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeds implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzedz zza;
    public final /* synthetic */ zzl zzb;

    public /* synthetic */ zzeds(zzedz zzedz, zzl zzl) {
        this.zza = zzedz;
        this.zzb = zzl;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzj(this.zzb, dialogInterface, i10);
    }
}
