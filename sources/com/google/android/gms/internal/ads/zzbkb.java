package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbkb implements zzbjj {
    private final Context zza;

    public zzbkb(Context context) {
        this.zza = context;
    }

    public final void zza(Object obj, Map map) {
        if (map.containsKey(ViewHierarchyConstants.TEXT_KEY) && !TextUtils.isEmpty((CharSequence) map.get(ViewHierarchyConstants.TEXT_KEY))) {
            zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get(ViewHierarchyConstants.TEXT_KEY))));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (String) map.get(ViewHierarchyConstants.TEXT_KEY));
            if (map.containsKey(ShareConstants.WEB_DIALOG_PARAM_TITLE)) {
                intent.putExtra("android.intent.extra.TITLE", (String) map.get(ShareConstants.WEB_DIALOG_PARAM_TITLE));
            }
            try {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzS(this.zza, intent);
            } catch (RuntimeException e10) {
                zzcat.zzk("Failed to open Share Sheet", e10);
                zzt.zzo().zzu(e10, "ShareSheetGmsgHandler.onGmsg");
            }
        }
    }
}
