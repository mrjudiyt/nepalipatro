package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.z;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzcgi extends WebViewClient implements zzcho {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final HashSet zzD;
    private final zzedz zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzbxu zza;
    private final zzcgb zzc;
    private final zzaxv zzd;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private zza zzg;
    private zzo zzh;
    private zzchm zzi;
    private zzchn zzj;
    private zzbhz zzk;
    private zzbib zzl;
    private zzdfd zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private zzz zzv;
    private zzbrx zzw;
    private zzb zzx;
    private zzbrs zzy;
    private boolean zzz;

    public zzcgi(zzcgb zzcgb, zzaxv zzaxv, boolean z10, zzbrx zzbrx, zzbrs zzbrs, zzedz zzedz) {
        this.zzd = zzaxv;
        this.zzc = zzcgb;
        this.zzs = z10;
        this.zzw = zzbrx;
        this.zzy = null;
        this.zzD = new HashSet(Arrays.asList(((String) zzba.zzc().zzb(zzbci.zzfA)).split(",")));
        this.zzE = zzedz;
    }

    private static WebResourceResponse zzN() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzaI)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzO(String str, Map map) {
        HttpURLConnection httpURLConnection;
        String str2;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        zzt.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, 60000);
                        zzcas zzcas = new zzcas((String) null);
                        zzcas.zzc(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzcas.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            zzt.zzp();
                            zzt.zzp();
                            String contentType = httpURLConnection.getContentType();
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    zzcat.zzj("Protocol is null");
                                    WebResourceResponse zzN = zzN();
                                    TrafficStats.clearThreadStatsTag();
                                    return zzN;
                                } else if (protocol.equals("http") || protocol.equals("https")) {
                                    zzcat.zze("Redirecting to " + headerField);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    zzcat.zzj("Unsupported scheme: " + protocol);
                                    return zzN();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            zzt.zzp();
            zzt.zzp();
            String contentType2 = httpURLConnection.getContentType();
            String str3 = "";
            if (TextUtils.isEmpty(contentType2)) {
                str2 = str3;
            } else {
                str2 = contentType2.split(";")[0].trim();
            }
            zzt.zzp();
            String contentType3 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType3)) {
                String[] split = contentType3.split(";");
                if (split.length != 1) {
                    int i11 = 1;
                    while (true) {
                        if (i11 >= split.length) {
                            break;
                        }
                        if (split[i11].trim().startsWith("charset")) {
                            String[] split2 = split[i11].trim().split("=");
                            if (split2.length > 1) {
                                str3 = split2[1].trim();
                                break;
                            }
                        }
                        i11++;
                    }
                }
            }
            String str4 = str3;
            Map headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry entry2 : headerFields.entrySet()) {
                if (!(entry2.getKey() == null || entry2.getValue() == null || ((List) entry2.getValue()).isEmpty())) {
                    hashMap.put((String) entry2.getKey(), (String) ((List) entry2.getValue()).get(0));
                }
            }
            WebResourceResponse zzc2 = zzt.zzq().zzc(str2, str4, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            TrafficStats.clearThreadStatsTag();
            return zzc2;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjj) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener != null) {
            ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    public final void zzR(View view, zzbxu zzbxu, int i10) {
        if (zzbxu.zzi() && i10 > 0) {
            zzbxu.zzg(view);
            if (zzbxu.zzi()) {
                com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new zzcgc(this, view, zzbxu, i10), 100);
            }
        }
    }

    private static final boolean zzS(zzcgb zzcgb) {
        if (zzcgb.zzD() != null) {
            return zzcgb.zzD().zzak;
        }
        return false;
    }

    private static final boolean zzT(boolean z10, zzcgb zzcgb) {
        return z10 && !zzcgb.zzO().zzi() && !zzcgb.zzS().equals("interstitial_mb");
    }

    public final void onAdClicked() {
        zza zza2 = this.zzg;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r2 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r2.zza();
        r1.zzj = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r1.zzc.zzL() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzkQ)).booleanValue() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r1.zzc.zzL().zzG(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r1.zzz = true;
        r2 = r1.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.Object r2 = r1.zzf
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcgb r0 = r1.zzc     // Catch:{ all -> 0x004c }
            boolean r0 = r0.zzaz()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0017
            java.lang.String r3 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.zze.zza(r3)     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzcgb r3 = r1.zzc     // Catch:{ all -> 0x004c }
            r3.zzU()     // Catch:{ all -> 0x004c }
            monitor-exit(r2)     // Catch:{ all -> 0x004c }
            return
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x004c }
            r2 = 1
            r1.zzz = r2
            com.google.android.gms.internal.ads.zzchn r2 = r1.zzj
            if (r2 == 0) goto L_0x0025
            r2.zza()
            r2 = 0
            r1.zzj = r2
        L_0x0025:
            r1.zzg()
            com.google.android.gms.internal.ads.zzcgb r2 = r1.zzc
            com.google.android.gms.ads.internal.overlay.zzl r2 = r2.zzL()
            if (r2 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzkQ
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r0.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzcgb r2 = r1.zzc
            com.google.android.gms.ads.internal.overlay.zzl r2 = r2.zzL()
            r2.zzG(r3)
        L_0x004b:
            return
        L_0x004c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgi.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzay(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zza zza2 = this.zzg;
                    if (zza2 != null) {
                        zza2.onAdClicked();
                        zzbxu zzbxu = this.zza;
                        if (zzbxu != null) {
                            zzbxu.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdfd zzdfd = this.zzm;
                    if (zzdfd != null) {
                        zzdfd.zzbK();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzaro zzI = this.zzc.zzI();
                    if (zzI != null && zzI.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcgb zzcgb = this.zzc;
                        parse = zzI.zza(parse, context, (View) zzcgb, zzcgb.zzi());
                    }
                } catch (zzarp unused) {
                    zzcat.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                zzb zzb2 = this.zzx;
                if (zzb2 == null || zzb2.zzc()) {
                    zzt(new zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (zzx) null), true);
                } else {
                    zzb2.zzb(str);
                }
            } else {
                zzcat.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        } else {
            zzj(parse);
        }
        return true;
    }

    public final void zzA(zzchm zzchm) {
        this.zzi = zzchm;
    }

    public final void zzB(int i10, int i11) {
        zzbrs zzbrs = this.zzy;
        if (zzbrs != null) {
            zzbrs.zzd(i10, i11);
        }
    }

    public final void zzC(boolean z10) {
        this.zzn = false;
    }

    public final void zzD(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = z10;
        }
    }

    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcbg.zze.execute(new zzcgd(this));
        }
    }

    public final void zzF(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    public final void zzG(zzchn zzchn) {
        this.zzj = zzchn;
    }

    public final void zzH(String str, zzbjj zzbjj) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list != null) {
                list.remove(zzbjj);
            }
        }
    }

    public final void zzI(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbjj> list = (List) this.zze.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzbjj zzbjj : list) {
                    if (predicate.apply(zzbjj)) {
                        arrayList.add(zzbjj);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final boolean zzJ() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    public final boolean zzK() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzL() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0197: MOVE  (r1v43 com.google.android.gms.internal.ads.zzbjv) = (r35v0 com.google.android.gms.internal.ads.zzbjv)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    public final void zzM(com.google.android.gms.ads.internal.client.zza r18, com.google.android.gms.internal.ads.zzbhz r19, com.google.android.gms.ads.internal.overlay.zzo r20, com.google.android.gms.internal.ads.zzbib r21, com.google.android.gms.ads.internal.overlay.zzz r22, boolean r23, com.google.android.gms.internal.ads.zzbjl r24, com.google.android.gms.ads.internal.zzb r25, com.google.android.gms.internal.ads.zzbrz r26, com.google.android.gms.internal.ads.zzbxu r27, com.google.android.gms.internal.ads.zzedo r28, com.google.android.gms.internal.ads.zzfjx r29, com.google.android.gms.internal.ads.zzdso r30, com.google.android.gms.internal.ads.zzfib r31, com.google.android.gms.internal.ads.zzbkc r32, com.google.android.gms.internal.ads.zzdfd r33, com.google.android.gms.internal.ads.zzbkb r34, com.google.android.gms.internal.ads.zzbjv r35, com.google.android.gms.internal.ads.zzcou r36) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r21
            r3 = r24
            r4 = r26
            r5 = r27
            r11 = r28
            r12 = r29
            r13 = r32
            r14 = r33
            r15 = r34
            r10 = r35
            r9 = r36
            if (r25 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzcgb r6 = r0.zzc
            com.google.android.gms.ads.internal.zzb r7 = new com.google.android.gms.ads.internal.zzb
            android.content.Context r6 = r6.getContext()
            r8 = 0
            r7.<init>(r6, r5, r8)
            r8 = r7
            goto L_0x002c
        L_0x002a:
            r8 = r25
        L_0x002c:
            com.google.android.gms.internal.ads.zzcgb r6 = r0.zzc
            com.google.android.gms.internal.ads.zzbrs r7 = new com.google.android.gms.internal.ads.zzbrs
            r7.<init>(r6, r4)
            r0.zzy = r7
            r0.zza = r5
            com.google.android.gms.internal.ads.zzbca r5 = com.google.android.gms.internal.ads.zzbci.zzaQ
            com.google.android.gms.internal.ads.zzbcg r6 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r5 = r6.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.zzbhy r5 = new com.google.android.gms.internal.ads.zzbhy
            r5.<init>(r1)
            java.lang.String r6 = "/adMetadata"
            r0.zzz(r6, r5)
        L_0x0053:
            if (r2 == 0) goto L_0x005f
            com.google.android.gms.internal.ads.zzbia r5 = new com.google.android.gms.internal.ads.zzbia
            r5.<init>(r2)
            java.lang.String r6 = "/appEvent"
            r0.zzz(r6, r5)
        L_0x005f:
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzj
            java.lang.String r6 = "/backButton"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzk
            java.lang.String r6 = "/refresh"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzb
            java.lang.String r6 = "/canOpenApp"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zza
            java.lang.String r6 = "/canOpenURLs"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzc
            java.lang.String r6 = "/canOpenIntents"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzd
            java.lang.String r6 = "/close"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zze
            java.lang.String r6 = "/customClose"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzn
            java.lang.String r6 = "/instrument"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzp
            java.lang.String r6 = "/delayPageLoaded"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzq
            java.lang.String r6 = "/delayPageClosed"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzr
            java.lang.String r6 = "/getLocationInfo"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjj r5 = com.google.android.gms.internal.ads.zzbji.zzg
            java.lang.String r6 = "/log"
            r0.zzz(r6, r5)
            com.google.android.gms.internal.ads.zzbjp r5 = new com.google.android.gms.internal.ads.zzbjp
            com.google.android.gms.internal.ads.zzbrs r6 = r0.zzy
            r5.<init>(r8, r6, r4)
            java.lang.String r4 = "/mraid"
            r0.zzz(r4, r5)
            com.google.android.gms.internal.ads.zzbrx r4 = r0.zzw
            if (r4 == 0) goto L_0x00c8
            java.lang.String r5 = "/mraidLoaded"
            r0.zzz(r5, r4)
        L_0x00c8:
            com.google.android.gms.internal.ads.zzbju r7 = new com.google.android.gms.internal.ads.zzbju
            com.google.android.gms.internal.ads.zzbrs r6 = r0.zzy
            r4 = r7
            r5 = r8
            r2 = r7
            r7 = r28
            r16 = r8
            r8 = r30
            r1 = r9
            r9 = r31
            r10 = r36
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.String r4 = "/open"
            r0.zzz(r4, r2)
            com.google.android.gms.internal.ads.zzceo r2 = new com.google.android.gms.internal.ads.zzceo
            r2.<init>()
            java.lang.String r4 = "/precache"
            r0.zzz(r4, r2)
            com.google.android.gms.internal.ads.zzbjj r2 = com.google.android.gms.internal.ads.zzbji.zzi
            java.lang.String r4 = "/touch"
            r0.zzz(r4, r2)
            com.google.android.gms.internal.ads.zzbjj r2 = com.google.android.gms.internal.ads.zzbji.zzl
            java.lang.String r4 = "/video"
            r0.zzz(r4, r2)
            com.google.android.gms.internal.ads.zzbjj r2 = com.google.android.gms.internal.ads.zzbji.zzm
            java.lang.String r4 = "/videoMeta"
            r0.zzz(r4, r2)
            java.lang.String r2 = "/httpTrack"
            java.lang.String r4 = "/click"
            if (r11 == 0) goto L_0x011a
            if (r12 == 0) goto L_0x011a
            com.google.android.gms.internal.ads.zzfdt r5 = new com.google.android.gms.internal.ads.zzfdt
            r5.<init>(r14, r1, r12, r11)
            r0.zzz(r4, r5)
            com.google.android.gms.internal.ads.zzfdu r1 = new com.google.android.gms.internal.ads.zzfdu
            r1.<init>(r12, r11)
            r0.zzz(r2, r1)
            goto L_0x0127
        L_0x011a:
            com.google.android.gms.internal.ads.zzbih r5 = new com.google.android.gms.internal.ads.zzbih
            r5.<init>(r14, r1)
            r0.zzz(r4, r5)
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzf
            r0.zzz(r2, r1)
        L_0x0127:
            com.google.android.gms.internal.ads.zzcgb r1 = r0.zzc
            com.google.android.gms.internal.ads.zzbyy r2 = com.google.android.gms.ads.internal.zzt.zzn()
            android.content.Context r1 = r1.getContext()
            boolean r1 = r2.zzu(r1)
            if (r1 == 0) goto L_0x0147
            com.google.android.gms.internal.ads.zzcgb r1 = r0.zzc
            com.google.android.gms.internal.ads.zzbjo r2 = new com.google.android.gms.internal.ads.zzbjo
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1)
            java.lang.String r1 = "/logScionEvent"
            r0.zzz(r1, r2)
        L_0x0147:
            if (r3 == 0) goto L_0x0153
            com.google.android.gms.internal.ads.zzbjk r1 = new com.google.android.gms.internal.ads.zzbjk
            r1.<init>(r3)
            java.lang.String r2 = "/setInterstitialProperties"
            r0.zzz(r2, r1)
        L_0x0153:
            if (r13 == 0) goto L_0x016c
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zziF
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x016c
            java.lang.String r1 = "/inspectorNetworkExtras"
            r0.zzz(r1, r13)
        L_0x016c:
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zziY
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0185
            if (r15 == 0) goto L_0x0185
            java.lang.String r1 = "/shareSheet"
            r0.zzz(r1, r15)
        L_0x0185:
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzjd
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01a0
            r1 = r35
            if (r1 == 0) goto L_0x01a0
            java.lang.String r2 = "/inspectorOutOfContextTest"
            r0.zzz(r2, r1)
        L_0x01a0:
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzkx
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01d5
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzu
            java.lang.String r2 = "/bindPlayStoreOverlay"
            r0.zzz(r2, r1)
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzv
            java.lang.String r2 = "/presentPlayStoreOverlay"
            r0.zzz(r2, r1)
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzw
            java.lang.String r2 = "/expandPlayStoreOverlay"
            r0.zzz(r2, r1)
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzx
            java.lang.String r2 = "/collapsePlayStoreOverlay"
            r0.zzz(r2, r1)
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzy
            java.lang.String r2 = "/closePlayStoreOverlay"
            r0.zzz(r2, r1)
        L_0x01d5:
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzcX
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01f5
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzA
            java.lang.String r2 = "/setPAIDPersonalizationEnabled"
            r0.zzz(r2, r1)
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzz
            java.lang.String r2 = "/resetPAID"
            r0.zzz(r2, r1)
        L_0x01f5:
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzkP
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0225
            com.google.android.gms.internal.ads.zzcgb r1 = r0.zzc
            com.google.android.gms.internal.ads.zzfcr r2 = r1.zzD()
            if (r2 == 0) goto L_0x0225
            com.google.android.gms.internal.ads.zzfcr r1 = r1.zzD()
            boolean r1 = r1.zzas
            if (r1 == 0) goto L_0x0225
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzB
            java.lang.String r2 = "/writeToLocalStorage"
            r0.zzz(r2, r1)
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbji.zzC
            java.lang.String r2 = "/clearLocalStorageKeys"
            r0.zzz(r2, r1)
        L_0x0225:
            r1 = r18
            r0.zzg = r1
            r1 = r20
            r0.zzh = r1
            r1 = r19
            r0.zzk = r1
            r1 = r21
            r0.zzl = r1
            r1 = r22
            r0.zzv = r1
            r7 = r16
            r0.zzx = r7
            r0.zzm = r14
            r1 = r23
            r0.zzn = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgi.zzM(com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzbhz, com.google.android.gms.ads.internal.overlay.zzo, com.google.android.gms.internal.ads.zzbib, com.google.android.gms.ads.internal.overlay.zzz, boolean, com.google.android.gms.internal.ads.zzbjl, com.google.android.gms.ads.internal.zzb, com.google.android.gms.internal.ads.zzbrz, com.google.android.gms.internal.ads.zzbxu, com.google.android.gms.internal.ads.zzedo, com.google.android.gms.internal.ads.zzfjx, com.google.android.gms.internal.ads.zzdso, com.google.android.gms.internal.ads.zzfib, com.google.android.gms.internal.ads.zzbkc, com.google.android.gms.internal.ads.zzdfd, com.google.android.gms.internal.ads.zzbkb, com.google.android.gms.internal.ads.zzbjv, com.google.android.gms.internal.ads.zzcou):void");
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final void zzbK() {
        zzdfd zzdfd = this.zzm;
        if (zzdfd != null) {
            zzdfd.zzbK();
        }
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzc(String str, Map map) {
        zzaxe zzb2;
        try {
            String zzc2 = zzbza.zzc(str, this.zzc.getContext(), this.zzC);
            if (!zzc2.equals(str)) {
                return zzO(zzc2, map);
            }
            zzaxh zza2 = zzaxh.zza(Uri.parse(str));
            if (zza2 != null && (zzb2 = zzt.zzc().zzb(zza2)) != null && zzb2.zze()) {
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            if (!zzcas.zzk() || !((Boolean) zzbdx.zzb.zze()).booleanValue()) {
                return null;
            }
            return zzO(str, map);
        } catch (Exception | NoClassDefFoundError e10) {
            zzt.zzo().zzu(e10, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    public final zzb zzd() {
        return this.zzx;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && this.zzc.zzm() != null) {
                zzbcs.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzchm zzchm = this.zzi;
            boolean z10 = false;
            if (!this.zzA && !this.zzo) {
                z10 = true;
            }
            zzchm.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbxu zzbxu = this.zza;
        if (zzbxu != null) {
            zzbxu.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbrs zzbrs = this.zzy;
            if (zzbrs != null) {
                zzbrs.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z10) {
        this.zzC = z10;
    }

    public final void zzj(Uri uri) {
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (((Boolean) zzba.zzc().zzb(zzbci.zzgI)).booleanValue() && zzt.zzo().zzf() != null) {
                zzcbg.zza.execute(new zzcge((path == null || path.length() < 2) ? "null" : path.substring(1)));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfz)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzba.zzc().zzb(zzbci.zzfB)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzfzt.zzr(zzt.zzp().zzb(uri), new zzcgg(this, list, path, uri), zzcbg.zze);
                return;
            }
        }
        zzt.zzp();
        zzP(com.google.android.gms.ads.internal.util.zzt.zzO(uri), list, path);
    }

    public final void zzk() {
        zzaxv zzaxv = this.zzd;
        if (zzaxv != null) {
            zzaxv.zzc(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    public final void zzm() {
        this.zzB--;
        zzg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn() {
        this.zzc.zzaa();
        zzl zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(View view, zzbxu zzbxu, int i10) {
        zzR(view, zzbxu, i10 - 1);
    }

    public final void zzp(int i10, int i11, boolean z10) {
        zzbrx zzbrx = this.zzw;
        if (zzbrx != null) {
            zzbrx.zzb(i10, i11);
        }
        zzbrs zzbrs = this.zzy;
        if (zzbrs != null) {
            zzbrs.zzc(i10, i11, false);
        }
    }

    public final void zzq() {
        zzbxu zzbxu = this.zza;
        if (zzbxu != null) {
            WebView zzG = this.zzc.zzG();
            if (z.E(zzG)) {
                zzR(zzG, zzbxu, 10);
                return;
            }
            zzQ();
            zzcgf zzcgf = new zzcgf(this, zzbxu);
            this.zzF = zzcgf;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcgf);
        }
    }

    public final void zzs() {
        zzdfd zzdfd = this.zzm;
        if (zzdfd != null) {
            zzdfd.zzs();
        }
    }

    public final void zzt(zzc zzc2, boolean z10) {
        zzdfd zzdfd;
        zzcgb zzcgb = this.zzc;
        boolean zzaA = zzcgb.zzaA();
        boolean zzT = zzT(zzaA, zzcgb);
        boolean z11 = true;
        if (!zzT && z10) {
            z11 = false;
        }
        zza zza2 = zzT ? null : this.zzg;
        zzo zzo2 = zzaA ? null : this.zzh;
        zzz zzz2 = this.zzv;
        zzcgb zzcgb2 = this.zzc;
        zzcaz zzn2 = zzcgb2.zzn();
        if (z11) {
            zzdfd = null;
        } else {
            zzdfd = this.zzm;
        }
        zzw(new AdOverlayInfoParcel(zzc2, zza2, zzo2, zzz2, zzn2, zzcgb2, zzdfd));
    }

    public final void zzu(String str, String str2, int i10) {
        zzedz zzedz = this.zzE;
        zzcgb zzcgb = this.zzc;
        zzw(new AdOverlayInfoParcel(zzcgb, zzcgb.zzn(), str, str2, 14, zzedz));
    }

    public final void zzv(boolean z10, int i10, boolean z11) {
        zzdfd zzdfd;
        zzcgb zzcgb = this.zzc;
        boolean zzT = zzT(zzcgb.zzaA(), zzcgb);
        boolean z12 = true;
        if (!zzT && z11) {
            z12 = false;
        }
        zza zza2 = zzT ? null : this.zzg;
        zzo zzo2 = this.zzh;
        zzz zzz2 = this.zzv;
        zzcgb zzcgb2 = this.zzc;
        zzcaz zzn2 = zzcgb2.zzn();
        if (z12) {
            zzdfd = null;
        } else {
            zzdfd = this.zzm;
        }
        zzw(new AdOverlayInfoParcel(zza2, zzo2, zzz2, zzcgb2, z10, i10, zzn2, zzdfd, zzS(this.zzc) ? this.zzE : null));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc2;
        zzbrs zzbrs = this.zzy;
        boolean zze2 = zzbrs != null ? zzbrs.zze() : false;
        zzt.zzi();
        zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zze2);
        zzbxu zzbxu = this.zza;
        if (zzbxu != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzc2 = adOverlayInfoParcel.zza) != null) {
                str = zzc2.zzb;
            }
            zzbxu.zzh(str);
        }
    }

    public final void zzx(boolean z10, int i10, String str, String str2, boolean z11) {
        zza zza2;
        zzcgh zzcgh;
        zzdfd zzdfd;
        zzcgb zzcgb = this.zzc;
        boolean zzaA = zzcgb.zzaA();
        boolean zzT = zzT(zzaA, zzcgb);
        boolean z12 = true;
        if (!zzT && z11) {
            z12 = false;
        }
        if (zzT) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        if (zzaA) {
            zzcgh = null;
        } else {
            zzcgh = new zzcgh(this.zzc, this.zzh);
        }
        zzbhz zzbhz = this.zzk;
        zzbib zzbib = this.zzl;
        zzz zzz2 = this.zzv;
        zzcgb zzcgb2 = this.zzc;
        zzcaz zzn2 = zzcgb2.zzn();
        if (z12) {
            zzdfd = null;
        } else {
            zzdfd = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza2, (zzo) zzcgh, zzbhz, zzbib, zzz2, zzcgb2, z10, i10, str, str2, zzn2, zzdfd, (zzbso) zzS(this.zzc) ? this.zzE : null);
        zzw(adOverlayInfoParcel);
    }

    public final void zzy(boolean z10, int i10, String str, boolean z11, boolean z12) {
        zza zza2;
        zzcgh zzcgh;
        zzdfd zzdfd;
        zzcgb zzcgb = this.zzc;
        boolean zzaA = zzcgb.zzaA();
        boolean zzT = zzT(zzaA, zzcgb);
        boolean z13 = true;
        if (!zzT && z11) {
            z13 = false;
        }
        if (zzT) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        if (zzaA) {
            zzcgh = null;
        } else {
            zzcgh = new zzcgh(this.zzc, this.zzh);
        }
        zzbhz zzbhz = this.zzk;
        zzbib zzbib = this.zzl;
        zzz zzz2 = this.zzv;
        zzcgb zzcgb2 = this.zzc;
        zzcaz zzn2 = zzcgb2.zzn();
        if (z13) {
            zzdfd = null;
        } else {
            zzdfd = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza2, (zzo) zzcgh, zzbhz, zzbib, zzz2, zzcgb2, z10, i10, str, zzn2, zzdfd, (zzbso) zzS(this.zzc) ? this.zzE : null, z12);
        zzw(adOverlayInfoParcel);
    }

    public final void zzz(String str, zzbjj zzbjj) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbjj);
        }
    }
}
