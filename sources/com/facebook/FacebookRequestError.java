package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.qualityvalidation.Excuse;
import com.facebook.internal.qualityvalidation.ExcusesForDesignViolations;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

@ExcusesForDesignViolations({@Excuse(reason = "Legacy migration", type = "KOTLIN_JVM_FIELD")})
/* compiled from: FacebookRequestError.kt */
public final class FacebookRequestError implements Parcelable {
    private static final String BODY_KEY = "body";
    private static final String CODE_KEY = "code";
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new FacebookRequestError$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private static final String ERROR_CODE_FIELD_KEY = "code";
    private static final String ERROR_CODE_KEY = "error_code";
    private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";
    private static final String ERROR_KEY = "error";
    private static final String ERROR_MESSAGE_FIELD_KEY = "message";
    private static final String ERROR_MSG_KEY = "error_msg";
    private static final String ERROR_REASON_KEY = "error_reason";
    private static final String ERROR_SUB_CODE_KEY = "error_subcode";
    private static final String ERROR_TYPE_FIELD_KEY = "type";
    private static final String ERROR_USER_MSG_KEY = "error_user_msg";
    private static final String ERROR_USER_TITLE_KEY = "error_user_title";
    /* access modifiers changed from: private */
    public static final Range HTTP_RANGE_SUCCESS = new Range(200, 299);
    public static final int INVALID_ERROR_CODE = -1;
    public static final int INVALID_HTTP_STATUS_CODE = -1;
    private final Object batchRequestResult;
    private final Category category;
    private final HttpURLConnection connection;
    private final int errorCode;
    private final String errorMessage;
    private final String errorRecoveryMessage;
    private final String errorType;
    private final String errorUserMessage;
    private final String errorUserTitle;
    private FacebookException exception;
    private final JSONObject requestResult;
    private final JSONObject requestResultBody;
    private final int requestStatusCode;
    private final int subErrorCode;

    /* compiled from: FacebookRequestError.kt */
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* compiled from: FacebookRequestError.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1 A[Catch:{ JSONException -> 0x012f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.FacebookRequestError checkResponseAndCreateError(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                r19 = this;
                r9 = r20
                java.lang.String r0 = "error_code"
                java.lang.String r1 = "error"
                java.lang.String r2 = "FACEBOOK_NON_JSON_RESULT"
                java.lang.String r3 = "body"
                java.lang.String r4 = "code"
                java.lang.String r5 = "singleResult"
                kotlin.jvm.internal.m.f(r9, r5)
                r15 = 0
                boolean r5 = r9.has(r4)     // Catch:{ JSONException -> 0x012f }
                if (r5 == 0) goto L_0x012f
                int r5 = r9.getInt(r4)     // Catch:{ JSONException -> 0x012f }
                com.facebook.internal.Utility r6 = com.facebook.internal.Utility.INSTANCE     // Catch:{ JSONException -> 0x012f }
                java.lang.Object r6 = com.facebook.internal.Utility.getStringPropertyAsJSON(r9, r3, r2)     // Catch:{ JSONException -> 0x012f }
                if (r6 == 0) goto L_0x00f2
                boolean r7 = r6 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x012f }
                if (r7 == 0) goto L_0x00f2
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012f }
                boolean r7 = r7.has(r1)     // Catch:{ JSONException -> 0x012f }
                r8 = 1
                java.lang.String r10 = "error_subcode"
                r11 = 0
                r12 = -1
                if (r7 == 0) goto L_0x0085
                r0 = r6
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012f }
                java.lang.Object r0 = com.facebook.internal.Utility.getStringPropertyAsJSON(r0, r1, r15)     // Catch:{ JSONException -> 0x012f }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012f }
                if (r0 != 0) goto L_0x0043
                r1 = r15
                goto L_0x0049
            L_0x0043:
                java.lang.String r1 = "type"
                java.lang.String r1 = r0.optString(r1, r15)     // Catch:{ JSONException -> 0x012f }
            L_0x0049:
                if (r0 != 0) goto L_0x004d
                r7 = r15
                goto L_0x0053
            L_0x004d:
                java.lang.String r7 = "message"
                java.lang.String r7 = r0.optString(r7, r15)     // Catch:{ JSONException -> 0x012f }
            L_0x0053:
                if (r0 != 0) goto L_0x0057
                r4 = -1
                goto L_0x005b
            L_0x0057:
                int r4 = r0.optInt(r4, r12)     // Catch:{ JSONException -> 0x012f }
            L_0x005b:
                if (r0 != 0) goto L_0x005e
                goto L_0x0062
            L_0x005e:
                int r12 = r0.optInt(r10, r12)     // Catch:{ JSONException -> 0x012f }
            L_0x0062:
                if (r0 != 0) goto L_0x0066
                r10 = r15
                goto L_0x006c
            L_0x0066:
                java.lang.String r10 = "error_user_msg"
                java.lang.String r10 = r0.optString(r10, r15)     // Catch:{ JSONException -> 0x012f }
            L_0x006c:
                if (r0 != 0) goto L_0x0070
                r13 = r15
                goto L_0x0076
            L_0x0070:
                java.lang.String r13 = "error_user_title"
                java.lang.String r13 = r0.optString(r13, r15)     // Catch:{ JSONException -> 0x012f }
            L_0x0076:
                if (r0 != 0) goto L_0x0079
                goto L_0x007f
            L_0x0079:
                java.lang.String r14 = "is_transient"
                boolean r11 = r0.optBoolean(r14, r11)     // Catch:{ JSONException -> 0x012f }
            L_0x007f:
                r8 = r7
                r14 = r11
                r7 = r12
                r11 = 1
                r12 = r4
                goto L_0x00ce
            L_0x0085:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012f }
                boolean r1 = r1.has(r0)     // Catch:{ JSONException -> 0x012f }
                java.lang.String r4 = "error_msg"
                java.lang.String r7 = "error_reason"
                if (r1 != 0) goto L_0x00ac
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012f }
                boolean r1 = r1.has(r4)     // Catch:{ JSONException -> 0x012f }
                if (r1 != 0) goto L_0x00ac
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012f }
                boolean r1 = r1.has(r7)     // Catch:{ JSONException -> 0x012f }
                if (r1 == 0) goto L_0x00a5
                goto L_0x00ac
            L_0x00a5:
                r4 = r15
                r8 = r4
                r10 = r8
                r13 = r10
                r7 = -1
                r14 = 0
                goto L_0x00cf
            L_0x00ac:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012f }
                java.lang.String r1 = r1.optString(r7, r15)     // Catch:{ JSONException -> 0x012f }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012f }
                java.lang.String r4 = r7.optString(r4, r15)     // Catch:{ JSONException -> 0x012f }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012f }
                int r0 = r7.optInt(r0, r12)     // Catch:{ JSONException -> 0x012f }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012f }
                int r7 = r7.optInt(r10, r12)     // Catch:{ JSONException -> 0x012f }
                r12 = r0
                r8 = r4
                r10 = r15
                r13 = r10
                r11 = 1
                r14 = 0
            L_0x00ce:
                r4 = r1
            L_0x00cf:
                if (r11 == 0) goto L_0x00f2
                com.facebook.FacebookRequestError r16 = new com.facebook.FacebookRequestError     // Catch:{ JSONException -> 0x012f }
                r11 = r6
                org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch:{ JSONException -> 0x012f }
                r17 = 0
                r18 = 0
                r0 = r16
                r1 = r5
                r2 = r12
                r3 = r7
                r5 = r8
                r6 = r13
                r7 = r10
                r8 = r11
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r17
                r13 = r14
                r14 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x012f }
                return r16
            L_0x00f2:
                com.facebook.FacebookRequestError$Range r0 = r19.getHTTP_RANGE_SUCCESS$facebook_core_release()     // Catch:{ JSONException -> 0x012f }
                boolean r0 = r0.contains(r5)     // Catch:{ JSONException -> 0x012f }
                if (r0 != 0) goto L_0x012f
                com.facebook.FacebookRequestError r16 = new com.facebook.FacebookRequestError     // Catch:{ JSONException -> 0x012f }
                r4 = -1
                r6 = -1
                r7 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                boolean r0 = r9.has(r3)     // Catch:{ JSONException -> 0x012f }
                if (r0 == 0) goto L_0x0112
                java.lang.Object r0 = com.facebook.internal.Utility.getStringPropertyAsJSON(r9, r3, r2)     // Catch:{ JSONException -> 0x012f }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012f }
                r12 = r0
                goto L_0x0113
            L_0x0112:
                r12 = r15
            L_0x0113:
                r13 = 0
                r14 = 0
                r17 = 0
                r0 = r16
                r1 = r5
                r2 = r4
                r3 = r6
                r4 = r7
                r5 = r8
                r6 = r10
                r7 = r11
                r8 = r12
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r13
                r13 = r14
                r14 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x012f }
                return r16
            L_0x012f:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.Companion.checkResponseAndCreateError(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.FacebookRequestError");
        }

        public final synchronized FacebookRequestErrorClassification getErrorClassification() {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
            if (appSettingsWithoutQuery == null) {
                return FacebookRequestErrorClassification.Companion.getDefaultErrorClassification();
            }
            return appSettingsWithoutQuery.getErrorClassification();
        }

        public final Range getHTTP_RANGE_SUCCESS$facebook_core_release() {
            return FacebookRequestError.HTTP_RANGE_SUCCESS;
        }
    }

    /* compiled from: FacebookRequestError.kt */
    public static final class Range {
        private final int end;
        private final int start;

        public Range(int i10, int i11) {
            this.start = i10;
            this.end = i11;
        }

        public final boolean contains(int i10) {
            return i10 <= this.end && this.start <= i10;
        }
    }

    private FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z10) {
        boolean z11;
        Category category2;
        this.requestStatusCode = i10;
        this.errorCode = i11;
        this.subErrorCode = i12;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (facebookException != null) {
            this.exception = facebookException;
            z11 = true;
        } else {
            this.exception = new FacebookServiceException(this, getErrorMessage());
            z11 = false;
        }
        if (z11) {
            category2 = Category.OTHER;
        } else {
            category2 = Companion.getErrorClassification().classify(i11, i12, z10);
        }
        this.category = category2;
        this.errorRecoveryMessage = Companion.getErrorClassification().getRecoveryMessage(category2);
    }

    public /* synthetic */ FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z10, g gVar) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z10);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, g gVar) {
        this(parcel);
    }

    public static final FacebookRequestError checkResponseAndCreateError(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        return Companion.checkResponseAndCreateError(jSONObject, obj, httpURLConnection);
    }

    public static final synchronized FacebookRequestErrorClassification getErrorClassification() {
        FacebookRequestErrorClassification errorClassification;
        synchronized (FacebookRequestError.class) {
            errorClassification = Companion.getErrorClassification();
        }
        return errorClassification;
    }

    public int describeContents() {
        return 0;
    }

    public final Object getBatchRequestResult() {
        return this.batchRequestResult;
    }

    public final Category getCategory() {
        return this.category;
    }

    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.exception;
        if (facebookException == null) {
            return null;
        }
        return facebookException.getLocalizedMessage();
    }

    public final String getErrorRecoveryMessage() {
        return this.errorRecoveryMessage;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getErrorUserMessage() {
        return this.errorUserMessage;
    }

    public final String getErrorUserTitle() {
        return this.errorUserTitle;
    }

    public final FacebookException getException() {
        return this.exception;
    }

    public final JSONObject getRequestResult() {
        return this.requestResult;
    }

    public final JSONObject getRequestResultBody() {
        return this.requestResultBody;
    }

    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + getErrorMessage() + "}";
        m.e(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        parcel.writeInt(this.requestStatusCode);
        parcel.writeInt(this.errorCode);
        parcel.writeInt(this.subErrorCode);
        parcel.writeString(this.errorType);
        parcel.writeString(getErrorMessage());
        parcel.writeString(this.errorUserTitle);
        parcel.writeString(this.errorUserMessage);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FacebookRequestError(java.net.HttpURLConnection r17, java.lang.Exception r18) {
        /*
            r16 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.facebook.FacebookException
            if (r1 == 0) goto L_0x000a
            com.facebook.FacebookException r0 = (com.facebook.FacebookException) r0
            r14 = r0
            goto L_0x0010
        L_0x000a:
            com.facebook.FacebookException r1 = new com.facebook.FacebookException
            r1.<init>((java.lang.Throwable) r0)
            r14 = r1
        L_0x0010:
            r15 = 0
            r3 = -1
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r16
            r13 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public FacebookRequestError(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, (String) null, (String) null, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null, false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null, false);
    }
}
