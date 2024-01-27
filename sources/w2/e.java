package w2;

/* compiled from: RequestCoordinator */
public interface e {

    /* compiled from: RequestCoordinator */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: h  reason: collision with root package name */
        private final boolean f12695h;

        private a(boolean z10) {
            this.f12695h = z10;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f12695h;
        }
    }

    void a(d dVar);

    e b();

    boolean c();

    boolean e(d dVar);

    boolean g(d dVar);

    boolean i(d dVar);

    void k(d dVar);
}
