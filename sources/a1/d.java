package a1;

import androidx.room.h;
import e1.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f12a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final h f13b;

    /* renamed from: c  reason: collision with root package name */
    private volatile f f14c;

    public d(h hVar) {
        this.f13b = hVar;
    }

    private f c() {
        return this.f13b.d(d());
    }

    private f e(boolean z10) {
        if (!z10) {
            return c();
        }
        if (this.f14c == null) {
            this.f14c = c();
        }
        return this.f14c;
    }

    public f a() {
        b();
        return e(this.f12a.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.f13b.a();
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    public void f(f fVar) {
        if (fVar == this.f14c) {
            this.f12a.set(false);
        }
    }
}
