package j9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.g;
import o8.l;
import o8.m;

/* compiled from: HandlerDispatcher.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f15428a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        d dVar = null;
        try {
            l.a aVar = l.f16183h;
            obj = l.a(new c(a(Looper.getMainLooper(), true), (String) null, 2, (g) null));
        } catch (Throwable th) {
            l.a aVar2 = l.f16183h;
            obj = l.a(m.a(th));
        }
        if (!l.c(obj)) {
            dVar = obj;
        }
        f15428a = dVar;
    }

    public static final Handler a(Looper looper, boolean z10) {
        int i10;
        if (!z10 || (i10 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i10 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            kotlin.jvm.internal.m.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
