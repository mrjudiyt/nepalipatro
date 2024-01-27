package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.e;
import w0.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeeq {
    private a zza;
    private final Context zzb;

    zzeeq(Context context) {
        this.zzb = context;
    }

    public final e zza() {
        a a10 = a.a(this.zzb);
        this.zza = a10;
        if (a10 == null) {
            return zzfzt.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
        }
        return a10.b();
    }

    public final e zzb(Uri uri, InputEvent inputEvent) {
        a aVar = this.zza;
        aVar.getClass();
        return aVar.c(uri, inputEvent);
    }
}
