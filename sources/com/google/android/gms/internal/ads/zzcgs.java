package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcgs implements zzbjj {
    final /* synthetic */ zzcgu zza;

    zzcgs(zzcgu zzcgu) {
        this.zza = zzcgu;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        if (map != null) {
            String str = (String) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcgu zzcgu = this.zza;
                        if (zzcgu.zzG != parseInt) {
                            zzcgu.zzG = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception e10) {
                    zzcat.zzk("Exception occurred while getting webview content height", e10);
                }
            }
        }
    }
}
