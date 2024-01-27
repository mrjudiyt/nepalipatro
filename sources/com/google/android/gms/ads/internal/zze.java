package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzboa;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbj;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfjh;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.android.gms.internal.ads.zzgad;
import com.google.common.util.concurrent.e;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcaz zzcaz, String str, Runnable runnable, zzfjh zzfjh) {
        zzb(context, zzcaz, true, (zzbzw) null, str, (String) null, runnable, zzfjh);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Context context, zzcaz zzcaz, boolean z10, zzbzw zzbzw, String str, String str2, Runnable runnable, zzfjh zzfjh) {
        PackageInfo packageInfo;
        if (zzt.zzB().elapsedRealtime() - this.zzb < 5000) {
            zzcat.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if (zzbzw != null && !TextUtils.isEmpty(zzbzw.zzc())) {
            if (zzt.zzB().currentTimeMillis() - zzbzw.zza() <= ((Long) zzba.zzc().zzb(zzbci.zzdU)).longValue() && zzbzw.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzcat.zzj("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            zzfit zza2 = zzfis.zza(context, 4);
            zza2.zzh();
            zzboa zza3 = zzt.zzf().zza(this.zza, zzcaz, zzfjh);
            zzbnu zzbnu = zzbnx.zza;
            zzbnq zza4 = zza3.zza("google.afma.config.fetchAppSettings", zzbnu, zzbnu);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z10);
                jSONObject.put("pn", context.getPackageName());
                zzbca zzbca = zzbci.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
                jSONObject.put("js", zzcaz.zza);
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (!(applicationInfo == null || (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                e zzb2 = zza4.zzb(jSONObject);
                zzd zzd = new zzd(zzfjh, zza2);
                zzgad zzgad = zzcbg.zzf;
                e zzn = zzfzt.zzn(zzb2, zzd, zzgad);
                if (runnable != null) {
                    zzb2.addListener(runnable, zzgad);
                }
                zzcbj.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e10) {
                zzcat.zzh("Error requesting application settings", e10);
                zza2.zzg(e10);
                zza2.zzf(false);
                zzfjh.zzb(zza2.zzl());
            }
        } else {
            zzcat.zzj("App settings could not be fetched. Required parameters missing");
        }
    }

    public final void zzc(Context context, zzcaz zzcaz, String str, zzbzw zzbzw, zzfjh zzfjh) {
        zzb(context, zzcaz, false, zzbzw, zzbzw != null ? zzbzw.zzb() : null, str, (Runnable) null, zzfjh);
    }
}
