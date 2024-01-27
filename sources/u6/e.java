package u6;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import r6.i;
import r6.m;
import r6.n;
import r6.o;
import y6.b;

/* compiled from: JsonTreeReader */
public final class e extends y6.a {
    private static final Reader B = new a();
    private static final Object C = new Object();
    private int[] A;

    /* renamed from: x  reason: collision with root package name */
    private Object[] f16618x;

    /* renamed from: y  reason: collision with root package name */
    private int f16619y;

    /* renamed from: z  reason: collision with root package name */
    private String[] f16620z;

    /* compiled from: JsonTreeReader */
    static class a extends Reader {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    private void V0(b bVar) {
        if (I0() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + I0() + c0());
        }
    }

    private Object W0() {
        return this.f16618x[this.f16619y - 1];
    }

    private Object X0() {
        Object[] objArr = this.f16618x;
        int i10 = this.f16619y - 1;
        this.f16619y = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void Z0(Object obj) {
        int i10 = this.f16619y;
        Object[] objArr = this.f16618x;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[(i10 * 2)];
            int[] iArr = new int[(i10 * 2)];
            String[] strArr = new String[(i10 * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.A, 0, iArr, 0, this.f16619y);
            System.arraycopy(this.f16620z, 0, strArr, 0, this.f16619y);
            this.f16618x = objArr2;
            this.A = iArr;
            this.f16620z = strArr;
        }
        Object[] objArr3 = this.f16618x;
        int i11 = this.f16619y;
        this.f16619y = i11 + 1;
        objArr3[i11] = obj;
    }

    private String c0() {
        return " at path " + m0();
    }

    public void E() {
        V0(b.END_OBJECT);
        X0();
        X0();
        int i10 = this.f16619y;
        if (i10 > 0) {
            int[] iArr = this.A;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public b I0() {
        if (this.f16619y == 0) {
            return b.END_DOCUMENT;
        }
        Object W0 = W0();
        if (W0 instanceof Iterator) {
            boolean z10 = this.f16618x[this.f16619y - 2] instanceof n;
            Iterator it = (Iterator) W0;
            if (!it.hasNext()) {
                return z10 ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z10) {
                return b.NAME;
            }
            Z0(it.next());
            return I0();
        } else if (W0 instanceof n) {
            return b.BEGIN_OBJECT;
        } else {
            if (W0 instanceof i) {
                return b.BEGIN_ARRAY;
            }
            if (W0 instanceof o) {
                o oVar = (o) W0;
                if (oVar.v()) {
                    return b.STRING;
                }
                if (oVar.r()) {
                    return b.BOOLEAN;
                }
                if (oVar.t()) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (W0 instanceof m) {
                return b.NULL;
            } else {
                if (W0 == C) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public boolean L() {
        b I0 = I0();
        return (I0 == b.END_OBJECT || I0 == b.END_ARRAY) ? false : true;
    }

    public void T0() {
        if (I0() == b.NAME) {
            o0();
            this.f16620z[this.f16619y - 2] = "null";
        } else {
            X0();
            int i10 = this.f16619y;
            if (i10 > 0) {
                this.f16620z[i10 - 1] = "null";
            }
        }
        int i11 = this.f16619y;
        if (i11 > 0) {
            int[] iArr = this.A;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    public void Y0() {
        V0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) W0()).next();
        Z0(entry.getValue());
        Z0(new o((String) entry.getKey()));
    }

    public void a() {
        V0(b.BEGIN_ARRAY);
        Z0(((i) W0()).iterator());
        this.A[this.f16619y - 1] = 0;
    }

    public void close() {
        this.f16618x = new Object[]{C};
        this.f16619y = 1;
    }

    public boolean g0() {
        V0(b.BOOLEAN);
        boolean i10 = ((o) X0()).i();
        int i11 = this.f16619y;
        if (i11 > 0) {
            int[] iArr = this.A;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return i10;
    }

    public void h() {
        V0(b.BEGIN_OBJECT);
        Z0(((n) W0()).k().iterator());
    }

    public double h0() {
        b I0 = I0();
        b bVar = b.NUMBER;
        if (I0 == bVar || I0 == b.STRING) {
            double l10 = ((o) W0()).l();
            if (W() || (!Double.isNaN(l10) && !Double.isInfinite(l10))) {
                X0();
                int i10 = this.f16619y;
                if (i10 > 0) {
                    int[] iArr = this.A;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
                return l10;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + l10);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + I0 + c0());
    }

    public int k0() {
        b I0 = I0();
        b bVar = b.NUMBER;
        if (I0 == bVar || I0 == b.STRING) {
            int m10 = ((o) W0()).m();
            X0();
            int i10 = this.f16619y;
            if (i10 > 0) {
                int[] iArr = this.A;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return m10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + I0 + c0());
    }

    public long l0() {
        b I0 = I0();
        b bVar = b.NUMBER;
        if (I0 == bVar || I0 == b.STRING) {
            long n10 = ((o) W0()).n();
            X0();
            int i10 = this.f16619y;
            if (i10 > 0) {
                int[] iArr = this.A;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return n10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + I0 + c0());
    }

    public String m0() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = 0;
        while (i10 < this.f16619y) {
            Object[] objArr = this.f16618x;
            if (objArr[i10] instanceof i) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.A[i10]);
                    sb.append(']');
                }
            } else if (objArr[i10] instanceof n) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f16620z;
                    if (strArr[i10] != null) {
                        sb.append(strArr[i10]);
                    }
                }
            }
            i10++;
        }
        return sb.toString();
    }

    public String o0() {
        V0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) W0()).next();
        String str = (String) entry.getKey();
        this.f16620z[this.f16619y - 1] = str;
        Z0(entry.getValue());
        return str;
    }

    public void s0() {
        V0(b.NULL);
        X0();
        int i10 = this.f16619y;
        if (i10 > 0) {
            int[] iArr = this.A;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String toString() {
        return e.class.getSimpleName();
    }

    public void w() {
        V0(b.END_ARRAY);
        X0();
        X0();
        int i10 = this.f16619y;
        if (i10 > 0) {
            int[] iArr = this.A;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String w0() {
        b I0 = I0();
        b bVar = b.STRING;
        if (I0 == bVar || I0 == b.NUMBER) {
            String p10 = ((o) X0()).p();
            int i10 = this.f16619y;
            if (i10 > 0) {
                int[] iArr = this.A;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return p10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + I0 + c0());
    }
}
