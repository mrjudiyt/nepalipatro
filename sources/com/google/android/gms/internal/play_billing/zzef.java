package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class zzef extends RuntimeException {
    public zzef(zzdf zzdf) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzci zza() {
        return new zzci(getMessage());
    }
}
