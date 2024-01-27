package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdmm {
    private final Context zza;
    private final zzdlv zzb;
    private final zzaro zzc;
    private final zzcaz zzd;
    private final zza zze;
    private final zzaxv zzf;
    private final Executor zzg;
    private final zzbfc zzh;
    private final zzdne zzi;
    private final zzdpt zzj;
    private final ScheduledExecutorService zzk;
    private final zzdoo zzl;
    private final zzdso zzm;
    private final zzfib zzn;
    private final zzfjx zzo;
    private final zzedo zzp;
    private final zzedz zzq;

    public zzdmm(Context context, zzdlv zzdlv, zzaro zzaro, zzcaz zzcaz, zza zza2, zzaxv zzaxv, Executor executor, zzfdn zzfdn, zzdne zzdne, zzdpt zzdpt, ScheduledExecutorService scheduledExecutorService, zzdso zzdso, zzfib zzfib, zzfjx zzfjx, zzedo zzedo, zzdoo zzdoo, zzedz zzedz) {
        this.zza = context;
        this.zzb = zzdlv;
        this.zzc = zzaro;
        this.zzd = zzcaz;
        this.zze = zza2;
        this.zzf = zzaxv;
        this.zzg = executor;
        this.zzh = zzfdn.zzi;
        this.zzi = zzdne;
        this.zzj = zzdpt;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdso;
        this.zzn = zzfib;
        this.zzo = zzfjx;
        this.zzp = zzedo;
        this.zzl = zzdoo;
        this.zzq = zzedz;
    }

    public static final zzel zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfvs.zzl();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfvs.zzl();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            zzel zzr = zzr(optJSONArray.optJSONObject(i10));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfvs.zzj(arrayList);
    }

    private final zzq zzk(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return zzq.zzc();
            }
            i10 = 0;
        }
        return new zzq(this.zza, new AdSize(i10, i11));
    }

    private static e zzl(e eVar, Object obj) {
        return zzfzt.zzf(eVar, Exception.class, new zzdmk((Object) null), zzcbg.zzf);
    }

    private static e zzm(boolean z10, e eVar, Object obj) {
        if (z10) {
            return zzfzt.zzn(eVar, new zzdml(eVar), zzcbg.zzf);
        }
        return zzl(eVar, (Object) null);
    }

    private final e zzn(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return zzfzt.zzh((Object) null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzfzt.zzh((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, -1);
        int optInt2 = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, -1);
        if (z10) {
            return zzfzt.zzh(new zzbfa((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfzt.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzdmc(optString, optDouble, optInt, optInt2), this.zzg), (Object) null);
    }

    private final e zzo(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfzt.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i10), z10));
        }
        return zzfzt.zzm(zzfzt.zzd(arrayList), zzdmh.zza, this.zzg);
    }

    private final e zzp(JSONObject jSONObject, zzfcr zzfcr, zzfcv zzfcv) {
        e zzb2 = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfcr, zzfcv, zzk(jSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0), jSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0)));
        return zzfzt.zzn(zzb2, new zzdmd(zzb2), zzcbg.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(Constants.REASON);
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzel(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbex zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString(ViewHierarchyConstants.TEXT_KEY);
        Integer zzq2 = zzq(jSONObject, "bg_color");
        Integer zzq3 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbex(optString, list, zzq2, zzq3, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzb(zzq zzq2, zzfcr zzfcr, zzfcv zzfcv, String str, String str2, Object obj) {
        zzcgb zza2 = this.zzj.zza(zzq2, zzfcr, zzfcv);
        zzcbk zza3 = zzcbk.zza(zza2);
        zzdol zzb2 = this.zzl.zzb();
        zzdol zzdol = zzb2;
        zzcho zzN = zza2.zzN();
        zzb zzb3 = r3;
        zzb zzb4 = new zzb(this.zza, (zzbxu) null, (zzbum) null);
        zzN.zzM(zzb2, zzdol, zzb2, zzb2, zzb2, false, (zzbjl) null, zzb3, (zzbrz) null, (zzbxu) null, this.zzp, this.zzo, this.zzm, this.zzn, (zzbkc) null, zzb2, (zzbkb) null, (zzbjv) null, (zzcou) null);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdC)).booleanValue()) {
            zza2.zzad("/getNativeAdViewSignals", zzbji.zzs);
        }
        zza2.zzad("/getNativeClickMeta", zzbji.zzt);
        zza2.zzN().zzA(new zzdmg(zza3));
        zza2.zzab(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(String str, Object obj) {
        zzt.zzz();
        zzcgb zza2 = zzcgn.zza(this.zza, zzchq.zza(), "native-omid", false, false, this.zzc, (zzbdk) null, this.zzd, (zzbda) null, (zzl) null, this.zze, this.zzf, (zzfcr) null, (zzfcv) null, this.zzq);
        zzcbk zza3 = zzcbk.zza(zza2);
        zza2.zzN().zzA(new zzdmi(zza3));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeV)).booleanValue()) {
            zza2.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza2.loadData(str, "text/html", "UTF-8");
        }
        return zza3;
    }

    public final e zzd(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfzt.zzh((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfzt.zzm(zzo(optJSONArray, false, true), new zzdmj(this, optJSONObject), this.zzg), (Object) null);
    }

    public final e zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final e zzf(JSONObject jSONObject, String str) {
        zzbfc zzbfc = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbfc.zzb, zzbfc.zzd);
    }

    public final e zzg(JSONObject jSONObject, String str, zzfcr zzfcr, zzfcv zzfcv) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzjt)).booleanValue()) {
            return zzfzt.zzh((Object) null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfzt.zzh((Object) null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzfzt.zzh((Object) null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        zzq zzk2 = zzk(optJSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0), optJSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzfzt.zzh((Object) null);
        }
        e zzn2 = zzfzt.zzn(zzfzt.zzh((Object) null), new zzdme(this, zzk2, zzfcr, zzfcv, optString, optString2), zzcbg.zze);
        return zzfzt.zzn(zzn2, new zzdmf(zzn2), zzcbg.zzf);
    }

    public final e zzh(JSONObject jSONObject, zzfcr zzfcr, zzfcv zzfcv) {
        e eVar;
        JSONObject zzg2 = zzbw.zzg(jSONObject, "html_containers", "instream");
        if (zzg2 != null) {
            return zzp(zzg2, zzfcr, zzfcv);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
        if (optJSONObject == null) {
            return zzfzt.zzh((Object) null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z10 = false;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjs)).booleanValue() && optJSONObject.has("html")) {
            z10 = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z10) {
                zzcat.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzfzt.zzh((Object) null);
            }
        } else if (!z10) {
            eVar = this.zzi.zza(optJSONObject);
            zzbca zzbca = zzbci.zzdD;
            return zzl(zzfzt.zzo(eVar, (long) ((Integer) zzba.zzc().zzb(zzbca)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
        }
        eVar = zzp(optJSONObject, zzfcr, zzfcv);
        zzbca zzbca2 = zzbci.zzdD;
        return zzl(zzfzt.zzo(eVar, (long) ((Integer) zzba.zzc().zzb(zzbca2)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
    }
}
