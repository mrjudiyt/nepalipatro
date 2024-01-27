package t2;

import a3.k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import x2.d;

/* compiled from: TargetTracker */
public final class p implements i {

    /* renamed from: h  reason: collision with root package name */
    private final Set<d<?>> f11632h = Collections.newSetFromMap(new WeakHashMap());

    public void d() {
        this.f11632h.clear();
    }

    public List<d<?>> e() {
        return k.j(this.f11632h);
    }

    public void k(d<?> dVar) {
        this.f11632h.add(dVar);
    }

    public void l(d<?> dVar) {
        this.f11632h.remove(dVar);
    }

    public void onDestroy() {
        for (T onDestroy : k.j(this.f11632h)) {
            onDestroy.onDestroy();
        }
    }

    public void onStart() {
        for (T onStart : k.j(this.f11632h)) {
            onStart.onStart();
        }
    }

    public void onStop() {
        for (T onStop : k.j(this.f11632h)) {
            onStop.onStop();
        }
    }
}
