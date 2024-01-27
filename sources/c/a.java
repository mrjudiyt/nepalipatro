package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: IResultReceiver */
public interface a extends IInterface {

    /* renamed from: b  reason: collision with root package name */
    public static final String f5141b = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* compiled from: IResultReceiver */
    public static abstract class C0098a extends Binder implements a {

        /* renamed from: c.a$a$a  reason: collision with other inner class name */
        /* compiled from: IResultReceiver */
        private static class C0099a implements a {

            /* renamed from: h  reason: collision with root package name */
            private IBinder f5142h;

            C0099a(IBinder iBinder) {
                this.f5142h = iBinder;
            }

            public IBinder asBinder() {
                return this.f5142h;
            }

            public void x0(int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f5141b);
                    obtain.writeInt(i10);
                    b.d(obtain, bundle, 0);
                    this.f5142h.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0098a() {
            attachInterface(this, a.f5141b);
        }

        public static a z0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f5141b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0099a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f5141b;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                x0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* compiled from: IResultReceiver */
    public static class b {
        /* access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void x0(int i10, Bundle bundle);
}
