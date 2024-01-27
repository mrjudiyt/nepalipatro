package r6;

import java.math.BigInteger;
import t6.a;
import t6.g;

/* compiled from: JsonPrimitive */
public final class o extends l {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f16371b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a  reason: collision with root package name */
    private Object f16372a;

    public o(Boolean bool) {
        x(bool);
    }

    private static boolean s(o oVar) {
        Object obj = oVar.f16372a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    private static boolean u(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : f16371b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f16372a == null) {
            if (oVar.f16372a == null) {
                return true;
            }
            return false;
        } else if (!s(this) || !s(oVar)) {
            Object obj2 = this.f16372a;
            if (!(obj2 instanceof Number) || !(oVar.f16372a instanceof Number)) {
                return obj2.equals(oVar.f16372a);
            }
            double doubleValue = o().doubleValue();
            double doubleValue2 = oVar.o().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (o().longValue() == oVar.o().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f16372a == null) {
            return 31;
        }
        if (s(this)) {
            doubleToLongBits = o().longValue();
        } else {
            Object obj = this.f16372a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(o().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean i() {
        if (r()) {
            return k().booleanValue();
        }
        return Boolean.parseBoolean(p());
    }

    /* access modifiers changed from: package-private */
    public Boolean k() {
        return (Boolean) this.f16372a;
    }

    public double l() {
        return t() ? o().doubleValue() : Double.parseDouble(p());
    }

    public int m() {
        return t() ? o().intValue() : Integer.parseInt(p());
    }

    public long n() {
        return t() ? o().longValue() : Long.parseLong(p());
    }

    public Number o() {
        Object obj = this.f16372a;
        return obj instanceof String ? new g((String) obj) : (Number) obj;
    }

    public String p() {
        if (t()) {
            return o().toString();
        }
        if (r()) {
            return k().toString();
        }
        return (String) this.f16372a;
    }

    public boolean r() {
        return this.f16372a instanceof Boolean;
    }

    public boolean t() {
        return this.f16372a instanceof Number;
    }

    public boolean v() {
        return this.f16372a instanceof String;
    }

    /* access modifiers changed from: package-private */
    public void x(Object obj) {
        if (obj instanceof Character) {
            this.f16372a = String.valueOf(((Character) obj).charValue());
            return;
        }
        a.a((obj instanceof Number) || u(obj));
        this.f16372a = obj;
    }

    public o(Number number) {
        x(number);
    }

    public o(String str) {
        x(str);
    }
}
