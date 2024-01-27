package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzete implements zzetv {
    private final String zza;

    public zzete(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.zza)) {
            bundle.putString("query_info", this.zza);
        }
    }
}
