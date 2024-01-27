package f6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public class h extends Binder implements IInterface {
    protected h(String str) {
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
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
        return z0(i10, parcel, parcel2, i11);
    }

    /* access modifiers changed from: protected */
    public boolean z0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
