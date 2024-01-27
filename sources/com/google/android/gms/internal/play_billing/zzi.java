package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public class zzi extends Binder implements IInterface {
    protected zzi(String str) {
        attachInterface(this, "com.android.vending.billing.IInAppBillingServiceCallback");
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
        return zzb(i10, parcel, parcel2, i11);
    }

    /* access modifiers changed from: protected */
    public boolean zzb(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
