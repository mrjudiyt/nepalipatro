package a6;

/* compiled from: ConditionVariable */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final b f172a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f173b;

    public e() {
        this(b.f146a);
    }

    public synchronized void a() {
        while (!this.f173b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f173b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f173b;
        this.f173b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f173b;
    }

    public synchronized boolean e() {
        if (this.f173b) {
            return false;
        }
        this.f173b = true;
        notifyAll();
        return true;
    }

    public e(b bVar) {
        this.f172a = bVar;
    }
}
