package com.google.android.gms.ads.nonagon.signalgeneration;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzap implements Callable {
    public final /* synthetic */ TaggingLibraryJsInterface zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzap(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = taggingLibraryJsInterface;
        this.zzb = str;
    }

    public final Object call() {
        return this.zza.getClickSignals(this.zzb);
    }
}
