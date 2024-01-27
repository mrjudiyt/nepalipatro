package ea;

import fa.b;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ByteString.kt */
public class h implements Serializable, Comparable<h> {

    /* renamed from: k  reason: collision with root package name */
    public static final h f14363k = new h(new byte[0]);

    /* renamed from: l  reason: collision with root package name */
    public static final a f14364l = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private transient int f14365h;

    /* renamed from: i  reason: collision with root package name */
    private transient String f14366i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f14367j;

    /* compiled from: ByteString.kt */
    public static final class a {
        private a() {
        }

        public final h a(String str) {
            m.g(str, "$this$encodeUtf8");
            h hVar = new h(b.a(str));
            hVar.t(str);
            return hVar;
        }

        public final h b(byte... bArr) {
            m.g(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            m.b(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new h(copyOf);
        }

        public final h c(InputStream inputStream, int i10) {
            m.g(inputStream, "$this$readByteString");
            int i11 = 0;
            if (i10 >= 0) {
                byte[] bArr = new byte[i10];
                while (i11 < i10) {
                    int read = inputStream.read(bArr, i11, i10 - i11);
                    if (read != -1) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new h(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public h(byte[] bArr) {
        m.g(bArr, "data");
        this.f14367j = bArr;
    }

    public static final h e(String str) {
        return f14364l.a(str);
    }

    public static final h q(byte... bArr) {
        return f14364l.b(bArr);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        h c10 = f14364l.c(objectInputStream, objectInputStream.readInt());
        Field declaredField = h.class.getDeclaredField("j");
        m.b(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, c10.f14367j);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f14367j.length);
        objectOutputStream.write(this.f14367j);
    }

    public String a() {
        return a.b(g(), (byte[]) null, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030 A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(ea.h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.m.g(r10, r0)
            int r0 = r9.u()
            int r1 = r10.u()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.h.compareTo(ea.h):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return hVar.u() == g().length && hVar.r(0, g(), 0, g().length);
        }
    }

    public final byte f(int i10) {
        return p(i10);
    }

    public final byte[] g() {
        return this.f14367j;
    }

    public int hashCode() {
        int k10 = k();
        if (k10 != 0) {
            return k10;
        }
        int hashCode = Arrays.hashCode(g());
        s(hashCode);
        return hashCode;
    }

    public final int k() {
        return this.f14365h;
    }

    public int l() {
        return g().length;
    }

    public final String m() {
        return this.f14366i;
    }

    public String n() {
        char[] cArr = new char[(g().length * 2)];
        int i10 = 0;
        for (byte b10 : g()) {
            int i11 = i10 + 1;
            cArr[i10] = b.d()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = b.d()[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] o() {
        return g();
    }

    public byte p(int i10) {
        return g()[i10];
    }

    public boolean r(int i10, byte[] bArr, int i11, int i12) {
        m.g(bArr, "other");
        return i10 >= 0 && i10 <= g().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && c.a(g(), i10, bArr, i11, i12);
    }

    public final void s(int i10) {
        this.f14365h = i10;
    }

    public final void t(String str) {
        this.f14366i = str;
    }

    public String toString() {
        h hVar;
        boolean z10 = true;
        if (g().length == 0) {
            return "[size=0]";
        }
        int a10 = b.b(g(), 64);
        if (a10 != -1) {
            String x10 = x();
            if (x10 != null) {
                String substring = x10.substring(0, a10);
                m.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String t10 = p.t(p.t(p.t(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a10 < x10.length()) {
                    return "[size=" + g().length + " text=" + t10 + "…]";
                }
                return "[text=" + t10 + ']';
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (g().length <= 64) {
            return "[hex=" + n() + ']';
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(g().length);
            sb.append(" hex=");
            if (64 > g().length) {
                z10 = false;
            }
            if (z10) {
                if (64 == g().length) {
                    hVar = this;
                } else {
                    hVar = new h(j.h(g(), 0, 64));
                }
                sb.append(hVar.n());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + g().length + ')').toString());
        }
    }

    public final int u() {
        return l();
    }

    public h v() {
        byte b10;
        int i10 = 0;
        while (i10 < g().length) {
            byte b11 = g()[i10];
            byte b12 = (byte) 65;
            if (b11 < b12 || b11 > (b10 = (byte) 90)) {
                i10++;
            } else {
                byte[] g10 = g();
                byte[] copyOf = Arrays.copyOf(g10, g10.length);
                m.b(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new h(copyOf);
            }
        }
        return this;
    }

    public byte[] w() {
        byte[] g10 = g();
        byte[] copyOf = Arrays.copyOf(g10, g10.length);
        m.b(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public String x() {
        String m10 = m();
        if (m10 != null) {
            return m10;
        }
        String b10 = b.b(o());
        t(b10);
        return b10;
    }

    public void y(e eVar, int i10, int i11) {
        m.g(eVar, "buffer");
        b.c(this, eVar, i10, i11);
    }
}
