package b9;

import java.util.Random;
import kotlin.jvm.internal.m;

/* compiled from: PlatformRandom.kt */
public final class b extends a {

    /* renamed from: j  reason: collision with root package name */
    private final a f13331j = new a();

    /* compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random h() {
        Object obj = this.f13331j.get();
        m.e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
