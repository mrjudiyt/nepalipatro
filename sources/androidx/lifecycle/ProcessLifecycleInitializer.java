package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.w;
import g1.a;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: ProcessLifecycleInitializer.kt */
public final class ProcessLifecycleInitializer implements a<m> {
    public List<Class<? extends a<?>>> a() {
        return p.e();
    }

    /* renamed from: c */
    public m b(Context context) {
        m.f(context, "context");
        androidx.startup.a d10 = androidx.startup.a.d(context);
        m.e(d10, "getInstance(context)");
        if (d10.e(ProcessLifecycleInitializer.class)) {
            j.a(context);
            w.b bVar = w.f3524p;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
