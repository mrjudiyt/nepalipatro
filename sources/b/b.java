package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: ICustomTabsService */
public interface b extends IInterface {

    /* compiled from: ICustomTabsService */
    public static abstract class a extends Binder implements b {

        /* renamed from: b.b$a$a  reason: collision with other inner class name */
        /* compiled from: ICustomTabsService */
        private static class C0090a implements b {

            /* renamed from: h  reason: collision with root package name */
            private IBinder f4952h;

            C0090a(IBinder iBinder) {
                this.f4952h = iBinder;
            }

            public boolean D(a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0091b.b(obtain, uri, 0);
                    C0091b.b(obtain, bundle, 0);
                    obtain.writeTypedList(list);
                    this.f4952h.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean L(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j10);
                    boolean z10 = false;
                    this.f4952h.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean M(a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    this.f4952h.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4952h;
            }

            public boolean f0(a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0091b.b(obtain, bundle, 0);
                    this.f4952h.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b z0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new C0090a(iBinder);
            }
            return (b) queryLocalInterface;
        }
    }

    /* renamed from: b.b$b  reason: collision with other inner class name */
    /* compiled from: ICustomTabsService */
    public static class C0091b {
        /* access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    boolean D(a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    boolean L(long j10);

    boolean M(a aVar);

    boolean f0(a aVar, Bundle bundle);
}
