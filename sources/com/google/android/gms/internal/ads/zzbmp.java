package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbmp implements zzbmh, zzbmf {
    private final zzcgb zza;

    public zzbmp(Context context, zzcaz zzcaz, zzaro zzaro, zza zza2) {
        zzt.zzz();
        zzcgb zza3 = zzcgn.zza(context, zzchq.zza(), "", false, false, (zzaro) null, (zzbdk) null, zzcaz, (zzbda) null, (zzl) null, (zza) null, zzaxv.zza(), (zzfcr) null, (zzfcv) null, (zzedz) null);
        this.zza = zza3;
        ((View) zza3).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        zzay.zzb();
        if (zzcam.zzu()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(runnable);
        }
    }

    public final void zza(String str) {
        zzs(new zzbml(this, str));
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbme.zzc(this, str, str2);
    }

    public final void zzc() {
        this.zza.destroy();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbme.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbme.zzb(this, str, jSONObject);
    }

    public final void zzf(String str) {
        zzs(new zzbmm(this, str));
    }

    public final void zzg(String str) {
        zzs(new zzbmj(this, str));
    }

    public final void zzh(String str) {
        zzs(new zzbmn(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final boolean zzi() {
        return this.zza.zzaz();
    }

    public final zzbno zzj() {
        return new zzbno(this);
    }

    public final void zzk(zzbmv zzbmv) {
        this.zza.zzN().zzG(new zzbmk(zzbmv));
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbme.zzd(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final void zzq(String str, zzbjj zzbjj) {
        this.zza.zzad(str, new zzbmo(this, zzbjj));
    }

    public final void zzr(String str, zzbjj zzbjj) {
        this.zza.zzav(str, new zzbmi(zzbjj));
    }
}
