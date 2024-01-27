package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: ByteString */
public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final h f2754i = new j(z.f3026c);

    /* renamed from: j  reason: collision with root package name */
    private static final f f2755j = (d.c() ? new k((a) null) : new d((a) null));

    /* renamed from: k  reason: collision with root package name */
    private static final Comparator<h> f2756k = new b();

    /* renamed from: h  reason: collision with root package name */
    private int f2757h = 0;

    /* compiled from: ByteString */
    class a extends c {

        /* renamed from: h  reason: collision with root package name */
        private int f2758h = 0;

        /* renamed from: i  reason: collision with root package name */
        private final int f2759i;

        a() {
            this.f2759i = h.this.size();
        }

        public byte a() {
            int i10 = this.f2758h;
            if (i10 < this.f2759i) {
                this.f2758h = i10 + 1;
                return h.this.k(i10);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f2758h < this.f2759i;
        }
    }

    /* compiled from: ByteString */
    static class b implements Comparator<h> {
        b() {
        }

        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            g m10 = hVar.iterator();
            g m11 = hVar2.iterator();
            while (m10.hasNext() && m11.hasNext()) {
                int compare = Integer.compare(h.u(m10.a()), h.u(m11.a()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(hVar.size(), hVar2.size());
        }
    }

    /* compiled from: ByteString */
    static abstract class c implements g {
        c() {
        }

        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString */
    private static final class d implements f {
        private d() {
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString */
    private static final class e extends j {

        /* renamed from: m  reason: collision with root package name */
        private final int f2761m;

        /* renamed from: n  reason: collision with root package name */
        private final int f2762n;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.d(i10, i10 + i11, bArr.length);
            this.f2761m = i10;
            this.f2762n = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: protected */
        public int D() {
            return this.f2761m;
        }

        public byte b(int i10) {
            h.c(i10, size());
            return this.f2765l[this.f2761m + i10];
        }

        /* access modifiers changed from: protected */
        public void i(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f2765l, D() + i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte k(int i10) {
            return this.f2765l[this.f2761m + i10];
        }

        public int size() {
            return this.f2762n;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return h.z(t());
        }
    }

    /* compiled from: ByteString */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* compiled from: ByteString */
    public interface g extends Iterator<Byte> {
        byte a();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$h  reason: collision with other inner class name */
    /* compiled from: ByteString */
    static final class C0044h {

        /* renamed from: a  reason: collision with root package name */
        private final CodedOutputStream f2763a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f2764b;

        /* synthetic */ C0044h(int i10, a aVar) {
            this(i10);
        }

        public h a() {
            this.f2763a.c();
            return new j(this.f2764b);
        }

        public CodedOutputStream b() {
            return this.f2763a;
        }

        private C0044h(int i10) {
            byte[] bArr = new byte[i10];
            this.f2764b = bArr;
            this.f2763a = CodedOutputStream.g0(bArr);
        }
    }

    /* compiled from: ByteString */
    static abstract class i extends h {
        i() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return h.super.iterator();
        }
    }

    /* compiled from: ByteString */
    private static class j extends i {

        /* renamed from: l  reason: collision with root package name */
        protected final byte[] f2765l;

        j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f2765l = bArr;
        }

        /* access modifiers changed from: package-private */
        public final void B(g gVar) {
            gVar.a(this.f2765l, D(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean C(h hVar, int i10, int i11) {
            if (i11 <= hVar.size()) {
                int i12 = i10 + i11;
                if (i12 > hVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
                } else if (!(hVar instanceof j)) {
                    return hVar.s(i10, i12).equals(s(0, i11));
                } else {
                    j jVar = (j) hVar;
                    byte[] bArr = this.f2765l;
                    byte[] bArr2 = jVar.f2765l;
                    int D = D() + i11;
                    int D2 = D();
                    int D3 = jVar.D() + i10;
                    while (D2 < D) {
                        if (bArr[D2] != bArr2[D3]) {
                            return false;
                        }
                        D2++;
                        D3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int D() {
            return 0;
        }

        public byte b(int i10) {
            return this.f2765l[i10];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int r10 = r();
            int r11 = jVar.r();
            if (r10 == 0 || r11 == 0 || r10 == r11) {
                return C(jVar, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void i(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f2765l, i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte k(int i10) {
            return this.f2765l[i10];
        }

        public final boolean l() {
            int D = D();
            return p1.n(this.f2765l, D, size() + D);
        }

        public final i o() {
            return i.j(this.f2765l, D(), size(), true);
        }

        /* access modifiers changed from: protected */
        public final int p(int i10, int i11, int i12) {
            return z.i(i10, this.f2765l, D() + i11, i12);
        }

        public final h s(int i10, int i11) {
            int d10 = h.d(i10, i11, size());
            if (d10 == 0) {
                return h.f2754i;
            }
            return new e(this.f2765l, D() + i10, d10);
        }

        public int size() {
            return this.f2765l.length;
        }

        /* access modifiers changed from: protected */
        public final String x(Charset charset) {
            return new String(this.f2765l, D(), size(), charset);
        }
    }

    /* compiled from: ByteString */
    private static final class k implements f {
        private k() {
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    h() {
    }

    static h A(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void c(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    static int d(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static h e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static h f(byte[] bArr, int i10, int i11) {
        d(i10, i10 + i11, bArr.length);
        return new j(f2755j.a(bArr, i10, i11));
    }

    public static h g(String str) {
        return new j(str.getBytes(z.f3024a));
    }

    static C0044h n(int i10) {
        return new C0044h(i10, (a) null);
    }

    /* access modifiers changed from: private */
    public static int u(byte b10) {
        return b10 & 255;
    }

    static h z(byte[] bArr) {
        return new j(bArr);
    }

    /* access modifiers changed from: package-private */
    public abstract void B(g gVar);

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f2757h;
        if (i10 == 0) {
            int size = size();
            i10 = p(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f2757h = i10;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public abstract void i(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract byte k(int i10);

    public abstract boolean l();

    /* renamed from: m */
    public g iterator() {
        return new a();
    }

    public abstract i o();

    /* access modifiers changed from: protected */
    public abstract int p(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public final int r() {
        return this.f2757h;
    }

    public abstract h s(int i10, int i11);

    public abstract int size();

    public final byte[] t() {
        int size = size();
        if (size == 0) {
            return z.f3026c;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public final String v(Charset charset) {
        return size() == 0 ? "" : x(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String x(Charset charset);

    public final String y() {
        return v(z.f3024a);
    }
}
