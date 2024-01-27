package ha;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.login.LoginManager;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: MethodCallHandler */
public class d implements MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    private final c f14866h;

    /* renamed from: i  reason: collision with root package name */
    private Activity f14867i;

    /* compiled from: MethodCallHandler */
    class a implements LoginStatusCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f14868a;

        a(MethodChannel.Result result) {
            this.f14868a = result;
        }

        public void onCompleted(AccessToken accessToken) {
            this.f14868a.success(e.e(accessToken));
        }

        public void onError(Exception exc) {
            this.f14868a.error("FAILED", exc.getMessage(), (Object) null);
        }

        public void onFailure() {
            this.f14868a.success(e.c());
        }
    }

    /* compiled from: MethodCallHandler */
    class b implements GraphRequest.GraphJSONObjectCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f14870a;

        b(MethodChannel.Result result) {
            this.f14870a = result;
        }

        public void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
            FacebookRequestError error = graphResponse.getError();
            if (error == null) {
                try {
                    this.f14870a.success(jSONObject.getString("email"));
                } catch (Exception e10) {
                    this.f14870a.error("UNKNOWN", e10.getMessage(), (Object) null);
                }
            } else {
                this.f14870a.error("FAILED", error.getErrorMessage(), (Object) null);
            }
        }
    }

    public d(c cVar) {
        this.f14866h = cVar;
    }

    private void a(MethodChannel.Result result) {
        LoginManager.getInstance().retrieveLoginStatus(this.f14867i.getApplicationContext(), new a(result));
    }

    private void b(MethodChannel.Result result) {
        result.success(e.a(AccessToken.getCurrentAccessToken()));
    }

    private void c(MethodChannel.Result result, int i10, int i11) {
        Uri profilePictureUri = Profile.getCurrentProfile().getProfilePictureUri(i10, i11);
        if (profilePictureUri != null) {
            result.success(profilePictureUri.toString());
        } else {
            result.success((Object) null);
        }
    }

    private void d(MethodChannel.Result result) {
        result.success(FacebookSdk.getSdkVersion());
    }

    private void e(MethodChannel.Result result) {
        GraphRequest newMeRequest = GraphRequest.newMeRequest(AccessToken.getCurrentAccessToken(), new b(result));
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, "email");
        newMeRequest.setParameters(bundle);
        newMeRequest.executeAsync();
    }

    private void f(MethodChannel.Result result) {
        result.success(e.g(Profile.getCurrentProfile()));
    }

    private void g(List<String> list, MethodChannel.Result result) {
        this.f14866h.b(result);
        LoginManager.getInstance().logIn(this.f14867i, (Collection<String>) list);
    }

    private void h(MethodChannel.Result result) {
        LoginManager.getInstance().logOut();
        result.success((Object) null);
    }

    public void i(Activity activity) {
        this.f14867i = activity;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (this.f14867i != null) {
            String str = methodCall.method;
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1256036185:
                    if (str.equals("getProfileImageUrl")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1251560920:
                    if (str.equals("getUserProfile")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1097360022:
                    if (str.equals("logOut")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 103148425:
                    if (str.equals("logIn")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 305694683:
                    if (str.equals("getUserEmail")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1120441817:
                    if (str.equals("expressLogin")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 2034588468:
                    if (str.equals("getSdkVersion")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b(result);
                    return;
                case 1:
                    Integer num = (Integer) methodCall.argument(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                    Integer num2 = (Integer) methodCall.argument(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                    if (num == null || num2 == null) {
                        result.error("INVALID_ARGS", "Some of args is invalid", (Object) null);
                        return;
                    } else {
                        c(result, num.intValue(), num2.intValue());
                        return;
                    }
                case 2:
                    f(result);
                    return;
                case 3:
                    h(result);
                    return;
                case 4:
                    g((List) methodCall.argument("permissions"), result);
                    return;
                case 5:
                    e(result);
                    return;
                case 6:
                    a(result);
                    return;
                case 7:
                    d(result);
                    return;
                default:
                    result.notImplemented();
                    return;
            }
        }
    }
}
