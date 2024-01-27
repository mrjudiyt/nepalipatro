package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzwr {
    private static final zzwq zza;
    private static final zzwq zzb = new zzwq();

    static {
        zzwq zzwq;
        try {
            zzwq = (zzwq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzwq = null;
        }
        zza = zzwq;
    }

    static zzwq zza() {
        return zza;
    }

    static zzwq zzb() {
        return zzb;
    }
}
