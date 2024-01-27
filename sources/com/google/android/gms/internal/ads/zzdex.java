package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdex extends zzdcz implements zzauw {
    private final Map zzb = new WeakHashMap(1);
    private final Context zzc;
    private final zzfcr zzd;

    public zzdex(Context context, Set set, zzfcr zzfcr) {
        super(set);
        this.zzc = context;
        this.zzd = zzfcr;
    }

    public final synchronized void zza(View view) {
        zzaux zzaux = (zzaux) this.zzb.get(view);
        if (zzaux == null) {
            zzaux zzaux2 = new zzaux(this.zzc, view);
            zzaux2.zzc(this);
            this.zzb.put(view, zzaux2);
            zzaux = zzaux2;
        }
        if (this.zzd.zzZ) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzbm)).booleanValue()) {
                zzaux.zzg(((Long) zzba.zzc().zzb(zzbci.zzbl)).longValue());
                return;
            }
        }
        zzaux.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzaux) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    public final synchronized void zzbt(zzauv zzauv) {
        zzt(new zzdew(zzauv));
    }
}
