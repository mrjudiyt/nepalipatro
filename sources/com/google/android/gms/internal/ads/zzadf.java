package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzadf implements zzabm {
    private final zzfb zza = new zzfb(12);
    private final zzade zzb = new zzade((zzadd) null);
    private int zzc;
    private zzabp zzd = new zzabk();
    private zzadg zze;
    private long zzf = -9223372036854775807L;
    /* access modifiers changed from: private */
    public zzadi[] zzg = new zzadi[0];
    private long zzh;
    private zzadi zzi;
    private int zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private int zzm;
    private boolean zzn;

    private final zzadi zzf(int i10) {
        for (zzadi zzadi : this.zzg) {
            if (zzadi.zzg(i10)) {
                return zzadi;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r27, com.google.android.gms.internal.ads.zzacj r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            long r2 = r0.zzh
            r4 = -1
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x002e
            long r8 = r27.zzf()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0028
            r10 = 262144(0x40000, double:1.295163E-318)
            long r10 = r10 + r8
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            long r2 = r2 - r8
            r8 = r1
            com.google.android.gms.internal.ads.zzabc r8 = (com.google.android.gms.internal.ads.zzabc) r8
            int r3 = (int) r2
            r8.zzo(r3, r7)
            goto L_0x002e
        L_0x0028:
            r8 = r28
            r8.zza = r2
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r0.zzh = r4
            if (r2 == 0) goto L_0x0034
            return r6
        L_0x0034:
            int r2 = r0.zzc
            r3 = 12
            r8 = 0
            if (r2 == 0) goto L_0x03ae
            r9 = 1819436136(0x6c726468, float:1.1721368E27)
            r10 = 1414744396(0x5453494c, float:3.62987127E12)
            r11 = 2
            if (r2 == r6) goto L_0x034f
            r12 = 3
            if (r2 == r11) goto L_0x022c
            r9 = 6
            r11 = 1769369453(0x69766f6d, float:1.8620122E25)
            r13 = 4
            r16 = 8
            r14 = 16
            if (r2 == r12) goto L_0x0197
            r4 = 5
            r5 = 8
            if (r2 == r13) goto L_0x0169
            if (r2 == r4) goto L_0x00e7
            long r12 = r27.zzf()
            long r14 = r0.zzl
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0066
            r7 = -1
            goto L_0x00e6
        L_0x0066:
            com.google.android.gms.internal.ads.zzadi r2 = r0.zzi
            if (r2 == 0) goto L_0x0075
            boolean r1 = r2.zzh(r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x00e6
        L_0x0072:
            r0.zzi = r8
            return r7
        L_0x0075:
            long r8 = r27.zzf()
            r12 = 1
            long r8 = r8 & r12
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0086
            r2 = r1
            com.google.android.gms.internal.ads.zzabc r2 = (com.google.android.gms.internal.ads.zzabc) r2
            r2.zzo(r6, r7)
        L_0x0086:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            byte[] r2 = r2.zzI()
            r4 = r1
            com.google.android.gms.internal.ads.zzabc r4 = (com.google.android.gms.internal.ads.zzabc) r4
            r4.zzm(r2, r7, r3, r7)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            r2.zzG(r7)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            int r2 = r2.zzh()
            if (r2 != r10) goto L_0x00b6
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            r2.zzG(r5)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            int r2 = r2.zzh()
            if (r2 != r11) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r3 = 8
        L_0x00af:
            r4.zzo(r3, r7)
            r27.zzj()
            goto L_0x00e6
        L_0x00b6:
            com.google.android.gms.internal.ads.zzfb r3 = r0.zza
            int r3 = r3.zzh()
            r6 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r2 != r6) goto L_0x00cc
            long r2 = (long) r3
            long r4 = r27.zzf()
            long r4 = r4 + r2
            long r4 = r4 + r16
            r0.zzh = r4
            goto L_0x00e6
        L_0x00cc:
            r4.zzo(r5, r7)
            r27.zzj()
            com.google.android.gms.internal.ads.zzadi r2 = r0.zzf(r2)
            if (r2 != 0) goto L_0x00e1
            long r2 = (long) r3
            long r4 = r27.zzf()
            long r4 = r4 + r2
            r0.zzh = r4
            goto L_0x00e6
        L_0x00e1:
            r2.zze(r3)
            r0.zzi = r2
        L_0x00e6:
            return r7
        L_0x00e7:
            com.google.android.gms.internal.ads.zzfb r2 = new com.google.android.gms.internal.ads.zzfb
            int r3 = r0.zzm
            r2.<init>((int) r3)
            byte[] r3 = r2.zzI()
            int r4 = r0.zzm
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r1.zzn(r3, r7, r4, r7)
            int r1 = r2.zza()
            if (r1 >= r14) goto L_0x0102
            r18 = 0
            goto L_0x011e
        L_0x0102:
            int r1 = r2.zzc()
            r2.zzH(r5)
            int r3 = r2.zzh()
            long r3 = (long) r3
            long r10 = r0.zzk
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0117
            r18 = 0
            goto L_0x011b
        L_0x0117:
            long r10 = r10 + r16
            r18 = r10
        L_0x011b:
            r2.zzG(r1)
        L_0x011e:
            int r1 = r2.zza()
            if (r1 < r14) goto L_0x0146
            int r1 = r2.zzh()
            int r3 = r2.zzh()
            int r4 = r2.zzh()
            long r4 = (long) r4
            long r4 = r4 + r18
            r2.zzh()
            com.google.android.gms.internal.ads.zzadi r1 = r0.zzf(r1)
            if (r1 == 0) goto L_0x011e
            r3 = r3 & r14
            if (r3 != r14) goto L_0x0142
            r1.zzb(r4)
        L_0x0142:
            r1.zzd()
            goto L_0x011e
        L_0x0146:
            com.google.android.gms.internal.ads.zzadi[] r1 = r0.zzg
            int r2 = r1.length
            r3 = 0
        L_0x014a:
            if (r3 >= r2) goto L_0x0154
            r4 = r1[r3]
            r4.zzc()
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0154:
            r0.zzn = r6
            com.google.android.gms.internal.ads.zzabp r1 = r0.zzd
            com.google.android.gms.internal.ads.zzadc r2 = new com.google.android.gms.internal.ads.zzadc
            long r3 = r0.zzf
            r2.<init>(r0, r3)
            r1.zzO(r2)
            r0.zzc = r9
            long r1 = r0.zzk
            r0.zzh = r1
            return r7
        L_0x0169:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            byte[] r2 = r2.zzI()
            r3 = r1
            com.google.android.gms.internal.ads.zzabc r3 = (com.google.android.gms.internal.ads.zzabc) r3
            r3.zzn(r2, r7, r5, r7)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            r2.zzG(r7)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            int r3 = r2.zzh()
            int r2 = r2.zzh()
            r5 = 829973609(0x31786469, float:3.6145826E-9)
            if (r3 != r5) goto L_0x018e
            r0.zzc = r4
            r0.zzm = r2
            goto L_0x0196
        L_0x018e:
            long r3 = r27.zzf()
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.zzh = r3
        L_0x0196:
            return r7
        L_0x0197:
            long r13 = r0.zzk
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01a9
            long r4 = r27.zzf()
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x01a6
            goto L_0x01a9
        L_0x01a6:
            r0.zzh = r13
            return r7
        L_0x01a9:
            com.google.android.gms.internal.ads.zzfb r4 = r0.zza
            byte[] r4 = r4.zzI()
            r5 = r1
            com.google.android.gms.internal.ads.zzabc r5 = (com.google.android.gms.internal.ads.zzabc) r5
            r5.zzm(r4, r7, r3, r7)
            r27.zzj()
            com.google.android.gms.internal.ads.zzfb r4 = r0.zza
            r4.zzG(r7)
            com.google.android.gms.internal.ads.zzade r4 = r0.zzb
            com.google.android.gms.internal.ads.zzfb r5 = r0.zza
            r4.zza(r5)
            com.google.android.gms.internal.ads.zzfb r4 = r0.zza
            com.google.android.gms.internal.ads.zzade r5 = r0.zzb
            int r4 = r4.zzh()
            int r8 = r5.zza
            r12 = 1179011410(0x46464952, float:12690.33)
            if (r8 != r12) goto L_0x01d9
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r1.zzo(r3, r7)
            return r7
        L_0x01d9:
            if (r8 != r10) goto L_0x021f
            if (r4 == r11) goto L_0x01de
            goto L_0x021f
        L_0x01de:
            long r3 = r27.zzf()
            r0.zzk = r3
            int r5 = r5.zzb
            long r10 = (long) r5
            long r3 = r3 + r10
            long r3 = r3 + r16
            r0.zzl = r3
            boolean r5 = r0.zzn
            if (r5 != 0) goto L_0x0213
            com.google.android.gms.internal.ads.zzadg r5 = r0.zze
            java.util.Objects.requireNonNull(r5)
            int r5 = r5.zzb
            r2 = 16
            r5 = r5 & r2
            if (r5 == r2) goto L_0x020d
            com.google.android.gms.internal.ads.zzabp r2 = r0.zzd
            com.google.android.gms.internal.ads.zzacl r3 = new com.google.android.gms.internal.ads.zzacl
            long r4 = r0.zzf
            r10 = 0
            r3.<init>(r4, r10)
            r2.zzO(r3)
            r0.zzn = r6
            goto L_0x0213
        L_0x020d:
            r2 = 4
            r0.zzc = r2
            r0.zzh = r3
            return r7
        L_0x0213:
            long r1 = r27.zzf()
            r3 = 12
            long r1 = r1 + r3
            r0.zzh = r1
            r0.zzc = r9
            return r7
        L_0x021f:
            long r1 = r27.zzf()
            int r3 = r5.zzb
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r16
            r0.zzh = r1
            return r7
        L_0x022c:
            int r2 = r0.zzj
            int r2 = r2 + -4
            com.google.android.gms.internal.ads.zzfb r3 = new com.google.android.gms.internal.ads.zzfb
            r3.<init>((int) r2)
            byte[] r4 = r3.zzI()
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r1.zzn(r4, r7, r2, r7)
            com.google.android.gms.internal.ads.zzadj r1 = com.google.android.gms.internal.ads.zzadj.zzc(r9, r3)
            int r2 = r1.zza()
            if (r2 != r9) goto L_0x0334
            java.lang.Class<com.google.android.gms.internal.ads.zzadg> r2 = com.google.android.gms.internal.ads.zzadg.class
            com.google.android.gms.internal.ads.zzadb r2 = r1.zzb(r2)
            com.google.android.gms.internal.ads.zzadg r2 = (com.google.android.gms.internal.ads.zzadg) r2
            if (r2 == 0) goto L_0x032c
            r0.zze = r2
            int r3 = r2.zza
            int r2 = r2.zzc
            long r4 = (long) r2
            long r2 = (long) r3
            long r4 = r4 * r2
            r0.zzf = r4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.zzfvs r1 = r1.zza
            int r3 = r1.size()
            r4 = 0
            r14 = 0
        L_0x026b:
            if (r4 >= r3) goto L_0x0318
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.ads.zzadb r5 = (com.google.android.gms.internal.ads.zzadb) r5
            int r9 = r5.zza()
            r10 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r9 != r10) goto L_0x0310
            com.google.android.gms.internal.ads.zzadj r5 = (com.google.android.gms.internal.ads.zzadj) r5
            int r9 = r14 + 1
            java.lang.Class<com.google.android.gms.internal.ads.zzadh> r10 = com.google.android.gms.internal.ads.zzadh.class
            com.google.android.gms.internal.ads.zzadb r10 = r5.zzb(r10)
            com.google.android.gms.internal.ads.zzadh r10 = (com.google.android.gms.internal.ads.zzadh) r10
            java.lang.Class<com.google.android.gms.internal.ads.zzadk> r13 = com.google.android.gms.internal.ads.zzadk.class
            com.google.android.gms.internal.ads.zzadb r13 = r5.zzb(r13)
            com.google.android.gms.internal.ads.zzadk r13 = (com.google.android.gms.internal.ads.zzadk) r13
            java.lang.String r15 = "AviExtractor"
            if (r10 != 0) goto L_0x029b
            java.lang.String r5 = "Missing Stream Header"
            com.google.android.gms.internal.ads.zzer.zzf(r15, r5)
            goto L_0x030a
        L_0x029b:
            if (r13 != 0) goto L_0x02a3
            java.lang.String r5 = "Missing Stream Format"
            com.google.android.gms.internal.ads.zzer.zzf(r15, r5)
            goto L_0x030a
        L_0x02a3:
            int r15 = r10.zzd
            int r8 = r10.zzb
            int r12 = r10.zzc
            com.google.android.gms.internal.ads.zzam r13 = r13.zza
            long r7 = (long) r8
            r16 = r12
            long r11 = (long) r15
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r22 = r7 * r17
            r7 = r16
            long r7 = (long) r7
            r20 = r11
            r24 = r7
            long r7 = com.google.android.gms.internal.ads.zzfk.zzr(r20, r22, r24)
            com.google.android.gms.internal.ads.zzak r11 = r13.zzb()
            r11.zzI(r14)
            int r12 = r10.zze
            if (r12 == 0) goto L_0x02cd
            r11.zzN(r12)
        L_0x02cd:
            java.lang.Class<com.google.android.gms.internal.ads.zzadl> r12 = com.google.android.gms.internal.ads.zzadl.class
            com.google.android.gms.internal.ads.zzadb r5 = r5.zzb(r12)
            com.google.android.gms.internal.ads.zzadl r5 = (com.google.android.gms.internal.ads.zzadl) r5
            if (r5 == 0) goto L_0x02dc
            java.lang.String r5 = r5.zza
            r11.zzL(r5)
        L_0x02dc:
            java.lang.String r5 = r13.zzm
            int r5 = com.google.android.gms.internal.ads.zzcb.zzb(r5)
            if (r5 == r6) goto L_0x02eb
            r12 = 2
            if (r5 != r12) goto L_0x02e9
            r15 = 2
            goto L_0x02ec
        L_0x02e9:
            r8 = 0
            goto L_0x030a
        L_0x02eb:
            r15 = r5
        L_0x02ec:
            com.google.android.gms.internal.ads.zzabp r5 = r0.zzd
            com.google.android.gms.internal.ads.zzacs r5 = r5.zzw(r14, r15)
            com.google.android.gms.internal.ads.zzam r11 = r11.zzac()
            r5.zzl(r11)
            int r10 = r10.zzd
            com.google.android.gms.internal.ads.zzadi r11 = new com.google.android.gms.internal.ads.zzadi
            r13 = r11
            r16 = r7
            r18 = r10
            r19 = r5
            r13.<init>(r14, r15, r16, r18, r19)
            r0.zzf = r7
            r8 = r11
        L_0x030a:
            if (r8 == 0) goto L_0x030f
            r2.add(r8)
        L_0x030f:
            r14 = r9
        L_0x0310:
            int r4 = r4 + 1
            r7 = 0
            r8 = 0
            r11 = 2
            r12 = 3
            goto L_0x026b
        L_0x0318:
            r4 = 0
            com.google.android.gms.internal.ads.zzadi[] r1 = new com.google.android.gms.internal.ads.zzadi[r4]
            java.lang.Object[] r1 = r2.toArray(r1)
            com.google.android.gms.internal.ads.zzadi[] r1 = (com.google.android.gms.internal.ads.zzadi[]) r1
            r0.zzg = r1
            com.google.android.gms.internal.ads.zzabp r1 = r0.zzd
            r1.zzD()
            r1 = 3
            r0.zzc = r1
            return r4
        L_0x032c:
            java.lang.String r1 = "AviHeader not found"
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x0334:
            r2 = r8
            int r1 = r1.zza()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected header list type "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x034f:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            byte[] r2 = r2.zzI()
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r4 = 0
            r1.zzn(r2, r4, r3, r4)
            com.google.android.gms.internal.ads.zzfb r1 = r0.zza
            r1.zzG(r4)
            com.google.android.gms.internal.ads.zzade r1 = r0.zzb
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            r1.zza(r2)
            int r3 = r1.zza
            if (r3 != r10) goto L_0x0397
            int r2 = r2.zzh()
            r1.zzc = r2
            com.google.android.gms.internal.ads.zzade r1 = r0.zzb
            int r2 = r1.zzc
            if (r2 != r9) goto L_0x0380
            int r1 = r1.zzb
            r0.zzj = r1
            r1 = 2
            r0.zzc = r1
            r1 = 0
            return r1
        L_0x0380:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "hdrl expected, found: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x0397:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "LIST expected, found: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x03ae:
            r2 = r8
            boolean r4 = r26.zze(r27)
            if (r4 == 0) goto L_0x03be
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r2 = 0
            r1.zzo(r3, r2)
            r0.zzc = r6
            return r2
        L_0x03be:
            java.lang.String r1 = "AVI Header List not found"
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadf.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    public final void zzc(zzabp zzabp) {
        this.zzc = 0;
        this.zzd = zzabp;
        this.zzh = -1;
    }

    public final void zzd(long j10, long j11) {
        int i10;
        this.zzh = -1;
        this.zzi = null;
        for (zzadi zzf2 : this.zzg) {
            zzf2.zzf(j10);
        }
        if (j10 != 0) {
            i10 = 6;
        } else if (this.zzg.length == 0) {
            this.zzc = 0;
            return;
        } else {
            i10 = 3;
        }
        this.zzc = i10;
    }

    public final boolean zze(zzabn zzabn) {
        ((zzabc) zzabn).zzm(this.zza.zzI(), 0, 12, false);
        this.zza.zzG(0);
        if (this.zza.zzh() != 1179011410) {
            return false;
        }
        this.zza.zzH(4);
        if (this.zza.zzh() == 541677121) {
            return true;
        }
        return false;
    }
}
