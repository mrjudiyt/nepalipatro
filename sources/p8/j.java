package p8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: _ArraysJvm.kt */
class j extends i {
    public static <T> List<T> c(T[] tArr) {
        m.f(tArr, "<this>");
        List<T> a10 = l.a(tArr);
        m.e(a10, "asList(this)");
        return a10;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        m.f(bArr, "<this>");
        m.f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static final <T> T[] e(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        m.f(tArr, "<this>");
        m.f(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] f(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return d(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return e(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] h(byte[] bArr, int i10, int i11) {
        m.f(bArr, "<this>");
        h.b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        m.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final <T> void i(T[] tArr, T t10, int i10, int i11) {
        m.f(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static <T> void j(T[] tArr) {
        m.f(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void k(T[] tArr, Comparator<? super T> comparator) {
        m.f(tArr, "<this>");
        m.f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
