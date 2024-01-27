package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzakc implements zzabm {
    public static final zzabt zza = zzaka.zza;
    private final zzfi zzb = new zzfi(0);
    private final SparseArray zzc = new SparseArray();
    private final zzfb zzd = new zzfb(4096);
    private final zzajz zze = new zzajz();
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzajy zzj;
    private zzabp zzk;
    private boolean zzl;

    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r17, com.google.android.gms.internal.ads.zzacj r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.gms.internal.ads.zzabp r3 = r0.zzk
            com.google.android.gms.internal.ads.zzdx.zzb(r3)
            long r10 = r17.zzd()
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.zzajz r4 = r0.zze
            boolean r5 = r4.zze()
            if (r5 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r4.zza(r1, r2)
            return r1
        L_0x0023:
            boolean r4 = r0.zzl
            r14 = 1
            if (r4 != 0) goto L_0x0064
            r0.zzl = r14
            com.google.android.gms.internal.ads.zzajz r4 = r0.zze
            long r5 = r4.zzb()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.zzajy r15 = new com.google.android.gms.internal.ads.zzajy
            com.google.android.gms.internal.ads.zzfi r5 = r4.zzd()
            long r6 = r4.zzb()
            r4 = r15
            r8 = r10
            r4.<init>(r5, r6, r8)
            r0.zzj = r15
            com.google.android.gms.internal.ads.zzabp r4 = r0.zzk
            com.google.android.gms.internal.ads.zzacm r5 = r15.zzb()
            r4.zzO(r5)
            goto L_0x0064
        L_0x0054:
            com.google.android.gms.internal.ads.zzabp r5 = r0.zzk
            com.google.android.gms.internal.ads.zzacl r6 = new com.google.android.gms.internal.ads.zzacl
            long r7 = r4.zzb()
            r14 = 0
            r6.<init>(r7, r14)
            r5.zzO(r6)
        L_0x0064:
            com.google.android.gms.internal.ads.zzajy r5 = r0.zzj
            if (r5 == 0) goto L_0x0074
            boolean r6 = r5.zze()
            if (r6 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            int r1 = r5.zza(r1, r2)
            return r1
        L_0x0074:
            r17.zzj()
            if (r3 == 0) goto L_0x007f
            long r2 = r17.zze()
            long r10 = r10 - r2
            goto L_0x0080
        L_0x007f:
            r10 = r12
        L_0x0080:
            r2 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x008d
            r5 = 4
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            return r2
        L_0x008d:
            com.google.android.gms.internal.ads.zzfb r3 = r0.zzd
            byte[] r3 = r3.zzI()
            r5 = 4
            r6 = 0
            r4 = 1
            boolean r3 = r1.zzm(r3, r6, r5, r4)
            if (r3 != 0) goto L_0x009d
            return r2
        L_0x009d:
            com.google.android.gms.internal.ads.zzfb r3 = r0.zzd
            r3.zzG(r6)
            com.google.android.gms.internal.ads.zzfb r3 = r0.zzd
            int r3 = r3.zzf()
            r5 = 441(0x1b9, float:6.18E-43)
            if (r3 != r5) goto L_0x00ad
            return r2
        L_0x00ad:
            r2 = 442(0x1ba, float:6.2E-43)
            if (r3 != r2) goto L_0x00d3
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            byte[] r2 = r2.zzI()
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r3 = 10
            r1.zzm(r2, r6, r3, r6)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            r3 = 9
            r2.zzG(r3)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            int r2 = r2.zzl()
            r2 = r2 & 7
            int r2 = r2 + 14
            r1.zzo(r2, r6)
            return r6
        L_0x00d3:
            r2 = 443(0x1bb, float:6.21E-43)
            r5 = 2
            r7 = 6
            if (r3 != r2) goto L_0x00f4
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            byte[] r2 = r2.zzI()
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r1.zzm(r2, r6, r5, r6)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            r2.zzG(r6)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            int r2 = r2.zzp()
            int r2 = r2 + r7
            r1.zzo(r2, r6)
            return r6
        L_0x00f4:
            int r2 = r3 >> 8
            r4 = 1
            if (r2 == r4) goto L_0x00ff
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r1.zzo(r4, r6)
            return r6
        L_0x00ff:
            r2 = r3 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r3 = r0.zzc
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzakb r3 = (com.google.android.gms.internal.ads.zzakb) r3
            boolean r8 = r0.zzf
            if (r8 != 0) goto L_0x018a
            if (r3 != 0) goto L_0x016a
            r8 = 189(0xbd, float:2.65E-43)
            r9 = 0
            if (r2 != r8) goto L_0x0124
            com.google.android.gms.internal.ads.zzaiu r8 = new com.google.android.gms.internal.ads.zzaiu
            r8.<init>(r9)
            r4 = 1
            r0.zzg = r4
            long r9 = r17.zzf()
            r0.zzi = r9
        L_0x0122:
            r9 = r8
            goto L_0x014d
        L_0x0124:
            r4 = 1
            r8 = r2 & 224(0xe0, float:3.14E-43)
            r10 = 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L_0x0139
            com.google.android.gms.internal.ads.zzajs r8 = new com.google.android.gms.internal.ads.zzajs
            r8.<init>(r9)
            r0.zzg = r4
            long r9 = r17.zzf()
            r0.zzi = r9
            goto L_0x0122
        L_0x0139:
            r8 = r2 & 240(0xf0, float:3.36E-43)
            r10 = 224(0xe0, float:3.14E-43)
            if (r8 != r10) goto L_0x014d
            com.google.android.gms.internal.ads.zzajg r8 = new com.google.android.gms.internal.ads.zzajg
            r8.<init>(r9)
            r0.zzh = r4
            long r9 = r17.zzf()
            r0.zzi = r9
            goto L_0x0122
        L_0x014d:
            if (r9 == 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzakq r3 = new com.google.android.gms.internal.ads.zzakq
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 256(0x100, float:3.59E-43)
            r3.<init>(r8, r2, r10)
            com.google.android.gms.internal.ads.zzabp r8 = r0.zzk
            r9.zzb(r8, r3)
            com.google.android.gms.internal.ads.zzfi r3 = r0.zzb
            com.google.android.gms.internal.ads.zzakb r8 = new com.google.android.gms.internal.ads.zzakb
            r8.<init>(r9, r3)
            android.util.SparseArray r3 = r0.zzc
            r3.put(r2, r8)
            r3 = r8
        L_0x016a:
            boolean r2 = r0.zzg
            r8 = 1048576(0x100000, double:5.180654E-318)
            if (r2 == 0) goto L_0x017a
            boolean r2 = r0.zzh
            if (r2 == 0) goto L_0x017a
            long r8 = r0.zzi
            r10 = 8192(0x2000, double:4.0474E-320)
            long r8 = r8 + r10
        L_0x017a:
            long r10 = r17.zzf()
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x018a
            r2 = 1
            r0.zzf = r2
            com.google.android.gms.internal.ads.zzabp r2 = r0.zzk
            r2.zzD()
        L_0x018a:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            byte[] r2 = r2.zzI()
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r1.zzm(r2, r6, r5, r6)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            r2.zzG(r6)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            int r2 = r2.zzp()
            int r2 = r2 + r7
            if (r3 != 0) goto L_0x01a7
            r1.zzo(r2, r6)
            goto L_0x01c8
        L_0x01a7:
            com.google.android.gms.internal.ads.zzfb r4 = r0.zzd
            r4.zzD(r2)
            com.google.android.gms.internal.ads.zzfb r4 = r0.zzd
            byte[] r4 = r4.zzI()
            r1.zzn(r4, r6, r2, r6)
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzd
            r1.zzG(r7)
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzd
            r3.zza(r1)
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzd
            int r2 = r1.zzb()
            r1.zzF(r2)
        L_0x01c8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakc.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    public final void zzc(zzabp zzabp) {
        this.zzk = zzabp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 != r7) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[LOOP:0: B:12:0x002c->B:14:0x0034, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzfi r5 = r4.zzb
            long r0 = r5.zze()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0021
            long r0 = r5.zzc()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
        L_0x0021:
            r5.zzf(r7)
        L_0x0024:
            com.google.android.gms.internal.ads.zzajy r5 = r4.zzj
            r6 = 0
            if (r5 == 0) goto L_0x002c
            r5.zzd(r7)
        L_0x002c:
            android.util.SparseArray r5 = r4.zzc
            int r5 = r5.size()
            if (r6 >= r5) goto L_0x0042
            android.util.SparseArray r5 = r4.zzc
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzakb r5 = (com.google.android.gms.internal.ads.zzakb) r5
            r5.zzb()
            int r6 = r6 + 1
            goto L_0x002c
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakc.zzd(long, long):void");
    }

    public final boolean zze(zzabn zzabn) {
        byte[] bArr = new byte[14];
        zzabc zzabc = (zzabc) zzabn;
        zzabc.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzabc.zzl(bArr[13] & 7, false);
        zzabc.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
