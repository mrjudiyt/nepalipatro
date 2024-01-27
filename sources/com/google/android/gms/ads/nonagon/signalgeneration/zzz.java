package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzfzp;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzz implements zzfzp {
    final /* synthetic */ zzaa zza;

    zzz(zzaa zzaa) {
        this.zza = zzaa;
    }

    public final void zza(Throwable th) {
        zzt.zzo().zzu(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaa = this.zza;
        zzf.zzc(zzaa.zzr, zzaa.zzj, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzcat.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    public final /* synthetic */ void zzb(Object obj) {
        zzam zzam = (zzam) obj;
        zzcat.zze("Initialized webview successfully for SDKCore.");
    }
}
