package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzahm implements zzabm {
    public static final zzabt zza = zzahi.zza;
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzam zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzabp zzD;
    private zzacs[] zzE;
    private zzacs[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzfb zzf;
    private final zzfb zzg;
    private final zzfb zzh;
    private final byte[] zzi;
    private final zzfb zzj;
    private final zzaek zzk;
    private final zzfb zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzfb zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzahl zzy;
    private int zzz;

    static {
        zzak zzak = new zzak();
        zzak.zzU("application/x-emsg");
        zzc = zzak.zzac();
    }

    public zzahm() {
        this(0, (zzfi) null);
    }

    private static int zza(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw zzcc.zza("Unexpected negative value: " + i10, (Throwable) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzad zzf(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00b9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzagx r5 = (com.google.android.gms.internal.ads.zzagx) r5
            int r6 = r5.zzd
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto L_0x00b5
            if (r4 != 0) goto L_0x001e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001e:
            com.google.android.gms.internal.ads.zzfb r5 = r5.zza
            byte[] r5 = r5.zzI()
            com.google.android.gms.internal.ads.zzfb r6 = new com.google.android.gms.internal.ads.zzfb
            r6.<init>((byte[]) r5)
            int r8 = r6.zzd()
            r9 = 32
            if (r8 >= r9) goto L_0x0033
        L_0x0031:
            r6 = r2
            goto L_0x0099
        L_0x0033:
            r6.zzG(r1)
            int r8 = r6.zzf()
            int r9 = r6.zza()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x0043
            goto L_0x0031
        L_0x0043:
            int r8 = r6.zzf()
            if (r8 == r7) goto L_0x004a
            goto L_0x0031
        L_0x004a:
            int r7 = r6.zzf()
            int r7 = com.google.android.gms.internal.ads.zzagy.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x006c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.google.android.gms.internal.ads.zzer.zzf(r7, r6)
            goto L_0x0031
        L_0x006c:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzs()
            long r12 = r6.zzs()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0084
            int r8 = r6.zzo()
            int r8 = r8 * 16
            r6.zzH(r8)
        L_0x0084:
            int r8 = r6.zzo()
            int r10 = r6.zza()
            if (r8 == r10) goto L_0x008f
            goto L_0x0031
        L_0x008f:
            byte[] r10 = new byte[r8]
            r6.zzC(r10, r1, r8)
            com.google.android.gms.internal.ads.zzahs r6 = new com.google.android.gms.internal.ads.zzahs
            r6.<init>(r9, r7, r10)
        L_0x0099:
            if (r6 != 0) goto L_0x009d
            r6 = r2
            goto L_0x00a1
        L_0x009d:
            java.util.UUID r6 = r6.zza
        L_0x00a1:
            if (r6 != 0) goto L_0x00ab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzer.zzf(r5, r6)
            goto L_0x00b5
        L_0x00ab:
            com.google.android.gms.internal.ads.zzac r7 = new com.google.android.gms.internal.ads.zzac
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        L_0x00b5:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b9:
            if (r4 != 0) goto L_0x00bc
            return r2
        L_0x00bc:
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>((java.util.List) r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzf(java.util.List):com.google.android.gms.internal.ads.zzad");
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzfb zzfb, int i10, zzahx zzahx) {
        zzfb.zzG(i10 + 8);
        int zzf2 = zzfb.zzf() & 16777215;
        if ((zzf2 & 1) == 0) {
            boolean z10 = (zzf2 & 2) != 0;
            int zzo2 = zzfb.zzo();
            if (zzo2 == 0) {
                Arrays.fill(zzahx.zzl, 0, zzahx.zze, false);
                return;
            }
            int i11 = zzahx.zze;
            if (zzo2 == i11) {
                Arrays.fill(zzahx.zzl, 0, zzo2, z10);
                zzahx.zza(zzfb.zza());
                zzfb zzfb2 = zzahx.zzn;
                zzfb.zzC(zzfb2.zzI(), 0, zzfb2.zzd());
                zzahx.zzn.zzG(0);
                zzahx.zzo = false;
                return;
            }
            throw zzcc.zza("Senc sample count " + zzo2 + " is different from fragment sample count" + i11, (Throwable) null);
        }
        throw zzcc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0315, code lost:
        if (com.google.android.gms.internal.ads.zzfk.zzr(r31 + r8[0], 1000000, r5.zzd) < r5.zze) goto L_0x032b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzi(long r46) {
        /*
            r45 = this;
            r0 = r45
        L_0x0002:
            java.util.ArrayDeque r1 = r0.zzm
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0703
            java.util.ArrayDeque r1 = r0.zzm
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzagw r1 = (com.google.android.gms.internal.ads.zzagw) r1
            long r1 = r1.zza
            int r3 = (r1 > r46 ? 1 : (r1 == r46 ? 0 : -1))
            if (r3 != 0) goto L_0x0703
            java.util.ArrayDeque r1 = r0.zzm
            java.lang.Object r1 = r1.pop()
            r2 = r1
            com.google.android.gms.internal.ads.zzagw r2 = (com.google.android.gms.internal.ads.zzagw) r2
            int r1 = r2.zzd
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            r7 = 8
            if (r1 != r3) goto L_0x013d
            java.util.List r1 = r2.zzb
            com.google.android.gms.internal.ads.zzad r1 = zzf(r1)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.android.gms.internal.ads.zzagw r3 = r2.zza(r3)
            java.util.Objects.requireNonNull(r3)
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.util.List r8 = r3.zzb
            int r8 = r8.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
        L_0x004d:
            if (r9 >= r8) goto L_0x00b8
            java.util.List r13 = r3.zzb
            java.lang.Object r13 = r13.get(r9)
            com.google.android.gms.internal.ads.zzagx r13 = (com.google.android.gms.internal.ads.zzagx) r13
            int r14 = r13.zzd
            r15 = 1953654136(0x74726578, float:7.6818474E31)
            if (r14 != r15) goto L_0x0096
            com.google.android.gms.internal.ads.zzfb r13 = r13.zza
            r13.zzG(r6)
            int r14 = r13.zzf()
            int r15 = r13.zzf()
            int r15 = r15 + -1
            int r10 = r13.zzf()
            int r6 = r13.zzf()
            int r13 = r13.zzf()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.google.android.gms.internal.ads.zzahh r11 = new com.google.android.gms.internal.ads.zzahh
            r11.<init>(r15, r10, r6, r13)
            android.util.Pair r6 = android.util.Pair.create(r14, r11)
            java.lang.Object r10 = r6.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r6 = r6.second
            com.google.android.gms.internal.ads.zzahh r6 = (com.google.android.gms.internal.ads.zzahh) r6
            r12.put(r10, r6)
            goto L_0x00b3
        L_0x0096:
            r6 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r14 != r6) goto L_0x00b3
            com.google.android.gms.internal.ads.zzfb r4 = r13.zza
            r4.zzG(r7)
            int r5 = r4.zzf()
            int r5 = com.google.android.gms.internal.ads.zzagy.zze(r5)
            if (r5 != 0) goto L_0x00af
            long r4 = r4.zzt()
            goto L_0x00b3
        L_0x00af:
            long r4 = r4.zzu()
        L_0x00b3:
            int r9 = r9 + 1
            r6 = 12
            goto L_0x004d
        L_0x00b8:
            com.google.android.gms.internal.ads.zzacc r3 = new com.google.android.gms.internal.ads.zzacc
            r3.<init>()
            r7 = 0
            r8 = 0
            com.google.android.gms.internal.ads.zzahj r9 = new com.google.android.gms.internal.ads.zzahj
            r9.<init>(r0)
            r6 = r1
            java.util.List r1 = com.google.android.gms.internal.ads.zzahg.zzd(r2, r3, r4, r6, r7, r8, r9)
            int r2 = r1.size()
            android.util.SparseArray r3 = r0.zze
            int r3 = r3.size()
            if (r3 != 0) goto L_0x010e
            r10 = 0
        L_0x00d6:
            if (r10 >= r2) goto L_0x0107
            java.lang.Object r3 = r1.get(r10)
            com.google.android.gms.internal.ads.zzahy r3 = (com.google.android.gms.internal.ads.zzahy) r3
            com.google.android.gms.internal.ads.zzahv r4 = r3.zza
            com.google.android.gms.internal.ads.zzahl r5 = new com.google.android.gms.internal.ads.zzahl
            com.google.android.gms.internal.ads.zzabp r6 = r0.zzD
            int r7 = r4.zzb
            com.google.android.gms.internal.ads.zzacs r6 = r6.zzw(r10, r7)
            int r7 = r4.zza
            com.google.android.gms.internal.ads.zzahh r7 = zzj(r12, r7)
            r5.<init>(r6, r3, r7)
            android.util.SparseArray r3 = r0.zze
            int r6 = r4.zza
            r3.put(r6, r5)
            long r5 = r0.zzw
            long r3 = r4.zze
            long r3 = java.lang.Math.max(r5, r3)
            r0.zzw = r3
            int r10 = r10 + 1
            goto L_0x00d6
        L_0x0107:
            com.google.android.gms.internal.ads.zzabp r1 = r0.zzD
            r1.zzD()
            goto L_0x0002
        L_0x010e:
            android.util.SparseArray r3 = r0.zze
            int r3 = r3.size()
            if (r3 != r2) goto L_0x0118
            r11 = 1
            goto L_0x0119
        L_0x0118:
            r11 = 0
        L_0x0119:
            com.google.android.gms.internal.ads.zzdx.zzf(r11)
            r10 = 0
        L_0x011d:
            if (r10 >= r2) goto L_0x0002
            java.lang.Object r3 = r1.get(r10)
            com.google.android.gms.internal.ads.zzahy r3 = (com.google.android.gms.internal.ads.zzahy) r3
            com.google.android.gms.internal.ads.zzahv r4 = r3.zza
            android.util.SparseArray r5 = r0.zze
            int r6 = r4.zza
            java.lang.Object r5 = r5.get(r6)
            com.google.android.gms.internal.ads.zzahl r5 = (com.google.android.gms.internal.ads.zzahl) r5
            int r4 = r4.zza
            com.google.android.gms.internal.ads.zzahh r4 = zzj(r12, r4)
            r5.zzh(r3, r4)
            int r10 = r10 + 1
            goto L_0x011d
        L_0x013d:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 != r3) goto L_0x06eb
            android.util.SparseArray r1 = r0.zze
            byte[] r3 = r0.zzi
            java.util.List r6 = r2.zzc
            int r6 = r6.size()
            r8 = 0
        L_0x014d:
            if (r8 >= r6) goto L_0x0656
            java.util.List r10 = r2.zzc
            java.lang.Object r10 = r10.get(r8)
            com.google.android.gms.internal.ads.zzagw r10 = (com.google.android.gms.internal.ads.zzagw) r10
            int r11 = r10.zzd
            r12 = 1953653094(0x74726166, float:7.6813435E31)
            if (r11 != r12) goto L_0x0637
            r11 = 1952868452(0x74666864, float:7.301914E31)
            com.google.android.gms.internal.ads.zzagx r11 = r10.zzb(r11)
            java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.ads.zzfb r11 = r11.zza
            r11.zzG(r7)
            int r12 = r11.zzf()
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r13
            int r14 = r11.zzf()
            java.lang.Object r14 = r1.get(r14)
            com.google.android.gms.internal.ads.zzahl r14 = (com.google.android.gms.internal.ads.zzahl) r14
            if (r14 != 0) goto L_0x0183
            r14 = 0
            goto L_0x01cc
        L_0x0183:
            r15 = r12 & 1
            if (r15 == 0) goto L_0x0191
            long r4 = r11.zzu()
            com.google.android.gms.internal.ads.zzahx r15 = r14.zzb
            r15.zzb = r4
            r15.zzc = r4
        L_0x0191:
            com.google.android.gms.internal.ads.zzahh r4 = r14.zze
            r5 = r12 & 2
            if (r5 == 0) goto L_0x019e
            int r5 = r11.zzf()
            int r5 = r5 + -1
            goto L_0x01a0
        L_0x019e:
            int r5 = r4.zza
        L_0x01a0:
            r15 = r12 & 8
            if (r15 == 0) goto L_0x01a9
            int r15 = r11.zzf()
            goto L_0x01ab
        L_0x01a9:
            int r15 = r4.zzb
        L_0x01ab:
            r16 = r12 & 16
            if (r16 == 0) goto L_0x01b6
            int r16 = r11.zzf()
            r9 = r16
            goto L_0x01b8
        L_0x01b6:
            int r9 = r4.zzc
        L_0x01b8:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x01c1
            int r4 = r11.zzf()
            goto L_0x01c3
        L_0x01c1:
            int r4 = r4.zzd
        L_0x01c3:
            com.google.android.gms.internal.ads.zzahx r11 = r14.zzb
            com.google.android.gms.internal.ads.zzahh r12 = new com.google.android.gms.internal.ads.zzahh
            r12.<init>(r5, r15, r9, r4)
            r11.zza = r12
        L_0x01cc:
            if (r14 != 0) goto L_0x01d0
            goto L_0x0637
        L_0x01d0:
            com.google.android.gms.internal.ads.zzahx r4 = r14.zzb
            long r11 = r4.zzp
            boolean r5 = r4.zzq
            r14.zzi()
            r9 = 1
            r14.zzl = true
            r15 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.android.gms.internal.ads.zzagx r15 = r10.zzb(r15)
            if (r15 == 0) goto L_0x0203
            com.google.android.gms.internal.ads.zzfb r5 = r15.zza
            r5.zzG(r7)
            int r11 = r5.zzf()
            int r11 = com.google.android.gms.internal.ads.zzagy.zze(r11)
            if (r11 != r9) goto L_0x01fa
            long r11 = r5.zzu()
            goto L_0x01fe
        L_0x01fa:
            long r11 = r5.zzt()
        L_0x01fe:
            r4.zzp = r11
            r4.zzq = r9
            goto L_0x0207
        L_0x0203:
            r4.zzp = r11
            r4.zzq = r5
        L_0x0207:
            java.util.List r5 = r10.zzb
            int r9 = r5.size()
            r11 = 0
            r12 = 0
            r15 = 0
        L_0x0210:
            r13 = 1953658222(0x7472756e, float:7.683823E31)
            if (r11 >= r9) goto L_0x023a
            java.lang.Object r18 = r5.get(r11)
            r7 = r18
            com.google.android.gms.internal.ads.zzagx r7 = (com.google.android.gms.internal.ads.zzagx) r7
            r18 = r1
            int r1 = r7.zzd
            if (r1 != r13) goto L_0x0233
            com.google.android.gms.internal.ads.zzfb r1 = r7.zza
            r7 = 12
            r1.zzG(r7)
            int r1 = r1.zzo()
            if (r1 <= 0) goto L_0x0233
            int r15 = r15 + r1
            int r12 = r12 + 1
        L_0x0233:
            int r11 = r11 + 1
            r1 = r18
            r7 = 8
            goto L_0x0210
        L_0x023a:
            r18 = r1
            r1 = 0
            r14.zzh = r1
            r14.zzg = r1
            r14.zzf = r1
            com.google.android.gms.internal.ads.zzahx r1 = r14.zzb
            r1.zzd = r12
            r1.zze = r15
            int[] r7 = r1.zzg
            int r7 = r7.length
            if (r7 >= r12) goto L_0x0256
            long[] r7 = new long[r12]
            r1.zzf = r7
            int[] r7 = new int[r12]
            r1.zzg = r7
        L_0x0256:
            int[] r7 = r1.zzh
            int r7 = r7.length
            if (r7 >= r15) goto L_0x026f
            int r15 = r15 * 125
            int r15 = r15 / 100
            int[] r7 = new int[r15]
            r1.zzh = r7
            long[] r7 = new long[r15]
            r1.zzi = r7
            boolean[] r7 = new boolean[r15]
            r1.zzj = r7
            boolean[] r7 = new boolean[r15]
            r1.zzl = r7
        L_0x026f:
            r1 = 0
            r7 = 0
            r11 = 0
        L_0x0272:
            r19 = 0
            if (r1 >= r9) goto L_0x040a
            java.lang.Object r15 = r5.get(r1)
            com.google.android.gms.internal.ads.zzagx r15 = (com.google.android.gms.internal.ads.zzagx) r15
            int r12 = r15.zzd
            if (r12 != r13) goto L_0x03d8
            int r12 = r7 + 1
            com.google.android.gms.internal.ads.zzfb r15 = r15.zza
            r13 = 8
            r15.zzG(r13)
            int r13 = r15.zzf()
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r17
            r21 = r5
            com.google.android.gms.internal.ads.zzahy r5 = r14.zzd
            com.google.android.gms.internal.ads.zzahv r5 = r5.zza
            r22 = r6
            com.google.android.gms.internal.ads.zzahx r6 = r14.zzb
            r23 = r9
            com.google.android.gms.internal.ads.zzahh r9 = r6.zza
            int r24 = com.google.android.gms.internal.ads.zzfk.zza
            r24 = r12
            int[] r12 = r6.zzg
            int r25 = r15.zzo()
            r12[r7] = r25
            long[] r12 = r6.zzf
            r25 = r2
            r26 = r3
            long r2 = r6.zzb
            r12[r7] = r2
            r27 = r13 & 1
            if (r27 == 0) goto L_0x02c5
            int r0 = r15.zzf()
            r27 = r1
            long r0 = (long) r0
            long r2 = r2 + r0
            r12[r7] = r2
            goto L_0x02c7
        L_0x02c5:
            r27 = r1
        L_0x02c7:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x02cd
            r0 = 1
            goto L_0x02ce
        L_0x02cd:
            r0 = 0
        L_0x02ce:
            int r1 = r9.zzd
            if (r0 == 0) goto L_0x02d6
            int r1 = r15.zzf()
        L_0x02d6:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r3 = r13 & 512(0x200, float:7.175E-43)
            r12 = r13 & 1024(0x400, float:1.435E-42)
            r13 = r13 & 2048(0x800, float:2.87E-42)
            r28 = r1
            long[] r1 = r5.zzh
            if (r1 == 0) goto L_0x0323
            r29 = r8
            int r8 = r1.length
            r30 = r10
            r10 = 1
            if (r8 != r10) goto L_0x031e
            long[] r8 = r5.zzi
            if (r8 != 0) goto L_0x02f1
            goto L_0x031e
        L_0x02f1:
            r10 = 0
            r31 = r1[r10]
            int r1 = (r31 > r19 ? 1 : (r31 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x02fd
            r10 = r0
            r8 = r13
            r31 = r14
            goto L_0x0318
        L_0x02fd:
            r33 = r8[r10]
            long r35 = r31 + r33
            r37 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r13
            r1 = r14
            long r13 = r5.zzd
            r39 = r13
            long r13 = com.google.android.gms.internal.ads.zzfk.zzr(r35, r37, r39)
            r10 = r0
            r31 = r1
            long r0 = r5.zze
            int r32 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r32 >= 0) goto L_0x0318
            goto L_0x032b
        L_0x0318:
            long[] r0 = r5.zzi
            r1 = 0
            r19 = r0[r1]
            goto L_0x032b
        L_0x031e:
            r10 = r0
            r8 = r13
            r31 = r14
            goto L_0x032b
        L_0x0323:
            r29 = r8
            r30 = r10
            r8 = r13
            r31 = r14
            r10 = r0
        L_0x032b:
            int[] r0 = r6.zzh
            long[] r1 = r6.zzi
            boolean[] r13 = r6.zzj
            int[] r14 = r6.zzg
            r7 = r14[r7]
            int r7 = r7 + r11
            r14 = r4
            long r4 = r5.zzc
            r38 = r13
            r39 = r14
            long r13 = r6.zzp
        L_0x033f:
            if (r11 >= r7) goto L_0x03cf
            if (r2 == 0) goto L_0x034c
            int r32 = r15.zzf()
            r40 = r2
            r2 = r32
            goto L_0x0350
        L_0x034c:
            r40 = r2
            int r2 = r9.zzb
        L_0x0350:
            zza(r2)
            if (r3 == 0) goto L_0x035e
            int r32 = r15.zzf()
            r41 = r3
            r3 = r32
            goto L_0x0362
        L_0x035e:
            r41 = r3
            int r3 = r9.zzc
        L_0x0362:
            zza(r3)
            if (r12 == 0) goto L_0x0370
            int r32 = r15.zzf()
            r42 = r7
            r7 = r32
            goto L_0x037d
        L_0x0370:
            r42 = r7
            if (r11 != 0) goto L_0x037b
            if (r10 == 0) goto L_0x037a
            r7 = r28
            r11 = 0
            goto L_0x037d
        L_0x037a:
            r11 = 0
        L_0x037b:
            int r7 = r9.zzd
        L_0x037d:
            if (r8 == 0) goto L_0x038a
            int r32 = r15.zzf()
            r43 = r8
            r44 = r9
            r8 = r32
            goto L_0x038f
        L_0x038a:
            r43 = r8
            r44 = r9
            r8 = 0
        L_0x038f:
            long r8 = (long) r8
            long r8 = r8 + r13
            long r32 = r8 - r19
            r34 = 1000000(0xf4240, double:4.940656E-318)
            r36 = r4
            long r8 = com.google.android.gms.internal.ads.zzfk.zzr(r32, r34, r36)
            r1[r11] = r8
            r32 = r4
            boolean r4 = r6.zzq
            if (r4 != 0) goto L_0x03ad
            r4 = r31
            com.google.android.gms.internal.ads.zzahy r5 = r4.zzd
            long r4 = r5.zzh
            long r8 = r8 + r4
            r1[r11] = r8
        L_0x03ad:
            r0[r11] = r3
            r3 = 16
            int r4 = r7 >> 16
            r3 = 1
            r4 = r4 & r3
            r4 = r4 ^ r3
            if (r3 == r4) goto L_0x03ba
            r3 = 0
            goto L_0x03bb
        L_0x03ba:
            r3 = 1
        L_0x03bb:
            r38[r11] = r3
            long r2 = (long) r2
            long r13 = r13 + r2
            int r11 = r11 + 1
            r4 = r32
            r2 = r40
            r3 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            goto L_0x033f
        L_0x03cf:
            r42 = r7
            r6.zzp = r13
            r7 = r24
            r11 = r42
            goto L_0x03ef
        L_0x03d8:
            r27 = r1
            r25 = r2
            r26 = r3
            r39 = r4
            r21 = r5
            r22 = r6
            r29 = r8
            r23 = r9
            r30 = r10
            r31 = r14
            r17 = 16777215(0xffffff, float:2.3509886E-38)
        L_0x03ef:
            int r1 = r27 + 1
            r0 = r45
            r5 = r21
            r6 = r22
            r9 = r23
            r2 = r25
            r3 = r26
            r8 = r29
            r10 = r30
            r14 = r31
            r4 = r39
            r13 = 1953658222(0x7472756e, float:7.683823E31)
            goto L_0x0272
        L_0x040a:
            r25 = r2
            r26 = r3
            r39 = r4
            r22 = r6
            r29 = r8
            r30 = r10
            com.google.android.gms.internal.ads.zzahy r0 = r14.zzd
            com.google.android.gms.internal.ads.zzahv r0 = r0.zza
            r1 = r39
            com.google.android.gms.internal.ads.zzahh r2 = r1.zza
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.zza
            com.google.android.gms.internal.ads.zzahw r0 = r0.zza(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            r10 = r30
            com.google.android.gms.internal.ads.zzagx r2 = r10.zzb(r2)
            if (r2 == 0) goto L_0x04a7
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzfb r2 = r2.zza
            r3 = 8
            r2.zzG(r3)
            int r4 = r2.zzf()
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0447
            r2.zzH(r3)
        L_0x0447:
            int r3 = r2.zzl()
            int r4 = r2.zzo()
            int r5 = r1.zze
            if (r4 > r5) goto L_0x0488
            int r5 = r0.zzd
            if (r3 != 0) goto L_0x046e
            boolean[] r3 = r1.zzl
            r6 = 0
            r7 = 0
        L_0x045b:
            if (r6 >= r4) goto L_0x046c
            int r8 = r2.zzl()
            int r7 = r7 + r8
            if (r8 <= r5) goto L_0x0466
            r8 = 1
            goto L_0x0467
        L_0x0466:
            r8 = 0
        L_0x0467:
            r3[r6] = r8
            int r6 = r6 + 1
            goto L_0x045b
        L_0x046c:
            r5 = 0
            goto L_0x047b
        L_0x046e:
            if (r3 <= r5) goto L_0x0472
            r2 = 1
            goto L_0x0473
        L_0x0472:
            r2 = 0
        L_0x0473:
            int r7 = r3 * r4
            boolean[] r3 = r1.zzl
            r5 = 0
            java.util.Arrays.fill(r3, r5, r4, r2)
        L_0x047b:
            boolean[] r2 = r1.zzl
            int r3 = r1.zze
            java.util.Arrays.fill(r2, r4, r3, r5)
            if (r7 <= 0) goto L_0x04a7
            r1.zza(r7)
            goto L_0x04a7
        L_0x0488:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Saiz sample count "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " is greater than fragment sample count"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.zzcc r0 = com.google.android.gms.internal.ads.zzcc.zza(r0, r1)
            throw r0
        L_0x04a7:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.android.gms.internal.ads.zzagx r2 = r10.zzb(r2)
            if (r2 == 0) goto L_0x04f5
            com.google.android.gms.internal.ads.zzfb r2 = r2.zza
            r3 = 8
            r2.zzG(r3)
            int r4 = r2.zzf()
            r5 = r4 & 1
            r6 = 1
            if (r5 != r6) goto L_0x04c3
            r2.zzH(r3)
        L_0x04c3:
            int r3 = r2.zzo()
            if (r3 != r6) goto L_0x04de
            int r3 = com.google.android.gms.internal.ads.zzagy.zze(r4)
            long r4 = r1.zzc
            if (r3 != 0) goto L_0x04d6
            long r2 = r2.zzt()
            goto L_0x04da
        L_0x04d6:
            long r2 = r2.zzu()
        L_0x04da:
            long r4 = r4 + r2
            r1.zzc = r4
            goto L_0x04f5
        L_0x04de:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r0 = com.google.android.gms.internal.ads.zzcc.zza(r0, r2)
            throw r0
        L_0x04f5:
            r2 = 0
            r3 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.android.gms.internal.ads.zzagx r3 = r10.zzb(r3)
            if (r3 == 0) goto L_0x0505
            com.google.android.gms.internal.ads.zzfb r3 = r3.zza
            r4 = 0
            zzh(r3, r4, r1)
        L_0x0505:
            if (r0 == 0) goto L_0x050c
            java.lang.String r0 = r0.zzb
            r32 = r0
            goto L_0x050e
        L_0x050c:
            r32 = r2
        L_0x050e:
            r0 = r2
            r3 = r0
            r4 = 0
        L_0x0511:
            java.util.List r5 = r10.zzb
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x054e
            java.util.List r5 = r10.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.zzagx r5 = (com.google.android.gms.internal.ads.zzagx) r5
            com.google.android.gms.internal.ads.zzfb r6 = r5.zza
            int r5 = r5.zzd
            r7 = 1935828848(0x73626770, float:1.7937577E31)
            r8 = 1936025959(0x73656967, float:1.817587E31)
            if (r5 != r7) goto L_0x053a
            r7 = 12
            r6.zzG(r7)
            int r5 = r6.zzf()
            if (r5 != r8) goto L_0x054b
            r0 = r6
            goto L_0x054b
        L_0x053a:
            r7 = 12
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r9) goto L_0x054b
            r6.zzG(r7)
            int r5 = r6.zzf()
            if (r5 != r8) goto L_0x054b
            r3 = r6
        L_0x054b:
            int r4 = r4 + 1
            goto L_0x0511
        L_0x054e:
            r7 = 12
            if (r0 == 0) goto L_0x05f1
            if (r3 != 0) goto L_0x0556
            goto L_0x05f1
        L_0x0556:
            r4 = 8
            r0.zzG(r4)
            int r5 = r0.zzf()
            int r5 = com.google.android.gms.internal.ads.zzagy.zze(r5)
            r6 = 4
            r0.zzH(r6)
            r8 = 1
            if (r5 != r8) goto L_0x056d
            r0.zzH(r6)
        L_0x056d:
            int r0 = r0.zzf()
            if (r0 != r8) goto L_0x05ea
            r3.zzG(r4)
            int r0 = r3.zzf()
            int r0 = com.google.android.gms.internal.ads.zzagy.zze(r0)
            r3.zzH(r6)
            if (r0 != r8) goto L_0x0593
            long r4 = r3.zzt()
            int r0 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x058c
            goto L_0x0599
        L_0x058c:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.gms.internal.ads.zzcc r0 = com.google.android.gms.internal.ads.zzcc.zzc(r0)
            throw r0
        L_0x0593:
            r4 = 2
            if (r0 < r4) goto L_0x0599
            r3.zzH(r6)
        L_0x0599:
            long r4 = r3.zzt()
            r8 = 1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x05e3
            r0 = 1
            r3.zzH(r0)
            int r4 = r3.zzl()
            r5 = r4 & 240(0xf0, float:3.36E-43)
            int r35 = r5 >> 4
            r36 = r4 & 15
            int r4 = r3.zzl()
            if (r4 != r0) goto L_0x05f2
            int r33 = r3.zzl()
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            r3.zzC(r5, r6, r4)
            if (r33 != 0) goto L_0x05d1
            int r2 = r3.zzl()
            byte[] r9 = new byte[r2]
            r3.zzC(r9, r6, r2)
            r37 = r9
            goto L_0x05d3
        L_0x05d1:
            r37 = r2
        L_0x05d3:
            r1.zzk = r0
            com.google.android.gms.internal.ads.zzahw r2 = new com.google.android.gms.internal.ads.zzahw
            r31 = 1
            r30 = r2
            r34 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            r1.zzm = r2
            goto L_0x05f2
        L_0x05e3:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.gms.internal.ads.zzcc r0 = com.google.android.gms.internal.ads.zzcc.zzc(r0)
            throw r0
        L_0x05ea:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.gms.internal.ads.zzcc r0 = com.google.android.gms.internal.ads.zzcc.zzc(r0)
            throw r0
        L_0x05f1:
            r0 = 1
        L_0x05f2:
            java.util.List r2 = r10.zzb
            int r2 = r2.size()
            r3 = 0
        L_0x05f9:
            if (r3 >= r2) goto L_0x0631
            java.util.List r4 = r10.zzb
            java.lang.Object r4 = r4.get(r3)
            com.google.android.gms.internal.ads.zzagx r4 = (com.google.android.gms.internal.ads.zzagx) r4
            int r5 = r4.zzd
            r6 = 1970628964(0x75756964, float:3.1109627E32)
            if (r5 != r6) goto L_0x0625
            com.google.android.gms.internal.ads.zzfb r4 = r4.zza
            r5 = 8
            r4.zzG(r5)
            r8 = r26
            r6 = 0
            r9 = 16
            r4.zzC(r8, r6, r9)
            byte[] r11 = zzb
            boolean r11 = java.util.Arrays.equals(r8, r11)
            if (r11 == 0) goto L_0x062c
            zzh(r4, r9, r1)
            goto L_0x062c
        L_0x0625:
            r8 = r26
            r5 = 8
            r6 = 0
            r9 = 16
        L_0x062c:
            int r3 = r3 + 1
            r26 = r8
            goto L_0x05f9
        L_0x0631:
            r8 = r26
            r5 = 8
            r6 = 0
            goto L_0x0646
        L_0x0637:
            r18 = r1
            r25 = r2
            r22 = r6
            r29 = r8
            r0 = 1
            r5 = 8
            r6 = 0
            r7 = 12
            r8 = r3
        L_0x0646:
            int r1 = r29 + 1
            r0 = r45
            r3 = r8
            r6 = r22
            r2 = r25
            r7 = 8
            r8 = r1
            r1 = r18
            goto L_0x014d
        L_0x0656:
            r1 = r2
            r2 = 0
            r6 = 0
            java.util.List r0 = r1.zzb
            com.google.android.gms.internal.ads.zzad r0 = zzf(r0)
            r3 = r45
            if (r0 == 0) goto L_0x06a7
            android.util.SparseArray r1 = r3.zze
            int r1 = r1.size()
            r4 = 0
        L_0x066a:
            if (r4 >= r1) goto L_0x06a7
            android.util.SparseArray r5 = r3.zze
            java.lang.Object r5 = r5.valueAt(r4)
            com.google.android.gms.internal.ads.zzahl r5 = (com.google.android.gms.internal.ads.zzahl) r5
            com.google.android.gms.internal.ads.zzahy r7 = r5.zzd
            com.google.android.gms.internal.ads.zzahv r7 = r7.zza
            com.google.android.gms.internal.ads.zzahx r8 = r5.zzb
            com.google.android.gms.internal.ads.zzahh r8 = r8.zza
            int r9 = com.google.android.gms.internal.ads.zzfk.zza
            int r8 = r8.zza
            com.google.android.gms.internal.ads.zzahw r7 = r7.zza(r8)
            if (r7 == 0) goto L_0x0689
            java.lang.String r7 = r7.zzb
            goto L_0x068a
        L_0x0689:
            r7 = r2
        L_0x068a:
            com.google.android.gms.internal.ads.zzad r7 = r0.zzb(r7)
            com.google.android.gms.internal.ads.zzahy r8 = r5.zzd
            com.google.android.gms.internal.ads.zzahv r8 = r8.zza
            com.google.android.gms.internal.ads.zzam r8 = r8.zzf
            com.google.android.gms.internal.ads.zzak r8 = r8.zzb()
            r8.zzD(r7)
            com.google.android.gms.internal.ads.zzam r7 = r8.zzac()
            com.google.android.gms.internal.ads.zzacs r5 = r5.zza
            r5.zzl(r7)
            int r4 = r4 + 1
            goto L_0x066a
        L_0x06a7:
            long r0 = r3.zzv
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0700
            android.util.SparseArray r0 = r3.zze
            int r0 = r0.size()
            r10 = 0
        L_0x06b9:
            if (r10 >= r0) goto L_0x06e3
            android.util.SparseArray r1 = r3.zze
            java.lang.Object r1 = r1.valueAt(r10)
            com.google.android.gms.internal.ads.zzahl r1 = (com.google.android.gms.internal.ads.zzahl) r1
            long r4 = r3.zzv
            int r2 = r1.zzf
        L_0x06c7:
            com.google.android.gms.internal.ads.zzahx r6 = r1.zzb
            int r7 = r6.zze
            if (r2 >= r7) goto L_0x06e0
            long[] r7 = r6.zzi
            r8 = r7[r2]
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x06e0
            boolean[] r6 = r6.zzj
            boolean r6 = r6[r2]
            if (r6 == 0) goto L_0x06dd
            r1.zzi = r2
        L_0x06dd:
            int r2 = r2 + 1
            goto L_0x06c7
        L_0x06e0:
            int r10 = r10 + 1
            goto L_0x06b9
        L_0x06e3:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzv = r1
            goto L_0x0700
        L_0x06eb:
            r3 = r0
            r1 = r2
            java.util.ArrayDeque r0 = r3.zzm
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0700
            java.util.ArrayDeque r0 = r3.zzm
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzagw r0 = (com.google.android.gms.internal.ads.zzagw) r0
            r0.zzc(r1)
        L_0x0700:
            r0 = r3
            goto L_0x0002
        L_0x0703:
            r3 = r0
            r45.zzg()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzi(long):void");
    }

    private static final zzahh zzj(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzahh) sparseArray.valueAt(0);
        }
        zzahh zzahh = (zzahh) sparseArray.get(i10);
        Objects.requireNonNull(zzahh);
        return zzahh;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.google.android.gms.internal.ads.zzahl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: com.google.android.gms.internal.ads.zzahl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r34, com.google.android.gms.internal.ads.zzacj r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
        L_0x0004:
            int r2 = r0.zzo
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x053b
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x02fb
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x029b
            com.google.android.gms.internal.ads.zzahl r2 = r0.zzy
            if (r2 != 0) goto L_0x0099
            android.util.SparseArray r2 = r0.zze
            int r13 = r2.size()
            r14 = r3
            r3 = r7
            r4 = 0
        L_0x002b:
            if (r4 >= r13) goto L_0x0061
            java.lang.Object r16 = r2.valueAt(r4)
            r5 = r16
            com.google.android.gms.internal.ads.zzahl r5 = (com.google.android.gms.internal.ads.zzahl) r5
            boolean r16 = r5.zzl
            if (r16 != 0) goto L_0x0043
            int r11 = r5.zzf
            com.google.android.gms.internal.ads.zzahy r6 = r5.zzd
            int r6 = r6.zzb
            if (r11 == r6) goto L_0x005d
        L_0x0043:
            boolean r6 = r5.zzl
            if (r6 == 0) goto L_0x0052
            int r6 = r5.zzh
            com.google.android.gms.internal.ads.zzahx r11 = r5.zzb
            int r11 = r11.zzd
            if (r6 != r11) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            long r18 = r5.zzd()
            int r6 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x005d
            r3 = r5
            r14 = r18
        L_0x005d:
            int r4 = r4 + 1
            r5 = 2
            goto L_0x002b
        L_0x0061:
            if (r3 != 0) goto L_0x007e
            long r2 = r0.zzt
            long r4 = r34.zzf()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0077
            r2 = r1
            com.google.android.gms.internal.ads.zzabc r2 = (com.google.android.gms.internal.ads.zzabc) r2
            r2.zzo(r3, r9)
            r33.zzg()
            goto L_0x0004
        L_0x0077:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r7)
            throw r1
        L_0x007e:
            long r4 = r3.zzd()
            long r13 = r34.zzf()
            long r4 = r4 - r13
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0090
            java.lang.String r2 = "Ignoring negative offset to sample data."
            com.google.android.gms.internal.ads.zzer.zzf(r10, r2)
            r2 = 0
        L_0x0090:
            r4 = r1
            com.google.android.gms.internal.ads.zzabc r4 = (com.google.android.gms.internal.ads.zzabc) r4
            r4.zzo(r2, r9)
            r0.zzy = r3
            r2 = r3
        L_0x0099:
            int r3 = r0.zzo
            r4 = 6
            if (r3 != r12) goto L_0x0134
            int r3 = r2.zzb()
            r0.zzz = r3
            int r5 = r2.zzf
            int r6 = r2.zzi
            if (r5 >= r6) goto L_0x00e1
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r1.zzo(r3, r9)
            com.google.android.gms.internal.ads.zzahw r1 = r2.zzf()
            if (r1 != 0) goto L_0x00b6
            goto L_0x00d4
        L_0x00b6:
            com.google.android.gms.internal.ads.zzahx r3 = r2.zzb
            com.google.android.gms.internal.ads.zzfb r3 = r3.zzn
            int r1 = r1.zzd
            if (r1 == 0) goto L_0x00c1
            r3.zzH(r1)
        L_0x00c1:
            com.google.android.gms.internal.ads.zzahx r1 = r2.zzb
            int r5 = r2.zzf
            boolean r1 = r1.zzb(r5)
            if (r1 == 0) goto L_0x00d4
            int r1 = r3.zzp()
            int r1 = r1 * 6
            r3.zzH(r1)
        L_0x00d4:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x00dc
            r0.zzy = r7
        L_0x00dc:
            r0.zzo = r12
        L_0x00de:
            r1 = 0
            goto L_0x029a
        L_0x00e1:
            com.google.android.gms.internal.ads.zzahy r5 = r2.zzd
            com.google.android.gms.internal.ads.zzahv r5 = r5.zza
            int r5 = r5.zzg
            if (r5 != r8) goto L_0x00f5
            int r3 = r3 + -8
            r0.zzz = r3
            r3 = r1
            com.google.android.gms.internal.ads.zzabc r3 = (com.google.android.gms.internal.ads.zzabc) r3
            r5 = 8
            r3.zzo(r5, r9)
        L_0x00f5:
            com.google.android.gms.internal.ads.zzahy r3 = r2.zzd
            com.google.android.gms.internal.ads.zzahv r3 = r3.zza
            com.google.android.gms.internal.ads.zzam r3 = r3.zzf
            java.lang.String r3 = r3.zzm
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0122
            int r3 = r0.zzz
            r5 = 7
            int r3 = r2.zzc(r3, r5)
            r0.zzA = r3
            int r3 = r0.zzz
            com.google.android.gms.internal.ads.zzfb r6 = r0.zzj
            com.google.android.gms.internal.ads.zzaaq.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzacs r3 = r2.zza
            com.google.android.gms.internal.ads.zzfb r6 = r0.zzj
            r3.zzr(r6, r5)
            int r3 = r0.zzA
            int r3 = r3 + r5
            r0.zzA = r3
            goto L_0x012a
        L_0x0122:
            int r3 = r0.zzz
            int r3 = r2.zzc(r3, r9)
            r0.zzA = r3
        L_0x012a:
            int r5 = r0.zzz
            int r5 = r5 + r3
            r0.zzz = r5
            r3 = 4
            r0.zzo = r3
            r0.zzB = r9
        L_0x0134:
            com.google.android.gms.internal.ads.zzahy r3 = r2.zzd
            com.google.android.gms.internal.ads.zzahv r3 = r3.zza
            com.google.android.gms.internal.ads.zzacs r5 = r2.zza
            long r10 = r2.zze()
            int r6 = r3.zzj
            if (r6 != 0) goto L_0x0153
        L_0x0142:
            int r3 = r0.zzA
            int r4 = r0.zzz
            if (r3 >= r4) goto L_0x0237
            int r4 = r4 - r3
            int r3 = r5.zzf(r1, r4, r9)
            int r4 = r0.zzA
            int r4 = r4 + r3
            r0.zzA = r4
            goto L_0x0142
        L_0x0153:
            com.google.android.gms.internal.ads.zzfb r13 = r0.zzg
            byte[] r13 = r13.zzI()
            r13[r9] = r9
            r13[r8] = r9
            r14 = 2
            r13[r14] = r9
            int r14 = r6 + 1
            r15 = 4
            int r6 = 4 - r6
        L_0x0165:
            int r15 = r0.zzA
            int r12 = r0.zzz
            if (r15 >= r12) goto L_0x0237
            int r12 = r0.zzB
            java.lang.String r15 = "video/hevc"
            if (r12 != 0) goto L_0x01d8
            r12 = r1
            com.google.android.gms.internal.ads.zzabc r12 = (com.google.android.gms.internal.ads.zzabc) r12
            r12.zzn(r13, r6, r14, r9)
            com.google.android.gms.internal.ads.zzfb r12 = r0.zzg
            r12.zzG(r9)
            com.google.android.gms.internal.ads.zzfb r12 = r0.zzg
            int r12 = r12.zzf()
            if (r12 <= 0) goto L_0x01d1
            int r12 = r12 + -1
            r0.zzB = r12
            com.google.android.gms.internal.ads.zzfb r12 = r0.zzf
            r12.zzG(r9)
            com.google.android.gms.internal.ads.zzfb r12 = r0.zzf
            r9 = 4
            r5.zzr(r12, r9)
            com.google.android.gms.internal.ads.zzfb r12 = r0.zzg
            r5.zzr(r12, r8)
            com.google.android.gms.internal.ads.zzacs[] r12 = r0.zzF
            int r12 = r12.length
            if (r12 <= 0) goto L_0x01c2
            com.google.android.gms.internal.ads.zzam r12 = r3.zzf
            java.lang.String r12 = r12.zzm
            byte r17 = r13[r9]
            byte[] r9 = com.google.android.gms.internal.ads.zzfy.zza
            java.lang.String r9 = "video/avc"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x01b4
            r9 = r17 & 31
            if (r9 == r4) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r9 = 1
            goto L_0x01c3
        L_0x01b4:
            boolean r9 = r15.equals(r12)
            if (r9 == 0) goto L_0x01c2
            r9 = r17 & 126(0x7e, float:1.77E-43)
            int r9 = r9 >> r8
            r12 = 39
            if (r9 != r12) goto L_0x01c2
            goto L_0x01b2
        L_0x01c2:
            r9 = 0
        L_0x01c3:
            r0.zzC = r9
            int r9 = r0.zzA
            int r9 = r9 + 5
            r0.zzA = r9
            int r9 = r0.zzz
            int r9 = r9 + r6
            r0.zzz = r9
            goto L_0x0233
        L_0x01d1:
            java.lang.String r1 = "Invalid NAL length"
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r7)
            throw r1
        L_0x01d8:
            boolean r9 = r0.zzC
            if (r9 == 0) goto L_0x0221
            com.google.android.gms.internal.ads.zzfb r9 = r0.zzh
            r9.zzD(r12)
            com.google.android.gms.internal.ads.zzfb r9 = r0.zzh
            byte[] r9 = r9.zzI()
            int r12 = r0.zzB
            r4 = r1
            com.google.android.gms.internal.ads.zzabc r4 = (com.google.android.gms.internal.ads.zzabc) r4
            r8 = 0
            r4.zzn(r9, r8, r12, r8)
            com.google.android.gms.internal.ads.zzfb r4 = r0.zzh
            int r8 = r0.zzB
            r5.zzr(r4, r8)
            int r4 = r0.zzB
            com.google.android.gms.internal.ads.zzfb r8 = r0.zzh
            byte[] r9 = r8.zzI()
            int r8 = r8.zzd()
            int r8 = com.google.android.gms.internal.ads.zzfy.zzb(r9, r8)
            com.google.android.gms.internal.ads.zzfb r9 = r0.zzh
            com.google.android.gms.internal.ads.zzam r12 = r3.zzf
            java.lang.String r12 = r12.zzm
            boolean r12 = r15.equals(r12)
            r9.zzG(r12)
            com.google.android.gms.internal.ads.zzfb r9 = r0.zzh
            r9.zzF(r8)
            com.google.android.gms.internal.ads.zzfb r8 = r0.zzh
            com.google.android.gms.internal.ads.zzacs[] r9 = r0.zzF
            com.google.android.gms.internal.ads.zzaaz.zza(r10, r8, r9)
            goto L_0x0227
        L_0x0221:
            r4 = 0
            int r8 = r5.zzf(r1, r12, r4)
            r4 = r8
        L_0x0227:
            int r8 = r0.zzA
            int r8 = r8 + r4
            r0.zzA = r8
            int r8 = r0.zzB
            int r8 = r8 - r4
            r0.zzB = r8
            r4 = 6
            r8 = 1
        L_0x0233:
            r9 = 0
            r12 = 3
            goto L_0x0165
        L_0x0237:
            int r20 = r2.zza()
            com.google.android.gms.internal.ads.zzahw r1 = r2.zzf()
            if (r1 == 0) goto L_0x0246
            com.google.android.gms.internal.ads.zzacr r1 = r1.zzc
            r23 = r1
            goto L_0x0248
        L_0x0246:
            r23 = r7
        L_0x0248:
            int r1 = r0.zzz
            r22 = 0
            r17 = r5
            r18 = r10
            r21 = r1
            r17.zzt(r18, r20, r21, r22, r23)
        L_0x0255:
            java.util.ArrayDeque r1 = r0.zzn
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x028d
            java.util.ArrayDeque r1 = r0.zzn
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.zzahk r1 = (com.google.android.gms.internal.ads.zzahk) r1
            int r3 = r0.zzu
            int r4 = r1.zzc
            int r3 = r3 - r4
            r0.zzu = r3
            long r3 = r1.zza
            boolean r5 = r1.zzb
            if (r5 == 0) goto L_0x0273
            long r3 = r3 + r10
        L_0x0273:
            com.google.android.gms.internal.ads.zzacs[] r5 = r0.zzE
            int r6 = r5.length
            r8 = 0
        L_0x0277:
            if (r8 >= r6) goto L_0x0255
            r12 = r5[r8]
            r15 = 1
            int r9 = r1.zzc
            int r13 = r0.zzu
            r18 = 0
            r17 = r13
            r13 = r3
            r16 = r9
            r12.zzt(r13, r15, r16, r17, r18)
            int r8 = r8 + 1
            goto L_0x0277
        L_0x028d:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x0295
            r0.zzy = r7
        L_0x0295:
            r1 = 3
            r0.zzo = r1
            goto L_0x00de
        L_0x029a:
            return r1
        L_0x029b:
            android.util.SparseArray r2 = r0.zze
            int r2 = r2.size()
            r6 = r7
            r5 = 0
        L_0x02a3:
            if (r5 >= r2) goto L_0x02c6
            android.util.SparseArray r8 = r0.zze
            java.lang.Object r8 = r8.valueAt(r5)
            com.google.android.gms.internal.ads.zzahl r8 = (com.google.android.gms.internal.ads.zzahl) r8
            com.google.android.gms.internal.ads.zzahx r8 = r8.zzb
            boolean r9 = r8.zzo
            if (r9 == 0) goto L_0x02c3
            long r8 = r8.zzc
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x02c3
            android.util.SparseArray r3 = r0.zze
            java.lang.Object r3 = r3.valueAt(r5)
            r6 = r3
            com.google.android.gms.internal.ads.zzahl r6 = (com.google.android.gms.internal.ads.zzahl) r6
            r3 = r8
        L_0x02c3:
            int r5 = r5 + 1
            goto L_0x02a3
        L_0x02c6:
            if (r6 != 0) goto L_0x02cd
            r2 = 3
            r0.zzo = r2
            goto L_0x0004
        L_0x02cd:
            long r8 = r34.zzf()
            long r3 = r3 - r8
            int r2 = (int) r3
            if (r2 < 0) goto L_0x02f4
            r3 = r1
            com.google.android.gms.internal.ads.zzabc r3 = (com.google.android.gms.internal.ads.zzabc) r3
            r4 = 0
            r3.zzo(r2, r4)
            com.google.android.gms.internal.ads.zzahx r2 = r6.zzb
            com.google.android.gms.internal.ads.zzfb r5 = r2.zzn
            byte[] r6 = r5.zzI()
            int r5 = r5.zzd()
            r3.zzn(r6, r4, r5, r4)
            com.google.android.gms.internal.ads.zzfb r3 = r2.zzn
            r3.zzG(r4)
            r2.zzo = r4
            goto L_0x0004
        L_0x02f4:
            java.lang.String r1 = "Offset to encryption data was negative."
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r7)
            throw r1
        L_0x02fb:
            long r5 = r0.zzq
            int r2 = (int) r5
            int r5 = r0.zzr
            int r2 = r2 - r5
            com.google.android.gms.internal.ads.zzfb r5 = r0.zzs
            if (r5 == 0) goto L_0x052b
            byte[] r6 = r5.zzI()
            r8 = r1
            com.google.android.gms.internal.ads.zzabc r8 = (com.google.android.gms.internal.ads.zzabc) r8
            r9 = 8
            r11 = 0
            r8.zzn(r6, r9, r2, r11)
            com.google.android.gms.internal.ads.zzagx r2 = new com.google.android.gms.internal.ads.zzagx
            int r6 = r0.zzp
            r2.<init>(r6, r5)
            long r5 = r34.zzf()
            java.util.ArrayDeque r8 = r0.zzm
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0332
            java.util.ArrayDeque r3 = r0.zzm
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzagw r3 = (com.google.android.gms.internal.ads.zzagw) r3
            r3.zzd(r2)
            goto L_0x0532
        L_0x0332:
            int r8 = r2.zzd
            if (r8 != r4) goto L_0x03fc
            com.google.android.gms.internal.ads.zzfb r2 = r2.zza
            r3 = 8
            r2.zzG(r3)
            int r3 = r2.zzf()
            int r3 = com.google.android.gms.internal.ads.zzagy.zze(r3)
            r4 = 4
            r2.zzH(r4)
            long r14 = r2.zzt()
            if (r3 != 0) goto L_0x0358
            long r3 = r2.zzt()
            long r8 = r2.zzt()
            goto L_0x0360
        L_0x0358:
            long r3 = r2.zzu()
            long r8 = r2.zzu()
        L_0x0360:
            long r5 = r5 + r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r3
            r12 = r14
            long r19 = com.google.android.gms.internal.ads.zzfk.zzr(r8, r10, r12)
            r8 = 2
            r2.zzH(r8)
            int r12 = r2.zzp()
            int[] r13 = new int[r12]
            long[] r10 = new long[r12]
            long[] r11 = new long[r12]
            long[] r8 = new long[r12]
            r21 = r19
            r9 = 0
        L_0x037d:
            if (r9 >= r12) goto L_0x03d3
            int r17 = r2.zzf()
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r17 & r23
            if (r23 != 0) goto L_0x03cb
            long r23 = r2.zzt()
            r25 = 2147483647(0x7fffffff, float:NaN)
            r17 = r17 & r25
            r13[r9] = r17
            r10[r9] = r5
            r8[r9] = r21
            long r3 = r3 + r23
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r8
            r24 = r9
            r8 = r3
            r25 = r3
            r3 = r10
            r4 = r11
            r10 = r21
            r17 = r12
            r1 = r13
            r12 = r14
            long r21 = com.google.android.gms.internal.ads.zzfk.zzr(r8, r10, r12)
            r8 = r7[r24]
            long r8 = r21 - r8
            r4[r24] = r8
            r8 = 4
            r2.zzH(r8)
            r9 = r1[r24]
            long r9 = (long) r9
            long r5 = r5 + r9
            int r9 = r24 + 1
            r13 = r1
            r10 = r3
            r11 = r4
            r8 = r7
            r12 = r17
            r3 = r25
            r7 = 0
            r1 = r34
            goto L_0x037d
        L_0x03cb:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x03d3:
            r7 = r8
            r3 = r10
            r4 = r11
            r1 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.zzaba r5 = new com.google.android.gms.internal.ads.zzaba
            r5.<init>(r1, r3, r4, r7)
            android.util.Pair r1 = android.util.Pair.create(r2, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.zzx = r2
            com.google.android.gms.internal.ads.zzabp r2 = r0.zzD
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.zzacm r1 = (com.google.android.gms.internal.ads.zzacm) r1
            r2.zzO(r1)
            r1 = 1
            r0.zzG = r1
            goto L_0x0528
        L_0x03fc:
            if (r8 != r3) goto L_0x0528
            com.google.android.gms.internal.ads.zzfb r1 = r2.zza
            com.google.android.gms.internal.ads.zzacs[] r2 = r0.zzE
            int r2 = r2.length
            if (r2 == 0) goto L_0x0528
            r2 = 8
            r1.zzG(r2)
            int r2 = r1.zzf()
            int r2 = com.google.android.gms.internal.ads.zzagy.zze(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x046a
            r5 = 1
            if (r2 == r5) goto L_0x0432
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzer.zzf(r10, r1)
            goto L_0x0528
        L_0x0432:
            long r5 = r1.zzt()
            long r11 = r1.zzu()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r5
            long r7 = com.google.android.gms.internal.ads.zzfk.zzr(r11, r13, r15)
            long r11 = r1.zzt()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.google.android.gms.internal.ads.zzfk.zzr(r11, r13, r15)
            long r9 = r1.zzt()
            r2 = 0
            java.lang.String r11 = r1.zzw(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.zzw(r2)
            java.util.Objects.requireNonNull(r12)
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r3
            r12 = r7
            goto L_0x04af
        L_0x046a:
            r2 = 0
            java.lang.String r11 = r1.zzw(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.zzw(r2)
            java.util.Objects.requireNonNull(r12)
            long r13 = r1.zzt()
            long r5 = r1.zzt()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r13
            long r15 = com.google.android.gms.internal.ads.zzfk.zzr(r5, r7, r9)
            long r5 = r0.zzx
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0493
            long r5 = r5 + r15
            r19 = r5
            goto L_0x0495
        L_0x0493:
            r19 = r3
        L_0x0495:
            long r5 = r1.zzt()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = r13
            long r5 = com.google.android.gms.internal.ads.zzfk.zzr(r5, r7, r9)
            long r9 = r1.zzt()
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r15
            r12 = r19
        L_0x04af:
            int r2 = r1.zza()
            byte[] r2 = new byte[r2]
            int r7 = r1.zza()
            r8 = 0
            r1.zzC(r2, r8, r7)
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej
            r25 = r1
            r32 = r2
            r25.<init>(r26, r27, r28, r30, r32)
            com.google.android.gms.internal.ads.zzaek r2 = r0.zzk
            com.google.android.gms.internal.ads.zzfb r7 = new com.google.android.gms.internal.ads.zzfb
            byte[] r1 = r2.zza(r1)
            r7.<init>((byte[]) r1)
            int r1 = r7.zza()
            com.google.android.gms.internal.ads.zzacs[] r2 = r0.zzE
            int r8 = r2.length
            r9 = 0
        L_0x04d9:
            if (r9 >= r8) goto L_0x04e7
            r10 = r2[r9]
            r11 = 0
            r7.zzG(r11)
            r10.zzr(r7, r1)
            int r9 = r9 + 1
            goto L_0x04d9
        L_0x04e7:
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x04fc
            java.util.ArrayDeque r2 = r0.zzn
            com.google.android.gms.internal.ads.zzahk r3 = new com.google.android.gms.internal.ads.zzahk
            r4 = 1
            r3.<init>(r5, r4, r1)
            r2.addLast(r3)
            int r2 = r0.zzu
            int r2 = r2 + r1
            r0.zzu = r2
            goto L_0x0528
        L_0x04fc:
            java.util.ArrayDeque r2 = r0.zzn
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0515
            java.util.ArrayDeque r2 = r0.zzn
            com.google.android.gms.internal.ads.zzahk r3 = new com.google.android.gms.internal.ads.zzahk
            r4 = 0
            r3.<init>(r12, r4, r1)
            r2.addLast(r3)
            int r2 = r0.zzu
            int r2 = r2 + r1
            r0.zzu = r2
            goto L_0x0528
        L_0x0515:
            com.google.android.gms.internal.ads.zzacs[] r2 = r0.zzE
            int r3 = r2.length
            r4 = 0
        L_0x0519:
            if (r4 >= r3) goto L_0x0528
            r5 = r2[r4]
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r12
            r9 = r1
            r5.zzt(r6, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto L_0x0519
        L_0x0528:
            r1 = r34
            goto L_0x0532
        L_0x052b:
            r3 = r1
            com.google.android.gms.internal.ads.zzabc r3 = (com.google.android.gms.internal.ads.zzabc) r3
            r5 = 0
            r3.zzo(r2, r5)
        L_0x0532:
            long r2 = r34.zzf()
            r0.zzi(r2)
            goto L_0x0004
        L_0x053b:
            r5 = 0
            int r2 = r0.zzr
            if (r2 != 0) goto L_0x0568
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzl
            byte[] r2 = r2.zzI()
            r6 = 8
            r7 = 1
            boolean r2 = r1.zzn(r2, r5, r6, r7)
            if (r2 != 0) goto L_0x0551
            r1 = -1
            return r1
        L_0x0551:
            r0.zzr = r6
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzl
            r2.zzG(r5)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzl
            long r5 = r2.zzt()
            r0.zzq = r5
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzl
            int r2 = r2.zzf()
            r0.zzp = r2
        L_0x0568:
            long r5 = r0.zzq
            r7 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x058d
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzl
            byte[] r2 = r2.zzI()
            r5 = r1
            com.google.android.gms.internal.ads.zzabc r5 = (com.google.android.gms.internal.ads.zzabc) r5
            r6 = 8
            r7 = 0
            r5.zzn(r2, r6, r6, r7)
            int r2 = r0.zzr
            int r2 = r2 + r6
            r0.zzr = r2
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzl
            long r5 = r2.zzu()
            r0.zzq = r5
            goto L_0x05c0
        L_0x058d:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05c0
            long r5 = r34.zzd()
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05b1
            java.util.ArrayDeque r2 = r0.zzm
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05b0
            java.util.ArrayDeque r2 = r0.zzm
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzagw r2 = (com.google.android.gms.internal.ads.zzagw) r2
            long r5 = r2.zza
            goto L_0x05b1
        L_0x05b0:
            r5 = r7
        L_0x05b1:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x05c0
            long r7 = r34.zzf()
            long r5 = r5 - r7
            int r2 = r0.zzr
            long r7 = (long) r2
            long r5 = r5 + r7
            r0.zzq = r5
        L_0x05c0:
            long r5 = r0.zzq
            int r2 = r0.zzr
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0745
            long r5 = r34.zzf()
            long r5 = r5 - r7
            int r2 = r0.zzp
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            r8 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r8) goto L_0x05da
            if (r2 != r7) goto L_0x05ed
        L_0x05da:
            boolean r2 = r0.zzG
            if (r2 != 0) goto L_0x05ed
            com.google.android.gms.internal.ads.zzabp r2 = r0.zzD
            com.google.android.gms.internal.ads.zzacl r9 = new com.google.android.gms.internal.ads.zzacl
            long r10 = r0.zzw
            r9.<init>(r10, r5)
            r2.zzO(r9)
            r2 = 1
            r0.zzG = r2
        L_0x05ed:
            int r2 = r0.zzp
            if (r2 != r8) goto L_0x060b
            android.util.SparseArray r2 = r0.zze
            int r2 = r2.size()
            r9 = 0
        L_0x05f8:
            if (r9 >= r2) goto L_0x060b
            android.util.SparseArray r10 = r0.zze
            java.lang.Object r10 = r10.valueAt(r9)
            com.google.android.gms.internal.ads.zzahl r10 = (com.google.android.gms.internal.ads.zzahl) r10
            com.google.android.gms.internal.ads.zzahx r10 = r10.zzb
            r10.zzc = r5
            r10.zzb = r5
            int r9 = r9 + 1
            goto L_0x05f8
        L_0x060b:
            int r2 = r0.zzp
            if (r2 != r7) goto L_0x061c
            r7 = 0
            r0.zzy = r7
            long r2 = r0.zzq
            long r5 = r5 + r2
            r0.zzt = r5
            r2 = 2
            r0.zzo = r2
            goto L_0x0004
        L_0x061c:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x071e
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x071e
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x071e
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x071e
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x071e
            if (r2 == r8) goto L_0x071e
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x071e
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x071e
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x0648
            goto L_0x071e
        L_0x0648:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L_0x06e7
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x06e7
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x06e7
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x06e7
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x06e7
            if (r2 != r3) goto L_0x06d2
            goto L_0x06e7
        L_0x06d2:
            long r2 = r0.zzq
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x06e0
            r2 = 0
            r0.zzs = r2
            r2 = 1
            r0.zzo = r2
            goto L_0x0004
        L_0x06e0:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zzc(r1)
            throw r1
        L_0x06e7:
            int r2 = r0.zzr
            r3 = 8
            if (r2 != r3) goto L_0x0717
            long r4 = r0.zzq
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0710
            com.google.android.gms.internal.ads.zzfb r2 = new com.google.android.gms.internal.ads.zzfb
            long r4 = r0.zzq
            int r5 = (int) r4
            r2.<init>((int) r5)
            com.google.android.gms.internal.ads.zzfb r4 = r0.zzl
            byte[] r4 = r4.zzI()
            byte[] r5 = r2.zzI()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r3)
            r0.zzs = r2
            r2 = 1
            r0.zzo = r2
            goto L_0x0004
        L_0x0710:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zzc(r1)
            throw r1
        L_0x0717:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zzc(r1)
            throw r1
        L_0x071e:
            long r3 = r34.zzf()
            long r5 = r0.zzq
            long r3 = r3 + r5
            java.util.ArrayDeque r5 = r0.zzm
            com.google.android.gms.internal.ads.zzagw r6 = new com.google.android.gms.internal.ads.zzagw
            r7 = -8
            long r3 = r3 + r7
            r6.<init>(r2, r3)
            r5.push(r6)
            long r5 = r0.zzq
            int r2 = r0.zzr
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0740
            r0.zzi(r3)
            goto L_0x0004
        L_0x0740:
            r33.zzg()
            goto L_0x0004
        L_0x0745:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    public final void zzc(zzabp zzabp) {
        this.zzD = zzabp;
        zzg();
        zzacs[] zzacsArr = new zzacs[2];
        this.zzE = zzacsArr;
        int i10 = 0;
        zzacs[] zzacsArr2 = (zzacs[]) zzfk.zzJ(zzacsArr, 0);
        this.zzE = zzacsArr2;
        for (zzacs zzl2 : zzacsArr2) {
            zzl2.zzl(zzc);
        }
        this.zzF = new zzacs[this.zzd.size()];
        int i11 = 100;
        while (i10 < this.zzF.length) {
            int i12 = i11 + 1;
            zzacs zzw2 = this.zzD.zzw(i11, 3);
            zzw2.zzl((zzam) this.zzd.get(i10));
            this.zzF[i10] = zzw2;
            i10++;
            i11 = i12;
        }
    }

    public final void zzd(long j10, long j11) {
        int size = this.zze.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzahl) this.zze.valueAt(i10)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j11;
        this.zzm.clear();
        zzg();
    }

    public final boolean zze(zzabn zzabn) {
        return zzahu.zza(zzabn);
    }

    public zzahm(int i10, zzfi zzfi) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzaek();
        this.zzl = new zzfb(16);
        this.zzf = new zzfb(zzfy.zza);
        this.zzg = new zzfb(5);
        this.zzh = new zzfb();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzfb(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzabp.zza;
        this.zzE = new zzacs[0];
        this.zzF = new zzacs[0];
    }
}
