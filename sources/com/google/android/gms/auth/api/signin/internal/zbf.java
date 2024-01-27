package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
final class zbf extends zba {
    final /* synthetic */ zbg zba;

    zbf(zbg zbg) {
        this.zba = zbg;
    }

    public final void zbd(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            zbn.zbc(this.zba.zba).zbe(this.zba.zbb, googleSignInAccount);
        }
        this.zba.setResult(new GoogleSignInResult(googleSignInAccount, status));
    }
}
