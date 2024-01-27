package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgaz {
    private final OutputStream zza;

    private zzgaz(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgaz zzb(OutputStream outputStream) {
        return new zzgaz(outputStream);
    }

    public final void zza(zzgpm zzgpm) {
        try {
            zzgpm.zzaw(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
