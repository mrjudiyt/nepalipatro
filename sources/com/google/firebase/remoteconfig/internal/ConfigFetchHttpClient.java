package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.core.content.pm.a;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";
    private static final String ETAG_HEADER = "ETag";
    private static final Pattern GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private static final String IF_NONE_MATCH_HEADER = "If-None-Match";
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final String ISO_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    private final String apiKey;
    private final String appId;
    private final long connectTimeoutInSeconds;
    private final Context context;
    private final String namespace;
    private final String projectNumber;
    private final long readTimeoutInSeconds;

    public ConfigFetchHttpClient(Context context2, String str, String str2, String str3, long j10, long j11) {
        this.context = context2;
        this.appId = str;
        this.apiKey = str2;
        this.projectNumber = extractProjectNumberFromAppId(str);
        this.namespace = str3;
        this.connectTimeoutInSeconds = j10;
        this.readTimeoutInSeconds = j11;
    }

    private boolean backendHasUpdates(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private String convertToISOString(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_DATE_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j10));
    }

    private JSONObject createFetchRequestBody(String str, String str2, Map<String, String> map, Long l10) {
        String str3;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID_TOKEN, str2);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.appId);
            Locale locale = this.context.getResources().getConfiguration().locale;
            hashMap.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, locale.getCountry());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                str3 = locale.toLanguageTag();
            } else {
                str3 = locale.toString();
            }
            hashMap.put(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, str3);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, Integer.toString(i10));
            hashMap.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, packageInfo.versionName);
                    hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_BUILD, Long.toString(a.a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, this.context.getPackageName());
            hashMap.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, BuildConfig.VERSION_NAME);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.ANALYTICS_USER_PROPERTIES, new JSONObject(map));
            if (l10 != null) {
                hashMap.put(RemoteConfigConstants.RequestFieldKey.FIRST_OPEN_TIME, convertToISOString(l10.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    private static ConfigContainer extractConfigs(JSONObject jSONObject, Date date) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            ConfigContainer.Builder withFetchTime = ConfigContainer.newBuilder().withFetchTime(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                withFetchTime = withFetchTime.replaceConfigsWith(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.EXPERIMENT_DESCRIPTIONS);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                withFetchTime = withFetchTime.withAbtExperiments(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.PERSONALIZATION_METADATA);
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                withFetchTime = withFetchTime.withPersonalizationMetadata(jSONObject3);
            }
            String string = jSONObject.has(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) ? jSONObject.getString(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) : null;
            if (string != null) {
                withFetchTime.withTemplateVersionNumber(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.ROLLOUT_METADATA);
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                withFetchTime = withFetchTime.withRolloutMetadata(jSONArray2);
            }
            return withFetchTime.build();
        } catch (JSONException e10) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", (Throwable) e10);
        }
    }

    private static String extractProjectNumberFromAppId(String str) {
        Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject getFetchResponseBody(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    private String getFetchUrl(String str, String str2) {
        return String.format(RemoteConfigConstants.FETCH_REGEX_URL, new Object[]{str, str2});
    }

    private String getFingerprintHashForPackage() {
        try {
            Context context2 = this.context;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context2, context2.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get fingerprint hash for package: ");
            sb.append(this.context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.context.getPackageName());
            return null;
        }
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.apiKey);
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void setCustomRequestHeaders(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }

    private void setFetchRequestBody(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void setUpUrlConnection(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.connectTimeoutInSeconds));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.readTimeoutInSeconds));
        httpURLConnection.setRequestProperty(IF_NONE_MATCH_HEADER, str);
        setCommonRequestHeaders(httpURLConnection, str2);
        setCustomRequestHeaders(httpURLConnection, map);
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection createHttpURLConnection() {
        try {
            return (HttpURLConnection) new URL(getFetchUrl(this.projectNumber, this.namespace)).openConnection();
        } catch (IOException e10) {
            throw new FirebaseRemoteConfigException(e10.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    @Keep
    public ConfigFetchHandler.FetchResponse fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date) {
        setUpUrlConnection(httpURLConnection, str3, str2, map2);
        try {
            setFetchRequestBody(httpURLConnection, createFetchRequestBody(str, str2, map, l10).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField(ETAG_HEADER);
                JSONObject fetchResponseBody = getFetchResponseBody(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                ConfigContainer extractConfigs = extractConfigs(fetchResponseBody, date);
                if (!backendHasUpdates(fetchResponseBody)) {
                    return ConfigFetchHandler.FetchResponse.forBackendHasNoUpdates(date, extractConfigs);
                }
                return ConfigFetchHandler.FetchResponse.forBackendUpdatesFetched(extractConfigs, headerField);
            }
            throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
        } catch (IOException | JSONException e10) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e10);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public long getConnectTimeoutInSeconds() {
        return this.connectTimeoutInSeconds;
    }

    public long getReadTimeoutInSeconds() {
        return this.readTimeoutInSeconds;
    }
}
