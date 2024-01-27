package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxv;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzedz;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzab {
    private zzab() {
    }

    /* synthetic */ zzab(zzaa zzaa) {
    }

    public static zzab zzo(int i10) {
        return i10 >= 30 ? new zzz() : i10 >= 28 ? new zzy() : i10 >= 26 ? new zzw() : i10 >= 24 ? new zzv() : i10 >= 21 ? new zzu() : new zzab();
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context) {
        zzt.zzp();
        if (zzt.zzE()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcat.zzh("Failed to obtain CookieManager.", th);
            zzt.zzo().zzu(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzcgi zzd(zzcgb zzcgb, zzaxv zzaxv, boolean z10, zzedz zzedz) {
        return new zzchd(zzcgb, zzaxv, z10, zzedz);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public void zzh(Context context, String str, String str2) {
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int zzk(AudioManager audioManager) {
        return 0;
    }

    public void zzl(Activity activity) {
    }

    public int zzn(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
