package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcfw implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsPromptResult zza;

    zzcfw(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
