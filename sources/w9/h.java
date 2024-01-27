package w9;

import android.content.Context;
import android.preference.PreferenceManager;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;

/* compiled from: ModulesUtils.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f17060a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final String f17061b = "np.com.nepalipatro.modules.change";

    /* renamed from: c  reason: collision with root package name */
    private static final String f17062c = "module_switch_ls";

    /* renamed from: d  reason: collision with root package name */
    private static final String f17063d = "module_switch_news";

    private h() {
    }

    public final String a() {
        return f17062c;
    }

    public final String b() {
        return f17063d;
    }

    public final boolean c(Context context, String str) {
        m.f(context, "context");
        m.f(str, Constants.KEY);
        try {
            return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, true);
        } catch (Exception unused) {
            return false;
        }
    }
}
