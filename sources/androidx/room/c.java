package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.b;

/* compiled from: IMultiInstanceInvalidationService */
public interface c extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService */
    public static abstract class a extends Binder implements c {

        /* renamed from: androidx.room.c$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationService */
        private static class C0074a implements c {

            /* renamed from: h  reason: collision with root package name */
            private IBinder f4349h;

            C0074a(IBinder iBinder) {
                this.f4349h = iBinder;
            }

            public IBinder asBinder() {
                return this.f4349h;
            }

            public void q0(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f4349h.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void v0(b bVar, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i10);
                    this.f4349h.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int x(b bVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4349h.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static c z0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof c)) {
                return new C0074a(iBinder);
            }
            return (c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int x10 = x(b.a.z0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(x10);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                v0(b.a.z0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                q0(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    void q0(int i10, String[] strArr);

    void v0(b bVar, int i10);

    int x(b bVar, String str);
}
