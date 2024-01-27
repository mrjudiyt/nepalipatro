package x7;

import java.util.concurrent.CountDownLatch;

/* compiled from: Ping */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f17267a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    private long f17268b = -1;

    /* renamed from: c  reason: collision with root package name */
    private long f17269c = -1;

    l() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f17269c == -1) {
            long j10 = this.f17268b;
            if (j10 != -1) {
                this.f17269c = j10 - 1;
                this.f17267a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f17269c != -1 || this.f17268b == -1) {
            throw new IllegalStateException();
        }
        this.f17269c = System.nanoTime();
        this.f17267a.countDown();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f17268b == -1) {
            this.f17268b = System.nanoTime();
            return;
        }
        throw new IllegalStateException();
    }
}
