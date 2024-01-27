package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdwy implements zzhbc {
    private final zzhbp zza;

    public zzdwy(zzhbp zzhbp) {
        this.zza = zzhbp;
    }

    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzhbk.zzb(applicationInfo);
        return applicationInfo;
    }
}
