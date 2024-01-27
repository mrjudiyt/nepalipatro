package i9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.g;

/* compiled from: CompletionState.kt */
public class z {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15005b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f15006a;

    public z(Throwable th, boolean z10) {
        this.f15006a = th;
        this._handled = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f15005b.get(this) != 0;
    }

    public final boolean b() {
        return f15005b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return q0.a(this) + '[' + this.f15006a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Throwable th, boolean z10, int i10, g gVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
