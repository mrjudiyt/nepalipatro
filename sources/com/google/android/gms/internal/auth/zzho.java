package com.google.android.gms.internal.auth;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
public enum zzho {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzee.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zzho(Object obj) {
        this.zzk = obj;
    }
}
