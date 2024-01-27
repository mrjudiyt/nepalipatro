package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhba implements zzhbc {
    private zzhbp zza;

    public static void zza(zzhbp zzhbp, zzhbp zzhbp2) {
        zzhba zzhba = (zzhba) zzhbp;
        if (zzhba.zza == null) {
            zzhba.zza = zzhbp2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zzb() {
        zzhbp zzhbp = this.zza;
        if (zzhbp != null) {
            return zzhbp.zzb();
        }
        throw new IllegalStateException();
    }
}
