package w7;

import java.util.LinkedHashSet;
import java.util.Set;
import v7.z;

/* compiled from: RouteDatabase */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<z> f17013a = new LinkedHashSet();

    public synchronized void a(z zVar) {
        this.f17013a.remove(zVar);
    }

    public synchronized void b(z zVar) {
        this.f17013a.add(zVar);
    }

    public synchronized boolean c(z zVar) {
        return this.f17013a.contains(zVar);
    }
}
