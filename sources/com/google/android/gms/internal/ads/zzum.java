package com.google.android.gms.internal.ads;

import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzum implements zztu, zztt {
    private final zztu[] zza;
    private final IdentityHashMap zzb;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zztt zze;
    private zzvx zzf;
    private zztu[] zzg;
    private zzvq zzh;
    private final zzth zzi;

    public zzum(zzth zzth, long[] jArr, zztu... zztuArr) {
        this.zzi = zzth;
        this.zza = zztuArr;
        this.zzh = new zztg(new zzvq[0]);
        this.zzb = new IdentityHashMap();
        this.zzg = new zztu[0];
        for (int i10 = 0; i10 < zztuArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zza[i10] = new zzuk(zztuArr[i10], j10);
            }
        }
    }

    public final long zza(long j10, zzlv zzlv) {
        zztu zztu;
        zztu[] zztuArr = this.zzg;
        if (zztuArr.length > 0) {
            zztu = zztuArr[0];
        } else {
            zztu = this.zza[0];
        }
        return zztu.zza(j10, zzlv);
    }

    public final long zzb() {
        return this.zzh.zzb();
    }

    public final long zzc() {
        return this.zzh.zzc();
    }

    public final long zzd() {
        long j10 = -9223372036854775807L;
        for (zztu zztu : this.zzg) {
            long zzd2 = zztu.zzd();
            if (zzd2 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    zztu[] zztuArr = this.zzg;
                    int length = zztuArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        zztu zztu2 = zztuArr[i10];
                        if (zztu2 == zztu) {
                            break;
                        } else if (zztu2.zze(zzd2) == zzd2) {
                            i10++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = zzd2;
                } else if (zzd2 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j10 == -9223372036854775807L || zztu.zze(j10) == j10)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    public final long zze(long j10) {
        long zze2 = this.zzg[0].zze(j10);
        int i10 = 1;
        while (true) {
            zztu[] zztuArr = this.zzg;
            if (i10 >= zztuArr.length) {
                return zze2;
            }
            if (zztuArr[i10].zze(zze2) == zze2) {
                i10++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzf(com.google.android.gms.internal.ads.zzxk[] r22, boolean[] r23, com.google.android.gms.internal.ads.zzvo[] r24, boolean[] r25, long r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            int r3 = r1.length
            int[] r4 = new int[r3]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = 0
        L_0x000d:
            int r7 = r1.length
            r8 = 0
            if (r6 >= r7) goto L_0x004a
            r7 = r2[r6]
            if (r7 != 0) goto L_0x0016
            goto L_0x001f
        L_0x0016:
            java.util.IdentityHashMap r8 = r0.zzb
            java.lang.Object r7 = r8.get(r7)
            r8 = r7
            java.lang.Integer r8 = (java.lang.Integer) r8
        L_0x001f:
            r7 = -1
            if (r8 != 0) goto L_0x0024
            r8 = -1
            goto L_0x0028
        L_0x0024:
            int r8 = r8.intValue()
        L_0x0028:
            r4[r6] = r8
            r8 = r1[r6]
            if (r8 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzcx r7 = r8.zze()
            java.lang.String r7 = r7.zzc
            java.lang.String r8 = ":"
            int r8 = r7.indexOf(r8)
            java.lang.String r7 = r7.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            r3[r6] = r7
            goto L_0x0047
        L_0x0045:
            r3[r6] = r7
        L_0x0047:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x004a:
            java.util.IdentityHashMap r6 = r0.zzb
            r6.clear()
            com.google.android.gms.internal.ads.zztu[] r6 = r0.zza
            com.google.android.gms.internal.ads.zzvo[] r9 = new com.google.android.gms.internal.ads.zzvo[r7]
            com.google.android.gms.internal.ads.zzvo[] r15 = new com.google.android.gms.internal.ads.zzvo[r7]
            com.google.android.gms.internal.ads.zzxk[] r14 = new com.google.android.gms.internal.ads.zzxk[r7]
            java.util.ArrayList r13 = new java.util.ArrayList
            int r6 = r6.length
            r13.<init>(r6)
            r17 = r26
            r6 = 0
        L_0x0060:
            com.google.android.gms.internal.ads.zztu[] r10 = r0.zza
            int r10 = r10.length
            if (r6 >= r10) goto L_0x00fe
            r10 = 0
        L_0x0066:
            int r11 = r1.length
            if (r10 >= r11) goto L_0x0099
            r11 = r4[r10]
            if (r11 != r6) goto L_0x0070
            r11 = r2[r10]
            goto L_0x0071
        L_0x0070:
            r11 = r8
        L_0x0071:
            r15[r10] = r11
            r11 = r3[r10]
            if (r11 != r6) goto L_0x0093
            r11 = r1[r10]
            java.util.Objects.requireNonNull(r11)
            java.util.HashMap r12 = r0.zzd
            com.google.android.gms.internal.ads.zzcx r5 = r11.zze()
            java.lang.Object r5 = r12.get(r5)
            com.google.android.gms.internal.ads.zzcx r5 = (com.google.android.gms.internal.ads.zzcx) r5
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.ads.zzuj r12 = new com.google.android.gms.internal.ads.zzuj
            r12.<init>(r11, r5)
            r14[r10] = r12
            goto L_0x0095
        L_0x0093:
            r14[r10] = r8
        L_0x0095:
            int r10 = r10 + 1
            r5 = 0
            goto L_0x0066
        L_0x0099:
            com.google.android.gms.internal.ads.zztu[] r5 = r0.zza
            r10 = r5[r6]
            r11 = r14
            r12 = r23
            r5 = r13
            r13 = r15
            r19 = r14
            r14 = r25
            r20 = r15
            r15 = r17
            long r10 = r10.zzf(r11, r12, r13, r14, r15)
            if (r6 != 0) goto L_0x00b3
            r17 = r10
            goto L_0x00b7
        L_0x00b3:
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 != 0) goto L_0x00f6
        L_0x00b7:
            r10 = 0
            r11 = 0
        L_0x00b9:
            int r12 = r1.length
            if (r10 >= r12) goto L_0x00e3
            r12 = r3[r10]
            r13 = 1
            if (r12 != r6) goto L_0x00d3
            r11 = r20[r10]
            java.util.Objects.requireNonNull(r11)
            r9[r10] = r11
            java.util.IdentityHashMap r12 = r0.zzb
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            r12.put(r11, r14)
            r11 = 1
            goto L_0x00e0
        L_0x00d3:
            r12 = r4[r10]
            if (r12 != r6) goto L_0x00e0
            r12 = r20[r10]
            if (r12 != 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r13 = 0
        L_0x00dd:
            com.google.android.gms.internal.ads.zzdx.zzf(r13)
        L_0x00e0:
            int r10 = r10 + 1
            goto L_0x00b9
        L_0x00e3:
            if (r11 == 0) goto L_0x00ec
            com.google.android.gms.internal.ads.zztu[] r10 = r0.zza
            r10 = r10[r6]
            r5.add(r10)
        L_0x00ec:
            int r6 = r6 + 1
            r13 = r5
            r14 = r19
            r15 = r20
            r5 = 0
            goto L_0x0060
        L_0x00f6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Children enabled at different positions."
            r1.<init>(r2)
            throw r1
        L_0x00fe:
            r5 = r13
            r1 = 0
            java.lang.System.arraycopy(r9, r1, r2, r1, r7)
            com.google.android.gms.internal.ads.zztu[] r1 = new com.google.android.gms.internal.ads.zztu[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            com.google.android.gms.internal.ads.zztu[] r1 = (com.google.android.gms.internal.ads.zztu[]) r1
            r0.zzg = r1
            com.google.android.gms.internal.ads.zztg r2 = new com.google.android.gms.internal.ads.zztg
            r2.<init>(r1)
            r0.zzh = r2
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzum.zzf(com.google.android.gms.internal.ads.zzxk[], boolean[], com.google.android.gms.internal.ads.zzvo[], boolean[], long):long");
    }

    public final /* bridge */ /* synthetic */ void zzg(zzvq zzvq) {
        zztu zztu = (zztu) zzvq;
        zztt zztt = this.zze;
        Objects.requireNonNull(zztt);
        zztt.zzg(this);
    }

    public final zzvx zzh() {
        zzvx zzvx = this.zzf;
        Objects.requireNonNull(zzvx);
        return zzvx;
    }

    public final void zzi(zztu zztu) {
        this.zzc.remove(zztu);
        if (this.zzc.isEmpty()) {
            zztu[] zztuArr = this.zza;
            int i10 = 0;
            for (zztu zzh2 : zztuArr) {
                i10 += zzh2.zzh().zzc;
            }
            zzcx[] zzcxArr = new zzcx[i10];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                zztu[] zztuArr2 = this.zza;
                if (i11 < zztuArr2.length) {
                    zzvx zzh3 = zztuArr2[i11].zzh();
                    int i13 = zzh3.zzc;
                    int i14 = 0;
                    while (i14 < i13) {
                        zzcx zzb2 = zzh3.zzb(i14);
                        zzcx zzc2 = zzb2.zzc(i11 + CertificateUtil.DELIMITER + zzb2.zzc);
                        this.zzd.put(zzc2, zzb2);
                        zzcxArr[i12] = zzc2;
                        i14++;
                        i12++;
                    }
                    i11++;
                } else {
                    this.zzf = new zzvx(zzcxArr);
                    zztt zztt = this.zze;
                    Objects.requireNonNull(zztt);
                    zztt.zzi(this);
                    return;
                }
            }
        }
    }

    public final void zzj(long j10, boolean z10) {
        for (zztu zzj : this.zzg) {
            zzj.zzj(j10, false);
        }
    }

    public final void zzk() {
        int i10 = 0;
        while (true) {
            zztu[] zztuArr = this.zza;
            if (i10 < zztuArr.length) {
                zztuArr[i10].zzk();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void zzl(zztt zztt, long j10) {
        this.zze = zztt;
        Collections.addAll(this.zzc, this.zza);
        int i10 = 0;
        while (true) {
            zztu[] zztuArr = this.zza;
            if (i10 < zztuArr.length) {
                zztuArr[i10].zzl(this, j10);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void zzm(long j10) {
        this.zzh.zzm(j10);
    }

    public final zztu zzn(int i10) {
        zztu zztu = this.zza[i10];
        return zztu instanceof zzuk ? ((zzuk) zztu).zza : zztu;
    }

    public final boolean zzo(zzks zzks) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzks);
        }
        int size = this.zzc.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zztu) this.zzc.get(i10)).zzo(zzks);
        }
        return false;
    }

    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
