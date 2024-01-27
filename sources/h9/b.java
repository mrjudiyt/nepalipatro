package h9;

import java.text.DecimalFormat;

/* compiled from: DurationJvm.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f14845a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat>[] f14846b;

    static {
        Class<a> cls = a.class;
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f14846b = threadLocalArr;
    }

    public static final boolean a() {
        return f14845a;
    }
}
