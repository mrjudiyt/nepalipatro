package a6;

import a6.o;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArraySet f220h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f221i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ o.a f222j;

    public /* synthetic */ n(CopyOnWriteArraySet copyOnWriteArraySet, int i10, o.a aVar) {
        this.f220h = copyOnWriteArraySet;
        this.f221i = i10;
        this.f222j = aVar;
    }

    public final void run() {
        o.g(this.f220h, this.f221i, this.f222j);
    }
}
