package y6;

import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* compiled from: JsonWriter */
public class c implements Closeable, Flushable {

    /* renamed from: q  reason: collision with root package name */
    private static final String[] f17323q = new String[128];

    /* renamed from: r  reason: collision with root package name */
    private static final String[] f17324r;

    /* renamed from: h  reason: collision with root package name */
    private final Writer f17325h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f17326i = new int[32];

    /* renamed from: j  reason: collision with root package name */
    private int f17327j = 0;

    /* renamed from: k  reason: collision with root package name */
    private String f17328k;

    /* renamed from: l  reason: collision with root package name */
    private String f17329l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f17330m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f17331n;

    /* renamed from: o  reason: collision with root package name */
    private String f17332o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f17333p;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f17323q[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f17323q;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f17324r = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        l0(6);
        this.f17329l = CertificateUtil.DELIMITER;
        this.f17333p = true;
        Objects.requireNonNull(writer, "out == null");
        this.f17325h = writer;
    }

    private void O0() {
        if (this.f17332o != null) {
            a();
            y0(this.f17332o);
            this.f17332o = null;
        }
    }

    private void a() {
        int k02 = k0();
        if (k02 == 5) {
            this.f17325h.write(44);
        } else if (k02 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        c0();
        o0(4);
    }

    private void c0() {
        if (this.f17328k != null) {
            this.f17325h.write("\n");
            int i10 = this.f17327j;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f17325h.write(this.f17328k);
            }
        }
    }

    private void h() {
        int k02 = k0();
        if (k02 == 1) {
            o0(2);
            c0();
        } else if (k02 == 2) {
            this.f17325h.append(',');
            c0();
        } else if (k02 != 4) {
            if (k02 != 6) {
                if (k02 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f17330m) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            o0(7);
        } else {
            this.f17325h.append(this.f17329l);
            o0(5);
        }
    }

    private c h0(int i10, String str) {
        h();
        l0(i10);
        this.f17325h.write(str);
        return this;
    }

    private int k0() {
        int i10 = this.f17327j;
        if (i10 != 0) {
            return this.f17326i[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void l0(int i10) {
        int i11 = this.f17327j;
        int[] iArr = this.f17326i;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(i11 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f17326i = iArr2;
        }
        int[] iArr3 = this.f17326i;
        int i12 = this.f17327j;
        this.f17327j = i12 + 1;
        iArr3[i12] = i10;
    }

    private void o0(int i10) {
        this.f17326i[this.f17327j - 1] = i10;
    }

    private c u(int i10, int i11, String str) {
        int k02 = k0();
        if (k02 != i11 && k02 != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f17332o == null) {
            this.f17327j--;
            if (k02 == i11) {
                c0();
            }
            this.f17325h.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f17332o);
        }
    }

    private void y0(String str) {
        String str2;
        String[] strArr = this.f17331n ? f17324r : f17323q;
        this.f17325h.write("\"");
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                this.f17325h.write(str, i10, i11 - i10);
            }
            this.f17325h.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.f17325h.write(str, i10, length - i10);
        }
        this.f17325h.write("\"");
    }

    public c E() {
        return u(3, 5, "}");
    }

    public c I0(long j10) {
        O0();
        h();
        this.f17325h.write(Long.toString(j10));
        return this;
    }

    public final boolean J() {
        return this.f17333p;
    }

    public c K0(Boolean bool) {
        if (bool == null) {
            return g0();
        }
        O0();
        h();
        this.f17325h.write(bool.booleanValue() ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    public final boolean L() {
        return this.f17331n;
    }

    public c L0(Number number) {
        if (number == null) {
            return g0();
        }
        O0();
        String obj = number.toString();
        if (this.f17330m || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            h();
            this.f17325h.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c M0(String str) {
        if (str == null) {
            return g0();
        }
        O0();
        h();
        y0(str);
        return this;
    }

    public c N0(boolean z10) {
        O0();
        h();
        this.f17325h.write(z10 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    public boolean W() {
        return this.f17330m;
    }

    public c Y(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f17332o != null) {
            throw new IllegalStateException();
        } else if (this.f17327j != 0) {
            this.f17332o = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public void close() {
        this.f17325h.close();
        int i10 = this.f17327j;
        if (i10 > 1 || (i10 == 1 && this.f17326i[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f17327j = 0;
    }

    public void flush() {
        if (this.f17327j != 0) {
            this.f17325h.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g0() {
        if (this.f17332o != null) {
            if (this.f17333p) {
                O0();
            } else {
                this.f17332o = null;
                return this;
            }
        }
        h();
        this.f17325h.write("null");
        return this;
    }

    public c j() {
        O0();
        return h0(1, "[");
    }

    public c q() {
        O0();
        return h0(3, "{");
    }

    public final void r0(boolean z10) {
        this.f17331n = z10;
    }

    public final void s0(String str) {
        if (str.length() == 0) {
            this.f17328k = null;
            this.f17329l = CertificateUtil.DELIMITER;
            return;
        }
        this.f17328k = str;
        this.f17329l = ": ";
    }

    public final void v0(boolean z10) {
        this.f17330m = z10;
    }

    public c w() {
        return u(1, 2, "]");
    }

    public final void w0(boolean z10) {
        this.f17333p = z10;
    }
}
