package c9;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.m;

/* compiled from: PlatformThreadLocalRandom.kt */
public final class a extends b9.a {
    public int e(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    public long g(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    public Random h() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        m.e(current, "current()");
        return current;
    }
}
