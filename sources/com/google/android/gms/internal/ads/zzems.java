package com.google.android.gms.internal.ads;

import android.app.Activity;
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
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzems extends zzbt {
    private final zzq zza;
    private final Context zzb;
    private final zzfau zzc;
    private final String zzd;
    private final zzcaz zze;
    private final zzemk zzf;
    private final zzfbu zzg;
    private final zzaro zzh;
    private final zzdso zzi;
    /* access modifiers changed from: private */
    public zzdfw zzj;
    private boolean zzk = ((Boolean) zzba.zzc().zzb(zzbci.zzaC)).booleanValue();

    public zzems(Context context, zzq zzq, String str, zzfau zzfau, zzemk zzemk, zzfbu zzfbu, zzcaz zzcaz, zzaro zzaro, zzdso zzdso) {
        this.zza = zzq;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfau;
        this.zzf = zzemk;
        this.zzg = zzfbu;
        this.zze = zzcaz;
        this.zzh = zzaro;
        this.zzi = zzdso;
    }

    private final synchronized boolean zze() {
        zzdfw zzdfw;
        zzdfw = this.zzj;
        return zzdfw != null && !zzdfw.zza();
    }

    public final void zzA() {
    }

    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdfw zzdfw = this.zzj;
        if (zzdfw != null) {
            zzdfw.zzm().zzc((Context) null);
        }
    }

    public final void zzC(zzbe zzbe) {
    }

    public final void zzD(zzbh zzbh) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbh);
    }

    public final void zzE(zzby zzby) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void zzF(zzq zzq) {
    }

    public final void zzG(zzcb zzcb) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcb);
    }

    public final void zzH(zzaws zzaws) {
    }

    public final void zzI(zzw zzw) {
    }

    public final void zzJ(zzci zzci) {
        this.zzf.zzn(zzci);
    }

    public final void zzK(zzdu zzdu) {
    }

    public final synchronized void zzL(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z10;
    }

    public final void zzM(zzbte zzbte) {
    }

    public final void zzN(boolean z10) {
    }

    public final synchronized void zzO(zzbdg zzbdg) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbdg);
    }

    public final void zzP(zzdg zzdg) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdg.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e10) {
            zzcat.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzf.zzl(zzdg);
    }

    public final void zzQ(zzbth zzbth, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzbwc zzbwc) {
        this.zzg.zzm(zzbwc);
    }

    public final void zzT(String str) {
    }

    public final void zzU(zzfl zzfl) {
    }

    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            zzcat.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzp(zzfeo.zzd(9, (String) null, (zze) null));
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcw)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            zzcat.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzp(zzfeo.zzd(9, (String) null, (zze) null));
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcw)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) null);
    }

    public final synchronized boolean zzY() {
        return this.zzc.zza();
    }

    public final synchronized boolean zzZ() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065 A[SYNTHETIC, Splitter:B:21:0x0065] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbdn r0 = com.google.android.gms.internal.ads.zzbdz.zzi     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzkm     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzcaz r2 = r5.zze     // Catch:{ all -> 0x008c }
            int r2 = r2.zzc     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbci.zzkn     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x008c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x008c }
            int r3 = r3.intValue()     // Catch:{ all -> 0x008c }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x008c }
        L_0x0042:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ all -> 0x008c }
            android.content.Context r0 = r5.zzb     // Catch:{ all -> 0x008c }
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzG(r0)     // Catch:{ all -> 0x008c }
            r2 = 0
            if (r0 == 0) goto L_0x0065
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0065
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcat.zzg(r6)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzemk r6 = r5.zzf     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0063
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfeo.zzd(r0, r2, r2)     // Catch:{ all -> 0x008c }
            r6.zzbF(r0)     // Catch:{ all -> 0x008c }
        L_0x0063:
            monitor-exit(r5)
            return r1
        L_0x0065:
            boolean r0 = r5.zze()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            monitor-exit(r5)
            return r1
        L_0x006d:
            android.content.Context r0 = r5.zzb     // Catch:{ all -> 0x008c }
            boolean r1 = r6.zzf     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzfei.zza(r0, r1)     // Catch:{ all -> 0x008c }
            r5.zzj = r2     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzfau r0 = r5.zzc     // Catch:{ all -> 0x008c }
            java.lang.String r1 = r5.zzd     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.internal.client.zzq r2 = r5.zza     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzfan r3 = new com.google.android.gms.internal.ads.zzfan     // Catch:{ all -> 0x008c }
            r3.<init>(r2)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzemr r2 = new com.google.android.gms.internal.ads.zzemr     // Catch:{ all -> 0x008c }
            r2.<init>(r5)     // Catch:{ all -> 0x008c }
            boolean r6 = r0.zzb(r6, r1, r3, r2)     // Catch:{ all -> 0x008c }
            monitor-exit(r5)
            return r6
        L_0x008c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzems.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    public final void zzab(zzcf zzcf) {
    }

    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final zzq zzg() {
        return null;
    }

    public final zzbh zzi() {
        return this.zzf.zzg();
    }

    public final zzcb zzj() {
        return this.zzf.zzi();
    }

    public final synchronized zzdn zzk() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzgJ)).booleanValue()) {
            return null;
        }
        zzdfw zzdfw = this.zzj;
        if (zzdfw == null) {
            return null;
        }
        return zzdfw.zzl();
    }

    public final zzdq zzl() {
        return null;
    }

    public final IObjectWrapper zzn() {
        return null;
    }

    public final synchronized String zzr() {
        return this.zzd;
    }

    public final synchronized String zzs() {
        zzdfw zzdfw = this.zzj;
        if (zzdfw == null || zzdfw.zzl() == null) {
            return null;
        }
        return zzdfw.zzl().zzg();
    }

    public final synchronized String zzt() {
        zzdfw zzdfw = this.zzj;
        if (zzdfw == null || zzdfw.zzl() == null) {
            return null;
        }
        return zzdfw.zzl().zzg();
    }

    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdfw zzdfw = this.zzj;
        if (zzdfw != null) {
            zzdfw.zzm().zza((Context) null);
        }
    }

    public final void zzy(zzl zzl, zzbk zzbk) {
        this.zzf.zzk(zzbk);
        zzaa(zzl);
    }

    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdfw zzdfw = this.zzj;
        if (zzdfw != null) {
            zzdfw.zzm().zzb((Context) null);
        }
    }
}
