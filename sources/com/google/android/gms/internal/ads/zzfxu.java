package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfxu extends OutputStream {
    zzfxu() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    public final void write(int i10) {
    }

    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr);
        zzfsw.zzh(i10, i11 + i10, bArr.length);
    }
}
