package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public interface zbr extends IInterface {
    void zbb(Status status);

    void zbc(Status status);

    void zbd(GoogleSignInAccount googleSignInAccount, Status status);
}
