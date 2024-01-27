package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaxo extends PushbackInputStream {
    final /* synthetic */ zzaxp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaxo(zzaxp zzaxp, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.zza = zzaxp;
    }

    public final synchronized void close() {
        zzaxr.zze(this.zza.zzc);
        super.close();
    }
}
