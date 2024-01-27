package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzept implements zzetw {
    private final zzezp zza;

    zzept(zzezp zzezp) {
        this.zza = zzezp;
    }

    public final int zza() {
        return 15;
    }

    public final e zzb() {
        zzezp zzezp = this.zza;
        zzeps zzeps = null;
        if (!(zzezp == null || zzezp.zza() == null || zzezp.zza().isEmpty())) {
            zzeps = new zzeps(this);
        }
        return zzfzt.zzh(zzeps);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
