package x5;

import a6.m0;
import a6.y;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebvttParserUtil */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f12831a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(y yVar) {
        String o10;
        while (true) {
            String o11 = yVar.o();
            if (o11 == null) {
                return null;
            }
            if (f12831a.matcher(o11).matches()) {
                do {
                    o10 = yVar.o();
                    if (o10 == null) {
                        break;
                    }
                } while (o10.isEmpty());
            } else {
                Matcher matcher = f.f12805a.matcher(o11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(y yVar) {
        String o10 = yVar.o();
        return o10 != null && o10.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] F0 = m0.F0(str, "\\.");
        long j10 = 0;
        for (String parseLong : m0.E0(F0[0], CertificateUtil.DELIMITER)) {
            j10 = (j10 * 60) + Long.parseLong(parseLong);
        }
        long j11 = j10 * 1000;
        if (F0.length == 2) {
            j11 += Long.parseLong(F0[1]);
        }
        return j11 * 1000;
    }

    public static void e(y yVar) {
        int e10 = yVar.e();
        if (!b(yVar)) {
            yVar.O(e10);
            String valueOf = String.valueOf(yVar.o());
            throw ParserException.a(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "), (Throwable) null);
        }
    }
}
