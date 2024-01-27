package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbka implements zzbjj {
    private final zzbjz zza;

    public zzbka(zzbjz zzbjz) {
        this.zza = zzbjz;
    }

    public static void zzb(zzcgb zzcgb, zzbjz zzbjz) {
        zzcgb.zzad("/reward", new zzbka(zzbjz));
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get(NativeProtocol.WEB_DIALOG_ACTION);
        if ("grant".equals(str)) {
            zzbwi zzbwi = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get(ShareConstants.MEDIA_TYPE);
                if (!TextUtils.isEmpty(str2)) {
                    zzbwi = new zzbwi(str2, parseInt);
                }
            } catch (NumberFormatException e10) {
                zzcat.zzk("Unable to parse reward amount.", e10);
            }
            this.zza.zza(zzbwi);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
