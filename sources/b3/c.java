package b3;

/* compiled from: StateVerifier */
public abstract class c {

    /* compiled from: StateVerifier */
    private static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f4995a;

        b() {
            super();
        }

        public void b(boolean z10) {
            this.f4995a = z10;
        }

        public void c() {
            if (this.f4995a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }
}
