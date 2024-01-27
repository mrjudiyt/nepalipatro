package l1;

import java.util.HashSet;
import java.util.Set;

/* compiled from: StartupApiFeature */
public abstract class j {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<j> f9828c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f9829a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9830b;

    /* compiled from: StartupApiFeature */
    public static class a extends j {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    /* compiled from: StartupApiFeature */
    public static class b extends j {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    j(String str, String str2) {
        this.f9829a = str;
        this.f9830b = str2;
        f9828c.add(this);
    }
}
