package t6;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber */
public final class g extends Number {

    /* renamed from: h  reason: collision with root package name */
    private final String f16523h;

    public g(String str) {
        this.f16523h = str;
    }

    private Object writeReplace() {
        return new BigDecimal(this.f16523h);
    }

    public double doubleValue() {
        return Double.parseDouble(this.f16523h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f16523h;
        String str2 = ((g) obj).f16523h;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return Float.parseFloat(this.f16523h);
    }

    public int hashCode() {
        return this.f16523h.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f16523h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f16523h).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f16523h     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f16523h     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f16523h
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.g.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f16523h);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f16523h).longValue();
        }
    }

    public String toString() {
        return this.f16523h;
    }
}
