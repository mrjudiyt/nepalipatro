package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzof implements zzoj {
    public static final zzftm zza = zzod.zza;
    private static final Random zzb = new Random();
    /* access modifiers changed from: private */
    public final zzcu zzc;
    /* access modifiers changed from: private */
    public final zzcs zzd;
    private final HashMap zze;
    private final zzftm zzf;
    private zzoi zzg;
    private zzcv zzh;
    private String zzi;
    private long zzj;

    public zzof() {
        throw null;
    }

    /* access modifiers changed from: private */
    public final long zzl() {
        zzoe zzoe = (zzoe) this.zze.get(this.zzi);
        return (zzoe == null || zzoe.zzd == -1) ? this.zzj + 1 : zzoe.zzd;
    }

    private final zzoe zzm(int i10, zztw zztw) {
        int i11;
        long j10 = Long.MAX_VALUE;
        zzoe zzoe = null;
        for (zzoe zzoe2 : this.zze.values()) {
            zzoe2.zzg(i10, zztw);
            if (zzoe2.zzj(i10, zztw)) {
                long zzb2 = zzoe2.zzd;
                if (zzb2 == -1 || zzb2 < j10) {
                    zzoe = zzoe2;
                    j10 = zzb2;
                } else if (i11 == 0) {
                    int i12 = zzfk.zza;
                    if (!(zzoe.zze == null || zzoe2.zze == null)) {
                        zzoe = zzoe2;
                    }
                }
            }
        }
        if (zzoe != null) {
            return zzoe;
        }
        String zzn = zzn();
        zzoe zzoe3 = new zzoe(this, zzn, i10, zztw);
        this.zze.put(zzn, zzoe3);
        return zzoe3;
    }

    /* access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzoe zzoe) {
        if (zzoe.zzd != -1) {
            this.zzj = zzoe.zzd;
        }
        this.zzi = null;
    }

    private final void zzp(zzmc zzmc) {
        if (zzmc.zzb.zzo()) {
            String str = this.zzi;
            if (str != null) {
                zzoe zzoe = (zzoe) this.zze.get(str);
                Objects.requireNonNull(zzoe);
                zzo(zzoe);
                return;
            }
            return;
        }
        zzoe zzoe2 = (zzoe) this.zze.get(this.zzi);
        zzoe zzm = zzm(zzmc.zzc, zzmc.zzd);
        this.zzi = zzm.zzb;
        zzi(zzmc);
        zztw zztw = zzmc.zzd;
        if (zztw != null && zztw.zzb()) {
            if (zzoe2 != null) {
                if (zzoe2.zzd == zztw.zzd && zzoe2.zze != null && zzoe2.zze.zzb == zzmc.zzd.zzb && zzoe2.zze.zzc == zzmc.zzd.zzc) {
                    return;
                }
            }
            zztw zztw2 = zzmc.zzd;
            String unused = zzm(zzmc.zzc, new zztw(zztw2.zza, zztw2.zzd)).zzb;
            String unused2 = zzm.zzb;
        }
    }

    public final synchronized String zze() {
        return this.zzi;
    }

    public final synchronized String zzf(zzcv zzcv, zztw zztw) {
        return zzm(zzcv.zzn(zztw.zza, this.zzd).zzd, zztw).zzb;
    }

    public final synchronized void zzg(zzmc zzmc) {
        zzoi zzoi;
        String str = this.zzi;
        if (str != null) {
            zzoe zzoe = (zzoe) this.zze.get(str);
            Objects.requireNonNull(zzoe);
            zzo(zzoe);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoe zzoe2 = (zzoe) it.next();
            it.remove();
            if (zzoe2.zzf && (zzoi = this.zzg) != null) {
                zzoi.zzd(zzmc, zzoe2.zzb, false);
            }
        }
    }

    public final void zzh(zzoi zzoi) {
        this.zzg = zzoi;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzmc r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzoi r0 = r9.zzg     // Catch:{ all -> 0x00cb }
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcv r0 = r10.zzb     // Catch:{ all -> 0x00cb }
            boolean r0 = r0.zzo()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r9)
            return
        L_0x0010:
            com.google.android.gms.internal.ads.zztw r0 = r10.zzd     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0041
            long r1 = r9.zzl()     // Catch:{ all -> 0x00cb }
            long r3 = r0.zzd     // Catch:{ all -> 0x00cb }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            monitor-exit(r9)
            return
        L_0x0020:
            java.util.HashMap r0 = r9.zze     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cb }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzoe r0 = (com.google.android.gms.internal.ads.zzoe) r0     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0041
            long r1 = r0.zzd     // Catch:{ all -> 0x00cb }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0041
            int r0 = r0.zzc     // Catch:{ all -> 0x00cb }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cb }
            if (r0 != r1) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            monitor-exit(r9)
            return
        L_0x0041:
            int r0 = r10.zzc     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zztw r1 = r10.zzd     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzoe r0 = r9.zzm(r0, r1)     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cb }
            r9.zzi = r1     // Catch:{ all -> 0x00cb }
        L_0x0053:
            com.google.android.gms.internal.ads.zztw r1 = r10.zzd     // Catch:{ all -> 0x00cb }
            r2 = 1
            if (r1 == 0) goto L_0x009d
            boolean r3 = r1.zzb()     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x009d
            java.lang.Object r3 = r1.zza     // Catch:{ all -> 0x00cb }
            long r4 = r1.zzd     // Catch:{ all -> 0x00cb }
            int r1 = r1.zzb     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zztw r6 = new com.google.android.gms.internal.ads.zztw     // Catch:{ all -> 0x00cb }
            r6.<init>(r3, r4, r1)     // Catch:{ all -> 0x00cb }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzoe r1 = r9.zzm(r1, r6)     // Catch:{ all -> 0x00cb }
            boolean r3 = r1.zzf     // Catch:{ all -> 0x00cb }
            if (r3 != 0) goto L_0x009d
            r1.zzf = true     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzcv r3 = r10.zzb     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zztw r4 = r10.zzd     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzcs r5 = r9.zzd     // Catch:{ all -> 0x00cb }
            java.lang.Object r4 = r4.zza     // Catch:{ all -> 0x00cb }
            r3.zzn(r4, r5)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzcs r3 = r9.zzd     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zztw r4 = r10.zzd     // Catch:{ all -> 0x00cb }
            int r4 = r4.zzb     // Catch:{ all -> 0x00cb }
            r3.zzi(r4)     // Catch:{ all -> 0x00cb }
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzfk.zzs(r3)     // Catch:{ all -> 0x00cb }
            long r7 = com.google.android.gms.internal.ads.zzfk.zzs(r3)     // Catch:{ all -> 0x00cb }
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x00cb }
            java.lang.String unused = r1.zzb     // Catch:{ all -> 0x00cb }
        L_0x009d:
            boolean r1 = r0.zzf     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x00a9
            r0.zzf = true     // Catch:{ all -> 0x00cb }
            java.lang.String unused = r0.zzb     // Catch:{ all -> 0x00cb }
        L_0x00a9:
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = r9.zzi     // Catch:{ all -> 0x00cb }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r0.zzg     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x00c9
            r0.zzg = true     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzoi r1 = r9.zzg     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r0.zzb     // Catch:{ all -> 0x00cb }
            r1.zzc(r10, r0)     // Catch:{ all -> 0x00cb }
            monitor-exit(r9)
            return
        L_0x00c9:
            monitor-exit(r9)
            return
        L_0x00cb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzof.zzi(com.google.android.gms.internal.ads.zzmc):void");
    }

    public final synchronized void zzj(zzmc zzmc, int i10) {
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoe zzoe = (zzoe) it.next();
            if (zzoe.zzk(zzmc)) {
                it.remove();
                if (zzoe.zzf) {
                    boolean equals = zzoe.zzb.equals(this.zzi);
                    boolean z10 = false;
                    if (i10 == 0 && equals && zzoe.zzg) {
                        z10 = true;
                    }
                    if (equals) {
                        zzo(zzoe);
                    }
                    this.zzg.zzd(zzmc, zzoe.zzb, z10);
                }
            }
        }
        zzp(zzmc);
    }

    public final synchronized void zzk(zzmc zzmc) {
        Objects.requireNonNull(this.zzg);
        zzcv zzcv = this.zzh;
        this.zzh = zzmc.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoe zzoe = (zzoe) it.next();
            if (!zzoe.zzl(zzcv, this.zzh) || zzoe.zzk(zzmc)) {
                it.remove();
                if (zzoe.zzf) {
                    if (zzoe.zzb.equals(this.zzi)) {
                        zzo(zzoe);
                    }
                    this.zzg.zzd(zzmc, zzoe.zzb, false);
                }
            }
        }
        zzp(zzmc);
    }

    public zzof(zzftm zzftm) {
        this.zzf = zzftm;
        this.zzc = new zzcu();
        this.zzd = new zzcs();
        this.zze = new HashMap();
        this.zzh = zzcv.zza;
        this.zzj = -1;
    }
}
