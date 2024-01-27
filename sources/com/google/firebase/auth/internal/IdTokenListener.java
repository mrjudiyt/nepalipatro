package com.google.firebase.auth.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.internal.InternalTokenResult;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public interface IdTokenListener {
    @KeepForSdk
    void onIdTokenChanged(InternalTokenResult internalTokenResult);
}
