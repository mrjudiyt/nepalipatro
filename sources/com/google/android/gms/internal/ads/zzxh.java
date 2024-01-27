package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzxh extends zzxe {
    private final boolean zze;
    private final zzww zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzxh(int r5, com.google.android.gms.internal.ads.zzcx r6, int r7, com.google.android.gms.internal.ads.zzww r8, int r9, int r10, boolean r11) {
        /*
            r4 = this;
            r7 = 0
            r4.<init>(r5, r6, r7)
            r4.zzf = r8
            boolean r5 = r8.zzJ
            r6 = 1
            if (r6 == r5) goto L_0x000e
            r5 = 16
            goto L_0x0010
        L_0x000e:
            r5 = 24
        L_0x0010:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzam r0 = r4.zzd
            int r1 = r0.zzr
            float r0 = r0.zzt
            int r1 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x0024
            r1 = 1325400064(0x4f000000, float:2.14748365E9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0026
        L_0x0024:
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r4.zze = r0
            r0 = -1
            if (r11 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzam r11 = r4.zzd
            int r1 = r11.zzr
            if (r1 == r0) goto L_0x0034
            if (r1 < 0) goto L_0x004d
        L_0x0034:
            int r1 = r11.zzs
            if (r1 == r0) goto L_0x003a
            if (r1 < 0) goto L_0x004d
        L_0x003a:
            float r1 = r11.zzt
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0045
            r10 = 0
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x004d
        L_0x0045:
            int r10 = r11.zzi
            if (r10 == r0) goto L_0x004b
            if (r10 < 0) goto L_0x004d
        L_0x004b:
            r10 = 1
            goto L_0x004e
        L_0x004d:
            r10 = 0
        L_0x004e:
            r4.zzg = r10
            boolean r10 = com.google.android.gms.internal.ads.zzxi.zzn(r9, r7)
            r4.zzh = r10
            com.google.android.gms.internal.ads.zzam r10 = r4.zzd
            int r11 = r10.zzi
            r4.zzi = r11
            int r10 = r10.zza()
            r4.zzj = r10
            com.google.android.gms.internal.ads.zzam r10 = r4.zzd
            int r10 = r10.zzf
            int r10 = java.lang.Integer.bitCount(r7)
            r4.zzl = r10
            com.google.android.gms.internal.ads.zzam r10 = r4.zzd
            int r10 = r10.zzf
            r4.zzm = r6
            r10 = 0
        L_0x0073:
            com.google.android.gms.internal.ads.zzfvs r11 = r8.zzo
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x0091
            com.google.android.gms.internal.ads.zzam r11 = r4.zzd
            java.lang.String r11 = r11.zzm
            if (r11 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.zzfvs r1 = r8.zzo
            java.lang.Object r1 = r1.get(r10)
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            int r10 = r10 + 1
            goto L_0x0073
        L_0x0091:
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x0094:
            r4.zzk = r10
            r8 = r9 & 384(0x180, float:5.38E-43)
            r10 = 128(0x80, float:1.794E-43)
            if (r8 != r10) goto L_0x009e
            r8 = 1
            goto L_0x009f
        L_0x009e:
            r8 = 0
        L_0x009f:
            r4.zzo = r8
            r8 = r9 & 64
            r10 = 64
            if (r8 != r10) goto L_0x00a9
            r8 = 1
            goto L_0x00aa
        L_0x00a9:
            r8 = 0
        L_0x00aa:
            r4.zzp = r8
            com.google.android.gms.internal.ads.zzam r8 = r4.zzd
            java.lang.String r10 = r8.zzm
            r11 = 4
            r1 = 3
            r2 = 2
            if (r10 != 0) goto L_0x00b7
        L_0x00b5:
            r11 = 0
            goto L_0x0104
        L_0x00b7:
            int r3 = r10.hashCode()
            switch(r3) {
                case -1851077871: goto L_0x00e7;
                case -1662735862: goto L_0x00dd;
                case -1662541442: goto L_0x00d3;
                case 1331836730: goto L_0x00c9;
                case 1599127257: goto L_0x00bf;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x00f1
        L_0x00bf:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x00f1
            r10 = 3
            goto L_0x00f2
        L_0x00c9:
            java.lang.String r3 = "video/avc"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x00f1
            r10 = 4
            goto L_0x00f2
        L_0x00d3:
            java.lang.String r3 = "video/hevc"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x00f1
            r10 = 2
            goto L_0x00f2
        L_0x00dd:
            java.lang.String r3 = "video/av01"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x00f1
            r10 = 1
            goto L_0x00f2
        L_0x00e7:
            java.lang.String r3 = "video/dolby-vision"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x00f1
            r10 = 0
            goto L_0x00f2
        L_0x00f1:
            r10 = -1
        L_0x00f2:
            if (r10 == 0) goto L_0x0103
            if (r10 == r6) goto L_0x0104
            if (r10 == r2) goto L_0x0101
            if (r10 == r1) goto L_0x00ff
            if (r10 == r11) goto L_0x00fd
            goto L_0x00b5
        L_0x00fd:
            r11 = 1
            goto L_0x0104
        L_0x00ff:
            r11 = 2
            goto L_0x0104
        L_0x0101:
            r11 = 3
            goto L_0x0104
        L_0x0103:
            r11 = 5
        L_0x0104:
            r4.zzq = r11
            com.google.android.gms.internal.ads.zzww r10 = r4.zzf
            boolean r11 = r10.zzR
            boolean r11 = com.google.android.gms.internal.ads.zzxi.zzn(r9, r11)
            if (r11 != 0) goto L_0x0111
            goto L_0x0130
        L_0x0111:
            boolean r11 = r4.zze
            if (r11 != 0) goto L_0x011a
            boolean r10 = r10.zzH
            if (r10 != 0) goto L_0x011a
            goto L_0x0130
        L_0x011a:
            boolean r7 = com.google.android.gms.internal.ads.zzxi.zzn(r9, r7)
            if (r7 == 0) goto L_0x012f
            boolean r7 = r4.zzg
            if (r7 == 0) goto L_0x012f
            if (r11 == 0) goto L_0x012f
            int r7 = r8.zzi
            if (r7 == r0) goto L_0x012f
            r5 = r5 & r9
            if (r5 == 0) goto L_0x012f
            r7 = 2
            goto L_0x0130
        L_0x012f:
            r7 = 1
        L_0x0130:
            r4.zzn = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.<init>(int, com.google.android.gms.internal.ads.zzcx, int, com.google.android.gms.internal.ads.zzww, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzxh zzxh, zzxh zzxh2) {
        zzfxb zzfxb;
        if (!zzxh.zze || !zzxh.zzh) {
            zzfxb = zzxi.zzc.zza();
        } else {
            zzfxb = zzxi.zzc;
        }
        zzfvh zzj2 = zzfvh.zzj();
        Integer valueOf = Integer.valueOf(zzxh.zzi);
        Integer valueOf2 = Integer.valueOf(zzxh2.zzi);
        boolean z10 = zzxh.zzf.zzA;
        return zzj2.zzc(valueOf, valueOf2, zzxi.zzd).zzc(Integer.valueOf(zzxh.zzj), Integer.valueOf(zzxh2.zzj), zzfxb).zzc(Integer.valueOf(zzxh.zzi), Integer.valueOf(zzxh2.zzi), zzfxb).zza();
    }

    public static /* synthetic */ int zzd(zzxh zzxh, zzxh zzxh2) {
        zzfvh zzc = zzfvh.zzj().zzd(zzxh.zzh, zzxh2.zzh).zzb(zzxh.zzl, zzxh2.zzl).zzd(true, true).zzd(zzxh.zze, zzxh2.zze).zzd(zzxh.zzg, zzxh2.zzg).zzc(Integer.valueOf(zzxh.zzk), Integer.valueOf(zzxh2.zzk), zzfxb.zzc().zza());
        boolean z10 = zzxh.zzo;
        zzfvh zzd = zzc.zzd(z10, zzxh2.zzo);
        boolean z11 = zzxh.zzp;
        zzfvh zzd2 = zzd.zzd(z11, zzxh2.zzp);
        if (z10 && z11) {
            zzd2 = zzd2.zzb(zzxh.zzq, zzxh2.zzq);
        }
        return zzd2.zza();
    }

    public final int zzb() {
        return this.zzn;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzxe zzxe) {
        zzxh zzxh = (zzxh) zzxe;
        if (!zzfk.zzE(this.zzd.zzm, zzxh.zzd.zzm)) {
            return false;
        }
        boolean z10 = this.zzf.zzK;
        return this.zzo == zzxh.zzo && this.zzp == zzxh.zzp;
    }
}
