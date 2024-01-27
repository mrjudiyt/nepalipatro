package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbxu;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbxu zzc;
    private final zzbum zzd = new zzbum(false, Collections.emptyList());

    public zzb(Context context, zzbxu zzbxu, zzbum zzbum) {
        this.zza = context;
        this.zzc = zzbxu;
    }

    private final boolean zzd() {
        zzbxu zzbxu = this.zzc;
        return (zzbxu != null && zzbxu.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbxu zzbxu = this.zzc;
            if (zzbxu != null) {
                zzbxu.zzd(str, (Map) null, 3);
                return;
            }
            zzbum zzbum = this.zzd;
            if (zzbum.zza && (list = zzbum.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.zza;
                        zzt.zzp();
                        zzt.zzK(context, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
