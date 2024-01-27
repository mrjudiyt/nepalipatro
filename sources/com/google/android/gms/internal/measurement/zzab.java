package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzab extends zzal {
    zzab(zzy zzy, String str) {
        super(str);
    }

    public final zzaq zza(zzh zzh, List<zzaq> list) {
        return new zzai(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }
}
