package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzasj implements zzfop {
    private final zzfms zza;
    private final zzfnj zzb;
    private final zzasw zzc;
    private final zzasi zzd;
    private final zzars zze;
    private final zzasy zzf;
    private final zzasq zzg;
    private final zzash zzh;

    zzasj(zzfms zzfms, zzfnj zzfnj, zzasw zzasw, zzasi zzasi, zzars zzars, zzasy zzasy, zzasq zzasq, zzash zzash) {
        this.zza = zzfms;
        this.zzb = zzfnj;
        this.zzc = zzasw;
        this.zzd = zzasi;
        this.zze = zzars;
        this.zzf = zzasy;
        this.zzg = zzasq;
        this.zzh = zzash;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfms zzfms = this.zza;
        zzapj zzb2 = this.zzb.zzb();
        hashMap.put("v", zzfms.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb2.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzasq zzasq = this.zzg;
        if (zzasq != null) {
            hashMap.put("tcq", Long.valueOf(zzasq.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    public final Map zza() {
        zzasw zzasw = this.zzc;
        Map zze2 = zze();
        zze2.put("lts", Long.valueOf(zzasw.zza()));
        return zze2;
    }

    public final Map zzb() {
        Map zze2 = zze();
        zzapj zza2 = this.zzb.zza();
        zze2.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze2.put("did", zza2.zzg());
        zze2.put("dst", Integer.valueOf(zza2.zzal() - 1));
        zze2.put("doo", Boolean.valueOf(zza2.zzai()));
        zzars zzars = this.zze;
        if (zzars != null) {
            zze2.put("nt", Long.valueOf(zzars.zza()));
        }
        zzasy zzasy = this.zzf;
        if (zzasy != null) {
            zze2.put("vs", Long.valueOf(zzasy.zzc()));
            zze2.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze2;
    }

    public final Map zzc() {
        zzash zzash = this.zzh;
        Map zze2 = zze();
        if (zzash != null) {
            zze2.put("vst", zzash.zza());
        }
        return zze2;
    }

    /* access modifiers changed from: package-private */
    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
