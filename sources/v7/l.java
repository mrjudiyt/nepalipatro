package v7;

import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: Dispatcher */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private int f16857a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f16858b = 5;

    /* renamed from: c  reason: collision with root package name */
    private final Deque<Object> f16859c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private final Deque<Object> f16860d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    private final Deque<d> f16861e = new ArrayDeque();

    /* access modifiers changed from: package-private */
    public synchronized void a(d dVar) {
        this.f16861e.add(dVar);
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(d dVar) {
        if (!this.f16861e.remove(dVar)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }
}
