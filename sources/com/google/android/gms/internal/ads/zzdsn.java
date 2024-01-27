package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdsn {
    final /* synthetic */ zzdso zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdsn(zzdso zzdso) {
        this.zza = zzdso;
    }

    public final zzdsn zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdsn zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdsn zzd(zzfcr zzfcr) {
        this.zzb.put("aai", zzfcr.zzy);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgW)).booleanValue()) {
            zzc("rid", zzfcr.zzap);
        }
        return this;
    }

    public final zzdsn zze(zzfcv zzfcv) {
        this.zzb.put("gqi", zzfcv.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new zzdsl(this));
    }

    public final void zzh() {
        this.zza.zzb.execute(new zzdsm(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zza.zza.zzf(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj() {
        this.zza.zza.zze(this.zzb);
    }
}
