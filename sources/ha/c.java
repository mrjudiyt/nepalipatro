package ha;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginResult;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* compiled from: LoginCallback */
public class c implements FacebookCallback<LoginResult> {

    /* renamed from: a  reason: collision with root package name */
    private MethodChannel.Result f14863a;

    /* compiled from: LoginCallback */
    class a extends ProfileTracker {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginResult f14864a;

        a(LoginResult loginResult) {
            this.f14864a = loginResult;
        }

        /* access modifiers changed from: protected */
        public void onCurrentProfileChanged(Profile profile, Profile profile2) {
            stopTracking();
            Profile.setCurrentProfile(profile2);
            c.this.e(this.f14864a);
        }
    }

    private void c(String str, String str2) {
        MethodChannel.Result result = this.f14863a;
        if (result != null) {
            result.error(str, str2, (Object) null);
            this.f14863a = null;
        }
    }

    private void d(HashMap<String, Object> hashMap) {
        MethodChannel.Result result = this.f14863a;
        if (result != null) {
            result.success(hashMap);
            this.f14863a = null;
        }
    }

    /* access modifiers changed from: private */
    public void e(LoginResult loginResult) {
        d(e.f(loginResult));
    }

    public void b(MethodChannel.Result result) {
        if (this.f14863a != null) {
            c("INTERRUPTED", "Waiting login result was been interrupted!");
        }
        this.f14863a = result;
    }

    /* renamed from: f */
    public void onSuccess(LoginResult loginResult) {
        if (Profile.getCurrentProfile() == null) {
            new a(loginResult);
        } else {
            e(loginResult);
        }
    }

    public void onCancel() {
        d(e.c());
    }

    public void onError(FacebookException facebookException) {
        d(e.d(facebookException));
    }
}
