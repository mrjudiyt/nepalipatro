package o8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.m;

/* compiled from: Exceptions.kt */
class b {
    public static void a(Throwable th, Throwable th2) {
        m.f(th, "<this>");
        m.f(th2, Constants.EXCEPTION);
        if (th != th2) {
            t8.b.f16599a.a(th, th2);
        }
    }

    public static String b(Throwable th) {
        m.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        m.e(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
