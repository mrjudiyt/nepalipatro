package androidx.datastore.preferences.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil */
final class o1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f2860a = Logger.getLogger(o1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f2861b = B();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f2862c = d.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f2863d = m(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f2864e = m(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final e f2865f = z();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f2866g = Q();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f2867h = P();

    /* renamed from: i  reason: collision with root package name */
    static final long f2868i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f2869j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f2870k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f2871l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f2872m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f2873n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f2874o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f2875p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f2876q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f2877r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f2878s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f2879t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f2880u;

    /* renamed from: v  reason: collision with root package name */
    private static final long f2881v = o(l());

    /* renamed from: w  reason: collision with root package name */
    private static final int f2882w;

    /* renamed from: x  reason: collision with root package name */
    static final boolean f2883x = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* compiled from: UnsafeUtil */
    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* compiled from: UnsafeUtil */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            if (o1.f2883x) {
                return o1.q(obj, j10);
            }
            return o1.r(obj, j10);
        }

        public byte d(Object obj, long j10) {
            if (o1.f2883x) {
                return o1.t(obj, j10);
            }
            return o1.u(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (o1.f2883x) {
                o1.F(obj, j10, z10);
            } else {
                o1.G(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (o1.f2883x) {
                o1.I(obj, j10, b10);
            } else {
                o1.J(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: UnsafeUtil */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            if (o1.f2883x) {
                return o1.q(obj, j10);
            }
            return o1.r(obj, j10);
        }

        public byte d(Object obj, long j10) {
            if (o1.f2883x) {
                return o1.t(obj, j10);
            }
            return o1.u(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (o1.f2883x) {
                o1.F(obj, j10, z10);
            } else {
                o1.G(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (o1.f2883x) {
                o1.I(obj, j10, b10);
            } else {
                o1.J(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: UnsafeUtil */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return this.f2884a.getBoolean(obj, j10);
        }

        public byte d(Object obj, long j10) {
            return this.f2884a.getByte(obj, j10);
        }

        public double e(Object obj, long j10) {
            return this.f2884a.getDouble(obj, j10);
        }

        public float f(Object obj, long j10) {
            return this.f2884a.getFloat(obj, j10);
        }

        public void k(Object obj, long j10, boolean z10) {
            this.f2884a.putBoolean(obj, j10, z10);
        }

        public void l(Object obj, long j10, byte b10) {
            this.f2884a.putByte(obj, j10, b10);
        }

        public void m(Object obj, long j10, double d10) {
            this.f2884a.putDouble(obj, j10, d10);
        }

        public void n(Object obj, long j10, float f10) {
            this.f2884a.putFloat(obj, j10, f10);
        }
    }

    /* compiled from: UnsafeUtil */
    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f2884a;

        e(Unsafe unsafe) {
            this.f2884a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f2884a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f2884a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f2884a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f2884a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f2884a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f2884a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f2884a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f2884a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f2884a.putObject(obj, j10, obj2);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        long j10 = (long) j(byte[].class);
        f2868i = j10;
        f2869j = (long) j(cls6);
        f2870k = (long) k(cls6);
        f2871l = (long) j(cls5);
        f2872m = (long) k(cls5);
        f2873n = (long) j(cls4);
        f2874o = (long) k(cls4);
        f2875p = (long) j(cls3);
        f2876q = (long) k(cls3);
        f2877r = (long) j(cls2);
        f2878s = (long) k(cls2);
        f2879t = (long) j(cls);
        f2880u = (long) k(cls);
        f2882w = (int) (7 & j10);
    }

    private o1() {
    }

    static Object A(Object obj, long j10) {
        return f2865f.i(obj, j10);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f2867h;
    }

    static boolean D() {
        return f2866g;
    }

    static void E(Object obj, long j10, boolean z10) {
        f2865f.k(obj, j10, z10);
    }

    /* access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f2865f.l(bArr, f2868i + j10, b10);
    }

    /* access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int x10 = x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x10 & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f2865f.m(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f2865f.n(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f2865f.o(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f2865f.p(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f2865f.q(obj, j10, obj2);
    }

    private static boolean P() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f2861b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getInt", new Class[]{cls, cls3});
            cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
            cls2.getMethod("getObject", new Class[]{cls, cls3});
            cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
            if (d.c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f2860a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean Q() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f2861b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (l() == null) {
                return false;
            }
            if (d.c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = f2860a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static <T> T i(Class<T> cls) {
        try {
            return f2861b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class<?> cls) {
        if (f2867h) {
            return f2865f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f2867h) {
            return f2865f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n10;
        if (d.c() && (n10 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n10;
        }
        Field n11 = n(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (n11 == null || n11.getType() != Long.TYPE) {
            return null;
        }
        return n11;
    }

    private static boolean m(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!d.c()) {
            return false;
        }
        try {
            Class<?> cls3 = f2862c;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f2865f) == null) {
            return -1;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j10) {
        return f2865f.c(obj, j10);
    }

    /* access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return u(obj, j10) != 0;
    }

    static byte s(byte[] bArr, long j10) {
        return f2865f.d(bArr, f2868i + j10);
    }

    /* access modifiers changed from: private */
    public static byte t(Object obj, long j10) {
        return (byte) ((x(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte u(Object obj, long j10) {
        return (byte) ((x(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j10) {
        return f2865f.e(obj, j10);
    }

    static float w(Object obj, long j10) {
        return f2865f.f(obj, j10);
    }

    static int x(Object obj, long j10) {
        return f2865f.g(obj, j10);
    }

    static long y(Object obj, long j10) {
        return f2865f.h(obj, j10);
    }

    private static e z() {
        Unsafe unsafe = f2861b;
        if (unsafe == null) {
            return null;
        }
        if (!d.c()) {
            return new d(unsafe);
        }
        if (f2863d) {
            return new c(unsafe);
        }
        if (f2864e) {
            return new b(unsafe);
        }
        return null;
    }
}
