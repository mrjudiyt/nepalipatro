package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
final class zzds extends zzdf.zza {
    private final /* synthetic */ long zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzds(zzdf zzdf, long j10) {
        super(zzdf);
        this.zzd = zzdf;
        this.zzc = j10;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcu) Preconditions.checkNotNull(this.zzd.zzj)).setSessionTimeoutDuration(this.zzc);
    }
}
