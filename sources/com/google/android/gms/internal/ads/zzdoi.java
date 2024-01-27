package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.e;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdoi {
    /* access modifiers changed from: private */
    public final zzdnv zza = new zzdnv();
    private final zza zzb;
    private final zzcgn zzc;
    private final Context zzd;
    private final zzdso zze;
    private final zzfib zzf;
    private final Executor zzg;
    private final zzaro zzh;
    private final zzcaz zzi;
    private final zzbjy zzj;
    private final zzedo zzk;
    private final zzfjx zzl;
    private final zzedz zzm;
    private e zzn;

    zzdoi(zzdof zzdof) {
        this.zzd = zzdof.zzc;
        this.zzg = zzdof.zzg;
        this.zzh = zzdof.zzh;
        this.zzi = zzdof.zzi;
        this.zzb = zzdof.zza;
        this.zzc = zzdof.zzb;
        this.zzj = new zzbjy();
        this.zzk = zzdof.zzf;
        this.zzl = zzdof.zzj;
        this.zze = zzdof.zzd;
        this.zzf = zzdof.zze;
        this.zzm = zzdof.zzk;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcgb zza(zzcgb zzcgb) {
        zzcgb zzcgb2 = zzcgb;
        zzcgb2.zzad("/result", this.zzj);
        zzcho zzN = zzcgb.zzN();
        zzb zzb2 = r2;
        zzb zzb3 = new zzb(this.zzd, (zzbxu) null, (zzbum) null);
        zzdnv zzdnv = this.zza;
        zzN.zzM((com.google.android.gms.ads.internal.client.zza) null, zzdnv, zzdnv, zzdnv, zzdnv, false, (zzbjl) null, zzb2, (zzbrz) null, (zzbxu) null, this.zzk, this.zzl, this.zze, this.zzf, (zzbkc) null, (zzdfd) null, (zzbkb) null, (zzbjv) null, (zzcou) null);
        return zzcgb2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(String str, JSONObject jSONObject, zzcgb zzcgb) {
        return this.zzj.zzb(zzcgb, str, jSONObject);
    }

    public final synchronized e zzd(String str, JSONObject jSONObject) {
        e eVar = this.zzn;
        if (eVar == null) {
            return zzfzt.zzh((Object) null);
        }
        return zzfzt.zzn(eVar, new zzdnw(this, str, jSONObject), this.zzg);
    }

    public final synchronized void zze(zzfcr zzfcr, zzfcv zzfcv) {
        e eVar = this.zzn;
        if (eVar != null) {
            zzfzt.zzr(eVar, new zzdoc(this, zzfcr, zzfcv), this.zzg);
        }
    }

    public final synchronized void zzf() {
        e eVar = this.zzn;
        if (eVar != null) {
            zzfzt.zzr(eVar, new zzdny(this), this.zzg);
            this.zzn = null;
        }
    }

    public final synchronized void zzg(String str, Map map) {
        e eVar = this.zzn;
        if (eVar != null) {
            zzfzt.zzr(eVar, new zzdob(this, "sendMessageToNativeJs", map), this.zzg);
        }
    }

    public final synchronized void zzh() {
        zzbca zzbca = zzbci.zzdA;
        e zzm2 = zzfzt.zzm(zzfzt.zzk(new zzcgl(this.zzd, this.zzh, this.zzi, this.zzb, this.zzm, (String) zzba.zzc().zzb(zzbca)), zzcbg.zze), new zzdnx(this), this.zzg);
        this.zzn = zzm2;
        zzcbj.zza(zzm2, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbjj zzbjj) {
        e eVar = this.zzn;
        if (eVar != null) {
            zzfzt.zzr(eVar, new zzdnz(this, str, zzbjj), this.zzg);
        }
    }

    public final void zzj(WeakReference weakReference, String str, zzbjj zzbjj) {
        zzi(str, new zzdoh(this, weakReference, str, zzbjj, (zzdog) null));
    }

    public final synchronized void zzk(String str, zzbjj zzbjj) {
        e eVar = this.zzn;
        if (eVar != null) {
            zzfzt.zzr(eVar, new zzdoa(this, str, zzbjj), this.zzg);
        }
    }
}
