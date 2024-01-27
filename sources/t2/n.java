package t2;

import a3.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import w2.d;

/* compiled from: RequestTracker */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Set<d> f11622a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f11623b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f11624c;

    public boolean a(d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f11622a.remove(dVar);
        if (!this.f11623b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public void b() {
        for (T a10 : k.j(this.f11622a)) {
            a(a10);
        }
        this.f11623b.clear();
    }

    public void c() {
        this.f11624c = true;
        for (T t10 : k.j(this.f11622a)) {
            if (t10.isRunning() || t10.j()) {
                t10.clear();
                this.f11623b.add(t10);
            }
        }
    }

    public void d() {
        this.f11624c = true;
        for (T t10 : k.j(this.f11622a)) {
            if (t10.isRunning()) {
                t10.pause();
                this.f11623b.add(t10);
            }
        }
    }

    public void e() {
        for (T t10 : k.j(this.f11622a)) {
            if (!t10.j() && !t10.f()) {
                t10.clear();
                if (!this.f11624c) {
                    t10.h();
                } else {
                    this.f11623b.add(t10);
                }
            }
        }
    }

    public void f() {
        this.f11624c = false;
        for (T t10 : k.j(this.f11622a)) {
            if (!t10.j() && !t10.isRunning()) {
                t10.h();
            }
        }
        this.f11623b.clear();
    }

    public void g(d dVar) {
        this.f11622a.add(dVar);
        if (!this.f11624c) {
            dVar.h();
            return;
        }
        dVar.clear();
        this.f11623b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f11622a.size() + ", isPaused=" + this.f11624c + "}";
    }
}
