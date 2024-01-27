package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzakl implements zzakd {
    final /* synthetic */ zzakm zza;
    private final zzfa zzb = new zzfa(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzakl(zzakm zzakm, int i10) {
        this.zza = zzakm;
        this.zze = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0112, code lost:
        if (r29.zzl() == 21) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzfb r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            int r2 = r29.zzl()
            r3 = 2
            if (r2 == r3) goto L_0x000c
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzakm r2 = r0.zza
            java.util.List r2 = r2.zzb
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            com.google.android.gms.internal.ads.zzfi r2 = (com.google.android.gms.internal.ads.zzfi) r2
            int r5 = r29.zzl()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x0022
            return
        L_0x0022:
            r5 = 1
            r1.zzH(r5)
            int r6 = r29.zzp()
            r7 = 3
            r1.zzH(r7)
            com.google.android.gms.internal.ads.zzfa r8 = r0.zzb
            r1.zzB(r8, r3)
            com.google.android.gms.internal.ads.zzfa r8 = r0.zzb
            r8.zzl(r7)
            com.google.android.gms.internal.ads.zzakm r8 = r0.zza
            com.google.android.gms.internal.ads.zzfa r9 = r0.zzb
            r10 = 13
            int r9 = r9.zzd(r10)
            r8.zzq = r9
            com.google.android.gms.internal.ads.zzfa r8 = r0.zzb
            r1.zzB(r8, r3)
            com.google.android.gms.internal.ads.zzfa r3 = r0.zzb
            r8 = 4
            r3.zzl(r8)
            com.google.android.gms.internal.ads.zzfa r3 = r0.zzb
            r9 = 12
            int r3 = r3.zzd(r9)
            r1.zzH(r3)
            android.util.SparseArray r3 = r0.zzc
            r3.clear()
            android.util.SparseIntArray r3 = r0.zzd
            r3.clear()
            int r3 = r29.zza()
        L_0x0069:
            if (r3 <= 0) goto L_0x01e9
            com.google.android.gms.internal.ads.zzfa r11 = r0.zzb
            r12 = 5
            r1.zzB(r11, r12)
            com.google.android.gms.internal.ads.zzfa r11 = r0.zzb
            r13 = 8
            int r13 = r11.zzd(r13)
            r11.zzl(r7)
            com.google.android.gms.internal.ads.zzfa r11 = r0.zzb
            int r11 = r11.zzd(r10)
            com.google.android.gms.internal.ads.zzfa r14 = r0.zzb
            r14.zzl(r8)
            com.google.android.gms.internal.ads.zzfa r14 = r0.zzb
            int r14 = r14.zzd(r9)
            int r15 = r29.zzc()
            int r9 = r15 + r14
            r16 = -1
            r17 = 0
            r5 = r17
            r18 = r5
            r10 = -1
        L_0x009c:
            int r4 = r29.zzc()
            if (r4 >= r9) goto L_0x0199
            int r4 = r29.zzl()
            int r19 = r29.zzl()
            int r20 = r29.zzc()
            int r8 = r20 + r19
            if (r8 <= r9) goto L_0x00b4
            goto L_0x0199
        L_0x00b4:
            r7 = 89
            r20 = 172(0xac, float:2.41E-43)
            r22 = 135(0x87, float:1.89E-43)
            r23 = 129(0x81, float:1.81E-43)
            if (r4 != r12) goto L_0x00f0
            long r24 = r29.zzt()
            r26 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r4 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r4 != 0) goto L_0x00ca
            goto L_0x00f4
        L_0x00ca:
            r26 = 1161904947(0x45414333, double:5.74057318E-315)
            int r4 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r4 != 0) goto L_0x00d2
            goto L_0x0101
        L_0x00d2:
            r22 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r4 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r4 != 0) goto L_0x00e0
        L_0x00d9:
            r21 = r2
            r22 = r6
            r10 = 172(0xac, float:2.41E-43)
            goto L_0x00fa
        L_0x00e0:
            r22 = 1212503619(0x48455643, double:5.990563836E-315)
            int r4 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r4 != 0) goto L_0x0115
            r4 = 36
            r21 = r2
            r22 = r6
            r10 = 36
            goto L_0x00fa
        L_0x00f0:
            r12 = 106(0x6a, float:1.49E-43)
            if (r4 != r12) goto L_0x00fd
        L_0x00f4:
            r21 = r2
            r22 = r6
            r10 = 129(0x81, float:1.81E-43)
        L_0x00fa:
            r12 = 4
            goto L_0x0188
        L_0x00fd:
            r12 = 122(0x7a, float:1.71E-43)
            if (r4 != r12) goto L_0x0108
        L_0x0101:
            r21 = r2
            r22 = r6
            r10 = 135(0x87, float:1.89E-43)
            goto L_0x00fa
        L_0x0108:
            r12 = 127(0x7f, float:1.78E-43)
            if (r4 != r12) goto L_0x0118
            int r4 = r29.zzl()
            r7 = 21
            if (r4 != r7) goto L_0x0115
            goto L_0x00d9
        L_0x0115:
            r21 = r2
            goto L_0x0137
        L_0x0118:
            r12 = 123(0x7b, float:1.72E-43)
            if (r4 != r12) goto L_0x0125
            r4 = 138(0x8a, float:1.93E-43)
            r21 = r2
            r22 = r6
            r10 = 138(0x8a, float:1.93E-43)
            goto L_0x00fa
        L_0x0125:
            r12 = 10
            if (r4 != r12) goto L_0x013a
            java.nio.charset.Charset r4 = com.google.android.gms.internal.ads.zzfsi.zzc
            r12 = 3
            java.lang.String r4 = r1.zzy(r12, r4)
            java.lang.String r4 = r4.trim()
            r21 = r2
            r5 = r4
        L_0x0137:
            r22 = r6
            goto L_0x00fa
        L_0x013a:
            r12 = 3
            if (r4 != r7) goto L_0x017b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0142:
            int r10 = r29.zzc()
            if (r10 >= r8) goto L_0x0171
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzfsi.zzc
            java.lang.String r10 = r1.zzy(r12, r10)
            java.lang.String r10 = r10.trim()
            int r7 = r29.zzl()
            r21 = r2
            r12 = 4
            byte[] r2 = new byte[r12]
            r22 = r6
            r6 = 0
            r1.zzC(r2, r6, r12)
            com.google.android.gms.internal.ads.zzakn r6 = new com.google.android.gms.internal.ads.zzakn
            r6.<init>(r10, r7, r2)
            r4.add(r6)
            r2 = r21
            r6 = r22
            r7 = 89
            r12 = 3
            goto L_0x0142
        L_0x0171:
            r21 = r2
            r22 = r6
            r12 = 4
            r18 = r4
            r10 = 89
            goto L_0x0188
        L_0x017b:
            r21 = r2
            r22 = r6
            r12 = 4
            r2 = 111(0x6f, float:1.56E-43)
            if (r4 != r2) goto L_0x0188
            r2 = 257(0x101, float:3.6E-43)
            r10 = 257(0x101, float:3.6E-43)
        L_0x0188:
            int r2 = r29.zzc()
            int r8 = r8 - r2
            r1.zzH(r8)
            r2 = r21
            r6 = r22
            r7 = 3
            r8 = 4
            r12 = 5
            goto L_0x009c
        L_0x0199:
            r21 = r2
            r22 = r6
            r12 = 4
            r1.zzG(r9)
            com.google.android.gms.internal.ads.zzako r2 = new com.google.android.gms.internal.ads.zzako
            byte[] r4 = r29.zzI()
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r15, r9)
            r6 = r18
            r2.<init>(r10, r5, r6, r4)
            r4 = 6
            if (r13 == r4) goto L_0x01b6
            r4 = 5
            if (r13 != r4) goto L_0x01b8
        L_0x01b6:
            int r13 = r2.zza
        L_0x01b8:
            int r14 = r14 + 5
            int r3 = r3 - r14
            com.google.android.gms.internal.ads.zzakm r4 = r0.zza
            android.util.SparseBooleanArray r4 = r4.zzg
            boolean r4 = r4.get(r11)
            if (r4 != 0) goto L_0x01db
            com.google.android.gms.internal.ads.zzakm r4 = r0.zza
            com.google.android.gms.internal.ads.zzakp r4 = r4.zze
            com.google.android.gms.internal.ads.zzakr r2 = r4.zza(r13, r2)
            android.util.SparseIntArray r4 = r0.zzd
            r4.put(r11, r11)
            android.util.SparseArray r4 = r0.zzc
            r4.put(r11, r2)
        L_0x01db:
            r2 = r21
            r6 = r22
            r4 = 0
            r5 = 1
            r7 = 3
            r8 = 4
            r9 = 12
            r10 = 13
            goto L_0x0069
        L_0x01e9:
            r21 = r2
            r22 = r6
            android.util.SparseIntArray r1 = r0.zzd
            int r1 = r1.size()
            r6 = 0
        L_0x01f4:
            if (r6 >= r1) goto L_0x0246
            android.util.SparseIntArray r2 = r0.zzd
            com.google.android.gms.internal.ads.zzakm r3 = r0.zza
            int r4 = r2.keyAt(r6)
            int r2 = r2.valueAt(r6)
            android.util.SparseBooleanArray r3 = r3.zzg
            r5 = 1
            r3.put(r4, r5)
            com.google.android.gms.internal.ads.zzakm r3 = r0.zza
            android.util.SparseBooleanArray r3 = r3.zzh
            r3.put(r2, r5)
            android.util.SparseArray r3 = r0.zzc
            java.lang.Object r3 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.zzakr r3 = (com.google.android.gms.internal.ads.zzakr) r3
            if (r3 == 0) goto L_0x023b
            com.google.android.gms.internal.ads.zzakm r5 = r0.zza
            com.google.android.gms.internal.ads.zzabp r5 = r5.zzk
            com.google.android.gms.internal.ads.zzakq r7 = new com.google.android.gms.internal.ads.zzakq
            r8 = 8192(0x2000, float:1.14794E-41)
            r9 = r22
            r7.<init>(r9, r4, r8)
            r4 = r21
            r3.zzb(r4, r5, r7)
            com.google.android.gms.internal.ads.zzakm r5 = r0.zza
            android.util.SparseArray r5 = r5.zzf
            r5.put(r2, r3)
            goto L_0x023f
        L_0x023b:
            r4 = r21
            r9 = r22
        L_0x023f:
            int r6 = r6 + 1
            r21 = r4
            r22 = r9
            goto L_0x01f4
        L_0x0246:
            com.google.android.gms.internal.ads.zzakm r1 = r0.zza
            int r2 = r0.zze
            android.util.SparseArray r1 = r1.zzf
            r1.remove(r2)
            com.google.android.gms.internal.ads.zzakm r1 = r0.zza
            r2 = 0
            r1.zzl = r2
            com.google.android.gms.internal.ads.zzakm r1 = r0.zza
            int r2 = r1.zzl
            if (r2 != 0) goto L_0x026c
            com.google.android.gms.internal.ads.zzabp r1 = r1.zzk
            r1.zzD()
            com.google.android.gms.internal.ads.zzakm r1 = r0.zza
            r2 = 1
            r1.zzm = true
        L_0x026c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakl.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    public final void zzb(zzfi zzfi, zzabp zzabp, zzakq zzakq) {
    }
}
