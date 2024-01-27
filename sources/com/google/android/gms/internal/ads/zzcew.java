package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.firebase.sessions.settings.RemoteSettings;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcew extends zzcen implements zzccs {
    public static final /* synthetic */ int zzd = 0;
    private zzcct zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcef zzi;
    private long zzj;
    private long zzk;

    public zzcew(zzcdc zzcdc, zzcdb zzcdb) {
        super(zzcdc);
        zzcfo zzcfo = new zzcfo(zzcdc.getContext(), zzcdb, (zzcdc) this.zzc.get(), (Integer) null);
        zzcat.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcfo;
        zzcfo.zzL(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzcam.zze(str)));
    }

    private static String zzd(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + RemoteSettings.FORWARD_SLASH_STRING + canonicalName + CertificateUtil.DELIMITER + message;
    }

    private final void zzx(long j10) {
        zzt.zza.postDelayed(new zzcev(this), j10);
    }

    public final void release() {
        zzcct zzcct = this.zze;
        if (zzcct != null) {
            zzcct.zzL((zzccs) null);
            this.zze.zzH();
        }
    }

    public final void zzD(int i10, int i11) {
    }

    public final zzcct zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL((zzccs) null);
        zzcct zzcct = this.zze;
        this.zze = null;
        return zzcct;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.google.android.gms.internal.ads.zzcew} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.google.android.gms.internal.ads.zzcew} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: com.google.android.gms.internal.ads.zzcew} */
    /* JADX WARNING: type inference failed for: r2v11, types: [boolean] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0110, code lost:
        r2.zzx(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzy)).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzb() {
        /*
            r32 = this;
            r15 = r32
            java.lang.String r0 = r15.zzf
            java.lang.String r13 = zzc(r0)
            java.lang.String r17 = "error"
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzx     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ Exception -> 0x016d }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ Exception -> 0x016d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x016d }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x016d }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzw     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ Exception -> 0x016d }
            java.lang.Object r2 = r3.zzb(r2)     // Catch:{ Exception -> 0x016d }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x016d }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x016d }
            long r11 = (long) r2     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzbO     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ Exception -> 0x016d }
            java.lang.Object r2 = r3.zzb(r2)     // Catch:{ Exception -> 0x016d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x016d }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x016d }
            monitor-enter(r32)     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzB()     // Catch:{ all -> 0x0166 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x0166 }
            long r5 = r15.zzj     // Catch:{ all -> 0x0166 }
            long r3 = r3 - r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0140
            boolean r0 = r15.zzg     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0130
            boolean r0 = r15.zzh     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x005b
            monitor-exit(r32)     // Catch:{ all -> 0x0166 }
            r2 = r15
            goto L_0x01a9
        L_0x005b:
            com.google.android.gms.internal.ads.zzcct r0 = r15.zze     // Catch:{ all -> 0x0166 }
            boolean r0 = r0.zzV()     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0124
            com.google.android.gms.internal.ads.zzcct r0 = r15.zze     // Catch:{ all -> 0x0166 }
            long r9 = r0.zzz()     // Catch:{ all -> 0x0166 }
            r18 = 0
            int r0 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x010d
            com.google.android.gms.internal.ads.zzcct r0 = r15.zze     // Catch:{ all -> 0x0166 }
            long r6 = r0.zzv()     // Catch:{ all -> 0x0166 }
            long r0 = r15.zzk     // Catch:{ all -> 0x0166 }
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x00e0
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            r0 = 1
            r8 = 1
            goto L_0x0084
        L_0x0082:
            r0 = 0
            r8 = 0
        L_0x0084:
            java.lang.String r0 = r15.zzf     // Catch:{ all -> 0x00db }
            r3 = -1
            if (r2 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzcct r1 = r15.zze     // Catch:{ all -> 0x0166 }
            long r20 = r1.zzA()     // Catch:{ all -> 0x0166 }
            goto L_0x0093
        L_0x0091:
            r20 = r3
        L_0x0093:
            if (r2 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzcct r1 = r15.zze     // Catch:{ all -> 0x0166 }
            long r22 = r1.zzx()     // Catch:{ all -> 0x0166 }
            goto L_0x009e
        L_0x009c:
            r22 = r3
        L_0x009e:
            if (r2 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzcct r1 = r15.zze     // Catch:{ all -> 0x0166 }
            long r1 = r1.zzB()     // Catch:{ all -> 0x0166 }
            r24 = r1
            goto L_0x00ab
        L_0x00a9:
            r24 = r3
        L_0x00ab:
            int r16 = com.google.android.gms.internal.ads.zzcct.zzs()     // Catch:{ all -> 0x00db }
            int r26 = com.google.android.gms.internal.ads.zzcct.zzu()     // Catch:{ all -> 0x00db }
            r1 = r32
            r2 = r0
            r3 = r13
            r4 = r6
            r27 = r6
            r6 = r9
            r29 = r9
            r9 = r20
            r20 = r11
            r11 = r22
            r31 = r13
            r13 = r24
            r15 = r16
            r16 = r26
            r1.zzo(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x00d7 }
            r2 = r32
            r0 = r27
            r2.zzk = r0     // Catch:{ all -> 0x00f5 }
            r3 = r29
            goto L_0x00e7
        L_0x00d7:
            r0 = move-exception
            r2 = r32
            goto L_0x00f6
        L_0x00db:
            r0 = move-exception
            r2 = r15
            r5 = r13
            goto L_0x0169
        L_0x00e0:
            r0 = r6
            r20 = r11
            r31 = r13
            r2 = r15
            r3 = r9
        L_0x00e7:
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x00fa
            java.lang.String r0 = r2.zzf     // Catch:{ all -> 0x00f5 }
            r5 = r31
            r2.zzj(r0, r5, r3)     // Catch:{ all -> 0x0164 }
            monitor-exit(r32)     // Catch:{ all -> 0x0164 }
            goto L_0x01a9
        L_0x00f5:
            r0 = move-exception
        L_0x00f6:
            r5 = r31
            goto L_0x0169
        L_0x00fa:
            r5 = r31
            com.google.android.gms.internal.ads.zzcct r3 = r2.zze     // Catch:{ all -> 0x0164 }
            long r3 = r3.zzw()     // Catch:{ all -> 0x0164 }
            int r6 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r6 < 0) goto L_0x010f
            int r3 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x010f
            monitor-exit(r32)     // Catch:{ all -> 0x0164 }
            goto L_0x01a9
        L_0x010d:
            r5 = r13
            r2 = r15
        L_0x010f:
            monitor-exit(r32)     // Catch:{ all -> 0x0164 }
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzy
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.zzx(r0)
            return
        L_0x0124:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "ExoPlayer was released during preloading."
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x0130:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "Abort requested before buffering finished. "
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            r17 = r1
            goto L_0x0169
        L_0x0140:
            r5 = r13
            r2 = r15
            java.lang.String r3 = "downloadTimeout"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0160 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0160 }
            r6.<init>()     // Catch:{ all -> 0x0160 }
            java.lang.String r7 = "Timeout reached. Limit: "
            r6.append(r7)     // Catch:{ all -> 0x0160 }
            r6.append(r0)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = " ms"
            r6.append(r0)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0160 }
            r4.<init>(r0)     // Catch:{ all -> 0x0160 }
            throw r4     // Catch:{ all -> 0x0160 }
        L_0x0160:
            r0 = move-exception
            r17 = r3
            goto L_0x0169
        L_0x0164:
            r0 = move-exception
            goto L_0x0169
        L_0x0166:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L_0x0169:
            monitor-exit(r32)     // Catch:{ all -> 0x0164 }
            throw r0     // Catch:{ Exception -> 0x016b }
        L_0x016b:
            r0 = move-exception
            goto L_0x0170
        L_0x016d:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L_0x0170:
            r1 = r17
            java.lang.String r3 = r2.zzf
            java.lang.String r4 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to preload url "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " Exception: "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            com.google.android.gms.internal.ads.zzcat.zzj(r3)
            java.lang.String r3 = "VideoStreamExoPlayerCache.preload"
            com.google.android.gms.internal.ads.zzcac r4 = com.google.android.gms.ads.internal.zzt.zzo()
            r4.zzt(r0, r3)
            r32.release()
            java.lang.String r0 = zzd(r1, r0)
            java.lang.String r3 = r2.zzf
            r2.zzg(r3, r5, r1, r0)
        L_0x01a9:
            com.google.android.gms.internal.ads.zzceg r0 = com.google.android.gms.ads.internal.zzt.zzy()
            com.google.android.gms.internal.ads.zzcef r1 = r2.zzi
            r0.zzc(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcew.zzb():void");
    }

    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    public final void zzi(boolean z10, long j10) {
        zzcdc zzcdc = (zzcdc) this.zzc.get();
        if (zzcdc != null) {
            zzcbg.zze.execute(new zzceu(zzcdc, z10, j10));
        }
    }

    public final void zzk(String str, Exception exc) {
        zzcat.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onError");
    }

    public final void zzl(String str, Exception exc) {
        zzcat.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onException");
    }

    public final void zzm(int i10) {
    }

    public final void zzp(int i10) {
        this.zze.zzJ(i10);
    }

    public final void zzq(int i10) {
        this.zze.zzK(i10);
    }

    public final void zzr(int i10) {
        this.zze.zzM(i10);
    }

    public final void zzs(int i10) {
        this.zze.zzN(i10);
    }

    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        r5 = r45;
        r6 = r46;
        r7 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r5.zzj(r6, r7, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzu(java.lang.String r46, java.lang.String[] r47) {
        /*
            r45 = this;
            r15 = r45
            r13 = r46
            r0 = r47
            r15.zzf = r13
            java.lang.String r17 = "error"
            java.lang.String r14 = zzc(r46)
            r18 = 0
            int r1 = r0.length     // Catch:{ Exception -> 0x01c8 }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x01c8 }
            r2 = 0
        L_0x0014:
            int r3 = r0.length     // Catch:{ Exception -> 0x01c8 }
            if (r2 >= r3) goto L_0x0022
            r3 = r0[r2]     // Catch:{ Exception -> 0x01c8 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x01c8 }
            r1[r2] = r3     // Catch:{ Exception -> 0x01c8 }
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0022:
            com.google.android.gms.internal.ads.zzcct r0 = r15.zze     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r2 = r15.zzb     // Catch:{ Exception -> 0x01c8 }
            r0.zzF(r1, r2)     // Catch:{ Exception -> 0x01c8 }
            java.lang.ref.WeakReference r0 = r15.zzc     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzcdc r0 = (com.google.android.gms.internal.ads.zzcdc) r0     // Catch:{ Exception -> 0x01c8 }
            if (r0 == 0) goto L_0x0036
            r0.zzt(r14, r15)     // Catch:{ Exception -> 0x01c8 }
        L_0x0036:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.zzB()     // Catch:{ Exception -> 0x01c8 }
            long r19 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzy     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01c8 }
            long r11 = r1.longValue()     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzx     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01c8 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x01c8 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r1 * r3
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzw     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01c8 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01c8 }
            long r6 = (long) r1     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzbO     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x01c8 }
            boolean r21 = r1.booleanValue()     // Catch:{ Exception -> 0x01c8 }
            r22 = -1
            r1 = r22
        L_0x0087:
            monitor-enter(r45)     // Catch:{ Exception -> 0x01c8 }
            long r3 = r0.currentTimeMillis()     // Catch:{ all -> 0x01c0 }
            long r3 = r3 - r19
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0195
            boolean r3 = r15.zzg     // Catch:{ all -> 0x01c0 }
            if (r3 != 0) goto L_0x0188
            boolean r3 = r15.zzh     // Catch:{ all -> 0x01c0 }
            r24 = 1
            if (r3 == 0) goto L_0x00a0
            monitor-exit(r45)     // Catch:{ all -> 0x01c0 }
            r5 = r15
            goto L_0x0157
        L_0x00a0:
            com.google.android.gms.internal.ads.zzcct r3 = r15.zze     // Catch:{ all -> 0x01c0 }
            boolean r3 = r3.zzV()     // Catch:{ all -> 0x01c0 }
            if (r3 == 0) goto L_0x017b
            com.google.android.gms.internal.ads.zzcct r3 = r15.zze     // Catch:{ all -> 0x01c0 }
            long r4 = r3.zzz()     // Catch:{ all -> 0x01c0 }
            r25 = 0
            int r3 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x015b
            com.google.android.gms.internal.ads.zzcct r3 = r15.zze     // Catch:{ all -> 0x01c0 }
            long r27 = r3.zzv()     // Catch:{ all -> 0x01c0 }
            int r3 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x012a
            int r1 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c4
            r8 = 1
            goto L_0x00c5
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            if (r21 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.zzcct r1 = r15.zze     // Catch:{ all -> 0x01c0 }
            long r1 = r1.zzA()     // Catch:{ all -> 0x01c0 }
            r29 = r1
            goto L_0x00d2
        L_0x00d0:
            r29 = r22
        L_0x00d2:
            if (r21 == 0) goto L_0x00dd
            com.google.android.gms.internal.ads.zzcct r1 = r15.zze     // Catch:{ all -> 0x01c0 }
            long r1 = r1.zzx()     // Catch:{ all -> 0x01c0 }
            r31 = r1
            goto L_0x00df
        L_0x00dd:
            r31 = r22
        L_0x00df:
            if (r21 == 0) goto L_0x00ea
            com.google.android.gms.internal.ads.zzcct r1 = r15.zze     // Catch:{ all -> 0x01c0 }
            long r1 = r1.zzB()     // Catch:{ all -> 0x01c0 }
            r33 = r1
            goto L_0x00ec
        L_0x00ea:
            r33 = r22
        L_0x00ec:
            int r16 = com.google.android.gms.internal.ads.zzcct.zzs()     // Catch:{ all -> 0x0122 }
            int r35 = com.google.android.gms.internal.ads.zzcct.zzu()     // Catch:{ all -> 0x0122 }
            r1 = r45
            r2 = r46
            r3 = r14
            r36 = r4
            r4 = r27
            r38 = r6
            r6 = r36
            r40 = r9
            r9 = r29
            r42 = r11
            r11 = r31
            r44 = r14
            r13 = r33
            r15 = r16
            r16 = r35
            r1.zzo(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x0119 }
            r1 = r27
            r3 = r36
            goto L_0x0133
        L_0x0119:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r44
            goto L_0x01c4
        L_0x0122:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r14
            goto L_0x01c4
        L_0x012a:
            r38 = r6
            r40 = r9
            r42 = r11
            r44 = r14
            r3 = r4
        L_0x0133:
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0142
            r5 = r45
            r6 = r46
            r7 = r44
            r5.zzj(r6, r7, r3)     // Catch:{ all -> 0x01be }
            monitor-exit(r45)     // Catch:{ all -> 0x01be }
            goto L_0x0157
        L_0x0142:
            r5 = r45
            r6 = r46
            r7 = r44
            com.google.android.gms.internal.ads.zzcct r3 = r5.zze     // Catch:{ all -> 0x01be }
            long r3 = r3.zzw()     // Catch:{ all -> 0x01be }
            int r8 = (r3 > r38 ? 1 : (r3 == r38 ? 0 : -1))
            if (r8 < 0) goto L_0x0158
            int r3 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x0158
            monitor-exit(r45)     // Catch:{ all -> 0x01be }
        L_0x0157:
            return r24
        L_0x0158:
            r3 = r42
            goto L_0x0163
        L_0x015b:
            r38 = r6
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            r3 = r11
        L_0x0163:
            r5.wait(r3)     // Catch:{ InterruptedException -> 0x0171 }
            monitor-exit(r45)     // Catch:{ all -> 0x01be }
            r11 = r3
            r15 = r5
            r13 = r6
            r14 = r7
            r6 = r38
            r9 = r40
            goto L_0x0087
        L_0x0171:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x017b:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x0188:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x0195:
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ba }
            r2.<init>()     // Catch:{ all -> 0x01ba }
            java.lang.String r3 = "Timeout reached. Limit: "
            r2.append(r3)     // Catch:{ all -> 0x01ba }
            r3 = r40
            r2.append(r3)     // Catch:{ all -> 0x01ba }
            java.lang.String r3 = " ms"
            r2.append(r3)     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01ba }
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            r17 = r1
            goto L_0x01c4
        L_0x01be:
            r0 = move-exception
            goto L_0x01c4
        L_0x01c0:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01c4:
            monitor-exit(r45)     // Catch:{ all -> 0x01be }
            throw r0     // Catch:{ Exception -> 0x01c6 }
        L_0x01c6:
            r0 = move-exception
            goto L_0x01cc
        L_0x01c8:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01cc:
            r1 = r17
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to preload url "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Exception: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.google.android.gms.internal.ads.zzcat.zzj(r2)
            java.lang.String r2 = "VideoStreamExoPlayerCache.preload"
            com.google.android.gms.internal.ads.zzcac r3 = com.google.android.gms.ads.internal.zzt.zzo()
            r3.zzt(r0, r2)
            r45.release()
            java.lang.String r0 = zzd(r1, r0)
            r5.zzg(r6, r7, r1, r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcew.zzu(java.lang.String, java.lang.String[]):boolean");
    }

    public final void zzv() {
        zzcat.zzj("Precache onRenderedFirstFrame");
    }

    public final boolean zzw(String str, String[] strArr, zzcef zzcef) {
        this.zzf = str;
        this.zzi = zzcef;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcdc zzcdc = (zzcdc) this.zzc.get();
            if (zzcdc != null) {
                zzcdc.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            this.zzk = -1;
            zzx(0);
            return true;
        } catch (Exception e10) {
            String message = e10.getMessage();
            zzcat.zzj("Failed to preload url " + str + " Exception: " + message);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e10));
            return false;
        }
    }
}
