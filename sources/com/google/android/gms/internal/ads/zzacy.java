package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzacy {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzby zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = zzfk.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzer.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaem.zzb(new zzfb(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    zzer.zzg("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzafz(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby((List) arrayList);
    }

    public static zzacv zzc(zzfb zzfb, boolean z10, boolean z11) {
        if (z10) {
            zzd(3, zzfb, false);
        }
        String zzy = zzfb.zzy((int) zzfb.zzr(), zzfsi.zzc);
        int length = zzy.length();
        long zzr = zzfb.zzr();
        String[] strArr = new String[((int) zzr)];
        int i10 = length + 15;
        for (int i11 = 0; ((long) i11) < zzr; i11++) {
            String zzy2 = zzfb.zzy((int) zzfb.zzr(), zzfsi.zzc);
            strArr[i11] = zzy2;
            i10 = i10 + 4 + zzy2.length();
        }
        if (!z11 || (zzfb.zzl() & 1) != 0) {
            return new zzacv(zzy, strArr, i10 + 1);
        }
        throw zzcc.zza("framing bit expected to be set", (Throwable) null);
    }

    public static boolean zzd(int i10, zzfb zzfb, boolean z10) {
        if (zzfb.zza() < 7) {
            if (z10) {
                return false;
            }
            int zza = zzfb.zza();
            throw zzcc.zza("too short header: " + zza, (Throwable) null);
        } else if (zzfb.zzl() != i10) {
            if (z10) {
                return false;
            }
            throw zzcc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), (Throwable) null);
        } else if (zzfb.zzl() == 118 && zzfb.zzl() == 111 && zzfb.zzl() == 114 && zzfb.zzl() == 98 && zzfb.zzl() == 105 && zzfb.zzl() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw zzcc.zza("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
