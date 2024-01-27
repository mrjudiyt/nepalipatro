package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzalk extends zzall {
    private final byte[] zza;

    public zzalk(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    public final byte[] getEncoded() {
        return this.zza;
    }
}
