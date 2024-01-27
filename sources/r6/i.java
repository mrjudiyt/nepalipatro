package r6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray */
public final class i extends l implements Iterable<l> {

    /* renamed from: h  reason: collision with root package name */
    private final List<l> f16368h = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f16368h.equals(this.f16368h));
    }

    public int hashCode() {
        return this.f16368h.hashCode();
    }

    public void i(l lVar) {
        if (lVar == null) {
            lVar = m.f16369a;
        }
        this.f16368h.add(lVar);
    }

    public Iterator<l> iterator() {
        return this.f16368h.iterator();
    }
}
