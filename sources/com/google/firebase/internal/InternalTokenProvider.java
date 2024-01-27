package com.google.firebase.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.GetTokenResult;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public interface InternalTokenProvider {
    @KeepForSdk
    Task<GetTokenResult> getAccessToken(boolean z10);

    @KeepForSdk
    String getUid();
}
