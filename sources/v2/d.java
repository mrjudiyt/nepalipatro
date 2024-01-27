package v2;

import a3.i;
import androidx.collection.a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ModelToResourceClassCache */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<i> f12316a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final a<i, List<Class<?>>> f12317b = new a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        i andSet = this.f12316a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f12317b) {
            list = this.f12317b.get(andSet);
        }
        this.f12316a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f12317b) {
            this.f12317b.put(new i(cls, cls2, cls3), list);
        }
    }
}
