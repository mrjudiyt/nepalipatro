package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgz implements zzfsx {
    public static final /* synthetic */ zzgz zza = new zzgz();

    private /* synthetic */ zzgz() {
    }

    public final boolean zza(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        String zza2 = zzfsc.zza(str);
        if (!TextUtils.isEmpty(zza2)) {
            return (!zza2.contains(ViewHierarchyConstants.TEXT_KEY) || zza2.contains("text/vtt")) && !zza2.contains("html") && !zza2.contains("xml");
        }
        return false;
    }
}
