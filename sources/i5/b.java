package i5;

import java.util.NoSuchElementException;

/* compiled from: BaseMediaChunkIterator */
public abstract class b implements o {

    /* renamed from: b  reason: collision with root package name */
    private final long f9284b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9285c;

    /* renamed from: d  reason: collision with root package name */
    private long f9286d;

    public b(long j10, long j11) {
        this.f9284b = j10;
        this.f9285c = j11;
        f();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        long j10 = this.f9286d;
        if (j10 < this.f9284b || j10 > this.f9285c) {
            throw new NoSuchElementException();
        }
    }

    /* access modifiers changed from: protected */
    public final long d() {
        return this.f9286d;
    }

    public boolean e() {
        return this.f9286d > this.f9285c;
    }

    public void f() {
        this.f9286d = this.f9284b - 1;
    }

    public boolean next() {
        this.f9286d++;
        return !e();
    }
}
