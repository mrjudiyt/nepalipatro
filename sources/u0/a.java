package u0;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: AdServicesInfo.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11725a = new a();

    /* renamed from: u0.a$a  reason: collision with other inner class name */
    /* compiled from: AdServicesInfo.kt */
    private static final class C0201a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0201a f11726a = new C0201a();

        private C0201a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0201a.f11726a.a();
        }
        return 0;
    }
}
