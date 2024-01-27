package com.google.android.gms.internal.ads;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzbry {
    private final zzcgb zza;
    private final String zzb;

    public zzbry(zzcgb zzcgb, String str) {
        this.zza = zzcgb;
        this.zzb = str;
    }

    public final void zzf(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i12).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i13));
        } catch (JSONException e10) {
            zzcat.zzh("Error occurred while dispatching default position.", e10);
        }
    }

    public final void zzg(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put(NativeProtocol.WEB_DIALOG_ACTION, this.zzb);
            zzcgb zzcgb = this.zza;
            if (zzcgb != null) {
                zzcgb.zze("onError", put);
            }
        } catch (JSONException e10) {
            zzcat.zzh("Error occurred while dispatching error event.", e10);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e10) {
            zzcat.zzh("Error occurred while dispatching ready Event.", e10);
        }
    }

    public final void zzi(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i10).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", (double) f10).put("rotation", i14));
        } catch (JSONException e10) {
            zzcat.zzh("Error occurred while obtaining screen information.", e10);
        }
    }

    public final void zzj(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i12).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i13));
        } catch (JSONException e10) {
            zzcat.zzh("Error occurred while dispatching size change.", e10);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            zzcat.zzh("Error occurred while dispatching state change.", e10);
        }
    }
}
