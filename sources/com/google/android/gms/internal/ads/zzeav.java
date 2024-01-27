package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeav extends zzbur {
    private final Context zza;
    private final zzgad zzb;
    private final zzebn zzc;
    private final zzcni zzd;
    private final ArrayDeque zze;
    private final zzfjh zzf;
    private final zzbvs zzg;
    private final zzebk zzh;

    public zzeav(Context context, zzgad zzgad, zzbvs zzbvs, zzcni zzcni, zzebn zzebn, ArrayDeque arrayDeque, zzebk zzebk, zzfjh zzfjh) {
        zzbci.zza(context);
        this.zza = context;
        this.zzb = zzgad;
        this.zzg = zzbvs;
        this.zzc = zzebn;
        this.zzd = zzcni;
        this.zze = arrayDeque;
        this.zzh = zzebk;
        this.zzf = zzfjh;
    }

    private final synchronized zzeas zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzeas zzeas = (zzeas) it.next();
            if (zzeas.zzc.equals(str)) {
                it.remove();
                return zzeas;
            }
        }
        return null;
    }

    private static e zzl(e eVar, zzfhr zzfhr, zzboa zzboa, zzfje zzfje, zzfit zzfit) {
        zzbnq zza2 = zzboa.zza("AFMA_getAdDictionary", zzbnx.zza, zzeao.zza);
        zzfjd.zzd(eVar, zzfit);
        zzfgw zza3 = zzfhr.zzb(zzfhl.BUILD_URL, eVar).zzf(zza2).zza();
        zzfjd.zzc(zza3, zzfje, zzfit);
        return zza3;
    }

    private static e zzm(zzbvg zzbvg, zzfhr zzfhr, zzeuu zzeuu) {
        zzeai zzeai = new zzeai(zzeuu);
        return zzfhr.zzb(zzfhl.GMS_SIGNALS, zzfzt.zzh(zzbvg.zza)).zzf(zzeai).zze(zzeaj.zza).zza();
    }

    private final synchronized void zzn(zzeas zzeas) {
        zzo();
        this.zze.addLast(zzeas);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbei.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(e eVar, zzbvc zzbvc) {
        zzfzt.zzr(zzfzt.zzn(eVar, new zzeag(this), zzcbg.zza), new zzear(this, zzbvc), zzcbg.zzf);
    }

    public final e zzb(zzbvg zzbvg, int i10) {
        if (!((Boolean) zzbei.zza.zze()).booleanValue()) {
            return zzfzt.zzg(new Exception("Split request is disabled."));
        }
        zzffh zzffh = zzbvg.zzi;
        if (zzffh == null) {
            return zzfzt.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzffh.zzc == 0 || zzffh.zzd == 0) {
            return zzfzt.zzg(new Exception("Caching is disabled."));
        }
        zzboa zzb2 = zzt.zzf().zzb(this.zza, zzcaz.zza(), this.zzf);
        zzeuu zzq = this.zzd.zzq(zzbvg, i10);
        zzfhr zzc2 = zzq.zzc();
        e zzm = zzm(zzbvg, zzc2, zzq);
        zzfje zzd2 = zzq.zzd();
        zzfit zza2 = zzfis.zza(this.zza, 9);
        e zzl = zzl(zzm, zzc2, zzb2, zzd2, zza2);
        return zzc2.zza(zzfhl.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new zzeam(this, zzl, zzm, zzbvg, zza2)).zza();
    }

    public final e zzc(zzbvg zzbvg, int i10) {
        zzfit zzfit;
        zzfgw zzfgw;
        zzboa zzb2 = zzt.zzf().zzb(this.zza, zzcaz.zza(), this.zzf);
        zzeuu zzq = this.zzd.zzq(zzbvg, i10);
        zzbnq zza2 = zzb2.zza("google.afma.response.normalize", zzeau.zza, zzbnx.zzb);
        zzeas zzeas = null;
        if (!((Boolean) zzbei.zza.zze()).booleanValue()) {
            String str = zzbvg.zzj;
            if (str != null && !str.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzeas = zzk(zzbvg.zzh);
            if (zzeas == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzeas == null) {
            zzfit = zzfis.zza(this.zza, 9);
        } else {
            zzfit = zzeas.zze;
        }
        zzfje zzd2 = zzq.zzd();
        zzd2.zzd(zzbvg.zza.getStringArrayList("ad_types"));
        zzebm zzebm = new zzebm(zzbvg.zzg, zzd2, zzfit);
        zzebj zzebj = new zzebj(this.zza, zzbvg.zzb.zza, this.zzg, i10);
        zzfhr zzc2 = zzq.zzc();
        zzfit zza3 = zzfis.zza(this.zza, 11);
        if (zzeas == null) {
            e zzm = zzm(zzbvg, zzc2, zzq);
            e zzl = zzl(zzm, zzc2, zzb2, zzd2, zzfit);
            zzfit zza4 = zzfis.zza(this.zza, 10);
            zzfgw zza5 = zzc2.zza(zzfhl.HTTP, zzl, zzm).zza(new zzeak(zzm, zzl)).zze(zzebm).zze(new zzfiz(zza4)).zze(zzebj).zza();
            zzfjd.zza(zza5, zzd2, zza4);
            zzfjd.zzd(zza5, zza3);
            zzfgw = zzc2.zza(zzfhl.PRE_PROCESS, zzm, zzl, zza5).zza(new zzeal(zza5, zzm, zzl)).zzf(zza2).zza();
        } else {
            zzebl zzebl = new zzebl(zzeas.zzb, zzeas.zza);
            zzfit zza6 = zzfis.zza(this.zza, 10);
            zzfgw zza7 = zzc2.zzb(zzfhl.HTTP, zzfzt.zzh(zzebl)).zze(zzebm).zze(new zzfiz(zza6)).zze(zzebj).zza();
            zzfjd.zza(zza7, zzd2, zza6);
            e zzh2 = zzfzt.zzh(zzeas);
            zzfjd.zzd(zza7, zza3);
            zzfgw = zzc2.zza(zzfhl.PRE_PROCESS, zza7, zzh2).zza(new zzeah(zza7, zzh2)).zzf(zza2).zza();
        }
        zzfjd.zza(zzfgw, zzd2, zza3);
        return zzfgw;
    }

    public final e zzd(zzbvg zzbvg, int i10) {
        zzboa zzb2 = zzt.zzf().zzb(this.zza, zzcaz.zza(), this.zzf);
        if (!((Boolean) zzben.zza.zze()).booleanValue()) {
            return zzfzt.zzg(new Exception("Signal collection disabled."));
        }
        zzeuu zzq = this.zzd.zzq(zzbvg, i10);
        zzetz zza2 = zzq.zza();
        zzbnq zza3 = zzb2.zza("google.afma.request.getSignals", zzbnx.zza, zzbnx.zzb);
        zzfit zza4 = zzfis.zza(this.zza, 22);
        zzfgw zza5 = zzq.zzc().zzb(zzfhl.GET_SIGNALS, zzfzt.zzh(zzbvg.zza)).zze(new zzfiz(zza4)).zzf(new zzeap(zza2)).zzb(zzfhl.JS_SIGNALS).zzf(zza3).zza();
        zzfje zzd2 = zzq.zzd();
        zzd2.zzd(zzbvg.zza.getStringArrayList("ad_types"));
        zzfjd.zzb(zza5, zzd2, zza4);
        if (((Boolean) zzbeb.zze.zze()).booleanValue()) {
            zzebn zzebn = this.zzc;
            zzebn.getClass();
            zza5.addListener(new zzean(zzebn), this.zzb);
        }
        return zza5;
    }

    public final void zze(zzbvg zzbvg, zzbvc zzbvc) {
        zzp(zzb(zzbvg, Binder.getCallingUid()), zzbvc);
    }

    public final void zzf(zzbvg zzbvg, zzbvc zzbvc) {
        zzp(zzd(zzbvg, Binder.getCallingUid()), zzbvc);
    }

    public final void zzg(zzbvg zzbvg, zzbvc zzbvc) {
        e zzc2 = zzc(zzbvg, Binder.getCallingUid());
        zzp(zzc2, zzbvc);
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzebn zzebn = this.zzc;
            zzebn.getClass();
            zzc2.addListener(new zzean(zzebn), this.zzb);
        }
    }

    public final void zzh(String str, zzbvc zzbvc) {
        zzp(zzi(str), zzbvc);
    }

    public final e zzi(String str) {
        if (!((Boolean) zzbei.zza.zze()).booleanValue()) {
            return zzfzt.zzg(new Exception("Split request is disabled."));
        }
        zzeaq zzeaq = new zzeaq(this);
        if (zzk(str) == null) {
            return zzfzt.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfzt.zzh(zzeaq);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzj(e eVar, e eVar2, zzbvg zzbvg, zzfit zzfit) {
        String zzc2 = ((zzbvj) eVar.get()).zzc();
        String str = zzbvg.zzh;
        zzn(new zzeas((zzbvj) eVar.get(), (JSONObject) eVar2.get(), str, zzc2, zzfit));
        return new ByteArrayInputStream(zzc2.getBytes(zzfsi.zzc));
    }
}
