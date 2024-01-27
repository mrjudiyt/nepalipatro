package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzefh implements zzdhf {
    private final zzcaz zza;
    private final e zzb;
    private final zzfcr zzc;
    private final zzcgb zzd;
    private final zzfdn zze;
    private final zzbjl zzf;
    private final boolean zzg;
    private final zzedz zzh;

    zzefh(zzcaz zzcaz, e eVar, zzfcr zzfcr, zzcgb zzcgb, zzfdn zzfdn, boolean z10, zzbjl zzbjl, zzedz zzedz) {
        this.zza = zzcaz;
        this.zzb = eVar;
        this.zzc = zzfcr;
        this.zzd = zzcgb;
        this.zze = zzfdn;
        this.zzg = z10;
        this.zzf = zzbjl;
        this.zzh = zzedz;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r19, android.content.Context r20, com.google.android.gms.internal.ads.zzcxy r21) {
        /*
            r18 = this;
            r0 = r18
            com.google.common.util.concurrent.e r1 = r0.zzb
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzfzt.zzq(r1)
            com.google.android.gms.internal.ads.zzcqg r1 = (com.google.android.gms.internal.ads.zzcqg) r1
            com.google.android.gms.internal.ads.zzcgb r2 = r0.zzd
            r3 = 1
            r2.zzan(r3)
            com.google.android.gms.ads.internal.zzj r2 = new com.google.android.gms.ads.internal.zzj
            boolean r4 = r0.zzg
            if (r4 == 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzbjl r4 = r0.zzf
            boolean r4 = r4.zze(r3)
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = 1
        L_0x001f:
            boolean r4 = r0.zzg
            if (r4 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzbjl r6 = r0.zzf
            boolean r6 = r6.zzd()
            r7 = r6
            goto L_0x002d
        L_0x002b:
            r6 = 0
            r7 = 0
        L_0x002d:
            if (r4 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbjl r4 = r0.zzf
            float r4 = r4.zza()
            r8 = r4
            goto L_0x0039
        L_0x0037:
            r4 = 0
            r8 = 0
        L_0x0039:
            r6 = 1
            r9 = -1
            com.google.android.gms.internal.ads.zzfcr r4 = r0.zzc
            boolean r11 = r4.zzQ
            r12 = 0
            r4 = r2
            r10 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r21 == 0) goto L_0x004b
            r21.zzf()
        L_0x004b:
            com.google.android.gms.ads.internal.zzt.zzi()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdgu r6 = r1.zzg()
            com.google.android.gms.internal.ads.zzcgb r8 = r0.zzd
            com.google.android.gms.internal.ads.zzfcr r1 = r0.zzc
            int r1 = r1.zzS
            r4 = -1
            if (r1 == r4) goto L_0x005f
        L_0x005d:
            r9 = r1
            goto L_0x007c
        L_0x005f:
            com.google.android.gms.internal.ads.zzfdn r1 = r0.zze
            com.google.android.gms.ads.internal.client.zzw r1 = r1.zzj
            if (r1 == 0) goto L_0x0072
            int r1 = r1.zza
            if (r1 != r3) goto L_0x006c
            r1 = 7
            r9 = 7
            goto L_0x007c
        L_0x006c:
            r4 = 2
            if (r1 != r4) goto L_0x0072
            r1 = 6
            r9 = 6
            goto L_0x007c
        L_0x0072:
            java.lang.String r1 = "Error setting app open orientation; no targeting orientation available."
            com.google.android.gms.internal.ads.zzcat.zze(r1)
            com.google.android.gms.internal.ads.zzfcr r1 = r0.zzc
            int r1 = r1.zzS
            goto L_0x005d
        L_0x007c:
            com.google.android.gms.internal.ads.zzcaz r10 = r0.zza
            com.google.android.gms.internal.ads.zzfcr r1 = r0.zzc
            java.lang.String r11 = r1.zzD
            com.google.android.gms.internal.ads.zzfcx r4 = r1.zzu
            java.lang.String r13 = r4.zzb
            java.lang.String r14 = r4.zza
            com.google.android.gms.internal.ads.zzfdn r4 = r0.zze
            boolean r1 = r1.zzak
            if (r1 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzedz r1 = r0.zzh
            goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            r17 = r1
            r5 = 0
            r7 = 0
            java.lang.String r1 = r4.zzf
            r4 = r15
            r12 = r2
            r2 = r15
            r15 = r1
            r16 = r21
            r4.<init>((com.google.android.gms.ads.internal.client.zza) r5, (com.google.android.gms.ads.internal.overlay.zzo) r6, (com.google.android.gms.ads.internal.overlay.zzz) r7, (com.google.android.gms.internal.ads.zzcgb) r8, (int) r9, (com.google.android.gms.internal.ads.zzcaz) r10, (java.lang.String) r11, (com.google.android.gms.ads.internal.zzj) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (com.google.android.gms.internal.ads.zzcxy) r16, (com.google.android.gms.internal.ads.zzbso) r17)
            r1 = r20
            com.google.android.gms.ads.internal.overlay.zzm.zza(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefh.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzcxy):void");
    }
}
