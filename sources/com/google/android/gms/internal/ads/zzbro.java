package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbro implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrq zza;

    zzbro(zzbrq zzbrq) {
        this.zza = zzbrq;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        zzbrq zzbrq = this.zza;
        Intent zzb = zzbrq.zzb();
        zzt.zzp();
        com.google.android.gms.ads.internal.util.zzt.zzS(zzbrq.zzb, zzb);
    }
}
