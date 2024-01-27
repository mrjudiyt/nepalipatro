package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzejp implements zzdhf {
    private final Context zza;
    private final zzdpt zzb;
    private final zzfdn zzc;
    private final zzcaz zzd;
    private final zzfcr zze;
    private final e zzf;
    private final zzcgb zzg;
    private final zzbjl zzh;
    private final boolean zzi;
    private final zzedz zzj;

    zzejp(Context context, zzdpt zzdpt, zzfdn zzfdn, zzcaz zzcaz, zzfcr zzfcr, e eVar, zzcgb zzcgb, zzbjl zzbjl, boolean z10, zzedz zzedz) {
        this.zza = context;
        this.zzb = zzdpt;
        this.zzc = zzfdn;
        this.zzd = zzcaz;
        this.zze = zzfcr;
        this.zzf = eVar;
        this.zzg = zzcgb;
        this.zzh = zzbjl;
        this.zzi = z10;
        this.zzj = zzedz;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r22, android.content.Context r23, com.google.android.gms.internal.ads.zzcxy r24) {
        /*
            r21 = this;
            r1 = r21
            com.google.common.util.concurrent.e r0 = r1.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfzt.zzq(r0)
            com.google.android.gms.internal.ads.zzdoy r0 = (com.google.android.gms.internal.ads.zzdoy) r0
            com.google.android.gms.internal.ads.zzfcr r2 = r1.zze     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzcgb r3 = r1.zzg     // Catch:{ zzcgm -> 0x0107 }
            boolean r3 = r3.zzaB()     // Catch:{ zzcgm -> 0x0107 }
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzcgb r2 = r1.zzg     // Catch:{ zzcgm -> 0x0107 }
        L_0x0018:
            r11 = r2
            goto L_0x007e
        L_0x001a:
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbci.zzaL     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzbcg r6 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ zzcgm -> 0x0107 }
            java.lang.Object r3 = r6.zzb(r3)     // Catch:{ zzcgm -> 0x0107 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ zzcgm -> 0x0107 }
            boolean r3 = r3.booleanValue()     // Catch:{ zzcgm -> 0x0107 }
            if (r3 != 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzcgb r2 = r1.zzg     // Catch:{ zzcgm -> 0x0107 }
            goto L_0x0018
        L_0x002f:
            com.google.android.gms.internal.ads.zzdpt r3 = r1.zzb     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzfdn r6 = r1.zzc     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.ads.internal.client.zzq r6 = r6.zze     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzcgb r3 = r3.zza(r6, r5, r5)     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzdfm r6 = r0.zzg()     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzbka.zzb(r3, r6)     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzdpx r6 = new com.google.android.gms.internal.ads.zzdpx     // Catch:{ zzcgm -> 0x0107 }
            r6.<init>()     // Catch:{ zzcgm -> 0x0107 }
            android.content.Context r7 = r1.zza     // Catch:{ zzcgm -> 0x0107 }
            r8 = r3
            android.view.View r8 = (android.view.View) r8     // Catch:{ zzcgm -> 0x0107 }
            r6.zza(r7, r8)     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzdps r7 = r0.zzl()     // Catch:{ zzcgm -> 0x0107 }
            boolean r8 = r1.zzi     // Catch:{ zzcgm -> 0x0107 }
            if (r8 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzbjl r8 = r1.zzh     // Catch:{ zzcgm -> 0x0107 }
            goto L_0x0059
        L_0x0058:
            r8 = r5
        L_0x0059:
            r7.zzi(r3, r4, r8)     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzcho r7 = r3.zzN()     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzejn r8 = new com.google.android.gms.internal.ads.zzejn     // Catch:{ zzcgm -> 0x0107 }
            r8.<init>(r6, r3)     // Catch:{ zzcgm -> 0x0107 }
            r7.zzA(r8)     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzcho r6 = r3.zzN()     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzejo r7 = new com.google.android.gms.internal.ads.zzejo     // Catch:{ zzcgm -> 0x0107 }
            r7.<init>(r3)     // Catch:{ zzcgm -> 0x0107 }
            r6.zzG(r7)     // Catch:{ zzcgm -> 0x0107 }
            com.google.android.gms.internal.ads.zzfcx r2 = r2.zzu     // Catch:{ zzcgm -> 0x0107 }
            java.lang.String r6 = r2.zzb     // Catch:{ zzcgm -> 0x0107 }
            java.lang.String r2 = r2.zza     // Catch:{ zzcgm -> 0x0107 }
            r3.zzab(r6, r2, r5)     // Catch:{ zzcgm -> 0x0107 }
            r11 = r3
        L_0x007e:
            r11.zzan(r4)
            boolean r2 = r1.zzi
            com.google.android.gms.ads.internal.zzj r3 = new com.google.android.gms.ads.internal.zzj
            r6 = 0
            if (r2 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.zzbjl r2 = r1.zzh
            boolean r2 = r2.zze(r6)
            r13 = r2
            goto L_0x0091
        L_0x0090:
            r13 = 0
        L_0x0091:
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r2 = r1.zza
            boolean r7 = r1.zzi
            boolean r14 = com.google.android.gms.ads.internal.util.zzt.zzH(r2)
            if (r7 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.zzbjl r2 = r1.zzh
            boolean r2 = r2.zzd()
            r15 = r2
            goto L_0x00a7
        L_0x00a6:
            r15 = 0
        L_0x00a7:
            boolean r2 = r1.zzi
            if (r2 == 0) goto L_0x00b4
            com.google.android.gms.internal.ads.zzbjl r2 = r1.zzh
            float r2 = r2.zza()
            r16 = r2
            goto L_0x00b7
        L_0x00b4:
            r2 = 0
            r16 = 0
        L_0x00b7:
            com.google.android.gms.internal.ads.zzfcr r2 = r1.zze
            r17 = -1
            boolean r6 = r2.zzQ
            boolean r2 = r2.zzR
            r12 = r3
            r18 = r22
            r19 = r6
            r20 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r24 == 0) goto L_0x00ce
            r24.zzf()
        L_0x00ce:
            com.google.android.gms.ads.internal.zzt.zzi()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdgu r9 = r0.zzh()
            com.google.android.gms.internal.ads.zzfcr r0 = r1.zze
            com.google.android.gms.internal.ads.zzcaz r13 = r1.zzd
            int r12 = r0.zzS
            java.lang.String r14 = r0.zzD
            com.google.android.gms.internal.ads.zzfcx r6 = r0.zzu
            java.lang.String r15 = r6.zzb
            java.lang.String r6 = r6.zza
            com.google.android.gms.internal.ads.zzfdn r7 = r1.zzc
            boolean r0 = r0.zzak
            if (r0 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.zzedz r5 = r1.zzj
        L_0x00ed:
            r20 = r5
            r8 = 0
            r10 = 0
            java.lang.String r0 = r7.zzf
            r7 = r2
            r5 = r15
            r15 = r3
            r16 = r5
            r17 = r6
            r18 = r0
            r19 = r24
            r7.<init>((com.google.android.gms.ads.internal.client.zza) r8, (com.google.android.gms.ads.internal.overlay.zzo) r9, (com.google.android.gms.ads.internal.overlay.zzz) r10, (com.google.android.gms.internal.ads.zzcgb) r11, (int) r12, (com.google.android.gms.internal.ads.zzcaz) r13, (java.lang.String) r14, (com.google.android.gms.ads.internal.zzj) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.google.android.gms.internal.ads.zzcxy) r19, (com.google.android.gms.internal.ads.zzbso) r20)
            r0 = r23
            com.google.android.gms.ads.internal.overlay.zzm.zza(r0, r2, r4)
            return
        L_0x0107:
            r0 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.internal.ads.zzcat.zzh(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejp.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzcxy):void");
    }
}
