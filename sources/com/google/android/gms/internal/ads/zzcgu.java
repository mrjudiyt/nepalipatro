package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zzco;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.e;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcgu extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcgb {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbfb zzC;
    private zzbez zzD;
    private zzawj zzE;
    private int zzF;
    /* access modifiers changed from: private */
    public int zzG;
    private zzbcx zzH;
    private final zzbcx zzI;
    private zzbcx zzJ;
    private final zzbcy zzK;
    private int zzL;
    private zzl zzM;
    private boolean zzN;
    private final zzco zzO;
    private int zzP = -1;
    private int zzQ = -1;
    private int zzR = -1;
    private int zzS = -1;
    private Map zzT;
    private final WindowManager zzU;
    private final zzaxv zzV;
    private final zzchp zzb;
    private final zzaro zzc;
    private final zzbdk zzd;
    private final zzcaz zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfcr zzj;
    private zzfcv zzk;
    private boolean zzl = false;
    private boolean zzm = false;
    private zzcgi zzn;
    private zzl zzo;
    private zzfkc zzp;
    private zzchq zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx = true;
    private final String zzy = "";
    private zzcgx zzz;

    protected zzcgu(zzchp zzchp, zzchq zzchq, String str, boolean z10, boolean z11, zzaro zzaro, zzbdk zzbdk, zzcaz zzcaz, zzbda zzbda, com.google.android.gms.ads.internal.zzl zzl2, zza zza2, zzaxv zzaxv, zzfcr zzfcr, zzfcv zzfcv) {
        super(zzchp);
        zzfcv zzfcv2;
        this.zzb = zzchp;
        this.zzq = zzchq;
        this.zzr = str;
        this.zzu = z10;
        this.zzc = zzaro;
        this.zzd = zzbdk;
        this.zze = zzcaz;
        this.zzf = zzl2;
        this.zzg = zza2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzU = windowManager;
        zzt.zzp();
        DisplayMetrics zzs2 = com.google.android.gms.ads.internal.util.zzt.zzs(windowManager);
        this.zzh = zzs2;
        this.zzi = zzs2.density;
        this.zzV = zzaxv;
        this.zzj = zzfcr;
        this.zzk = zzfcv;
        this.zzO = new zzco(zzchp.zza(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            zzcat.zzh("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkD)).booleanValue()) {
                settings.setMixedContentMode(1);
            } else {
                settings.setMixedContentMode(2);
            }
        }
        settings.setUserAgentString(zzt.zzp().zzc(zzchp, zzcaz.zza));
        zzt.zzp();
        Context context = getContext();
        zzch.zza(context, new zzk(settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaS();
        addJavascriptInterface(new zzchb(this, new zzcha(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzba();
        zzbcy zzbcy = new zzbcy(new zzbda(true, "make_wv", this.zzr));
        this.zzK = zzbcy;
        zzbcy.zza().zzc((zzbda) null);
        if (!(!((Boolean) zzba.zzc().zzb(zzbci.zzbO)).booleanValue() || (zzfcv2 = this.zzk) == null || zzfcv2.zzb == null)) {
            zzbcy.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbcy.zza();
        zzbcx zzf2 = zzbda.zzf();
        this.zzI = zzf2;
        zzbcy.zzb("native:view_create", zzf2);
        this.zzJ = null;
        this.zzH = null;
        zzck.zza().zzb(zzchp);
        zzt.zzo().zzr();
    }

    private final synchronized void zzaS() {
        zzfcr zzfcr = this.zzj;
        if (zzfcr != null) {
            if (zzfcr.zzao) {
                zzcat.zze("Disabling hardware acceleration on an overlay.");
                zzaU();
                return;
            }
        }
        if (!this.zzu) {
            if (!this.zzq.zzi()) {
                zzcat.zze("Enabling hardware acceleration on an AdView.");
                zzaW();
                return;
            }
        }
        zzcat.zze("Enabling hardware acceleration on an overlay.");
        zzaW();
    }

    private final synchronized void zzaT() {
        if (!this.zzN) {
            this.zzN = true;
            zzt.zzo().zzq();
        }
    }

    private final synchronized void zzaU() {
        if (!this.zzv) {
            setLayerType(1, (Paint) null);
        }
        this.zzv = true;
    }

    private final void zzaV(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaW() {
        if (this.zzv) {
            setLayerType(0, (Paint) null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaX(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            zzt.zzo().zzu(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcat.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzaY() {
        zzbcs.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzaZ() {
        Map map = this.zzT;
        if (map != null) {
            for (zzcen release : map.values()) {
                release.release();
            }
        }
        this.zzT = null;
    }

    private final void zzba() {
        zzbcy zzbcy = this.zzK;
        if (zzbcy != null) {
            zzbda zza2 = zzbcy.zza();
            zzbcq zzf2 = zzt.zzo().zzf();
            if (zzf2 != null) {
                zzf2.zzf(zza2);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        zzaQ(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzbb() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcac r0 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x0023 }
            java.lang.Boolean r0 = r0.zzk()     // Catch:{ all -> 0x0023 }
            r2.zzw = r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x001a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x001a }
            r2.zzaQ(r0)     // Catch:{ IllegalStateException -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0023 }
            r2.zzaQ(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgu.zzbb():void");
    }

    public final synchronized void destroy() {
        zzba();
        this.zzO.zza();
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzb();
            this.zzo.zzm();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzh();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.zzt) {
            zzt.zzy().zzd(this);
            zzaZ();
            this.zzt = true;
            if (((Boolean) zzba.zzc().zzb(zzbci.zzjV)).booleanValue()) {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                zzaX("about:blank");
                return;
            }
            zze.zza("Destroying the WebView immediately...");
            zzU();
        }
    }

    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (zzaz()) {
            zzcat.zzl("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzh();
                    zzt.zzy().zzd(this);
                    zzaZ();
                    zzaT();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaz()) {
            super.loadData(str, str2, str3);
        } else {
            zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaz()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!zzaz()) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                zzt.zzo().zzu(th, "AdWebViewImpl.loadUrl");
                zzcat.zzk("Could not call loadUrl. ", th);
            }
        } else {
            zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void onAdClicked() {
        zzcgi zzcgi = this.zzn;
        if (zzcgi != null) {
            zzcgi.onAdClicked();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaz()) {
            this.zzO.zzc();
        }
        boolean z10 = this.zzA;
        zzcgi zzcgi = this.zzn;
        if (zzcgi != null && zzcgi.zzL()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaR();
            z10 = true;
        }
        zzaV(z10);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        zzcgi zzcgi;
        synchronized (this) {
            if (!zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcgi = this.zzn) != null && zzcgi.zzL() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaV(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkf)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzS(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            zzcat.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            zzt.zzo().zzu(e10, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!zzaz()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean zzaR = zzaR();
        zzl zzL2 = zzL();
        if (zzL2 != null && zzaR) {
            zzL2.zzn();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01bf A[SYNTHETIC, Splitter:B:113:0x01bf] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x013c  */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzaz()     // Catch:{ all -> 0x01e5 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x000d:
            boolean r0 = r8.isInEditMode()     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x01e0
            boolean r0 = r8.zzu     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x01e0
            com.google.android.gms.internal.ads.zzchq r0 = r8.zzq     // Catch:{ all -> 0x01e5 }
            boolean r0 = r0.zzf()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01e0
        L_0x0021:
            com.google.android.gms.internal.ads.zzchq r0 = r8.zzq     // Catch:{ all -> 0x01e5 }
            boolean r0 = r0.zzh()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzchq r0 = r8.zzq     // Catch:{ all -> 0x01e5 }
            boolean r0 = r0.zzj()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzdG     // Catch:{ all -> 0x01e5 }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e5 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzcgx r0 = r8.zzq()     // Catch:{ all -> 0x01e5 }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.zze()     // Catch:{ all -> 0x01e5 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0063
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x0063:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e5 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e5 }
            float r2 = (float) r10     // Catch:{ all -> 0x01e5 }
            float r2 = r2 * r0
            float r3 = (float) r9     // Catch:{ all -> 0x01e5 }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01e5 }
            if (r10 != 0) goto L_0x007d
            if (r3 == 0) goto L_0x007c
            float r10 = (float) r3     // Catch:{ all -> 0x01e5 }
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch:{ all -> 0x01e5 }
            r1 = r9
            r9 = r3
            goto L_0x008c
        L_0x007c:
            r10 = 0
        L_0x007d:
            int r2 = (int) r2     // Catch:{ all -> 0x01e5 }
            if (r9 != 0) goto L_0x0089
            if (r2 == 0) goto L_0x008a
            float r9 = (float) r2     // Catch:{ all -> 0x01e5 }
            float r9 = r9 / r0
            int r3 = (int) r9     // Catch:{ all -> 0x01e5 }
            r9 = r10
            r10 = r2
            r1 = r10
            goto L_0x008c
        L_0x0089:
            r1 = r9
        L_0x008a:
            r9 = r10
            r10 = r2
        L_0x008c:
            int r10 = java.lang.Math.min(r10, r1)     // Catch:{ all -> 0x01e5 }
            int r9 = java.lang.Math.min(r3, r9)     // Catch:{ all -> 0x01e5 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x0099:
            com.google.android.gms.internal.ads.zzchq r0 = r8.zzq     // Catch:{ all -> 0x01e5 }
            boolean r0 = r0.zzg()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x00e2
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzdM     // Catch:{ all -> 0x01e5 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e5 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x00b8
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x00b8:
            com.google.android.gms.internal.ads.zzcgs r0 = new com.google.android.gms.internal.ads.zzcgs     // Catch:{ all -> 0x01e5 }
            r0.<init>(r8)     // Catch:{ all -> 0x01e5 }
            java.lang.String r1 = "/contentHeight"
            r8.zzad(r1, r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r8.zzaO(r0)     // Catch:{ all -> 0x01e5 }
            android.util.DisplayMetrics r0 = r8.zzh     // Catch:{ all -> 0x01e5 }
            float r0 = r0.density     // Catch:{ all -> 0x01e5 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e5 }
            int r1 = r8.zzG     // Catch:{ all -> 0x01e5 }
            r2 = -1
            if (r1 == r2) goto L_0x00d9
            float r10 = (float) r1     // Catch:{ all -> 0x01e5 }
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch:{ all -> 0x01e5 }
            goto L_0x00dd
        L_0x00d9:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e5 }
        L_0x00dd:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x00e2:
            com.google.android.gms.internal.ads.zzchq r0 = r8.zzq     // Catch:{ all -> 0x01e5 }
            boolean r0 = r0.zzi()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x00f5
            android.util.DisplayMetrics r9 = r8.zzh     // Catch:{ all -> 0x01e5 }
            int r10 = r9.widthPixels     // Catch:{ all -> 0x01e5 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01e5 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x00f5:
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01e5 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e5 }
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01e5 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e5 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r5) goto L_0x0115
            if (r0 != r4) goto L_0x0111
            goto L_0x0115
        L_0x0111:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0116
        L_0x0115:
            r0 = r9
        L_0x0116:
            if (r2 == r5) goto L_0x011a
            if (r2 != r4) goto L_0x011b
        L_0x011a:
            r3 = r10
        L_0x011b:
            com.google.android.gms.internal.ads.zzchq r2 = r8.zzq     // Catch:{ all -> 0x01e5 }
            int r4 = r2.zzb     // Catch:{ all -> 0x01e5 }
            r5 = 1
            if (r4 > r0) goto L_0x0129
            int r2 = r2.zza     // Catch:{ all -> 0x01e5 }
            if (r2 <= r3) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r2 = 0
            goto L_0x012a
        L_0x0129:
            r2 = 1
        L_0x012a:
            com.google.android.gms.internal.ads.zzbca r4 = com.google.android.gms.internal.ads.zzbci.zzfn     // Catch:{ all -> 0x01e5 }
            com.google.android.gms.internal.ads.zzbcg r6 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x01e5 }
            java.lang.Object r4 = r6.zzb(r4)     // Catch:{ all -> 0x01e5 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01e5 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01e5 }
            if (r4 == 0) goto L_0x0158
            com.google.android.gms.internal.ads.zzchq r4 = r8.zzq     // Catch:{ all -> 0x01e5 }
            int r6 = r4.zzb     // Catch:{ all -> 0x01e5 }
            float r6 = (float) r6     // Catch:{ all -> 0x01e5 }
            float r7 = r8.zzi     // Catch:{ all -> 0x01e5 }
            float r0 = (float) r0     // Catch:{ all -> 0x01e5 }
            float r6 = r6 / r7
            float r0 = r0 / r7
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0156
            int r0 = r4.zza     // Catch:{ all -> 0x01e5 }
            float r0 = (float) r0     // Catch:{ all -> 0x01e5 }
            float r0 = r0 / r7
            float r3 = (float) r3     // Catch:{ all -> 0x01e5 }
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0156
            r0 = 1
            goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            r2 = r2 & r0
        L_0x0158:
            r0 = 8
            if (r2 == 0) goto L_0x01bf
            com.google.android.gms.internal.ads.zzchq r2 = r8.zzq     // Catch:{ all -> 0x01e5 }
            int r3 = r2.zzb     // Catch:{ all -> 0x01e5 }
            float r3 = (float) r3     // Catch:{ all -> 0x01e5 }
            float r4 = r8.zzi     // Catch:{ all -> 0x01e5 }
            int r2 = r2.zza     // Catch:{ all -> 0x01e5 }
            float r2 = (float) r2     // Catch:{ all -> 0x01e5 }
            float r9 = (float) r9     // Catch:{ all -> 0x01e5 }
            float r10 = (float) r10     // Catch:{ all -> 0x01e5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r6.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r6.append(r7)     // Catch:{ all -> 0x01e5 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01e5 }
            r6.append(r3)     // Catch:{ all -> 0x01e5 }
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch:{ all -> 0x01e5 }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01e5 }
            r6.append(r2)     // Catch:{ all -> 0x01e5 }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01e5 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01e5 }
            r6.append(r9)     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = "x"
            r6.append(r9)     // Catch:{ all -> 0x01e5 }
            float r10 = r10 / r4
            int r9 = (int) r10     // Catch:{ all -> 0x01e5 }
            r6.append(r9)     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = " dp."
            r6.append(r9)     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x01e5 }
            com.google.android.gms.internal.ads.zzcat.zzj(r9)     // Catch:{ all -> 0x01e5 }
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e5 }
            if (r9 == r0) goto L_0x01ab
            r9 = 4
            r8.setVisibility(r9)     // Catch:{ all -> 0x01e5 }
        L_0x01ab:
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e5 }
            boolean r9 = r8.zzl     // Catch:{ all -> 0x01e5 }
            if (r9 != 0) goto L_0x01bd
            com.google.android.gms.internal.ads.zzaxv r9 = r8.zzV     // Catch:{ all -> 0x01e5 }
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.zzc(r10)     // Catch:{ all -> 0x01e5 }
            r8.zzl = r5     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x01bd:
            monitor-exit(r8)
            return
        L_0x01bf:
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e5 }
            if (r9 == r0) goto L_0x01c8
            r8.setVisibility(r1)     // Catch:{ all -> 0x01e5 }
        L_0x01c8:
            boolean r9 = r8.zzm     // Catch:{ all -> 0x01e5 }
            if (r9 != 0) goto L_0x01d5
            com.google.android.gms.internal.ads.zzaxv r9 = r8.zzV     // Catch:{ all -> 0x01e5 }
            r10 = 10002(0x2712, float:1.4016E-41)
            r9.zzc(r10)     // Catch:{ all -> 0x01e5 }
            r8.zzm = r5     // Catch:{ all -> 0x01e5 }
        L_0x01d5:
            com.google.android.gms.internal.ads.zzchq r9 = r8.zzq     // Catch:{ all -> 0x01e5 }
            int r10 = r9.zzb     // Catch:{ all -> 0x01e5 }
            int r9 = r9.zza     // Catch:{ all -> 0x01e5 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x01e0:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r8)
            return
        L_0x01e5:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgu.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!zzaz()) {
            try {
                super.onPause();
            } catch (Exception e10) {
                zzcat.zzh("Could not pause webview.", e10);
            }
        }
    }

    public final void onResume() {
        if (!zzaz()) {
            try {
                super.onResume();
            } catch (Exception e10) {
                zzcat.zzh("Could not resume webview.", e10);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzL() || this.zzn.zzJ()) {
            zzaro zzaro = this.zzc;
            if (zzaro != null) {
                zzaro.zzd(motionEvent);
            }
            zzbdk zzbdk = this.zzd;
            if (zzbdk != null) {
                zzbdk.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbfb zzbfb = this.zzC;
                if (zzbfb != null) {
                    zzbfb.zzd(motionEvent);
                }
            }
        }
        if (zzaz()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcgi) {
            this.zzn = (zzcgi) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!zzaz()) {
            try {
                super.stopLoading();
            } catch (Exception e10) {
                zzcat.zzh("Could not stop loading webview.", e10);
            }
        }
    }

    public final synchronized void zzA(int i10) {
        this.zzL = i10;
    }

    public final void zzB(int i10) {
    }

    public final synchronized void zzC(zzcgx zzcgx) {
        if (this.zzz != null) {
            zzcat.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcgx;
        }
    }

    public final zzfcr zzD() {
        return this.zzj;
    }

    public final Context zzE() {
        return this.zzb.zzb();
    }

    public final View zzF() {
        return this;
    }

    public final WebView zzG() {
        return this;
    }

    public final WebViewClient zzH() {
        return this.zzn;
    }

    public final zzaro zzI() {
        return this.zzc;
    }

    public final synchronized zzawj zzJ() {
        return this.zzE;
    }

    public final synchronized zzbfb zzK() {
        return this.zzC;
    }

    public final synchronized zzl zzL() {
        return this.zzo;
    }

    public final synchronized zzl zzM() {
        return this.zzM;
    }

    public final /* synthetic */ zzcho zzN() {
        return this.zzn;
    }

    public final synchronized zzchq zzO() {
        return this.zzq;
    }

    public final zzfcv zzP() {
        return this.zzk;
    }

    public final synchronized zzfkc zzQ() {
        return this.zzp;
    }

    public final e zzR() {
        zzbdk zzbdk = this.zzd;
        if (zzbdk == null) {
            return zzfzt.zzh((Object) null);
        }
        return zzbdk.zza();
    }

    public final synchronized String zzS() {
        return this.zzr;
    }

    public final void zzT(zzfcr zzfcr, zzfcv zzfcv) {
        this.zzj = zzfcr;
        this.zzk = zzfcv;
    }

    public final synchronized void zzU() {
        zze.zza("Destroying WebView!");
        zzaT();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcgt(this));
    }

    public final void zzV() {
        zzaY();
        HashMap hashMap = new HashMap(1);
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zze.zza);
        zzd("onhide", hashMap);
    }

    public final void zzW(int i10) {
        if (i10 == 0) {
            zzbcy zzbcy = this.zzK;
            zzbcs.zza(zzbcy.zza(), this.zzI, "aebb2");
        }
        zzaY();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i10));
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zze.zza);
        zzd("onhide", hashMap);
    }

    public final void zzX() {
        if (this.zzH == null) {
            zzbcy zzbcy = this.zzK;
            zzbcs.zza(zzbcy.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbcx zzf2 = zzbda.zzf();
            this.zzH = zzf2;
            this.zzK.zzb("native:view_show", zzf2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zze.zza);
        zzd("onshow", hashMap);
    }

    public final void zzY() {
        throw null;
    }

    public final void zzZ(boolean z10) {
        this.zzn.zzi(z10);
    }

    public final void zza(String str) {
        throw null;
    }

    public final synchronized boolean zzaA() {
        return this.zzu;
    }

    public final boolean zzaB() {
        return false;
    }

    public final synchronized boolean zzaC() {
        return this.zzx;
    }

    public final void zzaD(zzc zzc2, boolean z10) {
        this.zzn.zzt(zzc2, z10);
    }

    public final void zzaE(String str, String str2, int i10) {
        this.zzn.zzu(str, str2, 14);
    }

    public final void zzaF(boolean z10, int i10, boolean z11) {
        this.zzn.zzv(z10, i10, z11);
    }

    public final void zzaG(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zzn.zzx(z10, i10, str, str2, z11);
    }

    public final void zzaH(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zzn.zzy(z10, i10, str, z11, z12);
    }

    public final zzcgi zzaJ() {
        return this.zzn;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Boolean zzaK() {
        return this.zzw;
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzaN(String str, ValueCallback valueCallback) {
        if (!zzaz()) {
            evaluateJavascript(str, (ValueCallback) null);
        } else {
            zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaO(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaK() == null) {
                zzbb();
            }
            if (zzaK().booleanValue()) {
                zzaN(str, (ValueCallback) null);
            } else {
                zzaP("javascript:".concat(str));
            }
        } else {
            zzaP("javascript:".concat(str));
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzaP(String str) {
        if (!zzaz()) {
            loadUrl(str);
        } else {
            zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        zzt.zzo().zzv(bool);
    }

    public final boolean zzaR() {
        int i10;
        int i11;
        boolean z10 = false;
        if (!this.zzn.zzK() && !this.zzn.zzL()) {
            return false;
        }
        zzay.zzb();
        DisplayMetrics displayMetrics = this.zzh;
        int zzv2 = zzcam.zzv(displayMetrics, displayMetrics.widthPixels);
        zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zzh;
        int zzv3 = zzcam.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zza2 = this.zzb.zza();
        if (zza2 == null || zza2.getWindow() == null) {
            i11 = zzv2;
            i10 = zzv3;
        } else {
            zzt.zzp();
            int[] zzP2 = com.google.android.gms.ads.internal.util.zzt.zzP(zza2);
            zzay.zzb();
            int zzv4 = zzcam.zzv(this.zzh, zzP2[0]);
            zzay.zzb();
            i10 = zzcam.zzv(this.zzh, zzP2[1]);
            i11 = zzv4;
        }
        int i12 = this.zzQ;
        if (i12 == zzv2 && this.zzP == zzv3 && this.zzR == i11 && this.zzS == i10) {
            return false;
        }
        if (!(i12 == zzv2 && this.zzP == zzv3)) {
            z10 = true;
        }
        this.zzQ = zzv2;
        this.zzP = zzv3;
        this.zzR = i11;
        this.zzS = i10;
        new zzbry(this, "").zzi(zzv2, zzv3, i11, i10, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
        return z10;
    }

    public final void zzaa() {
        this.zzO.zzb();
    }

    public final synchronized void zzab(String str, String str2, String str3) {
        String str4;
        if (!zzaz()) {
            String[] strArr = new String[1];
            String str5 = (String) zzba.zzc().zzb(zzbci.zzP);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, str5);
                jSONObject.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, "Google Mobile Ads");
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e10) {
                zzcat.zzk("Unable to build MRAID_ENV", e10);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzchh.zza(str2, strArr), "text/html", "UTF-8", (String) null);
            return;
        }
        zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    public final void zzac() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbcx zzf2 = zzbda.zzf();
            this.zzJ = zzf2;
            this.zzK.zzb("native:view_load", zzf2);
        }
    }

    public final void zzad(String str, zzbjj zzbjj) {
        zzcgi zzcgi = this.zzn;
        if (zzcgi != null) {
            zzcgi.zzz(str, zzbjj);
        }
    }

    public final void zzae() {
        throw null;
    }

    public final synchronized void zzaf(zzl zzl2) {
        this.zzo = zzl2;
    }

    public final synchronized void zzag(zzchq zzchq) {
        this.zzq = zzchq;
        requestLayout();
    }

    public final synchronized void zzah(zzawj zzawj) {
        this.zzE = zzawj;
    }

    public final synchronized void zzai(boolean z10) {
        this.zzx = z10;
    }

    public final void zzaj() {
        setBackgroundColor(0);
    }

    public final void zzak(Context context) {
        this.zzb.setBaseContext(context);
        this.zzO.zze(this.zzb.zza());
    }

    public final synchronized void zzal(boolean z10) {
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzy(this.zzn.zzK(), z10);
        } else {
            this.zzs = z10;
        }
    }

    public final synchronized void zzam(zzbez zzbez) {
        this.zzD = zzbez;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzan(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzu     // Catch:{ all -> 0x003a }
            r2.zzu = r3     // Catch:{ all -> 0x003a }
            r2.zzaS()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzQ     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzchq r0 = r2.zzq     // Catch:{ all -> 0x003a }
            boolean r0 = r0.zzi()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            java.lang.String r0 = ""
            com.google.android.gms.internal.ads.zzbry r1 = new com.google.android.gms.internal.ads.zzbry     // Catch:{ all -> 0x003a }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x003a }
            r0 = 1
            if (r0 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r1.zzk(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgu.zzan(boolean):void");
    }

    public final synchronized void zzao(zzbfb zzbfb) {
        this.zzC = zzbfb;
    }

    public final synchronized void zzap(zzfkc zzfkc) {
        this.zzp = zzfkc;
    }

    public final synchronized void zzaq(int i10) {
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzA(i10);
        }
    }

    public final synchronized void zzar(zzl zzl2) {
        this.zzM = zzl2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzas(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zzF     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.zzF = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            com.google.android.gms.ads.internal.overlay.zzl r3 = r2.zzo     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.zzE()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgu.zzas(boolean):void");
    }

    public final synchronized void zzat(boolean z10) {
        if (z10) {
            setBackgroundColor(0);
        }
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzB(z10);
        }
    }

    public final void zzau(String str, zzbjj zzbjj) {
        zzcgi zzcgi = this.zzn;
        if (zzcgi != null) {
            zzcgi.zzH(str, zzbjj);
        }
    }

    public final void zzav(String str, Predicate predicate) {
        zzcgi zzcgi = this.zzn;
        if (zzcgi != null) {
            zzcgi.zzI(str, predicate);
        }
    }

    public final synchronized boolean zzaw() {
        return this.zzs;
    }

    public final synchronized boolean zzax() {
        return this.zzF > 0;
    }

    public final boolean zzay(boolean z10, int i10) {
        destroy();
        this.zzV.zzb(new zzcgr(z10, i10));
        this.zzV.zzc(10003);
        return true;
    }

    public final synchronized boolean zzaz() {
        return this.zzt;
    }

    public final void zzb(String str, String str2) {
        zzaO(str + "(" + str2 + ");");
    }

    public final void zzbK() {
        zzcgi zzcgi = this.zzn;
        if (zzcgi != null) {
            zzcgi.zzbK();
        }
    }

    public final synchronized void zzbj() {
        com.google.android.gms.ads.internal.zzl zzl2 = this.zzf;
        if (zzl2 != null) {
            zzl2.zzbj();
        }
    }

    public final synchronized void zzbk() {
        com.google.android.gms.ads.internal.zzl zzl2 = this.zzf;
        if (zzl2 != null) {
            zzl2.zzbk();
        }
    }

    public final synchronized String zzbl() {
        zzfcv zzfcv = this.zzk;
        if (zzfcv == null) {
            return null;
        }
        return zzfcv.zzb;
    }

    public final synchronized String zzbm() {
        return this.zzy;
    }

    public final void zzbt(zzauv zzauv) {
        boolean z10;
        synchronized (this) {
            z10 = zzauv.zzj;
            this.zzA = z10;
        }
        zzaV(z10);
    }

    public final void zzd(String str, Map map) {
        try {
            zze(str, zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcat.zzj("Could not convert parameters to JSON.");
        }
    }

    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zzcat.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaO(sb.toString());
    }

    public final synchronized int zzf() {
        return this.zzL;
    }

    public final int zzg() {
        return getMeasuredHeight();
    }

    public final int zzh() {
        return getMeasuredWidth();
    }

    public final Activity zzi() {
        return this.zzb.zza();
    }

    public final zza zzj() {
        return this.zzg;
    }

    public final zzbcx zzk() {
        return this.zzI;
    }

    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    public final zzbcy zzm() {
        return this.zzK;
    }

    public final zzcaz zzn() {
        return this.zze;
    }

    public final zzccr zzo() {
        return null;
    }

    public final synchronized zzcen zzp(String str) {
        Map map = this.zzT;
        if (map == null) {
            return null;
        }
        return (zzcen) map.get(str);
    }

    public final synchronized zzcgx zzq() {
        return this.zzz;
    }

    public final void zzs() {
        zzcgi zzcgi = this.zzn;
        if (zzcgi != null) {
            zzcgi.zzs();
        }
    }

    public final synchronized void zzt(String str, zzcen zzcen) {
        if (this.zzT == null) {
            this.zzT = new HashMap();
        }
        this.zzT.put(str, zzcen);
    }

    public final void zzu() {
        zzl zzL2 = zzL();
        if (zzL2 != null) {
            zzL2.zzd();
        }
    }

    public final void zzv(boolean z10, long j10) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        hashMap.put("duration", Long.toString(j10));
        zzd("onCacheAccessComplete", hashMap);
    }

    public final synchronized void zzw() {
        zzbez zzbez = this.zzD;
        if (zzbez != null) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzdnh((zzdnj) zzbez));
        }
    }

    public final void zzx(int i10) {
    }

    public final void zzy(int i10) {
    }

    public final void zzz(boolean z10) {
        this.zzn.zzC(false);
    }
}
