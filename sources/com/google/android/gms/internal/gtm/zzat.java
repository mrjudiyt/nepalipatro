package com.google.android.gms.internal.gtm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public class zzat extends Binder implements IInterface {
    protected zzat(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return zza(i10, parcel, parcel2, i11);
    }

    /* access modifiers changed from: protected */
    public boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
