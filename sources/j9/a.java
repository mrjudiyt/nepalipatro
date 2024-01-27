package j9;

import android.os.Looper;
import i9.e2;
import java.util.List;
import kotlin.jvm.internal.g;
import n9.x;

/* compiled from: HandlerDispatcher.kt */
public final class a implements x {
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public e2 b(List<? extends x> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), (String) null, 2, (g) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int c() {
        return 1073741823;
    }
}
