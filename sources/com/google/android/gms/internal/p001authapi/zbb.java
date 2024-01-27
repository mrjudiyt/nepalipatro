package com.google.android.gms.internal.p001authapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth-api.zbb  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public class zbb extends Binder implements IInterface {
    protected zbb(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return zba(i10, parcel, parcel2, i11);
    }

    /* access modifiers changed from: protected */
    public boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
