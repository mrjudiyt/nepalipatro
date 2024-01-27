package g4;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Executor {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Handler f14706h;

    public /* synthetic */ s(Handler handler) {
        this.f14706h = handler;
    }

    public final void execute(Runnable runnable) {
        this.f14706h.post(runnable);
    }
}
