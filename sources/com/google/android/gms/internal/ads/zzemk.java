package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzemk implements AppEventListener, zzdag, zzcyz, zzcxo, zzcyf, zza, zzcxl, zzczw, zzcyb, zzdfd {
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) zzba.zzc().zzb(zzbci.zziC)).intValue());
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final zzfib zzj;

    public zzemk(zzfib zzfib) {
        this.zzj = zzfib;
    }

    private final void zzo() {
        if (this.zzh.get() && this.zzi.get()) {
            for (Pair zzelv : this.zza) {
                zzezw.zza(this.zzc, new zzelv(zzelv));
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    public final void onAdClicked() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzjU)).booleanValue()) {
            zzezw.zza(this.zzb, zzemi.zza);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onAppEvent(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzg     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.BlockingQueue r0 = r3.zza     // Catch:{ all -> 0x0042 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.internal.ads.zzcat.zze(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzfib r0 = r3.zzj     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "dae_action"
            com.google.android.gms.internal.ads.zzfia r1 = com.google.android.gms.internal.ads.zzfia.zzb(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "dae_name"
            r1.zza(r2, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "dae_data"
            r1.zza(r4, r5)     // Catch:{ all -> 0x0042 }
            r0.zzb(r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzc     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzemc r1 = new com.google.android.gms.internal.ads.zzemc     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzezw.zza(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemk.onAppEvent(java.lang.String, java.lang.String):void");
    }

    public final void zza() {
        zzezw.zza(this.zzb, zzels.zza);
        zzezw.zza(this.zzf, zzelt.zza);
    }

    public final void zzb() {
        zzezw.zza(this.zzb, zzemd.zza);
    }

    public final void zzbF(zze zze2) {
        zzezw.zza(this.zzb, new zzelw(zze2));
        zzezw.zza(this.zzb, new zzelx(zze2));
        zzezw.zza(this.zze, new zzely(zze2));
        this.zzg.set(false);
        this.zza.clear();
    }

    public final void zzbK() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjU)).booleanValue()) {
            zzezw.zza(this.zzb, zzemi.zza);
        }
        zzezw.zza(this.zzf, zzelu.zza);
    }

    public final void zzbr(zzbvg zzbvg) {
    }

    public final void zzbs(zzfde zzfde) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    public final void zzbw(zzbvw zzbvw, String str, String str2) {
    }

    public final void zzc() {
        zzezw.zza(this.zzb, zzemf.zza);
        zzezw.zza(this.zzf, zzemg.zza);
        zzezw.zza(this.zzf, zzemh.zza);
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final synchronized zzbh zzg() {
        return (zzbh) this.zzb.get();
    }

    public final void zzh(zzs zzs) {
        zzezw.zza(this.zzd, new zzemj(zzs));
    }

    public final synchronized zzcb zzi() {
        return (zzcb) this.zzc.get();
    }

    public final void zzj(zzbh zzbh) {
        this.zzb.set(zzbh);
    }

    public final void zzk(zzbk zzbk) {
        this.zze.set(zzbk);
    }

    public final void zzl(zzdg zzdg) {
        this.zzd.set(zzdg);
    }

    public final void zzm(zzcb zzcb) {
        this.zzc.set(zzcb);
        this.zzh.set(true);
        zzo();
    }

    public final void zzn(zzci zzci) {
        this.zzf.set(zzci);
    }

    public final void zzp(zze zze2) {
        zzezw.zza(this.zzf, new zzemb(zze2));
    }

    public final void zzq() {
        zzezw.zza(this.zzb, zzelr.zza);
    }

    public final synchronized void zzr() {
        zzezw.zza(this.zzb, zzelz.zza);
        zzezw.zza(this.zze, zzema.zza);
        this.zzi.set(true);
        zzo();
    }

    public final void zzs() {
        zzezw.zza(this.zzb, zzeme.zza);
    }
}
