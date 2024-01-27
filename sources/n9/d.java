package n9;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: Concurrent.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f15795a;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f15795a = method;
    }

    public static final boolean a(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f15795a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
