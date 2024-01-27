package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzftb extends zzfss {
    private final Object zza;

    zzftb(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzftb) {
            return this.zza.equals(((zzftb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "Optional.of(" + obj + ")";
    }

    public final zzfss zza(zzfsk zzfsk) {
        Object apply = zzfsk.apply(this.zza);
        zzfsw.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzftb(apply);
    }

    public final Object zzb(Object obj) {
        return this.zza;
    }
}
