package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth-api.zba  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public class zba implements IInterface {
    private final IBinder zba;
    private final String zbb;

    protected zba(IBinder iBinder, String str) {
        this.zba = iBinder;
        this.zbb = str;
    }

    public final IBinder asBinder() {
        return this.zba;
    }

    /* access modifiers changed from: protected */
    public final Parcel zba() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zbb);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void zbb(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zba.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
