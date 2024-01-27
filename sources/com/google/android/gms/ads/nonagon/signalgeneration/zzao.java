package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzao implements Runnable {
    public final /* synthetic */ TaggingLibraryJsInterface zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzao(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = taggingLibraryJsInterface;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzc(this.zzb);
    }
}
