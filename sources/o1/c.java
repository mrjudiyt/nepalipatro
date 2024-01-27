package o1;

import androidx.lifecycle.s;
import androidx.work.p;

/* compiled from: OperationImpl */
public class c implements p {

    /* renamed from: c  reason: collision with root package name */
    private final s<p.b> f10289c = new s<>();

    /* renamed from: d  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<p.b.c> f10290d = androidx.work.impl.utils.futures.c.s();

    public c() {
        a(p.f4924b);
    }

    public void a(p.b bVar) {
        this.f10289c.postValue(bVar);
        if (bVar instanceof p.b.c) {
            this.f10290d.o((p.b.c) bVar);
        } else if (bVar instanceof p.b.a) {
            this.f10290d.p(((p.b.a) bVar).a());
        }
    }
}
