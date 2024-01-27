package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdzw {
    public e zza;
    /* access modifiers changed from: private */
    public final zzdae zzb;
    private final zzdze zzc;
    private final zzfhr zzd;
    private final zzfdn zze;
    private final zzcaz zzf;
    private final zzfjh zzg;
    private final zzfje zzh;
    private final Context zzi;
    private final zzgad zzj;

    zzdzw(zzdae zzdae, zzdze zzdze, zzfhr zzfhr, zzfdn zzfdn, zzcaz zzcaz, zzfjh zzfjh, zzfje zzfje, Context context, zzgad zzgad) {
        this.zzb = zzdae;
        this.zzc = zzdze;
        this.zzd = zzfhr;
        this.zze = zzfdn;
        this.zzf = zzcaz;
        this.zzg = zzfjh;
        this.zzh = zzfje;
        this.zzi = context;
        this.zzj = zzgad;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbuo zza(zzbvg zzbvg, zzebh zzebh) {
        zzebh.zzc.put("Content-Type", zzebh.zze);
        zzebh.zzc.put("User-Agent", zzt.zzp().zzc(this.zzi, zzbvg.zzb.zza));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzebh.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbuo(zzebh.zza, zzebh.zzb, bundle, zzebh.zzd, zzebh.zzf, zzbvg.zzd, zzbvg.zzh);
    }

    public final e zzc(zzbvg zzbvg, JSONObject jSONObject, zzbvj zzbvj) {
        this.zzb.zzbr(zzbvg);
        zzfgw zza2 = this.zzd.zzb(zzfhl.PROXY, zzfzt.zzm(this.zzd.zzb(zzfhl.PREPARE_HTTP_REQUEST, zzfzt.zzh(new zzebl(jSONObject, zzbvj))).zze(new zzebm(zzbvg.zzg, this.zzh, zzfis.zza(this.zzi, 9))).zza(), new zzdzs(this, zzbvg), this.zzj)).zzf(new zzdzt(this.zzc)).zza();
        this.zza = zza2;
        e zzn = zzfzt.zzn(this.zzd.zzb(zzfhl.PRE_PROCESS, zza2).zze(new zzdzr(jSONObject, zzbvj)).zzf(zzt.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzeau.zza, zzbnx.zzb)).zza(), new zzdzu(this), this.zzj);
        zzfzt.zzr(zzn, new zzdzv(this), this.zzj);
        return zzn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzd(InputStream inputStream) {
        return zzfzt.zzh(new zzfde(new zzfdb(this.zze), zzfdd.zza(new InputStreamReader(inputStream))));
    }
}
