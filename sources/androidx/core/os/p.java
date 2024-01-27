package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

@Deprecated
/* compiled from: TraceCompat */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static long f2401a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2402b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2403c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2404d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2405e;

    /* compiled from: TraceCompat */
    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 18 && i10 < 29) {
            try {
                f2401a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f2402b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f2403c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f2404d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f2405e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            a.a(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            a.b();
        }
    }
}
