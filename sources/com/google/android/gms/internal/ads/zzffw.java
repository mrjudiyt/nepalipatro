package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzffw {
    private final zzffa zza;
    private final zzffu zzb;
    private final zzfew zzc;
    /* access modifiers changed from: private */
    public final ArrayDeque zzd;
    /* access modifiers changed from: private */
    public zzfgc zze;
    /* access modifiers changed from: private */
    public int zzf = 1;

    public zzffw(zzffa zzffa, zzfew zzfew, zzffu zzffu) {
        this.zza = zzffa;
        this.zzc = zzfew;
        this.zzb = zzffu;
        this.zzd = new ArrayDeque();
        zzfew.zzb(new zzffr(this));
    }

    /* access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgl)).booleanValue()) {
            if (!zzt.zzo().zzh().zzh().zzh()) {
                this.zzd.clear();
                return;
            }
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzffv zzffv = (zzffv) this.zzd.pollFirst();
                if (zzffv == null || (zzffv.zza() != null && this.zza.zze(zzffv.zza()))) {
                    zzfgc zzfgc = new zzfgc(this.zza, this.zzb, zzffv);
                    this.zze = zzfgc;
                    zzfgc.zzd(new zzffs(this, zzffv));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized e zza(zzffv zzffv) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzffv);
    }

    public final synchronized void zze(zzffv zzffv) {
        this.zzd.add(zzffv);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
