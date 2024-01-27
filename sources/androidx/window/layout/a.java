package androidx.window.layout;

import android.app.Activity;
import kotlin.jvm.internal.m;

/* compiled from: ActivityCompatHelper.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4598a = new a();

    private a() {
    }

    public final boolean a(Activity activity) {
        m.f(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
