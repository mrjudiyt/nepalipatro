package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class zaj extends zab implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zab(parcel.readInt());
        return true;
    }
}
