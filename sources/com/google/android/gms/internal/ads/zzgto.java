package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgto {
    private static final zzgtm zza = new zzgtn();
    private static final zzgtm zzb;

    static {
        zzgtm zzgtm;
        try {
            zzgtm = (zzgtm) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgtm = null;
        }
        zzb = zzgtm;
    }

    static zzgtm zza() {
        zzgtm zzgtm = zzb;
        if (zzgtm != null) {
            return zzgtm;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzgtm zzb() {
        return zza;
    }
}
