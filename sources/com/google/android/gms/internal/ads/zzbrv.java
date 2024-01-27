package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbrv extends zzbry {
    private final Map zza;
    /* access modifiers changed from: private */
    public final Context zzb;

    public zzbrv(zzcgb zzcgb, Map map) {
        super(zzcgb, "storePicture");
        this.zza = map;
        this.zzb = zzcgb.zzi();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        zzt.zzp();
        if (!new zzbbs(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzt.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zzd = zzt.zzo().zzd();
                zzt.zzp();
                AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(this.zzb);
                zzJ.setTitle(zzd != null ? zzd.getString(R.string.f7867s1) : "Save image");
                zzJ.setMessage(zzd != null ? zzd.getString(R.string.f7868s2) : "Allow Ad to store image in Picture gallery?");
                zzJ.setPositiveButton(zzd != null ? zzd.getString(R.string.f7869s3) : "Accept", new zzbrt(this, str, lastPathSegment));
                zzJ.setNegativeButton(zzd != null ? zzd.getString(R.string.f7870s4) : "Decline", new zzbru(this));
                zzJ.create().show();
                return;
            }
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
        }
    }
}
