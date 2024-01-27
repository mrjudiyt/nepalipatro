package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeyx extends zzbt implements zzo, zzawj {
    protected zzcqp zza;
    private final zzchw zzb;
    private final Context zzc;
    private AtomicBoolean zzd = new AtomicBoolean();
    private final String zze;
    private final zzeyr zzf;
    /* access modifiers changed from: private */
    public final zzeyp zzg;
    private final zzcaz zzh;
    /* access modifiers changed from: private */
    public final zzdso zzi;
    private long zzj = -1;
    private zzcqd zzk;

    public zzeyx(zzchw zzchw, Context context, String str, zzeyr zzeyr, zzeyp zzeyp, zzcaz zzcaz, zzdso zzdso) {
        this.zzb = zzchw;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzeyr;
        this.zzg = zzeyp;
        this.zzh = zzcaz;
        this.zzi = zzdso;
        zzeyp.zzm(this);
    }

    private final synchronized void zzq(int i10) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcqd zzcqd = this.zzk;
            if (zzcqd != null) {
                zzt.zzb().zze(zzcqd);
            }
            if (this.zza != null) {
                long j10 = -1;
                if (this.zzj != -1) {
                    j10 = zzt.zzB().elapsedRealtime() - this.zzj;
                }
                this.zza.zze(j10, i10);
            }
            zzx();
        }
    }

    public final synchronized void zzA() {
    }

    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zzC(zzbe zzbe) {
    }

    public final void zzD(zzbh zzbh) {
    }

    public final void zzE(zzby zzby) {
    }

    public final synchronized void zzF(zzq zzq) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    public final void zzG(zzcb zzcb) {
    }

    public final void zzH(zzaws zzaws) {
        this.zzg.zzo(zzaws);
    }

    public final void zzI(zzw zzw) {
        this.zzf.zzl(zzw);
    }

    public final void zzJ(zzci zzci) {
    }

    public final void zzK(zzdu zzdu) {
    }

    public final void zzL(boolean z10) {
    }

    public final void zzM(zzbte zzbte) {
    }

    public final synchronized void zzN(boolean z10) {
    }

    public final synchronized void zzO(zzbdg zzbdg) {
    }

    public final void zzP(zzdg zzdg) {
    }

    public final void zzQ(zzbth zzbth, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzbwc zzbwc) {
    }

    public final void zzT(String str) {
    }

    public final synchronized void zzU(zzfl zzfl) {
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final synchronized void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.zzf.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final void zza() {
        zzq(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC, Splitter:B:25:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbdn r0 = com.google.android.gms.internal.ads.zzbdz.zzd     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzkm     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzcaz r2 = r5.zzh     // Catch:{ all -> 0x0087 }
            int r2 = r2.zzc     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbci.zzkn     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0087 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x0087 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0087 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0087 }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0087 }
        L_0x0042:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ all -> 0x0087 }
            android.content.Context r0 = r5.zzc     // Catch:{ all -> 0x0087 }
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzG(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcat.zzg(r6)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeyp r6 = r5.zzg     // Catch:{ all -> 0x0087 }
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfeo.zzd(r0, r2, r2)     // Catch:{ all -> 0x0087 }
            r6.zzbF(r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            boolean r0 = r5.zzY()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006c
            monitor-exit(r5)
            return r1
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0087 }
            r0.<init>()     // Catch:{ all -> 0x0087 }
            r5.zzd = r0     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeyv r0 = new com.google.android.gms.internal.ads.zzeyv     // Catch:{ all -> 0x0087 }
            r0.<init>(r5)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeyr r1 = r5.zzf     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r5.zze     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeyw r3 = new com.google.android.gms.internal.ads.zzeyw     // Catch:{ all -> 0x0087 }
            r3.<init>(r5)     // Catch:{ all -> 0x0087 }
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r6
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyx.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    public final synchronized void zzab(zzcf zzcf) {
    }

    public final void zzbL() {
    }

    public final void zzbo() {
    }

    public final void zzbu() {
    }

    public final synchronized void zzbv() {
        if (this.zza != null) {
            this.zzj = zzt.zzB().elapsedRealtime();
            int zza2 = this.zza.zza();
            if (zza2 > 0) {
                zzcqd zzcqd = new zzcqd(this.zzb.zzC(), zzt.zzB());
                this.zzk = zzcqd;
                zzcqd.zzd(zza2, new zzeyu(this));
            }
        }
    }

    public final synchronized void zzbx() {
        zzcqp zzcqp = this.zza;
        if (zzcqp != null) {
            zzcqp.zze(zzt.zzB().elapsedRealtime() - this.zzj, 1);
        }
    }

    public final void zzby(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 0) {
                zzq(2);
            } else if (i11 == 1) {
                zzq(4);
            } else if (i11 != 2) {
                zzq(6);
            } else {
                zzq(3);
            }
        } else {
            throw null;
        }
    }

    public final Bundle zzd() {
        return new Bundle();
    }

    public final synchronized zzq zzg() {
        return null;
    }

    public final zzbh zzi() {
        return null;
    }

    public final zzcb zzj() {
        return null;
    }

    public final synchronized zzdn zzk() {
        return null;
    }

    public final synchronized zzdq zzl() {
        return null;
    }

    public final IObjectWrapper zzn() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        this.zzb.zzB().execute(new zzeyt(this));
    }

    public final synchronized String zzr() {
        return this.zze;
    }

    public final synchronized String zzs() {
        return null;
    }

    public final synchronized String zzt() {
        return null;
    }

    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcqp zzcqp = this.zza;
        if (zzcqp != null) {
            zzcqp.zzb();
        }
    }

    public final void zzy(zzl zzl, zzbk zzbk) {
    }

    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
