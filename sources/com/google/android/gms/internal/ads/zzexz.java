package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzexz implements zzena {
    protected final zzchw zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public final zzeyp zzd;
    /* access modifiers changed from: private */
    public final zzfai zze;
    private final zzcaz zzf;
    private final ViewGroup zzg;
    /* access modifiers changed from: private */
    public final zzfjh zzh;
    private final zzfdl zzi;
    /* access modifiers changed from: private */
    public e zzj;

    protected zzexz(Context context, Executor executor, zzchw zzchw, zzfai zzfai, zzeyp zzeyp, zzfdl zzfdl, zzcaz zzcaz) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzchw;
        this.zze = zzfai;
        this.zzd = zzeyp;
        this.zzi = zzfdl;
        this.zzf = zzcaz;
        this.zzg = new FrameLayout(context);
        this.zzh = zzchw.zzz();
    }

    /* access modifiers changed from: private */
    public final synchronized zzcwr zzm(zzfag zzfag) {
        zzexy zzexy = (zzexy) zzfag;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhV)).booleanValue()) {
            zzcqs zzcqs = new zzcqs(this.zzg);
            zzcwt zzcwt = new zzcwt();
            zzcwt.zze(this.zzb);
            zzcwt.zzi(zzexy.zza);
            zzcwv zzj2 = zzcwt.zzj();
            zzdda zzdda = new zzdda();
            zzdda.zzc(this.zzd, this.zzc);
            zzdda.zzl(this.zzd, this.zzc);
            return zze(zzcqs, zzj2, zzdda.zzn());
        }
        zzeyp zzi2 = zzeyp.zzi(this.zzd);
        zzdda zzdda2 = new zzdda();
        zzdda2.zzb(zzi2, this.zzc);
        zzdda2.zzg(zzi2, this.zzc);
        zzdda2.zzh(zzi2, this.zzc);
        zzdda2.zzi(zzi2, this.zzc);
        zzdda2.zzc(zzi2, this.zzc);
        zzdda2.zzl(zzi2, this.zzc);
        zzdda2.zzm(zzi2);
        zzcqs zzcqs2 = new zzcqs(this.zzg);
        zzcwt zzcwt2 = new zzcwt();
        zzcwt2.zze(this.zzb);
        zzcwt2.zzi(zzexy.zza);
        return zze(zzcqs2, zzcwt2.zzj(), zzdda2.zzn());
    }

    public final boolean zza() {
        e eVar = this.zzj;
        return eVar != null && !eVar.isDone();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC, Splitter:B:16:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzemy r10, com.google.android.gms.internal.ads.zzemz r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.zzbdn r10 = com.google.android.gms.internal.ads.zzbdz.zzd     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.zze()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.zzbca r10 = com.google.android.gms.internal.ads.zzbci.zzkm     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r2.zzb(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x0025
            r10 = 1
            goto L_0x0026
        L_0x0025:
            r10 = 0
        L_0x0026:
            com.google.android.gms.internal.ads.zzcaz r2 = r7.zzf     // Catch:{ all -> 0x00f4 }
            int r2 = r2.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbci.zzkn     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00f4 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00f4 }
            if (r2 < r3) goto L_0x003e
            if (r10 != 0) goto L_0x0043
        L_0x003e:
            java.lang.String r10 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r10)     // Catch:{ all -> 0x00f4 }
        L_0x0043:
            if (r9 != 0) goto L_0x0056
            java.lang.String r8 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.internal.ads.zzcat.zzg(r8)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r8 = r7.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzext r9 = new com.google.android.gms.internal.ads.zzext     // Catch:{ all -> 0x00f4 }
            r9.<init>(r7)     // Catch:{ all -> 0x00f4 }
            r8.execute(r9)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r1
        L_0x0056:
            com.google.common.util.concurrent.e r10 = r7.zzj     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x005c
            monitor-exit(r7)
            return r1
        L_0x005c:
            com.google.android.gms.internal.ads.zzbdn r10 = com.google.android.gms.internal.ads.zzbdu.zzc     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.zze()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r1 = 7
            r2 = 0
            if (r10 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzfai r10 = r7.zze     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r10.zzd()     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x0088
            java.lang.Object r10 = r10.zzd()     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzcqf r10 = (com.google.android.gms.internal.ads.zzcqf) r10     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfje r10 = r10.zzh()     // Catch:{ all -> 0x00f4 }
            r10.zzh(r1)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = r8.zzp     // Catch:{ all -> 0x00f4 }
            r10.zzb(r3)     // Catch:{ all -> 0x00f4 }
            r4 = r10
            goto L_0x0089
        L_0x0088:
            r4 = r2
        L_0x0089:
            android.content.Context r10 = r7.zzb     // Catch:{ all -> 0x00f4 }
            boolean r3 = r8.zzf     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfei.zza(r10, r3)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbca r10 = com.google.android.gms.internal.ads.zzbci.zziF     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r3.zzb(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            boolean r10 = r8.zzf     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzchw r10 = r7.zza     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzdvm r10 = r10.zzk()     // Catch:{ all -> 0x00f4 }
            r10.zzn(r0)     // Catch:{ all -> 0x00f4 }
        L_0x00af:
            com.google.android.gms.internal.ads.zzfdl r10 = r7.zzi     // Catch:{ all -> 0x00f4 }
            r10.zzs(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.ads.internal.client.zzq r9 = com.google.android.gms.ads.internal.client.zzq.zzb()     // Catch:{ all -> 0x00f4 }
            r10.zzr(r9)     // Catch:{ all -> 0x00f4 }
            r10.zzE(r8)     // Catch:{ all -> 0x00f4 }
            android.content.Context r9 = r7.zzb     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfdn r10 = r10.zzG()     // Catch:{ all -> 0x00f4 }
            int r3 = com.google.android.gms.internal.ads.zzfjd.zzf(r10)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfit r5 = com.google.android.gms.internal.ads.zzfis.zzb(r9, r3, r1, r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzexy r6 = new com.google.android.gms.internal.ads.zzexy     // Catch:{ all -> 0x00f4 }
            r6.<init>(r2)     // Catch:{ all -> 0x00f4 }
            r6.zza = r10     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfai r8 = r7.zze     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfaj r9 = new com.google.android.gms.internal.ads.zzfaj     // Catch:{ all -> 0x00f4 }
            r9.<init>(r6, r2)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzexu r10 = new com.google.android.gms.internal.ads.zzexu     // Catch:{ all -> 0x00f4 }
            r10.<init>(r7)     // Catch:{ all -> 0x00f4 }
            com.google.common.util.concurrent.e r8 = r8.zzc(r9, r10, r2)     // Catch:{ all -> 0x00f4 }
            r7.zzj = r8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzexw r9 = new com.google.android.gms.internal.ads.zzexw     // Catch:{ all -> 0x00f4 }
            r1 = r9
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r10 = r7.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfzt.zzr(r8, r9, r10)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r0
        L_0x00f4:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexz.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzemy, com.google.android.gms.internal.ads.zzemz):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract zzcwr zze(zzcqs zzcqs, zzcwv zzcwv, zzddc zzddc);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzd.zzbF(zzfeo.zzd(6, (String) null, (zze) null));
    }

    public final void zzl(zzw zzw) {
        this.zzi.zzt(zzw);
    }
}
