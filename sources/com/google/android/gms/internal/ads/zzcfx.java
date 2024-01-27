package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcfx implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult zza;

    zzcfx(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.cancel();
    }
}
