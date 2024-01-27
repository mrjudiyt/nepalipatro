package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzakm implements zzabm {
    public static final zzabt zza = zzakj.zza;
    /* access modifiers changed from: private */
    public final List zzb;
    private final zzfb zzc;
    private final SparseIntArray zzd;
    /* access modifiers changed from: private */
    public final zzakp zze;
    /* access modifiers changed from: private */
    public final SparseArray zzf;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzg;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzh;
    private final zzaki zzi;
    private zzakh zzj;
    /* access modifiers changed from: private */
    public zzabp zzk;
    /* access modifiers changed from: private */
    public int zzl;
    /* access modifiers changed from: private */
    public boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    /* access modifiers changed from: private */
    public int zzq;

    public zzakm() {
        this(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b3, code lost:
        if (r1 == false) goto L_0x01b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r19, com.google.android.gms.internal.ads.zzacj r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            long r11 = r19.zzd()
            boolean r3 = r0.zzm
            r13 = -1
            r15 = 1
            r10 = 0
            if (r3 == 0) goto L_0x009e
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzaki r3 = r0.zzi
            boolean r4 = r3.zzd()
            if (r4 == 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            int r4 = r0.zzq
            int r1 = r3.zza(r1, r2, r4)
            return r1
        L_0x0026:
            boolean r3 = r0.zzn
            r7 = 0
            if (r3 != 0) goto L_0x0075
            r0.zzn = r15
            com.google.android.gms.internal.ads.zzaki r3 = r0.zzi
            long r4 = r3.zzb()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzakh r9 = new com.google.android.gms.internal.ads.zzakh
            com.google.android.gms.internal.ads.zzfi r4 = r3.zzc()
            long r5 = r3.zzb()
            int r3 = r0.zzq
            r16 = 112800(0x1b8a0, float:1.58066E-40)
            r17 = r3
            r3 = r9
            r13 = r7
            r7 = r11
            r15 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r7, r9, r10)
            r0.zzj = r15
            com.google.android.gms.internal.ads.zzabp r3 = r0.zzk
            com.google.android.gms.internal.ads.zzacm r4 = r15.zzb()
            r3.zzO(r4)
            goto L_0x0076
        L_0x0065:
            r13 = r7
            com.google.android.gms.internal.ads.zzabp r4 = r0.zzk
            com.google.android.gms.internal.ads.zzacl r5 = new com.google.android.gms.internal.ads.zzacl
            long r6 = r3.zzb()
            r5.<init>(r6, r13)
            r4.zzO(r5)
            goto L_0x0076
        L_0x0075:
            r13 = r7
        L_0x0076:
            boolean r3 = r0.zzo
            if (r3 == 0) goto L_0x008d
            r3 = 0
            r0.zzo = r3
            r0.zzd(r13, r13)
            long r4 = r19.zzf()
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r2.zza = r13
            r1 = 1
            return r1
        L_0x008d:
            r3 = 0
        L_0x008e:
            com.google.android.gms.internal.ads.zzakh r4 = r0.zzj
            if (r4 == 0) goto L_0x009f
            boolean r5 = r4.zze()
            if (r5 != 0) goto L_0x0099
            goto L_0x009f
        L_0x0099:
            int r1 = r4.zza(r1, r2)
            return r1
        L_0x009e:
            r3 = 0
        L_0x009f:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            byte[] r4 = r2.zzI()
            int r5 = r2.zzc()
            int r5 = 9400 - r5
            r6 = 188(0xbc, float:2.63E-43)
            if (r5 < r6) goto L_0x00b0
            goto L_0x00c2
        L_0x00b0:
            int r5 = r2.zza()
            if (r5 <= 0) goto L_0x00bd
            int r2 = r2.zzc()
            java.lang.System.arraycopy(r4, r2, r4, r3, r5)
        L_0x00bd:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            r2.zzE(r4, r5)
        L_0x00c2:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            int r5 = r2.zza()
            r7 = -1
            if (r5 >= r6) goto L_0x0100
            int r2 = r2.zzd()
            int r5 = 9400 - r2
            int r5 = r1.zza(r4, r2, r5)
            if (r5 != r7) goto L_0x00f9
            r10 = 0
        L_0x00d8:
            android.util.SparseArray r1 = r0.zzf
            int r1 = r1.size()
            if (r10 >= r1) goto L_0x00f8
            android.util.SparseArray r1 = r0.zzf
            java.lang.Object r1 = r1.valueAt(r10)
            com.google.android.gms.internal.ads.zzakr r1 = (com.google.android.gms.internal.ads.zzakr) r1
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzajv
            if (r2 == 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzfb r2 = new com.google.android.gms.internal.ads.zzfb
            r2.<init>()
            r3 = 1
            r1.zza(r2, r3)
        L_0x00f5:
            int r10 = r10 + 1
            goto L_0x00d8
        L_0x00f8:
            return r7
        L_0x00f9:
            com.google.android.gms.internal.ads.zzfb r7 = r0.zzc
            int r2 = r2 + r5
            r7.zzF(r2)
            goto L_0x00c2
        L_0x0100:
            int r1 = r2.zzc()
            int r4 = r2.zzd()
            byte[] r2 = r2.zzI()
            int r2 = com.google.android.gms.internal.ads.zzaks.zza(r2, r1, r4)
            com.google.android.gms.internal.ads.zzfb r5 = r0.zzc
            r5.zzG(r2)
            int r5 = r2 + 188
            if (r5 <= r4) goto L_0x0120
            int r4 = r0.zzp
            int r2 = r2 - r1
            int r4 = r4 + r2
            r0.zzp = r4
            goto L_0x0122
        L_0x0120:
            r0.zzp = r3
        L_0x0122:
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzc
            int r2 = r1.zzd()
            if (r5 <= r2) goto L_0x012b
            return r3
        L_0x012b:
            int r1 = r1.zzf()
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x013a
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzc
            r1.zzG(r5)
            return r3
        L_0x013a:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0141
            r10 = 1
            goto L_0x0142
        L_0x0141:
            r10 = 0
        L_0x0142:
            int r4 = r1 >> 8
            r6 = r1 & 32
            r8 = r1 & 16
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            if (r8 == 0) goto L_0x0155
            android.util.SparseArray r8 = r0.zzf
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.zzakr r8 = (com.google.android.gms.internal.ads.zzakr) r8
            goto L_0x0156
        L_0x0155:
            r8 = 0
        L_0x0156:
            if (r8 != 0) goto L_0x015e
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzc
            r1.zzG(r5)
            return r3
        L_0x015e:
            r1 = r1 & 15
            android.util.SparseIntArray r9 = r0.zzd
            int r13 = r1 + -1
            int r9 = r9.get(r4, r13)
            android.util.SparseIntArray r13 = r0.zzd
            r13.put(r4, r1)
            if (r9 != r1) goto L_0x0175
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzc
            r1.zzG(r5)
            return r3
        L_0x0175:
            r13 = 1
            int r9 = r9 + r13
            r9 = r9 & 15
            if (r1 == r9) goto L_0x017e
            r8.zzc()
        L_0x017e:
            if (r6 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzc
            int r6 = r1.zzl()
            int r1 = r1.zzl()
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0190
            r1 = 2
            goto L_0x0191
        L_0x0190:
            r1 = 0
        L_0x0191:
            r10 = r10 | r1
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzc
            int r6 = r6 + r7
            r1.zzH(r6)
        L_0x0198:
            boolean r1 = r0.zzm
            if (r1 != 0) goto L_0x01a4
            android.util.SparseBooleanArray r6 = r0.zzh
            boolean r4 = r6.get(r4, r3)
            if (r4 != 0) goto L_0x01b5
        L_0x01a4:
            com.google.android.gms.internal.ads.zzfb r4 = r0.zzc
            r4.zzF(r5)
            com.google.android.gms.internal.ads.zzfb r4 = r0.zzc
            r8.zza(r4, r10)
            com.google.android.gms.internal.ads.zzfb r4 = r0.zzc
            r4.zzF(r2)
            if (r1 != 0) goto L_0x01c2
        L_0x01b5:
            boolean r1 = r0.zzm
            if (r1 == 0) goto L_0x01c2
            r1 = -1
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            r1 = 1
            r0.zzo = r1
        L_0x01c2:
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzc
            r1.zzG(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakm.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    public final void zzc(zzabp zzabp) {
        this.zzk = zzabp;
    }

    public final void zzd(long j10, long j11) {
        zzakh zzakh;
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfi zzfi = (zzfi) this.zzb.get(i10);
            if (zzfi.zze() != -9223372036854775807L) {
                long zzc2 = zzfi.zzc();
                if (zzc2 != -9223372036854775807L) {
                    if (zzc2 != 0) {
                        if (zzc2 == j11) {
                        }
                    }
                }
            }
            zzfi.zzf(j11);
        }
        if (!(j11 == 0 || (zzakh = this.zzj) == null)) {
            zzakh.zzd(j11);
        }
        this.zzc.zzD(0);
        this.zzd.clear();
        for (int i11 = 0; i11 < this.zzf.size(); i11++) {
            ((zzakr) this.zzf.valueAt(i11)).zzc();
        }
        this.zzp = 0;
    }

    public final boolean zze(zzabn zzabn) {
        byte[] zzI = this.zzc.zzI();
        zzabc zzabc = (zzabc) zzabn;
        zzabc.zzm(zzI, 0, 940, false);
        int i10 = 0;
        while (i10 < 188) {
            int i11 = 0;
            while (i11 < 5) {
                if (zzI[(i11 * 188) + i10] != 71) {
                    i10++;
                } else {
                    i11++;
                }
            }
            zzabc.zzo(i10, false);
            return true;
        }
        return false;
    }

    public zzakm(int i10) {
        this(1, new zzfi(0), new zzajb(0), 112800);
    }

    public zzakm(int i10, zzfi zzfi, zzakp zzakp, int i11) {
        this.zze = zzakp;
        this.zzb = Collections.singletonList(zzfi);
        this.zzc = new zzfb(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzaki(112800);
        this.zzk = zzabp.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.zzf.put(sparseArray2.keyAt(i12), (zzakr) sparseArray2.valueAt(i12));
        }
        this.zzf.put(0, new zzake(new zzakk(this)));
    }
}
