package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbru implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrv zza;

    zzbru(zzbrv zzbrv) {
        this.zza = zzbrv;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("User canceled the download.");
    }
}
