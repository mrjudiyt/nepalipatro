package com.facebook.appevents.suggestedevents;

import android.util.Patterns;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import g9.d;
import io.flutter.plugins.firebase.dynamiclinks.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import o8.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeatureExtractor.kt */
public final class FeatureExtractor {
    public static final FeatureExtractor INSTANCE = new FeatureExtractor();
    private static final int NUM_OF_FEATURES = 30;
    private static final String REGEX_ADD_TO_CART_BUTTON_TEXT = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart";
    private static final String REGEX_ADD_TO_CART_PAGE_TITLE = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy";
    private static final String REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)";
    private static final String REGEX_CR_HAS_LOG_IN_KEYWORDS = "(?i)(sign in)|login|signIn";
    private static final String REGEX_CR_HAS_SIGN_ON_KEYWORDS = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)";
    private static final String REGEX_CR_PASSWORD_FIELD = "password";
    private static Map<String, String> eventInfo;
    private static boolean initialized;
    private static Map<String, String> languageInfo;
    private static JSONObject rules;
    private static Map<String, String> textTypeInfo;

    private FeatureExtractor() {
    }

    public static final float[] getDenseFeatures(JSONObject jSONObject, String str) {
        Class<FeatureExtractor> cls = FeatureExtractor.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(jSONObject, "viewHierarchy");
            m.f(str, Constants.APP_NAME);
            if (!initialized) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                String lowerCase = str.toLowerCase();
                m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString(ViewHierarchyConstants.SCREEN_NAME_KEY);
                JSONArray jSONArray = new JSONArray();
                FeatureExtractor featureExtractor = INSTANCE;
                featureExtractor.pruneTree(jSONObject2, jSONArray);
                featureExtractor.sum(fArr, featureExtractor.parseFeatures(jSONObject2));
                JSONObject interactedNode = featureExtractor.getInteractedNode(jSONObject2);
                if (interactedNode == null) {
                    return null;
                }
                m.e(optString, "screenName");
                String jSONObject3 = jSONObject2.toString();
                m.e(jSONObject3, "viewTree.toString()");
                featureExtractor.sum(fArr, featureExtractor.nonparseFeatures(interactedNode, jSONArray, optString, jSONObject3, lowerCase));
                return fArr;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final JSONObject getInteractedNode(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            if (optJSONArray == null) {
                return null;
            }
            int i10 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                    m.e(jSONObject2, "children.getJSONObject(i)");
                    JSONObject interactedNode = getInteractedNode(jSONObject2);
                    if (interactedNode != null) {
                        return interactedNode;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final String getTextFeature(String str, String str2, String str3) {
        Class<FeatureExtractor> cls = FeatureExtractor.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(str, "buttonText");
            m.f(str2, "activityName");
            m.f(str3, Constants.APP_NAME);
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase();
                m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final void initialize(File file) {
        Class<FeatureExtractor> cls = FeatureExtractor.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                rules = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                rules = new JSONObject(new String(bArr, d.f14759b));
                try {
                    languageInfo = h0.f(o.a(ViewHierarchyConstants.ENGLISH, AppEventsConstants.EVENT_PARAM_VALUE_YES), o.a(ViewHierarchyConstants.GERMAN, "2"), o.a(ViewHierarchyConstants.SPANISH, "3"), o.a(ViewHierarchyConstants.JAPANESE, "4"));
                    eventInfo = h0.f(o.a(ViewHierarchyConstants.VIEW_CONTENT, AppEventsConstants.EVENT_PARAM_VALUE_NO), o.a(ViewHierarchyConstants.SEARCH, AppEventsConstants.EVENT_PARAM_VALUE_YES), o.a(ViewHierarchyConstants.ADD_TO_CART, "2"), o.a(ViewHierarchyConstants.ADD_TO_WISHLIST, "3"), o.a(ViewHierarchyConstants.INITIATE_CHECKOUT, "4"), o.a(ViewHierarchyConstants.ADD_PAYMENT_INFO, "5"), o.a(ViewHierarchyConstants.PURCHASE, "6"), o.a(ViewHierarchyConstants.LEAD, "7"), o.a(ViewHierarchyConstants.COMPLETE_REGISTRATION, "8"));
                    textTypeInfo = h0.f(o.a(ViewHierarchyConstants.BUTTON_TEXT, AppEventsConstants.EVENT_PARAM_VALUE_YES), o.a(ViewHierarchyConstants.PAGE_TITLE, "2"), o.a(ViewHierarchyConstants.RESOLVED_DOCUMENT_LINK, "3"), o.a(ViewHierarchyConstants.BUTTON_ID, "4"));
                    initialized = true;
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, cls);
                }
            } catch (Exception unused) {
            }
        }
    }

    private final boolean isButton(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY) & 1) << 5) > 0;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final boolean isInitialized() {
        Class<FeatureExtractor> cls = FeatureExtractor.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            return initialized;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    private final boolean matchIndicators(String[] strArr, String[] strArr2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                int length2 = strArr2.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        String str2 = strArr2[i11];
                        i11++;
                        if (q.y(str2, str, false, 2, (Object) null)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final float[] nonparseFeatures(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        String str4 = str2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? ((float) length) - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        m.e(jSONObject2, "siblings.getJSONObject(i)");
                        if (isButton(jSONObject2)) {
                            fArr[9] = fArr[9] + 1.0f;
                        }
                        if (i12 >= length2) {
                            break;
                        }
                        i11 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str5 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            updateHintAndTextRecursively(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            m.e(sb3, "hintSB.toString()");
            String sb4 = sb2.toString();
            m.e(sb4, "textSB.toString()");
            fArr[15] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[16] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.PAGE_TITLE, str5) ? 1.0f : 0.0f;
            fArr[17] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_ID, sb3) ? 1.0f : 0.0f;
            fArr[18] = q.y(str4, REGEX_CR_PASSWORD_FIELD, false, 2, (Object) null) ? 1.0f : 0.0f;
            fArr[19] = regexMatched(REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD, str4) ? 1.0f : 0.0f;
            fArr[20] = regexMatched(REGEX_CR_HAS_LOG_IN_KEYWORDS, str4) ? 1.0f : 0.0f;
            fArr[21] = regexMatched(REGEX_CR_HAS_SIGN_ON_KEYWORDS, str4) ? 1.0f : 0.0f;
            fArr[22] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[24] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.PAGE_TITLE, str5) ? 1.0f : 0.0f;
            fArr[25] = regexMatched(REGEX_ADD_TO_CART_BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[27] = regexMatched(REGEX_ADD_TO_CART_PAGE_TITLE, str5) ? 1.0f : 0.0f;
            fArr[28] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[29] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.PAGE_TITLE, str5) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final float[] parseFeatures(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String optString = jSONObject.optString(ViewHierarchyConstants.TEXT_KEY);
            m.e(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString(ViewHierarchyConstants.HINT_KEY);
            m.e(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            m.e(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString(ViewHierarchyConstants.CLASS_NAME_KEY);
            m.e(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            m.e(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt(ViewHierarchyConstants.INPUT_TYPE_KEY, -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (matchIndicators(new String[]{"$", "amount", FirebaseAnalytics.Param.PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (matchIndicators(new String[]{REGEX_CR_PASSWORD_FIELD, "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (matchIndicators(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (matchIndicators(new String[]{FirebaseAnalytics.Event.SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (q.y(lowerCase3, "checkbox", false, 2, (Object) null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (matchIndicators(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (q.y(lowerCase3, "radio", false, 2, (Object) null) && q.y(lowerCase3, "button", false, 2, (Object) null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        m.e(jSONObject2, "childViews.getJSONObject(i)");
                        sum(fArr, parseFeatures(jSONObject2));
                        if (i12 >= length) {
                            break;
                        }
                        i10 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean pruneTree(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        boolean z11;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (optJSONArray.getJSONObject(i10).optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                        z11 = true;
                        z10 = true;
                        break;
                    } else if (i11 >= length) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            z11 = false;
            z10 = false;
            JSONArray jSONArray2 = new JSONArray();
            if (z11) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i14);
                        m.e(jSONObject2, "child");
                        if (pruneTree(jSONObject2, jSONArray)) {
                            jSONArray2.put(jSONObject2);
                            z10 = true;
                        }
                        if (i15 >= length3) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                jSONObject.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray2);
            }
            return z10;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005c A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d A[Catch:{ all -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean regexMatched(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            org.json.JSONObject r0 = rules     // Catch:{ all -> 0x007a }
            r2 = 0
            if (r0 == 0) goto L_0x0074
            java.lang.String r3 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0017
            r5 = r2
            goto L_0x0025
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.String> r3 = languageInfo     // Catch:{ all -> 0x007a }
            if (r3 == 0) goto L_0x006e
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x007a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x007a }
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch:{ all -> 0x007a }
        L_0x0025:
            if (r5 != 0) goto L_0x0029
        L_0x0027:
            r5 = r2
            goto L_0x0040
        L_0x0029:
            java.lang.String r0 = "rulesForEvent"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch:{ all -> 0x007a }
            if (r5 != 0) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            java.util.Map<java.lang.String, java.lang.String> r0 = eventInfo     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x007a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x007a }
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ all -> 0x007a }
        L_0x0040:
            if (r5 != 0) goto L_0x0043
            goto L_0x005a
        L_0x0043:
            java.lang.String r6 = "positiveRules"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ all -> 0x007a }
            if (r5 != 0) goto L_0x004c
            goto L_0x005a
        L_0x004c:
            java.util.Map<java.lang.String, java.lang.String> r6 = textTypeInfo     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x0062
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x007a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x007a }
            java.lang.String r2 = r5.optString(r6)     // Catch:{ all -> 0x007a }
        L_0x005a:
            if (r2 != 0) goto L_0x005d
            goto L_0x0061
        L_0x005d:
            boolean r1 = r4.regexMatched(r2, r8)     // Catch:{ all -> 0x007a }
        L_0x0061:
            return r1
        L_0x0062:
            java.lang.String r5 = "textTypeInfo"
            kotlin.jvm.internal.m.x(r5)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x0068:
            java.lang.String r5 = "eventInfo"
            kotlin.jvm.internal.m.x(r5)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.lang.String r5 = "languageInfo"
            kotlin.jvm.internal.m.x(r5)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x0074:
            java.lang.String r5 = "rules"
            kotlin.jvm.internal.m.x(r5)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r5 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.suggestedevents.FeatureExtractor.regexMatched(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private final void sum(float[] fArr, float[] fArr2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            int i10 = 0;
            try {
                int length = fArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        fArr[i10] = fArr[i10] + fArr2[i10];
                        if (i11 <= length) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void updateHintAndTextRecursively(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        int length;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                String optString = jSONObject.optString(ViewHierarchyConstants.TEXT_KEY, "");
                m.e(optString, "view.optString(TEXT_KEY, \"\")");
                String lowerCase = optString.toLowerCase();
                m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                String optString2 = jSONObject.optString(ViewHierarchyConstants.HINT_KEY, "");
                m.e(optString2, "view.optString(HINT_KEY, \"\")");
                String lowerCase2 = optString2.toLowerCase();
                m.e(lowerCase2, "(this as java.lang.String).toLowerCase()");
                boolean z10 = true;
                int i10 = 0;
                if (lowerCase.length() > 0) {
                    sb.append(lowerCase);
                    sb.append(" ");
                }
                if (lowerCase2.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    sb2.append(lowerCase2);
                    sb2.append(" ");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
                if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        try {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                            m.e(jSONObject2, "currentChildView");
                            updateHintAndTextRecursively(jSONObject2, sb, sb2);
                        } catch (JSONException unused) {
                        }
                        if (i11 < length) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final boolean regexMatched(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
