package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ICustomTabsCallback */
public interface a extends IInterface {

    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* compiled from: ICustomTabsCallback */
    public static abstract class C0089a extends Binder implements a {
        public C0089a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            }
            if (i10 != 1598968902) {
                switch (i10) {
                    case 2:
                        i0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3:
                        a0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 4:
                        s0((Bundle) b.c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 5:
                        p0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 6:
                        t0(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 7:
                        Bundle z10 = z(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        b.d(parcel2, z10, 1);
                        break;
                    case 8:
                        U(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
                return true;
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
    }

    /* compiled from: ICustomTabsCallback */
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

    void U(int i10, int i11, Bundle bundle);

    void a0(String str, Bundle bundle);

    void i0(int i10, Bundle bundle);

    void p0(String str, Bundle bundle);

    void s0(Bundle bundle);

    void t0(int i10, Uri uri, boolean z10, Bundle bundle);

    Bundle z(String str, Bundle bundle);
}
