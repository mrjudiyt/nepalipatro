package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeiu implements zzfza {
    private final zzfhr zza;
    private final zzcxn zzb;
    private final zzfjt zzc;
    private final zzfjx zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcta zzg;
    private final zzeio zzh;
    private final zzeez zzi;
    private final Context zzj;
    private final zzfje zzk;
    private final zzehy zzl;

    zzeiu(Context context, zzfhr zzfhr, zzeio zzeio, zzcxn zzcxn, zzfjt zzfjt, zzfjx zzfjx, zzcta zzcta, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeez zzeez, zzfje zzfje, zzehy zzehy) {
        this.zzj = context;
        this.zza = zzfhr;
        this.zzh = zzeio;
        this.zzb = zzcxn;
        this.zzc = zzfjt;
        this.zzd = zzfjx;
        this.zzg = zzcta;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeez;
        this.zzk = zzfje;
        this.zzl = zzehy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzfq)).booleanValue() == false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String zzc(com.google.android.gms.internal.ads.zzfde r5) {
        /*
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzfr
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L_0x0018
            java.lang.String r0 = "No ad config."
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            com.google.android.gms.internal.ads.zzfdd r2 = r5.zzb
            com.google.android.gms.internal.ads.zzfcv r2 = r2.zzb
            int r2 = r2.zze
            if (r2 == 0) goto L_0x0057
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L_0x003c
            if (r2 >= r4) goto L_0x003c
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzfq
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0057
            goto L_0x0058
        L_0x003c:
            if (r2 < r4) goto L_0x0045
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L_0x0045
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L_0x0058
        L_0x0045:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L_0x0058
        L_0x0057:
            r1 = r0
        L_0x0058:
            com.google.android.gms.internal.ads.zzfdd r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfcv r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfct r5 = r5.zzi
            if (r5 == 0) goto L_0x0065
            java.lang.String r5 = r5.zza()
            return r5
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiu.zzc(com.google.android.gms.internal.ads.zzfde):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.common.util.concurrent.e zza(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfde r9 = (com.google.android.gms.internal.ads.zzfde) r9
            java.lang.String r0 = zzc(r9)
            com.google.android.gms.internal.ads.zzfdd r1 = r9.zzb
            com.google.android.gms.internal.ads.zzfcv r1 = r1.zzb
            com.google.android.gms.internal.ads.zzeez r2 = r8.zzi
            r2.zzi(r1)
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzic
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 3
            if (r1 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.zzfdd r1 = r9.zzb
            com.google.android.gms.internal.ads.zzfcv r1 = r1.zzb
            int r1 = r1.zze
            if (r1 == 0) goto L_0x003d
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 < r3) goto L_0x0032
            r3 = 300(0x12c, float:4.2E-43)
            if (r1 < r3) goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.zzeir r9 = new com.google.android.gms.internal.ads.zzeir
            r9.<init>(r2, r0)
            com.google.common.util.concurrent.e r9 = com.google.android.gms.internal.ads.zzfzt.zzg(r9)
            goto L_0x016b
        L_0x003d:
            com.google.android.gms.internal.ads.zzfdd r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfcv r0 = r0.zzb
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzdp
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r3.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 1
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = r0.zzo
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0066
            com.google.android.gms.internal.ads.zzeez r1 = r8.zzi
            com.google.android.gms.internal.ads.zzfdd r4 = r9.zzb
            java.util.List r4 = r4.zza
            r1.zzh(r0, r4)
            goto L_0x00af
        L_0x0066:
            com.google.android.gms.internal.ads.zzfdd r0 = r9.zzb
            java.util.List r0 = r0.zza
            java.util.Iterator r0 = r0.iterator()
        L_0x006e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00af
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfcr r1 = (com.google.android.gms.internal.ads.zzfcr) r1
            com.google.android.gms.internal.ads.zzeez r4 = r8.zzi
            r4.zzd(r1)
            java.util.List r4 = r1.zza
            java.util.Iterator r4 = r4.iterator()
        L_0x0085:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a2
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcta r6 = r8.zzg
            int r7 = r1.zzb
            com.google.android.gms.internal.ads.zzeeu r5 = r6.zza(r7, r5)
            if (r5 == 0) goto L_0x0085
            boolean r5 = r5.zzb(r9, r1)
            if (r5 == 0) goto L_0x0085
            goto L_0x006e
        L_0x00a2:
            com.google.android.gms.internal.ads.zzeez r4 = r8.zzi
            r5 = 0
            r7 = 0
            com.google.android.gms.ads.internal.client.zze r7 = com.google.android.gms.internal.ads.zzfeo.zzd(r3, r7, r7)
            r4.zzf(r1, r5, r7)
            goto L_0x006e
        L_0x00af:
            com.google.android.gms.internal.ads.zzcxn r0 = r8.zzb
            com.google.android.gms.internal.ads.zzfjx r1 = r8.zzd
            com.google.android.gms.internal.ads.zzfjt r4 = r8.zzc
            com.google.android.gms.internal.ads.zzcoy r5 = new com.google.android.gms.internal.ads.zzcoy
            r5.<init>(r9, r1, r4)
            java.util.concurrent.Executor r1 = r8.zze
            r0.zzo(r5, r1)
            com.google.android.gms.internal.ads.zzfdd r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfcv r0 = r0.zzb
            int r0 = r0.zzp
            if (r0 <= r3) goto L_0x00cf
            com.google.android.gms.internal.ads.zzehy r0 = r8.zzl
            com.google.common.util.concurrent.e r9 = r0.zzb(r9)
            goto L_0x016b
        L_0x00cf:
            java.lang.String r0 = zzc(r9)
            com.google.android.gms.internal.ads.zzfhr r1 = r8.zza
            com.google.android.gms.internal.ads.zzfhl r3 = com.google.android.gms.internal.ads.zzfhl.RENDER_CONFIG_INIT
            r4 = 0
            com.google.android.gms.internal.ads.zzeir r5 = new com.google.android.gms.internal.ads.zzeir
            r5.<init>(r2, r0)
            com.google.common.util.concurrent.e r0 = com.google.android.gms.internal.ads.zzfzt.zzg(r5)
            com.google.android.gms.internal.ads.zzfhi r0 = com.google.android.gms.internal.ads.zzfhb.zzc(r0, r3, r1)
            com.google.android.gms.internal.ads.zzfgw r0 = r0.zza()
            com.google.android.gms.internal.ads.zzeio r1 = r8.zzh
            r1.zzl()
            com.google.android.gms.internal.ads.zzfdd r1 = r9.zzb
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
        L_0x00f6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x015b
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzfcr r2 = (com.google.android.gms.internal.ads.zzfcr) r2
            java.util.List r3 = r2.zza
            java.util.Iterator r3 = r3.iterator()
        L_0x0108:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0158
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcta r6 = r8.zzg
            int r7 = r2.zzb
            com.google.android.gms.internal.ads.zzeeu r6 = r6.zza(r7, r5)
            if (r6 == 0) goto L_0x0108
            boolean r7 = r6.zzb(r9, r2)
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.internal.ads.zzfhr r3 = r8.zza
            com.google.android.gms.internal.ads.zzfhl r7 = com.google.android.gms.internal.ads.zzfhl.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.zzfhi r0 = r3.zzb(r7, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "render-config-"
            r3.append(r7)
            r3.append(r4)
            java.lang.String r7 = "-"
            r3.append(r7)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzfhi r0 = r0.zzh(r3)
            com.google.android.gms.internal.ads.zzeis r3 = new com.google.android.gms.internal.ads.zzeis
            r3.<init>(r8, r2, r9, r6)
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.zzfhi r0 = r0.zzc(r2, r3)
            com.google.android.gms.internal.ads.zzfgw r0 = r0.zza()
        L_0x0158:
            int r4 = r4 + 1
            goto L_0x00f6
        L_0x015b:
            com.google.android.gms.internal.ads.zzeio r9 = r8.zzh
            r9.getClass()
            com.google.android.gms.internal.ads.zzeit r1 = new com.google.android.gms.internal.ads.zzeit
            r1.<init>(r9)
            java.util.concurrent.Executor r9 = r8.zze
            r0.addListener(r1, r9)
            r9 = r0
        L_0x016b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiu.zza(java.lang.Object):com.google.common.util.concurrent.e");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzb(zzfcr zzfcr, zzfde zzfde, zzeeu zzeeu, Throwable th) {
        zzfit zza2 = zzfis.zza(this.zzj, 12);
        zza2.zzd(zzfcr.zzG);
        zza2.zzh();
        e zzo = zzfzt.zzo(zzeeu.zza(zzfde, zzfcr), (long) zzfcr.zzT, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfde, zzfcr, zzo, this.zzc);
        zzfjd.zza(zzo, this.zzk, zza2);
        return zzo;
    }
}
