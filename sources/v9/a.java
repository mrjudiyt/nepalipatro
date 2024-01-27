package v9;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.g;

/* compiled from: GTracker.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f16969a;

    /* renamed from: b  reason: collision with root package name */
    private FirebaseAnalytics f16970b;

    public a(Context context) {
        this.f16969a = context;
        m.c(context);
        this.f16970b = FirebaseAnalytics.getInstance(context);
    }

    public final void a(String str, String str2, String str3, String str4) {
        m.f(str, Constants.EVENT_NAME);
        m.f(str2, "category");
        m.f(str3, NativeProtocol.WEB_DIALOG_ACTION);
        m.f(str4, Constants.ScionAnalytics.PARAM_LABEL);
        g.a aVar = g.f16048a;
        aVar.b("Analytics Send LangObj - Category: " + str2 + ", Action: " + str3 + ", Label: " + str4);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("category", str2);
            bundle.putString(NativeProtocol.WEB_DIALOG_ACTION, str3);
            bundle.putString(Constants.ScionAnalytics.PARAM_LABEL, str4);
            FirebaseAnalytics firebaseAnalytics = this.f16970b;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.logEvent(str, bundle);
            }
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    public final void b(String str, String str2, String str3) {
        m.f(str, "category");
        m.f(str2, NativeProtocol.WEB_DIALOG_ACTION);
        m.f(str3, Constants.ScionAnalytics.PARAM_LABEL);
        g.a aVar = g.f16048a;
        aVar.b("Analytics Send LangObj - Category: " + str + ", Action: " + str2 + ", Label: " + str3);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("category", str);
            bundle.putString(NativeProtocol.WEB_DIALOG_ACTION, str2);
            bundle.putString(Constants.ScionAnalytics.PARAM_LABEL, str3);
            FirebaseAnalytics firebaseAnalytics = this.f16970b;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.logEvent("APP_EVENT", bundle);
            }
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    public final void c(String str, String str2) {
        m.f(str, "category");
        m.f(str2, Constants.ScionAnalytics.PARAM_LABEL);
        b(str, ca.a.f13428a.d(), str2);
    }

    public final void d() {
        ca.a aVar = ca.a.f13428a;
        b(aVar.i(), aVar.b(), "");
    }

    public final void e(String str) {
        m.f(str, "widget");
        ca.a aVar = ca.a.f13428a;
        b(aVar.p(), aVar.b(), str);
    }

    public final void f(String str) {
        m.f(str, "widget");
        ca.a aVar = ca.a.f13428a;
        b(aVar.p(), aVar.a(), str);
    }
}
