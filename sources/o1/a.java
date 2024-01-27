package o1;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.j;
import androidx.work.t;

/* compiled from: DefaultRunnableScheduler */
public class a implements t {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f10288a = j.a(Looper.getMainLooper());

    public void a(long j10, Runnable runnable) {
        this.f10288a.postDelayed(runnable, j10);
    }

    public void b(Runnable runnable) {
        this.f10288a.removeCallbacks(runnable);
    }
}
