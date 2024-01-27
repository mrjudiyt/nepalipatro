package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzxj {
    public final zzcx zza;
    public final int[] zzb;

    public zzxj(zzcx zzcx, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzer.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcx;
        this.zzb = iArr;
    }
}
