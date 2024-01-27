package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;

/* compiled from: LifecycleDispatcher.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f3504a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f3505b = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    public static final class a extends d {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            m.f(activity, "activity");
            x.f3536i.c(activity);
        }
    }

    private j() {
    }

    public static final void a(Context context) {
        m.f(context, "context");
        if (!f3505b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            m.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
        }
    }
}
