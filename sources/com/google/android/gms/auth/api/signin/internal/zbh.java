package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
final class zbh extends zba {
    final /* synthetic */ zbi zba;

    zbh(zbi zbi) {
        this.zba = zbi;
    }

    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
