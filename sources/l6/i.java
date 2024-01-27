package l6;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: Joiner */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f15610a;

    private i(String str) {
        this.f15610a = (String) p.j(str);
    }

    public static i e(char c10) {
        return new i(String.valueOf(c10));
    }

    public <A extends Appendable> A a(A a10, Iterator<? extends Object> it) {
        p.j(a10);
        if (it.hasNext()) {
            a10.append(f(it.next()));
            while (it.hasNext()) {
                a10.append(this.f15610a);
                a10.append(f(it.next()));
            }
        }
        return a10;
    }

    public final StringBuilder b(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String c(Iterable<? extends Object> iterable) {
        return d(iterable.iterator());
    }

    public final String d(Iterator<? extends Object> it) {
        return b(new StringBuilder(), it).toString();
    }

    /* access modifiers changed from: package-private */
    public CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
