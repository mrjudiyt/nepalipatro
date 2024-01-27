package v7;

import com.facebook.internal.security.CertificateUtil;
import ea.h;
import java.io.UnsupportedEncodingException;

/* compiled from: Credentials */
public final class k {
    public static String a(String str, String str2) {
        try {
            String a10 = h.q((str + CertificateUtil.DELIMITER + str2).getBytes("ISO-8859-1")).a();
            return "Basic " + a10;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
