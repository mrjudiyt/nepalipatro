package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaw implements DialogInterface.OnClickListener {
    final /* synthetic */ zzax zza;

    zzaw(zzax zzax) {
        this.zza = zzax;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        zzt.zzp();
        zzt.zzT(this.zza.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
