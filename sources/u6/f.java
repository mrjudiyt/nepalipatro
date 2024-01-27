package u6;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import r6.i;
import r6.l;
import r6.m;
import r6.n;
import r6.o;
import y6.c;

/* compiled from: JsonTreeWriter */
public final class f extends c {

    /* renamed from: v  reason: collision with root package name */
    private static final Writer f16621v = new a();

    /* renamed from: w  reason: collision with root package name */
    private static final o f16622w = new o("closed");

    /* renamed from: s  reason: collision with root package name */
    private final List<l> f16623s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    private String f16624t;

    /* renamed from: u  reason: collision with root package name */
    private l f16625u = m.f16369a;

    /* compiled from: JsonTreeWriter */
    static class a extends Writer {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f16621v);
    }

    private l Q0() {
        List<l> list = this.f16623s;
        return list.get(list.size() - 1);
    }

    private void R0(l lVar) {
        if (this.f16624t != null) {
            if (!lVar.e() || J()) {
                ((n) Q0()).i(this.f16624t, lVar);
            }
            this.f16624t = null;
        } else if (this.f16623s.isEmpty()) {
            this.f16625u = lVar;
        } else {
            l Q0 = Q0();
            if (Q0 instanceof i) {
                ((i) Q0).i(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public c E() {
        if (this.f16623s.isEmpty() || this.f16624t != null) {
            throw new IllegalStateException();
        } else if (Q0() instanceof n) {
            List<l> list = this.f16623s;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c I0(long j10) {
        R0(new o((Number) Long.valueOf(j10)));
        return this;
    }

    public c K0(Boolean bool) {
        if (bool == null) {
            return g0();
        }
        R0(new o(bool));
        return this;
    }

    public c L0(Number number) {
        if (number == null) {
            return g0();
        }
        if (!W()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        R0(new o(number));
        return this;
    }

    public c M0(String str) {
        if (str == null) {
            return g0();
        }
        R0(new o(str));
        return this;
    }

    public c N0(boolean z10) {
        R0(new o(Boolean.valueOf(z10)));
        return this;
    }

    public l P0() {
        if (this.f16623s.isEmpty()) {
            return this.f16625u;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f16623s);
    }

    public c Y(String str) {
        if (this.f16623s.isEmpty() || this.f16624t != null) {
            throw new IllegalStateException();
        } else if (Q0() instanceof n) {
            this.f16624t = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() {
        if (this.f16623s.isEmpty()) {
            this.f16623s.add(f16622w);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void flush() {
    }

    public c g0() {
        R0(m.f16369a);
        return this;
    }

    public c j() {
        i iVar = new i();
        R0(iVar);
        this.f16623s.add(iVar);
        return this;
    }

    public c q() {
        n nVar = new n();
        R0(nVar);
        this.f16623s.add(nVar);
        return this;
    }

    public c w() {
        if (this.f16623s.isEmpty() || this.f16624t != null) {
            throw new IllegalStateException();
        } else if (Q0() instanceof i) {
            List<l> list = this.f16623s;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
