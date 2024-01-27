package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class zzdi<T> implements zzdp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzeq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzdf zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzct zzl;
    private final zzeg zzm;
    private final zzbo zzn;
    private final int zzo;
    private final zzdk zzp;
    private final zzda zzq;

    private zzdi(int[] iArr, Object[] objArr, int i10, int i11, zzdf zzdf, int i12, boolean z10, int[] iArr2, int i13, int i14, zzdk zzdk, zzct zzct, zzeg zzeg, zzbo zzbo, zzda zzda) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzo = i12;
        boolean z11 = false;
        if (zzbo != null && zzbo.zzc(zzdf)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzp = zzdk;
        this.zzl = zzct;
        this.zzm = zzeg;
        this.zzn = zzbo;
        this.zzg = zzdf;
        this.zzq = zzda;
    }

    private final zzce zzA(int i10) {
        int i11 = i10 / 3;
        return (zzce) this.zzd[i11 + i11 + 1];
    }

    private final zzdp zzB(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzdp zzdp = (zzdp) this.zzd[i12];
        if (zzdp != null) {
            return zzdp;
        }
        zzdp zzb2 = zzdn.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzD(Object obj, int i10) {
        zzdp zzB = zzB(i10);
        int zzy = zzy(i10) & 1048575;
        if (!zzP(obj, i10)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, (long) zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze2 = zzB.zze();
        if (object != null) {
            zzB.zzg(zze2, object);
        }
        return zze2;
    }

    private final Object zzE(Object obj, int i10, int i11) {
        zzdp zzB = zzB(i11);
        if (!zzT(obj, i10, i11)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, (long) (zzy(i11) & 1048575));
        if (zzS(object)) {
            return object;
        }
        Object zze2 = zzB.zze();
        if (object != null) {
            zzB.zzg(zze2, object);
        }
        return zze2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i10) {
        if (zzP(obj2, i10)) {
            Unsafe unsafe = zzb;
            long zzy = (long) (zzy(i10) & 1048575);
            Object object = unsafe.getObject(obj2, zzy);
            if (object != null) {
                zzdp zzB = zzB(i10);
                if (!zzP(obj, i10)) {
                    if (!zzS(object)) {
                        unsafe.putObject(obj, zzy, object);
                    } else {
                        Object zze2 = zzB.zze();
                        zzB.zzg(zze2, object);
                        unsafe.putObject(obj, zzy, zze2);
                    }
                    zzJ(obj, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzy);
                if (!zzS(object2)) {
                    Object zze3 = zzB.zze();
                    zzB.zzg(zze3, object2);
                    unsafe.putObject(obj, zzy, zze3);
                    object2 = zze3;
                }
                zzB.zzg(object2, object);
                return;
            }
            int i11 = this.zzc[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i11 + " is present but null: " + obj3);
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzT(obj2, i11, i10)) {
            Unsafe unsafe = zzb;
            long zzy = (long) (zzy(i10) & 1048575);
            Object object = unsafe.getObject(obj2, zzy);
            if (object != null) {
                zzdp zzB = zzB(i10);
                if (!zzT(obj, i11, i10)) {
                    if (!zzS(object)) {
                        unsafe.putObject(obj, zzy, object);
                    } else {
                        Object zze2 = zzB.zze();
                        zzB.zzg(zze2, object);
                        unsafe.putObject(obj, zzy, zze2);
                    }
                    zzK(obj, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzy);
                if (!zzS(object2)) {
                    Object zze3 = zzB.zze();
                    zzB.zzg(zze3, object2);
                    unsafe.putObject(obj, zzy, zze3);
                    object2 = zze3;
                }
                zzB.zzg(object2, object);
                return;
            }
            int i12 = this.zzc[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i12 + " is present but null: " + obj3);
        }
    }

    private final void zzJ(Object obj, int i10) {
        int zzv = zzv(i10);
        long j10 = (long) (1048575 & zzv);
        if (j10 != 1048575) {
            zzeq.zzq(obj, j10, (1 << (zzv >>> 20)) | zzeq.zzc(obj, j10));
        }
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzeq.zzq(obj, (long) (zzv(i11) & 1048575), i10);
    }

    private final void zzL(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, (long) (zzy(i10) & 1048575), obj2);
        zzJ(obj, i10);
    }

    private final void zzM(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, (long) (zzy(i11) & 1048575), obj2);
        zzK(obj, i10, i11);
    }

    private final void zzN(zzey zzey, int i10, Object obj, int i11) {
        if (obj != null) {
            zzcy zzcy = (zzcy) zzC(i11);
            throw null;
        }
    }

    private final boolean zzO(Object obj, Object obj2, int i10) {
        return zzP(obj, i10) == zzP(obj2, i10);
    }

    private final boolean zzP(Object obj, int i10) {
        int zzv = zzv(i10);
        long j10 = (long) (zzv & 1048575);
        if (j10 == 1048575) {
            int zzy = zzy(i10);
            long j11 = (long) (zzy & 1048575);
            switch (zzx(zzy)) {
                case 0:
                    return Double.doubleToRawLongBits(zzeq.zza(obj, j11)) != 0;
                case 1:
                    return Float.floatToRawIntBits(zzeq.zzb(obj, j11)) != 0;
                case 2:
                    return zzeq.zzd(obj, j11) != 0;
                case 3:
                    return zzeq.zzd(obj, j11) != 0;
                case 4:
                    return zzeq.zzc(obj, j11) != 0;
                case 5:
                    return zzeq.zzd(obj, j11) != 0;
                case 6:
                    return zzeq.zzc(obj, j11) != 0;
                case 7:
                    return zzeq.zzw(obj, j11);
                case 8:
                    Object zzf2 = zzeq.zzf(obj, j11);
                    if (zzf2 instanceof String) {
                        return !((String) zzf2).isEmpty();
                    }
                    if (zzf2 instanceof zzba) {
                        return !zzba.zzb.equals(zzf2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzeq.zzf(obj, j11) != null;
                case 10:
                    return !zzba.zzb.equals(zzeq.zzf(obj, j11));
                case 11:
                    return zzeq.zzc(obj, j11) != 0;
                case 12:
                    return zzeq.zzc(obj, j11) != 0;
                case 13:
                    return zzeq.zzc(obj, j11) != 0;
                case 14:
                    return zzeq.zzd(obj, j11) != 0;
                case 15:
                    return zzeq.zzc(obj, j11) != 0;
                case 16:
                    return zzeq.zzd(obj, j11) != 0;
                case 17:
                    return zzeq.zzf(obj, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zzeq.zzc(obj, j10) & (1 << (zzv >>> 20))) != 0;
        }
    }

    private final boolean zzQ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzP(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzR(Object obj, int i10, zzdp zzdp) {
        return zzdp.zzk(zzeq.zzf(obj, (long) (i10 & 1048575)));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcb) {
            return ((zzcb) obj).zzt();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i10, int i11) {
        return zzeq.zzc(obj, (long) (zzv(i11) & 1048575)) == i10;
    }

    private static boolean zzU(Object obj, long j10) {
        return ((Boolean) zzeq.zzf(obj, j10)).booleanValue();
    }

    private static final void zzV(int i10, Object obj, zzey zzey) {
        if (obj instanceof String) {
            zzey.zzF(i10, (String) obj);
        } else {
            zzey.zzd(i10, (zzba) obj);
        }
    }

    static zzeh zzd(Object obj) {
        zzcb zzcb = (zzcb) obj;
        zzeh zzeh = zzcb.zzc;
        if (zzeh != zzeh.zzc()) {
            return zzeh;
        }
        zzeh zzf2 = zzeh.zzf();
        zzcb.zzc = zzf2;
        return zzf2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.play_billing.zzdi zzl(java.lang.Class r30, com.google.android.gms.internal.play_billing.zzdc r31, com.google.android.gms.internal.play_billing.zzdk r32, com.google.android.gms.internal.play_billing.zzct r33, com.google.android.gms.internal.play_billing.zzeg r34, com.google.android.gms.internal.play_billing.zzbo r35, com.google.android.gms.internal.play_billing.zzda r36) {
        /*
            r0 = r31
            boolean r1 = r0 instanceof com.google.android.gms.internal.play_billing.zzdo
            if (r1 == 0) goto L_0x03df
            com.google.android.gms.internal.play_billing.zzdo r0 = (com.google.android.gms.internal.play_billing.zzdo) r0
            java.lang.String r1 = r0.zzd()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0025
            r4 = 1
        L_0x001b:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0026
            r4 = r7
            goto L_0x001b
        L_0x0025:
            r7 = 1
        L_0x0026:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0045
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0032:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0042
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L_0x0032
        L_0x0042:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L_0x0045:
            if (r7 != 0) goto L_0x0056
            int[] r7 = zza
            r17 = r7
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            goto L_0x0166
        L_0x0056:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0062:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0072
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0062
        L_0x0072:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L_0x0075:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0094
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0081:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x0091
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0081
        L_0x0091:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L_0x0094:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x00b3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00b0
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00a0
        L_0x00b0:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00b3:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00d2
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int r16 = r4 + r4
            int r16 = r16 + r7
            int[] r7 = new int[r13]
            r17 = r7
            r13 = r9
            r18 = r14
            r7 = r4
            r14 = r10
            r4 = r15
        L_0x0166:
            sun.misc.Unsafe r9 = zzb
            java.lang.Object[] r10 = r0.zze()
            com.google.android.gms.internal.play_billing.zzdf r15 = r0.zza()
            java.lang.Class r15 = r15.getClass()
            int r19 = r18 + r12
            int r12 = r11 + r11
            int r11 = r11 * 3
            int[] r11 = new int[r11]
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r22 = r18
            r23 = r19
            r20 = 0
            r21 = 0
        L_0x0186:
            if (r4 >= r2) goto L_0x03ba
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x01ae
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0196:
            int r25 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L_0x01a8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r25
            goto L_0x0196
        L_0x01a8:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r25
            goto L_0x01b0
        L_0x01ae:
            r3 = r24
        L_0x01b0:
            int r24 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L_0x01d6
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = r24
            r24 = 13
        L_0x01be:
            int r25 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L_0x01d0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r24
            r3 = r3 | r8
            int r24 = r24 + 13
            r8 = r25
            goto L_0x01be
        L_0x01d0:
            int r8 = r8 << r24
            r3 = r3 | r8
            r8 = r25
            goto L_0x01d8
        L_0x01d6:
            r8 = r24
        L_0x01d8:
            r6 = r3 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x01e2
            int r6 = r20 + 1
            r17[r20] = r21
            r20 = r6
        L_0x01e2:
            r6 = r3 & 255(0xff, float:3.57E-43)
            r5 = 51
            if (r6 < r5) goto L_0x0284
            int r5 = r8 + 1
            char r8 = r1.charAt(r8)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r2) goto L_0x0213
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r28 = 13
        L_0x01f9:
            int r29 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r2) goto L_0x020e
            r2 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r28
            r8 = r8 | r2
            int r28 = r28 + 13
            r5 = r29
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01f9
        L_0x020e:
            int r2 = r5 << r28
            r8 = r8 | r2
            r5 = r29
        L_0x0213:
            int r2 = r6 + -51
            r28 = r5
            r5 = 9
            if (r2 == r5) goto L_0x023a
            r5 = 17
            if (r2 != r5) goto L_0x0220
            goto L_0x023a
        L_0x0220:
            r5 = 12
            if (r2 != r5) goto L_0x0247
            int r2 = r0.zzc()
            r5 = 1
            if (r2 == r5) goto L_0x022f
            r2 = r3 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0247
        L_0x022f:
            int r2 = r21 / 3
            int r2 = r2 + r2
            int r2 = r2 + r5
            int r5 = r16 + 1
            r16 = r10[r16]
            r12[r2] = r16
            goto L_0x0245
        L_0x023a:
            int r2 = r21 / 3
            int r2 = r2 + r2
            r5 = 1
            int r2 = r2 + r5
            int r5 = r16 + 1
            r16 = r10[r16]
            r12[r2] = r16
        L_0x0245:
            r16 = r5
        L_0x0247:
            int r8 = r8 + r8
            r2 = r10[r8]
            boolean r5 = r2 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0251
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            goto L_0x0259
        L_0x0251:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = zzF(r15, r2)
            r10[r8] = r2
        L_0x0259:
            r5 = r13
            r29 = r14
            long r13 = r9.objectFieldOffset(r2)
            int r2 = (int) r13
            int r8 = r8 + 1
            r13 = r10[r8]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x026c
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0274
        L_0x026c:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zzF(r15, r13)
            r10[r8] = r13
        L_0x0274:
            long r13 = r9.objectFieldOffset(r13)
            int r8 = (int) r13
            r27 = r5
            r24 = r8
            r25 = r28
            r8 = 0
            r28 = r1
            goto L_0x0385
        L_0x0284:
            r26 = r2
            r5 = r13
            r29 = r14
            int r2 = r16 + 1
            r13 = r10[r16]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zzF(r15, r13)
            r14 = 9
            if (r6 == r14) goto L_0x0306
            r14 = 17
            if (r6 != r14) goto L_0x029d
            goto L_0x0306
        L_0x029d:
            r14 = 27
            if (r6 == r14) goto L_0x02f6
            r14 = 49
            if (r6 != r14) goto L_0x02a6
            goto L_0x02f6
        L_0x02a6:
            r14 = 12
            if (r6 == r14) goto L_0x02de
            r14 = 30
            if (r6 == r14) goto L_0x02de
            r14 = 44
            if (r6 != r14) goto L_0x02b3
            goto L_0x02de
        L_0x02b3:
            r14 = 50
            if (r6 != r14) goto L_0x02da
            int r14 = r22 + 1
            r17[r22] = r21
            int r22 = r21 / 3
            int r27 = r2 + 1
            r2 = r10[r2]
            int r22 = r22 + r22
            r12[r22] = r2
            r2 = r3 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x02d6
            int r22 = r22 + 1
            int r2 = r27 + 1
            r27 = r10[r27]
            r12[r22] = r27
            r27 = r5
            r22 = r14
            goto L_0x02dc
        L_0x02d6:
            r22 = r14
            r2 = r27
        L_0x02da:
            r27 = r5
        L_0x02dc:
            r5 = 1
            goto L_0x0313
        L_0x02de:
            int r14 = r0.zzc()
            r27 = r5
            r5 = 1
            if (r14 == r5) goto L_0x02eb
            r14 = r3 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0313
        L_0x02eb:
            int r14 = r21 / 3
            int r14 = r14 + r14
            int r14 = r14 + r5
            int r24 = r2 + 1
            r2 = r10[r2]
            r12[r14] = r2
            goto L_0x0303
        L_0x02f6:
            r27 = r5
            r5 = 1
            int r14 = r21 / 3
            int r14 = r14 + r14
            int r14 = r14 + r5
            int r24 = r2 + 1
            r2 = r10[r2]
            r12[r14] = r2
        L_0x0303:
            r2 = r24
            goto L_0x0313
        L_0x0306:
            r27 = r5
            r5 = 1
            int r14 = r21 / 3
            int r14 = r14 + r14
            int r14 = r14 + r5
            java.lang.Class r24 = r13.getType()
            r12[r14] = r24
        L_0x0313:
            long r13 = r9.objectFieldOffset(r13)
            int r14 = (int) r13
            r13 = r3 & 4096(0x1000, float:5.74E-42)
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == 0) goto L_0x036e
            r13 = 17
            if (r6 > r13) goto L_0x036e
            int r13 = r8 + 1
            char r8 = r1.charAt(r8)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r5) goto L_0x0348
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L_0x0332:
            int r25 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x0344
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r24
            r8 = r8 | r13
            int r24 = r24 + 13
            r13 = r25
            goto L_0x0332
        L_0x0344:
            int r13 = r13 << r24
            r8 = r8 | r13
            goto L_0x034a
        L_0x0348:
            r25 = r13
        L_0x034a:
            int r13 = r7 + r7
            int r24 = r8 / 32
            int r13 = r13 + r24
            r5 = r10[r13]
            r28 = r1
            boolean r1 = r5 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x035b
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x0363
        L_0x035b:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = zzF(r15, r5)
            r10[r13] = r5
        L_0x0363:
            r13 = r2
            long r1 = r9.objectFieldOffset(r5)
            int r2 = (int) r1
            int r8 = r8 % 32
            r24 = r2
            goto L_0x0374
        L_0x036e:
            r28 = r1
            r13 = r2
            r25 = r8
            r8 = 0
        L_0x0374:
            r1 = 18
            if (r6 < r1) goto L_0x0382
            r1 = 49
            if (r6 > r1) goto L_0x0382
            int r1 = r23 + 1
            r17[r23] = r14
            r23 = r1
        L_0x0382:
            r16 = r13
            r2 = r14
        L_0x0385:
            int r1 = r21 + 1
            r11[r21] = r4
            int r4 = r1 + 1
            r5 = r3 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0392
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0393
        L_0x0392:
            r5 = 0
        L_0x0393:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039a
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039b
        L_0x039a:
            r3 = 0
        L_0x039b:
            int r6 = r6 << 20
            r3 = r3 | r5
            r3 = r3 | r6
            r2 = r2 | r3
            r11[r1] = r2
            int r21 = r4 + 1
            int r1 = r8 << 20
            r1 = r1 | r24
            r11[r4] = r1
            r4 = r25
            r2 = r26
            r13 = r27
            r1 = r28
            r14 = r29
            r3 = 0
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0186
        L_0x03ba:
            r27 = r13
            r29 = r14
            com.google.android.gms.internal.play_billing.zzdi r1 = new com.google.android.gms.internal.play_billing.zzdi
            com.google.android.gms.internal.play_billing.zzdf r14 = r0.zza()
            int r15 = r0.zzc()
            r16 = 0
            r9 = r1
            r10 = r11
            r11 = r12
            r12 = r27
            r13 = r29
            r20 = r32
            r21 = r33
            r22 = r34
            r23 = r35
            r24 = r36
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r1
        L_0x03df:
            com.google.android.gms.internal.play_billing.zzed r0 = (com.google.android.gms.internal.play_billing.zzed) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdc, com.google.android.gms.internal.play_billing.zzdk, com.google.android.gms.internal.play_billing.zzct, com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzbo, com.google.android.gms.internal.play_billing.zzda):com.google.android.gms.internal.play_billing.zzdi");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzeq.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzeq.zzf(obj, j10)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x032f, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03a0, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04ae, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0561, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0570, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0574, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f4, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b2, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c2, code lost:
        r3 = r3 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzo(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = zzb
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x000f:
            int[] r9 = r0.zzc
            int r9 = r9.length
            if (r5 >= r9) goto L_0x057b
            int r9 = r0.zzy(r5)
            int[] r10 = r0.zzc
            r11 = r10[r5]
            int r12 = zzx(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            if (r13 == r7) goto L_0x0035
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
        L_0x0035:
            int r10 = r14 << r10
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x0565;
                case 1: goto L_0x0556;
                case 2: goto L_0x0540;
                case 3: goto L_0x052c;
                case 4: goto L_0x0518;
                case 5: goto L_0x050c;
                case 6: goto L_0x0500;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04c4;
                case 9: goto L_0x04b1;
                case 10: goto L_0x0492;
                case 11: goto L_0x047d;
                case 12: goto L_0x0468;
                case 13: goto L_0x045b;
                case 14: goto L_0x044e;
                case 15: goto L_0x0434;
                case 16: goto L_0x041a;
                case 17: goto L_0x0406;
                case 18: goto L_0x03f8;
                case 19: goto L_0x03ec;
                case 20: goto L_0x03e0;
                case 21: goto L_0x03d4;
                case 22: goto L_0x03c8;
                case 23: goto L_0x03bc;
                case 24: goto L_0x03b0;
                case 25: goto L_0x03a4;
                case 26: goto L_0x0396;
                case 27: goto L_0x0387;
                case 28: goto L_0x037c;
                case 29: goto L_0x0370;
                case 30: goto L_0x0364;
                case 31: goto L_0x0358;
                case 32: goto L_0x034c;
                case 33: goto L_0x0340;
                case 34: goto L_0x0334;
                case 35: goto L_0x0319;
                case 36: goto L_0x0302;
                case 37: goto L_0x02eb;
                case 38: goto L_0x02d4;
                case 39: goto L_0x02bd;
                case 40: goto L_0x02a5;
                case 41: goto L_0x028d;
                case 42: goto L_0x0273;
                case 43: goto L_0x025b;
                case 44: goto L_0x0243;
                case 45: goto L_0x022b;
                case 46: goto L_0x0213;
                case 47: goto L_0x01fb;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01d3;
                case 50: goto L_0x01c6;
                case 51: goto L_0x01b6;
                case 52: goto L_0x01a6;
                case 53: goto L_0x0190;
                case 54: goto L_0x017a;
                case 55: goto L_0x0164;
                case 56: goto L_0x0157;
                case 57: goto L_0x014a;
                case 58: goto L_0x013b;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00d7;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00ab;
                case 64: goto L_0x009d;
                case 65: goto L_0x008f;
                case 66: goto L_0x0074;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x03a1
        L_0x0042:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.play_billing.zzdf r3 = (com.google.android.gms.internal.play_billing.zzdf) r3
            com.google.android.gms.internal.play_billing.zzdp r4 = r0.zzB(r5)
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzt(r11, r3, r4)
            goto L_0x03a0
        L_0x0058:
            boolean r10 = r0.zzT(r1, r11, r5)
            if (r10 == 0) goto L_0x03a1
            long r3 = zzz(r1, r3)
            int r10 = r11 << 3
            long r11 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r10)
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzy(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x03a1
        L_0x0074:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = zzp(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x0330
        L_0x008f:
            boolean r3 = r0.zzT(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x01c2
        L_0x009d:
            boolean r3 = r0.zzT(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x01b2
        L_0x00ab:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = zzp(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzu(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0330
        L_0x00c1:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = zzp(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0330
        L_0x00d7:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.play_billing.zzba r3 = (com.google.android.gms.internal.play_billing.zzba) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
        L_0x00f4:
            int r3 = r3 + r9
            goto L_0x03a0
        L_0x00f7:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.play_billing.zzdp r4 = r0.zzB(r5)
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzn(r11, r3, r4)
            goto L_0x03a0
        L_0x010b:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.play_billing.zzba
            if (r4 == 0) goto L_0x012d
            com.google.android.gms.internal.play_billing.zzba r3 = (com.google.android.gms.internal.play_billing.zzba) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x00f4
        L_0x012d:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzw(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0330
        L_0x013b:
            boolean r3 = r0.zzT(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r3 = r3 + r14
            goto L_0x03a0
        L_0x014a:
            boolean r3 = r0.zzT(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x01b2
        L_0x0157:
            boolean r3 = r0.zzT(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x01c2
        L_0x0164:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = zzp(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzu(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0330
        L_0x017a:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            long r3 = zzz(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzy(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r9)
            goto L_0x0330
        L_0x0190:
            boolean r9 = r0.zzT(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            long r3 = zzz(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzy(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r9)
            goto L_0x0330
        L_0x01a6:
            boolean r3 = r0.zzT(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
        L_0x01b2:
            int r3 = r3 + 4
            goto L_0x03a0
        L_0x01b6:
            boolean r3 = r0.zzT(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
        L_0x01c2:
            int r3 = r3 + 8
            goto L_0x03a0
        L_0x01c6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.zzC(r5)
            com.google.android.gms.internal.play_billing.zzda.zza(r11, r3, r4)
            goto L_0x03a1
        L_0x01d3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.play_billing.zzdp r4 = r0.zzB(r5)
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzi(r11, r3, r4)
            goto L_0x03a0
        L_0x01e3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzs(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x01fb:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzq(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x0213:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzh(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x022b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzf(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x0243:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzd(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x025b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzv(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x0273:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zza
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x028d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzf(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x02a5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzh(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x02bd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzk(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x02d4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzx(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x02eb:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzm(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x0302:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzf(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x032f
        L_0x0319:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzh(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
        L_0x032f:
            int r4 = r4 + r9
        L_0x0330:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x03a1
        L_0x0334:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzr(r11, r3, r9)
            goto L_0x03a0
        L_0x0340:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzp(r11, r3, r9)
            goto L_0x03a0
        L_0x034c:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzg(r11, r3, r9)
            goto L_0x03a0
        L_0x0358:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zze(r11, r3, r9)
            goto L_0x03a0
        L_0x0364:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzc(r11, r3, r9)
            goto L_0x03a0
        L_0x0370:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzu(r11, r3, r9)
            goto L_0x03a0
        L_0x037c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzb(r11, r3)
            goto L_0x03a0
        L_0x0387:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.play_billing.zzdp r4 = r0.zzB(r5)
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzo(r11, r3, r4)
            goto L_0x03a0
        L_0x0396:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzt(r11, r3)
        L_0x03a0:
            int r6 = r6 + r3
        L_0x03a1:
            r12 = 0
            goto L_0x0574
        L_0x03a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zza(r11, r3, r12)
            goto L_0x0403
        L_0x03b0:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zze(r11, r3, r12)
            goto L_0x0403
        L_0x03bc:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzg(r11, r3, r12)
            goto L_0x0403
        L_0x03c8:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzj(r11, r3, r12)
            goto L_0x0403
        L_0x03d4:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzw(r11, r3, r12)
            goto L_0x0403
        L_0x03e0:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzl(r11, r3, r12)
            goto L_0x0403
        L_0x03ec:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zze(r11, r3, r12)
            goto L_0x0403
        L_0x03f8:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzg(r11, r3, r12)
        L_0x0403:
            int r6 = r6 + r3
            goto L_0x0574
        L_0x0406:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.play_billing.zzdf r3 = (com.google.android.gms.internal.play_billing.zzdf) r3
            com.google.android.gms.internal.play_billing.zzdp r4 = r0.zzB(r5)
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzt(r11, r3, r4)
            goto L_0x0403
        L_0x041a:
            r12 = 0
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            long r14 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r10)
            long r3 = r3 ^ r14
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzy(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0574
        L_0x0434:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x0553
        L_0x044e:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x0570
        L_0x045b:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x0561
        L_0x0468:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzu(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0553
        L_0x047d:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0553
        L_0x0492:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.play_billing.zzba r3 = (com.google.android.gms.internal.play_billing.zzba) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
        L_0x04ae:
            int r3 = r3 + r9
            goto L_0x0403
        L_0x04b1:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.play_billing.zzdp r4 = r0.zzB(r5)
            int r3 = com.google.android.gms.internal.play_billing.zzdr.zzn(r11, r3, r4)
            goto L_0x0403
        L_0x04c4:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.play_billing.zzba
            if (r4 == 0) goto L_0x04e5
            com.google.android.gms.internal.play_billing.zzba r3 = (com.google.android.gms.internal.play_billing.zzba) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x04ae
        L_0x04e5:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzw(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0553
        L_0x04f2:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            int r3 = r3 + r14
            goto L_0x0403
        L_0x0500:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x0561
        L_0x050c:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
            goto L_0x0570
        L_0x0518:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzu(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0553
        L_0x052c:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzy(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r9)
            goto L_0x0553
        L_0x0540:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzy(r3)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r9)
        L_0x0553:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x0574
        L_0x0556:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
        L_0x0561:
            int r3 = r3 + 4
            goto L_0x0403
        L_0x0565:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzbi.zzx(r3)
        L_0x0570:
            int r3 = r3 + 8
            goto L_0x0403
        L_0x0574:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x057b:
            com.google.android.gms.internal.play_billing.zzeg r2 = r0.zzm
            java.lang.Object r3 = r2.zzd(r1)
            int r2 = r2.zza(r3)
            int r6 = r6 + r2
            boolean r2 = r0.zzh
            if (r2 != 0) goto L_0x058b
            return r6
        L_0x058b:
            com.google.android.gms.internal.play_billing.zzbo r2 = r0.zzn
            r2.zza(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzo(java.lang.Object):int");
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzeq.zzf(obj, j10)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzan zzan) {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzcz) object).zze()) {
            zzcz zzb2 = zzcz.zza().zzb();
            zzda.zzb(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzcy zzcy = (zzcy) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzan zzan) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        zzan zzan2 = zzan;
        Unsafe unsafe = zzb;
        long j12 = (long) (this.zzc[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(zzao.zzp(bArr, i10))));
                    int i23 = i18 + 8;
                    unsafe.putInt(obj2, j12, i20);
                    return i23;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(zzao.zzb(bArr, i10))));
                    int i24 = i18 + 4;
                    unsafe.putInt(obj2, j12, i20);
                    return i24;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int zzm2 = zzao.zzm(bArr2, i18, zzan2);
                    unsafe.putObject(obj2, j11, Long.valueOf(zzan2.zzb));
                    unsafe.putInt(obj2, j12, i20);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int zzj2 = zzao.zzj(bArr2, i18, zzan2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzan2.zza));
                    unsafe.putInt(obj2, j12, i20);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Long.valueOf(zzao.zzp(bArr, i10)));
                    int i25 = i18 + 8;
                    unsafe.putInt(obj2, j12, i20);
                    return i25;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzao.zzb(bArr, i10)));
                    int i26 = i18 + 4;
                    unsafe.putInt(obj2, j12, i20);
                    return i26;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int zzm3 = zzao.zzm(bArr2, i18, zzan2);
                    unsafe.putObject(obj2, j11, Boolean.valueOf(zzan2.zzb != 0));
                    unsafe.putInt(obj2, j12, i20);
                    return zzm3;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int zzj3 = zzao.zzj(bArr2, i18, zzan2);
                    int i27 = zzan2.zza;
                    if (i27 == 0) {
                        unsafe.putObject(obj2, j11, "");
                    } else if ((i15 & 536870912) == 0 || zzev.zze(bArr2, zzj3, zzj3 + i27)) {
                        unsafe.putObject(obj2, j11, new String(bArr2, zzj3, i27, zzcg.zzb));
                        zzj3 += i27;
                    } else {
                        throw zzci.zzc();
                    }
                    unsafe.putInt(obj2, j12, i20);
                    return zzj3;
                }
                break;
            case 60:
                if (i21 == 2) {
                    Object zzE = zzE(obj2, i20, i22);
                    int zzo2 = zzao.zzo(zzE, zzB(i22), bArr, i10, i11, zzan);
                    zzM(obj2, i20, i22, zzE);
                    return zzo2;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int zza2 = zzao.zza(bArr2, i18, zzan2);
                    unsafe.putObject(obj2, j11, zzan2.zzc);
                    unsafe.putInt(obj2, j12, i20);
                    return zza2;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int zzj4 = zzao.zzj(bArr2, i18, zzan2);
                    int i28 = zzan2.zza;
                    zzce zzA = zzA(i22);
                    if (zzA == null || zzA.zza(i28)) {
                        unsafe.putObject(obj2, j11, Integer.valueOf(i28));
                        unsafe.putInt(obj2, j12, i20);
                    } else {
                        zzd(obj).zzj(i19, Long.valueOf((long) i28));
                    }
                    return zzj4;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int zzj5 = zzao.zzj(bArr2, i18, zzan2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzbe.zzb(zzan2.zza)));
                    unsafe.putInt(obj2, j12, i20);
                    return zzj5;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int zzm4 = zzao.zzm(bArr2, i18, zzan2);
                    unsafe.putObject(obj2, j11, Long.valueOf(zzbe.zzc(zzan2.zzb)));
                    unsafe.putInt(obj2, j12, i20);
                    return zzm4;
                }
                break;
            case 68:
                if (i21 == 3) {
                    Object zzE2 = zzE(obj2, i20, i22);
                    int zzn2 = zzao.zzn(zzE2, zzB(i22), bArr, i10, i11, (i19 & -8) | 4, zzan);
                    zzM(obj2, i20, i22, zzE2);
                    return zzn2;
                }
                break;
        }
        return i18;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x01cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0495 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0495 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.play_billing.zzan r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r8 = r22
            r6 = r23
            r9 = r24
            r10 = r28
            r7 = r30
            sun.misc.Unsafe r12 = zzb
            java.lang.Object r13 = r12.getObject(r1, r10)
            com.google.android.gms.internal.play_billing.zzcf r13 = (com.google.android.gms.internal.play_billing.zzcf) r13
            boolean r14 = r13.zzc()
            if (r14 != 0) goto L_0x0035
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002d
            r14 = 10
            goto L_0x002e
        L_0x002d:
            int r14 = r14 + r14
        L_0x002e:
            com.google.android.gms.internal.play_billing.zzcf r13 = r13.zzd(r14)
            r12.putObject(r1, r10, r13)
        L_0x0035:
            r10 = 5
            r11 = 0
            r15 = 1
            r14 = 2
            switch(r27) {
                case 18: goto L_0x0427;
                case 19: goto L_0x03da;
                case 20: goto L_0x0397;
                case 21: goto L_0x0397;
                case 22: goto L_0x037e;
                case 23: goto L_0x033d;
                case 24: goto L_0x02fc;
                case 25: goto L_0x02a4;
                case 26: goto L_0x01f1;
                case 27: goto L_0x01d8;
                case 28: goto L_0x017e;
                case 29: goto L_0x037e;
                case 30: goto L_0x00fd;
                case 31: goto L_0x02fc;
                case 32: goto L_0x033d;
                case 33: goto L_0x00ae;
                case 34: goto L_0x005f;
                case 35: goto L_0x0427;
                case 36: goto L_0x03da;
                case 37: goto L_0x0397;
                case 38: goto L_0x0397;
                case 39: goto L_0x037e;
                case 40: goto L_0x033d;
                case 41: goto L_0x02fc;
                case 42: goto L_0x02a4;
                case 43: goto L_0x037e;
                case 44: goto L_0x00fd;
                case 45: goto L_0x02fc;
                case 46: goto L_0x033d;
                case 47: goto L_0x00ae;
                case 48: goto L_0x005f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzdp r1 = r0.zzB(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzc(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.zzc
            r13.add(r8)
            goto L_0x0473
        L_0x005f:
            if (r6 != r14) goto L_0x0083
            com.google.android.gms.internal.play_billing.zzcu r13 = (com.google.android.gms.internal.play_billing.zzcu) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x006a:
            if (r1 >= r2) goto L_0x007a
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.play_billing.zzbe.zzc(r4)
            r13.zzf(r4)
            goto L_0x006a
        L_0x007a:
            if (r1 != r2) goto L_0x007e
            goto L_0x0496
        L_0x007e:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x0083:
            if (r6 != 0) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzcu r13 = (com.google.android.gms.internal.play_billing.zzcu) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.play_billing.zzbe.zzc(r8)
            r13.zzf(r8)
        L_0x0094:
            if (r1 >= r5) goto L_0x00ad
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009f
            goto L_0x00ad
        L_0x009f:
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.play_billing.zzbe.zzc(r8)
            r13.zzf(r8)
            goto L_0x0094
        L_0x00ad:
            return r1
        L_0x00ae:
            if (r6 != r14) goto L_0x00d2
            com.google.android.gms.internal.play_billing.zzcc r13 = (com.google.android.gms.internal.play_billing.zzcc) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b9:
            if (r1 >= r2) goto L_0x00c9
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.play_billing.zzbe.zzb(r4)
            r13.zzf(r4)
            goto L_0x00b9
        L_0x00c9:
            if (r1 != r2) goto L_0x00cd
            goto L_0x0496
        L_0x00cd:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x00d2:
            if (r6 != 0) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzcc r13 = (com.google.android.gms.internal.play_billing.zzcc) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.play_billing.zzbe.zzb(r4)
            r13.zzf(r4)
        L_0x00e3:
            if (r1 >= r5) goto L_0x00fc
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00ee
            goto L_0x00fc
        L_0x00ee:
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.play_billing.zzbe.zzb(r4)
            r13.zzf(r4)
            goto L_0x00e3
        L_0x00fc:
            return r1
        L_0x00fd:
            if (r6 != r14) goto L_0x0104
            int r2 = com.google.android.gms.internal.play_billing.zzao.zzf(r3, r4, r13, r7)
            goto L_0x0115
        L_0x0104:
            if (r6 != 0) goto L_0x0495
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r13
            r7 = r30
            int r2 = com.google.android.gms.internal.play_billing.zzao.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0115:
            com.google.android.gms.internal.play_billing.zzce r3 = r0.zzA(r9)
            com.google.android.gms.internal.play_billing.zzeg r4 = r0.zzm
            int r5 = com.google.android.gms.internal.play_billing.zzdr.zza
            if (r3 == 0) goto L_0x017b
            boolean r5 = r13 instanceof java.util.RandomAccess
            r6 = 0
            if (r5 == 0) goto L_0x0159
            int r5 = r13.size()
            r7 = 0
            r14 = 0
        L_0x012a:
            if (r14 >= r5) goto L_0x014f
            java.lang.Object r9 = r13.get(r14)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r3.zza(r9)
            if (r10 == 0) goto L_0x0148
            if (r14 == r7) goto L_0x0145
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L_0x0145:
            int r7 = r7 + 1
            goto L_0x014c
        L_0x0148:
            java.lang.Object r6 = com.google.android.gms.internal.play_billing.zzdr.zzA(r1, r8, r9, r6, r4)
        L_0x014c:
            int r14 = r14 + 1
            goto L_0x012a
        L_0x014f:
            if (r7 == r5) goto L_0x017b
            java.util.List r1 = r13.subList(r7, r5)
            r1.clear()
            return r2
        L_0x0159:
            java.util.Iterator r5 = r13.iterator()
        L_0x015d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x017b
            java.lang.Object r7 = r5.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r3.zza(r7)
            if (r9 != 0) goto L_0x015d
            java.lang.Object r6 = com.google.android.gms.internal.play_billing.zzdr.zzA(r1, r8, r7, r6, r4)
            r5.remove()
            goto L_0x015d
        L_0x017b:
            r1 = r2
            goto L_0x0496
        L_0x017e:
            if (r6 != r14) goto L_0x0495
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x01d3
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01ce
            if (r4 != 0) goto L_0x0194
            com.google.android.gms.internal.play_billing.zzba r4 = com.google.android.gms.internal.play_billing.zzba.zzb
            r13.add(r4)
            goto L_0x019c
        L_0x0194:
            com.google.android.gms.internal.play_billing.zzba r6 = com.google.android.gms.internal.play_billing.zzba.zzl(r3, r1, r4)
            r13.add(r6)
        L_0x019b:
            int r1 = r1 + r4
        L_0x019c:
            if (r1 >= r5) goto L_0x01cd
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x01a7
            goto L_0x01cd
        L_0x01a7:
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x01c8
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01c3
            if (r4 != 0) goto L_0x01bb
            com.google.android.gms.internal.play_billing.zzba r4 = com.google.android.gms.internal.play_billing.zzba.zzb
            r13.add(r4)
            goto L_0x019c
        L_0x01bb:
            com.google.android.gms.internal.play_billing.zzba r6 = com.google.android.gms.internal.play_billing.zzba.zzl(r3, r1, r4)
            r13.add(r6)
            goto L_0x019b
        L_0x01c3:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x01c8:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzd()
            throw r1
        L_0x01cd:
            return r1
        L_0x01ce:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x01d3:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzd()
            throw r1
        L_0x01d8:
            if (r6 != r14) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzdp r1 = r0.zzB(r9)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r13
            r28 = r30
            int r1 = com.google.android.gms.internal.play_billing.zzao.zze(r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x01f1:
            if (r6 != r14) goto L_0x0495
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0244
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x023f
            if (r6 != 0) goto L_0x020c
            r13.add(r1)
            goto L_0x0217
        L_0x020c:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.play_billing.zzcg.zzb
            r8.<init>(r3, r4, r6, r9)
            r13.add(r8)
        L_0x0216:
            int r4 = r4 + r6
        L_0x0217:
            if (r4 >= r5) goto L_0x0495
            int r6 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0495
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x023a
            if (r6 != 0) goto L_0x022f
            r13.add(r1)
            goto L_0x0217
        L_0x022f:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.play_billing.zzcg.zzb
            r8.<init>(r3, r4, r6, r9)
            r13.add(r8)
            goto L_0x0216
        L_0x023a:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzd()
            throw r1
        L_0x023f:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzd()
            throw r1
        L_0x0244:
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x029f
            if (r6 != 0) goto L_0x0252
            r13.add(r1)
            goto L_0x0265
        L_0x0252:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.play_billing.zzev.zze(r3, r4, r8)
            if (r9 == 0) goto L_0x029a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.play_billing.zzcg.zzb
            r9.<init>(r3, r4, r6, r10)
            r13.add(r9)
        L_0x0264:
            r4 = r8
        L_0x0265:
            if (r4 >= r5) goto L_0x0495
            int r6 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0495
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0295
            if (r6 != 0) goto L_0x027d
            r13.add(r1)
            goto L_0x0265
        L_0x027d:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.play_billing.zzev.zze(r3, r4, r8)
            if (r9 == 0) goto L_0x0290
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.play_billing.zzcg.zzb
            r9.<init>(r3, r4, r6, r10)
            r13.add(r9)
            goto L_0x0264
        L_0x0290:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzc()
            throw r1
        L_0x0295:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzd()
            throw r1
        L_0x029a:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzc()
            throw r1
        L_0x029f:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzd()
            throw r1
        L_0x02a4:
            if (r6 != r14) goto L_0x02cb
            com.google.android.gms.internal.play_billing.zzap r13 = (com.google.android.gms.internal.play_billing.zzap) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02af:
            if (r1 >= r2) goto L_0x02c2
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r3, r1, r7)
            long r4 = r7.zzb
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x02bd
            r4 = 1
            goto L_0x02be
        L_0x02bd:
            r4 = 0
        L_0x02be:
            r13.zze(r4)
            goto L_0x02af
        L_0x02c2:
            if (r1 != r2) goto L_0x02c6
            goto L_0x0496
        L_0x02c6:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x02cb:
            if (r6 != 0) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzap r13 = (com.google.android.gms.internal.play_billing.zzap) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r3, r4, r7)
            long r8 = r7.zzb
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x02db
            r4 = 1
            goto L_0x02dc
        L_0x02db:
            r4 = 0
        L_0x02dc:
            r13.zze(r4)
        L_0x02df:
            if (r1 >= r5) goto L_0x02fb
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ea
            goto L_0x02fb
        L_0x02ea:
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r3, r4, r7)
            long r8 = r7.zzb
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x02f6
            r4 = 1
            goto L_0x02f7
        L_0x02f6:
            r4 = 0
        L_0x02f7:
            r13.zze(r4)
            goto L_0x02df
        L_0x02fb:
            return r1
        L_0x02fc:
            if (r6 != r14) goto L_0x031c
            com.google.android.gms.internal.play_billing.zzcc r13 = (com.google.android.gms.internal.play_billing.zzcc) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0307:
            if (r1 >= r2) goto L_0x0313
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzb(r3, r1)
            r13.zzf(r4)
            int r1 = r1 + 4
            goto L_0x0307
        L_0x0313:
            if (r1 != r2) goto L_0x0317
            goto L_0x0496
        L_0x0317:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x031c:
            if (r6 != r10) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzcc r13 = (com.google.android.gms.internal.play_billing.zzcc) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzb(r18, r19)
            r13.zzf(r1)
        L_0x0327:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x033c
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0334
            goto L_0x033c
        L_0x0334:
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzb(r3, r4)
            r13.zzf(r1)
            goto L_0x0327
        L_0x033c:
            return r1
        L_0x033d:
            if (r6 != r14) goto L_0x035d
            com.google.android.gms.internal.play_billing.zzcu r13 = (com.google.android.gms.internal.play_billing.zzcu) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0348:
            if (r1 >= r2) goto L_0x0354
            long r4 = com.google.android.gms.internal.play_billing.zzao.zzp(r3, r1)
            r13.zzf(r4)
            int r1 = r1 + 8
            goto L_0x0348
        L_0x0354:
            if (r1 != r2) goto L_0x0358
            goto L_0x0496
        L_0x0358:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x035d:
            if (r6 != r15) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzcu r13 = (com.google.android.gms.internal.play_billing.zzcu) r13
            long r8 = com.google.android.gms.internal.play_billing.zzao.zzp(r18, r19)
            r13.zzf(r8)
        L_0x0368:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x037d
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0375
            goto L_0x037d
        L_0x0375:
            long r8 = com.google.android.gms.internal.play_billing.zzao.zzp(r3, r4)
            r13.zzf(r8)
            goto L_0x0368
        L_0x037d:
            return r1
        L_0x037e:
            if (r6 != r14) goto L_0x0386
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzf(r3, r4, r13, r7)
            goto L_0x0496
        L_0x0386:
            if (r6 != 0) goto L_0x0495
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r13
            r26 = r30
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzl(r21, r22, r23, r24, r25, r26)
            return r1
        L_0x0397:
            if (r6 != r14) goto L_0x03b7
            com.google.android.gms.internal.play_billing.zzcu r13 = (com.google.android.gms.internal.play_billing.zzcu) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03a2:
            if (r1 >= r2) goto L_0x03ae
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r13.zzf(r4)
            goto L_0x03a2
        L_0x03ae:
            if (r1 != r2) goto L_0x03b2
            goto L_0x0496
        L_0x03b2:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x03b7:
            if (r6 != 0) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzcu r13 = (com.google.android.gms.internal.play_billing.zzcu) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r13.zzf(r8)
        L_0x03c4:
            if (r1 >= r5) goto L_0x03d9
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03cf
            goto L_0x03d9
        L_0x03cf:
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r13.zzf(r8)
            goto L_0x03c4
        L_0x03d9:
            return r1
        L_0x03da:
            if (r6 != r14) goto L_0x03fe
            com.google.android.gms.internal.play_billing.zzbu r13 = (com.google.android.gms.internal.play_billing.zzbu) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03e5:
            if (r1 >= r2) goto L_0x03f5
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.zze(r4)
            int r1 = r1 + 4
            goto L_0x03e5
        L_0x03f5:
            if (r1 != r2) goto L_0x03f9
            goto L_0x0496
        L_0x03f9:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x03fe:
            if (r6 != r10) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzbu r13 = (com.google.android.gms.internal.play_billing.zzbu) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzb(r18, r19)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.zze(r1)
        L_0x040d:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0426
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x041a
            goto L_0x0426
        L_0x041a:
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.zze(r1)
            goto L_0x040d
        L_0x0426:
            return r1
        L_0x0427:
            if (r6 != r14) goto L_0x044a
            com.google.android.gms.internal.play_billing.zzbk r13 = (com.google.android.gms.internal.play_billing.zzbk) r13
            int r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0432:
            if (r1 >= r2) goto L_0x0442
            long r4 = com.google.android.gms.internal.play_billing.zzao.zzp(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.zze(r4)
            int r1 = r1 + 8
            goto L_0x0432
        L_0x0442:
            if (r1 != r2) goto L_0x0445
            goto L_0x0496
        L_0x0445:
            com.google.android.gms.internal.play_billing.zzci r1 = com.google.android.gms.internal.play_billing.zzci.zzg()
            throw r1
        L_0x044a:
            if (r6 != r15) goto L_0x0495
            com.google.android.gms.internal.play_billing.zzbk r13 = (com.google.android.gms.internal.play_billing.zzbk) r13
            long r8 = com.google.android.gms.internal.play_billing.zzao.zzp(r18, r19)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.zze(r8)
        L_0x0459:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0472
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0466
            goto L_0x0472
        L_0x0466:
            long r8 = com.google.android.gms.internal.play_billing.zzao.zzp(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.zze(r8)
            goto L_0x0459
        L_0x0472:
            return r1
        L_0x0473:
            if (r4 >= r5) goto L_0x0494
            int r8 = com.google.android.gms.internal.play_billing.zzao.zzj(r3, r4, r7)
            int r9 = r7.zza
            if (r2 == r9) goto L_0x047e
            goto L_0x0494
        L_0x047e:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.play_billing.zzao.zzc(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.zzc
            r13.add(r8)
            goto L_0x0473
        L_0x0494:
            return r4
        L_0x0495:
            r1 = r4
        L_0x0496:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.play_billing.zzan):int");
    }

    private final int zzt(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzw(i10, 0);
    }

    private final int zzu(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzw(i10, i11);
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzw(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzx(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzz(Object obj, long j10) {
        return ((Long) zzeq.zzf(obj, j10)).longValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x032a, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0424, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04a6, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04f8, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0563, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0573, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0577, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.play_billing.zzew r0 = com.google.android.gms.internal.play_billing.zzew.DOUBLE
            int r0 = r11.zzo
            int r0 = r0 + -1
            if (r0 == 0) goto L_0x0587
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000d:
            int[] r4 = r11.zzc
            int r4 = r4.length
            if (r2 >= r4) goto L_0x057b
            int r4 = r11.zzy(r2)
            int r5 = zzx(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            com.google.android.gms.internal.play_billing.zzbt r7 = com.google.android.gms.internal.play_billing.zzbt.DOUBLE_LIST_PACKED
            int r7 = r7.zza()
            if (r5 < r7) goto L_0x0038
            com.google.android.gms.internal.play_billing.zzbt r7 = com.google.android.gms.internal.play_billing.zzbt.SINT64_LIST_PACKED
            int r7 = r7.zza()
            if (r5 > r7) goto L_0x0038
            int[] r7 = r11.zzc
            int r8 = r2 + 2
            r7 = r7[r8]
        L_0x0038:
            long r7 = (long) r4
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0567;
                case 1: goto L_0x0557;
                case 2: goto L_0x0540;
                case 3: goto L_0x052b;
                case 4: goto L_0x0516;
                case 5: goto L_0x0509;
                case 6: goto L_0x04fc;
                case 7: goto L_0x04ec;
                case 8: goto L_0x04bd;
                case 9: goto L_0x04a9;
                case 10: goto L_0x0489;
                case 11: goto L_0x0473;
                case 12: goto L_0x045d;
                case 13: goto L_0x044f;
                case 14: goto L_0x0441;
                case 15: goto L_0x0426;
                case 16: goto L_0x040a;
                case 17: goto L_0x03f5;
                case 18: goto L_0x03e8;
                case 19: goto L_0x03dd;
                case 20: goto L_0x03d2;
                case 21: goto L_0x03c7;
                case 22: goto L_0x03bc;
                case 23: goto L_0x03b1;
                case 24: goto L_0x03a6;
                case 25: goto L_0x039b;
                case 26: goto L_0x0390;
                case 27: goto L_0x0381;
                case 28: goto L_0x0375;
                case 29: goto L_0x0369;
                case 30: goto L_0x035d;
                case 31: goto L_0x0351;
                case 32: goto L_0x0345;
                case 33: goto L_0x0339;
                case 34: goto L_0x032d;
                case 35: goto L_0x0314;
                case 36: goto L_0x02fd;
                case 37: goto L_0x02e6;
                case 38: goto L_0x02cf;
                case 39: goto L_0x02b8;
                case 40: goto L_0x02a0;
                case 41: goto L_0x0288;
                case 42: goto L_0x026e;
                case 43: goto L_0x0256;
                case 44: goto L_0x023e;
                case 45: goto L_0x0226;
                case 46: goto L_0x020e;
                case 47: goto L_0x01f6;
                case 48: goto L_0x01de;
                case 49: goto L_0x01ce;
                case 50: goto L_0x01c1;
                case 51: goto L_0x01b3;
                case 52: goto L_0x01a5;
                case 53: goto L_0x018f;
                case 54: goto L_0x0179;
                case 55: goto L_0x0163;
                case 56: goto L_0x0155;
                case 57: goto L_0x0147;
                case 58: goto L_0x0139;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f4;
                case 61: goto L_0x00d5;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00a9;
                case 64: goto L_0x009b;
                case 65: goto L_0x008d;
                case 66: goto L_0x0072;
                case 67: goto L_0x0056;
                case 68: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0577
        L_0x0040:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            com.google.android.gms.internal.play_billing.zzdf r4 = (com.google.android.gms.internal.play_billing.zzdf) r4
            com.google.android.gms.internal.play_billing.zzdp r5 = r11.zzB(r2)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzt(r6, r4, r5)
            goto L_0x03f2
        L_0x0056:
            boolean r5 = r11.zzT(r12, r6, r2)
            if (r5 == 0) goto L_0x0577
            long r7 = zzz(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzy(r5)
            goto L_0x0424
        L_0x0072:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = zzp(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0554
        L_0x008d:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0573
        L_0x009b:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0563
        L_0x00a9:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = zzp(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzu(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x0554
        L_0x00bf:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = zzp(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x0554
        L_0x00d5:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            com.google.android.gms.internal.play_billing.zzba r4 = (com.google.android.gms.internal.play_billing.zzba) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x04a6
        L_0x00f4:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            com.google.android.gms.internal.play_billing.zzdp r5 = r11.zzB(r2)
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzn(r6, r4, r5)
            goto L_0x03f2
        L_0x0108:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.play_billing.zzba
            if (r5 == 0) goto L_0x012b
            com.google.android.gms.internal.play_billing.zzba r4 = (com.google.android.gms.internal.play_billing.zzba) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x04a6
        L_0x012b:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzw(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x0554
        L_0x0139:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x04f8
        L_0x0147:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0563
        L_0x0155:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0573
        L_0x0163:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = zzp(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzu(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x0554
        L_0x0179:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            long r4 = zzz(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzy(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r6)
            goto L_0x0554
        L_0x018f:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            long r4 = zzz(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzy(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r6)
            goto L_0x0554
        L_0x01a5:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0563
        L_0x01b3:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0573
        L_0x01c1:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.lang.Object r5 = r11.zzC(r2)
            com.google.android.gms.internal.play_billing.zzda.zza(r6, r4, r5)
            goto L_0x0577
        L_0x01ce:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.play_billing.zzdp r5 = r11.zzB(r2)
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzi(r6, r4, r5)
            goto L_0x03f2
        L_0x01de:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzs(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x01f6:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzq(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x020e:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzh(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x0226:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzf(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x023e:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzd(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x0256:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzv(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x026e:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r5 = com.google.android.gms.internal.play_billing.zzdr.zza
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x0288:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzf(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x02a0:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzh(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x02b8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzk(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x02cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzx(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x02e6:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzm(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x02fd:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzf(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x032a
        L_0x0314:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzh(r4)
            if (r4 <= 0) goto L_0x0577
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
        L_0x032a:
            int r5 = r5 + r6
            goto L_0x0554
        L_0x032d:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzr(r6, r4, r1)
            goto L_0x03f2
        L_0x0339:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzp(r6, r4, r1)
            goto L_0x03f2
        L_0x0345:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzg(r6, r4, r1)
            goto L_0x03f2
        L_0x0351:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zze(r6, r4, r1)
            goto L_0x03f2
        L_0x035d:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzc(r6, r4, r1)
            goto L_0x03f2
        L_0x0369:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzu(r6, r4, r1)
            goto L_0x03f2
        L_0x0375:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzb(r6, r4)
            goto L_0x03f2
        L_0x0381:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.play_billing.zzdp r5 = r11.zzB(r2)
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzo(r6, r4, r5)
            goto L_0x03f2
        L_0x0390:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzt(r6, r4)
            goto L_0x03f2
        L_0x039b:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zza(r6, r4, r1)
            goto L_0x03f2
        L_0x03a6:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zze(r6, r4, r1)
            goto L_0x03f2
        L_0x03b1:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzg(r6, r4, r1)
            goto L_0x03f2
        L_0x03bc:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzj(r6, r4, r1)
            goto L_0x03f2
        L_0x03c7:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzw(r6, r4, r1)
            goto L_0x03f2
        L_0x03d2:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzl(r6, r4, r1)
            goto L_0x03f2
        L_0x03dd:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zze(r6, r4, r1)
            goto L_0x03f2
        L_0x03e8:
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzg(r6, r4, r1)
        L_0x03f2:
            int r3 = r3 + r4
            goto L_0x0577
        L_0x03f5:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            com.google.android.gms.internal.play_billing.zzdf r4 = (com.google.android.gms.internal.play_billing.zzdf) r4
            com.google.android.gms.internal.play_billing.zzdp r5 = r11.zzB(r2)
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzt(r6, r4, r5)
            goto L_0x03f2
        L_0x040a:
            boolean r5 = r11.zzP(r12, r2)
            if (r5 == 0) goto L_0x0577
            long r7 = com.google.android.gms.internal.play_billing.zzeq.zzd(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzy(r5)
        L_0x0424:
            int r4 = r4 + r5
            goto L_0x03f2
        L_0x0426:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = com.google.android.gms.internal.play_billing.zzeq.zzc(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0554
        L_0x0441:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0573
        L_0x044f:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0563
        L_0x045d:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = com.google.android.gms.internal.play_billing.zzeq.zzc(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzu(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x0554
        L_0x0473:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = com.google.android.gms.internal.play_billing.zzeq.zzc(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x0554
        L_0x0489:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            com.google.android.gms.internal.play_billing.zzba r4 = (com.google.android.gms.internal.play_billing.zzba) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
        L_0x04a6:
            int r4 = r4 + r6
            goto L_0x03f2
        L_0x04a9:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            com.google.android.gms.internal.play_billing.zzdp r5 = r11.zzB(r2)
            int r4 = com.google.android.gms.internal.play_billing.zzdr.zzn(r6, r4, r5)
            goto L_0x03f2
        L_0x04bd:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.play_billing.zzba
            if (r5 == 0) goto L_0x04df
            com.google.android.gms.internal.play_billing.zzba r4 = (com.google.android.gms.internal.play_billing.zzba) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x04a6
        L_0x04df:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzw(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x0554
        L_0x04ec:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
        L_0x04f8:
            int r4 = r4 + 1
            goto L_0x03f2
        L_0x04fc:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0563
        L_0x0509:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
            goto L_0x0573
        L_0x0516:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = com.google.android.gms.internal.play_billing.zzeq.zzc(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzu(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r5)
            goto L_0x0554
        L_0x052b:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            long r4 = com.google.android.gms.internal.play_billing.zzeq.zzd(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzy(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r6)
            goto L_0x0554
        L_0x0540:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            long r4 = com.google.android.gms.internal.play_billing.zzeq.zzd(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzy(r4)
            int r5 = com.google.android.gms.internal.play_billing.zzbi.zzx(r6)
        L_0x0554:
            int r5 = r5 + r4
            int r3 = r3 + r5
            goto L_0x0577
        L_0x0557:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
        L_0x0563:
            int r4 = r4 + 4
            goto L_0x03f2
        L_0x0567:
            boolean r4 = r11.zzP(r12, r2)
            if (r4 == 0) goto L_0x0577
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.play_billing.zzbi.zzx(r4)
        L_0x0573:
            int r4 = r4 + 8
            goto L_0x03f2
        L_0x0577:
            int r2 = r2 + 3
            goto L_0x000d
        L_0x057b:
            com.google.android.gms.internal.play_billing.zzeg r0 = r11.zzm
            java.lang.Object r12 = r0.zzd(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        L_0x0587:
            int r12 = r11.zzo(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zza(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0201, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020f, code lost:
        r2 = r2 + ((int) (r3 ^ (r3 >>> 32)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0214, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0218
            int r3 = r9.zzy(r1)
            int[] r4 = r9.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = zzx(r3)
            long r5 = (long) r5
            r7 = 37
            r8 = 32
            switch(r3) {
                case 0: goto L_0x0203;
                case 1: goto L_0x01f7;
                case 2: goto L_0x01ee;
                case 3: goto L_0x01e5;
                case 4: goto L_0x01de;
                case 5: goto L_0x01d5;
                case 6: goto L_0x01ce;
                case 7: goto L_0x01c3;
                case 8: goto L_0x01b6;
                case 9: goto L_0x01a8;
                case 10: goto L_0x019d;
                case 11: goto L_0x0196;
                case 12: goto L_0x018e;
                case 13: goto L_0x0186;
                case 14: goto L_0x017c;
                case 15: goto L_0x0174;
                case 16: goto L_0x016a;
                case 17: goto L_0x015f;
                case 18: goto L_0x0153;
                case 19: goto L_0x0153;
                case 20: goto L_0x0153;
                case 21: goto L_0x0153;
                case 22: goto L_0x0153;
                case 23: goto L_0x0153;
                case 24: goto L_0x0153;
                case 25: goto L_0x0153;
                case 26: goto L_0x0153;
                case 27: goto L_0x0153;
                case 28: goto L_0x0153;
                case 29: goto L_0x0153;
                case 30: goto L_0x0153;
                case 31: goto L_0x0153;
                case 32: goto L_0x0153;
                case 33: goto L_0x0153;
                case 34: goto L_0x0153;
                case 35: goto L_0x0153;
                case 36: goto L_0x0153;
                case 37: goto L_0x0153;
                case 38: goto L_0x0153;
                case 39: goto L_0x0153;
                case 40: goto L_0x0153;
                case 41: goto L_0x0153;
                case 42: goto L_0x0153;
                case 43: goto L_0x0153;
                case 44: goto L_0x0153;
                case 45: goto L_0x0153;
                case 46: goto L_0x0153;
                case 47: goto L_0x0153;
                case 48: goto L_0x0153;
                case 49: goto L_0x0153;
                case 50: goto L_0x0147;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x0111;
                case 54: goto L_0x0101;
                case 55: goto L_0x00f3;
                case 56: goto L_0x00e3;
                case 57: goto L_0x00d5;
                case 58: goto L_0x00c3;
                case 59: goto L_0x00af;
                case 60: goto L_0x009d;
                case 61: goto L_0x008b;
                case 62: goto L_0x007d;
                case 63: goto L_0x006f;
                case 64: goto L_0x0061;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0033;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0214
        L_0x0021:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x0033:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzz(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x0043:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzp(r10, r5)
            goto L_0x0201
        L_0x0051:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzz(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x0061:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzp(r10, r5)
            goto L_0x0201
        L_0x006f:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzp(r10, r5)
            goto L_0x0201
        L_0x007d:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzp(r10, r5)
            goto L_0x0201
        L_0x008b:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x009d:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x00af:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x00c3:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            boolean r3 = zzU(r10, r5)
            int r3 = com.google.android.gms.internal.play_billing.zzcg.zza(r3)
            goto L_0x0201
        L_0x00d5:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzp(r10, r5)
            goto L_0x0201
        L_0x00e3:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzz(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x00f3:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            int r3 = zzp(r10, r5)
            goto L_0x0201
        L_0x0101:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzz(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x0111:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            long r3 = zzz(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x0121:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            float r3 = zzn(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0201
        L_0x0133:
            boolean r3 = r9.zzT(r10, r4, r1)
            if (r3 == 0) goto L_0x0214
            int r2 = r2 * 53
            double r3 = zzm(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x0147:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x0153:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x015f:
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            if (r3 == 0) goto L_0x01b2
            int r7 = r3.hashCode()
            goto L_0x01b2
        L_0x016a:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.play_billing.zzeq.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x0174:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.play_billing.zzeq.zzc(r10, r5)
            goto L_0x0201
        L_0x017c:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.play_billing.zzeq.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x0186:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.play_billing.zzeq.zzc(r10, r5)
            goto L_0x0201
        L_0x018e:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.play_billing.zzeq.zzc(r10, r5)
            goto L_0x0201
        L_0x0196:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.play_billing.zzeq.zzc(r10, r5)
            goto L_0x0201
        L_0x019d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x01a8:
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            if (r3 == 0) goto L_0x01b2
            int r7 = r3.hashCode()
        L_0x01b2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0214
        L_0x01b6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.zzeq.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0201
        L_0x01c3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.play_billing.zzeq.zzw(r10, r5)
            int r3 = com.google.android.gms.internal.play_billing.zzcg.zza(r3)
            goto L_0x0201
        L_0x01ce:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.play_billing.zzeq.zzc(r10, r5)
            goto L_0x0201
        L_0x01d5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.play_billing.zzeq.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.play_billing.zzeq.zzc(r10, r5)
            goto L_0x0201
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.play_billing.zzeq.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x01ee:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.play_billing.zzeq.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
            goto L_0x020f
        L_0x01f7:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.play_billing.zzeq.zzb(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
        L_0x0201:
            int r2 = r2 + r3
            goto L_0x0214
        L_0x0203:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.play_billing.zzeq.zza(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.play_billing.zzcg.zzd
        L_0x020f:
            long r5 = r3 >>> r8
            long r3 = r3 ^ r5
            int r4 = (int) r3
            int r2 = r2 + r4
        L_0x0214:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0218:
            int r2 = r2 * 53
            com.google.android.gms.internal.play_billing.zzeg r0 = r9.zzm
            java.lang.Object r0 = r0.zzd(r10)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r9.zzh
            if (r0 != 0) goto L_0x022a
            return r2
        L_0x022a:
            com.google.android.gms.internal.play_billing.zzbo r0 = r9.zzn
            r0.zza(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzb(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030c, code lost:
        if (r0 != r15) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0329, code lost:
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x035d, code lost:
        if (r0 != r15) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0385, code lost:
        if (r0 != r15) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0153, code lost:
        r5 = r7 | r8;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0156, code lost:
        r1 = r11;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015a, code lost:
        r12 = r6;
        r21 = r13;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ee, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0221, code lost:
        r6 = r24;
        r8 = -1;
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x024f, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0251, code lost:
        r5 = r7 | r8;
        r13 = r32;
        r2 = r6;
        r1 = r11;
        r3 = r21;
        r6 = r24;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x025c, code lost:
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0260, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0261, code lost:
        r0 = r33;
        r20 = r7;
        r27 = r10;
        r31 = r11;
        r22 = r12;
        r2 = r13;
        r7 = r21;
        r6 = r24;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.play_billing.zzan r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            zzG(r29)
            sun.misc.Unsafe r10 = zzb
            r8 = -1
            r16 = 0
            r0 = r31
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            r17 = 0
            if (r0 >= r13) goto L_0x03f5
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzk(r0, r12, r3, r9)
            int r3 = r9.zza
            r4 = r3
            r3 = r0
            goto L_0x0031
        L_0x0030:
            r4 = r0
        L_0x0031:
            int r0 = r4 >>> 3
            r7 = 3
            if (r0 <= r1) goto L_0x003c
            int r2 = r2 / r7
            int r1 = r15.zzu(r0, r2)
            goto L_0x0040
        L_0x003c:
            int r1 = r15.zzt(r0)
        L_0x0040:
            r2 = r1
            if (r2 != r8) goto L_0x0052
            r31 = r0
            r2 = r3
            r7 = r4
            r20 = r5
            r27 = r10
            r0 = r11
            r19 = -1
            r22 = 0
            goto L_0x0388
        L_0x0052:
            r1 = r4 & 7
            int[] r8 = r15.zzc
            int r20 = r2 + 1
            r7 = r8[r20]
            int r11 = zzx(r7)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7 & r18
            r22 = r3
            r21 = r4
            long r3 = (long) r0
            r0 = 17
            if (r11 > r0) goto L_0x0274
            int r0 = r2 + 2
            r0 = r8[r0]
            int r8 = r0 >>> 20
            r13 = 1
            int r8 = r13 << r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r13
            r18 = r7
            if (r0 == r6) goto L_0x008e
            if (r6 == r13) goto L_0x0085
            long r6 = (long) r6
            r10.putInt(r14, r6, r5)
        L_0x0085:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r24 = r0
            r7 = r5
            goto L_0x0091
        L_0x008e:
            r7 = r5
            r24 = r6
        L_0x0091:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x023c;
                case 1: goto L_0x0227;
                case 2: goto L_0x0202;
                case 3: goto L_0x0202;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01d6;
                case 6: goto L_0x01c4;
                case 7: goto L_0x01a9;
                case 8: goto L_0x018b;
                case 9: goto L_0x0160;
                case 10: goto L_0x0140;
                case 11: goto L_0x01f1;
                case 12: goto L_0x0111;
                case 13: goto L_0x01c4;
                case 14: goto L_0x01d6;
                case 15: goto L_0x00fa;
                case 16: goto L_0x00cb;
                default: goto L_0x0095;
            }
        L_0x0095:
            r6 = r2
            r11 = r20
            r13 = r22
            r0 = 3
            if (r1 != r0) goto L_0x0260
            java.lang.Object r5 = r15.zzD(r14, r6)
            int r0 = r11 << 3
            r17 = r0 | 4
            com.google.android.gms.internal.play_billing.zzdp r1 = r15.zzB(r6)
            r0 = r5
            r2 = r30
            r3 = r13
            r4 = r32
            r13 = r5
            r5 = r17
            r12 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzn(r0, r1, r2, r3, r4, r5, r6)
            r15.zzL(r14, r12, r13)
            r5 = r7 | r8
            r13 = r32
            r1 = r11
            r2 = r12
            r3 = r21
            r6 = r24
            r8 = -1
            r12 = r30
            goto L_0x025c
        L_0x00cb:
            if (r1 != 0) goto L_0x00f3
            r5 = r22
            int r6 = com.google.android.gms.internal.play_billing.zzao.zzm(r12, r5, r9)
            long r0 = r9.zzb
            long r17 = com.google.android.gms.internal.play_billing.zzbe.zzc(r0)
            r11 = r20
            r0 = r10
            r1 = r29
            r5 = r2
            r2 = r3
            r20 = r6
            r13 = r21
            r6 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r3 = r13
            r0 = r20
            goto L_0x0221
        L_0x00f3:
            r11 = r20
            r12 = r2
            r13 = r22
            goto L_0x0261
        L_0x00fa:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            if (r1 != 0) goto L_0x015a
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzj(r12, r5, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.play_billing.zzbe.zzb(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0153
        L_0x0111:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            if (r1 != 0) goto L_0x015a
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzj(r12, r5, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.play_billing.zzce r2 = r15.zzA(r6)
            if (r2 == 0) goto L_0x013c
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x012d
            goto L_0x013c
        L_0x012d:
            com.google.android.gms.internal.play_billing.zzeh r2 = zzd(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzj(r13, r1)
            r2 = r6
            r5 = r7
            goto L_0x0156
        L_0x013c:
            r10.putInt(r14, r3, r1)
            goto L_0x0153
        L_0x0140:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            r0 = 2
            if (r1 != r0) goto L_0x015a
            int r0 = com.google.android.gms.internal.play_billing.zzao.zza(r12, r5, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
        L_0x0153:
            r5 = r7 | r8
            r2 = r6
        L_0x0156:
            r1 = r11
            r3 = r13
            goto L_0x0221
        L_0x015a:
            r12 = r6
            r21 = r13
            r13 = r5
            goto L_0x0261
        L_0x0160:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            r0 = 2
            if (r1 != r0) goto L_0x0187
            java.lang.Object r4 = r15.zzD(r14, r6)
            com.google.android.gms.internal.play_billing.zzdp r1 = r15.zzB(r6)
            r0 = r4
            r2 = r30
            r3 = r5
            r5 = r4
            r4 = r32
            r21 = r13
            r13 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzo(r0, r1, r2, r3, r4, r5)
            r15.zzL(r14, r6, r13)
            goto L_0x0251
        L_0x0187:
            r21 = r13
            goto L_0x01ee
        L_0x018b:
            r6 = r2
            r11 = r20
            r5 = r22
            r0 = 2
            if (r1 != r0) goto L_0x01ee
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r18 & r0
            if (r0 != 0) goto L_0x019e
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzg(r12, r5, r9)
            goto L_0x01a2
        L_0x019e:
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzh(r12, r5, r9)
        L_0x01a2:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x0251
        L_0x01a9:
            r6 = r2
            r11 = r20
            r5 = r22
            if (r1 != 0) goto L_0x01ee
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzm(r12, r5, r9)
            long r1 = r9.zzb
            r17 = 0
            int r5 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x01be
            r13 = 1
            goto L_0x01bf
        L_0x01be:
            r13 = 0
        L_0x01bf:
            com.google.android.gms.internal.play_billing.zzeq.zzm(r14, r3, r13)
            goto L_0x0251
        L_0x01c4:
            r6 = r2
            r11 = r20
            r5 = r22
            if (r1 != r0) goto L_0x01ee
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzb(r12, r5)
            r10.putInt(r14, r3, r0)
            int r0 = r5 + 4
            goto L_0x0251
        L_0x01d6:
            r6 = r2
            r11 = r20
            r5 = r22
            r0 = 1
            if (r1 != r0) goto L_0x01ee
            long r17 = com.google.android.gms.internal.play_billing.zzao.zzp(r12, r5)
            r0 = r10
            r1 = r29
            r13 = r5
            r2 = r3
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x024f
        L_0x01ee:
            r13 = r5
            goto L_0x0260
        L_0x01f1:
            r6 = r2
            r11 = r20
            r13 = r22
            if (r1 != 0) goto L_0x0260
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzj(r12, r13, r9)
            int r1 = r9.zza
            r10.putInt(r14, r3, r1)
            goto L_0x0251
        L_0x0202:
            r6 = r2
            r11 = r20
            r13 = r22
            if (r1 != 0) goto L_0x0260
            int r13 = com.google.android.gms.internal.play_billing.zzao.zzm(r12, r13, r9)
            long r1 = r9.zzb
            r0 = r10
            r17 = r1
            r1 = r29
            r2 = r3
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r0 = r13
            r3 = r21
        L_0x0221:
            r6 = r24
            r8 = -1
            r13 = r32
            goto L_0x025c
        L_0x0227:
            r6 = r2
            r11 = r20
            r13 = r22
            if (r1 != r0) goto L_0x0260
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzb(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.play_billing.zzeq.zzp(r14, r3, r0)
            int r0 = r13 + 4
            goto L_0x0251
        L_0x023c:
            r6 = r2
            r11 = r20
            r13 = r22
            r0 = 1
            if (r1 != r0) goto L_0x0260
            long r0 = com.google.android.gms.internal.play_billing.zzao.zzp(r12, r13)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.play_billing.zzeq.zzo(r14, r3, r0)
        L_0x024f:
            int r0 = r13 + 8
        L_0x0251:
            r5 = r7 | r8
            r13 = r32
            r2 = r6
            r1 = r11
            r3 = r21
            r6 = r24
            r8 = -1
        L_0x025c:
            r11 = r33
            goto L_0x001d
        L_0x0260:
            r12 = r6
        L_0x0261:
            r0 = r33
            r20 = r7
            r27 = r10
            r31 = r11
            r22 = r12
            r2 = r13
            r7 = r21
            r6 = r24
            r19 = -1
            goto L_0x0388
        L_0x0274:
            r12 = r2
            r18 = r7
            r8 = r20
            r13 = r22
            r0 = 27
            if (r11 != r0) goto L_0x02d6
            r0 = 2
            if (r1 != r0) goto L_0x02c7
            java.lang.Object r0 = r10.getObject(r14, r3)
            com.google.android.gms.internal.play_billing.zzcf r0 = (com.google.android.gms.internal.play_billing.zzcf) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x029f
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0297
            r1 = 10
            goto L_0x0298
        L_0x0297:
            int r1 = r1 + r1
        L_0x0298:
            com.google.android.gms.internal.play_billing.zzcf r0 = r0.zzd(r1)
            r10.putObject(r14, r3, r0)
        L_0x029f:
            r7 = r0
            com.google.android.gms.internal.play_billing.zzdp r0 = r15.zzB(r12)
            r1 = r21
            r2 = r30
            r3 = r13
            r4 = r32
            r20 = r5
            r5 = r7
            r24 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.play_billing.zzao.zze(r0, r1, r2, r3, r4, r5, r6)
            r13 = r32
            r11 = r33
            r1 = r8
            r2 = r12
            r5 = r20
            r3 = r21
            r6 = r24
            r8 = -1
            r12 = r30
            goto L_0x001d
        L_0x02c7:
            r20 = r5
            r24 = r6
            r31 = r8
            r27 = r10
            r22 = r12
            r15 = r13
            r19 = -1
            goto L_0x0360
        L_0x02d6:
            r20 = r5
            r24 = r6
            r0 = 49
            if (r11 > r0) goto L_0x0332
            r7 = r18
            long r6 = (long) r7
            r0 = r28
            r5 = r1
            r1 = r29
            r2 = r30
            r25 = r3
            r3 = r13
            r4 = r32
            r18 = r5
            r5 = r21
            r22 = r6
            r6 = r8
            r7 = r18
            r31 = r8
            r19 = -1
            r8 = r12
            r27 = r10
            r9 = r22
            r15 = r33
            r22 = r12
            r15 = r13
            r12 = r25
            r14 = r34
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0329
        L_0x030e:
            r15 = r28
            r14 = r29
            r12 = r30
            r1 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r5 = r20
            r3 = r21
            r2 = r22
            r6 = r24
            r10 = r27
            r8 = -1
            goto L_0x001d
        L_0x0329:
            r2 = r0
            r7 = r21
            r6 = r24
            r0 = r33
            goto L_0x0388
        L_0x0332:
            r25 = r3
            r31 = r8
            r27 = r10
            r22 = r12
            r15 = r13
            r7 = r18
            r19 = -1
            r18 = r1
            r0 = 50
            if (r11 != r0) goto L_0x0368
            r8 = r18
            r0 = 2
            if (r8 != r0) goto L_0x0360
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r22
            r6 = r25
            r8 = r34
            int r0 = r0.zzq(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0329
            goto L_0x030e
        L_0x0360:
            r0 = r33
            r2 = r15
            r7 = r21
            r6 = r24
            goto L_0x0388
        L_0x0368:
            r8 = r18
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r21
            r6 = r31
            r9 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r25
            r12 = r22
            r13 = r34
            int r0 = r0.zzr(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0329
            goto L_0x030e
        L_0x0388:
            if (r7 != r0) goto L_0x0397
            if (r0 == 0) goto L_0x0397
            r8 = r28
            r12 = r29
            r9 = r0
            r0 = r2
            r3 = r7
            r5 = r20
            goto L_0x03fe
        L_0x0397:
            r8 = r28
            r9 = r0
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x03cd
            r10 = r34
            com.google.android.gms.internal.play_billing.zzbn r0 = r10.zzd
            com.google.android.gms.internal.play_billing.zzbn r1 = com.google.android.gms.internal.play_billing.zzbn.zza
            if (r0 == r1) goto L_0x03c8
            com.google.android.gms.internal.play_billing.zzdf r1 = r8.zzg
            r11 = r31
            com.google.android.gms.internal.play_billing.zzbz r0 = r0.zzb(r1, r11)
            if (r0 != 0) goto L_0x03c2
            com.google.android.gms.internal.play_billing.zzeh r4 = zzd(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzi(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x03e2
        L_0x03c2:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.play_billing.zzby r0 = (com.google.android.gms.internal.play_billing.zzby) r0
            throw r17
        L_0x03c8:
            r12 = r29
            r11 = r31
            goto L_0x03d3
        L_0x03cd:
            r12 = r29
            r11 = r31
            r10 = r34
        L_0x03d3:
            com.google.android.gms.internal.play_billing.zzeh r4 = zzd(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzi(r0, r1, r2, r3, r4, r5)
        L_0x03e2:
            r13 = r32
            r3 = r7
            r15 = r8
            r1 = r11
            r14 = r12
            r5 = r20
            r2 = r22
            r8 = -1
            r12 = r30
            r11 = r9
            r9 = r10
            r10 = r27
            goto L_0x001d
        L_0x03f5:
            r20 = r5
            r24 = r6
            r27 = r10
            r9 = r11
            r12 = r14
            r8 = r15
        L_0x03fe:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x0409
            long r6 = (long) r6
            r2 = r27
            r2.putInt(r12, r6, r5)
        L_0x0409:
            int r2 = r8.zzj
        L_0x040b:
            int r4 = r8.zzk
            if (r2 >= r4) goto L_0x0436
            int[] r4 = r8.zzi
            r4 = r4[r2]
            int[] r5 = r8.zzc
            r5 = r5[r4]
            int r5 = r8.zzy(r4)
            r5 = r5 & r1
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r5)
            if (r5 != 0) goto L_0x0424
            goto L_0x042a
        L_0x0424:
            com.google.android.gms.internal.play_billing.zzce r6 = r8.zzA(r4)
            if (r6 != 0) goto L_0x042d
        L_0x042a:
            int r2 = r2 + 1
            goto L_0x040b
        L_0x042d:
            com.google.android.gms.internal.play_billing.zzcz r5 = (com.google.android.gms.internal.play_billing.zzcz) r5
            java.lang.Object r0 = r8.zzC(r4)
            com.google.android.gms.internal.play_billing.zzcy r0 = (com.google.android.gms.internal.play_billing.zzcy) r0
            throw r17
        L_0x0436:
            if (r9 != 0) goto L_0x0442
            r1 = r32
            if (r0 != r1) goto L_0x043d
            goto L_0x0448
        L_0x043d:
            com.google.android.gms.internal.play_billing.zzci r0 = com.google.android.gms.internal.play_billing.zzci.zze()
            throw r0
        L_0x0442:
            r1 = r32
            if (r0 > r1) goto L_0x0449
            if (r3 != r9) goto L_0x0449
        L_0x0448:
            return r0
        L_0x0449:
            com.google.android.gms.internal.play_billing.zzci r0 = com.google.android.gms.internal.play_billing.zzci.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzan):int");
    }

    public final Object zze() {
        return ((zzcb) this.zzg).zzi();
    }

    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzcb) {
                zzcb zzcb = (zzcb) obj;
                zzcb.zzq(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzcb.zza = 0;
                zzcb.zzo();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzy = zzy(i10);
                int i11 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j10 = (long) i11;
                if (zzx != 9) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, this.zzc[i10], i10)) {
                            zzB(i10).zzf(zzb.getObject(obj, j10));
                        }
                    } else {
                        switch (zzx) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzl.zza(obj, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzcz) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (zzP(obj, i10)) {
                    zzB(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzb(obj);
            }
        }
    }

    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzy = zzy(i10);
            int i11 = this.zzc[i10];
            long j10 = (long) (1048575 & zzy);
            switch (zzx(zzy)) {
                case 0:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzo(obj, j10, zzeq.zza(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 1:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzp(obj, j10, zzeq.zzb(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 2:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 3:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 4:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 5:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 6:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 7:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzm(obj, j10, zzeq.zzw(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 8:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 11:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 12:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 13:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 14:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 15:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 16:
                    if (!zzP(obj2, i10)) {
                        break;
                    } else {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzdr.zza;
                    zzeq.zzs(obj, j10, zzda.zzb(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzT(obj2, i11, i10)) {
                        break;
                    } else {
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzT(obj2, i11, i10)) {
                        break;
                    } else {
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzdr.zzB(this.zzm, obj, obj2);
        if (this.zzh) {
            this.zzn.zza(obj2);
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e6, code lost:
        if (r0 != r15) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030a, code lost:
        if (r0 != r15) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019a, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01fe, code lost:
        r6 = r6 | r22;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0201, code lost:
        r1 = r19;
        r8 = 1048575;
        r9 = -1;
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x020b, code lost:
        r2 = r5;
        r27 = r10;
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a3, code lost:
        if (r0 != r15) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b9, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(java.lang.Object r29, byte[] r30, int r31, int r32, com.google.android.gms.internal.play_billing.zzan r33) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            com.google.android.gms.internal.play_billing.zzew r0 = com.google.android.gms.internal.play_billing.zzew.DOUBLE
            int r0 = r15.zzo
            r9 = -1
            int r0 = r0 + r9
            if (r0 == 0) goto L_0x0350
            zzG(r29)
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r31
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0024:
            if (r0 >= r13) goto L_0x0333
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0036
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzk(r0, r12, r3, r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x0039
        L_0x0036:
            r17 = r0
            r4 = r3
        L_0x0039:
            int r5 = r17 >>> 3
            if (r5 <= r1) goto L_0x0044
            int r2 = r2 / 3
            int r0 = r15.zzu(r5, r2)
            goto L_0x0048
        L_0x0044:
            int r0 = r15.zzt(r5)
        L_0x0048:
            r2 = r0
            if (r2 != r9) goto L_0x0056
            r2 = r4
            r19 = r5
            r27 = r10
            r18 = -1
            r22 = 0
            goto L_0x030d
        L_0x0056:
            r3 = r17 & 7
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r13 = zzx(r1)
            r9 = r1 & r8
            long r8 = (long) r9
            r31 = r5
            r5 = 17
            r20 = r1
            if (r13 > r5) goto L_0x0214
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r22 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r19 = r2
            if (r0 == r7) goto L_0x008d
            if (r7 == r5) goto L_0x0084
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
        L_0x0084:
            if (r0 == r5) goto L_0x008c
            long r1 = (long) r0
            int r1 = r10.getInt(r14, r1)
            r6 = r1
        L_0x008c:
            r7 = r0
        L_0x008d:
            r0 = 5
            switch(r13) {
                case 0: goto L_0x01e6;
                case 1: goto L_0x01ce;
                case 2: goto L_0x01b1;
                case 3: goto L_0x01b1;
                case 4: goto L_0x019d;
                case 5: goto L_0x017e;
                case 6: goto L_0x016a;
                case 7: goto L_0x014d;
                case 8: goto L_0x012d;
                case 9: goto L_0x010a;
                case 10: goto L_0x00f5;
                case 11: goto L_0x019d;
                case 12: goto L_0x00e1;
                case 13: goto L_0x016a;
                case 14: goto L_0x017e;
                case 15: goto L_0x00c9;
                case 16: goto L_0x009b;
                default: goto L_0x0091;
            }
        L_0x0091:
            r5 = r4
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            goto L_0x020b
        L_0x009b:
            if (r3 != 0) goto L_0x00be
            int r13 = com.google.android.gms.internal.play_billing.zzao.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r20 = com.google.android.gms.internal.play_billing.zzbe.zzc(r0)
            r0 = r10
            r1 = r29
            r4 = r19
            r2 = r8
            r19 = r31
            r8 = r4
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r20
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r2 = r8
            r0 = r13
            goto L_0x0201
        L_0x00be:
            r8 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            r5 = r4
            r13 = r8
            goto L_0x020b
        L_0x00c9:
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != 0) goto L_0x019a
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.play_billing.zzbe.zzb(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x01fe
        L_0x00e1:
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != 0) goto L_0x019a
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzj(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x01fe
        L_0x00f5:
            r13 = r19
            r0 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != r0) goto L_0x019a
            int r0 = com.google.android.gms.internal.play_billing.zzao.zza(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x01fe
        L_0x010a:
            r13 = r19
            r0 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != r0) goto L_0x019a
            java.lang.Object r8 = r15.zzD(r14, r13)
            com.google.android.gms.internal.play_billing.zzdp r1 = r15.zzB(r13)
            r0 = r8
            r2 = r30
            r3 = r4
            r4 = r32
            r5 = r33
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzo(r0, r1, r2, r3, r4, r5)
            r15.zzL(r14, r13, r8)
            goto L_0x01fe
        L_0x012d:
            r13 = r19
            r0 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != r0) goto L_0x019a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0142
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzg(r12, r4, r11)
            goto L_0x0146
        L_0x0142:
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzh(r12, r4, r11)
        L_0x0146:
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x01fe
        L_0x014d:
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != 0) goto L_0x019a
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzm(r12, r4, r11)
            long r1 = r11.zzb
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0164
            r1 = 1
            goto L_0x0165
        L_0x0164:
            r1 = 0
        L_0x0165:
            com.google.android.gms.internal.play_billing.zzeq.zzm(r14, r8, r1)
            goto L_0x01fe
        L_0x016a:
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != r0) goto L_0x019a
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzb(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x01fe
        L_0x017e:
            r13 = r19
            r0 = 1
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != r0) goto L_0x019a
            long r20 = com.google.android.gms.internal.play_billing.zzao.zzp(r12, r4)
            r0 = r10
            r1 = r29
            r2 = r8
            r8 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x01fe
        L_0x019a:
            r5 = r4
            goto L_0x020b
        L_0x019d:
            r5 = r4
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != 0) goto L_0x020b
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzj(r12, r5, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x01fe
        L_0x01b1:
            r5 = r4
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != 0) goto L_0x020b
            int r17 = com.google.android.gms.internal.play_billing.zzao.zzm(r12, r5, r11)
            long r4 = r11.zzb
            r0 = r10
            r1 = r29
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r2 = r13
            r0 = r17
            goto L_0x0201
        L_0x01ce:
            r5 = r4
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != r0) goto L_0x020b
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzb(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.play_billing.zzeq.zzp(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x01fe
        L_0x01e6:
            r5 = r4
            r13 = r19
            r0 = 1
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r31
            if (r3 != r0) goto L_0x020b
            long r0 = com.google.android.gms.internal.play_billing.zzao.zzp(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.play_billing.zzeq.zzo(r14, r8, r0)
            int r0 = r5 + 8
        L_0x01fe:
            r6 = r6 | r22
            r2 = r13
        L_0x0201:
            r1 = r19
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = -1
            r13 = r32
            goto L_0x0024
        L_0x020b:
            r2 = r5
            r27 = r10
            r22 = r13
            r18 = -1
            goto L_0x030d
        L_0x0214:
            r19 = r31
            r5 = r4
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r0 = 27
            if (r13 != r0) goto L_0x026b
            r0 = 2
            if (r3 != r0) goto L_0x025e
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.play_billing.zzcf r0 = (com.google.android.gms.internal.play_billing.zzcf) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x023f
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0237
            r1 = 10
            goto L_0x0238
        L_0x0237:
            int r1 = r1 + r1
        L_0x0238:
            com.google.android.gms.internal.play_billing.zzcf r0 = r0.zzd(r1)
            r10.putObject(r14, r8, r0)
        L_0x023f:
            r8 = r0
            com.google.android.gms.internal.play_billing.zzdp r0 = r15.zzB(r4)
            r1 = r17
            r2 = r30
            r3 = r5
            r22 = r4
            r4 = r32
            r5 = r8
            r8 = r6
            r6 = r33
            int r0 = com.google.android.gms.internal.play_billing.zzao.zze(r0, r1, r2, r3, r4, r5, r6)
            r13 = r32
            r6 = r8
            r1 = r19
            r2 = r22
            goto L_0x032d
        L_0x025e:
            r22 = r4
            r15 = r5
            r25 = r6
            r26 = r7
            r27 = r10
            r18 = -1
            goto L_0x02e9
        L_0x026b:
            r22 = r4
            r0 = 49
            if (r13 > r0) goto L_0x02bb
            r1 = r20
            long r1 = (long) r1
            r0 = r28
            r20 = r1
            r1 = r29
            r2 = r30
            r4 = r3
            r3 = r5
            r31 = r4
            r4 = r32
            r15 = r5
            r5 = r17
            r25 = r6
            r6 = r19
            r26 = r7
            r7 = r31
            r23 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r22
            r27 = r10
            r18 = -1
            r9 = r20
            r11 = r13
            r12 = r23
            r14 = r33
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02b9
        L_0x02a5:
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r1 = r19
            r2 = r22
            r6 = r25
            r7 = r26
            goto L_0x032b
        L_0x02b9:
            r2 = r0
            goto L_0x02ea
        L_0x02bb:
            r31 = r3
            r15 = r5
            r25 = r6
            r26 = r7
            r23 = r8
            r27 = r10
            r1 = r20
            r18 = -1
            r0 = 50
            if (r13 != r0) goto L_0x02ef
            r7 = r31
            r0 = 2
            if (r7 != r0) goto L_0x02e9
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r22
            r6 = r23
            r8 = r33
            int r0 = r0.zzq(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02b9
            goto L_0x02a5
        L_0x02e9:
            r2 = r15
        L_0x02ea:
            r6 = r25
            r7 = r26
            goto L_0x030d
        L_0x02ef:
            r7 = r31
            r0 = r28
            r8 = r1
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r17
            r6 = r19
            r9 = r13
            r10 = r23
            r12 = r22
            r13 = r33
            int r0 = r0.zzr(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02b9
            goto L_0x02a5
        L_0x030d:
            com.google.android.gms.internal.play_billing.zzeh r4 = zzd(r29)
            r0 = r17
            r1 = r30
            r3 = r32
            r5 = r33
            int r0 = com.google.android.gms.internal.play_billing.zzao.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r1 = r19
            r2 = r22
        L_0x032b:
            r10 = r27
        L_0x032d:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = -1
            goto L_0x0024
        L_0x0333:
            r25 = r6
            r27 = r10
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0346
            long r1 = (long) r7
            r3 = r29
            r6 = r25
            r4 = r27
            r4.putInt(r3, r1, r6)
        L_0x0346:
            r4 = r32
            if (r0 != r4) goto L_0x034b
            return
        L_0x034b:
            com.google.android.gms.internal.play_billing.zzci r0 = com.google.android.gms.internal.play_billing.zzci.zze()
            throw r0
        L_0x0350:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r6 = r33
            r0.zzc(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.play_billing.zzan):void");
    }

    public final void zzi(Object obj, zzey zzey) {
        int i10;
        Object obj2 = obj;
        zzey zzey2 = zzey;
        zzew zzew = zzew.DOUBLE;
        int i11 = 1048575;
        if (this.zzo - 1 != 0) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i12 = 0; i12 < length; i12 += 3) {
                    int zzy = zzy(i12);
                    int i13 = this.zzc[i12];
                    switch (zzx(zzy)) {
                        case 0:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzf(i13, zzeq.zza(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 1:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzo(i13, zzeq.zzb(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 2:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzt(i13, zzeq.zzd(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 3:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzJ(i13, zzeq.zzd(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 4:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzr(i13, zzeq.zzc(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 5:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzm(i13, zzeq.zzd(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 6:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzk(i13, zzeq.zzc(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 7:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzb(i13, zzeq.zzw(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 8:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzV(i13, zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2);
                                break;
                            }
                        case 9:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzv(i13, zzeq.zzf(obj2, (long) (zzy & 1048575)), zzB(i12));
                                break;
                            }
                        case 10:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzd(i13, (zzba) zzeq.zzf(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 11:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzH(i13, zzeq.zzc(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 12:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzi(i13, zzeq.zzc(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 13:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzw(i13, zzeq.zzc(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 14:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzy(i13, zzeq.zzd(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 15:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzA(i13, zzeq.zzc(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 16:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzC(i13, zzeq.zzd(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 17:
                            if (!zzP(obj2, i12)) {
                                break;
                            } else {
                                zzey2.zzq(i13, zzeq.zzf(obj2, (long) (zzy & 1048575)), zzB(i12));
                                break;
                            }
                        case 18:
                            zzdr.zzF(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 19:
                            zzdr.zzJ(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 20:
                            zzdr.zzM(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 21:
                            zzdr.zzU(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 22:
                            zzdr.zzL(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 23:
                            zzdr.zzI(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 24:
                            zzdr.zzH(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 25:
                            zzdr.zzD(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 26:
                            zzdr.zzS(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2);
                            break;
                        case 27:
                            zzdr.zzN(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, zzB(i12));
                            break;
                        case 28:
                            zzdr.zzE(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2);
                            break;
                        case 29:
                            zzdr.zzT(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 30:
                            zzdr.zzG(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 31:
                            zzdr.zzO(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 32:
                            zzdr.zzP(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 33:
                            zzdr.zzQ(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 34:
                            zzdr.zzR(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, false);
                            break;
                        case 35:
                            zzdr.zzF(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 36:
                            zzdr.zzJ(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 37:
                            zzdr.zzM(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 38:
                            zzdr.zzU(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 39:
                            zzdr.zzL(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 40:
                            zzdr.zzI(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 41:
                            zzdr.zzH(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 42:
                            zzdr.zzD(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 43:
                            zzdr.zzT(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 44:
                            zzdr.zzG(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 45:
                            zzdr.zzO(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 46:
                            zzdr.zzP(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 47:
                            zzdr.zzQ(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 48:
                            zzdr.zzR(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, true);
                            break;
                        case 49:
                            zzdr.zzK(i13, (List) zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2, zzB(i12));
                            break;
                        case 50:
                            zzN(zzey2, i13, zzeq.zzf(obj2, (long) (zzy & 1048575)), i12);
                            break;
                        case 51:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzf(i13, zzm(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 52:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzo(i13, zzn(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 53:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzt(i13, zzz(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 54:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzJ(i13, zzz(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 55:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzr(i13, zzp(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 56:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzm(i13, zzz(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 57:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzk(i13, zzp(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 58:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzb(i13, zzU(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 59:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzV(i13, zzeq.zzf(obj2, (long) (zzy & 1048575)), zzey2);
                                break;
                            }
                        case 60:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzv(i13, zzeq.zzf(obj2, (long) (zzy & 1048575)), zzB(i12));
                                break;
                            }
                        case 61:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzd(i13, (zzba) zzeq.zzf(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 62:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzH(i13, zzp(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 63:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzi(i13, zzp(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 64:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzw(i13, zzp(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 65:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzy(i13, zzz(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 66:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzA(i13, zzp(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 67:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzC(i13, zzz(obj2, (long) (zzy & 1048575)));
                                break;
                            }
                        case 68:
                            if (!zzT(obj2, i13, i12)) {
                                break;
                            } else {
                                zzey2.zzq(i13, zzeq.zzf(obj2, (long) (zzy & 1048575)), zzB(i12));
                                break;
                            }
                    }
                }
                zzeg zzeg = this.zzm;
                zzeg.zzi(zzeg.zzd(obj2), zzey2);
                return;
            }
            this.zzn.zza(obj2);
            throw null;
        } else if (!this.zzh) {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i14 = 0;
            int i15 = 1048575;
            int i16 = 0;
            while (i14 < length2) {
                int zzy2 = zzy(i14);
                int[] iArr = this.zzc;
                int i17 = iArr[i14];
                int zzx = zzx(zzy2);
                if (zzx <= 17) {
                    int i18 = iArr[i14 + 2];
                    int i19 = i18 & i11;
                    if (i19 != i15) {
                        i16 = unsafe.getInt(obj2, (long) i19);
                        i15 = i19;
                    }
                    i10 = 1 << (i18 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = (long) (zzy2 & i11);
                switch (zzx) {
                    case 0:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            zzey2.zzf(i17, zzeq.zza(obj2, j10));
                            continue;
                        }
                    case 1:
                        if ((i16 & i10) != 0) {
                            zzey2.zzo(i17, zzeq.zzb(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i16 & i10) != 0) {
                            zzey2.zzt(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i16 & i10) != 0) {
                            zzey2.zzJ(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i16 & i10) != 0) {
                            zzey2.zzr(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i16 & i10) != 0) {
                            zzey2.zzm(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i16 & i10) != 0) {
                            zzey2.zzk(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i16 & i10) != 0) {
                            zzey2.zzb(i17, zzeq.zzw(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i16 & i10) != 0) {
                            zzV(i17, unsafe.getObject(obj2, j10), zzey2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i16 & i10) != 0) {
                            zzey2.zzv(i17, unsafe.getObject(obj2, j10), zzB(i14));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i16 & i10) != 0) {
                            zzey2.zzd(i17, (zzba) unsafe.getObject(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i16 & i10) != 0) {
                            zzey2.zzH(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i16 & i10) != 0) {
                            zzey2.zzi(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i16 & i10) != 0) {
                            zzey2.zzw(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i16 & i10) != 0) {
                            zzey2.zzy(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i16 & i10) != 0) {
                            zzey2.zzA(i17, unsafe.getInt(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i16 & i10) != 0) {
                            zzey2.zzC(i17, unsafe.getLong(obj2, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i16 & i10) != 0) {
                            zzey2.zzq(i17, unsafe.getObject(obj2, j10), zzB(i14));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzdr.zzF(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        continue;
                    case 19:
                        zzdr.zzJ(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        continue;
                    case 20:
                        zzdr.zzM(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        continue;
                    case 21:
                        zzdr.zzU(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        continue;
                    case 22:
                        zzdr.zzL(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        continue;
                    case 23:
                        zzdr.zzI(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        continue;
                    case 24:
                        zzdr.zzH(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        continue;
                    case 25:
                        zzdr.zzD(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        continue;
                    case 26:
                        zzdr.zzS(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2);
                        break;
                    case 27:
                        zzdr.zzN(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, zzB(i14));
                        break;
                    case 28:
                        zzdr.zzE(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2);
                        break;
                    case 29:
                        zzdr.zzT(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        break;
                    case 30:
                        zzdr.zzG(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        break;
                    case 31:
                        zzdr.zzO(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        break;
                    case 32:
                        zzdr.zzP(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        break;
                    case 33:
                        zzdr.zzQ(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        break;
                    case 34:
                        zzdr.zzR(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, false);
                        break;
                    case 35:
                        zzdr.zzF(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 36:
                        zzdr.zzJ(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 37:
                        zzdr.zzM(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 38:
                        zzdr.zzU(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 39:
                        zzdr.zzL(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 40:
                        zzdr.zzI(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 41:
                        zzdr.zzH(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 42:
                        zzdr.zzD(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 43:
                        zzdr.zzT(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 44:
                        zzdr.zzG(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 45:
                        zzdr.zzO(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 46:
                        zzdr.zzP(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 47:
                        zzdr.zzQ(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 48:
                        zzdr.zzR(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, true);
                        break;
                    case 49:
                        zzdr.zzK(this.zzc[i14], (List) unsafe.getObject(obj2, j10), zzey2, zzB(i14));
                        break;
                    case 50:
                        zzN(zzey2, i17, unsafe.getObject(obj2, j10), i14);
                        break;
                    case 51:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzf(i17, zzm(obj2, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzo(i17, zzn(obj2, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzt(i17, zzz(obj2, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzJ(i17, zzz(obj2, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzr(i17, zzp(obj2, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzm(i17, zzz(obj2, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzk(i17, zzp(obj2, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzb(i17, zzU(obj2, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(obj2, i17, i14)) {
                            zzV(i17, unsafe.getObject(obj2, j10), zzey2);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzv(i17, unsafe.getObject(obj2, j10), zzB(i14));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzd(i17, (zzba) unsafe.getObject(obj2, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzH(i17, zzp(obj2, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzi(i17, zzp(obj2, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzw(i17, zzp(obj2, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzy(i17, zzz(obj2, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzA(i17, zzp(obj2, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzC(i17, zzz(obj2, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(obj2, i17, i14)) {
                            zzey2.zzq(i17, unsafe.getObject(obj2, j10), zzB(i14));
                            break;
                        }
                        break;
                }
                i14 += 3;
                i11 = 1048575;
            }
            zzeg zzeg2 = this.zzm;
            zzeg2.zzi(zzeg2.zzd(obj2), zzey2);
        } else {
            this.zzn.zza(obj2);
            throw null;
        }
    }

    public final boolean zzj(Object obj, Object obj2) {
        boolean z10;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzy = zzy(i10);
            long j10 = (long) (zzy & 1048575);
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i10) && Double.doubleToLongBits(zzeq.zza(obj, j10)) == Double.doubleToLongBits(zzeq.zza(obj2, j10))) {
                        continue;
                    }
                case 1:
                    if (zzO(obj, obj2, i10) && Float.floatToIntBits(zzeq.zzb(obj, j10)) == Float.floatToIntBits(zzeq.zzb(obj2, j10))) {
                        continue;
                    }
                case 2:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                case 3:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                case 4:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                case 5:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                case 6:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                case 7:
                    if (zzO(obj, obj2, i10) && zzeq.zzw(obj, j10) == zzeq.zzw(obj2, j10)) {
                        continue;
                    }
                case 8:
                    if (zzO(obj, obj2, i10) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        continue;
                    }
                case 9:
                    if (zzO(obj, obj2, i10) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        continue;
                    }
                case 10:
                    if (zzO(obj, obj2, i10) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        continue;
                    }
                case 11:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                case 12:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                case 13:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                case 14:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                case 15:
                    if (zzO(obj, obj2, i10) && zzeq.zzc(obj, j10) == zzeq.zzc(obj2, j10)) {
                        continue;
                    }
                case 16:
                    if (zzO(obj, obj2, i10) && zzeq.zzd(obj, j10) == zzeq.zzd(obj2, j10)) {
                        continue;
                    }
                case 17:
                    if (zzO(obj, obj2, i10) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z10 = zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10));
                    break;
                case 50:
                    z10 = zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzv = (long) (zzv(i10) & 1048575);
                    if (zzeq.zzc(obj, zzv) == zzeq.zzc(obj2, zzv) && zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        continue;
                    }
            }
            if (!z10) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        this.zzn.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        Object obj2 = obj;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzj) {
            int i15 = this.zzi[i14];
            int i16 = this.zzc[i15];
            int zzy = zzy(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj2, (long) i18);
                }
                i10 = i13;
                i11 = i18;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i15, i11, i10, i19)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj2, i16, i15) && !zzR(obj2, zzy, zzB(i15))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzcz) zzeq.zzf(obj2, (long) (zzy & 1048575))).isEmpty()) {
                            zzcy zzcy = (zzcy) zzC(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzeq.zzf(obj2, (long) (zzy & 1048575));
                if (!list.isEmpty()) {
                    zzdp zzB = zzB(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzB.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzQ(obj, i15, i11, i10, i19) && !zzR(obj2, zzy, zzB(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj2);
        throw null;
    }
}
