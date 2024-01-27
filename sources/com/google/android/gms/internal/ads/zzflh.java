package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzflh {
    private zzfmk zza = new zzfmk((WebView) null);
    private long zzb;
    private int zzc;

    public zzflh() {
        zzb();
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j10) {
        if (j10 >= this.zzb && this.zzc != 3) {
            this.zzc = 3;
            zzfla.zza().zzg(zza(), str);
        }
    }

    public final void zze(Date date) {
        if (date != null) {
            JSONObject jSONObject = new JSONObject();
            zzfln.zze(jSONObject, Constants.TIMESTAMP, Long.valueOf(date.getTime()));
            zzfla.zza().zzf(zza(), jSONObject);
        }
    }

    public final void zzf(String str, long j10) {
        if (j10 >= this.zzb) {
            this.zzc = 2;
            zzfla.zza().zzg(zza(), str);
        }
    }

    public void zzg(zzfkg zzfkg, zzfke zzfke) {
        zzh(zzfkg, zzfke, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public final void zzh(zzfkg zzfkg, zzfke zzfke, JSONObject jSONObject) {
        String zzh = zzfkg.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfln.zze(jSONObject2, "environment", "app");
        zzfln.zze(jSONObject2, "adSessionType", zzfke.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfln.zze(jSONObject3, "deviceType", str + "; " + str2);
        zzfln.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfln.zze(jSONObject3, "os", "Android");
        zzfln.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfln.zze(jSONObject2, "deviceCategory", zzflm.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfln.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfln.zze(jSONObject4, "partnerName", zzfke.zze().zzb());
        zzfln.zze(jSONObject4, "partnerVersion", zzfke.zze().zzc());
        zzfln.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfln.zze(jSONObject5, "libraryVersion", "1.4.8-google_20230803");
        zzfln.zze(jSONObject5, RemoteConfigConstants.RequestFieldKey.APP_ID, zzfky.zzb().zza().getApplicationContext().getPackageName());
        zzfln.zze(jSONObject2, "app", jSONObject5);
        if (zzfke.zzf() != null) {
            zzfln.zze(jSONObject2, "contentUrl", zzfke.zzf());
        }
        zzfln.zze(jSONObject2, "customReferenceData", zzfke.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfke.zzh().iterator();
        if (!it.hasNext()) {
            zzfla.zza().zzh(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzfkn zzfkn = (zzfkn) it.next();
            throw null;
        }
    }

    public final void zzi(float f10) {
        zzfla.zza().zze(zza(), f10);
    }

    /* access modifiers changed from: package-private */
    public final void zzj(WebView webView) {
        this.zza = new zzfmk(webView);
    }

    public void zzk() {
    }

    public final boolean zzl() {
        return this.zza.get() != null;
    }
}
