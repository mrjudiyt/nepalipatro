package g9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* compiled from: _Strings.kt */
class s extends r {
    public static final String r0(String str, int i10) {
        m.f(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(l.c(i10, str.length()));
            m.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char s0(CharSequence charSequence) {
        m.f(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(q.B(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
