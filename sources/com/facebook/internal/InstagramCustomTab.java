package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.login.CustomTabLoginMethodHandler;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: InstagramCustomTab.kt */
public final class InstagramCustomTab extends CustomTab {
    public static final Companion Companion = new Companion((g) null);

    /* compiled from: InstagramCustomTab.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Uri getURIForAction(String str, Bundle bundle) {
            m.f(str, NativeProtocol.WEB_DIALOG_ACTION);
            if (m.a(str, CustomTabLoginMethodHandler.OAUTH_DIALOG)) {
                Utility utility = Utility.INSTANCE;
                ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
                return Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle);
            }
            Utility utility2 = Utility.INSTANCE;
            ServerProtocol serverProtocol2 = ServerProtocol.INSTANCE;
            String instagramDialogAuthority = ServerProtocol.getInstagramDialogAuthority();
            StringBuilder sb = new StringBuilder();
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            sb.append(FacebookSdk.getGraphApiVersion());
            sb.append("/dialog/");
            sb.append(str);
            return Utility.buildUri(instagramDialogAuthority, sb.toString(), bundle);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstagramCustomTab(String str, Bundle bundle) {
        super(str, bundle);
        m.f(str, NativeProtocol.WEB_DIALOG_ACTION);
        setUri(Companion.getURIForAction(str, bundle == null ? new Bundle() : bundle));
    }
}
