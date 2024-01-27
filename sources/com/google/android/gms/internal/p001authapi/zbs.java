package com.google.android.gms.internal.p001authapi;

import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zbs  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public interface zbs extends IInterface {
    void zbb(Status status, Credential credential);

    void zbc(Status status);

    void zbd(Status status, String str);
}
