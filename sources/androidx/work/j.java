package androidx.work;

import java.util.List;

/* compiled from: InputMerger */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4909a = m.f("InputMerger");

    public static j a(String str) {
        try {
            return (j) Class.forName(str).newInstance();
        } catch (Exception e10) {
            m c10 = m.c();
            String str2 = f4909a;
            c10.b(str2, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract e b(List<e> list);
}
