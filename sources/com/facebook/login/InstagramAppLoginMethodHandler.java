package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookSdk;
import com.facebook.internal.NativeProtocol;
import com.facebook.login.LoginClient;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: InstagramAppLoginMethodHandler.kt */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new InstagramAppLoginMethodHandler$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final String nameForLogging = "instagram_login";
    private final AccessTokenSource tokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;

    /* compiled from: InstagramAppLoginMethodHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        m.f(loginClient, "loginClient");
    }

    public int describeContents() {
        return 0;
    }

    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    public int tryAuthorize(LoginClient.Request request) {
        m.f(request, "request");
        LoginClient.Companion companion = LoginClient.Companion;
        String e2e = companion.getE2E();
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        Context activity = getLoginClient().getActivity();
        if (activity == null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            activity = FacebookSdk.getApplicationContext();
        }
        String applicationId = request.getApplicationId();
        Set<String> permissions = request.getPermissions();
        boolean isRerequest = request.isRerequest();
        boolean hasPublishPermission = request.hasPublishPermission();
        DefaultAudience defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        Intent createInstagramIntent = NativeProtocol.createInstagramIntent(activity, applicationId, permissions, e2e, isRerequest, hasPublishPermission, defaultAudience, getClientState(request.getAuthId()), request.getAuthType(), request.getMessengerPageId(), request.getResetMessengerState(), request.isFamilyLogin(), request.shouldSkipAccountDeduplication());
        addLoggingExtra("e2e", e2e);
        return tryIntent(createInstagramIntent, companion.getLoginRequestCode()) ? 1 : 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        super.writeToParcel(parcel, i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        m.f(parcel, "source");
    }
}
