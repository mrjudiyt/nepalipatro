package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgwe {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzgwt zzc;
    private static final zzgwt zzd = new zzgwv();

    static {
        Class<?> cls;
        Class<?> cls2;
        zzgwt zzgwt = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzgwt = (zzgwt) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzgwt;
    }

    public static void zzA(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzu(i10, list, z10);
        }
    }

    public static void zzB(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzx(i10, list, z10);
        }
    }

    public static void zzC(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzz(i10, list, z10);
        }
    }

    public static void zzD(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzB(i10, list, z10);
        }
    }

    public static void zzE(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzD(i10, list, z10);
        }
    }

    public static void zzF(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzI(i10, list, z10);
        }
    }

    public static void zzG(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzK(i10, list, z10);
        }
    }

    static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgtg.zzx(zzgua.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgtg.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgtg.zzA(i10 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgtg.zzA(i10 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgtg.zzx(zzgua.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgtg.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzg(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzguy) {
            zzguy zzguy = (zzguy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgtg.zzB(zzguy.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgtg.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzh(int i10, Object obj, zzgwc zzgwc) {
        int i11 = i10 << 3;
        if (obj instanceof zzgup) {
            int i12 = zzgtg.zzf;
            int zza2 = ((zzgup) obj).zza();
            return zzgtg.zzA(i11) + zzgtg.zzA(zza2) + zza2;
        }
        return zzgtg.zzA(i11) + zzgtg.zzy((zzgvj) obj, zzgwc);
    }

    static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzgua.zze(i11);
                i10 += zzgtg.zzA((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 = i10 + zzgtg.zzA((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzj(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzguy) {
            zzguy zzguy = (zzguy) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzguy.zze(i11);
                i10 += zzgtg.zzB((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 = i10 + zzgtg.zzB((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgtg.zzA(zzgua.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgtg.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzguy) {
            zzguy zzguy = (zzguy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgtg.zzB(zzguy.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgtg.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzgwt zzm() {
        return zzc;
    }

    public static zzgwt zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i10, List list, zzgud zzgud, Object obj2, zzgwt zzgwt) {
        if (zzgud == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgud.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzp(obj, i10, intValue, obj2, zzgwt);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgud.zza(intValue2)) {
                    obj2 = zzp(obj, i10, intValue2, obj2, zzgwt);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzp(Object obj, int i10, int i11, Object obj2, zzgwt zzgwt) {
        if (obj2 == null) {
            obj2 = zzgwt.zzc(obj);
        }
        zzgwt.zzl(obj2, i10, (long) i11);
        return obj2;
    }

    static void zzq(zzgwt zzgwt, Object obj, Object obj2) {
        zzgwt.zzo(obj, zzgwt.zze(zzgwt.zzd(obj), zzgwt.zzd(obj2)));
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzgtz.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzs(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void zzt(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzc(i10, list, z10);
        }
    }

    public static void zzu(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzg(i10, list, z10);
        }
    }

    public static void zzv(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzj(i10, list, z10);
        }
    }

    public static void zzw(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzl(i10, list, z10);
        }
    }

    public static void zzx(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzn(i10, list, z10);
        }
    }

    public static void zzy(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzp(i10, list, z10);
        }
    }

    public static void zzz(int i10, List list, zzgth zzgth, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzgth.zzs(i10, list, z10);
        }
    }
}
