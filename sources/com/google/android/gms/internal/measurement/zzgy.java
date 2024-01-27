package com.google.android.gms.internal.measurement;

import l6.p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzgy {
    private final boolean zza;

    public zzgy(zzhb zzhb) {
        p.k(zzhb, "BuildInfo must be non-null");
        this.zza = !zzhb.zza();
    }

    public final boolean zza(String str) {
        p.k(str, "flagName must not be null");
        if (!this.zza) {
            return true;
        }
        return zzha.zza.get().b(str);
    }
}
