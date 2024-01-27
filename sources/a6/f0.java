package a6;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: SystemClock */
public class f0 implements b {
    protected f0() {
    }

    public long a() {
        return SystemClock.uptimeMillis();
    }

    public k b(Looper looper, Handler.Callback callback) {
        return new g0(new Handler(looper, callback));
    }

    public void c() {
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
