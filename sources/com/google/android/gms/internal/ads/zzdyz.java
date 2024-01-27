package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdyz {
    private final zzgad zza;
    private final zzdyf zzb;
    private final zzhaw zzc;
    private final zzfjh zzd;
    private final Context zze;
    private final zzcaz zzf;

    public zzdyz(zzgad zzgad, zzdyf zzdyf, zzhaw zzhaw, zzfjh zzfjh, Context context, zzcaz zzcaz) {
        this.zza = zzgad;
        this.zzb = zzdyf;
        this.zzc = zzhaw;
        this.zzd = zzfjh;
        this.zze = context;
        this.zzf = zzcaz;
    }

    private final e zzh(zzbvg zzbvg, zzdyy zzdyy, zzdyy zzdyy2, zzfza zzfza) {
        e eVar;
        String str = zzbvg.zzd;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            eVar = zzfzt.zzg(new zzdyo(1));
        } else {
            eVar = zzfzt.zzf(zzdyy.zza(zzbvg), ExecutionException.class, zzdyx.zza, this.zza);
        }
        return zzfzt.zzf(zzfzt.zzn(zzfzk.zzu(eVar), zzfza, this.zza), zzdyo.class, new zzdyw(this, zzdyy2, zzbvg, zzfza), this.zza);
    }

    public final e zza(zzbvg zzbvg) {
        return zzh(zzbvg, new zzdyu(this.zzb), new zzdyv(this), new zzdyt(zzbvg));
    }

    public final e zzb(JSONObject jSONObject) {
        return zzfzt.zzn(zzfzk.zzu(zzfzt.zzh(jSONObject)), zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbnx.zza, zzdyp.zza), this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(zzdyy zzdyy, zzbvg zzbvg, zzfza zzfza, zzdyo zzdyo) {
        return zzfzt.zzn(zzdyy.zza(zzbvg), zzfza, this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzd(zzbvg zzbvg) {
        return ((zzeav) this.zzc.zzb()).zzb(zzbvg, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zze(zzbvg zzbvg) {
        return this.zzb.zzc(zzbvg.zzh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzf(zzbvg zzbvg) {
        return ((zzeav) this.zzc.zzb()).zzi(zzbvg.zzh);
    }

    public final e zzg(zzbvg zzbvg) {
        return zzh(zzbvg, new zzdyr(this), new zzdys(this), zzdyq.zza);
    }
}
