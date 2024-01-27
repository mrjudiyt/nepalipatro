package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import g9.d;
import g9.f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Utility.kt */
public final class Utility {
    private static final String ARC_DEVICE_PATTERN = ".+_cheets|cheets_.+";
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
    private static final String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a2";
    private static final String FACEBOOK_PROFILE_FIELDS = "id,name,first_name,middle_name,last_name";
    private static final String HASH_ALGORITHM_MD5 = "MD5";
    private static final String HASH_ALGORITHM_SHA1 = "SHA-1";
    private static final String HASH_ALGORITHM_SHA256 = "SHA-256";
    private static final String INSTAGRAM_PROFILE_FIELDS = "id,name,profile_picture";
    public static final Utility INSTANCE = new Utility();
    public static final String LOG_TAG = "FacebookSDK";
    private static final String NO_CARRIER = "NoCarrier";
    private static final int REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS = 1800000;
    private static final String URL_SCHEME = "https";
    private static final String UTF8 = "UTF-8";
    private static long availableExternalStorageGB = -1;
    private static String carrierName = NO_CARRIER;
    private static String deviceTimeZoneName = "";
    private static String deviceTimezoneAbbreviation = "";
    private static int numCPUCores;
    private static long timestampOfLastCheck = -1;
    private static long totalExternalStorageGB = -1;

    /* compiled from: Utility.kt */
    public interface GraphMeRequestWithCacheCallback {
        void onFailure(FacebookException facebookException);

        void onSuccess(JSONObject jSONObject);
    }

    private Utility() {
    }

    private final void appendAnonIdUnderCompliance(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, String str, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !isGooglePlayServicesAvailable(context)) {
            jSONObject.put("anon_id", str);
        } else if (!attributionIdentifiers.isTrackingLimited()) {
            jSONObject.put("anon_id", str);
        }
    }

    private final void appendAttributionIdUnderCompliance(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !isGooglePlayServicesAvailable(context)) {
            jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
        } else if (!attributionIdentifiers.isTrackingLimited()) {
            jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
        }
    }

    public static final <T> boolean areObjectsEqual(T t10, T t11) {
        if (t10 == null) {
            return t11 == null;
        }
        return m.a(t10, t11);
    }

    public static final JSONObject awaitGetGraphMeRequestWithCache(String str) {
        m.f(str, "accessToken");
        ProfileInformationCache profileInformationCache = ProfileInformationCache.INSTANCE;
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(str);
        if (profileInformation != null) {
            return profileInformation;
        }
        GraphResponse executeAndWait = INSTANCE.getGraphMeRequestWithCache(str).executeAndWait();
        if (executeAndWait.getError() != null) {
            return null;
        }
        return executeAndWait.getJsonObject();
    }

    public static final Uri buildUri(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(URL_SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        m.e(build, "builder.build()");
        return build;
    }

    private final void clearCookiesForDomain(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            Object[] array = q.c0(cookie, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                Object[] array2 = q.c0(str2, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr2 = (String[]) array2;
                if (strArr2.length > 0) {
                    String str3 = strArr2[0];
                    int length2 = str3.length() - 1;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length2) {
                        boolean z11 = m.h(str3.charAt(!z10 ? i11 : length2), 32) <= 0;
                        if (!z10) {
                            if (!z11) {
                                z10 = true;
                            } else {
                                i11++;
                            }
                        } else if (!z11) {
                            break;
                        } else {
                            length2--;
                        }
                    }
                    instance.setCookie(str, m.o(str3.subSequence(i11, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                }
            }
            instance.removeExpiredCookie();
        }
    }

    public static final void clearFacebookCookies(Context context) {
        m.f(context, "context");
        try {
            Utility utility = INSTANCE;
            utility.clearCookiesForDomain(context, FacebookSdk.FACEBOOK_COM);
            utility.clearCookiesForDomain(context, ".facebook.com");
            utility.clearCookiesForDomain(context, "https://facebook.com");
            utility.clearCookiesForDomain(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String coerceValueIfNullOrEmpty(String str, String str2) {
        return isNullOrEmpty(str) ? str2 : str;
    }

    private final long convertBytesToGB(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    public static final List<String> convertJSONArrayToList(JSONArray jSONArray) {
        m.f(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            int length = jSONArray.length();
            if (length <= 0) {
                return arrayList;
            }
            while (true) {
                int i11 = i10 + 1;
                String string = jSONArray.getString(i10);
                m.e(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i11 >= length) {
                    return arrayList;
                }
                i10 = i11;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final Map<String, Object> convertJSONObjectToHashMap(JSONObject jSONObject) {
        m.f(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            return hashMap;
        }
        int i10 = 0;
        int length = names.length();
        if (length > 0) {
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = names.getString(i10);
                    m.e(string, "keys.getString(i)");
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = convertJSONObjectToHashMap((JSONObject) obj);
                    }
                    m.e(obj, "value");
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    public static final Map<String, String> convertJSONObjectToStringMap(JSONObject jSONObject) {
        m.f(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                m.e(next, Constants.KEY);
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int copyAndCloseInputStream(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            java.lang.String r0 = "outputStream"
            kotlin.jvm.internal.m.f(r7, r0)
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002a }
            r1.<init>(r6)     // Catch:{ all -> 0x002a }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0027 }
            r2 = 0
            r3 = 0
        L_0x0011:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0027 }
            r5 = -1
            if (r4 == r5) goto L_0x001d
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0027 }
            int r3 = r3 + r4
            goto L_0x0011
        L_0x001d:
            r1.close()
            if (r6 != 0) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            r6.close()
        L_0x0026:
            return r3
        L_0x0027:
            r7 = move-exception
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r7 = move-exception
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r0.close()
        L_0x0031:
            if (r6 != 0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            r6.close()
        L_0x0037:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.copyAndCloseInputStream(java.io.InputStream, java.io.OutputStream):int");
    }

    public static final void disconnectQuietly(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    private final boolean externalStorageExists() {
        return m.a("mounted", Environment.getExternalStorageState());
    }

    public static final String generateRandomString(int i10) {
        String bigInteger = new BigInteger(i10 * 5, new Random()).toString(32);
        m.e(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    public static final String getActivityName(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        m.e(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final String getAppName(Context context) {
        m.f(context, "context");
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            String applicationName = FacebookSdk.getApplicationName();
            if (applicationName != null) {
                return applicationName;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i10);
            m.e(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String getAppVersion() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final Date getBundleLongAsDate(Bundle bundle, String str, Date date) {
        long j10;
        m.f(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j10 = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j10 = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (j10 == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (j10 * 1000));
    }

    public static final long getContentSize(Uri uri) {
        m.f(uri, "contentUri");
        Cursor cursor = null;
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            Cursor query = FacebookSdk.getApplicationContext().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return 0;
            }
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            long j10 = query.getLong(columnIndex);
            query.close();
            return j10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static final Locale getCurrentLocale() {
        Locale resourceLocale = getResourceLocale();
        if (resourceLocale != null) {
            return resourceLocale;
        }
        Locale locale = Locale.getDefault();
        m.e(locale, "getDefault()");
        return locale;
    }

    private final String getCurrentTokenDomainWithDefault() {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        return (currentAccessToken == null || currentAccessToken.getGraphDomain() == null) ? AccessToken.DEFAULT_GRAPH_DOMAIN : currentAccessToken.getGraphDomain();
    }

    public static final JSONObject getDataProcessingOptions() {
        Class<Utility> cls = Utility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            String string = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.DATA_PROCESSING_OPTIONS_PREFERENCES, 0).getString(FacebookSdk.DATA_PROCESSION_OPTIONS, (String) null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final String getGraphDomainFromTokenDomain(String str) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String facebookDomain = FacebookSdk.getFacebookDomain();
        if (str == null) {
            return facebookDomain;
        }
        if (m.a(str, FacebookSdk.GAMING)) {
            return p.t(facebookDomain, FacebookSdk.FACEBOOK_COM, FacebookSdk.FB_GG, false, 4, (Object) null);
        }
        return m.a(str, FacebookSdk.INSTAGRAM) ? p.t(facebookDomain, FacebookSdk.FACEBOOK_COM, FacebookSdk.INSTAGRAM_COM, false, 4, (Object) null) : facebookDomain;
    }

    private final GraphRequest getGraphMeRequestWithCache(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, getProfileFieldsForGraphDomain(getCurrentTokenDomainWithDefault()));
        bundle.putString("access_token", str);
        GraphRequest newMeRequest = GraphRequest.Companion.newMeRequest((AccessToken) null, (GraphRequest.GraphJSONObjectCallback) null);
        newMeRequest.setParameters(bundle);
        newMeRequest.setHttpMethod(HttpMethod.GET);
        return newMeRequest;
    }

    public static final void getGraphMeRequestWithCacheAsync(String str, GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback) {
        m.f(str, "accessToken");
        m.f(graphMeRequestWithCacheCallback, "callback");
        ProfileInformationCache profileInformationCache = ProfileInformationCache.INSTANCE;
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(str);
        if (profileInformation != null) {
            graphMeRequestWithCacheCallback.onSuccess(profileInformation);
            return;
        }
        q qVar = new q(graphMeRequestWithCacheCallback, str);
        GraphRequest graphMeRequestWithCache = INSTANCE.getGraphMeRequestWithCache(str);
        graphMeRequestWithCache.setCallback(qVar);
        graphMeRequestWithCache.executeAsync();
    }

    /* access modifiers changed from: private */
    /* renamed from: getGraphMeRequestWithCacheAsync$lambda-3  reason: not valid java name */
    public static final void m105getGraphMeRequestWithCacheAsync$lambda3(GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback, String str, GraphResponse graphResponse) {
        m.f(graphMeRequestWithCacheCallback, "$callback");
        m.f(str, "$accessToken");
        m.f(graphResponse, "response");
        if (graphResponse.getError() != null) {
            graphMeRequestWithCacheCallback.onFailure(graphResponse.getError().getException());
            return;
        }
        ProfileInformationCache profileInformationCache = ProfileInformationCache.INSTANCE;
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject != null) {
            ProfileInformationCache.putProfileInformation(str, jsonObject);
            graphMeRequestWithCacheCallback.onSuccess(graphResponse.getJsonObject());
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final String getMetadataApplicationId(Context context) {
        Validate validate = Validate.INSTANCE;
        Validate.notNull(context, "context");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.getApplicationId();
    }

    public static final Method getMethodQuietly(Class<?> cls, String str, Class<?>... clsArr) {
        m.f(cls, "clazz");
        m.f(str, "methodName");
        m.f(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String getProfileFieldsForGraphDomain(String str) {
        return m.a(str, FacebookSdk.INSTAGRAM) ? INSTAGRAM_PROFILE_FIELDS : FACEBOOK_PROFILE_FIELDS;
    }

    public static final Locale getResourceLocale() {
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            return FacebookSdk.getApplicationContext().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object getStringPropertyAsJSON(JSONObject jSONObject, String str, String str2) {
        m.f(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    public static final String getUriString(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    private final String hashBytes(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        m.e(digest, "digest");
        int length = digest.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = digest[i10];
            i10++;
            sb.append(Integer.toHexString((b10 >> 4) & 15));
            sb.append(Integer.toHexString((b10 >> 0) & 15));
        }
        String sb2 = sb.toString();
        m.e(sb2, "builder.toString()");
        return sb2;
    }

    private final String hashWithAlgorithm(String str, String str2) {
        Charset charset = d.f14759b;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str2.getBytes(charset);
        m.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return hashWithAlgorithm(str, bytes);
    }

    public static final Object invokeMethodQuietly(Object obj, Method method, Object... objArr) {
        m.f(method, "method");
        m.f(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean isAutoAppLinkSetup() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            b0 b0Var = b0.f15559a;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            m.e(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context applicationContext = FacebookSdk.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            String packageName = applicationContext.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            m.e(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (m.a(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static /* synthetic */ void isAutoAppLinkSetup$annotations() {
    }

    public static final boolean isAutofillAvailable(Context context) {
        AutofillManager autofillManager;
        m.f(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public static final boolean isChromeOS(Context context) {
        m.f(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            m.e(str, "DEVICE");
            if (new f(ARC_DEVICE_PATTERN).a(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isContentUri(Uri uri) {
        return uri != null && p.m(FirebaseAnalytics.Param.CONTENT, uri.getScheme(), true);
    }

    public static final boolean isCurrentAccessToken(AccessToken accessToken) {
        return accessToken != null && m.a(accessToken, AccessToken.Companion.getCurrentAccessToken());
    }

    public static final boolean isDataProcessingRestricted() {
        Class<Utility> cls = Utility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            JSONObject dataProcessingOptions = getDataProcessingOptions();
            if (dataProcessingOptions == null) {
                return false;
            }
            try {
                JSONArray jSONArray = dataProcessingOptions.getJSONArray(FacebookSdk.DATA_PROCESSION_OPTIONS);
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        m.e(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (m.a(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final boolean isFileUri(Uri uri) {
        return uri != null && p.m("file", uri.getScheme(), true);
    }

    private final boolean isGooglePlayServicesAvailable(Context context) {
        Method methodQuietly = getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
        if (methodQuietly == null) {
            return false;
        }
        Object invokeMethodQuietly = invokeMethodQuietly((Object) null, methodQuietly, context);
        if (!(invokeMethodQuietly instanceof Integer) || !m.a(invokeMethodQuietly, 0)) {
            return false;
        }
        return true;
    }

    public static final boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean isWebUri(Uri uri) {
        if (uri == null || (!p.m("http", uri.getScheme(), true) && !p.m(URL_SCHEME, uri.getScheme(), true) && !p.m("fbstaging", uri.getScheme(), true))) {
            return false;
        }
        return true;
    }

    public static final Set<String> jsonArrayToSet(JSONArray jSONArray) {
        m.f(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jSONArray.getString(i10);
                m.e(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    public static final List<String> jsonArrayToStringList(JSONArray jSONArray) {
        m.f(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jSONArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public static final Map<String, String> jsonStrToMap(String str) {
        m.f(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                m.e(next, Constants.KEY);
                String string = jSONObject.getString(next);
                m.e(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final void logd(String str, Exception exc) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isDebugEnabled() && str != null && exc != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exc.getClass().getSimpleName());
            sb.append(": ");
            sb.append(exc.getMessage());
        }
    }

    public static final String mapToJsonStr(Map<String, String> map) {
        m.f(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), (String) next.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            m.e(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final String md5hash(String str) {
        m.f(str, Constants.KEY);
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_MD5, str);
    }

    public static final boolean mustFixWindowParamsForAutofill(Context context) {
        m.f(context, "context");
        return isAutofillAvailable(context);
    }

    public static final Bundle parseUrlQueryString(String str) {
        Bundle bundle = new Bundle();
        if (!isNullOrEmpty(str)) {
            if (str != null) {
                Object[] array = q.c0(str, new String[]{"&"}, false, 0, 6, (Object) null).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str2 = strArr[i10];
                    i10++;
                    Object[] array2 = q.c0(str2, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                    Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                    String[] strArr2 = (String[]) array2;
                    try {
                        if (strArr2.length == 2) {
                            bundle.putString(URLDecoder.decode(strArr2[0], UTF8), URLDecoder.decode(strArr2[1], UTF8));
                        } else if (strArr2.length == 1) {
                            bundle.putString(URLDecoder.decode(strArr2[0], UTF8), "");
                        }
                    } catch (UnsupportedEncodingException e10) {
                        logd(LOG_TAG, (Exception) e10);
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    public static final void putCommaSeparatedStringList(Bundle bundle, String str, List<String> list) {
        m.f(bundle, "b");
        if (list != null) {
            bundle.putString(str, TextUtils.join(",", list));
        }
    }

    public static final boolean putJSONValueInBundle(Bundle bundle, String str, Object obj) {
        m.f(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, ((JSONObject) obj).toString());
            return true;
        }
    }

    public static final void putNonEmptyString(Bundle bundle, String str, String str2) {
        m.f(bundle, "b");
        if (!isNullOrEmpty(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static final void putUri(Bundle bundle, String str, Uri uri) {
        m.f(bundle, "b");
        if (uri != null) {
            putNonEmptyString(bundle, str, uri.toString());
        }
    }

    public static final Map<String, String> readNonnullStringMapFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i10 = 0;
        if (readInt > 0) {
            do {
                i10++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (!(readString == null || readString2 == null)) {
                    hashMap.put(readString, readString2);
                    continue;
                }
            } while (i10 < readInt);
        }
        return hashMap;
    }

    public static final String readStreamToString(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m.e(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            closeQuietly(bufferedInputStream);
                            closeQuietly(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(bufferedInputStream);
                    closeQuietly(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                closeQuietly(bufferedInputStream);
                closeQuietly(inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            closeQuietly(bufferedInputStream);
            closeQuietly(inputStreamReader);
            throw th;
        }
    }

    public static final Map<String, String> readStringMapFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i10 = 0;
        if (readInt > 0) {
            do {
                i10++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i10 < readInt);
        }
        return hashMap;
    }

    private final void refreshAvailableExternalStorage() {
        try {
            if (externalStorageExists()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            availableExternalStorageGB = convertBytesToGB((double) availableExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    private final int refreshBestGuessNumberOfCPUCores() {
        int i10 = numCPUCores;
        if (i10 > 0) {
            return i10;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(r.f6089a);
            if (listFiles != null) {
                numCPUCores = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (numCPUCores <= 0) {
            numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    /* access modifiers changed from: private */
    /* renamed from: refreshBestGuessNumberOfCPUCores$lambda-4  reason: not valid java name */
    public static final boolean m106refreshBestGuessNumberOfCPUCores$lambda4(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    private final void refreshCarrierName(Context context) {
        if (m.a(carrierName, NO_CARRIER)) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService != null) {
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    m.e(networkOperatorName, "telephonyManager.networkOperatorName");
                    carrierName = networkOperatorName;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } catch (Exception unused) {
            }
        }
    }

    private final void refreshPeriodicExtendedDeviceInfo(Context context) {
        if (timestampOfLastCheck == -1 || System.currentTimeMillis() - timestampOfLastCheck >= 1800000) {
            timestampOfLastCheck = System.currentTimeMillis();
            refreshTimezone();
            refreshCarrierName(context);
            refreshTotalExternalStorage();
            refreshAvailableExternalStorage();
        }
    }

    private final void refreshTimezone() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            m.e(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            deviceTimezoneAbbreviation = displayName;
            String id = timeZone.getID();
            m.e(id, "tz.id");
            deviceTimeZoneName = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    private final void refreshTotalExternalStorage() {
        try {
            if (externalStorageExists()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            totalExternalStorageGB = convertBytesToGB((double) totalExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    public static final void runOnNonUiThread(Runnable runnable) {
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FacebookSdk.getExecutor().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final String safeGetStringFromResponse(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        String optString = jSONObject.optString(str, "");
        m.e(optString, "response.optString(propertyName, \"\")");
        return optString;
    }

    public static final void setAppEventAttributionParameters(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, String str, boolean z10, Context context) {
        m.f(jSONObject, NativeProtocol.WEB_DIALOG_PARAMS);
        m.f(context, "context");
        FeatureManager featureManager = FeatureManager.INSTANCE;
        FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
        if (!FeatureManager.isEnabled(feature)) {
            jSONObject.put("anon_id", str);
        }
        boolean z11 = true;
        jSONObject.put("application_tracking_enabled", !z10);
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        jSONObject.put("advertiser_id_collection_enabled", FacebookSdk.getAdvertiserIDCollectionEnabled());
        if (attributionIdentifiers != null) {
            if (FeatureManager.isEnabled(feature)) {
                INSTANCE.appendAnonIdUnderCompliance(jSONObject, attributionIdentifiers, str, context);
            }
            if (attributionIdentifiers.getAttributionId() != null) {
                if (FeatureManager.isEnabled(feature)) {
                    INSTANCE.appendAttributionIdUnderCompliance(jSONObject, attributionIdentifiers, context);
                } else {
                    jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
                }
            }
            if (attributionIdentifiers.getAndroidAdvertiserId() != null) {
                jSONObject.put("advertiser_id", attributionIdentifiers.getAndroidAdvertiserId());
                jSONObject.put("advertiser_tracking_enabled", !attributionIdentifiers.isTrackingLimited());
            }
            if (!attributionIdentifiers.isTrackingLimited()) {
                UserDataStore userDataStore = UserDataStore.INSTANCE;
                String allHashedUserData = UserDataStore.getAllHashedUserData();
                if (allHashedUserData.length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    jSONObject.put("ud", allHashedUserData);
                }
            }
            if (attributionIdentifiers.getAndroidInstallerPackage() != null) {
                jSONObject.put("installer_package", attributionIdentifiers.getAndroidInstallerPackage());
            }
        }
    }

    public static final void setAppEventExtendedDeviceInfoParameters(JSONObject jSONObject, Context context) {
        String str;
        Locale locale;
        int i10;
        m.f(jSONObject, NativeProtocol.WEB_DIALOG_PARAMS);
        m.f(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        Utility utility = INSTANCE;
        jSONArray.put(EXTRA_APP_EVENTS_INFO_FORMAT_VERSION);
        utility.refreshPeriodicExtendedDeviceInfo(context);
        String packageName = context.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                i12 = packageInfo.versionCode;
                str = packageInfo.versionName;
                jSONArray.put(packageName);
                jSONArray.put(i12);
                jSONArray.put(str);
                jSONArray.put(Build.VERSION.RELEASE);
                jSONArray.put(Build.MODEL);
                try {
                    locale = context.getResources().getConfiguration().locale;
                } catch (Exception unused) {
                    locale = Locale.getDefault();
                }
                jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
                jSONArray.put(deviceTimezoneAbbreviation);
                jSONArray.put(carrierName);
                double d10 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                try {
                    Display display = null;
                    if (Build.VERSION.SDK_INT >= 17) {
                        Object systemService = context.getSystemService("display");
                        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
                        if (displayManager != null) {
                            display = displayManager.getDisplay(0);
                        }
                    } else {
                        Object systemService2 = context.getSystemService("window");
                        WindowManager windowManager = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
                        if (windowManager != null) {
                            display = windowManager.getDefaultDisplay();
                        }
                    }
                    if (display != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        display.getMetrics(displayMetrics);
                        int i13 = displayMetrics.widthPixels;
                        try {
                            int i14 = displayMetrics.heightPixels;
                            try {
                                d10 = (double) displayMetrics.density;
                            } catch (Exception unused2) {
                            }
                            i10 = i14;
                            i11 = i13;
                        } catch (Exception unused3) {
                            i11 = i13;
                        }
                        jSONArray.put(i11);
                        jSONArray.put(i10);
                        jSONArray.put(new DecimalFormat("#.##").format(d10));
                        jSONArray.put(INSTANCE.refreshBestGuessNumberOfCPUCores());
                        jSONArray.put(totalExternalStorageGB);
                        jSONArray.put(availableExternalStorageGB);
                        jSONArray.put(deviceTimeZoneName);
                        jSONObject.put(com.facebook.appevents.codeless.internal.Constants.EXTINFO, jSONArray.toString());
                    }
                } catch (Exception unused4) {
                }
                i10 = 0;
                jSONArray.put(i11);
                jSONArray.put(i10);
                jSONArray.put(new DecimalFormat("#.##").format(d10));
                jSONArray.put(INSTANCE.refreshBestGuessNumberOfCPUCores());
                jSONArray.put(totalExternalStorageGB);
                jSONArray.put(availableExternalStorageGB);
                jSONArray.put(deviceTimeZoneName);
                jSONObject.put(com.facebook.appevents.codeless.internal.Constants.EXTINFO, jSONArray.toString());
            }
        } catch (PackageManager.NameNotFoundException unused5) {
            str = "";
        }
    }

    public static final String sha1hash(String str) {
        m.f(str, Constants.KEY);
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA1, str);
    }

    public static final String sha256hash(String str) {
        if (str == null) {
            return null;
        }
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA256, str);
    }

    public static final boolean stringsEqualOrEmpty(String str, String str2) {
        boolean z10 = str == null || str.length() == 0;
        boolean z11 = str2 == null || str2.length() == 0;
        if (z10 && z11) {
            return true;
        }
        if (z10 || z11) {
            return false;
        }
        return m.a(str, str2);
    }

    public static final JSONArray tryGetJSONArrayFromResponse(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONArray(str);
    }

    public static final JSONObject tryGetJSONObjectFromResponse(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    public static final void writeNonnullStringMapToParcel(Parcel parcel, Map<String, String> map) {
        m.f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    public static final void writeStringMapToParcel(Parcel parcel, Map<String, String> map) {
        m.f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    public static final Method getMethodQuietly(String str, String str2, Class<?>... clsArr) {
        m.f(str, "className");
        m.f(str2, "methodName");
        m.f(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            m.e(cls, "clazz");
            return getMethodQuietly(cls, str2, (Class<?>[]) (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String hashWithAlgorithm(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            m.e(instance, "hash");
            return hashBytes(instance, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final boolean isNullOrEmpty(String str) {
        if (str != null) {
            return str.length() == 0;
        }
    }

    public static final String sha1hash(byte[] bArr) {
        m.f(bArr, "bytes");
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA1, bArr);
    }

    public static final String sha256hash(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA256, bArr);
    }

    public static final void logd(String str, String str2) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        FacebookSdk.isDebugEnabled();
    }

    public static final void logd(String str, String str2, Throwable th) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isDebugEnabled()) {
            isNullOrEmpty(str);
        }
    }
}
