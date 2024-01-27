package com.facebook.appevents;

import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import g9.f;
import io.flutter.plugins.firebase.analytics.Constants;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import org.json.JSONObject;

/* compiled from: AppEvent.kt */
public final class AppEvent implements Serializable {
    public static final Companion Companion = new Companion((g) null);
    private static final int MAX_IDENTIFIER_LENGTH = 40;
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */
    public static final HashSet<String> validatedIdentifiers = new HashSet<>();
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    /* compiled from: AppEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String md5Checksum(String str) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                m.e(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    m.e(bytes, "(this as java.lang.String).getBytes(charset)");
                    instance.update(bytes, 0, bytes.length);
                    byte[] digest = instance.digest();
                    m.e(digest, "digest.digest()");
                    AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                    return AppEventUtility.bytesToHex(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (NoSuchAlgorithmException e10) {
                Utility utility = Utility.INSTANCE;
                Utility.logd("Failed to generate checksum: ", (Exception) e10);
                return AppEventsConstants.EVENT_PARAM_VALUE_NO;
            } catch (UnsupportedEncodingException e11) {
                Utility utility2 = Utility.INSTANCE;
                Utility.logd("Failed to generate checksum: ", (Exception) e11);
                return AppEventsConstants.EVENT_PARAM_VALUE_YES;
            }
        }

        /* access modifiers changed from: private */
        public final void validateIdentifier(String str) {
            boolean contains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (AppEvent.validatedIdentifiers) {
                        contains = AppEvent.validatedIdentifiers.contains(str);
                        q qVar = q.f16189a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new f("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").a(str)) {
                        synchronized (AppEvent.validatedIdentifiers) {
                            AppEvent.validatedIdentifiers.add(str);
                        }
                        return;
                    }
                    b0 b0Var = b0.f15559a;
                    String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                    m.e(format, "java.lang.String.format(format, *args)");
                    throw new FacebookException(format);
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            b0 b0Var2 = b0.f15559a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            m.e(format2, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format2);
        }
    }

    /* compiled from: AppEvent.kt */
    public static final class SerializationProxyV2 implements Serializable {
        public static final Companion Companion = new Companion((g) null);
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        /* compiled from: AppEvent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public SerializationProxyV2(String str, boolean z10, boolean z11, String str2) {
            m.f(str, "jsonString");
            this.jsonString = str;
            this.isImplicit = z10;
            this.inBackground = z11;
            this.checksum = str2;
        }

        private final Object readResolve() {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum, (g) null);
        }
    }

    public AppEvent(String str, String str2, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) {
        m.f(str, "contextName");
        m.f(str2, Constants.EVENT_NAME);
        this.isImplicit = z10;
        this.inBackground = z11;
        this.name = str2;
        this.jsonObject = getJSONObjectForAppEvent(str, str2, d10, bundle, uuid);
        this.checksum = calculateChecksum();
    }

    public /* synthetic */ AppEvent(String str, boolean z10, boolean z11, String str2, g gVar) {
        this(str, z10, z11, str2);
    }

    private final String calculateChecksum() {
        if (Build.VERSION.SDK_INT > 19) {
            Companion companion = Companion;
            String jSONObject = this.jsonObject.toString();
            m.e(jSONObject, "jsonObject.toString()");
            return companion.md5Checksum(jSONObject);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.jsonObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        t.m(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.jsonObject.optString(str));
            sb.append(10);
        }
        Companion companion2 = Companion;
        String sb2 = sb.toString();
        m.e(sb2, "sb.toString()");
        return companion2.md5Checksum(sb2);
    }

    private final JSONObject getJSONObjectForAppEvent(String str, String str2, Double d10, Bundle bundle, UUID uuid) {
        Companion companion = Companion;
        companion.validateIdentifier(str2);
        JSONObject jSONObject = new JSONObject();
        RestrictiveDataManager restrictiveDataManager = RestrictiveDataManager.INSTANCE;
        String processEvent = RestrictiveDataManager.processEvent(str2);
        jSONObject.put(com.facebook.appevents.internal.Constants.EVENT_NAME_EVENT_KEY, processEvent);
        jSONObject.put(com.facebook.appevents.internal.Constants.EVENT_NAME_MD5_EVENT_KEY, companion.md5Checksum(processEvent));
        jSONObject.put(com.facebook.appevents.internal.Constants.LOG_TIME_APP_EVENT_KEY, System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> validateParameters = validateParameters(bundle);
            for (String next : validateParameters.keySet()) {
                jSONObject.put(next, validateParameters.get(next));
            }
        }
        if (d10 != null) {
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, d10.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        } else {
            Logger.Companion companion2 = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            m.e(jSONObject2, "eventObject.toString()");
            companion2.log(loggingBehavior, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    private final Map<String, String> validateParameters(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Companion companion = Companion;
            m.e(str, io.flutter.plugins.firebase.crashlytics.Constants.KEY);
            companion.validateIdentifier(str);
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(str, obj.toString());
            } else {
                b0 b0Var = b0.f15559a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                m.e(format, "java.lang.String.format(format, *args)");
                throw new FacebookException(format);
            }
        }
        IntegrityManager integrityManager = IntegrityManager.INSTANCE;
        IntegrityManager.processParameters(hashMap);
        RestrictiveDataManager restrictiveDataManager = RestrictiveDataManager.INSTANCE;
        RestrictiveDataManager.processParameters(hashMap, this.name);
        EventDeactivationManager eventDeactivationManager = EventDeactivationManager.INSTANCE;
        EventDeactivationManager.processDeprecatedParameters(hashMap, this.name);
        return hashMap;
    }

    private final Object writeReplace() {
        String jSONObject = this.jsonObject.toString();
        m.e(jSONObject, "jsonObject.toString()");
        return new SerializationProxyV2(jSONObject, this.isImplicit, this.inBackground, this.checksum);
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    public final JSONObject getJSONObject() {
        return this.jsonObject;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        return m.a(calculateChecksum(), this.checksum);
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    public String toString() {
        b0 b0Var = b0.f15559a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString(com.facebook.appevents.internal.Constants.EVENT_NAME_EVENT_KEY), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private AppEvent(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z10;
        String optString = jSONObject.optString(com.facebook.appevents.internal.Constants.EVENT_NAME_EVENT_KEY);
        m.e(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.name = optString;
        this.checksum = str2;
        this.inBackground = z11;
    }
}
