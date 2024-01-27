package a6;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Clock */
public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f146a = new f0();

    long a();

    k b(Looper looper, Handler.Callback callback);

    void c();

    long elapsedRealtime();
}
