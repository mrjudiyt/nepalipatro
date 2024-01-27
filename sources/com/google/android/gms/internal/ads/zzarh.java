package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzarh implements zzark {
    private static zzarh zzb;
    volatile long zza = 0;
    private final Context zzc;
    private final zzfof zzd;
    private final zzfom zze;
    private final zzfoo zzf;
    private final zzasj zzg;
    /* access modifiers changed from: private */
    public final zzfmq zzh;
    private final Executor zzi;
    private final zzfol zzj;
    private final CountDownLatch zzk;
    private final zzasy zzl;
    private final zzasq zzm;
    private final zzash zzn;
    /* access modifiers changed from: private */
    public final Object zzo = new Object();
    /* access modifiers changed from: private */
    public volatile boolean zzp;
    private volatile boolean zzq = false;
    private final int zzr;

    zzarh(Context context, zzfmq zzfmq, zzfof zzfof, zzfom zzfom, zzfoo zzfoo, zzasj zzasj, Executor executor, zzfml zzfml, int i10, zzasy zzasy, zzasq zzasq, zzash zzash) {
        this.zzc = context;
        this.zzh = zzfmq;
        this.zzd = zzfof;
        this.zze = zzfom;
        this.zzf = zzfoo;
        this.zzg = zzasj;
        this.zzi = executor;
        this.zzr = i10;
        this.zzl = zzasy;
        this.zzm = zzasq;
        this.zzn = zzash;
        this.zzq = false;
        this.zzk = new CountDownLatch(1);
        this.zzj = new zzarf(this, zzfml);
    }

    public static synchronized zzarh zza(String str, Context context, boolean z10, boolean z11) {
        zzarh zzb2;
        synchronized (zzarh.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z10, z11);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzarh zzb(String str, Context context, Executor executor, boolean z10, boolean z11) {
        zzarh zzarh;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (zzarh.class) {
            if (zzb == null) {
                zzfmr zza2 = zzfms.zza();
                zza2.zza(str);
                zza2.zzc(z10);
                zzfms zzd2 = zza2.zzd();
                zzfmq zza3 = zzfmq.zza(context2, executor2, z11);
                zzars zzc2 = ((Boolean) zzba.zzc().zzb(zzbci.zzdf)).booleanValue() ? zzars.zzc(context) : null;
                zzasy zzd3 = ((Boolean) zzba.zzc().zzb(zzbci.zzdg)).booleanValue() ? zzasy.zzd(context, executor) : null;
                zzasq zzasq = ((Boolean) zzba.zzc().zzb(zzbci.zzcu)).booleanValue() ? new zzasq() : null;
                zzash zzash = ((Boolean) zzba.zzc().zzb(zzbci.zzcw)).booleanValue() ? new zzash() : null;
                zzfnj zze2 = zzfnj.zze(context2, executor2, zza3, zzd2);
                zzasi zzasi = new zzasi(context2);
                zzasj zzasj = new zzasj(zzd2, zze2, new zzasw(context2, zzasi), zzasi, zzc2, zzd3, zzasq, zzash);
                int zzb2 = zzfns.zzb(context2, zza3);
                zzfml zzfml = new zzfml();
                zzarh zzarh2 = new zzarh(context, zza3, new zzfof(context2, zzb2), new zzfom(context2, zzb2, new zzare(zza3), ((Boolean) zzba.zzc().zzb(zzbci.zzcd)).booleanValue()), new zzfoo(context2, zzasj, zza3, zzfml), zzasj, executor, zzfml, zzb2, zzd3, zzasq, zzash);
                zzb = zzarh2;
                zzarh2.zzm();
                zzb.zzp();
            }
            zzarh = zzb;
        }
        return zzarh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r12.zzh.zzd(2030, java.lang.System.currentTimeMillis() - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0117, code lost:
        r12 = r12.zzk;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x010b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzarh r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.zzfoe r3 = r12.zzt(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzaul r4 = r3.zza()
            java.lang.String r4 = r4.zzk()
            com.google.android.gms.internal.ads.zzaul r3 = r3.zza()
            java.lang.String r3 = r3.zzj()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001f:
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.zzc     // Catch:{ zzgul -> 0x012b }
            r6 = 1
            int r7 = r12.zzr     // Catch:{ zzgul -> 0x012b }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.zzfmq r11 = r12.zzh     // Catch:{ zzgul -> 0x012b }
            com.google.android.gms.internal.ads.zzfoj r3 = com.google.android.gms.internal.ads.zzfna.zza(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ zzgul -> 0x012b }
            byte[] r4 = r3.zzb     // Catch:{ zzgul -> 0x012b }
            if (r4 == 0) goto L_0x011a
            int r5 = r4.length     // Catch:{ zzgul -> 0x012b }
            if (r5 != 0) goto L_0x0037
            goto L_0x011a
        L_0x0037:
            r6 = 0
            com.google.android.gms.internal.ads.zzgsr r4 = com.google.android.gms.internal.ads.zzgsr.zzv(r4, r6, r5)     // Catch:{ NullPointerException -> 0x010b }
            com.google.android.gms.internal.ads.zzgtl r5 = com.google.android.gms.internal.ads.zzgtl.zza()     // Catch:{ NullPointerException -> 0x010b }
            com.google.android.gms.internal.ads.zzaui r4 = com.google.android.gms.internal.ads.zzaui.zzc(r4, r5)     // Catch:{ NullPointerException -> 0x010b }
            com.google.android.gms.internal.ads.zzaul r5 = r4.zzd()     // Catch:{ zzgul -> 0x012b }
            java.lang.String r5 = r5.zzk()     // Catch:{ zzgul -> 0x012b }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgul -> 0x012b }
            if (r5 != 0) goto L_0x00fc
            com.google.android.gms.internal.ads.zzaul r5 = r4.zzd()     // Catch:{ zzgul -> 0x012b }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgul -> 0x012b }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgul -> 0x012b }
            if (r5 != 0) goto L_0x00fc
            com.google.android.gms.internal.ads.zzgsr r5 = r4.zze()     // Catch:{ zzgul -> 0x012b }
            byte[] r5 = r5.zzA()     // Catch:{ zzgul -> 0x012b }
            int r5 = r5.length     // Catch:{ zzgul -> 0x012b }
            if (r5 != 0) goto L_0x006d
            goto L_0x00fc
        L_0x006d:
            com.google.android.gms.internal.ads.zzfoe r5 = r12.zzt(r2)     // Catch:{ zzgul -> 0x012b }
            if (r5 != 0) goto L_0x0074
            goto L_0x009c
        L_0x0074:
            com.google.android.gms.internal.ads.zzaul r5 = r5.zza()     // Catch:{ zzgul -> 0x012b }
            com.google.android.gms.internal.ads.zzaul r6 = r4.zzd()     // Catch:{ zzgul -> 0x012b }
            java.lang.String r6 = r6.zzk()     // Catch:{ zzgul -> 0x012b }
            java.lang.String r7 = r5.zzk()     // Catch:{ zzgul -> 0x012b }
            boolean r6 = r6.equals(r7)     // Catch:{ zzgul -> 0x012b }
            if (r6 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzaul r6 = r4.zzd()     // Catch:{ zzgul -> 0x012b }
            java.lang.String r6 = r6.zzj()     // Catch:{ zzgul -> 0x012b }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgul -> 0x012b }
            boolean r5 = r6.equals(r5)     // Catch:{ zzgul -> 0x012b }
            if (r5 != 0) goto L_0x00fc
        L_0x009c:
            com.google.android.gms.internal.ads.zzfol r5 = r12.zzj     // Catch:{ zzgul -> 0x012b }
            int r3 = r3.zzc     // Catch:{ zzgul -> 0x012b }
            com.google.android.gms.internal.ads.zzbca r6 = com.google.android.gms.internal.ads.zzbci.zzcb     // Catch:{ zzgul -> 0x012b }
            com.google.android.gms.internal.ads.zzbcg r7 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ zzgul -> 0x012b }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ zzgul -> 0x012b }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ zzgul -> 0x012b }
            boolean r6 = r6.booleanValue()     // Catch:{ zzgul -> 0x012b }
            if (r6 == 0) goto L_0x00c6
            r6 = 3
            if (r3 != r6) goto L_0x00bc
            com.google.android.gms.internal.ads.zzfom r3 = r12.zze     // Catch:{ zzgul -> 0x012b }
            boolean r3 = r3.zza(r4)     // Catch:{ zzgul -> 0x012b }
            goto L_0x00cc
        L_0x00bc:
            r6 = 4
            if (r3 != r6) goto L_0x00ce
            com.google.android.gms.internal.ads.zzfom r3 = r12.zze     // Catch:{ zzgul -> 0x012b }
            boolean r3 = r3.zzb(r4, r5)     // Catch:{ zzgul -> 0x012b }
            goto L_0x00cc
        L_0x00c6:
            com.google.android.gms.internal.ads.zzfof r3 = r12.zzd     // Catch:{ zzgul -> 0x012b }
            boolean r3 = r3.zza(r4, r5)     // Catch:{ zzgul -> 0x012b }
        L_0x00cc:
            if (r3 != 0) goto L_0x00e0
        L_0x00ce:
            com.google.android.gms.internal.ads.zzfmq r2 = r12.zzh     // Catch:{ zzgul -> 0x012b }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgul -> 0x012b }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgul -> 0x012b }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
        L_0x00dc:
            r12.countDown()
            return
        L_0x00e0:
            com.google.android.gms.internal.ads.zzfoe r3 = r12.zzt(r2)     // Catch:{ zzgul -> 0x012b }
            if (r3 == 0) goto L_0x00f9
            com.google.android.gms.internal.ads.zzfoo r4 = r12.zzf     // Catch:{ zzgul -> 0x012b }
            boolean r3 = r4.zzc(r3)     // Catch:{ zzgul -> 0x012b }
            if (r3 == 0) goto L_0x00f0
            r12.zzq = r2     // Catch:{ zzgul -> 0x012b }
        L_0x00f0:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ zzgul -> 0x012b }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.zza = r2     // Catch:{ zzgul -> 0x012b }
        L_0x00f9:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00dc
        L_0x00fc:
            com.google.android.gms.internal.ads.zzfmq r2 = r12.zzh     // Catch:{ zzgul -> 0x012b }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgul -> 0x012b }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgul -> 0x012b }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00dc
        L_0x010b:
            com.google.android.gms.internal.ads.zzfmq r2 = r12.zzh     // Catch:{ zzgul -> 0x012b }
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgul -> 0x012b }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgul -> 0x012b }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00dc
        L_0x011a:
            com.google.android.gms.internal.ads.zzfmq r2 = r12.zzh     // Catch:{ zzgul -> 0x012b }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgul -> 0x012b }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgul -> 0x012b }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00dc
        L_0x0129:
            r0 = move-exception
            goto L_0x013b
        L_0x012b:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfmq r3 = r12.zzh     // Catch:{ all -> 0x0129 }
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0129 }
            long r5 = r5 - r0
            r3.zzc(r4, r5, r2)     // Catch:{ all -> 0x0129 }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00dc
        L_0x013b:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarh.zzj(com.google.android.gms.internal.ads.zzarh):void");
    }

    private final void zzs() {
        zzasy zzasy = this.zzl;
        if (zzasy != null) {
            zzasy.zzh();
        }
    }

    private final zzfoe zzt(int i10) {
        if (!zzfns.zza(this.zzr)) {
            return null;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcb)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, (Activity) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcu)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfmt zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza3 = zza2.zza(context, (String) null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza3, (Map) null);
        return zza3;
    }

    public final String zzg(Context context) {
        zzs();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcu)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfmt zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc2 = zza2.zzc(context, (String) null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc2, (Map) null);
        return zzc2;
    }

    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcu)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfmt zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza2.zzb(context, (String) null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, (Map) null);
        return zzb2;
    }

    public final void zzk(MotionEvent motionEvent) {
        zzfmt zza2 = this.zzf.zza();
        if (zza2 != null) {
            try {
                zza2.zzd((String) null, motionEvent);
            } catch (zzfon e10) {
                this.zzh.zzc(e10.zza(), -1, e10);
            }
        }
    }

    public final void zzl(int i10, int i11, int i12) {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfoe zzt = zzt(1);
        if (zzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzt)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzash zzash = this.zzn;
        if (zzash != null) {
            zzash.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzp() {
        /*
            r6 = this;
            boolean r0 = r6.zzp
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r6.zzo
            monitor-enter(r0)
            boolean r1 = r6.zzp     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.zza     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzfoo r1 = r6.zzf     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzfoe r1 = r1.zzb()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.zzd(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r6.zzr     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.zzfns.zza(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.zzi     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzarg r2 = new com.google.android.gms.internal.ads.zzarg     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarh.zzp():void");
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
