package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaea implements zzabm {
    private final zzfb zza = new zzfb(6);
    private zzabp zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf = -1;
    private zzafu zzg;
    private zzabn zzh;
    private zzaed zzi;
    private zzahr zzj;

    private final int zza(zzabn zzabn) {
        this.zza.zzD(2);
        ((zzabc) zzabn).zzm(this.zza.zzI(), 0, 2, false);
        return this.zza.zzp();
    }

    private final void zzf() {
        zzg(new zzbx[0]);
        zzabp zzabp = this.zzb;
        Objects.requireNonNull(zzabp);
        zzabp.zzD();
        this.zzb.zzO(new zzacl(-9223372036854775807L, 0));
        this.zzc = 6;
    }

    private final void zzg(zzbx... zzbxArr) {
        zzabp zzabp = this.zzb;
        Objects.requireNonNull(zzabp);
        zzacs zzw = zzabp.zzw(1024, 4);
        zzak zzak = new zzak();
        zzak.zzB("image/jpeg");
        zzak.zzO(new zzby(-9223372036854775807L, zzbxArr));
        zzw.zzl(zzak.zzac());
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r24, com.google.android.gms.internal.ads.zzacj r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.zzc
            r4 = 4
            r5 = -1
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L_0x018d
            if (r3 == r8) goto L_0x016f
            r10 = -1
            if (r3 == r7) goto L_0x00ac
            r5 = 5
            if (r3 == r4) goto L_0x004c
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.zzaed r3 = r0.zzi
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzabn r3 = r0.zzh
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzaed r3 = new com.google.android.gms.internal.ads.zzaed
            long r4 = r0.zzf
            r3.<init>(r1, r4)
            r0.zzi = r3
        L_0x0037:
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzj
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzaed r3 = r0.zzi
            int r1 = r1.zzb(r3, r2)
            if (r1 != r8) goto L_0x004b
            long r3 = r2.zza
            long r5 = r0.zzf
            long r3 = r3 + r5
            r2.zza = r3
        L_0x004b:
            return r1
        L_0x004c:
            long r3 = r24.zzf()
            long r6 = r0.zzf
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            byte[] r2 = r2.zzI()
            boolean r2 = r1.zzm(r2, r9, r8, r8)
            if (r2 != 0) goto L_0x0066
            r23.zzf()
            goto L_0x00a8
        L_0x0066:
            r24.zzj()
            com.google.android.gms.internal.ads.zzahr r2 = r0.zzj
            if (r2 != 0) goto L_0x0074
            com.google.android.gms.internal.ads.zzahr r2 = new com.google.android.gms.internal.ads.zzahr
            r2.<init>(r9)
            r0.zzj = r2
        L_0x0074:
            com.google.android.gms.internal.ads.zzaed r2 = new com.google.android.gms.internal.ads.zzaed
            long r3 = r0.zzf
            r2.<init>(r1, r3)
            r0.zzi = r2
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzj
            boolean r1 = r1.zze(r2)
            if (r1 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzj
            com.google.android.gms.internal.ads.zzaef r2 = new com.google.android.gms.internal.ads.zzaef
            long r3 = r0.zzf
            com.google.android.gms.internal.ads.zzabp r6 = r0.zzb
            java.util.Objects.requireNonNull(r6)
            r2.<init>(r3, r6)
            r1.zzc(r2)
            com.google.android.gms.internal.ads.zzbx[] r1 = new com.google.android.gms.internal.ads.zzbx[r8]
            com.google.android.gms.internal.ads.zzafu r2 = r0.zzg
            java.util.Objects.requireNonNull(r2)
            r1[r9] = r2
            r0.zzg(r1)
            r0.zzc = r5
            goto L_0x00a8
        L_0x00a5:
            r23.zzf()
        L_0x00a8:
            return r9
        L_0x00a9:
            r2.zza = r6
            return r8
        L_0x00ac:
            int r2 = r0.zzd
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0164
            com.google.android.gms.internal.ads.zzfb r2 = new com.google.android.gms.internal.ads.zzfb
            int r3 = r0.zze
            r2.<init>((int) r3)
            byte[] r3 = r2.zzI()
            int r4 = r0.zze
            r8 = r1
            com.google.android.gms.internal.ads.zzabc r8 = (com.google.android.gms.internal.ads.zzabc) r8
            r8.zzn(r3, r9, r4, r9)
            com.google.android.gms.internal.ads.zzafu r3 = r0.zzg
            if (r3 != 0) goto L_0x0162
            java.lang.String r3 = r2.zzw(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0162
            java.lang.String r2 = r2.zzw(r9)
            if (r2 == 0) goto L_0x0162
            long r3 = r24.zzd()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x00e7
        L_0x00e4:
            r1 = 0
            goto L_0x015a
        L_0x00e7:
            com.google.android.gms.internal.ads.zzaec r2 = com.google.android.gms.internal.ads.zzaeg.zza(r2)
            if (r2 != 0) goto L_0x00ee
            goto L_0x00e4
        L_0x00ee:
            java.util.List r8 = r2.zzb
            int r8 = r8.size()
            if (r8 >= r7) goto L_0x00f7
            goto L_0x00e4
        L_0x00f7:
            java.util.List r7 = r2.zzb
            int r7 = r7.size()
            int r7 = r7 + r10
            r11 = r5
            r13 = r11
            r17 = r13
            r19 = r17
            r8 = 0
        L_0x0105:
            if (r7 < 0) goto L_0x013f
            java.util.List r10 = r2.zzb
            java.lang.Object r10 = r10.get(r7)
            com.google.android.gms.internal.ads.zzaeb r10 = (com.google.android.gms.internal.ads.zzaeb) r10
            java.lang.String r15 = r10.zza
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r8
            if (r7 != 0) goto L_0x0120
            long r9 = r10.zzd
            long r3 = r3 - r9
            r8 = 0
            goto L_0x0124
        L_0x0120:
            long r8 = r10.zzc
            long r8 = r3 - r8
        L_0x0124:
            r21 = r3
            r3 = r8
            r8 = r21
            if (r1 == 0) goto L_0x0134
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0134
            long r19 = r8 - r3
            r17 = r3
            r1 = 0
        L_0x0134:
            if (r7 != 0) goto L_0x0137
            r13 = r8
        L_0x0137:
            if (r7 != 0) goto L_0x013a
            r11 = r3
        L_0x013a:
            int r7 = r7 + -1
            r8 = r1
            r9 = 0
            goto L_0x0105
        L_0x013f:
            int r1 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0150
            goto L_0x00e4
        L_0x0150:
            long r1 = r2.zza
            com.google.android.gms.internal.ads.zzafu r3 = new com.google.android.gms.internal.ads.zzafu
            r10 = r3
            r15 = r1
            r10.<init>(r11, r13, r15, r17, r19)
            r1 = r3
        L_0x015a:
            r0.zzg = r1
            if (r1 == 0) goto L_0x0162
            long r1 = r1.zzd
            r0.zzf = r1
        L_0x0162:
            r3 = 0
            goto L_0x016c
        L_0x0164:
            int r2 = r0.zze
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r3 = 0
            r1.zzo(r2, r3)
        L_0x016c:
            r0.zzc = r3
            return r3
        L_0x016f:
            r3 = 0
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            r2.zzD(r7)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            byte[] r2 = r2.zzI()
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r1.zzn(r2, r3, r7, r3)
            com.google.android.gms.internal.ads.zzfb r1 = r0.zza
            int r1 = r1.zzp()
            int r1 = r1 + -2
            r0.zze = r1
            r0.zzc = r7
            return r3
        L_0x018d:
            r3 = 0
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            r2.zzD(r7)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zza
            byte[] r2 = r2.zzI()
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r1.zzn(r2, r3, r7, r3)
            com.google.android.gms.internal.ads.zzfb r1 = r0.zza
            int r1 = r1.zzp()
            r0.zzd = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01b8
            long r1 = r0.zzf
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x01b4
            r0.zzc = r4
            goto L_0x01c9
        L_0x01b4:
            r23.zzf()
            goto L_0x01c9
        L_0x01b8:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01c2
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01c9
        L_0x01c2:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01c9
            r0.zzc = r8
        L_0x01c9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaea.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    public final void zzc(zzabp zzabp) {
        this.zzb = zzabp;
    }

    public final void zzd(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzahr zzahr = this.zzj;
            Objects.requireNonNull(zzahr);
            zzahr.zzd(j10, j11);
        }
    }

    public final boolean zze(zzabn zzabn) {
        if (zza(zzabn) != 65496) {
            return false;
        }
        int zza2 = zza(zzabn);
        this.zzd = zza2;
        if (zza2 == 65504) {
            this.zza.zzD(2);
            zzabc zzabc = (zzabc) zzabn;
            zzabc.zzm(this.zza.zzI(), 0, 2, false);
            zzabc.zzl(this.zza.zzp() - 2, false);
            zza2 = zza(zzabn);
            this.zzd = zza2;
        }
        if (zza2 == 65505) {
            zzabc zzabc2 = (zzabc) zzabn;
            zzabc2.zzl(2, false);
            this.zza.zzD(6);
            zzabc2.zzm(this.zza.zzI(), 0, 6, false);
            if (this.zza.zzt() == 1165519206 && this.zza.zzp() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
