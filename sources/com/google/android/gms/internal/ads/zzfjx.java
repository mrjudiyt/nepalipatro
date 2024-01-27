package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfjx {
    private final Context zza;
    private final Executor zzb;
    private final zzcay zzc;
    private final zzfjh zzd;

    zzfjx(Context context, Executor executor, zzcay zzcay, zzfjh zzfjh) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcay;
        this.zzd = zzfjh;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, zzfje zzfje) {
        zzfit zza2 = zzfis.zza(this.zza, 14);
        zza2.zzh();
        zza2.zzf(this.zzc.zza(str));
        if (zzfje == null) {
            this.zzd.zzb(zza2.zzl());
            return;
        }
        zzfje.zza(zza2);
        zzfje.zzg();
    }

    public final void zzc(String str, zzfje zzfje) {
        if (!zzfjh.zza() || !((Boolean) zzbdu.zzd.zze()).booleanValue()) {
            this.zzb.execute(new zzfjv(this, str));
        } else {
            this.zzb.execute(new zzfjw(this, str, zzfje));
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), (zzfje) null);
        }
    }
}
