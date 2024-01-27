package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: Internal */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f3024a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f3025b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f3026c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f3027d;

    /* renamed from: e  reason: collision with root package name */
    public static final i f3028e;

    /* compiled from: Internal */
    public interface a extends i<Boolean> {
    }

    /* compiled from: Internal */
    public interface b extends i<Double> {
    }

    /* compiled from: Internal */
    public interface c {
        int getNumber();
    }

    /* compiled from: Internal */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* compiled from: Internal */
    public interface e {
        boolean a(int i10);
    }

    /* compiled from: Internal */
    public interface f extends i<Float> {
    }

    /* compiled from: Internal */
    public interface g extends i<Integer> {
    }

    /* compiled from: Internal */
    public interface h extends i<Long> {
    }

    /* compiled from: Internal */
    public interface i<E> extends List<E>, RandomAccess {
        boolean Y();

        void h();

        i<E> q(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f3026c = bArr;
        f3027d = ByteBuffer.wrap(bArr);
        f3028e = i.h(bArr);
    }

    static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    static <T> T b(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return p1.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((p0) obj).b().h((p0) obj2).j();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f3024a);
    }
}
