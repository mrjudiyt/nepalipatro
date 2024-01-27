package f6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public abstract class t implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    private final TaskCompletionSource f14585h;

    t() {
        this.f14585h = null;
    }

    public t(TaskCompletionSource taskCompletionSource) {
        this.f14585h = taskCompletionSource;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public final TaskCompletionSource b() {
        return this.f14585h;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f14585h;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }
}
