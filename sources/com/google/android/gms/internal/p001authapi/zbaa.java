package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zbaa  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public abstract class zbaa extends zbb implements zbab {
    public zbaa() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zbc.zbb(parcel);
        zbb((Status) zbc.zba(parcel, Status.CREATOR), (PendingIntent) zbc.zba(parcel, PendingIntent.CREATOR));
        return true;
    }
}
