package e4;

import android.os.Build;
import java.util.HashSet;

/* compiled from: ExoPlayerLibraryInfo */
public final class i {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final String f8082a;

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet<String> f8083b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private static String f8084c = "goog.exo.core";

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
        sb.append("ExoPlayerLib/2.15.0 (Linux; Android ");
        sb.append(str);
        sb.append(") ");
        sb.append("ExoPlayerLib/2.15.0");
        f8082a = sb.toString();
    }

    public static synchronized void a(String str) {
        synchronized (i.class) {
            if (f8083b.add(str)) {
                String str2 = f8084c;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                f8084c = sb.toString();
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (i.class) {
            str = f8084c;
        }
        return str;
    }
}
