package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzajn implements zzaje {
    private final zzakf zza;
    private final zzajt zzb = new zzajt(7, 128);
    private final zzajt zzc = new zzajt(8, 128);
    private final zzajt zzd = new zzajt(6, 128);
    private long zze;
    private final boolean[] zzf = new boolean[3];
    private String zzg;
    private zzacs zzh;
    private zzajm zzi;
    private boolean zzj;
    private long zzk = -9223372036854775807L;
    private boolean zzl;
    private final zzfb zzm = new zzfb();

    public zzajn(zzakf zzakf, boolean z10, boolean z11) {
        this.zza = zzakf;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i10, i11);
            this.zzc.zza(bArr, i10, i11);
        }
        this.zzd.zza(bArr, i10, i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0181 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzfb r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.zzacs r1 = r0.zzh
            com.google.android.gms.internal.ads.zzdx.zzb(r1)
            int r1 = com.google.android.gms.internal.ads.zzfk.zza
            int r1 = r20.zzc()
            int r2 = r20.zzd()
            byte[] r3 = r20.zzI()
            long r4 = r0.zze
            int r6 = r20.zza()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zze = r4
            com.google.android.gms.internal.ads.zzacs r4 = r0.zzh
            int r5 = r20.zza()
            r6 = r20
            r4.zzr(r6, r5)
        L_0x002a:
            boolean[] r4 = r0.zzf
            int r4 = com.google.android.gms.internal.ads.zzfy.zza(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x0191
            int r5 = r4 + 3
            byte r6 = r3[r5]
            r10 = r6 & 31
            int r6 = r4 - r1
            if (r6 <= 0) goto L_0x003f
            r0.zzf(r3, r1, r4)
        L_0x003f:
            int r14 = r2 - r4
            long r7 = r0.zze
            long r11 = (long) r14
            long r8 = r7 - r11
            if (r6 >= 0) goto L_0x004a
            int r4 = -r6
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            long r6 = r0.zzk
            boolean r11 = r0.zzj
            r12 = 4
            if (r11 == 0) goto L_0x0058
        L_0x0052:
            r18 = r2
            r17 = r5
            goto L_0x0137
        L_0x0058:
            com.google.android.gms.internal.ads.zzajt r11 = r0.zzb
            r11.zzd(r4)
            com.google.android.gms.internal.ads.zzajt r11 = r0.zzc
            r11.zzd(r4)
            boolean r11 = r0.zzj
            if (r11 != 0) goto L_0x00fc
            com.google.android.gms.internal.ads.zzajt r11 = r0.zzb
            boolean r11 = r11.zze()
            if (r11 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.zzajt r11 = r0.zzc
            boolean r11 = r11.zze()
            if (r11 == 0) goto L_0x0052
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.gms.internal.ads.zzajt r13 = r0.zzb
            byte[] r15 = r13.zza
            int r13 = r13.zzb
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.zzajt r13 = r0.zzc
            byte[] r15 = r13.zza
            int r13 = r13.zzb
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.zzajt r13 = r0.zzb
            byte[] r15 = r13.zza
            int r13 = r13.zzb
            com.google.android.gms.internal.ads.zzfx r13 = com.google.android.gms.internal.ads.zzfy.zze(r15, r12, r13)
            com.google.android.gms.internal.ads.zzajt r15 = r0.zzc
            byte[] r1 = r15.zza
            int r15 = r15.zzb
            com.google.android.gms.internal.ads.zzfw r1 = com.google.android.gms.internal.ads.zzfy.zzd(r1, r12, r15)
            int r15 = r13.zza
            int r12 = r13.zzb
            r17 = r5
            int r5 = r13.zzc
            java.lang.String r5 = com.google.android.gms.internal.ads.zzdz.zza(r15, r12, r5)
            com.google.android.gms.internal.ads.zzacs r12 = r0.zzh
            com.google.android.gms.internal.ads.zzak r15 = new com.google.android.gms.internal.ads.zzak
            r15.<init>()
            r18 = r2
            java.lang.String r2 = r0.zzg
            r15.zzJ(r2)
            java.lang.String r2 = "video/avc"
            r15.zzU(r2)
            r15.zzz(r5)
            int r2 = r13.zze
            r15.zzab(r2)
            int r2 = r13.zzf
            r15.zzH(r2)
            float r2 = r13.zzg
            r15.zzR(r2)
            r15.zzK(r11)
            com.google.android.gms.internal.ads.zzam r2 = r15.zzac()
            r12.zzl(r2)
            r2 = 1
            r0.zzj = r2
            com.google.android.gms.internal.ads.zzajm r2 = r0.zzi
            r2.zzc(r13)
            com.google.android.gms.internal.ads.zzajm r2 = r0.zzi
            r2.zzb(r1)
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzb
            r1.zzb()
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzc
            r1.zzb()
            goto L_0x0137
        L_0x00fc:
            r18 = r2
            r17 = r5
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzb
            boolean r2 = r1.zze()
            if (r2 == 0) goto L_0x011c
            byte[] r2 = r1.zza
            int r1 = r1.zzb
            r5 = 4
            com.google.android.gms.internal.ads.zzfx r1 = com.google.android.gms.internal.ads.zzfy.zze(r2, r5, r1)
            com.google.android.gms.internal.ads.zzajm r2 = r0.zzi
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzb
            r1.zzb()
            goto L_0x0137
        L_0x011c:
            r5 = 4
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzc
            boolean r2 = r1.zze()
            if (r2 == 0) goto L_0x0137
            byte[] r2 = r1.zza
            int r1 = r1.zzb
            com.google.android.gms.internal.ads.zzfw r1 = com.google.android.gms.internal.ads.zzfy.zzd(r2, r5, r1)
            com.google.android.gms.internal.ads.zzajm r2 = r0.zzi
            r2.zzb(r1)
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzc
            r1.zzb()
        L_0x0137:
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzd
            boolean r1 = r1.zzd(r4)
            if (r1 == 0) goto L_0x015f
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzd
            byte[] r2 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzfy.zzb(r2, r1)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzm
            com.google.android.gms.internal.ads.zzajt r4 = r0.zzd
            byte[] r4 = r4.zza
            r2.zzE(r4, r1)
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzm
            r2 = 4
            r1.zzG(r2)
            com.google.android.gms.internal.ads.zzakf r1 = r0.zza
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzm
            r1.zza(r6, r2)
        L_0x015f:
            com.google.android.gms.internal.ads.zzajm r11 = r0.zzi
            boolean r15 = r0.zzj
            boolean r1 = r0.zzl
            r12 = r8
            r16 = r1
            boolean r1 = r11.zzf(r12, r14, r15, r16)
            if (r1 == 0) goto L_0x0171
            r1 = 0
            r0.zzl = r1
        L_0x0171:
            long r11 = r0.zzk
            boolean r1 = r0.zzj
            if (r1 != 0) goto L_0x0181
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzb
            r1.zzc(r10)
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzc
            r1.zzc(r10)
        L_0x0181:
            com.google.android.gms.internal.ads.zzajt r1 = r0.zzd
            r1.zzc(r10)
            com.google.android.gms.internal.ads.zzajm r7 = r0.zzi
            r7.zze(r8, r10, r11)
            r1 = r17
            r2 = r18
            goto L_0x002a
        L_0x0191:
            r0.zzf(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajn.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    public final void zzb(zzabp zzabp, zzakq zzakq) {
        zzakq.zzc();
        this.zzg = zzakq.zzb();
        zzacs zzw = zzabp.zzw(zzakq.zza(), 2);
        this.zzh = zzw;
        this.zzi = new zzajm(zzw, false, false);
        this.zza.zzb(zzabp, zzakq);
    }

    public final void zzc(boolean z10) {
        zzdx.zzb(this.zzh);
        int i10 = zzfk.zza;
        if (z10) {
            this.zzi.zza(this.zze);
        }
    }

    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzk = j10;
        }
        this.zzl |= (i10 & 2) != 0;
    }

    public final void zze() {
        this.zze = 0;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzfy.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzajm zzajm = this.zzi;
        if (zzajm != null) {
            zzajm.zzd();
        }
    }
}
