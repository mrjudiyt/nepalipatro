package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.p001authapi.zbb;

/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public abstract class zbo extends zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zbc();
        } else if (i10 != 2) {
            return false;
        } else {
            zbb();
        }
        return true;
    }
}
