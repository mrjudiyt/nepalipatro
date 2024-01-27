package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzhp {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ zzhp(MediaCodec.CryptoInfo cryptoInfo, zzho zzho) {
        this.zza = cryptoInfo;
    }

    static /* bridge */ /* synthetic */ void zza(zzhp zzhp, int i10, int i11) {
        zzhp.zzb.set(i10, i11);
        zzhp.zza.setPattern(zzhp.zzb);
    }
}
