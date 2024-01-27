package n9;

import o8.l;
import o8.m;

/* compiled from: FastServiceLoader.kt */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f15833a;

    static {
        Object obj;
        try {
            l.a aVar = l.f16183h;
            obj = l.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            l.a aVar2 = l.f16183h;
            obj = l.a(m.a(th));
        }
        f15833a = l.d(obj);
    }

    public static final boolean a() {
        return f15833a;
    }
}
