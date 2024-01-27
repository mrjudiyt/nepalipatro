package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcga extends WebChromeClient {
    private final zzcgb zza;

    public zzcga(zzcgb zzcgb) {
        this.zza = zzcgb;
    }

    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcgb)) {
            return webView.getContext();
        }
        zzcgb zzcgb = (zzcgb) webView;
        Activity zzi = zzcgb.zzi();
        if (zzi != null) {
            return zzi;
        }
        return zzcgb.getContext();
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcgb)) {
            zzcat.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzl zzL = ((zzcgb) webView).zzL();
        if (zzL == null) {
            zzcat.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzL.zzb();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + CertificateUtil.DELIMITER + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = zzcfz.zza[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            zzcat.zzg(str);
        } else if (i10 == 2) {
            zzcat.zzj(str);
        } else if (i10 == 3 || i10 == 4) {
            zzcat.zzi(str);
        } else if (i10 != 5) {
            zzcat.zzi(str);
        } else {
            zzcat.zze(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > 1048576) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(j10 + Math.min(131072, j13), 1048576);
        } else {
            if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            zzcgb zzcgb = this.zza;
            zzt.zzp();
            if (!com.google.android.gms.ads.internal.util.zzt.zzz(zzcgb.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzcgb zzcgb2 = this.zza;
                zzt.zzp();
                if (!com.google.android.gms.ads.internal.util.zzt.zzz(zzcgb2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = false;
                    callback.invoke(str, z10, true);
                }
            }
            z10 = true;
            callback.invoke(str, z10, true);
        }
    }

    public final void onHideCustomView() {
        zzl zzL = this.zza.zzL();
        if (zzL == null) {
            zzcat.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzL.zzg();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        zzl zzL = this.zza.zzL();
        if (zzL == null) {
            zzcat.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzL.zzC(view, customViewCallback);
        zzL.zzA(i10);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        zzb zzd;
        try {
            zzcgb zzcgb = this.zza;
            if (zzcgb == null || zzcgb.zzN() == null || this.zza.zzN().zzd() == null || (zzd = this.zza.zzN().zzd()) == null || zzd.zzc()) {
                zzt.zzp();
                AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(context);
                zzJ.setTitle(str2);
                if (z10) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    zzJ.setView(linearLayout).setPositiveButton(17039370, new zzcfy(jsPromptResult, editText)).setNegativeButton(17039360, new zzcfx(jsPromptResult)).setOnCancelListener(new zzcfw(jsPromptResult)).create().show();
                } else {
                    zzJ.setMessage(str3).setPositiveButton(17039370, new zzcfv(jsResult)).setNegativeButton(17039360, new zzcfu(jsResult)).setOnCancelListener(new zzcft(jsResult)).create().show();
                }
                return true;
            }
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        } catch (WindowManager.BadTokenException e10) {
            zzcat.zzk("Fail to display Dialog.", e10);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
