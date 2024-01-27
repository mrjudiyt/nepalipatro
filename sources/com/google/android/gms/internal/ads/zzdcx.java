package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdcx implements Runnable {
    public final /* synthetic */ zzdcy zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzdcx(zzdcy zzdcy, Object obj) {
        this.zza = zzdcy;
        this.zzb = obj;
    }

    public final void run() {
        try {
            this.zza.zza(this.zzb);
        } catch (Throwable th) {
            zzt.zzo().zzt(th, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", th);
        }
    }
}
