package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;

/* compiled from: HandlerCompat */
public final class j {

    /* compiled from: HandlerCompat */
    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler a(Looper looper) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return a.a(looper);
        }
        if (i10 >= 17) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
        return new Handler(looper);
    }
}
