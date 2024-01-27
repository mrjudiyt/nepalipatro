package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.GraphRequestBatch;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import g9.d;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GraphRequest.kt */
public final class GraphRequest {
    private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
    public static final String ACCESS_TOKEN_PARAM = "access_token";
    private static final String ATTACHED_FILES_PARAM = "attached_files";
    private static final String ATTACHMENT_FILENAME_PREFIX = "file";
    private static final String BATCH_APP_ID_PARAM = "batch_app_id";
    private static final String BATCH_BODY_PARAM = "body";
    private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
    private static final String BATCH_ENTRY_NAME_PARAM = "name";
    private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
    private static final String BATCH_METHOD_PARAM = "method";
    private static final String BATCH_PARAM = "batch";
    private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
    private static final String CAPTION_PARAM = "caption";
    private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final Companion Companion = new Companion((g) null);
    private static final String DEBUG_KEY = "__debug__";
    private static final String DEBUG_MESSAGES_KEY = "messages";
    private static final String DEBUG_MESSAGE_KEY = "message";
    private static final String DEBUG_MESSAGE_LINK_KEY = "link";
    private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
    private static final String DEBUG_PARAM = "debug";
    private static final String DEBUG_SEVERITY_INFO = "info";
    private static final String DEBUG_SEVERITY_WARNING = "warning";
    public static final String FIELDS_PARAM = "fields";
    private static final String FORMAT_JSON = "json";
    private static final String FORMAT_PARAM = "format";
    private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;
    private static final String ME = "me";
    /* access modifiers changed from: private */
    public static final String MIME_BOUNDARY;
    private static final String MY_FRIENDS = "me/friends";
    private static final String MY_PHOTOS = "me/photos";
    private static final String PICTURE_PARAM = "picture";
    private static final String SDK_ANDROID = "android";
    private static final String SDK_PARAM = "sdk";
    private static final String SEARCH = "search";
    public static final String TAG = GraphRequest.class.getSimpleName();
    private static final String USER_AGENT_BASE = "FBAndroidSDK";
    private static final String USER_AGENT_HEADER = "User-Agent";
    private static final String VIDEOS_SUFFIX = "/videos";
    /* access modifiers changed from: private */
    public static String defaultBatchApplicationId;
    /* access modifiers changed from: private */
    public static volatile String userAgent;
    /* access modifiers changed from: private */
    public static final Pattern versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private AccessToken accessToken;
    private String batchEntryDependsOn;
    private String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;
    private Callback callback;
    private boolean forceApplicationRequest;
    private JSONObject graphObject;
    private String graphPath;
    private HttpMethod httpMethod;
    private String overriddenURL;
    private Bundle parameters;
    private Object tag;
    private String version;

    /* compiled from: GraphRequest.kt */
    private static final class Attachment {
        private final GraphRequest request;
        private final Object value;

        public Attachment(GraphRequest graphRequest, Object obj) {
            m.f(graphRequest, "request");
            this.request = graphRequest;
            this.value = obj;
        }

        public final GraphRequest getRequest() {
            return this.request;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    /* compiled from: GraphRequest.kt */
    public interface Callback {
        void onCompleted(GraphResponse graphResponse);
    }

    /* compiled from: GraphRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final HttpURLConnection createConnection(URL url) {
            URLConnection openConnection = url.openConnection();
            Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty(GraphRequest.USER_AGENT_HEADER, getUserAgent());
            httpURLConnection.setRequestProperty(GraphRequest.ACCEPT_LANGUAGE_HEADER, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String getBatchAppId(GraphRequestBatch graphRequestBatch) {
            String batchApplicationId = graphRequestBatch.getBatchApplicationId();
            boolean z10 = true;
            if (batchApplicationId != null && (!graphRequestBatch.isEmpty())) {
                return batchApplicationId;
            }
            Iterator it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                AccessToken accessToken = ((GraphRequest) it.next()).getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String access$getDefaultBatchApplicationId$cp = GraphRequest.defaultBatchApplicationId;
            if (access$getDefaultBatchApplicationId$cp != null) {
                if (access$getDefaultBatchApplicationId$cp.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    return access$getDefaultBatchApplicationId$cp;
                }
            }
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            return FacebookSdk.getApplicationId();
        }

        private final String getDefaultPhotoPathIfNull(String str) {
            return str == null ? GraphRequest.MY_PHOTOS : str;
        }

        private final String getMimeContentType() {
            b0 b0Var = b0.f15559a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.MIME_BOUNDARY}, 1));
            m.e(format, "java.lang.String.format(format, *args)");
            return format;
        }

        public static /* synthetic */ void getTAG$facebook_core_release$annotations() {
        }

        private final String getUserAgent() {
            if (GraphRequest.userAgent == null) {
                b0 b0Var = b0.f15559a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{GraphRequest.USER_AGENT_BASE, FacebookSdkVersion.BUILD}, 2));
                m.e(format, "java.lang.String.format(format, *args)");
                GraphRequest.userAgent = format;
                InternalSettings internalSettings = InternalSettings.INSTANCE;
                String customUserAgent = InternalSettings.getCustomUserAgent();
                Utility utility = Utility.INSTANCE;
                if (!Utility.isNullOrEmpty(customUserAgent)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.userAgent, customUserAgent}, 2));
                    m.e(format2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.userAgent = format2;
                }
            }
            return GraphRequest.userAgent;
        }

        private final boolean hasOnProgressCallbacks(GraphRequestBatch graphRequestBatch) {
            for (GraphRequestBatch.Callback callback : graphRequestBatch.getCallbacks()) {
                if (callback instanceof GraphRequestBatch.OnProgressCallback) {
                    return true;
                }
            }
            Iterator it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                if (((GraphRequest) it.next()).getCallback() instanceof OnProgressCallback) {
                    return true;
                }
            }
            return false;
        }

        private final boolean isGzipCompressible(GraphRequestBatch graphRequestBatch) {
            Iterator it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                Iterator it2 = graphRequest.getParameters().keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (isSupportedAttachmentType(graphRequest.getParameters().get((String) it2.next()))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        private final boolean isMeRequest(String str) {
            Matcher matcher = GraphRequest.versionPattern.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                m.e(str, "matcher.group(1)");
            }
            if (p.v(str, "me/", false, 2, (Object) null) || p.v(str, "/me/", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean isSupportedAttachmentType(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* access modifiers changed from: private */
        public final boolean isSupportedParameterType(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* access modifiers changed from: private */
        /* renamed from: newMeRequest$lambda-0  reason: not valid java name */
        public static final void m16newMeRequest$lambda0(GraphJSONObjectCallback graphJSONObjectCallback, GraphResponse graphResponse) {
            m.f(graphResponse, "response");
            if (graphJSONObjectCallback != null) {
                graphJSONObjectCallback.onCompleted(graphResponse.getJSONObject(), graphResponse);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: newPlacesSearchRequest$lambda-1  reason: not valid java name */
        public static final void m17newPlacesSearchRequest$lambda1(GraphJSONArrayCallback graphJSONArrayCallback, GraphResponse graphResponse) {
            JSONArray jSONArray;
            m.f(graphResponse, "response");
            if (graphJSONArrayCallback != null) {
                JSONObject jSONObject = graphResponse.getJSONObject();
                if (jSONObject == null) {
                    jSONArray = null;
                } else {
                    jSONArray = jSONObject.optJSONArray("data");
                }
                graphJSONArrayCallback.onCompleted(jSONArray, graphResponse);
            }
        }

        /* access modifiers changed from: private */
        public final String parameterToString(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
                m.e(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void processGraphObject(org.json.JSONObject r10, java.lang.String r11, com.facebook.GraphRequest.KeyValueSerializer r12) {
            /*
                r9 = this;
                boolean r0 = r9.isMeRequest(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0023
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r3 = r11
                int r0 = g9.q.H(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = g9.q.H(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L_0x0023
                r3 = -1
                if (r11 == r3) goto L_0x0021
                if (r0 >= r11) goto L_0x0023
            L_0x0021:
                r11 = 1
                goto L_0x0024
            L_0x0023:
                r11 = 0
            L_0x0024:
                java.util.Iterator r0 = r10.keys()
            L_0x0028:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0053
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L_0x0044
                java.lang.String r5 = "image"
                boolean r5 = g9.p.m(r3, r5, r1)
                if (r5 == 0) goto L_0x0044
                r5 = 1
                goto L_0x0045
            L_0x0044:
                r5 = 0
            L_0x0045:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.m.e(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.m.e(r4, r6)
                r9.processGraphObjectProperty(r3, r4, r12, r5)
                goto L_0x0028
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.Companion.processGraphObject(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$KeyValueSerializer):void");
        }

        private final void processGraphObjectProperty(String str, Object obj, KeyValueSerializer keyValueSerializer, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b0 b0Var = b0.f15559a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        m.e(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        m.e(opt, "jsonObject.opt(propertyName)");
                        processGraphObjectProperty(format, opt, keyValueSerializer, z10);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    m.e(optString, "jsonObject.optString(\"id\")");
                    processGraphObjectProperty(str, optString, keyValueSerializer, z10);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    m.e(optString2, "jsonObject.optString(\"url\")");
                    processGraphObjectProperty(str, optString2, keyValueSerializer, z10);
                } else if (jSONObject.has(NativeProtocol.OPEN_GRAPH_CREATE_OBJECT_KEY)) {
                    String jSONObject2 = jSONObject.toString();
                    m.e(jSONObject2, "jsonObject.toString()");
                    processGraphObjectProperty(str, jSONObject2, keyValueSerializer, z10);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        b0 b0Var2 = b0.f15559a;
                        String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                        m.e(format2, "java.lang.String.format(locale, format, *args)");
                        Object opt2 = jSONArray.opt(i10);
                        m.e(opt2, "jsonArray.opt(i)");
                        processGraphObjectProperty(format2, opt2, keyValueSerializer, z10);
                        if (i11 < length) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                keyValueSerializer.writeString(str, obj.toString());
            } else if (Date.class.isAssignableFrom(cls)) {
                String format3 = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
                m.e(format3, "iso8601DateFormat.format(date)");
                keyValueSerializer.writeString(str, format3);
            } else {
                Utility utility = Utility.INSTANCE;
                String str2 = GraphRequest.TAG;
                Utility.logd(str2, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
            }
        }

        private final void processRequest(GraphRequestBatch graphRequestBatch, Logger logger, int i10, URL url, OutputStream outputStream, boolean z10) {
            Serializer serializer = new Serializer(outputStream, logger, z10);
            boolean z11 = false;
            if (i10 == 1) {
                GraphRequest graphRequest = graphRequestBatch.get(0);
                HashMap hashMap = new HashMap();
                for (String str : graphRequest.getParameters().keySet()) {
                    Object obj = graphRequest.getParameters().get(str);
                    if (isSupportedAttachmentType(obj)) {
                        m.e(str, Constants.KEY);
                        hashMap.put(str, new Attachment(graphRequest, obj));
                    }
                }
                if (logger != null) {
                    logger.append("  Parameters:\n");
                }
                serializeParameters(graphRequest.getParameters(), serializer, graphRequest);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                serializeAttachments(hashMap, serializer);
                JSONObject graphObject = graphRequest.getGraphObject();
                if (graphObject != null) {
                    String path = url.getPath();
                    m.e(path, "url.path");
                    processGraphObject(graphObject, path, serializer);
                    return;
                }
                return;
            }
            String batchAppId = getBatchAppId(graphRequestBatch);
            if (batchAppId.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                serializer.writeString(GraphRequest.BATCH_APP_ID_PARAM, batchAppId);
                HashMap hashMap2 = new HashMap();
                serializeRequestsAsJSON(serializer, graphRequestBatch, hashMap2);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                serializeAttachments(hashMap2, serializer);
                return;
            }
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }

        /* access modifiers changed from: private */
        /* renamed from: runCallbacks$lambda-2  reason: not valid java name */
        public static final void m18runCallbacks$lambda2(ArrayList arrayList, GraphRequestBatch graphRequestBatch) {
            m.f(arrayList, "$callbacks");
            m.f(graphRequestBatch, "$requests");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.second;
                m.e(obj, "pair.second");
                ((Callback) pair.first).onCompleted((GraphResponse) obj);
            }
            for (GraphRequestBatch.Callback onBatchCompleted : graphRequestBatch.getCallbacks()) {
                onBatchCompleted.onBatchCompleted(graphRequestBatch);
            }
        }

        private final void serializeAttachments(Map<String, Attachment> map, Serializer serializer) {
            for (Map.Entry next : map.entrySet()) {
                if (GraphRequest.Companion.isSupportedAttachmentType(((Attachment) next.getValue()).getValue())) {
                    serializer.writeObject((String) next.getKey(), ((Attachment) next.getValue()).getValue(), ((Attachment) next.getValue()).getRequest());
                }
            }
        }

        private final void serializeParameters(Bundle bundle, Serializer serializer, GraphRequest graphRequest) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (isSupportedParameterType(obj)) {
                    m.e(str, Constants.KEY);
                    serializer.writeObject(str, obj, graphRequest);
                }
            }
        }

        private final void serializeRequestsAsJSON(Serializer serializer, Collection<GraphRequest> collection, Map<String, Attachment> map) {
            JSONArray jSONArray = new JSONArray();
            for (GraphRequest access$serializeToBatch : collection) {
                access$serializeToBatch.serializeToBatch(jSONArray, map);
            }
            serializer.writeRequestsAsJson(GraphRequest.BATCH_PARAM, jSONArray, collection);
        }

        private final void setConnectionContentType(HttpURLConnection httpURLConnection, boolean z10) {
            if (z10) {
                httpURLConnection.setRequestProperty(GraphRequest.CONTENT_TYPE_HEADER, "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty(GraphRequest.CONTENT_ENCODING_HEADER, "gzip");
                return;
            }
            httpURLConnection.setRequestProperty(GraphRequest.CONTENT_TYPE_HEADER, getMimeContentType());
        }

        public final GraphResponse executeAndWait(GraphRequest graphRequest) {
            m.f(graphRequest, "request");
            List<GraphResponse> executeBatchAndWait = executeBatchAndWait(graphRequest);
            if (executeBatchAndWait.size() == 1) {
                return executeBatchAndWait.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        public final List<GraphResponse> executeBatchAndWait(GraphRequest... graphRequestArr) {
            m.f(graphRequestArr, "requests");
            return executeBatchAndWait((Collection<GraphRequest>) k.y(graphRequestArr));
        }

        public final GraphRequestAsyncTask executeBatchAsync(GraphRequest... graphRequestArr) {
            m.f(graphRequestArr, "requests");
            return executeBatchAsync((Collection<GraphRequest>) k.y(graphRequestArr));
        }

        public final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, Collection<GraphRequest> collection) {
            m.f(httpURLConnection, "connection");
            m.f(collection, "requests");
            return executeConnectionAndWait(httpURLConnection, new GraphRequestBatch(collection));
        }

        public final GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            m.f(httpURLConnection, "connection");
            m.f(graphRequestBatch, "requests");
            return executeConnectionAsync((Handler) null, httpURLConnection, graphRequestBatch);
        }

        public final String getDefaultBatchApplicationId() {
            return GraphRequest.defaultBatchApplicationId;
        }

        public final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, String str, Callback callback) {
            String str2;
            m.f(context, "context");
            if (str == null && accessToken != null) {
                str = accessToken.getApplicationId();
            }
            if (str == null) {
                Utility utility = Utility.INSTANCE;
                str = Utility.getMetadataApplicationId(context);
            }
            if (str != null) {
                String o10 = m.o(str, "/custom_audience_third_party_id");
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(context);
                Bundle bundle = new Bundle();
                if (accessToken == null) {
                    if (attributionIdentifiers != null) {
                        if (attributionIdentifiers.getAttributionId() != null) {
                            str2 = attributionIdentifiers.getAttributionId();
                        } else {
                            str2 = attributionIdentifiers.getAndroidAdvertiserId();
                        }
                        if (str2 != null) {
                            bundle.putString("udid", str2);
                        }
                    } else {
                        throw new FacebookException("There is no access token and attribution identifiers could not be retrieved");
                    }
                }
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                if (FacebookSdk.getLimitEventAndDataUsage(context) || (attributionIdentifiers != null && attributionIdentifiers.isTrackingLimited())) {
                    bundle.putString("limit_event_usage", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                }
                return new GraphRequest(accessToken, o10, bundle, HttpMethod.GET, callback, (String) null, 32, (g) null);
            }
            throw new FacebookException("Facebook App ID cannot be determined");
        }

        public final GraphRequest newDeleteObjectRequest(AccessToken accessToken, String str, Callback callback) {
            return new GraphRequest(accessToken, str, (Bundle) null, HttpMethod.DELETE, callback, (String) null, 32, (g) null);
        }

        public final GraphRequest newGraphPathRequest(AccessToken accessToken, String str, Callback callback) {
            return new GraphRequest(accessToken, str, (Bundle) null, (HttpMethod) null, callback, (String) null, 32, (g) null);
        }

        public final GraphRequest newMeRequest(AccessToken accessToken, GraphJSONObjectCallback graphJSONObjectCallback) {
            return new GraphRequest(accessToken, GraphRequest.ME, (Bundle) null, (HttpMethod) null, new r(graphJSONObjectCallback), (String) null, 32, (g) null);
        }

        public final GraphRequest newMyFriendsRequest(AccessToken accessToken, GraphJSONArrayCallback graphJSONArrayCallback) {
            return new GraphRequest(accessToken, GraphRequest.MY_FRIENDS, (Bundle) null, (HttpMethod) null, new GraphRequest$Companion$newMyFriendsRequest$wrapper$1(graphJSONArrayCallback), (String) null, 32, (g) null);
        }

        public final GraphRequest newPlacesSearchRequest(AccessToken accessToken, Location location, int i10, int i11, String str, GraphJSONArrayCallback graphJSONArrayCallback) {
            if (location == null) {
                Utility utility = Utility.INSTANCE;
                if (Utility.isNullOrEmpty(str)) {
                    throw new FacebookException("Either location or searchText must be specified.");
                }
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", i11);
            if (location != null) {
                b0 b0Var = b0.f15559a;
                String format = String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
                m.e(format, "java.lang.String.format(locale, format, *args)");
                bundle.putString("center", format);
                bundle.putInt("distance", i10);
            }
            Utility utility2 = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(str)) {
                bundle.putString("q", str);
            }
            return new GraphRequest(accessToken, "search", bundle, HttpMethod.GET, new q(graphJSONArrayCallback), (String) null, 32, (g) null);
        }

        public final GraphRequest newPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, Callback callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, (Bundle) null, HttpMethod.POST, callback, (String) null, 32, (g) null);
            graphRequest.setGraphObject(jSONObject);
            return graphRequest;
        }

        public final GraphRequest newPostRequestWithBundle(AccessToken accessToken, String str, Bundle bundle, Callback callback) {
            return new GraphRequest(accessToken, str, bundle, HttpMethod.POST, callback, (String) null, 32, (g) null);
        }

        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Bitmap bitmap, String str2, Bundle bundle, Callback callback) {
            Bitmap bitmap2 = bitmap;
            String str3 = str2;
            Bundle bundle2 = bundle;
            m.f(bitmap2, "image");
            Bundle bundle3 = new Bundle();
            if (bundle2 != null) {
                bundle3.putAll(bundle2);
            }
            bundle3.putParcelable("picture", bitmap2);
            if (str3 != null) {
                if (str2.length() > 0) {
                    bundle3.putString("caption", str3);
                }
            }
            String str4 = str;
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle3, HttpMethod.POST, callback, (String) null, 32, (g) null);
        }

        public final void runCallbacks$facebook_core_release(GraphRequestBatch graphRequestBatch, List<GraphResponse> list) {
            Boolean bool;
            m.f(graphRequestBatch, "requests");
            m.f(list, "responses");
            int size = graphRequestBatch.size();
            ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    GraphRequest graphRequest = graphRequestBatch.get(i10);
                    if (graphRequest.getCallback() != null) {
                        arrayList.add(new Pair(graphRequest.getCallback(), list.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    }
                    i10 = i11;
                }
            }
            if (arrayList.size() > 0) {
                s sVar = new s(arrayList, graphRequestBatch);
                Handler callbackHandler = graphRequestBatch.getCallbackHandler();
                if (callbackHandler == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(callbackHandler.post(sVar));
                }
                if (bool == null) {
                    sVar.run();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void serializeToUrlConnection$facebook_core_release(com.facebook.GraphRequestBatch r14, java.net.HttpURLConnection r15) {
            /*
                r13 = this;
                java.lang.String r0 = "requests"
                kotlin.jvm.internal.m.f(r14, r0)
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.m.f(r15, r0)
                com.facebook.internal.Logger r0 = new com.facebook.internal.Logger
                com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.REQUESTS
                java.lang.String r2 = "Request"
                r0.<init>(r1, r2)
                int r10 = r14.size()
                boolean r11 = r13.isGzipCompressible(r14)
                r1 = 0
                r2 = 0
                r3 = 1
                if (r10 != r3) goto L_0x0029
                com.facebook.GraphRequest r4 = r14.get((int) r1)
                com.facebook.HttpMethod r4 = r4.getHttpMethod()
                goto L_0x002a
            L_0x0029:
                r4 = r2
            L_0x002a:
                if (r4 != 0) goto L_0x002e
                com.facebook.HttpMethod r4 = com.facebook.HttpMethod.POST
            L_0x002e:
                java.lang.String r5 = r4.name()
                r15.setRequestMethod(r5)
                r13.setConnectionContentType(r15, r11)
                java.net.URL r12 = r15.getURL()
                java.lang.String r5 = "Request:\n"
                r0.append((java.lang.String) r5)
                java.lang.String r5 = r14.getId()
                java.lang.String r6 = "Id"
                r0.appendKeyValue(r6, r5)
                java.lang.String r5 = "url"
                kotlin.jvm.internal.m.e(r12, r5)
                java.lang.String r5 = "URL"
                r0.appendKeyValue(r5, r12)
                java.lang.String r5 = r15.getRequestMethod()
                java.lang.String r6 = "connection.requestMethod"
                kotlin.jvm.internal.m.e(r5, r6)
                java.lang.String r6 = "Method"
                r0.appendKeyValue(r6, r5)
                java.lang.String r5 = "User-Agent"
                java.lang.String r6 = r15.getRequestProperty(r5)
                java.lang.String r7 = "connection.getRequestProperty(\"User-Agent\")"
                kotlin.jvm.internal.m.e(r6, r7)
                r0.appendKeyValue(r5, r6)
                java.lang.String r5 = "Content-Type"
                java.lang.String r6 = r15.getRequestProperty(r5)
                java.lang.String r7 = "connection.getRequestProperty(\"Content-Type\")"
                kotlin.jvm.internal.m.e(r6, r7)
                r0.appendKeyValue(r5, r6)
                int r5 = r14.getTimeout()
                r15.setConnectTimeout(r5)
                int r5 = r14.getTimeout()
                r15.setReadTimeout(r5)
                com.facebook.HttpMethod r5 = com.facebook.HttpMethod.POST
                if (r4 != r5) goto L_0x0091
                r1 = 1
            L_0x0091:
                if (r1 != 0) goto L_0x0097
                r0.log()
                return
            L_0x0097:
                r15.setDoOutput(r3)
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00ee }
                java.io.OutputStream r15 = r15.getOutputStream()     // Catch:{ all -> 0x00ee }
                r1.<init>(r15)     // Catch:{ all -> 0x00ee }
                if (r11 == 0) goto L_0x00ae
                java.util.zip.GZIPOutputStream r15 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00ab }
                r15.<init>(r1)     // Catch:{ all -> 0x00ab }
                goto L_0x00af
            L_0x00ab:
                r14 = move-exception
                r2 = r1
                goto L_0x00ef
            L_0x00ae:
                r15 = r1
            L_0x00af:
                boolean r1 = r13.hasOnProgressCallbacks(r14)     // Catch:{ all -> 0x00eb }
                if (r1 == 0) goto L_0x00da
                com.facebook.ProgressNoopOutputStream r1 = new com.facebook.ProgressNoopOutputStream     // Catch:{ all -> 0x00eb }
                android.os.Handler r2 = r14.getCallbackHandler()     // Catch:{ all -> 0x00eb }
                r1.<init>(r2)     // Catch:{ all -> 0x00eb }
                r5 = 0
                r3 = r13
                r4 = r14
                r6 = r10
                r7 = r12
                r8 = r1
                r9 = r11
                r3.processRequest(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00eb }
                int r2 = r1.getMaxProgress()     // Catch:{ all -> 0x00eb }
                java.util.Map r5 = r1.getProgressMap()     // Catch:{ all -> 0x00eb }
                com.facebook.ProgressOutputStream r1 = new com.facebook.ProgressOutputStream     // Catch:{ all -> 0x00eb }
                long r6 = (long) r2     // Catch:{ all -> 0x00eb }
                r2 = r1
                r3 = r15
                r4 = r14
                r2.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x00eb }
                r15 = r1
            L_0x00da:
                r1 = r13
                r2 = r14
                r3 = r0
                r4 = r10
                r5 = r12
                r6 = r15
                r7 = r11
                r1.processRequest(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00eb }
                r15.close()
                r0.log()
                return
            L_0x00eb:
                r14 = move-exception
                r2 = r15
                goto L_0x00ef
            L_0x00ee:
                r14 = move-exception
            L_0x00ef:
                if (r2 != 0) goto L_0x00f2
                goto L_0x00f5
            L_0x00f2:
                r2.close()
            L_0x00f5:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.Companion.serializeToUrlConnection$facebook_core_release(com.facebook.GraphRequestBatch, java.net.HttpURLConnection):void");
        }

        public final void setDefaultBatchApplicationId(String str) {
            GraphRequest.defaultBatchApplicationId = str;
        }

        public final HttpURLConnection toHttpConnection(GraphRequest... graphRequestArr) {
            m.f(graphRequestArr, "requests");
            return toHttpConnection((Collection<GraphRequest>) k.y(graphRequestArr));
        }

        public final void validateFieldsParamForGetRequests$facebook_core_release(GraphRequestBatch graphRequestBatch) {
            m.f(graphRequestBatch, "requests");
            Iterator it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                if (HttpMethod.GET == graphRequest.getHttpMethod()) {
                    Utility utility = Utility.INSTANCE;
                    if (Utility.isNullOrEmpty(graphRequest.getParameters().getString(GraphRequest.FIELDS_PARAM))) {
                        Logger.Companion companion = Logger.Companion;
                        LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder();
                        sb.append("GET requests for /");
                        String graphPath = graphRequest.getGraphPath();
                        if (graphPath == null) {
                            graphPath = "";
                        }
                        sb.append(graphPath);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        companion.log(loggingBehavior, 5, "Request", sb.toString());
                    }
                }
            }
        }

        public final List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> collection) {
            m.f(collection, "requests");
            return executeBatchAndWait(new GraphRequestBatch(collection));
        }

        public final GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> collection) {
            m.f(collection, "requests");
            return executeBatchAsync(new GraphRequestBatch(collection));
        }

        public final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            m.f(httpURLConnection, "connection");
            m.f(graphRequestBatch, "requests");
            List<GraphResponse> fromHttpConnection$facebook_core_release = GraphResponse.Companion.fromHttpConnection$facebook_core_release(httpURLConnection, graphRequestBatch);
            Utility utility = Utility.INSTANCE;
            Utility.disconnectQuietly(httpURLConnection);
            int size = graphRequestBatch.size();
            if (size == fromHttpConnection$facebook_core_release.size()) {
                runCallbacks$facebook_core_release(graphRequestBatch, fromHttpConnection$facebook_core_release);
                AccessTokenManager.Companion.getInstance().extendAccessTokenIfNeeded();
                return fromHttpConnection$facebook_core_release;
            }
            b0 b0Var = b0.f15559a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(fromHttpConnection$facebook_core_release.size()), Integer.valueOf(size)}, 2));
            m.e(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }

        public final GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            m.f(httpURLConnection, "connection");
            m.f(graphRequestBatch, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(httpURLConnection, graphRequestBatch);
            graphRequestBatch.setCallbackHandler(handler);
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        public final HttpURLConnection toHttpConnection(Collection<GraphRequest> collection) {
            m.f(collection, "requests");
            Validate validate = Validate.INSTANCE;
            Validate.notEmpty(collection, "requests");
            return toHttpConnection(new GraphRequestBatch(collection));
        }

        public final List<GraphResponse> executeBatchAndWait(GraphRequestBatch graphRequestBatch) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<GraphResponse> list;
            m.f(graphRequestBatch, "requests");
            Validate validate = Validate.INSTANCE;
            Validate.notEmptyAndContainsNoNulls(graphRequestBatch, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = toHttpConnection(graphRequestBatch);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                Utility utility = Utility.INSTANCE;
                Utility.disconnectQuietly(httpURLConnection2);
                throw th;
            }
            if (httpURLConnection != null) {
                try {
                    list = executeConnectionAndWait(httpURLConnection, graphRequestBatch);
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    Utility utility2 = Utility.INSTANCE;
                    Utility.disconnectQuietly(httpURLConnection2);
                    throw th;
                }
            } else {
                List<GraphResponse> constructErrorResponses = GraphResponse.Companion.constructErrorResponses(graphRequestBatch.getRequests(), (HttpURLConnection) null, new FacebookException((Throwable) exc));
                runCallbacks$facebook_core_release(graphRequestBatch, constructErrorResponses);
                list = constructErrorResponses;
            }
            Utility utility3 = Utility.INSTANCE;
            Utility.disconnectQuietly(httpURLConnection);
            return list;
        }

        public final GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphRequestBatch) {
            m.f(graphRequestBatch, "requests");
            Validate validate = Validate.INSTANCE;
            Validate.notEmptyAndContainsNoNulls(graphRequestBatch, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(graphRequestBatch);
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        public final HttpURLConnection toHttpConnection(GraphRequestBatch graphRequestBatch) {
            URL url;
            m.f(graphRequestBatch, "requests");
            validateFieldsParamForGetRequests$facebook_core_release(graphRequestBatch);
            try {
                if (graphRequestBatch.size() == 1) {
                    url = new URL(graphRequestBatch.get(0).getUrlForSingleRequest());
                } else {
                    ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
                    url = new URL(ServerProtocol.getGraphUrlBase());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = createConnection(url);
                    serializeToUrlConnection$facebook_core_release(graphRequestBatch, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    Utility utility = Utility.INSTANCE;
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", (Throwable) e10);
                } catch (JSONException e11) {
                    Utility utility2 = Utility.INSTANCE;
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", (Throwable) e11);
                }
            } catch (MalformedURLException e12) {
                throw new FacebookException("could not construct URL for request", (Throwable) e12);
            }
        }

        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, File file, String str2, Bundle bundle, Callback callback) {
            m.f(file, "file");
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", open);
            if (str2 != null) {
                if (str2.length() > 0) {
                    bundle2.putString("caption", str2);
                }
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, (String) null, 32, (g) null);
        }

        public final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, Callback callback) {
            m.f(context, "context");
            return newCustomAudienceThirdPartyIdRequest(accessToken, context, (String) null, callback);
        }

        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Uri uri, String str2, Bundle bundle, Callback callback) {
            Uri uri2 = uri;
            String str3 = str2;
            Bundle bundle2 = bundle;
            m.f(uri, "photoUri");
            Utility utility = Utility.INSTANCE;
            if (Utility.isFileUri(uri)) {
                return newUploadPhotoRequest(accessToken, str, new File(uri.getPath()), str2, bundle, callback);
            } else if (Utility.isContentUri(uri)) {
                Bundle bundle3 = new Bundle();
                if (bundle2 != null) {
                    bundle3.putAll(bundle2);
                }
                bundle3.putParcelable("picture", uri);
                if (str3 != null) {
                    if (str2.length() > 0) {
                        bundle3.putString("caption", str3);
                    }
                }
                String str4 = str;
                return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle3, HttpMethod.POST, callback, (String) null, 32, (g) null);
            } else {
                throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
            }
        }
    }

    /* compiled from: GraphRequest.kt */
    public interface GraphJSONArrayCallback {
        void onCompleted(JSONArray jSONArray, GraphResponse graphResponse);
    }

    /* compiled from: GraphRequest.kt */
    public interface GraphJSONObjectCallback {
        void onCompleted(JSONObject jSONObject, GraphResponse graphResponse);
    }

    /* compiled from: GraphRequest.kt */
    private interface KeyValueSerializer {
        void writeString(String str, String str2);
    }

    /* compiled from: GraphRequest.kt */
    public interface OnProgressCallback extends Callback {
        void onProgress(long j10, long j11);
    }

    /* compiled from: GraphRequest.kt */
    private static final class Serializer implements KeyValueSerializer {
        private boolean firstWrite = true;
        private final Logger logger;
        private final OutputStream outputStream;
        private final boolean useUrlEncode;

        public Serializer(OutputStream outputStream2, Logger logger2, boolean z10) {
            m.f(outputStream2, "outputStream");
            this.outputStream = outputStream2;
            this.logger = logger2;
            this.useUrlEncode = z10;
        }

        private final RuntimeException getInvalidTypeError() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void write(String str, Object... objArr) {
            m.f(str, GraphRequest.FORMAT_PARAM);
            m.f(objArr, "args");
            if (!this.useUrlEncode) {
                if (this.firstWrite) {
                    OutputStream outputStream2 = this.outputStream;
                    Charset charset = d.f14759b;
                    byte[] bytes = "--".getBytes(charset);
                    m.e(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream2.write(bytes);
                    OutputStream outputStream3 = this.outputStream;
                    String access$getMIME_BOUNDARY$cp = GraphRequest.MIME_BOUNDARY;
                    Objects.requireNonNull(access$getMIME_BOUNDARY$cp, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes2 = access$getMIME_BOUNDARY$cp.getBytes(charset);
                    m.e(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream3.write(bytes2);
                    OutputStream outputStream4 = this.outputStream;
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    m.e(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream4.write(bytes3);
                    this.firstWrite = false;
                }
                OutputStream outputStream5 = this.outputStream;
                b0 b0Var = b0.f15559a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                m.e(format, "java.lang.String.format(format, *args)");
                Charset charset2 = d.f14759b;
                Objects.requireNonNull(format, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes4 = format.getBytes(charset2);
                m.e(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream5.write(bytes4);
                return;
            }
            OutputStream outputStream6 = this.outputStream;
            b0 b0Var2 = b0.f15559a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            m.e(format2, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format2, "UTF-8");
            m.e(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(d.f14759b);
            m.e(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream6.write(bytes5);
        }

        public final void writeBitmap(String str, Bitmap bitmap) {
            m.f(str, Constants.KEY);
            m.f(bitmap, "bitmap");
            writeContentDisposition(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger2 = this.logger;
            if (logger2 != null) {
                logger2.appendKeyValue(m.o("    ", str), "<Image>");
            }
        }

        public final void writeBytes(String str, byte[] bArr) {
            m.f(str, Constants.KEY);
            m.f(bArr, "bytes");
            writeContentDisposition(str, str, "content/unknown");
            this.outputStream.write(bArr);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger2 = this.logger;
            if (logger2 != null) {
                String o10 = m.o("    ", str);
                b0 b0Var = b0.f15559a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                m.e(format, "java.lang.String.format(locale, format, *args)");
                logger2.appendKeyValue(o10, format);
            }
        }

        public final void writeContentDisposition(String str, String str2, String str3) {
            if (!this.useUrlEncode) {
                write("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    write("; filename=\"%s\"", str2);
                }
                writeLine("", new Object[0]);
                if (str3 != null) {
                    writeLine("%s: %s", GraphRequest.CONTENT_TYPE_HEADER, str3);
                }
                writeLine("", new Object[0]);
                return;
            }
            OutputStream outputStream2 = this.outputStream;
            b0 b0Var = b0.f15559a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            m.e(format, "java.lang.String.format(format, *args)");
            Charset charset = d.f14759b;
            Objects.requireNonNull(format, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = format.getBytes(charset);
            m.e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream2.write(bytes);
        }

        public final void writeContentUri(String str, Uri uri, String str2) {
            int i10;
            m.f(str, Constants.KEY);
            m.f(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            writeContentDisposition(str, str, str2);
            if (this.outputStream instanceof ProgressNoopOutputStream) {
                Utility utility = Utility.INSTANCE;
                ((ProgressNoopOutputStream) this.outputStream).addProgress(Utility.getContentSize(uri));
                i10 = 0;
            } else {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                InputStream openInputStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri);
                Utility utility2 = Utility.INSTANCE;
                i10 = Utility.copyAndCloseInputStream(openInputStream, this.outputStream) + 0;
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger2 = this.logger;
            if (logger2 != null) {
                String o10 = m.o("    ", str);
                b0 b0Var = b0.f15559a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                m.e(format, "java.lang.String.format(locale, format, *args)");
                logger2.appendKeyValue(o10, format);
            }
        }

        public final void writeFile(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i10;
            m.f(str, Constants.KEY);
            m.f(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            writeContentDisposition(str, str, str2);
            OutputStream outputStream2 = this.outputStream;
            if (outputStream2 instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream2).addProgress(parcelFileDescriptor.getStatSize());
                i10 = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                Utility utility = Utility.INSTANCE;
                i10 = Utility.copyAndCloseInputStream(autoCloseInputStream, this.outputStream) + 0;
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger2 = this.logger;
            if (logger2 != null) {
                String o10 = m.o("    ", str);
                b0 b0Var = b0.f15559a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                m.e(format, "java.lang.String.format(locale, format, *args)");
                logger2.appendKeyValue(o10, format);
            }
        }

        public final void writeLine(String str, Object... objArr) {
            m.f(str, GraphRequest.FORMAT_PARAM);
            m.f(objArr, "args");
            write(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.useUrlEncode) {
                write("\r\n", new Object[0]);
            }
        }

        public final void writeObject(String str, Object obj, GraphRequest graphRequest) {
            m.f(str, Constants.KEY);
            OutputStream outputStream2 = this.outputStream;
            if (outputStream2 instanceof RequestOutputStream) {
                ((RequestOutputStream) outputStream2).setCurrentRequest(graphRequest);
            }
            Companion companion = GraphRequest.Companion;
            if (companion.isSupportedParameterType(obj)) {
                writeString(str, companion.parameterToString(obj));
            } else if (obj instanceof Bitmap) {
                writeBitmap(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                writeBytes(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                writeContentUri(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                writeFile(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable resource = parcelableResourceWithMimeType.getResource();
                String mimeType = parcelableResourceWithMimeType.getMimeType();
                if (resource instanceof ParcelFileDescriptor) {
                    writeFile(str, (ParcelFileDescriptor) resource, mimeType);
                } else if (resource instanceof Uri) {
                    writeContentUri(str, (Uri) resource, mimeType);
                } else {
                    throw getInvalidTypeError();
                }
            } else {
                throw getInvalidTypeError();
            }
        }

        public final void writeRecordBoundary() {
            if (!this.useUrlEncode) {
                writeLine("--%s", GraphRequest.MIME_BOUNDARY);
                return;
            }
            OutputStream outputStream2 = this.outputStream;
            byte[] bytes = "&".getBytes(d.f14759b);
            m.e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream2.write(bytes);
        }

        public final void writeRequestsAsJson(String str, JSONArray jSONArray, Collection<GraphRequest> collection) {
            m.f(str, Constants.KEY);
            m.f(jSONArray, "requestJsonArray");
            m.f(collection, "requests");
            OutputStream outputStream2 = this.outputStream;
            if (!(outputStream2 instanceof RequestOutputStream)) {
                String jSONArray2 = jSONArray.toString();
                m.e(jSONArray2, "requestJsonArray.toString()");
                writeString(str, jSONArray2);
                return;
            }
            RequestOutputStream requestOutputStream = (RequestOutputStream) outputStream2;
            writeContentDisposition(str, (String) null, (String) null);
            write("[", new Object[0]);
            int i10 = 0;
            for (GraphRequest currentRequest : collection) {
                int i11 = i10 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                requestOutputStream.setCurrentRequest(currentRequest);
                if (i10 > 0) {
                    write(",%s", jSONObject.toString());
                } else {
                    write("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            write("]", new Object[0]);
            Logger logger2 = this.logger;
            if (logger2 != null) {
                String o10 = m.o("    ", str);
                String jSONArray3 = jSONArray.toString();
                m.e(jSONArray3, "requestJsonArray.toString()");
                logger2.appendKeyValue(o10, jSONArray3);
            }
        }

        public void writeString(String str, String str2) {
            m.f(str, Constants.KEY);
            m.f(str2, "value");
            writeContentDisposition(str, (String) null, (String) null);
            writeLine("%s", str2);
            writeRecordBoundary();
            Logger logger2 = this.logger;
            if (logger2 != null) {
                logger2.appendKeyValue(m.o("    ", str), str2);
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        m.e(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i10 = 0;
            do {
                i10++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i10 < nextInt);
        }
        String sb2 = sb.toString();
        m.e(sb2, "buffer.toString()");
        MIME_BOUNDARY = sb2;
    }

    public GraphRequest() {
        this((AccessToken) null, (String) null, (Bundle) null, (HttpMethod) null, (Callback) null, (String) null, 63, (g) null);
    }

    public GraphRequest(AccessToken accessToken2) {
        this(accessToken2, (String) null, (Bundle) null, (HttpMethod) null, (Callback) null, (String) null, 62, (g) null);
    }

    public GraphRequest(AccessToken accessToken2, String str) {
        this(accessToken2, str, (Bundle) null, (HttpMethod) null, (Callback) null, (String) null, 60, (g) null);
    }

    public GraphRequest(AccessToken accessToken2, String str, Bundle bundle) {
        this(accessToken2, str, bundle, (HttpMethod) null, (Callback) null, (String) null, 56, (g) null);
    }

    public GraphRequest(AccessToken accessToken2, String str, Bundle bundle, HttpMethod httpMethod2) {
        this(accessToken2, str, bundle, httpMethod2, (Callback) null, (String) null, 48, (g) null);
    }

    public GraphRequest(AccessToken accessToken2, String str, Bundle bundle, HttpMethod httpMethod2, Callback callback2) {
        this(accessToken2, str, bundle, httpMethod2, callback2, (String) null, 32, (g) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GraphRequest(com.facebook.AccessToken r6, java.lang.String r7, android.os.Bundle r8, com.facebook.HttpMethod r9, com.facebook.GraphRequest.Callback r10, java.lang.String r11, int r12, kotlin.jvm.internal.g r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.<init>(com.facebook.AccessToken, java.lang.String, android.os.Bundle, com.facebook.HttpMethod, com.facebook.GraphRequest$Callback, java.lang.String, int, kotlin.jvm.internal.g):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: _set_callback_$lambda-0  reason: not valid java name */
    public static final void m15_set_callback_$lambda0(Callback callback2, GraphResponse graphResponse) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        m.f(graphResponse, "response");
        JSONObject jSONObject2 = graphResponse.getJSONObject();
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.optJSONObject(DEBUG_KEY);
        }
        if (jSONObject == null) {
            jSONArray = null;
        } else {
            jSONArray = jSONObject.optJSONArray(DEBUG_MESSAGES_KEY);
        }
        if (jSONArray != null) {
            int i10 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject == null) {
                        str = null;
                    } else {
                        str = optJSONObject.optString("message");
                    }
                    if (optJSONObject == null) {
                        str2 = null;
                    } else {
                        str2 = optJSONObject.optString("type");
                    }
                    if (optJSONObject == null) {
                        str3 = null;
                    } else {
                        str3 = optJSONObject.optString("link");
                    }
                    if (!(str == null || str2 == null)) {
                        LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                        if (m.a(str2, DEBUG_SEVERITY_WARNING)) {
                            loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                        }
                        Utility utility = Utility.INSTANCE;
                        if (!Utility.isNullOrEmpty(str3)) {
                            str = str + " Link: " + str3;
                        }
                        Logger.Companion companion = Logger.Companion;
                        String str4 = TAG;
                        m.e(str4, "TAG");
                        companion.log(loggingBehavior, str4, str);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        }
        if (callback2 != null) {
            callback2.onCompleted(graphResponse);
        }
    }

    private final void addCommonParameters() {
        Bundle bundle = this.parameters;
        if (shouldForceClientTokenForRequest()) {
            bundle.putString("access_token", getClientTokenForRequest());
        } else {
            String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
            if (accessTokenToUseForRequest != null) {
                bundle.putString("access_token", accessTokenToUseForRequest);
            }
        }
        if (!bundle.containsKey("access_token")) {
            Utility utility = Utility.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            Utility.isNullOrEmpty(FacebookSdk.getClientToken());
        }
        bundle.putString("sdk", "android");
        bundle.putString(FORMAT_PARAM, FORMAT_JSON);
        FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString(DEBUG_PARAM, DEBUG_SEVERITY_INFO);
        } else if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString(DEBUG_PARAM, DEBUG_SEVERITY_WARNING);
        }
    }

    private final String appendParametersToBaseUrl(String str, boolean z10) {
        if (!z10 && this.httpMethod == HttpMethod.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.parameters.keySet()) {
            Object obj = this.parameters.get(str2);
            if (obj == null) {
                obj = "";
            }
            Companion companion = Companion;
            if (companion.isSupportedParameterType(obj)) {
                buildUpon.appendQueryParameter(str2, companion.parameterToString(obj).toString());
            } else if (this.httpMethod != HttpMethod.GET) {
                b0 b0Var = b0.f15559a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                m.e(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        m.e(builder, "uriBuilder.toString()");
        return builder;
    }

    public static final GraphResponse executeAndWait(GraphRequest graphRequest) {
        return Companion.executeAndWait(graphRequest);
    }

    public static final List<GraphResponse> executeBatchAndWait(GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAndWait(graphRequestBatch);
    }

    public static final List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> collection) {
        return Companion.executeBatchAndWait(collection);
    }

    public static final List<GraphResponse> executeBatchAndWait(GraphRequest... graphRequestArr) {
        return Companion.executeBatchAndWait(graphRequestArr);
    }

    public static final GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAsync(graphRequestBatch);
    }

    public static final GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> collection) {
        return Companion.executeBatchAsync(collection);
    }

    public static final GraphRequestAsyncTask executeBatchAsync(GraphRequest... graphRequestArr) {
        return Companion.executeBatchAsync(graphRequestArr);
    }

    public static final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAndWait(httpURLConnection, graphRequestBatch);
    }

    public static final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, Collection<GraphRequest> collection) {
        return Companion.executeConnectionAndWait(httpURLConnection, collection);
    }

    public static final GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(handler, httpURLConnection, graphRequestBatch);
    }

    public static final GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(httpURLConnection, graphRequestBatch);
    }

    private final String getAccessTokenToUseForRequest() {
        AccessToken accessToken2 = this.accessToken;
        if (accessToken2 != null) {
            if (!this.parameters.containsKey("access_token")) {
                String token = accessToken2.getToken();
                Logger.Companion.registerAccessToken(token);
                return token;
            }
        } else if (!this.parameters.containsKey("access_token")) {
            return getClientTokenForRequest();
        }
        return this.parameters.getString("access_token");
    }

    private final String getClientTokenForRequest() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String clientToken = FacebookSdk.getClientToken();
        boolean z10 = true;
        if (applicationId.length() > 0) {
            if (clientToken.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                return applicationId + '|' + clientToken;
            }
        }
        Utility utility = Utility.INSTANCE;
        Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    public static final String getDefaultBatchApplicationId() {
        return Companion.getDefaultBatchApplicationId();
    }

    private final String getGraphPathWithVersion() {
        if (versionPattern.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        b0 b0Var = b0.f15559a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String getUrlWithGraphPath(String str) {
        if (!isValidGraphRequestForDomain()) {
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            str = ServerProtocol.getFacebookGraphUrlBase();
        }
        b0 b0Var = b0.f15559a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, getGraphPathWithVersion()}, 2));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean isApplicationRequest() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        sb.append(FacebookSdk.getApplicationId());
        sb.append("/?.*");
        String sb2 = sb.toString();
        if (this.forceApplicationRequest || Pattern.matches(sb2, this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath)) {
            return true;
        }
        return false;
    }

    private final boolean isValidGraphRequestForDomain() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!m.a(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM)) {
            return true;
        }
        return !isApplicationRequest();
    }

    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken2, Context context, Callback callback2) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken2, context, callback2);
    }

    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken2, Context context, String str, Callback callback2) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken2, context, str, callback2);
    }

    public static final GraphRequest newDeleteObjectRequest(AccessToken accessToken2, String str, Callback callback2) {
        return Companion.newDeleteObjectRequest(accessToken2, str, callback2);
    }

    public static final GraphRequest newGraphPathRequest(AccessToken accessToken2, String str, Callback callback2) {
        return Companion.newGraphPathRequest(accessToken2, str, callback2);
    }

    public static final GraphRequest newMeRequest(AccessToken accessToken2, GraphJSONObjectCallback graphJSONObjectCallback) {
        return Companion.newMeRequest(accessToken2, graphJSONObjectCallback);
    }

    public static final GraphRequest newMyFriendsRequest(AccessToken accessToken2, GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newMyFriendsRequest(accessToken2, graphJSONArrayCallback);
    }

    public static final GraphRequest newPlacesSearchRequest(AccessToken accessToken2, Location location, int i10, int i11, String str, GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newPlacesSearchRequest(accessToken2, location, i10, i11, str, graphJSONArrayCallback);
    }

    public static final GraphRequest newPostRequest(AccessToken accessToken2, String str, JSONObject jSONObject, Callback callback2) {
        return Companion.newPostRequest(accessToken2, str, jSONObject, callback2);
    }

    public static final GraphRequest newPostRequestWithBundle(AccessToken accessToken2, String str, Bundle bundle, Callback callback2) {
        return Companion.newPostRequestWithBundle(accessToken2, str, bundle, callback2);
    }

    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken2, String str, Bitmap bitmap, String str2, Bundle bundle, Callback callback2) {
        return Companion.newUploadPhotoRequest(accessToken2, str, bitmap, str2, bundle, callback2);
    }

    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken2, String str, Uri uri, String str2, Bundle bundle, Callback callback2) {
        return Companion.newUploadPhotoRequest(accessToken2, str, uri, str2, bundle, callback2);
    }

    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken2, String str, File file, String str2, Bundle bundle, Callback callback2) {
        return Companion.newUploadPhotoRequest(accessToken2, str, file, str2, bundle, callback2);
    }

    public static final void runCallbacks$facebook_core_release(GraphRequestBatch graphRequestBatch, List<GraphResponse> list) {
        Companion.runCallbacks$facebook_core_release(graphRequestBatch, list);
    }

    /* access modifiers changed from: private */
    public final void serializeToBatch(JSONArray jSONArray, Map<String, Attachment> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM, this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put(BATCH_ENTRY_DEPENDS_ON_PARAM, str2);
        }
        String relativeUrlForBatchedRequest = getRelativeUrlForBatchedRequest();
        jSONObject.put(BATCH_RELATIVE_URL_PARAM, relativeUrlForBatchedRequest);
        jSONObject.put("method", this.httpMethod);
        AccessToken accessToken2 = this.accessToken;
        if (accessToken2 != null) {
            Logger.Companion.registerAccessToken(accessToken2.getToken());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.parameters.keySet()) {
            Object obj = this.parameters.get(str3);
            if (Companion.isSupportedAttachmentType(obj)) {
                b0 b0Var = b0.f15559a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                m.e(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new Attachment(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(ATTACHED_FILES_PARAM, TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            Companion.processGraphObject(jSONObject2, relativeUrlForBatchedRequest, new GraphRequest$serializeToBatch$1(arrayList2));
            jSONObject.put(BATCH_BODY_PARAM, TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    public static final void serializeToUrlConnection$facebook_core_release(GraphRequestBatch graphRequestBatch, HttpURLConnection httpURLConnection) {
        Companion.serializeToUrlConnection$facebook_core_release(graphRequestBatch, httpURLConnection);
    }

    public static final void setDefaultBatchApplicationId(String str) {
        Companion.setDefaultBatchApplicationId(str);
    }

    private final boolean shouldForceClientTokenForRequest() {
        boolean z10;
        String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
        if (accessTokenToUseForRequest == null) {
            z10 = false;
        } else {
            z10 = q.y(accessTokenToUseForRequest, "|", false, 2, (Object) null);
        }
        if ((accessTokenToUseForRequest != null && p.v(accessTokenToUseForRequest, "IG", false, 2, (Object) null) && !z10) && isApplicationRequest()) {
            return true;
        }
        if (isValidGraphRequestForDomain() || z10) {
            return false;
        }
        return true;
    }

    public static final HttpURLConnection toHttpConnection(GraphRequestBatch graphRequestBatch) {
        return Companion.toHttpConnection(graphRequestBatch);
    }

    public static final HttpURLConnection toHttpConnection(Collection<GraphRequest> collection) {
        return Companion.toHttpConnection(collection);
    }

    public static final HttpURLConnection toHttpConnection(GraphRequest... graphRequestArr) {
        return Companion.toHttpConnection(graphRequestArr);
    }

    public static final void validateFieldsParamForGetRequests$facebook_core_release(GraphRequestBatch graphRequestBatch) {
        Companion.validateFieldsParamForGetRequests$facebook_core_release(graphRequestBatch);
    }

    public final GraphResponse executeAndWait() {
        return Companion.executeAndWait(this);
    }

    public final GraphRequestAsyncTask executeAsync() {
        return Companion.executeBatchAsync(this);
    }

    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final String getBatchEntryDependsOn() {
        return this.batchEntryDependsOn;
    }

    public final String getBatchEntryName() {
        return this.batchEntryName;
    }

    public final boolean getBatchEntryOmitResultOnSuccess() {
        return this.batchEntryOmitResultOnSuccess;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    public final String getGraphPath() {
        return this.graphPath;
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final Bundle getParameters() {
        return this.parameters;
    }

    public final String getRelativeUrlForBatchedRequest() {
        if (this.overriddenURL == null) {
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            String urlWithGraphPath = getUrlWithGraphPath(ServerProtocol.getGraphUrlBase());
            addCommonParameters();
            Uri parse = Uri.parse(appendParametersToBaseUrl(urlWithGraphPath, true));
            b0 b0Var = b0.f15559a;
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            m.e(format, "java.lang.String.format(format, *args)");
            return format;
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    public final Object getTag() {
        return this.tag;
    }

    public final String getUrlForSingleRequest() {
        String str;
        String str2 = this.overriddenURL;
        if (str2 != null) {
            return String.valueOf(str2);
        }
        String str3 = this.graphPath;
        if (this.httpMethod != HttpMethod.POST || str3 == null || !p.l(str3, VIDEOS_SUFFIX, false, 2, (Object) null)) {
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = ServerProtocol.getGraphUrlBaseForSubdomain(FacebookSdk.getGraphDomain());
        } else {
            ServerProtocol serverProtocol2 = ServerProtocol.INSTANCE;
            str = ServerProtocol.getGraphVideoUrlBase();
        }
        String urlWithGraphPath = getUrlWithGraphPath(str);
        addCommonParameters();
        return appendParametersToBaseUrl(urlWithGraphPath, false);
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setAccessToken(AccessToken accessToken2) {
        this.accessToken = accessToken2;
    }

    public final void setBatchEntryDependsOn(String str) {
        this.batchEntryDependsOn = str;
    }

    public final void setBatchEntryName(String str) {
        this.batchEntryName = str;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean z10) {
        this.batchEntryOmitResultOnSuccess = z10;
    }

    public final void setCallback(Callback callback2) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) || FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = new p(callback2);
        } else {
            this.callback = callback2;
        }
    }

    public final void setForceApplicationRequest(boolean z10) {
        this.forceApplicationRequest = z10;
    }

    public final void setGraphObject(JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    public final void setGraphPath(String str) {
        this.graphPath = str;
    }

    public final void setHttpMethod(HttpMethod httpMethod2) {
        if (this.overriddenURL == null || httpMethod2 == HttpMethod.GET) {
            if (httpMethod2 == null) {
                httpMethod2 = HttpMethod.GET;
            }
            this.httpMethod = httpMethod2;
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    public final void setParameters(Bundle bundle) {
        m.f(bundle, "<set-?>");
        this.parameters = bundle;
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.graphPath);
        sb.append(", graphObject: ");
        sb.append(this.graphObject);
        sb.append(", httpMethod: ");
        sb.append(this.httpMethod);
        sb.append(", parameters: ");
        sb.append(this.parameters);
        sb.append("}");
        String sb2 = sb.toString();
        m.e(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    public GraphRequest(AccessToken accessToken2, String str, Bundle bundle, HttpMethod httpMethod2, Callback callback2, String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken2;
        this.graphPath = str;
        this.version = str2;
        setCallback(callback2);
        setHttpMethod(httpMethod2);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            this.version = FacebookSdk.getGraphApiVersion();
        }
    }

    /* compiled from: GraphRequest.kt */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1();
        public static final Companion Companion = new Companion((g) null);
        private final String mimeType;
        private final RESOURCE resource;

        /* compiled from: GraphRequest.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, g gVar) {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource2, String str) {
            this.mimeType = str;
            this.resource = resource2;
        }

        public int describeContents() {
            return 1;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final RESOURCE getResource() {
            return this.resource;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            m.f(parcel, "out");
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.resource, i10);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            this.resource = parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
        }
    }

    public GraphRequest(AccessToken accessToken2, URL url) {
        m.f(url, "overriddenURL");
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken2;
        this.overriddenURL = url.toString();
        setHttpMethod(HttpMethod.GET);
        this.parameters = new Bundle();
    }
}
