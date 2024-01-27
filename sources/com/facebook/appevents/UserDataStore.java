package com.facebook.appevents;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Patterns;
import com.facebook.FacebookSdk;
import com.facebook.appevents.aam.MetadataRule;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import g9.f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;

/* compiled from: UserDataStore.kt */
public final class UserDataStore {
    public static final String CITY = "ct";
    public static final String COUNTRY = "country";
    private static final String DATA_SEPARATOR = ",";
    public static final String DATE_OF_BIRTH = "db";
    public static final String EMAIL = "em";
    public static final String FIRST_NAME = "fn";
    public static final String GENDER = "ge";
    public static final UserDataStore INSTANCE = new UserDataStore();
    private static final String INTERNAL_USER_DATA_KEY = "com.facebook.appevents.UserDataStore.internalUserData";
    public static final String LAST_NAME = "ln";
    private static final int MAX_NUM = 5;
    public static final String PHONE = "ph";
    public static final String STATE = "st";
    private static final String TAG = UserDataStore.class.getSimpleName();
    private static final String USER_DATA_KEY = "com.facebook.appevents.UserDataStore.userData";
    public static final String ZIP = "zp";
    private static final ConcurrentHashMap<String, String> externalHashedUserData = new ConcurrentHashMap<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static final ConcurrentHashMap<String, String> internalHashedUserData = new ConcurrentHashMap<>();
    private static SharedPreferences sharedPreferences;

    private UserDataStore() {
    }

    public static final void clear() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(s.f6005h);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: clear$lambda-2  reason: not valid java name */
    public static final void m39clear$lambda2() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!initialized.get()) {
                    INSTANCE.initAndWait();
                }
                externalHashedUserData.clear();
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putString(USER_DATA_KEY, (String) null).apply();
                } else {
                    m.x("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final String getAllHashedUserData() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(externalHashedUserData);
            hashMap.putAll(INSTANCE.getEnabledInternalUserData());
            Utility utility = Utility.INSTANCE;
            return Utility.mapToJsonStr(hashMap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final Map<String, String> getEnabledInternalUserData() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> enabledRuleNames = MetadataRule.Companion.getEnabledRuleNames();
            for (String next : internalHashedUserData.keySet()) {
                if (enabledRuleNames.contains(next)) {
                    hashMap.put(next, internalHashedUserData.get(next));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final String getHashedUserData$facebook_core_release() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            Utility utility = Utility.INSTANCE;
            return Utility.mapToJsonStr(externalHashedUserData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final synchronized void initAndWait() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AtomicBoolean atomicBoolean = initialized;
                if (!atomicBoolean.get()) {
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
                    m.e(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
                    sharedPreferences = defaultSharedPreferences;
                    if (defaultSharedPreferences != null) {
                        String string = defaultSharedPreferences.getString(USER_DATA_KEY, "");
                        if (string == null) {
                            string = "";
                        }
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        if (sharedPreferences2 != null) {
                            String string2 = sharedPreferences2.getString(INTERNAL_USER_DATA_KEY, "");
                            if (string2 == null) {
                                string2 = "";
                            }
                            ConcurrentHashMap<String, String> concurrentHashMap = externalHashedUserData;
                            Utility utility = Utility.INSTANCE;
                            concurrentHashMap.putAll(Utility.jsonStrToMap(string));
                            internalHashedUserData.putAll(Utility.jsonStrToMap(string2));
                            atomicBoolean.set(true);
                            return;
                        }
                        m.x("sharedPreferences");
                        throw null;
                    }
                    m.x("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final void initStore() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!initialized.get()) {
                    INSTANCE.initAndWait();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final boolean maybeSHA256Hashed(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return new f("[A-Fa-f0-9]{64}").a(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final String normalizeData(String str, String str2) {
        String str3;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                if (i10 > length) {
                    break;
                }
                boolean z11 = m.h(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i10++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str2.subSequence(i10, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (m.a(EMAIL, str)) {
                    if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        return lowerCase;
                    }
                    return "";
                } else if (m.a(PHONE, str)) {
                    return new f("[^0-9]").b(lowerCase, "");
                } else {
                    if (!m.a(GENDER, str)) {
                        return lowerCase;
                    }
                    if (!(lowerCase.length() > 0)) {
                        str3 = "";
                    } else if (lowerCase != null) {
                        str3 = lowerCase.substring(0, 1);
                        m.e(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    if (m.a("f", str3) || m.a("m", str3)) {
                        return str3;
                    }
                    return "";
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final void setInternalUd(Map<String, String> map) {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(map, "ud");
                if (!initialized.get()) {
                    INSTANCE.initAndWait();
                }
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    String str2 = (String) next.getValue();
                    Utility utility = Utility.INSTANCE;
                    UserDataStore userDataStore = INSTANCE;
                    int i10 = 1;
                    int length = str2.length() - 1;
                    int i11 = 0;
                    boolean z10 = false;
                    while (true) {
                        if (i11 > length) {
                            break;
                        }
                        boolean z11 = m.h(str2.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (!z10) {
                            if (!z11) {
                                z10 = true;
                            } else {
                                i11++;
                            }
                        } else if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    String sha256hash = Utility.sha256hash(userDataStore.normalizeData(str, str2.subSequence(i11, length + 1).toString()));
                    ConcurrentHashMap<String, String> concurrentHashMap = internalHashedUserData;
                    if (concurrentHashMap.containsKey(str)) {
                        String str3 = concurrentHashMap.get(str);
                        String[] strArr = null;
                        if (str3 != null) {
                            List<String> c10 = new f(DATA_SEPARATOR).c(str3, 0);
                            if (c10 != null) {
                                Object[] array = c10.toArray(new String[0]);
                                if (array != null) {
                                    strArr = (String[]) array;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        }
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                        Set d10 = m0.d(Arrays.copyOf(strArr, strArr.length));
                        if (!d10.contains(sha256hash)) {
                            StringBuilder sb = new StringBuilder();
                            if (strArr.length == 0) {
                                sb.append(sha256hash);
                            } else if (strArr.length < 5) {
                                sb.append(str3);
                                sb.append(DATA_SEPARATOR);
                                sb.append(sha256hash);
                            } else {
                                while (true) {
                                    int i12 = i10 + 1;
                                    sb.append(strArr[i10]);
                                    sb.append(DATA_SEPARATOR);
                                    if (i12 >= 5) {
                                        break;
                                    }
                                    i10 = i12;
                                }
                                sb.append(sha256hash);
                                d10.remove(strArr[0]);
                            }
                            internalHashedUserData.put(str, sb.toString());
                        } else {
                            return;
                        }
                    } else {
                        concurrentHashMap.put(str, sha256hash);
                    }
                }
                UserDataStore userDataStore2 = INSTANCE;
                Utility utility2 = Utility.INSTANCE;
                userDataStore2.writeDataIntoCache(INTERNAL_USER_DATA_KEY, Utility.mapToJsonStr(internalHashedUserData));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void setUserDataAndHash(Bundle bundle) {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(new q(bundle));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUserDataAndHash$lambda-1  reason: not valid java name */
    public static final void m40setUserDataAndHash$lambda1(Bundle bundle) {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!initialized.get()) {
                    INSTANCE.initAndWait();
                }
                UserDataStore userDataStore = INSTANCE;
                userDataStore.updateHashUserData(bundle);
                Utility utility = Utility.INSTANCE;
                userDataStore.writeDataIntoCache(USER_DATA_KEY, Utility.mapToJsonStr(externalHashedUserData));
                userDataStore.writeDataIntoCache(INTERNAL_USER_DATA_KEY, Utility.mapToJsonStr(internalHashedUserData));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void updateHashUserData(Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this) && bundle != null) {
            try {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        String obj2 = obj.toString();
                        if (maybeSHA256Hashed(obj2)) {
                            ConcurrentHashMap<String, String> concurrentHashMap = externalHashedUserData;
                            if (obj2 != null) {
                                String lowerCase = obj2.toLowerCase();
                                m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                                concurrentHashMap.put(str, lowerCase);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            Utility utility = Utility.INSTANCE;
                            m.e(str, Constants.KEY);
                            String sha256hash = Utility.sha256hash(normalizeData(str, obj2));
                            if (sha256hash != null) {
                                externalHashedUserData.put(str, sha256hash);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void writeDataIntoCache(String str, String str2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FacebookSdk.getExecutor().execute(new r(str, str2));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: writeDataIntoCache$lambda-0  reason: not valid java name */
    public static final void m41writeDataIntoCache$lambda0(String str, String str2) {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(str, "$key");
                m.f(str2, "$value");
                if (!initialized.get()) {
                    INSTANCE.initAndWait();
                }
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putString(str, str2).apply();
                } else {
                    m.x("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void setUserDataAndHash(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Bundle bundle = new Bundle();
                if (str != null) {
                    bundle.putString(EMAIL, str);
                }
                if (str2 != null) {
                    bundle.putString(FIRST_NAME, str2);
                }
                if (str3 != null) {
                    bundle.putString(LAST_NAME, str3);
                }
                if (str4 != null) {
                    bundle.putString(PHONE, str4);
                }
                if (str5 != null) {
                    bundle.putString(DATE_OF_BIRTH, str5);
                }
                if (str6 != null) {
                    bundle.putString(GENDER, str6);
                }
                if (str7 != null) {
                    bundle.putString("ct", str7);
                }
                if (str8 != null) {
                    bundle.putString("st", str8);
                }
                if (str9 != null) {
                    bundle.putString(ZIP, str9);
                }
                if (str10 != null) {
                    bundle.putString(COUNTRY, str10);
                }
                setUserDataAndHash(bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
