package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzegh implements zzfza {
    public final /* synthetic */ zzegj zza;
    public final /* synthetic */ Uri zzb;
    public final /* synthetic */ zzfde zzc;
    public final /* synthetic */ zzfcr zzd;

    public /* synthetic */ zzegh(zzegj zzegj, Uri uri, zzfde zzfde, zzfcr zzfcr) {
        this.zza = zzegj;
        this.zzb = uri;
        this.zzc = zzfde;
        this.zzd = zzfcr;
    }

    public final e zza(Object obj) {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, obj);
    }
}
