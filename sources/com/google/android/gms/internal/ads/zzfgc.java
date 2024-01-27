package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfgc {
    private final zzffv zza;
    private final e zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfgc(zzffa zzffa, zzffu zzffu, zzffv zzffv) {
        this.zza = zzffv;
        this.zzb = zzfzt.zzf(zzfzt.zzn(zzffu.zza(zzffv), new zzfga(this, zzffu, zzffa, zzffv), zzffv.zzb()), Exception.class, new zzfgb(this, zzffu), zzffv.zzb());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.util.concurrent.e zza(com.google.android.gms.internal.ads.zzffv r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzd     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.zzc     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.zzffv r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzffk r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzffk r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzffv r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzffk r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzffk r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.zzc = r3     // Catch:{ all -> 0x0035 }
            com.google.common.util.concurrent.e r3 = r2.zzb     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgc.zza(com.google.android.gms.internal.ads.zzffv):com.google.common.util.concurrent.e");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzb(zzffu zzffu, zzffa zzffa, zzffv zzffv, zzffj zzffj) {
        synchronized (this) {
            this.zzd = true;
            zzffu.zzb(zzffj);
            if (!this.zzc) {
                zzffa.zzd(zzffv.zza(), zzffj);
                e zzh = zzfzt.zzh((Object) null);
                return zzh;
            }
            e zzh2 = zzfzt.zzh(new zzfft(zzffj, zzffv));
            return zzh2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(zzffu zzffu, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfzp zzfzp) {
        zzfzt.zzr(zzfzt.zzn(this.zzb, zzffz.zza, this.zza.zzb()), zzfzp, this.zza.zzb());
    }
}
