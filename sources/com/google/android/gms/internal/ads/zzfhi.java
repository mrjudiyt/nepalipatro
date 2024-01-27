package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfhi {
    final /* synthetic */ zzfhj zza;
    private final Object zzb;
    private final String zzc;
    private final e zzd;
    private final List zze;
    private final e zzf;

    private zzfhi(zzfhj zzfhj, Object obj, String str, e eVar, List list, e eVar2) {
        this.zza = zzfhj;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = eVar;
        this.zze = list;
        this.zzf = eVar2;
    }

    /* synthetic */ zzfhi(zzfhj zzfhj, Object obj, String str, e eVar, List list, e eVar2, zzfhh zzfhh) {
        this(zzfhj, obj, (String) null, eVar, list, eVar2);
    }

    public final zzfgw zza() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        zzfgw zzfgw = new zzfgw(obj, str, this.zzf);
        this.zza.zzd.zza(zzfgw);
        e eVar = this.zzd;
        zzfhf zzfhf = new zzfhf(this, zzfgw);
        zzgad zzgad = zzcbg.zzf;
        eVar.addListener(zzfhf, zzgad);
        zzfzt.zzr(zzfgw, new zzfhg(this, zzfgw), zzgad);
        return zzfgw;
    }

    public final zzfhi zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfhi zzc(Class cls, zzfza zzfza) {
        return new zzfhi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfzt.zzf(this.zzf, cls, zzfza, this.zza.zzb));
    }

    public final zzfhi zzd(e eVar) {
        return zzg(new zzfhe(eVar), zzcbg.zzf);
    }

    public final zzfhi zze(zzfgu zzfgu) {
        return zzf(new zzfhd(zzfgu));
    }

    public final zzfhi zzf(zzfza zzfza) {
        return zzg(zzfza, this.zza.zzb);
    }

    public final zzfhi zzg(zzfza zzfza, Executor executor) {
        return new zzfhi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfzt.zzn(this.zzf, zzfza, executor));
    }

    public final zzfhi zzh(String str) {
        return new zzfhi(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfhi zzi(long j10, TimeUnit timeUnit) {
        return new zzfhi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfzt.zzo(this.zzf, j10, timeUnit, this.zza.zzc));
    }
}
