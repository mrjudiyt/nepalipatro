package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import androidx.loader.content.b;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
final class zbw implements a.C0056a {
    final /* synthetic */ SignInHubActivity zba;

    /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbv) {
        this.zba = signInHubActivity;
    }

    public final b onCreateLoader(int i10, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(b bVar, Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
        this.zba.finish();
    }

    public final void onLoaderReset(b bVar) {
    }
}
