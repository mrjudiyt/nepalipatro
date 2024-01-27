package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdne {
    private final zzfdn zza;
    private final Executor zzb;
    private final zzdpt zzc;
    private final zzdoo zzd;
    private final Context zze;
    private final zzdso zzf;
    private final zzfib zzg;
    private final zzfjx zzh;
    private final zzedo zzi;

    public zzdne(zzfdn zzfdn, Executor executor, zzdpt zzdpt, Context context, zzdso zzdso, zzfib zzfib, zzfjx zzfjx, zzedo zzedo, zzdoo zzdoo) {
        this.zza = zzfdn;
        this.zzb = executor;
        this.zzc = zzdpt;
        this.zze = context;
        this.zzf = zzdso;
        this.zzg = zzfib;
        this.zzh = zzfjx;
        this.zzi = zzedo;
        this.zzd = zzdoo;
    }

    private final void zzh(zzcgb zzcgb) {
        zzi(zzcgb);
        zzcgb.zzad("/video", zzbji.zzl);
        zzcgb.zzad("/videoMeta", zzbji.zzm);
        zzcgb.zzad("/precache", new zzceo());
        zzcgb.zzad("/delayPageLoaded", zzbji.zzp);
        zzcgb.zzad("/instrument", zzbji.zzn);
        zzcgb.zzad("/log", zzbji.zzg);
        zzcgb.zzad("/click", new zzbih((zzdfd) null, (zzcou) null));
        if (this.zza.zzb != null) {
            zzcgb.zzN().zzD(true);
            zzcgb.zzad("/open", new zzbju((zzb) null, (zzbrs) null, (zzedo) null, (zzdso) null, (zzfib) null, (zzcou) null));
        } else {
            zzcgb.zzN().zzD(false);
        }
        if (zzt.zzn().zzu(zzcgb.getContext())) {
            zzcgb.zzad("/logScionEvent", new zzbjo(zzcgb.getContext()));
        }
    }

    private static final void zzi(zzcgb zzcgb) {
        zzcgb.zzad("/videoClicked", zzbji.zzh);
        zzcgb.zzN().zzF(true);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdC)).booleanValue()) {
            zzcgb.zzad("/getNativeAdViewSignals", zzbji.zzs);
        }
        zzcgb.zzad("/getNativeClickMeta", zzbji.zzt);
    }

    public final e zza(JSONObject jSONObject) {
        return zzfzt.zzn(zzfzt.zzn(zzfzt.zzh((Object) null), new zzdmv(this), this.zzb), new zzdmu(this, jSONObject), this.zzb);
    }

    public final e zzb(String str, String str2, zzfcr zzfcr, zzfcv zzfcv, zzq zzq) {
        return zzfzt.zzn(zzfzt.zzh((Object) null), new zzdmt(this, zzq, zzfcr, zzfcv, str, str2), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(JSONObject jSONObject, zzcgb zzcgb) {
        zzcbk zza2 = zzcbk.zza(zzcgb);
        if (this.zza.zzb != null) {
            zzcgb.zzag(zzchq.zzd());
        } else {
            zzcgb.zzag(zzchq.zze());
        }
        zzcgb.zzN().zzA(new zzdmw(this, zzcgb, zza2));
        zzcgb.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzd(zzq zzq, zzfcr zzfcr, zzfcv zzfcv, String str, String str2, Object obj) {
        zzcgb zza2 = this.zzc.zza(zzq, zzfcr, zzfcv);
        zzcbk zza3 = zzcbk.zza(zza2);
        if (this.zza.zzb != null) {
            zzh(zza2);
            zza2.zzag(zzchq.zzd());
        } else {
            zzdol zzb2 = this.zzd.zzb();
            zzdol zzdol = zzb2;
            zzcho zzN = zza2.zzN();
            zzb zzb3 = r14;
            zzb zzb4 = new zzb(this.zze, (zzbxu) null, (zzbum) null);
            zzN.zzM(zzb2, zzdol, zzb2, zzb2, zzb2, false, (zzbjl) null, zzb3, (zzbrz) null, (zzbxu) null, this.zzi, this.zzh, this.zzf, this.zzg, (zzbkc) null, zzb2, (zzbkb) null, (zzbjv) null, (zzcou) null);
            zzi(zza2);
        }
        zza2.zzN().zzA(new zzdmx(this, zza2, zza3));
        zza2.zzab(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zze(Object obj) {
        zzcgb zza2 = this.zzc.zza(zzq.zzc(), (zzfcr) null, (zzfcv) null);
        zzcbk zza3 = zzcbk.zza(zza2);
        zzh(zza2);
        zza2.zzN().zzG(new zzdmy(zza3));
        zza2.loadUrl((String) zzba.zzc().zzb(zzbci.zzdB));
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcgb zzcgb, zzcbk zzcbk, boolean z10, int i10, String str, String str2) {
        if (!(this.zza.zza == null || zzcgb.zzq() == null)) {
            zzcgb.zzq().zzs(this.zza.zza);
        }
        zzcbk.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcgb zzcgb, zzcbk zzcbk, boolean z10, int i10, String str, String str2) {
        if (z10) {
            if (!(this.zza.zza == null || zzcgb.zzq() == null)) {
                zzcgb.zzq().zzs(this.zza.zza);
            }
            zzcbk.zzb();
            return;
        }
        zzcbk.zzd(new zzeir(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
