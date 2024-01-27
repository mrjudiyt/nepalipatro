package w9;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.m;

/* compiled from: IMEUtils.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17050a = new d();

    private d() {
    }

    public final boolean a(Context context) {
        m.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
        m.e(string, "id");
        return q.y(string, "np.com.nepalipatro.keyboard", false, 2, (Object) null);
    }
}
