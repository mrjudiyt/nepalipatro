package y7;

import com.google.android.gms.common.api.Api;

/* compiled from: HeaderParser */
public final class d {
    public static int a(String str, int i10) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static int b(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static int c(String str, int i10) {
        while (i10 < str.length() && ((r0 = str.charAt(i10)) == ' ' || r0 == 9)) {
            i10++;
        }
        return i10;
    }
}
