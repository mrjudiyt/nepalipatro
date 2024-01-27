package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzap implements DialogInterface.OnClickListener {
    public final /* synthetic */ AtomicInteger zza;

    public /* synthetic */ zzap(AtomicInteger atomicInteger) {
        this.zza = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.set(i10);
    }
}
