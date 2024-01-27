package ha;

import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.login.LoginResult;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Results */
public class e {

    /* compiled from: Results */
    class a extends HashMap<String, Object> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ AccessToken f14872h;

        a(AccessToken accessToken) {
            this.f14872h = accessToken;
            put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, g.Success.name());
            put("accessToken", e.a(accessToken));
        }
    }

    /* compiled from: Results */
    class b extends HashMap<String, Object> {
        b() {
            put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, g.Cancel.name());
        }
    }

    /* compiled from: Results */
    class c extends HashMap<String, Object> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ FacebookException f14873h;

        c(FacebookException facebookException) {
            this.f14873h = facebookException;
            put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, g.Error.name());
            put("error", e.b(facebookException));
        }
    }

    /* compiled from: Results */
    class d extends HashMap<String, Object> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ AccessToken f14874h;

        d(AccessToken accessToken) {
            this.f14874h = accessToken;
            put("token", accessToken.getToken());
            put(Constants.USER_ID, accessToken.getUserId());
            put("expires", Long.valueOf(accessToken.getExpires().getTime()));
            put("permissions", new ArrayList(accessToken.getPermissions()));
            put("declinedPermissions", new ArrayList(accessToken.getDeclinedPermissions()));
        }
    }

    /* renamed from: ha.e$e  reason: collision with other inner class name */
    /* compiled from: Results */
    class C0252e extends HashMap<String, Object> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Profile f14875h;

        C0252e(Profile profile) {
            this.f14875h = profile;
            put(Constants.USER_ID, profile.getId());
            put("name", profile.getName());
            put("firstName", profile.getFirstName());
            put("middleName", profile.getMiddleName());
            put("lastName", profile.getLastName());
        }
    }

    /* compiled from: Results */
    class f extends HashMap<String, Object> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ FacebookException f14876h;

        f(FacebookException facebookException) {
            this.f14876h = facebookException;
            put("developerMessage", facebookException.getMessage());
        }
    }

    /* compiled from: Results */
    private enum g {
        Success,
        Cancel,
        Error
    }

    static HashMap<String, Object> a(AccessToken accessToken) {
        if (accessToken == null) {
            return null;
        }
        return new d(accessToken);
    }

    static HashMap<String, Object> b(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        return new f(facebookException);
    }

    public static HashMap<String, Object> c() {
        return new b();
    }

    public static HashMap<String, Object> d(FacebookException facebookException) {
        return new c(facebookException);
    }

    public static HashMap<String, Object> e(AccessToken accessToken) {
        return new a(accessToken);
    }

    public static HashMap<String, Object> f(LoginResult loginResult) {
        return e(loginResult.getAccessToken());
    }

    static HashMap<String, Object> g(Profile profile) {
        if (profile == null) {
            return null;
        }
        return new C0252e(profile);
    }
}
