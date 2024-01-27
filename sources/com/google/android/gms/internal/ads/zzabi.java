package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzabi {
    public final String zza;

    private zzabi(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzabi zza(zzfb zzfb) {
        String str;
        zzfb.zzH(2);
        int zzl = zzfb.zzl();
        int i10 = zzl >> 1;
        int i11 = zzl & 1;
        int zzl2 = zzfb.zzl() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        int i12 = zzl2 | (i11 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i10);
        if (i12 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(i12);
        return new zzabi(i10, i12, sb.toString());
    }
}
