package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzcc;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbnm {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final Context zzb;
    private final String zzc;
    private final zzcaz zzd;
    /* access modifiers changed from: private */
    public final zzfjh zze;
    private final zzbd zzf;
    private final zzbd zzg;
    /* access modifiers changed from: private */
    public zzbnl zzh;
    /* access modifiers changed from: private */
    public int zzi = 1;

    public zzbnm(Context context, zzcaz zzcaz, String str, zzbd zzbd, zzbd zzbd2, zzfjh zzfjh) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcaz;
        this.zze = zzfjh;
        this.zzf = zzbd;
        this.zzg = zzbd2;
    }

    public final zzbng zzb(zzaro zzaro) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbnl zzbnl = this.zzh;
                if (zzbnl != null && this.zzi == 0) {
                    zzbnl.zzi(new zzbms(this), zzbmt.zza);
                }
            }
            zzbnl zzbnl2 = this.zzh;
            if (zzbnl2 != null) {
                if (zzbnl2.zze() != -1) {
                    int i10 = this.zzi;
                    if (i10 == 0) {
                        zzbng zza2 = this.zzh.zza();
                        return zza2;
                    } else if (i10 == 1) {
                        this.zzi = 2;
                        zzd((zzaro) null);
                        zzbng zza3 = this.zzh.zza();
                        return zza3;
                    } else {
                        zzbng zza4 = this.zzh.zza();
                        return zza4;
                    }
                }
            }
            this.zzi = 2;
            zzbnl zzd2 = zzd((zzaro) null);
            this.zzh = zzd2;
            zzbng zza5 = zzd2.zza();
            return zza5;
        }
    }

    /* access modifiers changed from: protected */
    public final zzbnl zzd(zzaro zzaro) {
        zzfit zza2 = zzfis.zza(this.zzb, 6);
        zza2.zzh();
        zzbnl zzbnl = new zzbnl(this.zzg);
        zzcbg.zze.execute(new zzbmw(this, (zzaro) null, zzbnl));
        zzbnl.zzi(new zzbnb(this, zzbnl, zza2), new zzbnc(this, zzbnl, zza2));
        return zzbnl;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0081, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzbnl r5, com.google.android.gms.internal.ads.zzbmh r6, java.util.ArrayList r7, long r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            int r1 = r5.zze()     // Catch:{ all -> 0x0082 }
            r2 = -1
            if (r1 == r2) goto L_0x0080
            int r1 = r5.zze()     // Catch:{ all -> 0x0082 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0080
        L_0x0012:
            r5.zzg()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzgad r1 = com.google.android.gms.internal.ads.zzcbg.zze     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzbmu r2 = new com.google.android.gms.internal.ads.zzbmu     // Catch:{ all -> 0x0082 }
            r2.<init>(r6)     // Catch:{ all -> 0x0082 }
            r1.execute(r2)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzbca r6 = com.google.android.gms.internal.ads.zzbci.zzc     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0082 }
            java.lang.Object r6 = r1.zzb(r6)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0082 }
            int r5 = r5.zze()     // Catch:{ all -> 0x0082 }
            int r1 = r4.zzi     // Catch:{ all -> 0x0082 }
            r2 = 0
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzt.zzB()     // Catch:{ all -> 0x0082 }
            long r2 = r2.currentTimeMillis()     // Catch:{ all -> 0x0082 }
            long r2 = r2 - r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r8.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r9 = "Could not receive /jsLoaded in "
            r8.append(r9)     // Catch:{ all -> 0x0082 }
            r8.append(r6)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = " ms. JS engine session reference status(onEngLoadedTimeout) is "
            r8.append(r6)     // Catch:{ all -> 0x0082 }
            r8.append(r5)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = ". Update status(onEngLoadedTimeout) is "
            r8.append(r5)     // Catch:{ all -> 0x0082 }
            r8.append(r1)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is "
            r8.append(r5)     // Catch:{ all -> 0x0082 }
            r8.append(r7)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = " ms. Total latency(onEngLoadedTimeout) is "
            r8.append(r5)     // Catch:{ all -> 0x0082 }
            r8.append(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = " ms. Rejecting."
            r8.append(r5)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return
        L_0x0082:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbnm.zzi(com.google.android.gms.internal.ads.zzbnl, com.google.android.gms.internal.ads.zzbmh, java.util.ArrayList, long):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzaro zzaro, zzbnl zzbnl) {
        long currentTimeMillis = zzt.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            zzbmp zzbmp = new zzbmp(this.zzb, this.zzd, (zzaro) null, (zza) null);
            zzbmp.zzk(new zzbmv(this, arrayList, currentTimeMillis, zzbnl, zzbmp));
            zzbmp.zzq("/jsLoaded", new zzbmx(this, currentTimeMillis, zzbnl, zzbmp));
            zzcc zzcc = new zzcc();
            zzbmy zzbmy = new zzbmy(this, (zzaro) null, zzbmp, zzcc);
            zzcc.zzb(zzbmy);
            zzbmp.zzq("/requestReload", zzbmy);
            if (this.zzc.endsWith(".js")) {
                zzbmp.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbmp.zzf(this.zzc);
            } else {
                zzbmp.zzg(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new zzbna(this, zzbnl, zzbmp, arrayList, currentTimeMillis), (long) ((Integer) zzba.zzc().zzb(zzbci.zzd)).intValue());
        } catch (Throwable th) {
            zzcat.zzh("Error creating webview.", th);
            zzt.zzo().zzu(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbnl.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzbmh zzbmh) {
        if (zzbmh.zzi()) {
            this.zzi = 1;
        }
    }
}
