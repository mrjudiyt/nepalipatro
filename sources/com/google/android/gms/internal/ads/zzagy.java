package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
class zzagy {
    public final int zzd;

    public zzagy(int i10) {
        this.zzd = i10;
    }

    public static int zze(int i10) {
        return (i10 >> 24) & 255;
    }

    public static String zzf(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i10 >> 24) & 255));
        sb.append((char) ((i10 >> 16) & 255));
        sb.append((char) ((i10 >> 8) & 255));
        sb.append((char) (i10 & 255));
        return sb.toString();
    }

    public String toString() {
        return zzf(this.zzd);
    }
}
