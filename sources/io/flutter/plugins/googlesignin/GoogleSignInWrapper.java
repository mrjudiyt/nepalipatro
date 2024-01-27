package io.flutter.plugins.googlesignin;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;

public class GoogleSignInWrapper {
    /* access modifiers changed from: package-private */
    public GoogleSignInClient getClient(Context context, GoogleSignInOptions googleSignInOptions) {
        return GoogleSignIn.getClient(context, googleSignInOptions);
    }

    /* access modifiers changed from: package-private */
    public GoogleSignInAccount getLastSignedInAccount(Context context) {
        return GoogleSignIn.getLastSignedInAccount(context);
    }

    /* access modifiers changed from: package-private */
    public boolean hasPermissions(GoogleSignInAccount googleSignInAccount, Scope scope) {
        return GoogleSignIn.hasPermissions(googleSignInAccount, scope);
    }

    /* access modifiers changed from: package-private */
    public void requestPermissions(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope[] scopeArr) {
        GoogleSignIn.requestPermissions(activity, i10, googleSignInAccount, scopeArr);
    }
}
