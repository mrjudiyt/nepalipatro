package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: com.google.android.gms.internal.auth-api.zbz  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public final class zbz extends zba {
    zbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbaf zbaf, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbaf);
        zbc.zbc(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(zbah zbah, SavePasswordRequest savePasswordRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbah);
        zbc.zbc(zba, savePasswordRequest);
        zbb(2, zba);
    }
}
