package t2;

import a3.k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle */
class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Set<i> f11597a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private boolean f11598b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11599c;

    a() {
    }

    public void a(i iVar) {
        this.f11597a.add(iVar);
        if (this.f11599c) {
            iVar.onDestroy();
        } else if (this.f11598b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    public void b(i iVar) {
        this.f11597a.remove(iVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f11599c = true;
        for (T onDestroy : k.j(this.f11597a)) {
            onDestroy.onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f11598b = true;
        for (T onStart : k.j(this.f11597a)) {
            onStart.onStart();
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f11598b = false;
        for (T onStop : k.j(this.f11597a)) {
            onStop.onStop();
        }
    }
}
