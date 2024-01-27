package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.zzt;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcpn implements zzbnt {
    private final Context zza;
    private final zzaus zzb;
    private final PowerManager zzc;

    public zzcpn(Context context, zzaus zzaus) {
        this.zza = context;
        this.zzb = zzaus;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: zza */
    public final JSONObject zzb(zzcpq zzcpq) {
        JSONObject jSONObject;
        boolean z10;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzauv zzauv = zzcpq.zzf;
        if (zzauv == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z11 = zzauv.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put(Constants.TIMESTAMP, zzcpq.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcpq.zzb).put("isNative", this.zzb.zze());
            if (Build.VERSION.SDK_INT >= 20) {
                z10 = this.zzc.isInteractive();
            } else {
                z10 = this.zzc.isScreenOn();
            }
            put.put("isScreenOn", z10).put("appMuted", zzt.zzr().zze()).put("appVolume", (double) zzt.zzr().zza()).put("deviceVolume", (double) zzac.zzb(this.zza.getApplicationContext()));
            if (((Boolean) zzba.zzc().zzb(zzbci.zzfE)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(audioManager.getMode());
                }
                if (num != null) {
                    jSONObject3.put("audioMode", num);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzauv.zzb).put("isAttachedToWindow", z11).put("viewBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzauv.zzc.top).put("bottom", zzauv.zzc.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzauv.zzc.left).put("right", zzauv.zzc.right)).put("adBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzauv.zzd.top).put("bottom", zzauv.zzd.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzauv.zzd.left).put("right", zzauv.zzd.right)).put("globalVisibleBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzauv.zze.top).put("bottom", zzauv.zze.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzauv.zze.left).put("right", zzauv.zze.right)).put("globalVisibleBoxVisible", zzauv.zzf).put("localVisibleBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzauv.zzg.top).put("bottom", zzauv.zzg.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzauv.zzg.left).put("right", zzauv.zzg.right)).put("localVisibleBoxVisible", zzauv.zzh).put("hitBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzauv.zzi.top).put("bottom", zzauv.zzi.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzauv.zzi.left).put("right", zzauv.zzi.right)).put("screenDensity", (double) this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcpq.zza);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzbn)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzauv.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect2.top).put("bottom", rect2.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcpq.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
