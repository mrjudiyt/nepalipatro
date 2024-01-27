package d6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.b;
import o3.c;

/* compiled from: IGetInstallReferrerService */
public interface a extends IInterface {

    /* renamed from: d6.a$a  reason: collision with other inner class name */
    /* compiled from: IGetInstallReferrerService */
    public static abstract class C0125a extends b implements a {

        /* renamed from: d6.a$a$a  reason: collision with other inner class name */
        /* compiled from: IGetInstallReferrerService */
        public static class C0126a extends o3.a implements a {
            C0126a(IBinder iBinder) {
                super(iBinder);
            }

            public final Bundle E(Bundle bundle) {
                Parcel z02 = z0();
                c.b(z02, bundle);
                Parcel A0 = A0(z02);
                Bundle bundle2 = (Bundle) c.a(A0, Bundle.CREATOR);
                A0.recycle();
                return bundle2;
            }
        }

        public static a z0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new C0126a(iBinder);
        }
    }

    Bundle E(Bundle bundle);
}
