package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: IMediaSession */
public interface a extends IInterface {

    /* renamed from: androidx.media2.session.a$a  reason: collision with other inner class name */
    /* compiled from: IMediaSession */
    public static abstract class C0065a extends Binder implements a {

        /* renamed from: androidx.media2.session.a$a$a  reason: collision with other inner class name */
        /* compiled from: IMediaSession */
        private static class C0066a implements a {

            /* renamed from: h  reason: collision with root package name */
            private IBinder f3860h;

            C0066a(IBinder iBinder) {
                this.f3860h = iBinder;
            }

            public IBinder asBinder() {
                return this.f3860h;
            }
        }

        public static a z0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media2.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0066a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }
}
