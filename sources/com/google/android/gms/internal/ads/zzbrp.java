package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbrp implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrq zza;

    zzbrp(zzbrq zzbrq) {
        this.zza = zzbrq;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("Operation denied by user.");
    }
}
