package androidx.work;

import android.content.Context;

/* compiled from: WorkerFactory */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4951a = m.f("WorkerFactory");

    /* compiled from: WorkerFactory */
    class a extends y {
        a() {
        }

        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static y c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a10 = a(context, str, workerParameters);
        if (a10 == null) {
            Class<? extends U> cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                m c10 = m.c();
                String str2 = f4951a;
                c10.b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a10 = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    m c11 = m.c();
                    String str3 = f4951a;
                    c11.b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a10 == null || !a10.isUsed()) {
            return a10;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
