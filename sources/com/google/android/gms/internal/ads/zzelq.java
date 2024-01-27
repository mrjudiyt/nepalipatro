package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
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
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzelq extends zzbt implements zzdab {
    private final Context zza;
    private final zzezd zzb;
    private final String zzc;
    private final zzemk zzd;
    private zzq zze;
    private final zzfdl zzf;
    private final zzcaz zzg;
    private final zzdso zzh;
    /* access modifiers changed from: private */
    public zzcqv zzi;

    public zzelq(Context context, zzq zzq, String str, zzezd zzezd, zzemk zzemk, zzcaz zzcaz, zzdso zzdso) {
        this.zza = context;
        this.zzb = zzezd;
        this.zze = zzq;
        this.zzc = str;
        this.zzd = zzemk;
        this.zzf = zzezd.zzi();
        this.zzg = zzcaz;
        this.zzh = zzdso;
        zzezd.zzp(this);
    }

    private final synchronized void zze(zzq zzq) {
        this.zzf.zzr(zzq);
        this.zzf.zzw(this.zze.zzn);
    }

    private final synchronized boolean zzf(zzl zzl) {
        if (zzh()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        zzt.zzp();
        if (!com.google.android.gms.ads.internal.util.zzt.zzG(this.zza) || zzl.zzs != null) {
            zzfei.zza(this.zza, zzl.zzf);
            return this.zzb.zzb(zzl, this.zzc, (zzemy) null, new zzelp(this));
        }
        zzcat.zzg("Failed to load the ad because app ID is missing.");
        zzemk zzemk = this.zzd;
        if (zzemk != null) {
            zzemk.zzbF(zzfeo.zzd(4, (String) null, (zze) null));
        }
        return false;
    }

    private final boolean zzh() {
        boolean z10;
        if (((Boolean) zzbdz.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                z10 = true;
                return this.zzg.zzc >= ((Integer) zzba.zzc().zzb(zzbci.zzkn)).intValue() || !z10;
            }
        }
        z10 = false;
        if (this.zzg.zzc >= ((Integer) zzba.zzc().zzb(zzbci.zzkn)).intValue()) {
        }
    }

    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcqv zzcqv = this.zzi;
        if (zzcqv != null) {
            zzcqv.zzg();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzko)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbdn r0 = com.google.android.gms.internal.ads.zzbdz.zzh     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzki     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzcaz r0 = r3.zzg     // Catch:{ all -> 0x004c }
            int r0 = r0.zzc     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzko     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcqv r0 = r3.zzi     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzcyk r0 = r0.zzm()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.zzc(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelq.zzB():void");
    }

    public final void zzC(zzbe zzbe) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbe);
    }

    public final void zzD(zzbh zzbh) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzbh);
    }

    public final void zzE(zzby zzby) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final synchronized void zzF(zzq zzq) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzr(zzq);
        this.zze = zzq;
        zzcqv zzcqv = this.zzi;
        if (zzcqv != null) {
            zzcqv.zzh(this.zzb.zzd(), zzq);
        }
    }

    public final void zzG(zzcb zzcb) {
        if (zzh()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzcb);
    }

    public final void zzH(zzaws zzaws) {
    }

    public final void zzI(zzw zzw) {
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
        if (zzh()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzy(z10);
    }

    public final synchronized void zzO(zzbdg zzbdg) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbdg);
    }

    public final void zzP(zzdg zzdg) {
        if (zzh()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdg.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e10) {
            zzcat.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzd.zzl(zzdg);
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
        if (zzh()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzF(zzfl);
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.zzb.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final synchronized void zza() {
        if (this.zzb.zzr()) {
            zzq zzg2 = this.zzf.zzg();
            zzcqv zzcqv = this.zzi;
            if (!(zzcqv == null || zzcqv.zzf() == null || !this.zzf.zzO())) {
                zzg2 = zzfdr.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
            }
            zze(zzg2);
            try {
                zzf(this.zzf.zze());
            } catch (RemoteException unused) {
                zzcat.zzj("Failed to refresh the banner ad.");
            }
        } else {
            this.zzb.zzn();
        }
    }

    public final synchronized boolean zzaa(zzl zzl) {
        zze(this.zze);
        return zzf(zzl);
    }

    public final synchronized void zzab(zzcf zzcf) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzQ(zzcf);
    }

    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcqv zzcqv = this.zzi;
        if (zzcqv != null) {
            return zzfdr.zza(this.zza, Collections.singletonList(zzcqv.zze()));
        }
        return this.zzf.zzg();
    }

    public final zzbh zzi() {
        return this.zzd.zzg();
    }

    public final zzcb zzj() {
        return this.zzd.zzi();
    }

    public final synchronized zzdn zzk() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzgJ)).booleanValue()) {
            return null;
        }
        zzcqv zzcqv = this.zzi;
        if (zzcqv == null) {
            return null;
        }
        return zzcqv.zzl();
    }

    public final synchronized zzdq zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcqv zzcqv = this.zzi;
        if (zzcqv == null) {
            return null;
        }
        return zzcqv.zzd();
    }

    public final IObjectWrapper zzn() {
        if (zzh()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    public final synchronized String zzr() {
        return this.zzc;
    }

    public final synchronized String zzs() {
        zzcqv zzcqv = this.zzi;
        if (zzcqv == null || zzcqv.zzl() == null) {
            return null;
        }
        return zzcqv.zzl().zzg();
    }

    public final synchronized String zzt() {
        zzcqv zzcqv = this.zzi;
        if (zzcqv == null || zzcqv.zzl() == null) {
            return null;
        }
        return zzcqv.zzl().zzg();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzko)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbdn r0 = com.google.android.gms.internal.ads.zzbdz.zze     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzkj     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzcaz r0 = r3.zzg     // Catch:{ all -> 0x0047 }
            int r0 = r0.zzc     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzko     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0047 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0047 }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcqv r0 = r3.zzi     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            r0.zzb()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0045:
            monitor-exit(r3)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelq.zzx():void");
    }

    public final void zzy(zzl zzl, zzbk zzbk) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzko)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbdn r0 = com.google.android.gms.internal.ads.zzbdz.zzg     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzkk     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzcaz r0 = r3.zzg     // Catch:{ all -> 0x004c }
            int r0 = r0.zzc     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzko     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcqv r0 = r3.zzi     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzcyk r0 = r0.zzm()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.zzb(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelq.zzz():void");
    }
}
