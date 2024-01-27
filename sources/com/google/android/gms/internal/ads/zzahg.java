package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzahg {
    private static final byte[] zza = "OpusHead".getBytes(zzfsi.zzc);

    static {
        int i10 = zzfk.zza;
    }

    public static zzby zza(zzagw zzagw) {
        zzfo zzfo;
        zzagx zzb = zzagw.zzb(1751411826);
        zzagx zzb2 = zzagw.zzb(1801812339);
        zzagx zzb3 = zzagw.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzh(zzb.zza) != 1835299937) {
            return null;
        }
        zzfb zzfb = zzb2.zza;
        zzfb.zzG(12);
        int zzf = zzfb.zzf();
        String[] strArr = new String[zzf];
        for (int i10 = 0; i10 < zzf; i10++) {
            int zzf2 = zzfb.zzf();
            zzfb.zzH(4);
            strArr[i10] = zzfb.zzy(zzf2 - 8, zzfsi.zzc);
        }
        zzfb zzfb2 = zzb3.zza;
        zzfb2.zzG(8);
        ArrayList arrayList = new ArrayList();
        while (zzfb2.zza() > 8) {
            int zzc = zzfb2.zzc() + zzfb2.zzf();
            int zzf3 = zzfb2.zzf() - 1;
            if (zzf3 < 0 || zzf3 >= zzf) {
                zzer.zzf("AtomParsers", "Skipped metadata with unknown key index: " + zzf3);
            } else {
                String str = strArr[zzf3];
                int i11 = zzahn.zzb;
                while (true) {
                    int zzc2 = zzfb2.zzc();
                    if (zzc2 >= zzc) {
                        zzfo = null;
                        break;
                    }
                    int zzf4 = zzfb2.zzf();
                    if (zzfb2.zzf() == 1684108385) {
                        int zzf5 = zzfb2.zzf();
                        int zzf6 = zzfb2.zzf();
                        int i12 = zzf4 - 16;
                        byte[] bArr = new byte[i12];
                        zzfb2.zzC(bArr, 0, i12);
                        zzfo = new zzfo(str, bArr, zzf6, zzf5);
                        break;
                    }
                    zzfb2.zzG(zzc2 + zzf4);
                }
                if (zzfo != null) {
                    arrayList.add(zzfo);
                }
            }
            zzfb2.zzG(zzc);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby((List) arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r7 != 13) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzby zzb(com.google.android.gms.internal.ads.zzagx r12) {
        /*
            com.google.android.gms.internal.ads.zzfb r12 = r12.zza
            r0 = 8
            r12.zzG(r0)
            com.google.android.gms.internal.ads.zzby r1 = new com.google.android.gms.internal.ads.zzby
            r2 = 0
            com.google.android.gms.internal.ads.zzbx[] r3 = new com.google.android.gms.internal.ads.zzbx[r2]
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r3)
        L_0x0014:
            int r3 = r12.zza()
            if (r3 < r0) goto L_0x00f1
            int r3 = r12.zzc()
            int r6 = r12.zzf()
            int r6 = r6 + r3
            int r7 = r12.zzf()
            r8 = 1835365473(0x6d657461, float:4.4382975E27)
            r9 = 0
            if (r7 != r8) goto L_0x0080
            r12.zzG(r3)
            r12.zzH(r0)
            zze(r12)
        L_0x0036:
            int r3 = r12.zzc()
            if (r3 >= r6) goto L_0x007a
            int r3 = r12.zzc()
            int r7 = r12.zzf()
            int r7 = r7 + r3
            int r8 = r12.zzf()
            r10 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r10) goto L_0x0076
            r12.zzG(r3)
            r12.zzH(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0059:
            int r8 = r12.zzc()
            if (r8 >= r7) goto L_0x0069
            com.google.android.gms.internal.ads.zzbx r8 = com.google.android.gms.internal.ads.zzahn.zza(r12)
            if (r8 == 0) goto L_0x0059
            r3.add(r8)
            goto L_0x0059
        L_0x0069:
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x0070
            goto L_0x007a
        L_0x0070:
            com.google.android.gms.internal.ads.zzby r9 = new com.google.android.gms.internal.ads.zzby
            r9.<init>((java.util.List) r3)
            goto L_0x007a
        L_0x0076:
            r12.zzG(r7)
            goto L_0x0036
        L_0x007a:
            com.google.android.gms.internal.ads.zzby r1 = r1.zzd(r9)
            goto L_0x00ec
        L_0x0080:
            r8 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r7 != r8) goto L_0x00df
            r12.zzG(r3)
            r3 = 12
            r12.zzH(r3)
        L_0x008d:
            int r7 = r12.zzc()
            if (r7 >= r6) goto L_0x00da
            int r7 = r12.zzc()
            int r8 = r12.zzf()
            int r10 = r12.zzf()
            r11 = 1935766900(0x73617574, float:1.7862687E31)
            if (r10 != r11) goto L_0x00d5
            r7 = 14
            if (r8 >= r7) goto L_0x00a9
            goto L_0x00da
        L_0x00a9:
            r7 = 5
            r12.zzH(r7)
            int r7 = r12.zzl()
            r8 = 1123024896(0x42f00000, float:120.0)
            if (r7 == r3) goto L_0x00ba
            r3 = 13
            if (r7 == r3) goto L_0x00be
            goto L_0x00da
        L_0x00ba:
            if (r7 != r3) goto L_0x00be
            r8 = 1131413504(0x43700000, float:240.0)
        L_0x00be:
            r3 = 1
            r12.zzH(r3)
            int r7 = r12.zzl()
            com.google.android.gms.internal.ads.zzby r9 = new com.google.android.gms.internal.ads.zzby
            com.google.android.gms.internal.ads.zzbx[] r3 = new com.google.android.gms.internal.ads.zzbx[r3]
            com.google.android.gms.internal.ads.zzafx r10 = new com.google.android.gms.internal.ads.zzafx
            r10.<init>((float) r8, (int) r7)
            r3[r2] = r10
            r9.<init>(r4, r3)
            goto L_0x00da
        L_0x00d5:
            int r7 = r7 + r8
            r12.zzG(r7)
            goto L_0x008d
        L_0x00da:
            com.google.android.gms.internal.ads.zzby r1 = r1.zzd(r9)
            goto L_0x00ec
        L_0x00df:
            r3 = -1451722374(0xffffffffa978797a, float:-5.5172426E-14)
            if (r7 != r3) goto L_0x00ec
            com.google.android.gms.internal.ads.zzby r3 = zzl(r12)
            com.google.android.gms.internal.ads.zzby r1 = r1.zzd(r3)
        L_0x00ec:
            r12.zzG(r6)
            goto L_0x0014
        L_0x00f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahg.zzb(com.google.android.gms.internal.ads.zzagx):com.google.android.gms.internal.ads.zzby");
    }

    public static zzfu zzc(zzfb zzfb) {
        long j10;
        long j11;
        zzfb.zzG(8);
        if (zzagy.zze(zzfb.zzf()) == 0) {
            j11 = zzfb.zzt();
            j10 = zzfb.zzt();
        } else {
            j11 = zzfb.zzs();
            j10 = zzfb.zzs();
        }
        return new zzfu(j11, j10, zzfb.zzt());
    }

    /* JADX WARNING: Removed duplicated region for block: B:341:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x075f  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0832  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x08d8  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0a83  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0b65 A[LOOP:12: B:489:0x0b65->B:493:0x0b6f, LOOP_START, PHI: r21 
      PHI: (r21v8 int) = (r21v7 int), (r21v9 int) binds: [B:488:0x0b63, B:493:0x0b6f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0b78  */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0bcb  */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0c18  */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0c1b  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0c3e  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0c56  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:610:0x0eb5  */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x0ec2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:648:0x0b5a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List zzd(com.google.android.gms.internal.ads.zzagw r58, com.google.android.gms.internal.ads.zzacc r59, long r60, com.google.android.gms.internal.ads.zzad r62, boolean r63, boolean r64, com.google.android.gms.internal.ads.zzfsk r65) {
        /*
            r0 = r58
            r1 = r59
            r12 = r62
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r15 = 0
        L_0x000c:
            java.util.List r2 = r0.zzc
            int r2 = r2.size()
            if (r15 >= r2) goto L_0x0eca
            java.util.List r2 = r0.zzc
            java.lang.Object r2 = r2.get(r15)
            r11 = r2
            com.google.android.gms.internal.ads.zzagw r11 = (com.google.android.gms.internal.ads.zzagw) r11
            int r2 = r11.zzd
            r3 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r3) goto L_0x0029
            r1 = r13
            r31 = r15
            goto L_0x0eb7
        L_0x0029:
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.gms.internal.ads.zzagx r2 = r0.zzb(r2)
            java.util.Objects.requireNonNull(r2)
            r10 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzagw r3 = r11.zza(r10)
            java.util.Objects.requireNonNull(r3)
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.zzagx r4 = r3.zzb(r4)
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.zzfb r4 = r4.zza
            int r4 = zzh(r4)
            int r9 = zzf(r4)
            java.lang.String r6 = "AtomParsers"
            r31 = r15
            r14 = 0
            r8 = -1
            if (r9 != r8) goto L_0x0064
            r1 = r65
            r3 = r6
            r2 = r11
            r34 = r13
            r0 = -1
        L_0x0061:
            r5 = 0
            goto L_0x08cf
        L_0x0064:
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.android.gms.internal.ads.zzagx r4 = r11.zzb(r4)
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.zzfb r4 = r4.zza
            r5 = 8
            r4.zzG(r5)
            int r21 = r4.zzf()
            int r21 = com.google.android.gms.internal.ads.zzagy.zze(r21)
            if (r21 != 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r5 = 16
        L_0x0082:
            r4.zzH(r5)
            int r5 = r4.zzf()
            r10 = 4
            r4.zzH(r10)
            int r25 = r4.zzc()
            r10 = 0
        L_0x0092:
            if (r21 != 0) goto L_0x0096
            r7 = 4
            goto L_0x0098
        L_0x0096:
            r7 = 8
        L_0x0098:
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r10 >= r7) goto L_0x00c0
            byte[] r7 = r4.zzI()
            int r30 = r25 + r10
            byte r7 = r7[r30]
            if (r7 == r8) goto L_0x00bd
            if (r21 != 0) goto L_0x00b0
            long r32 = r4.zzt()
            goto L_0x00b4
        L_0x00b0:
            long r32 = r4.zzu()
        L_0x00b4:
            int r7 = (r32 > r14 ? 1 : (r32 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x00b9
            goto L_0x00c3
        L_0x00b9:
            r10 = r9
            r8 = r32
            goto L_0x00c6
        L_0x00bd:
            int r10 = r10 + 1
            goto L_0x0092
        L_0x00c0:
            r4.zzH(r7)
        L_0x00c3:
            r10 = r9
            r8 = r28
        L_0x00c6:
            r7 = 16
            r4.zzH(r7)
            int r23 = r4.zzf()
            int r7 = r4.zzf()
            r14 = 4
            r4.zzH(r14)
            int r14 = r4.zzf()
            int r4 = r4.zzf()
            r15 = 65536(0x10000, float:9.18355E-41)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            if (r23 != 0) goto L_0x00f7
            if (r7 != r15) goto L_0x00f5
            if (r14 != r0) goto L_0x00f3
            if (r4 != 0) goto L_0x00ee
            r0 = 90
            goto L_0x011b
        L_0x00ee:
            r7 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x00f5
        L_0x00f3:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00f5:
            r23 = 0
        L_0x00f7:
            if (r23 != 0) goto L_0x010b
            if (r7 != r0) goto L_0x0107
            if (r14 != r15) goto L_0x0102
            if (r4 != 0) goto L_0x0103
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x011b
        L_0x0102:
            r15 = r14
        L_0x0103:
            r7 = 0
            r14 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x010f
        L_0x0107:
            r15 = r14
            r14 = r7
            r7 = 0
            goto L_0x010f
        L_0x010b:
            r15 = r14
            r14 = r7
            r7 = r23
        L_0x010f:
            if (r7 != r0) goto L_0x011a
            if (r14 != 0) goto L_0x011a
            if (r15 != 0) goto L_0x011a
            if (r4 != r0) goto L_0x011a
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x011b
        L_0x011a:
            r0 = 0
        L_0x011b:
            com.google.android.gms.internal.ads.zzahf r14 = new com.google.android.gms.internal.ads.zzahf
            r14.<init>(r5, r8, r0)
            int r0 = (r60 > r28 ? 1 : (r60 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x012b
            long r4 = r14.zzb
            r34 = r4
            goto L_0x012d
        L_0x012b:
            r34 = r60
        L_0x012d:
            com.google.android.gms.internal.ads.zzfb r0 = r2.zza
            com.google.android.gms.internal.ads.zzfu r0 = zzc(r0)
            long r8 = r0.zzc
            int r0 = (r34 > r28 ? 1 : (r34 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x013a
            goto L_0x0145
        L_0x013a:
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r38 = r8
            long r4 = com.google.android.gms.internal.ads.zzfk.zzr(r34, r36, r38)
            r28 = r4
        L_0x0145:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzagw r2 = r3.zza(r0)
            java.util.Objects.requireNonNull(r2)
            r15 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzagw r2 = r2.zza(r15)
            java.util.Objects.requireNonNull(r2)
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.android.gms.internal.ads.zzagx r3 = r3.zzb(r4)
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzfb r3 = r3.zza
            android.util.Pair r7 = zzj(r3)
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.android.gms.internal.ads.zzagx r2 = r2.zzb(r3)
            if (r2 == 0) goto L_0x0ec2
            int r5 = r14.zza
            int r4 = r14.zzc
            java.lang.Object r3 = r7.second
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.ads.zzfb r2 = r2.zza
            r0 = 12
            r2.zzG(r0)
            int r0 = r2.zzf()
            com.google.android.gms.internal.ads.zzahc r15 = new com.google.android.gms.internal.ads.zzahc
            r15.<init>(r0)
            r34 = r13
            r13 = 0
        L_0x0191:
            if (r13 >= r0) goto L_0x086f
            r23 = r0
            int r0 = r2.zzc()
            int r1 = r2.zzf()
            if (r1 <= 0) goto L_0x01a5
            r25 = r4
            r26 = r6
            r4 = 1
            goto L_0x01aa
        L_0x01a5:
            r25 = r4
            r26 = r6
            r4 = 0
        L_0x01aa:
            java.lang.String r6 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzabq.zzb(r4, r6)
            int r4 = r2.zzf()
            r6 = 1635148593(0x61766331, float:2.840654E20)
            r30 = r7
            r7 = 1701733238(0x656e6376, float:7.035987E22)
            if (r4 == r6) goto L_0x03bf
            r6 = 1635148595(0x61766333, float:2.8406544E20)
            if (r4 == r6) goto L_0x03bf
            if (r4 == r7) goto L_0x03bf
            r6 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 == r6) goto L_0x03bf
            r6 = 1836070006(0x6d703476, float:4.646239E27)
            if (r4 == r6) goto L_0x03bf
            r6 = 1752589105(0x68766331, float:4.6541277E24)
            if (r4 == r6) goto L_0x03bf
            r6 = 1751479857(0x68657631, float:4.3344087E24)
            if (r4 == r6) goto L_0x03bf
            r6 = 1932670515(0x73323633, float:1.4119387E31)
            if (r4 == r6) goto L_0x03bf
            r6 = 1211250227(0x48323633, float:182488.8)
            if (r4 == r6) goto L_0x03bf
            r6 = 1987063864(0x76703038, float:1.21789965E33)
            if (r4 == r6) goto L_0x03bf
            r6 = 1987063865(0x76703039, float:1.2178997E33)
            if (r4 == r6) goto L_0x03bf
            r6 = 1635135537(0x61763031, float:2.8383572E20)
            if (r4 == r6) goto L_0x03bf
            r6 = 1685479798(0x64766176, float:1.8179687E22)
            if (r4 == r6) goto L_0x03bf
            r6 = 1685479729(0x64766131, float:1.817961E22)
            if (r4 == r6) goto L_0x03bf
            r6 = 1685481573(0x64766865, float:1.8181686E22)
            if (r4 == r6) goto L_0x03bf
            r6 = 1685481521(0x64766831, float:1.8181627E22)
            if (r4 != r6) goto L_0x0207
            goto L_0x03bf
        L_0x0207:
            r6 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r4 == r6) goto L_0x0380
            r6 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r4 == r6) goto L_0x0380
            r6 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r4 == r6) goto L_0x0380
            r6 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r4 == r6) goto L_0x0380
            r6 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r4 == r6) goto L_0x0380
            r6 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r4 == r6) goto L_0x0380
            r6 = 1685353315(0x64747363, float:1.803728E22)
            if (r4 == r6) goto L_0x0380
            r6 = 1685353317(0x64747365, float:1.8037282E22)
            if (r4 == r6) goto L_0x0380
            r6 = 1685353320(0x64747368, float:1.8037286E22)
            if (r4 == r6) goto L_0x0380
            r6 = 1685353324(0x6474736c, float:1.803729E22)
            if (r4 == r6) goto L_0x0380
            r6 = 1685353336(0x64747378, float:1.8037304E22)
            if (r4 == r6) goto L_0x0380
            r6 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r4 == r6) goto L_0x0380
            r6 = 1935767394(0x73617762, float:1.7863284E31)
            if (r4 == r6) goto L_0x0380
            r6 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r4 == r6) goto L_0x0380
            r6 = 1936684916(0x736f7774, float:1.89725E31)
            if (r4 == r6) goto L_0x0380
            r6 = 1953984371(0x74776f73, float:7.841539E31)
            if (r4 == r6) goto L_0x0380
            r6 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r4 == r6) goto L_0x0380
            r6 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r4 == r6) goto L_0x0380
            r6 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r4 == r6) goto L_0x0380
            r6 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r4 == r6) goto L_0x0380
            r6 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r4 == r6) goto L_0x0380
            r6 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r4 == r6) goto L_0x0380
            r6 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r4 == r6) goto L_0x0380
            r6 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r4 == r6) goto L_0x0380
            r6 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r4 != r6) goto L_0x0286
            goto L_0x0380
        L_0x0286:
            r6 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r4 == r6) goto L_0x02f7
            r6 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 == r6) goto L_0x02f7
            r6 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 == r6) goto L_0x02f7
            r6 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 == r6) goto L_0x02f7
            r6 = 1664495672(0x63363038, float:3.360782E21)
            if (r4 != r6) goto L_0x02a0
            goto L_0x02f7
        L_0x02a0:
            r6 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r4 != r6) goto L_0x02c6
            int r4 = r0 + 16
            r2.zzG(r4)
            r4 = 0
            r2.zzw(r4)
            java.lang.String r6 = r2.zzw(r4)
            if (r6 == 0) goto L_0x02de
            com.google.android.gms.internal.ads.zzak r4 = new com.google.android.gms.internal.ads.zzak
            r4.<init>()
            r4.zzI(r5)
            r4.zzU(r6)
            com.google.android.gms.internal.ads.zzam r4 = r4.zzac()
            r15.zzb = r4
            goto L_0x02de
        L_0x02c6:
            r6 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r4 != r6) goto L_0x02de
            com.google.android.gms.internal.ads.zzak r4 = new com.google.android.gms.internal.ads.zzak
            r4.<init>()
            r4.zzI(r5)
            java.lang.String r6 = "application/x-camera-motion"
            r4.zzU(r6)
            com.google.android.gms.internal.ads.zzam r4 = r4.zzac()
            r15.zzb = r4
        L_0x02de:
            r35 = r0
            r37 = r1
            r38 = r3
            r21 = r8
            r18 = r10
            r42 = r11
            r24 = r13
            r19 = r14
            r4 = r25
            r3 = r26
            r40 = r30
            r0 = -1
            goto L_0x037b
        L_0x02f7:
            int r6 = r0 + 16
            r2.zzG(r6)
            r6 = 1414810956(0x54544d4c, float:3.64731957E12)
            r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 != r6) goto L_0x0310
            java.lang.String r4 = "application/ttml+xml"
        L_0x0308:
            r6 = 0
            r55 = r8
            r7 = r35
            r36 = r55
            goto L_0x034a
        L_0x0310:
            r6 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 != r6) goto L_0x032f
            int r4 = r1 + -16
            byte[] r6 = new byte[r4]
            r7 = 0
            r2.zzC(r6, r7, r4)
            com.google.android.gms.internal.ads.zzfvs r4 = com.google.android.gms.internal.ads.zzfvs.zzm(r6)
            java.lang.String r6 = "application/x-quicktime-tx3g"
            r55 = r6
            r6 = r4
            r4 = r55
            r56 = r8
            r7 = r35
            r36 = r56
            goto L_0x034a
        L_0x032f:
            r6 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 != r6) goto L_0x0337
            java.lang.String r4 = "application/x-mp4-vtt"
            goto L_0x0308
        L_0x0337:
            r6 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 != r6) goto L_0x0344
            java.lang.String r4 = "application/ttml+xml"
            r36 = r8
            r6 = 0
            r7 = 0
            goto L_0x034a
        L_0x0344:
            r7 = 1
            r15.zzd = r7
            java.lang.String r4 = "application/x-mp4-cea-608"
            goto L_0x0308
        L_0x034a:
            com.google.android.gms.internal.ads.zzak r9 = new com.google.android.gms.internal.ads.zzak
            r9.<init>()
            r9.zzI(r5)
            r9.zzU(r4)
            r9.zzM(r3)
            r9.zzY(r7)
            r9.zzK(r6)
            com.google.android.gms.internal.ads.zzam r4 = r9.zzac()
            r15.zzb = r4
            r35 = r0
            r38 = r3
            r18 = r10
            r42 = r11
            r24 = r13
            r19 = r14
            r4 = r25
            r3 = r26
            r40 = r30
            r21 = r36
            r0 = -1
            r37 = r1
        L_0x037b:
            r14 = r2
            r2 = r5
            r5 = r15
            goto L_0x0850
        L_0x0380:
            r36 = r8
            r9 = r2
            r2 = r9
            r38 = r3
            r3 = r4
            r7 = r25
            r8 = 2
            r4 = r0
            r16 = r5
            r6 = 0
            r5 = r1
            r19 = r14
            r39 = r26
            r14 = r6
            r6 = r16
            r41 = r7
            r40 = r30
            r14 = 16
            r7 = r38
            r21 = r36
            r8 = r64
            r18 = r10
            r10 = r9
            r9 = r62
            r14 = r10
            r10 = r15
            r42 = r11
            r11 = r13
            zzo(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r35 = r0
            r37 = r1
            r24 = r13
            r5 = r15
            r2 = r16
            r3 = r39
            r4 = r41
            r0 = -1
            goto L_0x0850
        L_0x03bf:
            r38 = r3
            r16 = r5
            r21 = r8
            r18 = r10
            r42 = r11
            r19 = r14
            r41 = r25
            r39 = r26
            r40 = r30
            r14 = r2
            int r2 = r0 + 16
            r14.zzG(r2)
            r2 = 16
            r14.zzH(r2)
            int r3 = r14.zzp()
            int r5 = r14.zzp()
            r6 = 50
            r14.zzH(r6)
            int r6 = r14.zzc()
            if (r4 != r7) goto L_0x041d
            android.util.Pair r4 = zzk(r14, r0, r1)
            if (r4 == 0) goto L_0x0415
            java.lang.Object r7 = r4.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r12 != 0) goto L_0x0401
            r8 = 0
            goto L_0x040b
        L_0x0401:
            java.lang.Object r8 = r4.second
            com.google.android.gms.internal.ads.zzahw r8 = (com.google.android.gms.internal.ads.zzahw) r8
            java.lang.String r8 = r8.zzb
            com.google.android.gms.internal.ads.zzad r8 = r12.zzb(r8)
        L_0x040b:
            com.google.android.gms.internal.ads.zzahw[] r9 = r15.zza
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.zzahw r4 = (com.google.android.gms.internal.ads.zzahw) r4
            r9[r13] = r4
            r4 = r7
            goto L_0x0419
        L_0x0415:
            r8 = r12
            r4 = 1701733238(0x656e6376, float:7.035987E22)
        L_0x0419:
            r14.zzG(r6)
            goto L_0x041e
        L_0x041d:
            r8 = r12
        L_0x041e:
            r7 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 != r7) goto L_0x042b
            java.lang.String r7 = "video/mpeg"
            r55 = r7
            r7 = r4
            r4 = r55
            goto L_0x0435
        L_0x042b:
            r7 = 1211250227(0x48323633, float:182488.8)
            if (r4 != r7) goto L_0x0433
            java.lang.String r4 = "video/3gpp"
            goto L_0x0435
        L_0x0433:
            r7 = r4
            r4 = 0
        L_0x0435:
            r9 = 1065353216(0x3f800000, float:1.0)
            r12 = r6
            r25 = r8
            r24 = r13
            r2 = 0
            r8 = -1
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r13 = -1
            r17 = 0
            r20 = 0
            r26 = 0
            r30 = -1
            r43 = -1
            r6 = r4
            r4 = 0
        L_0x044e:
            int r9 = r12 - r0
            if (r9 >= r1) goto L_0x07b4
            r14.zzG(r12)
            int r9 = r14.zzc()
            int r35 = r14.zzf()
            if (r35 != 0) goto L_0x0471
            int r35 = r14.zzc()
            r36 = r2
            int r2 = r35 - r0
            if (r2 != r1) goto L_0x046f
            r35 = r0
            r37 = r1
            goto L_0x07ba
        L_0x046f:
            r2 = 0
            goto L_0x0475
        L_0x0471:
            r36 = r2
            r2 = r35
        L_0x0475:
            if (r2 <= 0) goto L_0x047d
            r35 = r0
            r37 = r1
            r0 = 1
            goto L_0x0482
        L_0x047d:
            r35 = r0
            r37 = r1
            r0 = 0
        L_0x0482:
            java.lang.String r1 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzabq.zzb(r0, r1)
            int r0 = r14.zzf()
            r1 = 1635148611(0x61766343, float:2.8406573E20)
            r44 = r10
            if (r0 != r1) goto L_0x04d5
            int r9 = r9 + 8
            if (r6 != 0) goto L_0x0498
            r0 = 1
            goto L_0x0499
        L_0x0498:
            r0 = 0
        L_0x0499:
            r1 = 0
            com.google.android.gms.internal.ads.zzabq.zzb(r0, r1)
            r14.zzG(r9)
            com.google.android.gms.internal.ads.zzaar r0 = com.google.android.gms.internal.ads.zzaar.zza(r14)
            java.util.List r1 = r0.zza
            int r6 = r0.zzb
            r15.zzc = r6
            if (r4 != 0) goto L_0x04b0
            float r10 = r0.zzh
            r4 = 0
            goto L_0x04b3
        L_0x04b0:
            r10 = r44
            r4 = 1
        L_0x04b3:
            java.lang.String r6 = r0.zzi
            int r8 = r0.zze
            int r9 = r0.zzf
            int r0 = r0.zzg
            java.lang.String r11 = "video/avc"
        L_0x04bd:
            r26 = r1
            r49 = r3
            r48 = r5
            r46 = r7
            r13 = r8
            r43 = r9
            r47 = r15
            r3 = r39
            r8 = r0
            r0 = -1
            r55 = r11
            r11 = r6
            r6 = r55
            goto L_0x07a1
        L_0x04d5:
            r1 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 != r1) goto L_0x0506
            int r9 = r9 + 8
            if (r6 != 0) goto L_0x04e0
            r0 = 1
            goto L_0x04e1
        L_0x04e0:
            r0 = 0
        L_0x04e1:
            r1 = 0
            com.google.android.gms.internal.ads.zzabq.zzb(r0, r1)
            r14.zzG(r9)
            com.google.android.gms.internal.ads.zzacd r0 = com.google.android.gms.internal.ads.zzacd.zza(r14)
            java.util.List r1 = r0.zza
            int r6 = r0.zzb
            r15.zzc = r6
            if (r4 != 0) goto L_0x04f8
            float r10 = r0.zzf
            r4 = 0
            goto L_0x04fb
        L_0x04f8:
            r10 = r44
            r4 = 1
        L_0x04fb:
            java.lang.String r6 = r0.zzg
            int r8 = r0.zzc
            int r9 = r0.zzd
            int r0 = r0.zze
            java.lang.String r11 = "video/hevc"
            goto L_0x04bd
        L_0x0506:
            r1 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 == r1) goto L_0x077b
            r1 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 != r1) goto L_0x0512
            goto L_0x077b
        L_0x0512:
            r1 = 1987076931(0x76706343, float:1.21891066E33)
            if (r0 != r1) goto L_0x055a
            if (r6 != 0) goto L_0x051b
            r0 = 1
            goto L_0x051c
        L_0x051b:
            r0 = 0
        L_0x051c:
            r1 = 0
            com.google.android.gms.internal.ads.zzabq.zzb(r0, r1)
            int r9 = r9 + 12
            r14.zzG(r9)
            r1 = 2
            r14.zzH(r1)
            int r0 = r14.zzl()
            r6 = 1
            r0 = r0 & r6
            int r8 = r14.zzl()
            int r9 = r14.zzl()
            int r8 = com.google.android.gms.internal.ads.zzs.zza(r8)
            if (r6 == r0) goto L_0x053f
            r0 = 2
            goto L_0x0540
        L_0x053f:
            r0 = 1
        L_0x0540:
            int r9 = com.google.android.gms.internal.ads.zzs.zzb(r9)
            r10 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 != r10) goto L_0x054c
            java.lang.String r10 = "video/x-vnd.on2.vp8"
            goto L_0x054e
        L_0x054c:
            java.lang.String r10 = "video/x-vnd.on2.vp9"
        L_0x054e:
            r43 = r0
            r49 = r3
            r48 = r5
            r46 = r7
            r13 = r8
            r8 = r9
            r6 = r10
            goto L_0x0595
        L_0x055a:
            r1 = 1
            r10 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 != r10) goto L_0x056d
            if (r6 != 0) goto L_0x0564
            r0 = 1
            goto L_0x0565
        L_0x0564:
            r0 = 0
        L_0x0565:
            r6 = 0
            com.google.android.gms.internal.ads.zzabq.zzb(r0, r6)
            java.lang.String r0 = "video/av01"
            r6 = r0
            goto L_0x058f
        L_0x056d:
            r10 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r0 != r10) goto L_0x059e
            if (r17 != 0) goto L_0x0578
            java.nio.ByteBuffer r17 = zzn()
        L_0x0578:
            r0 = r17
            r9 = 21
            r0.position(r9)
            short r9 = r14.zzz()
            r0.putShort(r9)
            short r9 = r14.zzz()
            r0.putShort(r9)
            r17 = r0
        L_0x058f:
            r49 = r3
            r48 = r5
            r46 = r7
        L_0x0595:
            r47 = r15
            r3 = r39
            r10 = r44
        L_0x059b:
            r0 = -1
            goto L_0x07a1
        L_0x059e:
            r10 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r0 != r10) goto L_0x0618
            if (r17 != 0) goto L_0x05a9
            java.nio.ByteBuffer r17 = zzn()
        L_0x05a9:
            r0 = r17
            short r9 = r14.zzz()
            short r10 = r14.zzz()
            short r1 = r14.zzz()
            r45 = r4
            short r4 = r14.zzz()
            r46 = r7
            short r7 = r14.zzz()
            r47 = r15
            short r15 = r14.zzz()
            r48 = r5
            short r5 = r14.zzz()
            r49 = r3
            short r3 = r14.zzz()
            long r50 = r14.zzt()
            long r52 = r14.zzt()
            r54 = r11
            r11 = 1
            r0.position(r11)
            r0.putShort(r7)
            r0.putShort(r15)
            r0.putShort(r9)
            r0.putShort(r10)
            r0.putShort(r1)
            r0.putShort(r4)
            r0.putShort(r5)
            r0.putShort(r3)
            r3 = 10000(0x2710, double:4.9407E-320)
            long r3 = r50 / r3
            int r1 = (int) r3
            short r1 = (short) r1
            r0.putShort(r1)
            r3 = 10000(0x2710, double:4.9407E-320)
            long r3 = r52 / r3
            int r1 = (int) r3
            short r1 = (short) r1
            r0.putShort(r1)
            r17 = r0
        L_0x060f:
            r3 = r39
            r10 = r44
            r4 = r45
            r11 = r54
            goto L_0x059b
        L_0x0618:
            r49 = r3
            r45 = r4
            r48 = r5
            r46 = r7
            r54 = r11
            r47 = r15
            r1 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 != r1) goto L_0x0636
            if (r6 != 0) goto L_0x062d
            r0 = 1
            goto L_0x062e
        L_0x062d:
            r0 = 0
        L_0x062e:
            r1 = 0
            com.google.android.gms.internal.ads.zzabq.zzb(r0, r1)
            java.lang.String r0 = "video/3gpp"
            r6 = r0
            goto L_0x060f
        L_0x0636:
            r1 = 0
            r3 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r3) goto L_0x0660
            if (r6 != 0) goto L_0x0640
            r0 = 1
            goto L_0x0641
        L_0x0640:
            r0 = 0
        L_0x0641:
            com.google.android.gms.internal.ads.zzabq.zzb(r0, r1)
            com.google.android.gms.internal.ads.zzaha r0 = zzm(r14, r9)
            java.lang.String r1 = r0.zza
            byte[] r3 = r0.zzb
            if (r3 == 0) goto L_0x065c
            com.google.android.gms.internal.ads.zzfvs r3 = com.google.android.gms.internal.ads.zzfvs.zzm(r3)
            r20 = r0
            r6 = r1
            r26 = r3
            goto L_0x060f
        L_0x065c:
            r20 = r0
            r6 = r1
            goto L_0x060f
        L_0x0660:
            r1 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r1) goto L_0x067e
            int r9 = r9 + 8
            r14.zzG(r9)
            int r0 = r14.zzo()
            int r1 = r14.zzo()
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            r10 = r0
            r3 = r39
            r11 = r54
            r0 = -1
            r4 = 1
            goto L_0x07a1
        L_0x067e:
            r1 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r1) goto L_0x06b5
            int r0 = r9 + 8
        L_0x0685:
            int r1 = r0 - r9
            if (r1 >= r2) goto L_0x06a8
            r14.zzG(r0)
            int r1 = r14.zzf()
            int r1 = r1 + r0
            int r3 = r14.zzf()
            r4 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r3 != r4) goto L_0x06a6
            byte[] r3 = r14.zzI()
            byte[] r0 = java.util.Arrays.copyOfRange(r3, r0, r1)
            r36 = r0
            goto L_0x060f
        L_0x06a6:
            r0 = r1
            goto L_0x0685
        L_0x06a8:
            r3 = r39
            r10 = r44
            r4 = r45
            r11 = r54
            r0 = -1
            r36 = 0
            goto L_0x07a1
        L_0x06b5:
            r1 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r1) goto L_0x0708
            int r0 = r14.zzl()
            r1 = 3
            r14.zzH(r1)
            if (r0 != 0) goto L_0x0777
            int r0 = r14.zzl()
            if (r0 == 0) goto L_0x06fb
            r3 = 1
            if (r0 == r3) goto L_0x06ee
            r3 = 2
            if (r0 == r3) goto L_0x06e1
            if (r0 == r1) goto L_0x06d4
            goto L_0x0777
        L_0x06d4:
            r3 = r39
            r10 = r44
            r4 = r45
            r11 = r54
            r0 = -1
            r30 = 3
            goto L_0x07a1
        L_0x06e1:
            r3 = r39
            r10 = r44
            r4 = r45
            r11 = r54
            r0 = -1
            r30 = 2
            goto L_0x07a1
        L_0x06ee:
            r3 = r39
            r10 = r44
            r4 = r45
            r11 = r54
            r0 = -1
            r30 = 1
            goto L_0x07a1
        L_0x06fb:
            r3 = r39
            r10 = r44
            r4 = r45
            r11 = r54
            r0 = -1
            r30 = 0
            goto L_0x07a1
        L_0x0708:
            r1 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r0 != r1) goto L_0x0777
            r0 = -1
            if (r13 != r0) goto L_0x0774
            if (r8 != r0) goto L_0x076a
            int r1 = r14.zzf()
            r3 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r1 == r3) goto L_0x0738
            r3 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r1 != r3) goto L_0x0721
            goto L_0x0738
        L_0x0721:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzagy.zzf(r1)
            java.lang.String r3 = "Unsupported color type: "
            java.lang.String r1 = r3.concat(r1)
            r3 = r39
            com.google.android.gms.internal.ads.zzer.zzf(r3, r1)
            r10 = r44
            r4 = r45
            r11 = r54
            r8 = -1
            goto L_0x0772
        L_0x0738:
            r3 = r39
            int r1 = r14.zzp()
            int r4 = r14.zzp()
            r5 = 2
            r14.zzH(r5)
            r5 = 19
            if (r2 != r5) goto L_0x0754
            int r2 = r14.zzl()
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0755
            r2 = 1
            goto L_0x0756
        L_0x0754:
            r5 = r2
        L_0x0755:
            r2 = 0
        L_0x0756:
            int r1 = com.google.android.gms.internal.ads.zzs.zza(r1)
            r7 = 1
            if (r7 == r2) goto L_0x075f
            r2 = 2
            goto L_0x0760
        L_0x075f:
            r2 = 1
        L_0x0760:
            int r4 = com.google.android.gms.internal.ads.zzs.zzb(r4)
            r13 = r1
            r43 = r2
            r8 = r4
            r2 = r5
            goto L_0x079b
        L_0x076a:
            r3 = r39
            r10 = r44
            r4 = r45
            r11 = r54
        L_0x0772:
            r13 = -1
            goto L_0x07a1
        L_0x0774:
            r3 = r39
            goto L_0x079b
        L_0x0777:
            r3 = r39
            r0 = -1
            goto L_0x079b
        L_0x077b:
            r49 = r3
            r45 = r4
            r48 = r5
            r46 = r7
            r54 = r11
            r47 = r15
            r3 = r39
            r0 = -1
            com.google.android.gms.internal.ads.zzabi r1 = com.google.android.gms.internal.ads.zzabi.zza(r14)
            if (r1 == 0) goto L_0x079b
            java.lang.String r1 = r1.zza
            java.lang.String r4 = "video/dolby-vision"
            r11 = r1
            r6 = r4
            r10 = r44
            r4 = r45
            goto L_0x07a1
        L_0x079b:
            r10 = r44
            r4 = r45
            r11 = r54
        L_0x07a1:
            int r12 = r12 + r2
            r39 = r3
            r0 = r35
            r2 = r36
            r1 = r37
            r7 = r46
            r15 = r47
            r5 = r48
            r3 = r49
            goto L_0x044e
        L_0x07b4:
            r35 = r0
            r37 = r1
            r36 = r2
        L_0x07ba:
            r49 = r3
            r48 = r5
            r44 = r10
            r54 = r11
            r47 = r15
            r3 = r39
            r0 = -1
            if (r6 != 0) goto L_0x07d1
            r2 = r16
            r4 = r41
            r5 = r47
            goto L_0x0850
        L_0x07d1:
            com.google.android.gms.internal.ads.zzak r1 = new com.google.android.gms.internal.ads.zzak
            r1.<init>()
            r2 = r16
            r1.zzI(r2)
            r1.zzU(r6)
            r11 = r54
            r1.zzz(r11)
            r4 = r49
            r1.zzab(r4)
            r4 = r48
            r1.zzH(r4)
            r9 = r44
            r1.zzR(r9)
            r4 = r41
            r1.zzT(r4)
            r5 = r36
            r1.zzS(r5)
            r5 = r30
            r1.zzX(r5)
            r5 = r26
            r1.zzK(r5)
            r12 = r25
            r1.zzD(r12)
            r5 = r43
            if (r13 != r0) goto L_0x081e
            if (r5 != r0) goto L_0x081b
            if (r8 != r0) goto L_0x0818
            if (r17 == 0) goto L_0x0830
            r5 = -1
            r6 = -1
            goto L_0x081c
        L_0x0818:
            r6 = r8
            r5 = -1
            goto L_0x081c
        L_0x081b:
            r6 = r8
        L_0x081c:
            r8 = -1
            goto L_0x0820
        L_0x081e:
            r6 = r8
            r8 = r13
        L_0x0820:
            com.google.android.gms.internal.ads.zzs r7 = new com.google.android.gms.internal.ads.zzs
            if (r17 == 0) goto L_0x0829
            byte[] r9 = r17.array()
            goto L_0x082a
        L_0x0829:
            r9 = 0
        L_0x082a:
            r7.<init>(r8, r5, r6, r9)
            r1.zzA(r7)
        L_0x0830:
            if (r20 == 0) goto L_0x0848
            long r5 = r20.zzc
            int r5 = com.google.android.gms.internal.ads.zzfya.zzc(r5)
            r1.zzx(r5)
            long r5 = r20.zzd
            int r5 = com.google.android.gms.internal.ads.zzfya.zzc(r5)
            r1.zzQ(r5)
        L_0x0848:
            com.google.android.gms.internal.ads.zzam r1 = r1.zzac()
            r5 = r47
            r5.zzb = r1
        L_0x0850:
            int r1 = r35 + r37
            r14.zzG(r1)
            int r13 = r24 + 1
            r1 = r59
            r12 = r62
            r6 = r3
            r15 = r5
            r10 = r18
            r8 = r21
            r0 = r23
            r3 = r38
            r7 = r40
            r11 = r42
            r5 = r2
            r2 = r14
            r14 = r19
            goto L_0x0191
        L_0x086f:
            r3 = r6
            r40 = r7
            r21 = r8
            r18 = r10
            r42 = r11
            r19 = r14
            r5 = r15
            r0 = -1
            r1 = 1701082227(0x65647473, float:6.742798E22)
            r2 = r42
            com.google.android.gms.internal.ads.zzagw r1 = r2.zza(r1)
            if (r1 == 0) goto L_0x0898
            android.util.Pair r1 = zzi(r1)
            if (r1 == 0) goto L_0x0898
            java.lang.Object r4 = r1.first
            long[] r4 = (long[]) r4
            java.lang.Object r1 = r1.second
            long[] r1 = (long[]) r1
            r30 = r1
            goto L_0x089b
        L_0x0898:
            r4 = 0
            r30 = 0
        L_0x089b:
            com.google.android.gms.internal.ads.zzam r1 = r5.zzb
            if (r1 != 0) goto L_0x08a3
            r1 = r65
            goto L_0x0061
        L_0x08a3:
            com.google.android.gms.internal.ads.zzahv r1 = new com.google.android.gms.internal.ads.zzahv
            int r17 = r19.zza
            r6 = r40
            java.lang.Object r6 = r6.first
            java.lang.Long r6 = (java.lang.Long) r6
            long r19 = r6.longValue()
            com.google.android.gms.internal.ads.zzam r6 = r5.zzb
            int r7 = r5.zzd
            com.google.android.gms.internal.ads.zzahw[] r8 = r5.zza
            int r5 = r5.zzc
            r16 = r1
            r23 = r28
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r5
            r29 = r4
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r5 = r1
            r1 = r65
        L_0x08cf:
            java.lang.Object r4 = r1.apply(r5)
            r6 = r4
            com.google.android.gms.internal.ads.zzahv r6 = (com.google.android.gms.internal.ads.zzahv) r6
            if (r6 == 0) goto L_0x0eb5
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzagw r2 = r2.zza(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzagw r2 = r2.zza(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzagw r2 = r2.zza(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.gms.internal.ads.zzagx r4 = r2.zzb(r4)
            if (r4 == 0) goto L_0x0907
            com.google.android.gms.internal.ads.zzam r5 = r6.zzf
            com.google.android.gms.internal.ads.zzahd r7 = new com.google.android.gms.internal.ads.zzahd
            r7.<init>(r4, r5)
            goto L_0x0915
        L_0x0907:
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.gms.internal.ads.zzagx r4 = r2.zzb(r4)
            if (r4 == 0) goto L_0x0ead
            com.google.android.gms.internal.ads.zzahe r7 = new com.google.android.gms.internal.ads.zzahe
            r7.<init>(r4)
        L_0x0915:
            int r4 = r7.zzb()
            if (r4 != 0) goto L_0x0931
            com.google.android.gms.internal.ads.zzahy r0 = new com.google.android.gms.internal.ads.zzahy
            r2 = 0
            long[] r7 = new long[r2]
            int[] r8 = new int[r2]
            r9 = 0
            long[] r10 = new long[r2]
            int[] r11 = new int[r2]
            r12 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x092d:
            r1 = r34
            goto L_0x0ea9
        L_0x0931:
            r5 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.gms.internal.ads.zzagx r5 = r2.zzb(r5)
            if (r5 != 0) goto L_0x0947
            r5 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.gms.internal.ads.zzagx r5 = r2.zzb(r5)
            java.util.Objects.requireNonNull(r5)
            r8 = r5
            r5 = 1
            goto L_0x0949
        L_0x0947:
            r8 = r5
            r5 = 0
        L_0x0949:
            r9 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.gms.internal.ads.zzagx r9 = r2.zzb(r9)
            java.util.Objects.requireNonNull(r9)
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.gms.internal.ads.zzagx r10 = r2.zzb(r10)
            java.util.Objects.requireNonNull(r10)
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.gms.internal.ads.zzagx r11 = r2.zzb(r11)
            if (r11 == 0) goto L_0x0969
            com.google.android.gms.internal.ads.zzfb r11 = r11.zza
            goto L_0x096a
        L_0x0969:
            r11 = 0
        L_0x096a:
            r12 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.gms.internal.ads.zzagx r2 = r2.zzb(r12)
            if (r2 == 0) goto L_0x0976
            com.google.android.gms.internal.ads.zzfb r2 = r2.zza
            goto L_0x0977
        L_0x0976:
            r2 = 0
        L_0x0977:
            com.google.android.gms.internal.ads.zzfb r10 = r10.zza
            com.google.android.gms.internal.ads.zzfb r9 = r9.zza
            com.google.android.gms.internal.ads.zzfb r8 = r8.zza
            com.google.android.gms.internal.ads.zzagz r12 = new com.google.android.gms.internal.ads.zzagz
            r12.<init>(r9, r8, r5)
            r5 = 12
            r10.zzG(r5)
            int r8 = r10.zzo()
            int r8 = r8 + r0
            int r9 = r10.zzo()
            int r13 = r10.zzo()
            if (r2 == 0) goto L_0x099e
            r2.zzG(r5)
            int r14 = r2.zzo()
            goto L_0x099f
        L_0x099e:
            r14 = 0
        L_0x099f:
            if (r11 == 0) goto L_0x09b2
            r11.zzG(r5)
            int r5 = r11.zzo()
            if (r5 <= 0) goto L_0x09b0
            int r15 = r11.zzo()
            int r15 = r15 + r0
            goto L_0x09b4
        L_0x09b0:
            r11 = 0
            goto L_0x09b3
        L_0x09b2:
            r5 = 0
        L_0x09b3:
            r15 = -1
        L_0x09b4:
            int r0 = r7.zza()
            com.google.android.gms.internal.ads.zzam r1 = r6.zzf
            java.lang.String r1 = r1.zzm
            r16 = r9
            r9 = -1
            if (r0 == r9) goto L_0x0a64
            java.lang.String r9 = "audio/raw"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x09d9
            java.lang.String r9 = "audio/g711-mlaw"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x09d9
            java.lang.String r9 = "audio/g711-alaw"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0a64
        L_0x09d9:
            if (r8 != 0) goto L_0x0a64
            if (r14 != 0) goto L_0x0a63
            if (r5 != 0) goto L_0x0a63
            int r1 = r12.zza
            long[] r2 = new long[r1]
            int[] r3 = new int[r1]
        L_0x09e5:
            boolean r5 = r12.zza()
            if (r5 == 0) goto L_0x09f6
            int r5 = r12.zzb
            long r7 = r12.zzd
            r2[r5] = r7
            int r7 = r12.zzc
            r3[r5] = r7
            goto L_0x09e5
        L_0x09f6:
            long r7 = (long) r13
            r5 = 8192(0x2000, float:1.14794E-41)
            int r5 = r5 / r0
            r9 = 0
            r10 = 0
        L_0x09fc:
            if (r9 >= r1) goto L_0x0a0a
            r11 = r3[r9]
            int r12 = com.google.android.gms.internal.ads.zzfk.zza
            int r11 = r11 + r5
            r12 = -1
            int r11 = r11 + r12
            int r11 = r11 / r5
            int r10 = r10 + r11
            int r9 = r9 + 1
            goto L_0x09fc
        L_0x0a0a:
            long[] r9 = new long[r10]
            int[] r11 = new int[r10]
            long[] r12 = new long[r10]
            int[] r10 = new int[r10]
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0a17:
            if (r13 >= r1) goto L_0x0a58
            r17 = r3[r13]
            r18 = r2[r13]
            r55 = r17
            r17 = r1
            r1 = r55
        L_0x0a23:
            if (r1 <= 0) goto L_0x0a4f
            int r20 = java.lang.Math.min(r5, r1)
            r9[r16] = r18
            r21 = r2
            int r2 = r0 * r20
            r11[r16] = r2
            int r15 = java.lang.Math.max(r15, r2)
            r22 = r3
            long r2 = (long) r14
            long r2 = r2 * r7
            r12[r16] = r2
            r2 = 1
            r10[r16] = r2
            r2 = r11[r16]
            long r2 = (long) r2
            long r18 = r18 + r2
            int r14 = r14 + r20
            int r1 = r1 - r20
            int r16 = r16 + 1
            r2 = r21
            r3 = r22
            goto L_0x0a23
        L_0x0a4f:
            r21 = r2
            r22 = r3
            int r13 = r13 + 1
            r1 = r17
            goto L_0x0a17
        L_0x0a58:
            long r0 = (long) r14
            long r7 = r7 * r0
            r0 = r7
            r2 = r9
            r14 = r10
            r3 = r11
            r13 = r15
            r15 = r6
            goto L_0x0c30
        L_0x0a63:
            r8 = 0
        L_0x0a64:
            long[] r0 = new long[r4]
            int[] r1 = new int[r4]
            long[] r9 = new long[r4]
            r17 = r5
            int[] r5 = new int[r4]
            r20 = r6
            r6 = r13
            r21 = r14
            r14 = r15
            r13 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r15 = r8
            r8 = 0
        L_0x0a81:
            if (r8 >= r4) goto L_0x0b5a
            r27 = r23
            r23 = 1
        L_0x0a87:
            if (r18 != 0) goto L_0x0aac
            boolean r23 = r12.zza()
            if (r23 == 0) goto L_0x0aa4
            r29 = r14
            r24 = r15
            long r14 = r12.zzd
            r30 = r4
            int r4 = r12.zzc
            r18 = r4
            r27 = r14
            r15 = r24
            r14 = r29
            r4 = r30
            goto L_0x0a87
        L_0x0aa4:
            r30 = r4
            r29 = r14
            r24 = r15
            r4 = 0
            goto L_0x0ab4
        L_0x0aac:
            r30 = r4
            r29 = r14
            r24 = r15
            r4 = r18
        L_0x0ab4:
            if (r23 != 0) goto L_0x0ace
            java.lang.String r4 = "Unexpected end of chunk data"
            com.google.android.gms.internal.ads.zzer.zzf(r3, r4)
            long[] r0 = java.util.Arrays.copyOf(r0, r8)
            int[] r1 = java.util.Arrays.copyOf(r1, r8)
            long[] r9 = java.util.Arrays.copyOf(r9, r8)
            int[] r5 = java.util.Arrays.copyOf(r5, r8)
            r4 = r8
            goto L_0x0b5e
        L_0x0ace:
            r14 = r22
            if (r2 != 0) goto L_0x0ad3
            goto L_0x0ae9
        L_0x0ad3:
            if (r19 != 0) goto L_0x0ae6
            if (r21 <= 0) goto L_0x0ae2
            int r21 = r21 + -1
            int r19 = r2.zzo()
            int r14 = r2.zzf()
            goto L_0x0ad3
        L_0x0ae2:
            r15 = -1
            r19 = 0
            goto L_0x0ae7
        L_0x0ae6:
            r15 = -1
        L_0x0ae7:
            int r19 = r19 + -1
        L_0x0ae9:
            r0[r8] = r27
            int r15 = r7.zzc()
            r1[r8] = r15
            if (r15 <= r13) goto L_0x0af7
            r18 = r15
            r15 = r12
            goto L_0x0afa
        L_0x0af7:
            r15 = r12
            r18 = r13
        L_0x0afa:
            long r12 = (long) r14
            long r12 = r25 + r12
            r9[r8] = r12
            if (r11 != 0) goto L_0x0b03
            r12 = 1
            goto L_0x0b04
        L_0x0b03:
            r12 = 0
        L_0x0b04:
            r5[r8] = r12
            r12 = r29
            if (r8 != r12) goto L_0x0b1a
            r13 = 1
            r5[r8] = r13
            int r17 = r17 + -1
            if (r17 <= 0) goto L_0x0b1a
            java.util.Objects.requireNonNull(r11)
            int r12 = r11.zzo()
            r13 = -1
            int r12 = r12 + r13
        L_0x0b1a:
            r23 = r11
            r13 = r12
            long r11 = (long) r6
            long r25 = r25 + r11
            int r11 = r16 + -1
            if (r11 != 0) goto L_0x0b39
            if (r24 <= 0) goto L_0x0b36
            int r6 = r10.zzo()
            int r11 = r10.zzf()
            int r12 = r24 + -1
            r16 = r6
            r6 = r11
            r24 = r12
            goto L_0x0b3b
        L_0x0b36:
            r16 = 0
            goto L_0x0b3b
        L_0x0b39:
            r16 = r11
        L_0x0b3b:
            r11 = r1[r8]
            long r11 = (long) r11
            long r11 = r27 + r11
            r27 = -1
            int r4 = r4 + -1
            int r8 = r8 + 1
            r22 = r14
            r14 = r13
            r13 = r18
            r18 = r4
            r4 = r30
            r55 = r11
            r12 = r15
            r11 = r23
            r15 = r24
            r23 = r55
            goto L_0x0a81
        L_0x0b5a:
            r30 = r4
            r24 = r15
        L_0x0b5e:
            r14 = r22
            long r6 = (long) r14
            long r7 = r25 + r6
            if (r2 == 0) goto L_0x0b75
        L_0x0b65:
            if (r21 <= 0) goto L_0x0b75
            int r6 = r2.zzo()
            if (r6 == 0) goto L_0x0b6f
            r2 = 0
            goto L_0x0b76
        L_0x0b6f:
            r2.zzf()
            int r21 = r21 + -1
            goto L_0x0b65
        L_0x0b75:
            r2 = 1
        L_0x0b76:
            if (r17 != 0) goto L_0x0bcb
            if (r16 != 0) goto L_0x0bbe
            if (r18 != 0) goto L_0x0bb0
            if (r24 != 0) goto L_0x0ba3
            if (r19 != 0) goto L_0x0b97
            if (r2 != 0) goto L_0x0b8d
            r16 = r0
            r15 = r20
            r2 = 0
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            goto L_0x0bda
        L_0x0b8d:
            r16 = r0
            r17 = r1
            r18 = r4
            r15 = r20
            goto L_0x0c27
        L_0x0b97:
            r16 = r0
            r14 = r2
            r12 = r19
            r15 = r20
            r2 = 0
            r6 = 0
            r10 = 0
            r11 = 0
            goto L_0x0bda
        L_0x0ba3:
            r16 = r0
            r14 = r2
            r12 = r19
            r15 = r20
            r11 = r24
            r2 = 0
            r6 = 0
            r10 = 0
            goto L_0x0bda
        L_0x0bb0:
            r16 = r0
            r14 = r2
            r10 = r18
            r12 = r19
            r15 = r20
            r11 = r24
            r2 = 0
            r6 = 0
            goto L_0x0bda
        L_0x0bbe:
            r14 = r2
            r6 = r16
            r10 = r18
            r12 = r19
            r15 = r20
            r11 = r24
            r2 = 0
            goto L_0x0bd8
        L_0x0bcb:
            r14 = r2
            r6 = r16
            r2 = r17
            r10 = r18
            r12 = r19
            r15 = r20
            r11 = r24
        L_0x0bd8:
            r16 = r0
        L_0x0bda:
            int r0 = r15.zza
            r17 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r18 = r4
            java.lang.String r4 = "Inconsistent stbl box for track "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = ": remainingSynchronizationSamples "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", remainingSamplesAtTimestampOffset "
            r1.append(r0)
            r1.append(r12)
            r0 = 1
            if (r0 == r14) goto L_0x0c1b
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0c1d
        L_0x0c1b:
            java.lang.String r0 = ""
        L_0x0c1d:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzer.zzf(r3, r0)
        L_0x0c27:
            r14 = r5
            r0 = r7
            r12 = r9
            r2 = r16
            r3 = r17
            r4 = r18
        L_0x0c30:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r15.zzc
            r5 = r0
            long r16 = com.google.android.gms.internal.ads.zzfk.zzr(r5, r7, r9)
            long[] r5 = r15.zzh
            if (r5 != 0) goto L_0x0c56
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r15.zzc
            com.google.android.gms.internal.ads.zzfk.zzD(r12, r0, r4)
            com.google.android.gms.internal.ads.zzahy r0 = new com.google.android.gms.internal.ads.zzahy
            r5 = r0
            r6 = r15
            r7 = r2
            r8 = r3
            r9 = r13
            r10 = r12
            r11 = r14
            r12 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x092d
        L_0x0c56:
            int r6 = r5.length
            r7 = 1
            if (r6 != r7) goto L_0x0cf0
            int r6 = r15.zzb
            if (r6 != r7) goto L_0x0cf0
            int r6 = r12.length
            r7 = 2
            if (r6 < r7) goto L_0x0cf0
            long[] r6 = r15.zzi
            java.util.Objects.requireNonNull(r6)
            r7 = 0
            r16 = r6[r7]
            r18 = r5[r7]
            long r5 = r15.zzc
            long r7 = r15.zzd
            r20 = r5
            r22 = r7
            long r5 = com.google.android.gms.internal.ads.zzfk.zzr(r18, r20, r22)
            long r18 = r16 + r5
            r5 = r12
            r6 = r0
            r8 = r16
            r10 = r18
            boolean r5 = zzp(r5, r6, r8, r10)
            if (r5 == 0) goto L_0x0cf0
            long r6 = r0 - r18
            r5 = 0
            r8 = r12[r5]
            long r18 = r16 - r8
            com.google.android.gms.internal.ads.zzam r5 = r15.zzf
            int r8 = r5.zzA
            long r8 = (long) r8
            long r10 = r15.zzc
            r20 = r8
            r22 = r10
            long r16 = com.google.android.gms.internal.ads.zzfk.zzr(r18, r20, r22)
            int r5 = r5.zzA
            long r8 = (long) r5
            long r10 = r15.zzc
            r18 = 0
            int r5 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            long r6 = com.google.android.gms.internal.ads.zzfk.zzr(r6, r8, r10)
            if (r5 != 0) goto L_0x0cb2
            int r5 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x0cf0
            r8 = 0
            goto L_0x0cb4
        L_0x0cb2:
            r8 = r16
        L_0x0cb4:
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x0cf0
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x0cf0
            int r0 = (int) r8
            r1 = r59
            r1.zza = r0
            int r0 = (int) r6
            r1.zzb = r0
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r15.zzc
            com.google.android.gms.internal.ads.zzfk.zzD(r12, r4, r6)
            long[] r0 = r15.zzh
            r4 = 0
            r5 = r0[r4]
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r15.zzd
            long r16 = com.google.android.gms.internal.ads.zzfk.zzr(r5, r7, r9)
            com.google.android.gms.internal.ads.zzahy r0 = new com.google.android.gms.internal.ads.zzahy
            r5 = r0
            r6 = r15
            r7 = r2
            r8 = r3
            r9 = r13
            r10 = r12
            r11 = r14
            r12 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x092d
        L_0x0cf0:
            long[] r5 = r15.zzh
            int r7 = r5.length
            r6 = 1
            if (r7 != r6) goto L_0x0d3c
            r6 = 0
            r7 = r5[r6]
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0d3b
            long[] r4 = r15.zzi
            java.util.Objects.requireNonNull(r4)
            r7 = r4[r6]
            r4 = 0
        L_0x0d07:
            int r5 = r12.length
            if (r4 >= r5) goto L_0x0d1e
            r5 = r12[r4]
            long r16 = r5 - r7
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r15.zzc
            r20 = r5
            long r5 = com.google.android.gms.internal.ads.zzfk.zzr(r16, r18, r20)
            r12[r4] = r5
            int r4 = r4 + 1
            goto L_0x0d07
        L_0x0d1e:
            long r16 = r0 - r7
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r15.zzc
            r20 = r0
            long r0 = com.google.android.gms.internal.ads.zzfk.zzr(r16, r18, r20)
            com.google.android.gms.internal.ads.zzahy r4 = new com.google.android.gms.internal.ads.zzahy
            r5 = r4
            r6 = r15
            r7 = r2
            r8 = r3
            r9 = r13
            r10 = r12
            r11 = r14
            r12 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0 = r4
            goto L_0x092d
        L_0x0d3b:
            r7 = 1
        L_0x0d3c:
            int r0 = r15.zzb
            r1 = 1
            if (r0 != r1) goto L_0x0d43
            r0 = 1
            goto L_0x0d44
        L_0x0d43:
            r0 = 0
        L_0x0d44:
            long[] r1 = r15.zzi
            int[] r5 = new int[r7]
            int[] r6 = new int[r7]
            java.util.Objects.requireNonNull(r1)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0d51:
            long[] r11 = r15.zzh
            r16 = r13
            int r13 = r11.length
            if (r7 >= r13) goto L_0x0db9
            r13 = r2
            r17 = r3
            r2 = r1[r7]
            r18 = -1
            int r20 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r20 == 0) goto L_0x0da6
            r21 = r11[r7]
            r11 = r9
            r18 = r10
            long r9 = r15.zzc
            r20 = r13
            r19 = r14
            long r13 = r15.zzd
            r23 = r9
            r25 = r13
            long r9 = com.google.android.gms.internal.ads.zzfk.zzr(r21, r23, r25)
            r13 = 1
            int r14 = com.google.android.gms.internal.ads.zzfk.zzc(r12, r2, r13, r13)
            r5[r7] = r14
            long r2 = r2 + r9
            r14 = 0
            int r2 = com.google.android.gms.internal.ads.zzfk.zza(r12, r2, r0, r14)
            r6[r7] = r2
        L_0x0d87:
            r2 = r5[r7]
            r3 = r6[r7]
            if (r2 >= r3) goto L_0x0d98
            r9 = r19[r2]
            r9 = r9 & r13
            if (r9 != 0) goto L_0x0d98
            int r2 = r2 + 1
            r5[r7] = r2
            r13 = 1
            goto L_0x0d87
        L_0x0d98:
            int r9 = r3 - r2
            int r8 = r8 + r9
            r9 = r18
            if (r9 == r2) goto L_0x0da1
            r2 = 1
            goto L_0x0da2
        L_0x0da1:
            r2 = 0
        L_0x0da2:
            r2 = r2 | r11
            r9 = r2
            r10 = r3
            goto L_0x0dae
        L_0x0da6:
            r11 = r9
            r9 = r10
            r20 = r13
            r19 = r14
            r14 = 0
            r9 = r11
        L_0x0dae:
            int r7 = r7 + 1
            r13 = r16
            r3 = r17
            r14 = r19
            r2 = r20
            goto L_0x0d51
        L_0x0db9:
            r20 = r2
            r17 = r3
            r11 = r9
            r19 = r14
            r14 = 0
            if (r8 == r4) goto L_0x0dc5
            r7 = 1
            goto L_0x0dc6
        L_0x0dc5:
            r7 = 0
        L_0x0dc6:
            r0 = r11 | r7
            if (r0 == 0) goto L_0x0dce
            long[] r1 = new long[r8]
            r7 = r1
            goto L_0x0dd0
        L_0x0dce:
            r7 = r20
        L_0x0dd0:
            if (r0 == 0) goto L_0x0dd5
            int[] r1 = new int[r8]
            goto L_0x0dd7
        L_0x0dd5:
            r1 = r17
        L_0x0dd7:
            r2 = 1
            if (r2 != r0) goto L_0x0ddc
            r4 = 0
            goto L_0x0dde
        L_0x0ddc:
            r4 = r16
        L_0x0dde:
            if (r0 == 0) goto L_0x0de4
            int[] r2 = new int[r8]
            r11 = r2
            goto L_0x0de6
        L_0x0de4:
            r11 = r19
        L_0x0de6:
            long[] r10 = new long[r8]
            r9 = r4
            r2 = 0
            r4 = 0
            r27 = 0
        L_0x0ded:
            long[] r3 = r15.zzh
            int r3 = r3.length
            if (r4 >= r3) goto L_0x0e8f
            long[] r3 = r15.zzi
            r29 = r3[r4]
            r3 = r5[r4]
            r8 = r6[r4]
            if (r0 == 0) goto L_0x0e12
            int r13 = r8 - r3
            r14 = r20
            java.lang.System.arraycopy(r14, r3, r7, r2, r13)
            r16 = r5
            r5 = r17
            java.lang.System.arraycopy(r5, r3, r1, r2, r13)
            r17 = r6
            r6 = r19
            java.lang.System.arraycopy(r6, r3, r11, r2, r13)
            goto L_0x0e1c
        L_0x0e12:
            r16 = r5
            r5 = r17
            r14 = r20
            r17 = r6
            r6 = r19
        L_0x0e1c:
            if (r3 >= r8) goto L_0x0e6c
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r20 = r14
            long r13 = r15.zzd
            r21 = r27
            r25 = r13
            long r13 = com.google.android.gms.internal.ads.zzfk.zzr(r21, r23, r25)
            r18 = r12[r3]
            long r21 = r18 - r29
            r19 = r11
            r18 = r12
            long r11 = r15.zzc
            r25 = r11
            long r11 = com.google.android.gms.internal.ads.zzfk.zzr(r21, r23, r25)
            r21 = r6
            int r6 = r15.zzb
            r22 = r8
            r8 = 1
            if (r6 == r8) goto L_0x0e4e
            r6 = r9
            r8 = 0
            long r11 = java.lang.Math.max(r8, r11)
            goto L_0x0e51
        L_0x0e4e:
            r6 = r9
            r8 = 0
        L_0x0e51:
            long r13 = r13 + r11
            r10[r2] = r13
            if (r0 == 0) goto L_0x0e5c
            r11 = r1[r2]
            if (r11 <= r6) goto L_0x0e5c
            r6 = r5[r3]
        L_0x0e5c:
            int r2 = r2 + 1
            int r3 = r3 + 1
            r9 = r6
            r12 = r18
            r11 = r19
            r14 = r20
            r6 = r21
            r8 = r22
            goto L_0x0e1c
        L_0x0e6c:
            r21 = r6
            r6 = r9
            r19 = r11
            r18 = r12
            r20 = r14
            r8 = 0
            long[] r3 = r15.zzh
            r11 = r3[r4]
            long r27 = r27 + r11
            int r4 = r4 + 1
            r9 = r6
            r6 = r17
            r12 = r18
            r11 = r19
            r19 = r21
            r14 = 0
            r17 = r5
            r5 = r16
            goto L_0x0ded
        L_0x0e8f:
            r4 = r9
            r19 = r11
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r15.zzd
            r21 = r27
            r25 = r2
            long r12 = com.google.android.gms.internal.ads.zzfk.zzr(r21, r23, r25)
            com.google.android.gms.internal.ads.zzahy r0 = new com.google.android.gms.internal.ads.zzahy
            r5 = r0
            r6 = r15
            r8 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x092d
        L_0x0ea9:
            r1.add(r0)
            goto L_0x0eb7
        L_0x0ead:
            java.lang.String r0 = "Track has no sample table size information"
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r0 = com.google.android.gms.internal.ads.zzcc.zza(r0, r2)
            throw r0
        L_0x0eb5:
            r1 = r34
        L_0x0eb7:
            int r15 = r31 + 1
            r0 = r58
            r12 = r62
            r13 = r1
            r1 = r59
            goto L_0x000c
        L_0x0ec2:
            r2 = 0
            java.lang.String r0 = "Malformed sample table (stbl) missing sample description (stsd)"
            com.google.android.gms.internal.ads.zzcc r0 = com.google.android.gms.internal.ads.zzcc.zza(r0, r2)
            throw r0
        L_0x0eca:
            r1 = r13
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahg.zzd(com.google.android.gms.internal.ads.zzagw, com.google.android.gms.internal.ads.zzacc, long, com.google.android.gms.internal.ads.zzad, boolean, boolean, com.google.android.gms.internal.ads.zzfsk):java.util.List");
    }

    public static void zze(zzfb zzfb) {
        int zzc = zzfb.zzc();
        zzfb.zzH(4);
        if (zzfb.zzf() != 1751411826) {
            zzc += 4;
        }
        zzfb.zzG(zzc);
    }

    private static int zzf(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    private static int zzg(zzfb zzfb) {
        int zzl = zzfb.zzl();
        int i10 = zzl & 127;
        while ((zzl & 128) == 128) {
            zzl = zzfb.zzl();
            i10 = (i10 << 7) | (zzl & 127);
        }
        return i10;
    }

    private static int zzh(zzfb zzfb) {
        zzfb.zzG(16);
        return zzfb.zzf();
    }

    private static Pair zzi(zzagw zzagw) {
        zzagx zzb = zzagw.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzfb zzfb = zzb.zza;
        zzfb.zzG(8);
        int zze = zzagy.zze(zzfb.zzf());
        int zzo = zzfb.zzo();
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i10 = 0;
        while (i10 < zzo) {
            jArr[i10] = zze == 1 ? zzfb.zzu() : zzfb.zzt();
            jArr2[i10] = zze == 1 ? zzfb.zzs() : (long) zzfb.zzf();
            if (zzfb.zzz() == 1) {
                zzfb.zzH(2);
                i10++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzj(zzfb zzfb) {
        int i10 = 8;
        zzfb.zzG(8);
        int zze = zzagy.zze(zzfb.zzf());
        zzfb.zzH(zze == 0 ? 8 : 16);
        long zzt = zzfb.zzt();
        if (zze == 0) {
            i10 = 4;
        }
        zzfb.zzH(i10);
        int zzp = zzfb.zzp();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((zzp >> 10) & 31) + 96));
        sb.append((char) (((zzp >> 5) & 31) + 96));
        sb.append((char) ((zzp & 31) + 96));
        return Pair.create(Long.valueOf(zzt), sb.toString());
    }

    private static Pair zzk(zzfb zzfb, int i10, int i11) {
        Pair pair;
        Integer num;
        zzahw zzahw;
        int i12;
        int i13;
        byte[] bArr;
        zzfb zzfb2 = zzfb;
        int zzc = zzfb.zzc();
        while (zzc - i10 < i11) {
            zzfb2.zzG(zzc);
            int zzf = zzfb.zzf();
            boolean z10 = true;
            zzabq.zzb(zzf > 0, "childAtomSize must be positive");
            if (zzfb.zzf() == 1936289382) {
                int i14 = zzc + 8;
                int i15 = -1;
                int i16 = 0;
                String str = null;
                Integer num2 = null;
                while (i14 - zzc < zzf) {
                    zzfb2.zzG(i14);
                    int zzf2 = zzfb.zzf();
                    int zzf3 = zzfb.zzf();
                    if (zzf3 == 1718775137) {
                        num2 = Integer.valueOf(zzfb.zzf());
                    } else if (zzf3 == 1935894637) {
                        zzfb2.zzH(4);
                        str = zzfb2.zzy(4, zzfsi.zzc);
                    } else if (zzf3 == 1935894633) {
                        i15 = i14;
                        i16 = zzf2;
                    }
                    i14 += zzf2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzabq.zzb(num2 != null, "frma atom is mandatory");
                    zzabq.zzb(i15 != -1, "schi atom is mandatory");
                    int i17 = i15 + 8;
                    while (true) {
                        if (i17 - i15 >= i16) {
                            num = num2;
                            zzahw = null;
                            break;
                        }
                        zzfb2.zzG(i17);
                        int zzf4 = zzfb.zzf();
                        if (zzfb.zzf() == 1952804451) {
                            int zze = zzagy.zze(zzfb.zzf());
                            zzfb2.zzH(1);
                            if (zze == 0) {
                                zzfb2.zzH(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int zzl = zzfb.zzl();
                                i13 = zzl & 15;
                                i12 = (zzl & 240) >> 4;
                            }
                            boolean z11 = zzfb.zzl() == 1;
                            int zzl2 = zzfb.zzl();
                            byte[] bArr2 = new byte[16];
                            zzfb2.zzC(bArr2, 0, 16);
                            if (!z11 || zzl2 != 0) {
                                bArr = null;
                            } else {
                                int zzl3 = zzfb.zzl();
                                byte[] bArr3 = new byte[zzl3];
                                zzfb2.zzC(bArr3, 0, zzl3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzahw = new zzahw(z11, str, zzl2, bArr2, i12, i13, bArr);
                        } else {
                            Integer num3 = num2;
                            i17 += zzf4;
                        }
                    }
                    if (zzahw == null) {
                        z10 = false;
                    }
                    zzabq.zzb(z10, "tenc atom is mandatory");
                    int i18 = zzfk.zza;
                    pair = Pair.create(num, zzahw);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            zzc += zzf;
        }
        return null;
    }

    private static zzby zzl(zzfb zzfb) {
        short zzz = zzfb.zzz();
        zzfb.zzH(2);
        String zzy = zzfb.zzy(zzz, zzfsi.zzc);
        int max = Math.max(zzy.lastIndexOf(43), zzy.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzfr(Float.parseFloat(zzy.substring(0, max)), Float.parseFloat(zzy.substring(max, zzy.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaha zzm(zzfb zzfb, int i10) {
        zzfb.zzG(i10 + 12);
        zzfb.zzH(1);
        zzg(zzfb);
        zzfb.zzH(2);
        int zzl = zzfb.zzl();
        if ((zzl & 128) != 0) {
            zzfb.zzH(2);
        }
        if ((zzl & 64) != 0) {
            zzfb.zzH(zzfb.zzl());
        }
        if ((zzl & 32) != 0) {
            zzfb.zzH(2);
        }
        zzfb.zzH(1);
        zzg(zzfb);
        String zzd = zzcb.zzd(zzfb.zzl());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzaha(zzd, (byte[]) null, -1, -1);
        }
        zzfb.zzH(4);
        long zzt = zzfb.zzt();
        long zzt2 = zzfb.zzt();
        zzfb.zzH(1);
        int zzg = zzg(zzfb);
        byte[] bArr = new byte[zzg];
        zzfb.zzC(bArr, 0, zzg);
        return new zzaha(zzd, bArr, zzt2 <= 0 ? -1 : zzt2, zzt > 0 ? zzt : -1);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void zzo(zzfb zzfb, int i10, int i11, int i12, int i13, String str, boolean z10, zzad zzad, zzahc zzahc, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zzad zzad2;
        String str2;
        int i20;
        String str3;
        int i21;
        int i22;
        int i23;
        List zzm;
        int i24;
        boolean z11;
        String str4;
        boolean z12;
        zzfb zzfb2 = zzfb;
        int i25 = i11;
        int i26 = i12;
        int i27 = i13;
        String str5 = str;
        zzad zzad3 = zzad;
        zzahc zzahc2 = zzahc;
        zzfb2.zzG(i25 + 16);
        if (z10) {
            i15 = zzfb.zzp();
            zzfb2.zzH(6);
        } else {
            zzfb2.zzH(8);
            i15 = 0;
        }
        if (i15 == 0 || i15 == 1) {
            i17 = zzfb.zzp();
            zzfb2.zzH(6);
            i19 = zzfb.zzm();
            zzfb2.zzG(zzfb.zzc() - 4);
            i18 = zzfb.zzf();
            if (i15 == 1) {
                zzfb2.zzH(16);
            }
            i16 = -1;
        } else if (i15 == 2) {
            zzfb2.zzH(16);
            i19 = (int) Math.round(Double.longBitsToDouble(zzfb.zzs()));
            i17 = zzfb.zzo();
            zzfb2.zzH(4);
            int zzo = zzfb.zzo();
            int zzo2 = zzfb.zzo();
            int i28 = zzo2 & 1;
            int i29 = zzo2 & 2;
            if (i28 == 0) {
                if (zzo == 8) {
                    i16 = 3;
                } else if (zzo == 16) {
                    i16 = i29 != 0 ? 268435456 : 2;
                } else if (zzo == 24) {
                    i16 = i29 != 0 ? 1342177280 : 536870912;
                } else if (zzo == 32) {
                    i16 = i29 != 0 ? 1610612736 : 805306368;
                }
                zzfb2.zzH(8);
                i18 = 0;
            } else if (zzo == 32) {
                i16 = 4;
                zzfb2.zzH(8);
                i18 = 0;
            }
            i16 = -1;
            zzfb2.zzH(8);
            i18 = 0;
        } else {
            return;
        }
        int zzc = zzfb.zzc();
        int i30 = 1701733217;
        int i31 = i10;
        if (i31 == 1701733217) {
            Pair zzk = zzk(zzfb2, i25, i26);
            if (zzk != null) {
                i30 = ((Integer) zzk.first).intValue();
                if (zzad3 == null) {
                    zzad2 = null;
                } else {
                    zzad2 = zzad3.zzb(((zzahw) zzk.second).zzb);
                }
                zzahc2.zza[i14] = (zzahw) zzk.second;
            } else {
                zzad2 = zzad3;
            }
            zzfb2.zzG(zzc);
            i31 = i30;
        } else {
            zzad2 = zzad3;
        }
        if (i31 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i31 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i31 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i31 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i31 == 1685353320 || i31 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i31 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i31 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i31 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i31 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i31 != 1936684916) {
                if (i31 == 1953984371) {
                    str2 = "audio/raw";
                    i16 = 268435456;
                } else if (i31 != 1819304813) {
                    str2 = (i31 == 778924082 || i31 == 778924083) ? "audio/mpeg" : i31 == 1835557169 ? "audio/mha1" : i31 == 1835560241 ? "audio/mhm1" : i31 == 1634492771 ? "audio/alac" : i31 == 1634492791 ? "audio/g711-alaw" : i31 == 1970037111 ? "audio/g711-mlaw" : i31 == 1332770163 ? "audio/opus" : i31 == 1716281667 ? "audio/flac" : i31 == 1835823201 ? "audio/true-hd" : null;
                } else if (i16 != -1) {
                    str2 = "audio/raw";
                }
            }
            str2 = "audio/raw";
            i16 = 2;
        }
        String str6 = null;
        zzaha zzaha = null;
        List list = null;
        while (zzc - i25 < i26) {
            zzfb2.zzG(zzc);
            int zzf = zzfb.zzf();
            String str7 = "childAtomSize must be positive";
            zzabq.zzb(zzf > 0, str7);
            int zzf2 = zzfb.zzf();
            int i32 = i16;
            if (zzf2 == 1835557187) {
                int i33 = zzf - 13;
                byte[] bArr = new byte[i33];
                zzfb2.zzG(zzc + 13);
                zzfb2.zzC(bArr, 0, i33);
                list = zzfvs.zzm(bArr);
                i20 = i18;
            } else {
                if (zzf2 == 1702061171) {
                    str3 = str6;
                    i23 = zzc;
                    i22 = -1;
                } else if (!z10 || zzf2 != 2002876005) {
                    str3 = str6;
                    if (zzf2 == 1684103987) {
                        zzfb2.zzG(zzc + 8);
                        zzahc2.zzb = zzaan.zzc(zzfb2, Integer.toString(i13), str5, zzad2);
                    } else if (zzf2 == 1684366131) {
                        zzfb2.zzG(zzc + 8);
                        zzahc2.zzb = zzaan.zzd(zzfb2, Integer.toString(i13), str5, zzad2);
                    } else if (zzf2 == 1684103988) {
                        zzfb2.zzG(zzc + 8);
                        String num = Integer.toString(i13);
                        int i34 = zzaaq.zza;
                        zzfb2.zzH(1);
                        zzak zzak = new zzak();
                        zzak.zzJ(num);
                        zzak.zzU("audio/ac4");
                        zzak.zzy(2);
                        zzak.zzV(1 != ((zzfb.zzl() & 32) >> 5) ? 44100 : 48000);
                        zzak.zzD(zzad2);
                        zzak.zzM(str5);
                        zzahc2.zzb = zzak.zzac();
                    } else if (zzf2 == 1684892784) {
                        if (i18 > 0) {
                            i19 = i18;
                            i20 = i19;
                            str6 = str3;
                            i17 = 2;
                            zzc += zzf;
                            zzfb2 = zzfb;
                            i25 = i11;
                            i26 = i12;
                            i16 = i32;
                            i18 = i20;
                        } else {
                            throw zzcc.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + i18, (Throwable) null);
                        }
                    } else if (zzf2 == 1684305011 || zzf2 == 1969517683) {
                        zzak zzak2 = new zzak();
                        zzak2.zzI(i27);
                        zzak2.zzU(str2);
                        zzak2.zzy(i17);
                        zzak2.zzV(i19);
                        zzak2.zzD(zzad2);
                        zzak2.zzM(str5);
                        zzahc2.zzb = zzak2.zzac();
                        i21 = i18;
                        str6 = str3;
                        zzc += zzf;
                        zzfb2 = zzfb;
                        i25 = i11;
                        i26 = i12;
                        i16 = i32;
                        i18 = i20;
                    } else if (zzf2 == 1682927731) {
                        int i35 = zzf - 8;
                        byte[] bArr2 = zza;
                        byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length + i35);
                        zzfb2.zzG(zzc + 8);
                        zzfb2.zzC(copyOf, bArr2.length, i35);
                        list = zzaci.zze(copyOf);
                        i20 = i18;
                        str6 = str3;
                    } else {
                        if (zzf2 == 1684425825) {
                            int i36 = zzf - 12;
                            byte[] bArr3 = new byte[(i36 + 4)];
                            bArr3[0] = 102;
                            bArr3[1] = 76;
                            bArr3[2] = 97;
                            bArr3[3] = 67;
                            zzfb2.zzG(zzc + 12);
                            zzfb2.zzC(bArr3, 4, i36);
                            zzm = zzfvs.zzm(bArr3);
                        } else {
                            if (zzf2 == 1634492771) {
                                int i37 = zzf - 12;
                                byte[] bArr4 = new byte[i37];
                                zzfb2.zzG(zzc + 12);
                                zzfb2.zzC(bArr4, 0, i37);
                                int i38 = zzdz.zza;
                                zzfb zzfb3 = new zzfb(bArr4);
                                zzfb3.zzG(9);
                                int zzl = zzfb3.zzl();
                                zzfb3.zzG(20);
                                Pair create = Pair.create(Integer.valueOf(zzfb3.zzo()), Integer.valueOf(zzl));
                                i19 = ((Integer) create.first).intValue();
                                int intValue = ((Integer) create.second).intValue();
                                zzm = zzfvs.zzm(bArr4);
                                i17 = intValue;
                            }
                            i21 = i18;
                            str6 = str3;
                            zzc += zzf;
                            zzfb2 = zzfb;
                            i25 = i11;
                            i26 = i12;
                            i16 = i32;
                            i18 = i20;
                        }
                        i20 = i18;
                        str6 = str3;
                        zzc += zzf;
                        zzfb2 = zzfb;
                        i25 = i11;
                        i26 = i12;
                        i16 = i32;
                        i18 = i20;
                    }
                    i21 = i18;
                    str6 = str3;
                    zzc += zzf;
                    zzfb2 = zzfb;
                    i25 = i11;
                    i26 = i12;
                    i16 = i32;
                    i18 = i20;
                } else {
                    int zzc2 = zzfb.zzc();
                    if (zzc2 >= zzc) {
                        i24 = zzc2;
                        str4 = null;
                        z11 = true;
                    } else {
                        i24 = zzc2;
                        str4 = null;
                        z11 = false;
                    }
                    zzabq.zzb(z11, str4);
                    i23 = i24;
                    while (true) {
                        if (i23 - zzc >= zzf) {
                            str3 = str6;
                            i23 = -1;
                            break;
                        }
                        zzfb2.zzG(i23);
                        int zzf3 = zzfb.zzf();
                        if (zzf3 > 0) {
                            str3 = str6;
                            z12 = true;
                        } else {
                            str3 = str6;
                            z12 = false;
                        }
                        zzabq.zzb(z12, str7);
                        String str8 = str7;
                        if (zzfb.zzf() == 1702061171) {
                            break;
                        }
                        i23 += zzf3;
                        str6 = str3;
                        str7 = str8;
                    }
                    i22 = -1;
                }
                if (i23 != i22) {
                    zzaha = zzm(zzfb2, i23);
                    String zzc3 = zzaha.zza;
                    byte[] zzd = zzaha.zzb;
                    if (zzd == null) {
                        i21 = i18;
                    } else if ("audio/vorbis".equals(zzc3)) {
                        zzfb zzfb4 = new zzfb(zzd);
                        zzfb4.zzH(1);
                        int i39 = 0;
                        while (zzfb4.zza() > 0 && zzfb4.zze() == 255) {
                            zzfb4.zzH(1);
                            i39 += 255;
                            zzfb zzfb5 = zzfb;
                        }
                        int zzl2 = i39 + zzfb4.zzl();
                        int i40 = 0;
                        while (true) {
                            i21 = i18;
                            if (zzfb4.zza() <= 0 || zzfb4.zze() != 255) {
                                int zzl3 = i40 + zzfb4.zzl();
                                byte[] bArr5 = new byte[zzl2];
                                int zzc4 = zzfb4.zzc();
                                System.arraycopy(zzd, zzc4, bArr5, 0, zzl2);
                                int i41 = zzc4 + zzl2 + zzl3;
                                int length = zzd.length - i41;
                                byte[] bArr6 = new byte[length];
                                System.arraycopy(zzd, i41, bArr6, 0, length);
                                list = zzfvs.zzn(bArr5, bArr6);
                            } else {
                                zzfb4.zzH(1);
                                i40 += 255;
                                i18 = i21;
                            }
                        }
                        int zzl32 = i40 + zzfb4.zzl();
                        byte[] bArr52 = new byte[zzl2];
                        int zzc42 = zzfb4.zzc();
                        System.arraycopy(zzd, zzc42, bArr52, 0, zzl2);
                        int i412 = zzc42 + zzl2 + zzl32;
                        int length2 = zzd.length - i412;
                        byte[] bArr62 = new byte[length2];
                        System.arraycopy(zzd, i412, bArr62, 0, length2);
                        list = zzfvs.zzn(bArr52, bArr62);
                    } else {
                        i20 = i18;
                        if ("audio/mp4a-latm".equals(zzc3)) {
                            zzaaj zza2 = zzaak.zza(zzd);
                            i19 = zza2.zza;
                            i17 = zza2.zzb;
                            str6 = zza2.zzc;
                        } else {
                            str6 = str3;
                        }
                        list = zzfvs.zzm(zzd);
                        str2 = zzc3;
                        zzc += zzf;
                        zzfb2 = zzfb;
                        i25 = i11;
                        i26 = i12;
                        i16 = i32;
                        i18 = i20;
                    }
                    str2 = zzc3;
                    str6 = str3;
                    zzc += zzf;
                    zzfb2 = zzfb;
                    i25 = i11;
                    i26 = i12;
                    i16 = i32;
                    i18 = i20;
                }
                i21 = i18;
                str6 = str3;
                zzc += zzf;
                zzfb2 = zzfb;
                i25 = i11;
                i26 = i12;
                i16 = i32;
                i18 = i20;
            }
            zzc += zzf;
            zzfb2 = zzfb;
            i25 = i11;
            i26 = i12;
            i16 = i32;
            i18 = i20;
        }
        int i42 = i16;
        String str9 = str6;
        if (zzahc2.zzb == null && str2 != null) {
            zzak zzak3 = new zzak();
            zzak3.zzI(i27);
            zzak3.zzU(str2);
            zzak3.zzz(str9);
            zzak3.zzy(i17);
            zzak3.zzV(i19);
            zzak3.zzP(i42);
            zzak3.zzK(list);
            zzak3.zzD(zzad2);
            zzak3.zzM(str5);
            if (zzaha != null) {
                zzak3.zzx(zzfya.zzc(zzaha.zzc));
                zzak3.zzQ(zzfya.zzc(zzaha.zzd));
            }
            zzahc2.zzb = zzak3.zzac();
        }
    }

    private static boolean zzp(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length;
        int i10 = length - 1;
        int max = Math.max(0, Math.min(4, i10));
        int max2 = Math.max(0, Math.min(length - 4, i10));
        if (jArr[0] > j11 || j11 >= jArr[max] || jArr[max2] >= j12 || j12 > j10) {
            return false;
        }
        return true;
    }
}
