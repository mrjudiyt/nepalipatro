package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaxr {
    /* access modifiers changed from: private */
    public zzaxg zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final Object zzd = new Object();

    zzaxr(Context context) {
        this.zzc = context;
    }

    static /* bridge */ /* synthetic */ void zze(zzaxr zzaxr) {
        synchronized (zzaxr.zzd) {
            zzaxg zzaxg = zzaxr.zza;
            if (zzaxg != null) {
                zzaxg.disconnect();
                zzaxr.zza = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Future zzc(zzaxh zzaxh) {
        zzaxl zzaxl = new zzaxl(this);
        zzaxp zzaxp = new zzaxp(this, zzaxh, zzaxl);
        zzaxq zzaxq = new zzaxq(this, zzaxl);
        synchronized (this.zzd) {
            zzaxg zzaxg = new zzaxg(this.zzc, zzt.zzt().zzb(), zzaxp, zzaxq);
            this.zza = zzaxg;
            zzaxg.checkAvailabilityAndConnect();
        }
        return zzaxl;
    }
}
