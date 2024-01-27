package r6;

import java.util.Map;
import java.util.Set;
import t6.h;

/* compiled from: JsonObject */
public final class n extends l {

    /* renamed from: a  reason: collision with root package name */
    private final h<String, l> f16370a = new h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).f16370a.equals(this.f16370a));
    }

    public int hashCode() {
        return this.f16370a.hashCode();
    }

    public void i(String str, l lVar) {
        if (lVar == null) {
            lVar = m.f16369a;
        }
        this.f16370a.put(str, lVar);
    }

    public Set<Map.Entry<String, l>> k() {
        return this.f16370a.entrySet();
    }

    public l l(String str) {
        return this.f16370a.get(str);
    }
}
