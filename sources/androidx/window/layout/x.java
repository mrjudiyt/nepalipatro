package androidx.window.layout;

import android.app.Activity;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import y8.l;

/* compiled from: WindowMetricsCalculator.kt */
public interface x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4670a = a.f4671a;

    /* compiled from: WindowMetricsCalculator.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f4671a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static l<? super x, ? extends x> f4672b = C0081a.f4673h;

        /* renamed from: androidx.window.layout.x$a$a  reason: collision with other inner class name */
        /* compiled from: WindowMetricsCalculator.kt */
        static final class C0081a extends n implements l<x, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0081a f4673h = new C0081a();

            C0081a() {
                super(1);
            }

            /* renamed from: a */
            public final x invoke(x xVar) {
                m.f(xVar, "it");
                return xVar;
            }
        }

        private a() {
        }

        public final x a() {
            return (x) f4672b.invoke(y.f4674b);
        }
    }

    v a(Activity activity);
}
