package w7;

/* compiled from: NamedRunnable */
public abstract class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    protected final String f16992h;

    public d(String str, Object... objArr) {
        this.f16992h = String.format(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f16992h);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
