package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzxz {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzxs[] zzd = new zzxs[100];

    public zzxz(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzxs zzb() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.zzb     // Catch:{ all -> 0x0038 }
            int r0 = r0 + 1
            r4.zzb = r0     // Catch:{ all -> 0x0038 }
            int r0 = r4.zzc     // Catch:{ all -> 0x0038 }
            if (r0 <= 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzxs[] r1 = r4.zzd     // Catch:{ all -> 0x0038 }
            int r0 = r0 + -1
            r4.zzc = r0     // Catch:{ all -> 0x0038 }
            r2 = r1[r0]     // Catch:{ all -> 0x0038 }
            java.util.Objects.requireNonNull(r2)
            r3 = 0
            r1[r0] = r3     // Catch:{ all -> 0x0038 }
            goto L_0x002b
        L_0x001a:
            com.google.android.gms.internal.ads.zzxs r2 = new com.google.android.gms.internal.ads.zzxs     // Catch:{ all -> 0x0038 }
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0038 }
            r1 = 0
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0038 }
            int r0 = r4.zzb     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzxs[] r1 = r4.zzd     // Catch:{ all -> 0x0038 }
            int r3 = r1.length     // Catch:{ all -> 0x0038 }
            if (r0 > r3) goto L_0x002d
        L_0x002b:
            monitor-exit(r4)
            return r2
        L_0x002d:
            int r3 = r3 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzxs[] r0 = (com.google.android.gms.internal.ads.zzxs[]) r0     // Catch:{ all -> 0x0038 }
            r4.zzd = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return r2
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxz.zzb():com.google.android.gms.internal.ads.zzxs");
    }

    public final synchronized void zzc(zzxs zzxs) {
        zzxs[] zzxsArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzxsArr[i10] = zzxs;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzxt zzxt) {
        while (zzxt != null) {
            zzxs[] zzxsArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzxsArr[i10] = zzxt.zzc();
            this.zzb--;
            zzxt = zzxt.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i10 = this.zza;
        int i11 = zzfk.zza;
        int max = Math.max(0, ((i10 + 65535) / NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) - this.zzb);
        int i12 = this.zzc;
        if (max < i12) {
            Arrays.fill(this.zzd, max, i12, (Object) null);
            this.zzc = max;
        }
    }
}
