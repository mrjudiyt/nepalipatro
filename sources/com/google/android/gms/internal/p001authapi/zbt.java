package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: com.google.android.gms.internal.auth-api.zbt  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public final class zbt extends zba {
    zbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zbc(zbs zbs, zbp zbp) {
        Parcel zba = zba();
        zbc.zbd(zba, zbs);
        zbc.zbc(zba, zbp);
        zbb(3, zba);
    }

    public final void zbd(zbs zbs, CredentialRequest credentialRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbs);
        zbc.zbc(zba, credentialRequest);
        zbb(1, zba);
    }

    public final void zbe(zbs zbs, zbu zbu) {
        Parcel zba = zba();
        zbc.zbd(zba, zbs);
        zbc.zbc(zba, zbu);
        zbb(2, zba);
    }

    public final void zbf(zbs zbs) {
        Parcel zba = zba();
        zbc.zbd(zba, zbs);
        zbb(4, zba);
    }
}
