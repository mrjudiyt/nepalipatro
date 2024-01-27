package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzru {
    public final zzrz zza;
    public final MediaFormat zzb;
    public final zzam zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzru(zzrz zzrz, MediaFormat mediaFormat, zzam zzam, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.zza = zzrz;
        this.zzb = mediaFormat;
        this.zzc = zzam;
        this.zzd = surface;
    }

    public static zzru zza(zzrz zzrz, MediaFormat mediaFormat, zzam zzam, MediaCrypto mediaCrypto) {
        return new zzru(zzrz, mediaFormat, zzam, (Surface) null, (MediaCrypto) null, 0);
    }

    public static zzru zzb(zzrz zzrz, MediaFormat mediaFormat, zzam zzam, Surface surface, MediaCrypto mediaCrypto) {
        return new zzru(zzrz, mediaFormat, zzam, surface, (MediaCrypto) null, 0);
    }
}
