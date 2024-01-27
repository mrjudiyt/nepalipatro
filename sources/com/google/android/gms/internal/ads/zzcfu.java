package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcfu implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult zza;

    zzcfu(JsResult jsResult) {
        this.zza = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.cancel();
    }
}
