package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzdsw {
    protected final String zza = ((String) zzbdv.zzb.zze());
    protected final Map zzb = new HashMap();
    protected final Context zzc;
    protected final Executor zzd;
    protected final zzcay zze;
    protected final boolean zzf;
    private final zzfil zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final AtomicBoolean zzj = new AtomicBoolean();
    private final AtomicReference zzk = new AtomicReference(new Bundle());

    protected zzdsw(Executor executor, zzcay zzcay, zzfil zzfil, Context context) {
        this.zzd = executor;
        this.zze = zzcay;
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbci.zzbV)).booleanValue();
        this.zzg = zzfil;
        this.zzh = ((Boolean) zzba.zzc().zzb(zzbci.zzbY)).booleanValue();
        this.zzi = ((Boolean) zzba.zzc().zzb(zzbci.zzgX)).booleanValue();
        this.zzc = context;
    }

    private final void zza(Map map, boolean z10) {
        if (!map.isEmpty()) {
            if (map.isEmpty()) {
                zzcat.zze("Empty or null paramMap.");
            } else {
                if (!this.zzj.getAndSet(true)) {
                    String str = (String) zzba.zzc().zzb(zzbci.zzjH);
                    this.zzk.set(zzad.zza(this.zzc, str, new zzdsv(this, str)));
                }
                Bundle bundle = (Bundle) this.zzk.get();
                for (String str2 : bundle.keySet()) {
                    map.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
            String zza2 = this.zzg.zza(map);
            zze.zza(zza2);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (!this.zzf) {
                return;
            }
            if (z10 && !this.zzh) {
                return;
            }
            if (!parseBoolean || this.zzi) {
                this.zzd.execute(new zzdsu(this, zza2));
                return;
            }
            return;
        }
        zzcat.zze("Empty paramMap.");
    }

    /* access modifiers changed from: protected */
    public final String zzb(Map map) {
        return this.zzg.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzk.set(zzad.zzb(this.zzc, str));
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final void zzf(Map map) {
        zza(map, false);
    }
}
