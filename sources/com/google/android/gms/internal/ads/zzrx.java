package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzrx extends zzhr {
    public final zzrz zza;
    public final String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzrx(Throwable th, zzrz zzrz) {
        super("Decoder failed: ".concat(String.valueOf(zzrz == null ? null : zzrz.zza)), th);
        String str = null;
        this.zza = zzrz;
        if (zzfk.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
