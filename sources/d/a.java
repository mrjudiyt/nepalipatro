package d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ContextAwareHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f7874a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f7875b;

    public void a(b bVar) {
        if (this.f7875b != null) {
            bVar.a(this.f7875b);
        }
        this.f7874a.add(bVar);
    }

    public void b() {
        this.f7875b = null;
    }

    public void c(Context context) {
        this.f7875b = context;
        for (b a10 : this.f7874a) {
            a10.a(context);
        }
    }

    public Context d() {
        return this.f7875b;
    }

    public void e(b bVar) {
        this.f7874a.remove(bVar);
    }
}
