package k1;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import l1.d;

/* compiled from: WebViewCompat */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f9491a = Uri.parse("*");

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f9492b = Uri.parse("");

    /* compiled from: WebViewCompat */
    public interface a {
        void onComplete(long j10);
    }

    public static PackageInfo a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            return null;
        }
        if (i10 >= 26) {
            return d.a();
        }
        try {
            return b();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke((Object) null, new Object[0]);
    }
}
