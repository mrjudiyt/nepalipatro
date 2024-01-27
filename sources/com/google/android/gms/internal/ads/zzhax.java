package com.google.android.gms.internal.ads;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzhax {
    final LinkedHashMap zza;

    zzhax(int i10) {
        this.zza = zzhaz.zzb(i10);
    }

    /* access modifiers changed from: package-private */
    public final zzhax zza(Object obj, zzhbp zzhbp) {
        zzhbk.zza(obj, Constants.KEY);
        zzhbk.zza(zzhbp, "provider");
        this.zza.put(obj, zzhbp);
        return this;
    }
}
