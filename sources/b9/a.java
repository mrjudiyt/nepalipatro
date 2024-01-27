package b9;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
public abstract class a extends c {
    public int b(int i10) {
        return d.f(h().nextInt(), i10);
    }

    public int c() {
        return h().nextInt();
    }

    public int d(int i10) {
        return h().nextInt(i10);
    }

    public long f() {
        return h().nextLong();
    }

    public abstract Random h();
}
