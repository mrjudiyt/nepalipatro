package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.common.R;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginTargetApp;
import com.facebook.share.internal.ShareConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WebDialog.kt */
public class WebDialog extends Dialog {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int BACKGROUND_GRAY = -872415232;
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static final int DEFAULT_THEME = R.style.com_facebook_activity_theme;
    public static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
    private static final String DISPLAY_TOUCH = "touch";
    private static final String LOG_TAG = "FacebookSDK.WebDialog";
    private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
    private static final int MAX_PADDING_SCREEN_WIDTH = 800;
    private static final double MIN_SCALE_FACTOR = 0.5d;
    private static final int NO_PADDING_SCREEN_HEIGHT = 800;
    private static final int NO_PADDING_SCREEN_WIDTH = 480;
    private static final String PLATFORM_DIALOG_PATH_REGEX = "^/(v\\d+\\.\\d+/)??dialog/.*";
    /* access modifiers changed from: private */
    public static InitCallback initCallback;
    /* access modifiers changed from: private */
    public static volatile int webDialogTheme;
    /* access modifiers changed from: private */
    public FrameLayout contentFrameLayout;
    /* access modifiers changed from: private */
    public ImageView crossImageView;
    /* access modifiers changed from: private */
    public String expectedRedirectUrl;
    /* access modifiers changed from: private */
    public boolean isDetached;
    private boolean isListenerCalled;
    /* access modifiers changed from: private */
    public boolean isPageFinished;
    private OnCompleteListener onCompleteListener;
    /* access modifiers changed from: private */
    public ProgressDialog spinner;
    private UploadStagingResourcesTask uploadTask;
    /* access modifiers changed from: private */
    public String url;
    private WebView webView;
    private WindowManager.LayoutParams windowParams;

    /* compiled from: WebDialog.kt */
    private final class DialogWebViewClient extends WebViewClient {
        final /* synthetic */ WebDialog this$0;

        public DialogWebViewClient(WebDialog webDialog) {
            m.f(webDialog, "this$0");
            this.this$0 = webDialog;
        }

        public void onPageFinished(WebView webView, String str) {
            ProgressDialog access$getSpinner$p;
            m.f(webView, "view");
            m.f(str, "url");
            super.onPageFinished(webView, str);
            if (!this.this$0.isDetached && (access$getSpinner$p = this.this$0.spinner) != null) {
                access$getSpinner$p.dismiss();
            }
            FrameLayout access$getContentFrameLayout$p = this.this$0.contentFrameLayout;
            if (access$getContentFrameLayout$p != null) {
                access$getContentFrameLayout$p.setBackgroundColor(0);
            }
            WebView webView2 = this.this$0.getWebView();
            if (webView2 != null) {
                webView2.setVisibility(0);
            }
            ImageView access$getCrossImageView$p = this.this$0.crossImageView;
            if (access$getCrossImageView$p != null) {
                access$getCrossImageView$p.setVisibility(0);
            }
            this.this$0.isPageFinished = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog access$getSpinner$p;
            m.f(webView, "view");
            m.f(str, "url");
            Utility utility = Utility.INSTANCE;
            Utility.logd(WebDialog.LOG_TAG, m.o("Webview loading URL: ", str));
            super.onPageStarted(webView, str, bitmap);
            if (!this.this$0.isDetached && (access$getSpinner$p = this.this$0.spinner) != null) {
                access$getSpinner$p.show();
            }
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            m.f(webView, "view");
            m.f(str, "description");
            m.f(str2, "failingUrl");
            super.onReceivedError(webView, i10, str, str2);
            this.this$0.sendErrorToListener(new FacebookDialogException(str, i10, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            m.f(webView, "view");
            m.f(sslErrorHandler, "handler");
            m.f(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.this$0.sendErrorToListener(new FacebookDialogException((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.m.f(r6, r0)
                java.lang.String r6 = "url"
                kotlin.jvm.internal.m.f(r7, r6)
                com.facebook.internal.Utility r6 = com.facebook.internal.Utility.INSTANCE
                java.lang.String r6 = "Redirect URL: "
                java.lang.String r6 = kotlin.jvm.internal.m.o(r6, r7)
                java.lang.String r0 = "FacebookSDK.WebDialog"
                com.facebook.internal.Utility.logd((java.lang.String) r0, (java.lang.String) r6)
                android.net.Uri r6 = android.net.Uri.parse(r7)
                java.lang.String r0 = r6.getPath()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0031
                java.lang.String r6 = r6.getPath()
                java.lang.String r0 = "^/(v\\d+\\.\\d+/)??dialog/.*"
                boolean r6 = java.util.regex.Pattern.matches(r0, r6)
                if (r6 == 0) goto L_0x0031
                r6 = 1
                goto L_0x0032
            L_0x0031:
                r6 = 0
            L_0x0032:
                com.facebook.internal.WebDialog r0 = r5.this$0
                java.lang.String r0 = r0.expectedRedirectUrl
                r3 = 2
                r4 = 0
                boolean r0 = g9.p.v(r7, r0, r2, r3, r4)
                if (r0 == 0) goto L_0x00c7
                com.facebook.internal.WebDialog r6 = r5.this$0
                android.os.Bundle r6 = r6.parseResponseUri(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0054
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0054:
                java.lang.String r0 = "error_msg"
                java.lang.String r0 = r6.getString(r0)
                if (r0 != 0) goto L_0x0062
                java.lang.String r0 = "error_message"
                java.lang.String r0 = r6.getString(r0)
            L_0x0062:
                if (r0 != 0) goto L_0x006a
                java.lang.String r0 = "error_description"
                java.lang.String r0 = r6.getString(r0)
            L_0x006a:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                r3 = -1
                if (r2 == 0) goto L_0x007e
                boolean r4 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r2)
                if (r4 != 0) goto L_0x007e
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x007e }
                goto L_0x007f
            L_0x007e:
                r2 = -1
            L_0x007f:
                com.facebook.internal.Utility r4 = com.facebook.internal.Utility.INSTANCE
                boolean r4 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r7)
                if (r4 == 0) goto L_0x0095
                boolean r4 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r0)
                if (r4 == 0) goto L_0x0095
                if (r2 != r3) goto L_0x0095
                com.facebook.internal.WebDialog r7 = r5.this$0
                r7.sendSuccessToListener(r6)
                goto L_0x00c6
            L_0x0095:
                if (r7 == 0) goto L_0x00ad
                java.lang.String r6 = "access_denied"
                boolean r6 = kotlin.jvm.internal.m.a(r7, r6)
                if (r6 != 0) goto L_0x00a7
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = kotlin.jvm.internal.m.a(r7, r6)
                if (r6 == 0) goto L_0x00ad
            L_0x00a7:
                com.facebook.internal.WebDialog r6 = r5.this$0
                r6.cancel()
                goto L_0x00c6
            L_0x00ad:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x00b7
                com.facebook.internal.WebDialog r6 = r5.this$0
                r6.cancel()
                goto L_0x00c6
            L_0x00b7:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r0)
                com.facebook.internal.WebDialog r7 = r5.this$0
                com.facebook.FacebookServiceException r2 = new com.facebook.FacebookServiceException
                r2.<init>(r6, r0)
                r7.sendErrorToListener(r2)
            L_0x00c6:
                return r1
            L_0x00c7:
                java.lang.String r0 = "fbconnect://cancel"
                boolean r0 = g9.p.v(r7, r0, r2, r3, r4)
                if (r0 == 0) goto L_0x00d5
                com.facebook.internal.WebDialog r6 = r5.this$0
                r6.cancel()
                return r1
            L_0x00d5:
                if (r6 != 0) goto L_0x00f7
                java.lang.String r6 = "touch"
                boolean r6 = g9.q.y(r7, r6, r2, r3, r4)
                if (r6 == 0) goto L_0x00e0
                goto L_0x00f7
            L_0x00e0:
                com.facebook.internal.WebDialog r6 = r5.this$0     // Catch:{ ActivityNotFoundException -> 0x00f5 }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00f5 }
                android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00f5 }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00f5 }
                r0.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00f5 }
                r6.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00f5 }
                goto L_0x00f6
            L_0x00f5:
                r1 = 0
            L_0x00f6:
                return r1
            L_0x00f7:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.DialogWebViewClient.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* compiled from: WebDialog.kt */
    public interface InitCallback {
        void onInit(WebView webView);
    }

    /* compiled from: WebDialog.kt */
    public interface OnCompleteListener {
        void onComplete(Bundle bundle, FacebookException facebookException);
    }

    /* compiled from: WebDialog.kt */
    private final class UploadStagingResourcesTask extends AsyncTask<Void, Void, String[]> {
        private final String action;
        private Exception[] exceptions = new Exception[0];
        private final Bundle parameters;
        final /* synthetic */ WebDialog this$0;

        public UploadStagingResourcesTask(WebDialog webDialog, String str, Bundle bundle) {
            m.f(webDialog, "this$0");
            m.f(str, NativeProtocol.WEB_DIALOG_ACTION);
            m.f(bundle, "parameters");
            this.this$0 = webDialog;
            this.action = str;
            this.parameters = bundle;
        }

        /* access modifiers changed from: private */
        /* renamed from: doInBackground$lambda-0  reason: not valid java name */
        public static final void m110doInBackground$lambda0(String[] strArr, int i10, UploadStagingResourcesTask uploadStagingResourcesTask, CountDownLatch countDownLatch, GraphResponse graphResponse) {
            m.f(strArr, "$results");
            m.f(uploadStagingResourcesTask, "this$0");
            m.f(countDownLatch, "$latch");
            m.f(graphResponse, "response");
            try {
                FacebookRequestError error = graphResponse.getError();
                String str = "Error staging photo.";
                if (error != null) {
                    String errorMessage = error.getErrorMessage();
                    if (errorMessage != null) {
                        str = errorMessage;
                    }
                    throw new FacebookGraphResponseException(graphResponse, str);
                }
                JSONObject jSONObject = graphResponse.getJSONObject();
                if (jSONObject != null) {
                    String optString = jSONObject.optString(ShareConstants.MEDIA_URI);
                    if (optString != null) {
                        strArr[i10] = optString;
                        countDownLatch.countDown();
                        return;
                    }
                    throw new FacebookException(str);
                }
                throw new FacebookException(str);
            } catch (Exception e10) {
                uploadStagingResourcesTask.exceptions[i10] = e10;
            }
        }

        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return doInBackground((Void[]) objArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    onPostExecute((String[]) obj);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|(2:33|31)|41|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r12 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
            if (r12.hasNext() != false) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
            ((com.facebook.GraphRequestAsyncTask) r12.next()).cancel(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String[] doInBackground(java.lang.Void... r12) {
            /*
                r11 = this;
                boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r11)
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.m.f(r12, r0)     // Catch:{ all -> 0x00a2 }
                android.os.Bundle r12 = r11.parameters     // Catch:{ all -> 0x00a2 }
                java.lang.String r0 = "media"
                java.lang.String[] r12 = r12.getStringArray(r0)     // Catch:{ all -> 0x00a2 }
                if (r12 != 0) goto L_0x0018
                return r1
            L_0x0018:
                int r0 = r12.length     // Catch:{ all -> 0x00a2 }
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00a2 }
                int r2 = r12.length     // Catch:{ all -> 0x00a2 }
                java.lang.Exception[] r2 = new java.lang.Exception[r2]     // Catch:{ all -> 0x00a2 }
                r11.exceptions = r2     // Catch:{ all -> 0x00a2 }
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x00a2 }
                int r3 = r12.length     // Catch:{ all -> 0x00a2 }
                r2.<init>(r3)     // Catch:{ all -> 0x00a2 }
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x00a2 }
                r3.<init>()     // Catch:{ all -> 0x00a2 }
                com.facebook.AccessToken$Companion r4 = com.facebook.AccessToken.Companion     // Catch:{ all -> 0x00a2 }
                com.facebook.AccessToken r4 = r4.getCurrentAccessToken()     // Catch:{ all -> 0x00a2 }
                r5 = 0
                r6 = 1
                int r7 = r12.length     // Catch:{ Exception -> 0x008d }
                int r7 = r7 + -1
                if (r7 < 0) goto L_0x0089
            L_0x0038:
                int r8 = r5 + 1
                boolean r9 = r11.isCancelled()     // Catch:{ Exception -> 0x008d }
                if (r9 == 0) goto L_0x0055
                java.util.Iterator r12 = r3.iterator()     // Catch:{ Exception -> 0x008d }
            L_0x0044:
                boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x008d }
                if (r0 == 0) goto L_0x0054
                java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x008d }
                com.facebook.GraphRequestAsyncTask r0 = (com.facebook.GraphRequestAsyncTask) r0     // Catch:{ Exception -> 0x008d }
                r0.cancel(r6)     // Catch:{ Exception -> 0x008d }
                goto L_0x0044
            L_0x0054:
                return r1
            L_0x0055:
                r9 = r12[r5]     // Catch:{ Exception -> 0x008d }
                android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x008d }
                com.facebook.internal.Utility r10 = com.facebook.internal.Utility.INSTANCE     // Catch:{ Exception -> 0x008d }
                boolean r10 = com.facebook.internal.Utility.isWebUri(r9)     // Catch:{ Exception -> 0x008d }
                if (r10 == 0) goto L_0x006d
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x008d }
                r0[r5] = r9     // Catch:{ Exception -> 0x008d }
                r2.countDown()     // Catch:{ Exception -> 0x008d }
                goto L_0x0084
            L_0x006d:
                com.facebook.internal.v r10 = new com.facebook.internal.v     // Catch:{ Exception -> 0x008d }
                r10.<init>(r0, r5, r11, r2)     // Catch:{ Exception -> 0x008d }
                com.facebook.share.internal.ShareInternalUtility r5 = com.facebook.share.internal.ShareInternalUtility.INSTANCE     // Catch:{ Exception -> 0x008d }
                java.lang.String r5 = "uri"
                kotlin.jvm.internal.m.e(r9, r5)     // Catch:{ Exception -> 0x008d }
                com.facebook.GraphRequest r5 = com.facebook.share.internal.ShareInternalUtility.newUploadStagingResourceWithImageRequest((com.facebook.AccessToken) r4, (android.net.Uri) r9, (com.facebook.GraphRequest.Callback) r10)     // Catch:{ Exception -> 0x008d }
                com.facebook.GraphRequestAsyncTask r5 = r5.executeAsync()     // Catch:{ Exception -> 0x008d }
                r3.add(r5)     // Catch:{ Exception -> 0x008d }
            L_0x0084:
                if (r8 <= r7) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r5 = r8
                goto L_0x0038
            L_0x0089:
                r2.await()     // Catch:{ Exception -> 0x008d }
                return r0
            L_0x008d:
                java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x00a2 }
            L_0x0091:
                boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00a2 }
                if (r0 == 0) goto L_0x00a1
                java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x00a2 }
                com.facebook.GraphRequestAsyncTask r0 = (com.facebook.GraphRequestAsyncTask) r0     // Catch:{ all -> 0x00a2 }
                r0.cancel(r6)     // Catch:{ all -> 0x00a2 }
                goto L_0x0091
            L_0x00a1:
                return r1
            L_0x00a2:
                r12 = move-exception
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r12, r11)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.UploadStagingResourcesTask.doInBackground(java.lang.Void[]):java.lang.String[]");
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(String[] strArr) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    ProgressDialog access$getSpinner$p = this.this$0.spinner;
                    if (access$getSpinner$p != null) {
                        access$getSpinner$p.dismiss();
                    }
                    Exception[] excArr = this.exceptions;
                    int i10 = 0;
                    int length = excArr.length;
                    while (i10 < length) {
                        Exception exc = excArr[i10];
                        i10++;
                        if (exc != null) {
                            this.this$0.sendErrorToListener(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.this$0.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List c10 = j.c(strArr);
                    if (c10.contains((Object) null)) {
                        this.this$0.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    Utility utility = Utility.INSTANCE;
                    Utility.putJSONValueInBundle(this.parameters, ShareConstants.WEB_DIALOG_PARAM_MEDIA, new JSONArray(c10));
                    ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
                    String dialogAuthority = ServerProtocol.getDialogAuthority();
                    StringBuilder sb = new StringBuilder();
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    sb.append(FacebookSdk.getGraphApiVersion());
                    sb.append("/dialog/");
                    sb.append(this.action);
                    this.this$0.url = Utility.buildUri(dialogAuthority, sb.toString(), this.parameters).toString();
                    ImageView access$getCrossImageView$p = this.this$0.crossImageView;
                    if (access$getCrossImageView$p != null) {
                        this.this$0.setUpWebView((access$getCrossImageView$p.getDrawable().getIntrinsicWidth() / 2) + 1);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }
    }

    /* compiled from: WebDialog.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected WebDialog(Context context, String str) {
        this(context, str, Companion.getWebDialogTheme());
        m.f(context, "context");
        m.f(str, "url");
    }

    public /* synthetic */ WebDialog(Context context, String str, Bundle bundle, int i10, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener2, g gVar) {
        this(context, str, bundle, i10, loginTargetApp, onCompleteListener2);
    }

    private final void createCrossImage() {
        ImageView imageView = new ImageView(getContext());
        this.crossImageView = imageView;
        imageView.setOnClickListener(new t(this));
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
        ImageView imageView2 = this.crossImageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.crossImageView;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: createCrossImage$lambda-5  reason: not valid java name */
    public static final void m107createCrossImage$lambda5(WebDialog webDialog, View view) {
        m.f(webDialog, "this$0");
        webDialog.cancel();
    }

    private final int getScaledSize(int i10, float f10, int i11, int i12) {
        int i13 = (int) (((float) i10) / f10);
        double d10 = MIN_SCALE_FACTOR;
        if (i13 <= i11) {
            d10 = 1.0d;
        } else if (i13 < i12) {
            d10 = MIN_SCALE_FACTOR + ((((double) (i12 - i13)) / ((double) (i12 - i11))) * MIN_SCALE_FACTOR);
        }
        return (int) (((double) i10) * d10);
    }

    public static final int getWebDialogTheme() {
        return Companion.getWebDialogTheme();
    }

    protected static final void initDefaultTheme(Context context) {
        Companion.initDefaultTheme(context);
    }

    public static final WebDialog newInstance(Context context, String str, Bundle bundle, int i10, OnCompleteListener onCompleteListener2) {
        return Companion.newInstance(context, str, bundle, i10, onCompleteListener2);
    }

    public static final WebDialog newInstance(Context context, String str, Bundle bundle, int i10, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener2) {
        return Companion.newInstance(context, str, bundle, i10, loginTargetApp, onCompleteListener2);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-4  reason: not valid java name */
    public static final void m108onCreate$lambda4(WebDialog webDialog, DialogInterface dialogInterface) {
        m.f(webDialog, "this$0");
        webDialog.cancel();
    }

    public static final void setInitCallback(InitCallback initCallback2) {
        Companion.setInitCallback(initCallback2);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void setUpWebView(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.webView = new WebDialog$setUpWebView$1(getContext());
        InitCallback initCallback2 = initCallback;
        if (initCallback2 != null) {
            initCallback2.onInit(getWebView());
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setVerticalScrollBarEnabled(false);
        }
        WebView webView3 = this.webView;
        if (webView3 != null) {
            webView3.setHorizontalScrollBarEnabled(false);
        }
        WebView webView4 = this.webView;
        if (webView4 != null) {
            webView4.setWebViewClient(new DialogWebViewClient(this));
        }
        WebView webView5 = this.webView;
        WebSettings webSettings = null;
        WebSettings settings = webView5 == null ? null : webView5.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView6 = this.webView;
        if (webView6 != null) {
            String str = this.url;
            if (str != null) {
                webView6.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        WebView webView7 = this.webView;
        if (webView7 != null) {
            webView7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView8 = this.webView;
        if (webView8 != null) {
            webView8.setVisibility(4);
        }
        WebView webView9 = this.webView;
        WebSettings settings2 = webView9 == null ? null : webView9.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView10 = this.webView;
        if (webView10 != null) {
            webSettings = webView10.getSettings();
        }
        if (webSettings != null) {
            webSettings.setSaveFormData(false);
        }
        WebView webView11 = this.webView;
        if (webView11 != null) {
            webView11.setFocusable(true);
        }
        WebView webView12 = this.webView;
        if (webView12 != null) {
            webView12.setFocusableInTouchMode(true);
        }
        WebView webView13 = this.webView;
        if (webView13 != null) {
            webView13.setOnTouchListener(u.f6092h);
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.webView);
        linearLayout.setBackgroundColor(BACKGROUND_GRAY);
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpWebView$lambda-7  reason: not valid java name */
    public static final boolean m109setUpWebView$lambda7(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    public static final void setWebDialogTheme(int i10) {
        Companion.setWebDialogTheme(i10);
    }

    public void cancel() {
        if (this.onCompleteListener != null && !this.isListenerCalled) {
            sendErrorToListener(new FacebookOperationCanceledException());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.stopLoading();
        }
        if (!this.isDetached && (progressDialog = this.spinner) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final OnCompleteListener getOnCompleteListener() {
        return this.onCompleteListener;
    }

    /* access modifiers changed from: protected */
    public final WebView getWebView() {
        return this.webView;
    }

    /* access modifiers changed from: protected */
    public final boolean isListenerCalled() {
        return this.isListenerCalled;
    }

    /* access modifiers changed from: protected */
    public final boolean isPageFinished() {
        return this.isPageFinished;
    }

    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        WindowManager.LayoutParams attributes;
        this.isDetached = false;
        Utility utility = Utility.INSTANCE;
        Context context = getContext();
        m.e(context, "context");
        if (Utility.mustFixWindowParamsForAutofill(context) && (layoutParams = this.windowParams) != null) {
            IBinder iBinder2 = null;
            if (layoutParams == null) {
                iBinder = null;
            } else {
                iBinder = layoutParams.token;
            }
            if (iBinder == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.windowParams;
                if (layoutParams2 != null) {
                    iBinder2 = layoutParams2.token;
                }
                Utility.logd(LOG_TAG, m.o("Set token on onAttachedToWindow(): ", iBinder2));
            }
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.spinner = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.spinner;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.spinner;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.spinner;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new s(this));
        }
        requestWindowFeature(1);
        this.contentFrameLayout = new FrameLayout(getContext());
        resize();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        createCrossImage();
        if (this.url != null) {
            ImageView imageView = this.crossImageView;
            if (imageView != null) {
                setUpWebView((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.contentFrameLayout;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public void onDetachedFromWindow() {
        this.isDetached = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        m.f(keyEvent, "event");
        if (i10 == 4) {
            WebView webView2 = this.webView;
            if (webView2 != null) {
                if (m.a(webView2 == null ? null : Boolean.valueOf(webView2.canGoBack()), Boolean.TRUE)) {
                    WebView webView3 = this.webView;
                    if (webView3 == null) {
                        return true;
                    }
                    webView3.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        UploadStagingResourcesTask uploadStagingResourcesTask = this.uploadTask;
        if (uploadStagingResourcesTask != null) {
            if ((uploadStagingResourcesTask == null ? null : uploadStagingResourcesTask.getStatus()) == AsyncTask.Status.PENDING) {
                UploadStagingResourcesTask uploadStagingResourcesTask2 = this.uploadTask;
                if (uploadStagingResourcesTask2 != null) {
                    uploadStagingResourcesTask2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.spinner;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        resize();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        UploadStagingResourcesTask uploadStagingResourcesTask = this.uploadTask;
        if (uploadStagingResourcesTask != null) {
            uploadStagingResourcesTask.cancel(true);
            ProgressDialog progressDialog = this.spinner;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        m.f(layoutParams, NativeProtocol.WEB_DIALOG_PARAMS);
        if (layoutParams.token == null) {
            this.windowParams = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    public Bundle parseResponseUri(String str) {
        Uri parse = Uri.parse(str);
        Utility utility = Utility.INSTANCE;
        Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
        parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
        return parseUrlQueryString;
    }

    public final void resize() {
        Object systemService = getContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 < i11) {
            i10 = i11;
        }
        int min = Math.min(getScaledSize(i12, displayMetrics.density, NO_PADDING_SCREEN_WIDTH, 800), displayMetrics.widthPixels);
        int min2 = Math.min(getScaledSize(i10, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(min, min2);
        }
    }

    /* access modifiers changed from: protected */
    public final void sendErrorToListener(Throwable th) {
        FacebookException facebookException;
        if (this.onCompleteListener != null && !this.isListenerCalled) {
            this.isListenerCalled = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            OnCompleteListener onCompleteListener2 = this.onCompleteListener;
            if (onCompleteListener2 != null) {
                onCompleteListener2.onComplete((Bundle) null, facebookException);
            }
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void sendSuccessToListener(Bundle bundle) {
        OnCompleteListener onCompleteListener2 = this.onCompleteListener;
        if (onCompleteListener2 != null && !this.isListenerCalled) {
            this.isListenerCalled = true;
            if (onCompleteListener2 != null) {
                onCompleteListener2.onComplete(bundle, (FacebookException) null);
            }
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void setExpectedRedirectUrl(String str) {
        m.f(str, "expectedRedirectUrl");
        this.expectedRedirectUrl = str;
    }

    public final void setOnCompleteListener(OnCompleteListener onCompleteListener2) {
        this.onCompleteListener = onCompleteListener2;
    }

    /* compiled from: WebDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final int getWebDialogTheme() {
            Validate validate = Validate.INSTANCE;
            Validate.sdkInitialized();
            return WebDialog.webDialogTheme;
        }

        /* access modifiers changed from: protected */
        public final void initDefaultTheme(Context context) {
            Bundle bundle;
            if (context != null) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    if (applicationInfo == null) {
                        bundle = null;
                    } else {
                        bundle = applicationInfo.metaData;
                    }
                    if (bundle != null && WebDialog.webDialogTheme == 0) {
                        setWebDialogTheme(applicationInfo.metaData.getInt(FacebookSdk.WEB_DIALOG_THEME));
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }

        public final WebDialog newInstance(Context context, String str, Bundle bundle, int i10, OnCompleteListener onCompleteListener) {
            m.f(context, "context");
            WebDialog.initDefaultTheme(context);
            return new WebDialog(context, str, bundle, i10, LoginTargetApp.FACEBOOK, onCompleteListener, (g) null);
        }

        public final void setInitCallback(InitCallback initCallback) {
            WebDialog.initCallback = initCallback;
        }

        public final void setWebDialogTheme(int i10) {
            if (i10 == 0) {
                i10 = WebDialog.DEFAULT_THEME;
            }
            WebDialog.webDialogTheme = i10;
        }

        public final WebDialog newInstance(Context context, String str, Bundle bundle, int i10, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener) {
            m.f(context, "context");
            m.f(loginTargetApp, "targetApp");
            WebDialog.initDefaultTheme(context);
            return new WebDialog(context, str, bundle, i10, loginTargetApp, onCompleteListener, (g) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WebDialog(Context context, String str, int i10) {
        super(context, i10 == 0 ? Companion.getWebDialogTheme() : i10);
        this.expectedRedirectUrl = ServerProtocol.DIALOG_REDIRECT_URI;
        this.url = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WebDialog(Context context, String str, Bundle bundle, int i10, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener2) {
        super(context, i10 == 0 ? Companion.getWebDialogTheme() : i10);
        Uri uri;
        String str2 = ServerProtocol.DIALOG_REDIRECT_URI;
        this.expectedRedirectUrl = str2;
        bundle = bundle == null ? new Bundle() : bundle;
        Utility utility = Utility.INSTANCE;
        str2 = Utility.isChromeOS(context) ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : str2;
        this.expectedRedirectUrl = str2;
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str2);
        bundle.putString("display", "touch");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        b0 b0Var = b0.f15559a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{FacebookSdk.getSdkVersion()}, 1));
        m.e(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString(ServerProtocol.DIALOG_PARAM_SDK_VERSION, format);
        this.onCompleteListener = onCompleteListener2;
        if (!m.a(str, "share") || !bundle.containsKey(ShareConstants.WEB_DIALOG_PARAM_MEDIA)) {
            if (WhenMappings.$EnumSwitchMapping$0[loginTargetApp.ordinal()] == 1) {
                ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
                uri = Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle);
            } else {
                ServerProtocol serverProtocol2 = ServerProtocol.INSTANCE;
                String dialogAuthority = ServerProtocol.getDialogAuthority();
                uri = Utility.buildUri(dialogAuthority, FacebookSdk.getGraphApiVersion() + "/dialog/" + str, bundle);
            }
            this.url = uri.toString();
            return;
        }
        this.uploadTask = new UploadStagingResourcesTask(this, str, bundle);
    }

    /* compiled from: WebDialog.kt */
    public static class Builder {
        private AccessToken accessToken;
        private String action;
        private String applicationId;
        private Context context;
        private OnCompleteListener listener;
        private Bundle parameters;
        private int theme;

        public Builder(Context context2, String str, Bundle bundle) {
            m.f(context2, "context");
            m.f(str, NativeProtocol.WEB_DIALOG_ACTION);
            AccessToken.Companion companion = AccessToken.Companion;
            this.accessToken = companion.getCurrentAccessToken();
            if (!companion.isCurrentAccessTokenActive()) {
                Utility utility = Utility.INSTANCE;
                String metadataApplicationId = Utility.getMetadataApplicationId(context2);
                if (metadataApplicationId != null) {
                    this.applicationId = metadataApplicationId;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            finishInit(context2, str, bundle);
        }

        private final void finishInit(Context context2, String str, Bundle bundle) {
            this.context = context2;
            this.action = str;
            if (bundle != null) {
                this.parameters = bundle;
            } else {
                this.parameters = new Bundle();
            }
        }

        public WebDialog build() {
            AccessToken accessToken2 = this.accessToken;
            if (accessToken2 != null) {
                Bundle bundle = this.parameters;
                String str = null;
                if (bundle != null) {
                    bundle.putString("app_id", accessToken2 == null ? null : accessToken2.getApplicationId());
                }
                Bundle bundle2 = this.parameters;
                if (bundle2 != null) {
                    AccessToken accessToken3 = this.accessToken;
                    if (accessToken3 != null) {
                        str = accessToken3.getToken();
                    }
                    bundle2.putString("access_token", str);
                }
            } else {
                Bundle bundle3 = this.parameters;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.applicationId);
                }
            }
            Companion companion = WebDialog.Companion;
            Context context2 = this.context;
            if (context2 != null) {
                return companion.newInstance(context2, this.action, this.parameters, this.theme, this.listener);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final Context getContext() {
            return this.context;
        }

        public final OnCompleteListener getListener() {
            return this.listener;
        }

        public final Bundle getParameters() {
            return this.parameters;
        }

        public final int getTheme() {
            return this.theme;
        }

        public final Builder setOnCompleteListener(OnCompleteListener onCompleteListener) {
            this.listener = onCompleteListener;
            return this;
        }

        public final Builder setTheme(int i10) {
            this.theme = i10;
            return this;
        }

        public Builder(Context context2, String str, String str2, Bundle bundle) {
            m.f(context2, "context");
            m.f(str2, NativeProtocol.WEB_DIALOG_ACTION);
            if (str == null) {
                Utility utility = Utility.INSTANCE;
                str = Utility.getMetadataApplicationId(context2);
            }
            Validate validate = Validate.INSTANCE;
            this.applicationId = Validate.notNullOrEmpty(str, "applicationId");
            finishInit(context2, str2, bundle);
        }
    }
}
