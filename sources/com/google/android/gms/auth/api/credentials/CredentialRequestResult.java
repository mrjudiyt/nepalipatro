package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.Result;

@Deprecated
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public interface CredentialRequestResult extends Result {
    Credential getCredential();
}
