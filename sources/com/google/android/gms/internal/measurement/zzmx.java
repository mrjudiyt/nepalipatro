package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public enum zzmx {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzhm.zza),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zzmx(Object obj) {
        this.zzk = obj;
    }
}
