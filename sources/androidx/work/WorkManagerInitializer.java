package androidx.work;

import android.content.Context;
import androidx.work.b;
import g1.a;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements a<w> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4688a = m.f("WrkMgrInitializer");

    public List<Class<? extends a<?>>> a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public w b(Context context) {
        m.c().a(f4688a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        w.g(context, new b.C0083b().a());
        return w.f(context);
    }
}
