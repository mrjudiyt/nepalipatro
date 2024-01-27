package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcqb implements zzauw {
    private zzcgb zza;
    private final Executor zzb;
    private final zzcpn zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcpq zzg = new zzcpq();

    public zzcqb(Executor executor, zzcpn zzcpn, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcpn;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            JSONObject zza2 = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new zzcqa(this, zza2));
            }
        } catch (JSONException e10) {
            zze.zzb("Failed to call video active view js", e10);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    public final void zzbt(zzauv zzauv) {
        boolean z10;
        if (this.zzf) {
            z10 = false;
        } else {
            z10 = zzauv.zzj;
        }
        zzcpq zzcpq = this.zzg;
        zzcpq.zza = z10;
        zzcpq.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzauv;
        if (this.zze) {
            zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcgb zzcgb) {
        this.zza = zzcgb;
    }
}
