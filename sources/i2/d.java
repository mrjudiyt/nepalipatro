package i2;

import a3.k;
import i2.m;
import java.util.Queue;

/* compiled from: BaseKeyPool */
abstract class d<T extends m> {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<T> f9236a = k.f(20);

    d() {
    }

    /* access modifiers changed from: package-private */
    public abstract T a();

    /* access modifiers changed from: package-private */
    public T b() {
        T t10 = (m) this.f9236a.poll();
        return t10 == null ? a() : t10;
    }

    public void c(T t10) {
        if (this.f9236a.size() < 20) {
            this.f9236a.offer(t10);
        }
    }
}
