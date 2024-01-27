package com.facebook.appevents;

import com.facebook.internal.Utility;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: AccessTokenAppIdPair.kt */
public final class AccessTokenAppIdPair implements Serializable {
    public static final Companion Companion = new Companion((g) null);
    private static final long serialVersionUID = 1;
    private final String accessTokenString;
    private final String applicationId;

    /* compiled from: AccessTokenAppIdPair.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: AccessTokenAppIdPair.kt */
    public static final class SerializationProxyV1 implements Serializable {
        public static final Companion Companion = new Companion((g) null);
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        /* compiled from: AccessTokenAppIdPair.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public SerializationProxyV1(String str, String str2) {
            m.f(str2, RemoteConfigConstants.RequestFieldKey.APP_ID);
            this.accessTokenString = str;
            this.appId = str2;
        }

        private final Object readResolve() {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    public AccessTokenAppIdPair(String str, String str2) {
        m.f(str2, "applicationId");
        this.applicationId = str2;
        Utility utility = Utility.INSTANCE;
        this.accessTokenString = Utility.isNullOrEmpty(str) ? null : str;
    }

    private final Object writeReplace() {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        Utility utility = Utility.INSTANCE;
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        if (!Utility.areObjectsEqual(accessTokenAppIdPair.accessTokenString, this.accessTokenString) || !Utility.areObjectsEqual(accessTokenAppIdPair.applicationId, this.applicationId)) {
            return false;
        }
        return true;
    }

    public final String getAccessTokenString() {
        return this.accessTokenString;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        String str = this.accessTokenString;
        return (str == null ? 0 : str.hashCode()) ^ this.applicationId.hashCode();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AccessTokenAppIdPair(com.facebook.AccessToken r2) {
        /*
            r1 = this;
            java.lang.String r0 = "accessToken"
            kotlin.jvm.internal.m.f(r2, r0)
            java.lang.String r2 = r2.getToken()
            com.facebook.FacebookSdk r0 = com.facebook.FacebookSdk.INSTANCE
            java.lang.String r0 = com.facebook.FacebookSdk.getApplicationId()
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AccessTokenAppIdPair.<init>(com.facebook.AccessToken):void");
    }
}
