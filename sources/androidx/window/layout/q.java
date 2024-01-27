package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l9.d;

/* compiled from: WindowInfoTracker.kt */
public interface q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4654a = a.f4655a;

    /* compiled from: WindowInfoTracker.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f4655a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final String f4656b = z.b(q.class).a();

        /* renamed from: c  reason: collision with root package name */
        private static r f4657c = f.f4602a;

        private a() {
        }

        public final q a(Context context) {
            m.f(context, "context");
            return f4657c.a(new s(y.f4674b, b(context)));
        }

        public final p b(Context context) {
            m.f(context, "context");
            h hVar = null;
            try {
                WindowLayoutComponent m10 = l.f4628a.m();
                if (m10 != null) {
                    hVar = new h(m10);
                }
            } catch (Throwable unused) {
            }
            return hVar == null ? n.f4642c.a(context) : hVar;
        }
    }

    d<u> a(Activity activity);
}
