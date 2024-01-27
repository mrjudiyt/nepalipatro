package o3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: BaseProxy */
public class a implements IInterface {

    /* renamed from: h  reason: collision with root package name */
    private final IBinder f10368h;

    /* renamed from: i  reason: collision with root package name */
    private final String f10369i = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected a(IBinder iBinder) {
        this.f10368h = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel A0(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f10368h.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f10368h;
    }

    /* access modifiers changed from: protected */
    public final Parcel z0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10369i);
        return obtain;
    }
}
