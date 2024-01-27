package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzgup {
    private static final zzgtl zzb = zzgtl.zza;
    protected volatile zzgvj zza;
    private volatile zzgsr zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgup)) {
            return false;
        }
        zzgup zzgup = (zzgup) obj;
        zzgvj zzgvj = this.zza;
        zzgvj zzgvj2 = zzgup.zza;
        if (zzgvj == null && zzgvj2 == null) {
            return zzb().equals(zzgup.zzb());
        }
        if (zzgvj != null && zzgvj2 != null) {
            return zzgvj.equals(zzgvj2);
        }
        if (zzgvj != null) {
            zzgup.zzc(zzgvj.zzbf());
            return zzgvj.equals(zzgup.zza);
        }
        zzc(zzgvj2.zzbf());
        return this.zza.equals(zzgvj2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgsn) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaz();
        }
        return 0;
    }

    public final zzgsr zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzgsr zzgsr = this.zzc;
                return zzgsr;
            }
            if (this.zza == null) {
                this.zzc = zzgsr.zzb;
            } else {
                this.zzc = this.zza.zzau();
            }
            zzgsr zzgsr2 = this.zzc;
            return zzgsr2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.internal.ads.zzgvj r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzgvj r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzgvj r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzgul -> 0x0011 }
            com.google.android.gms.internal.ads.zzgsr r0 = com.google.android.gms.internal.ads.zzgsr.zzb     // Catch:{ zzgul -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzgul -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzgsr r2 = com.google.android.gms.internal.ads.zzgsr.zzb     // Catch:{ all -> 0x001b }
            r1.zzc = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgup.zzc(com.google.android.gms.internal.ads.zzgvj):void");
    }
}
