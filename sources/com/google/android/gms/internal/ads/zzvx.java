package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzvx {
    public static final zzvx zza = new zzvx(new zzcx[0]);
    public static final zzn zzb = zzvw.zza;
    private static final String zzd = Integer.toString(0, 36);
    public final int zzc;
    private final zzfvs zze;
    private int zzf;

    public zzvx(zzcx... zzcxArr) {
        this.zze = zzfvs.zzk(zzcxArr);
        this.zzc = zzcxArr.length;
        int i10 = 0;
        while (i10 < this.zze.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zze.size(); i12++) {
                if (((zzcx) this.zze.get(i10)).equals(this.zze.get(i12))) {
                    zzer.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvx.class == obj.getClass()) {
            zzvx zzvx = (zzvx) obj;
            return this.zzc == zzvx.zzc && this.zze.equals(zzvx.zze);
        }
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = this.zze.hashCode();
        this.zzf = hashCode;
        return hashCode;
    }

    public final int zza(zzcx zzcx) {
        int indexOf = this.zze.indexOf(zzcx);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzcx zzb(int i10) {
        return (zzcx) this.zze.get(i10);
    }
}
