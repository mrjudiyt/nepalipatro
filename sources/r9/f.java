package r9;

import java.util.concurrent.atomic.AtomicReferenceArray;
import n9.g0;
import r8.g;

/* compiled from: Semaphore.kt */
final class f extends g0<f> {

    /* renamed from: l  reason: collision with root package name */
    private final AtomicReferenceArray f16441l = new AtomicReferenceArray(e.f16440f);

    public f(long j10, f fVar, int i10) {
        super(j10, fVar, i10);
    }

    public int n() {
        return e.f16440f;
    }

    public void o(int i10, Throwable th, g gVar) {
        r().set(i10, e.f16439e);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f16441l;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f15803j + ", hashCode=" + hashCode() + ']';
    }
}
