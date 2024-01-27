package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgtk {
    private final Object zza;
    private final int zzb;

    zzgtk(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtk)) {
            return false;
        }
        zzgtk zzgtk = (zzgtk) obj;
        if (this.zza == zzgtk.zza && this.zzb == zzgtk.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
