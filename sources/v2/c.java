package v2;

import androidx.collection.a;
import androidx.core.util.e;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import s2.g;

/* compiled from: LoadPathCache */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final q<?, ?, ?> f12313c = new q(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), (e<List<Throwable>>) null)), (e<List<Throwable>>) null);

    /* renamed from: a  reason: collision with root package name */
    private final a<a3.i, q<?, ?, ?>> f12314a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<a3.i> f12315b = new AtomicReference<>();

    private a3.i b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a3.i andSet = this.f12315b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new a3.i();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        a3.i b10 = b(cls, cls2, cls3);
        synchronized (this.f12314a) {
            qVar = this.f12314a.get(b10);
        }
        this.f12315b.set(b10);
        return qVar;
    }

    public boolean c(q<?, ?, ?> qVar) {
        return f12313c.equals(qVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, q<?, ?, ?> qVar) {
        synchronized (this.f12314a) {
            a<a3.i, q<?, ?, ?>> aVar = this.f12314a;
            a3.i iVar = new a3.i(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f12313c;
            }
            aVar.put(iVar, qVar);
        }
    }
}
