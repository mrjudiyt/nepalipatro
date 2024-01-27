package f6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public class a implements IInterface {

    /* renamed from: h  reason: collision with root package name */
    private final IBinder f14549h;

    /* renamed from: i  reason: collision with root package name */
    private final String f14550i = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    protected a(IBinder iBinder, String str) {
        this.f14549h = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void A0(int i10, Parcel parcel) {
        try {
            this.f14549h.transact(i10, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f14549h;
    }

    /* access modifiers changed from: protected */
    public final Parcel z0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14550i);
        return obtain;
    }
}
