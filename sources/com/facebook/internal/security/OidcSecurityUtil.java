package com.facebook.internal.security;

import android.util.Base64;
import com.facebook.FacebookSdk;
import g9.d;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import m3.a;
import o8.q;
import org.json.JSONObject;
import w8.k;

/* compiled from: OidcSecurityUtil.kt */
public final class OidcSecurityUtil {
    public static final OidcSecurityUtil INSTANCE = new OidcSecurityUtil();
    private static final String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";
    public static final String SIGNATURE_ALGORITHM_SHA256 = "SHA256withRSA";
    public static final long TIMEOUT_IN_MILLISECONDS = 5000;

    private OidcSecurityUtil() {
    }

    public static final PublicKey getPublicKeyFromString(String str) {
        m.f(str, Constants.KEY);
        byte[] decode = Base64.decode(p.t(p.t(p.t(str, "\n", "", false, 4, (Object) null), "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), 0);
        m.e(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        m.e(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX INFO: finally extract failed */
    public static final String getRawKeyFromEndPoint(String str) {
        m.f(str, "kid");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        URL url = new URL("https", m.o("www.", FacebookSdk.getFacebookDomain()), OPENID_KEYS_PATH);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        y yVar = new y();
        FacebookSdk.getExecutor().execute(new a(url, yVar, str, reentrantLock, newCondition));
        reentrantLock.lock();
        try {
            newCondition.await(5000, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) yVar.f15575h;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: getRawKeyFromEndPoint$lambda-1  reason: not valid java name */
    public static final void m128getRawKeyFromEndPoint$lambda1(URL url, y yVar, String str, ReentrantLock reentrantLock, Condition condition) {
        m.f(url, "$openIdKeyUrl");
        m.f(yVar, "$result");
        m.f(str, "$kid");
        m.f(reentrantLock, "$lock");
        URLConnection openConnection = url.openConnection();
        Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            m.e(inputStream, "connection.inputStream");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, d.f14759b);
            String c10 = k.c(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
            httpURLConnection.getInputStream().close();
            yVar.f15575h = new JSONObject(c10).optString(str);
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                q qVar = q.f16189a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Exception e10) {
            try {
                INSTANCE.getClass();
                e10.getMessage();
                httpURLConnection.disconnect();
                reentrantLock.lock();
                condition.signal();
                q qVar2 = q.f16189a;
            } catch (Throwable th2) {
                httpURLConnection.disconnect();
                reentrantLock.lock();
                condition.signal();
                q qVar3 = q.f16189a;
                throw th2;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static final boolean verify(PublicKey publicKey, String str, String str2) {
        m.f(publicKey, "publicKey");
        m.f(str, "data");
        m.f(str2, "signature");
        try {
            Signature instance = Signature.getInstance(SIGNATURE_ALGORITHM_SHA256);
            instance.initVerify(publicKey);
            byte[] bytes = str.getBytes(d.f14759b);
            m.e(bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            m.e(decode, "decode(signature, Base64.URL_SAFE)");
            return instance.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public final String getOPENID_KEYS_PATH() {
        return OPENID_KEYS_PATH;
    }
}
