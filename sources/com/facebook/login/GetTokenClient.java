package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.m;

/* compiled from: GetTokenClient.kt */
public final class GetTokenClient extends PlatformServiceClient {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTokenClient(Context context, LoginClient.Request request) {
        super(context, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY, NativeProtocol.PROTOCOL_VERSION_20121101, request.getApplicationId(), request.getNonce());
        m.f(context, "context");
        m.f(request, "request");
    }

    /* access modifiers changed from: protected */
    public void populateRequestBundle(Bundle bundle) {
        m.f(bundle, "data");
    }
}
