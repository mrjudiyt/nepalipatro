package a6;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: Log */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f234a = true;

    private static String a(String str, Throwable th) {
        String e10 = e(th);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = e10.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(valueOf.length() + 4 + String.valueOf(replace).length());
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace);
        sb.append(10);
        return sb.toString();
    }

    public static void b(String str, String str2) {
    }

    public static void c(String str, String str2) {
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        if (g(th)) {
            return "UnknownHostException (no network)";
        }
        if (!f234a) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void f(String str, String str2) {
    }

    private static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
    }

    public static void i(String str, String str2, Throwable th) {
        h(str, a(str2, th));
    }
}
