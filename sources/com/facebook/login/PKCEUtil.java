package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import b9.c;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.ServerProtocol;
import d9.f;
import g9.d;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import y8.l;

/* compiled from: PKCEUtil.kt */
public final class PKCEUtil {
    public static final PKCEUtil INSTANCE = new PKCEUtil();

    private PKCEUtil() {
    }

    public static final GraphRequest createCodeExchangeRequest(String str, String str2, String str3) {
        m.f(str, "authorizationCode");
        m.f(str2, "redirectUri");
        m.f(str3, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str2);
        bundle.putString("code_verifier", str3);
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest((AccessToken) null, "oauth/access_token", (GraphRequest.Callback) null);
        newGraphPathRequest.setHttpMethod(HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        return newGraphPathRequest;
    }

    public static final String generateCodeChallenge(String str, CodeChallengeMethod codeChallengeMethod) {
        m.f(str, "codeVerifier");
        m.f(codeChallengeMethod, "codeChallengeMethod");
        if (!isValidCodeVerifier(str)) {
            throw new FacebookException("Invalid Code Verifier.");
        } else if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return str;
        } else {
            try {
                byte[] bytes = str.getBytes(d.f14763f);
                m.e(bytes, "(this as java.lang.String).getBytes(charset)");
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(instance.digest(), 11);
                m.e(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e10) {
                throw new FacebookException((Throwable) e10);
            }
        }
    }

    public static final String generateCodeVerifier() {
        int h10 = l.h(new f(43, 128), c.f13332h);
        List J = x.J(x.J(x.J(x.J(x.I(x.H(new d9.c('a', 'z'), new d9.c('A', 'Z')), new d9.c('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(h10);
        for (int i10 = 0; i10 < h10; i10++) {
            arrayList.add(Character.valueOf(((Character) x.K(J, c.f13332h)).charValue()));
        }
        return x.D(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }

    public static final boolean isValidCodeVerifier(String str) {
        if ((str == null || str.length() == 0) || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new g9.f("^[-._~A-Za-z0-9]+$").a(str);
    }
}
