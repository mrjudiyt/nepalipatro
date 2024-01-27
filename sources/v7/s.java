package v7;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MediaType */
public final class s {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f16894e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f16895f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    private final String f16896a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16897b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16898c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16899d;

    private s(String str, String str2, String str3, String str4) {
        this.f16896a = str;
        this.f16897b = str2;
        this.f16898c = str3;
        this.f16899d = str4;
    }

    public static s c(String str) {
        String str2;
        Matcher matcher = f16894e.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f16895f.matcher(str);
        String str3 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                if (matcher2.group(2) != null) {
                    str2 = matcher2.group(2);
                } else {
                    str2 = matcher2.group(3);
                }
                if (str3 == null || str2.equalsIgnoreCase(str3)) {
                    str3 = str2;
                } else {
                    throw new IllegalArgumentException("Multiple different charsets: " + str);
                }
            }
        }
        return new s(str, lowerCase, lowerCase2, str3);
    }

    public Charset a() {
        String str = this.f16899d;
        if (str != null) {
            return Charset.forName(str);
        }
        return null;
    }

    public Charset b(Charset charset) {
        String str = this.f16899d;
        return str != null ? Charset.forName(str) : charset;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).f16896a.equals(this.f16896a);
    }

    public int hashCode() {
        return this.f16896a.hashCode();
    }

    public String toString() {
        return this.f16896a;
    }
}
