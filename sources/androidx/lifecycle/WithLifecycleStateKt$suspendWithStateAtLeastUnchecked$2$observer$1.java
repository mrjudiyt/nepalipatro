package androidx.lifecycle;

import androidx.lifecycle.h;
import i9.l;
import kotlin.jvm.internal.m;
import o8.l;
import y8.a;

/* compiled from: WithLifecycleState.kt */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements k {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ h.b f3444h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ h f3445i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ l<Object> f3446j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ a<Object> f3447k;

    public void onStateChanged(m mVar, h.a aVar) {
        Object obj;
        m.f(mVar, "source");
        m.f(aVar, "event");
        if (aVar == h.a.Companion.c(this.f3444h)) {
            this.f3445i.c(this);
            l<Object> lVar = this.f3446j;
            a<Object> aVar2 = this.f3447k;
            try {
                l.a aVar3 = o8.l.f16183h;
                obj = o8.l.a(aVar2.invoke());
            } catch (Throwable th) {
                l.a aVar4 = o8.l.f16183h;
                obj = o8.l.a(o8.m.a(th));
            }
            lVar.resumeWith(obj);
        } else if (aVar == h.a.ON_DESTROY) {
            this.f3445i.c(this);
            i9.l<Object> lVar2 = this.f3446j;
            l.a aVar5 = o8.l.f16183h;
            lVar2.resumeWith(o8.l.a(o8.m.a(new LifecycleDestroyedException())));
        }
    }
}
