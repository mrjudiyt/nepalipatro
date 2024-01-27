package n6;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import l6.p;

/* compiled from: Ints */
public final class d extends e {

    /* compiled from: Ints */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: h  reason: collision with root package name */
        final int[] f15776h;

        /* renamed from: i  reason: collision with root package name */
        final int f15777i;

        /* renamed from: j  reason: collision with root package name */
        final int f15778j;

        a(int[] iArr, int i10, int i11) {
            this.f15776h = iArr;
            this.f15777i = i10;
            this.f15778j = i11;
        }

        /* renamed from: a */
        public Integer get(int i10) {
            p.h(i10, size());
            return Integer.valueOf(this.f15776h[this.f15777i + i10]);
        }

        /* renamed from: b */
        public Integer set(int i10, Integer num) {
            p.h(i10, size());
            int[] iArr = this.f15776h;
            int i11 = this.f15777i;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) p.j(num)).intValue();
            return Integer.valueOf(i12);
        }

        /* access modifiers changed from: package-private */
        public int[] c() {
            return Arrays.copyOfRange(this.f15776h, this.f15777i, this.f15778j);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && d.h(this.f15776h, ((Integer) obj).intValue(), this.f15777i, this.f15778j) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f15776h[this.f15777i + i10] != aVar.f15776h[aVar.f15777i + i10]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f15777i; i11 < this.f15778j; i11++) {
                i10 = (i10 * 31) + d.f(this.f15776h[i11]);
            }
            return i10;
        }

        public int indexOf(Object obj) {
            int a10;
            if (!(obj instanceof Integer) || (a10 = d.h(this.f15776h, ((Integer) obj).intValue(), this.f15777i, this.f15778j)) < 0) {
                return -1;
            }
            return a10 - this.f15777i;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b10;
            if (!(obj instanceof Integer) || (b10 = d.i(this.f15776h, ((Integer) obj).intValue(), this.f15777i, this.f15778j)) < 0) {
                return -1;
            }
            return b10 - this.f15777i;
        }

        public int size() {
            return this.f15778j - this.f15777i;
        }

        public List<Integer> subList(int i10, int i11) {
            p.n(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f15776h;
            int i12 = this.f15777i;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f15776h[this.f15777i]);
            int i10 = this.f15777i;
            while (true) {
                i10++;
                if (i10 < this.f15778j) {
                    sb.append(", ");
                    sb.append(this.f15776h[i10]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public static int c(long j10) {
        int i10 = (int) j10;
        p.g(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int d(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int e(int i10, int i11, int i12) {
        p.f(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int f(int i10) {
        return i10;
    }

    public static int g(int[] iArr, int i10) {
        return h(iArr, i10, 0, iArr.length);
    }

    /* access modifiers changed from: private */
    public static int h(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static int i(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int j(long j10) {
        if (j10 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] k(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) p.j(array[i10])).intValue();
        }
        return iArr;
    }
}
