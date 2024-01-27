package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationCallback */
public interface b extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class a extends Binder implements b {

        /* renamed from: androidx.room.b$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationCallback */
        private static class C0073a implements b {

            /* renamed from: h  reason: collision with root package name */
            private IBinder f4348h;

            C0073a(IBinder iBinder) {
                this.f4348h = iBinder;
            }

            public IBinder asBinder() {
                return this.f4348h;
            }

            public void s(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f4348h.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static b z0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new C0073a(iBinder);
            }
            return (b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                s(parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    void s(String[] strArr);
}
