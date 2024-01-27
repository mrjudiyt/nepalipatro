package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgws extends RuntimeException {
    public zzgws(zzgvj zzgvj) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgul zza() {
        return new zzgul(getMessage());
    }
}
