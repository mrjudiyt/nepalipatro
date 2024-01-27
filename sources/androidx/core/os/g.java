package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: ConfigurationCompat */
public final class g {

    /* compiled from: ConfigurationCompat */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, k kVar) {
            configuration.setLocales((LocaleList) kVar.d());
        }
    }

    public static k a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return k.e(a.a(configuration));
        }
        return k.a(configuration.locale);
    }
}
