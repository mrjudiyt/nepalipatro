package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzeea;
import com.google.android.gms.internal.ads.zzeeb;
import com.google.android.gms.internal.ads.zzfkc;
import com.google.android.gms.internal.ads.zzfps;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzl extends zzbsu implements zzad {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcgb zzd;
    zzh zze;
    zzr zzf;
    boolean zzg = false;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    boolean zzj = false;
    boolean zzk = false;
    zzg zzl;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;
    private TextView zzv;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzaE)).booleanValue() != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzaD)).booleanValue() != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.zzo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzJ(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.zzc
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.ads.internal.zzj r0 = r0.zzo
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.zzb
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.app.Activity r3 = r5.zzb
            com.google.android.gms.ads.internal.util.zzab r4 = com.google.android.gms.ads.internal.zzt.zzq()
            boolean r6 = r4.zze(r3, r6)
            boolean r3 = r5.zzk
            if (r3 == 0) goto L_0x0033
            if (r0 != 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzaE
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0048
        L_0x0033:
            if (r6 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzbca r6 = com.google.android.gms.internal.ads.zzbci.zzaD
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r6 = r0.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = 0
            goto L_0x0057
        L_0x004a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.zzc
            if (r6 == 0) goto L_0x0057
            com.google.android.gms.ads.internal.zzj r6 = r6.zzo
            if (r6 == 0) goto L_0x0057
            boolean r6 = r6.zzg
            if (r6 == 0) goto L_0x0057
            r2 = 1
        L_0x0057:
            android.app.Activity r6 = r5.zzb
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzbd
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0083
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L_0x007d
            if (r2 == 0) goto L_0x007a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L_0x007f
        L_0x007a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L_0x007f
        L_0x007d:
            r0 = 256(0x100, float:3.59E-43)
        L_0x007f:
            r6.setSystemUiVisibility(r0)
            return
        L_0x0083:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x009b
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L_0x009a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L_0x009a:
            return
        L_0x009b:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzJ(android.content.res.Configuration):void");
    }

    private static final void zzK(zzfkc zzfkc, View view) {
        if (zzfkc != null && view != null) {
            zzt.zzA().zzh(zzfkc, view);
        }
    }

    public final void zzA(int i10) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zzb(zzbci.zzfU)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zzb(zzbci.zzfV)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzba.zzc().zzb(zzbci.zzfW)).intValue()) {
                    if (i11 <= ((Integer) zzba.zzc().zzb(zzbci.zzfX)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i10);
        } catch (Throwable th) {
            zzt.zzo().zzt(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z10) {
        if (z10) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8 A[SYNTHETIC, Splitter:B:38:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzD(boolean r27) {
        /*
            r26 = this;
            r1 = r26
            boolean r0 = r1.zzr
            r2 = 1
            if (r0 != 0) goto L_0x000c
            android.app.Activity r0 = r1.zzb
            r0.requestWindowFeature(r2)
        L_0x000c:
            android.app.Activity r0 = r1.zzb
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0298
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.zzc
            com.google.android.gms.internal.ads.zzcgb r3 = r3.zzd
            r4 = 0
            if (r3 == 0) goto L_0x0020
            com.google.android.gms.internal.ads.zzcho r3 = r3.zzN()
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            r5 = 0
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.zzK()
            if (r3 == 0) goto L_0x002c
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            r1.zzm = r5
            if (r3 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.zzc
            int r6 = r6.zzj
            r7 = 6
            if (r6 != r7) goto L_0x004c
            android.app.Activity r6 = r1.zzb
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            if (r6 != r2) goto L_0x0048
            r6 = 1
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            r1.zzm = r6
            goto L_0x0065
        L_0x004c:
            r7 = 7
            if (r6 != r7) goto L_0x0064
            android.app.Activity r6 = r1.zzb
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 != r7) goto L_0x0060
            r6 = 1
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            r1.zzm = r6
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Delay onShow to next orientation change: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.google.android.gms.internal.ads.zzcat.zze(r6)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.zzc
            int r6 = r6.zzj
            r1.zzA(r6)
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r0.setFlags(r6, r6)
            java.lang.String r0 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.internal.ads.zzcat.zze(r0)
            boolean r0 = r1.zzk
            if (r0 != 0) goto L_0x0096
            com.google.android.gms.ads.internal.overlay.zzg r0 = r1.zzl
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r6)
            goto L_0x009d
        L_0x0096:
            com.google.android.gms.ads.internal.overlay.zzg r0 = r1.zzl
            int r6 = zza
            r0.setBackgroundColor(r6)
        L_0x009d:
            android.app.Activity r0 = r1.zzb
            com.google.android.gms.ads.internal.overlay.zzg r6 = r1.zzl
            r0.setContentView(r6)
            r1.zzr = r2
            if (r27 == 0) goto L_0x016d
            com.google.android.gms.ads.internal.zzt.zzz()     // Catch:{ Exception -> 0x015f }
            android.app.Activity r6 = r1.zzb     // Catch:{ Exception -> 0x015f }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc     // Catch:{ Exception -> 0x015f }
            com.google.android.gms.internal.ads.zzcgb r0 = r0.zzd     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzchq r0 = r0.zzO()     // Catch:{ Exception -> 0x015f }
            r7 = r0
            goto L_0x00ba
        L_0x00b9:
            r7 = r4
        L_0x00ba:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc     // Catch:{ Exception -> 0x015f }
            com.google.android.gms.internal.ads.zzcgb r0 = r0.zzd     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = r0.zzS()     // Catch:{ Exception -> 0x015f }
            r8 = r0
            goto L_0x00c7
        L_0x00c6:
            r8 = r4
        L_0x00c7:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc     // Catch:{ Exception -> 0x015f }
            com.google.android.gms.internal.ads.zzcaz r13 = r0.zzm     // Catch:{ Exception -> 0x015f }
            com.google.android.gms.internal.ads.zzcgb r0 = r0.zzd     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x00d6
            com.google.android.gms.ads.internal.zza r0 = r0.zzj()     // Catch:{ Exception -> 0x015f }
            r16 = r0
            goto L_0x00d8
        L_0x00d6:
            r16 = r4
        L_0x00d8:
            r9 = 1
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            com.google.android.gms.internal.ads.zzaxv r17 = com.google.android.gms.internal.ads.zzaxv.zza()     // Catch:{ Exception -> 0x015f }
            r18 = 0
            r19 = 0
            r20 = 0
            r10 = r3
            com.google.android.gms.internal.ads.zzcgb r0 = com.google.android.gms.internal.ads.zzcgn.zza(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x015f }
            r1.zzd = r0     // Catch:{ Exception -> 0x015f }
            com.google.android.gms.internal.ads.zzcho r6 = r0.zzN()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            com.google.android.gms.internal.ads.zzbhz r8 = r0.zzp
            com.google.android.gms.internal.ads.zzbib r10 = r0.zze
            com.google.android.gms.ads.internal.overlay.zzz r11 = r0.zzi
            com.google.android.gms.internal.ads.zzcgb r0 = r0.zzd
            if (r0 == 0) goto L_0x0106
            com.google.android.gms.internal.ads.zzcho r0 = r0.zzN()
            com.google.android.gms.ads.internal.zzb r4 = r0.zzd()
        L_0x0106:
            r14 = r4
            r7 = 0
            r9 = 0
            r12 = 1
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r6.zzM(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.google.android.gms.internal.ads.zzcgb r0 = r1.zzd
            com.google.android.gms.internal.ads.zzcho r0 = r0.zzN()
            com.google.android.gms.ads.internal.overlay.zze r4 = new com.google.android.gms.ads.internal.overlay.zze
            r4.<init>(r1)
            r0.zzA(r4)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            java.lang.String r4 = r0.zzl
            if (r4 == 0) goto L_0x013d
            com.google.android.gms.internal.ads.zzcgb r0 = r1.zzd
            r0.loadUrl(r4)
            goto L_0x014d
        L_0x013d:
            java.lang.String r8 = r0.zzh
            if (r8 == 0) goto L_0x0157
            com.google.android.gms.internal.ads.zzcgb r6 = r1.zzd
            java.lang.String r7 = r0.zzf
            r11 = 0
            java.lang.String r9 = "text/html"
            java.lang.String r10 = "UTF-8"
            r6.loadDataWithBaseURL(r7, r8, r9, r10, r11)
        L_0x014d:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            com.google.android.gms.internal.ads.zzcgb r0 = r0.zzd
            if (r0 == 0) goto L_0x0178
            r0.zzar(r1)
            goto L_0x0178
        L_0x0157:
            com.google.android.gms.ads.internal.overlay.zzf r0 = new com.google.android.gms.ads.internal.overlay.zzf
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r0.<init>(r2)
            throw r0
        L_0x015f:
            r0 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            com.google.android.gms.internal.ads.zzcat.zzh(r2, r0)
            com.google.android.gms.ads.internal.overlay.zzf r2 = new com.google.android.gms.ads.internal.overlay.zzf
            java.lang.String r3 = "Could not obtain webview for the overlay."
            r2.<init>(r3, r0)
            throw r2
        L_0x016d:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            com.google.android.gms.internal.ads.zzcgb r0 = r0.zzd
            r1.zzd = r0
            android.app.Activity r4 = r1.zzb
            r0.zzak(r4)
        L_0x0178:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            boolean r0 = r0.zzw
            if (r0 == 0) goto L_0x0191
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 < r4) goto L_0x0191
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            com.google.android.gms.internal.ads.zzcgb r4 = r1.zzd
            android.webkit.WebView r4 = r4.zzG()
            r0.setAcceptThirdPartyCookies(r4, r5)
        L_0x0191:
            com.google.android.gms.internal.ads.zzcgb r0 = r1.zzd
            r0.zzaf(r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            com.google.android.gms.internal.ads.zzcgb r0 = r0.zzd
            if (r0 == 0) goto L_0x01a5
            com.google.android.gms.internal.ads.zzfkc r0 = r0.zzQ()
            com.google.android.gms.ads.internal.overlay.zzg r4 = r1.zzl
            zzK(r0, r4)
        L_0x01a5:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            int r0 = r0.zzk
            r4 = 5
            if (r0 == r4) goto L_0x024b
            com.google.android.gms.internal.ads.zzcgb r0 = r1.zzd
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01c3
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x01c3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.gms.internal.ads.zzcgb r5 = r1.zzd
            android.view.View r5 = r5.zzF()
            r0.removeView(r5)
        L_0x01c3:
            boolean r0 = r1.zzk
            if (r0 == 0) goto L_0x01cc
            com.google.android.gms.internal.ads.zzcgb r0 = r1.zzd
            r0.zzaj()
        L_0x01cc:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            boolean r0 = r0.zzw
            if (r0 == 0) goto L_0x023f
            android.app.Activity r0 = r1.zzb
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            r1.zzv = r5
            int r0 = android.view.View.generateViewId()
            r5.setId(r0)
            com.google.android.gms.internal.ads.zzcgb r0 = r1.zzd
            android.view.View r0 = r0.zzF()
            int r5 = android.view.View.generateViewId()
            r0.setId(r5)
            android.widget.TextView r0 = r1.zzv
            android.app.Activity r5 = r1.zzb
            r6 = 16973894(0x1030046, float:2.4061096E-38)
            r0.setTextAppearance(r5, r6)
            android.widget.TextView r0 = r1.zzv
            r5 = 50
            r0.setMinHeight(r5)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r5 = -2
            r0.<init>(r5, r5)
            r6 = 10
            r0.addRule(r6)
            r6 = 9
            r0.addRule(r6)
            android.widget.TextView r6 = r1.zzv
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            com.google.android.gms.ads.internal.overlay.zzg r6 = r1.zzl
            android.widget.TextView r7 = r1.zzv
            r6.addView(r7, r0)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r5, r5)
            r5 = 3
            android.widget.TextView r6 = r1.zzv
            int r6 = r6.getId()
            r0.addRule(r5, r6)
            r5 = 12
            r0.addRule(r5)
            com.google.android.gms.ads.internal.overlay.zzg r5 = r1.zzl
            com.google.android.gms.internal.ads.zzcgb r6 = r1.zzd
            android.view.View r6 = r6.zzF()
            r5.addView(r6, r0)
            goto L_0x024b
        L_0x023f:
            com.google.android.gms.ads.internal.overlay.zzg r0 = r1.zzl
            com.google.android.gms.internal.ads.zzcgb r5 = r1.zzd
            android.view.View r5 = r5.zzF()
            r6 = -1
            r0.addView(r5, r6, r6)
        L_0x024b:
            if (r27 != 0) goto L_0x0254
            boolean r0 = r1.zzm
            if (r0 != 0) goto L_0x0254
            r26.zze()
        L_0x0254:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            int r0 = r0.zzk
            if (r0 == r4) goto L_0x0269
            r1.zzw(r3)
            com.google.android.gms.internal.ads.zzcgb r0 = r1.zzd
            boolean r0 = r0.zzaw()
            if (r0 == 0) goto L_0x0268
            r1.zzy(r3, r2)
        L_0x0268:
            return
        L_0x0269:
            android.app.Activity r0 = r1.zzb
            com.google.android.gms.internal.ads.zzeea r2 = com.google.android.gms.internal.ads.zzeeb.zze()
            r2.zza(r0)
            r2.zzb(r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            java.lang.String r0 = r0.zzq
            r2.zzc(r0)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zzc
            java.lang.String r0 = r0.zzr
            r2.zzd(r0)
            com.google.android.gms.internal.ads.zzeeb r0 = r2.zze()
            r1.zzf(r0)     // Catch:{ zzf -> 0x028d, RemoteException -> 0x028b }
            return
        L_0x028b:
            r0 = move-exception
            goto L_0x028e
        L_0x028d:
            r0 = move-exception
        L_0x028e:
            com.google.android.gms.ads.internal.overlay.zzf r2 = new com.google.android.gms.ads.internal.overlay.zzf
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x0298:
            com.google.android.gms.ads.internal.overlay.zzf r0 = new com.google.android.gms.ads.internal.overlay.zzf
            java.lang.String r2 = "Invalid activity, no window available."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzD(boolean):void");
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzq = true;
            Runnable runnable = this.zzp;
            if (runnable != null) {
                zzfps zzfps = com.google.android.gms.ads.internal.util.zzt.zza;
                zzfps.removeCallbacks(runnable);
                zzfps.post(this.zzp);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzo2;
        if (this.zzb.isFinishing() && !this.zzs) {
            this.zzs = true;
            zzcgb zzcgb = this.zzd;
            if (zzcgb != null) {
                zzcgb.zzW(this.zzn - 1);
                synchronized (this.zzo) {
                    if (!this.zzq && this.zzd.zzax()) {
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzeG)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzo2 = adOverlayInfoParcel.zzc) != null) {
                            zzo2.zzbu();
                        }
                        zzd zzd2 = new zzd(this);
                        this.zzp = zzd2;
                        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(zzd2, ((Long) zzba.zzc().zzb(zzbci.zzaW)).longValue());
                        return;
                    }
                }
            }
            zzc();
        }
    }

    public final void zzG(String str) {
        TextView textView = this.zzv;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbci.zziF)).booleanValue() || !this.zzd.canGoBack()) {
            boolean zzaC = this.zzd.zzaC();
            if (!zzaC) {
                this.zzd.zzd("onbackblocked", Collections.emptyMap());
            }
            return zzaC;
        }
        this.zzd.goBack();
        return false;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzk == 5) {
            this.zzb.overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        zzcgb zzcgb;
        zzo zzo2;
        if (!this.zzt) {
            this.zzt = true;
            zzcgb zzcgb2 = this.zzd;
            if (zzcgb2 != null) {
                this.zzl.removeView(zzcgb2.zzF());
                zzh zzh2 = this.zze;
                if (zzh2 != null) {
                    this.zzd.zzak(zzh2.zzd);
                    this.zzd.zzan(false);
                    ViewGroup viewGroup = this.zze.zzc;
                    View zzF = this.zzd.zzF();
                    zzh zzh3 = this.zze;
                    viewGroup.addView(zzF, zzh3.zza, zzh3.zzb);
                    this.zze = null;
                } else if (this.zzb.getApplicationContext() != null) {
                    this.zzd.zzak(this.zzb.getApplicationContext());
                }
                this.zzd = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            if (!(adOverlayInfoParcel == null || (zzo2 = adOverlayInfoParcel.zzc) == null)) {
                zzo2.zzby(this.zzn);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzcgb = adOverlayInfoParcel2.zzd) != null) {
                zzK(zzcgb.zzQ(), this.zzc.zzd.zzF());
            }
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    /* access modifiers changed from: protected */
    public final void zze() {
        this.zzd.zzX();
    }

    public final void zzf(zzeeb zzeeb) {
        zzbso zzbso;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbso = adOverlayInfoParcel.zzv) == null) {
            throw new zzf("noioou");
        }
        zzbso.zzg(ObjectWrapper.wrap(zzeeb));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    public final void zzh(int i10, int i11, Intent intent) {
    }

    public final void zzi() {
        this.zzn = 1;
    }

    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092 A[Catch:{ zzf -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5 A[Catch:{ zzf -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a A[Catch:{ zzf -> 0x0116 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzl(android.os.Bundle r9) {
        /*
            r8 = this;
            boolean r0 = r8.zzr
            r1 = 1
            if (r0 != 0) goto L_0x000a
            android.app.Activity r0 = r8.zzb
            r0.requestWindowFeature(r1)
        L_0x000a:
            r0 = 0
            if (r9 == 0) goto L_0x0017
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r8.zzj = r2
            r2 = 4
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x0116 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(r3)     // Catch:{ zzf -> 0x0116 }
            r8.zzc = r3     // Catch:{ zzf -> 0x0116 }
            if (r3 == 0) goto L_0x010e
            boolean r3 = r3.zzw     // Catch:{ zzf -> 0x0116 }
            if (r3 == 0) goto L_0x0044
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ zzf -> 0x0116 }
            r4 = 28
            if (r3 < r4) goto L_0x0039
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x0116 }
            r3.setShowWhenLocked(r1)     // Catch:{ zzf -> 0x0116 }
            goto L_0x0044
        L_0x0039:
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x0116 }
            android.view.Window r3 = r3.getWindow()     // Catch:{ zzf -> 0x0116 }
            r4 = 524288(0x80000, float:7.34684E-40)
            r3.addFlags(r4)     // Catch:{ zzf -> 0x0116 }
        L_0x0044:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.zzc     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.internal.ads.zzcaz r3 = r3.zzm     // Catch:{ zzf -> 0x0116 }
            int r3 = r3.zzc     // Catch:{ zzf -> 0x0116 }
            r4 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r3 <= r4) goto L_0x0051
            r8.zzn = r2     // Catch:{ zzf -> 0x0116 }
        L_0x0051:
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x0116 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x0116 }
            if (r3 == 0) goto L_0x0067
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x0116 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x0116 }
            java.lang.String r4 = "shouldCallOnOverlayOpened"
            boolean r3 = r3.getBooleanExtra(r4, r1)     // Catch:{ zzf -> 0x0116 }
            r8.zzu = r3     // Catch:{ zzf -> 0x0116 }
        L_0x0067:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.zzc     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.ads.internal.zzj r4 = r3.zzo     // Catch:{ zzf -> 0x0116 }
            r5 = 5
            if (r4 == 0) goto L_0x0075
            boolean r6 = r4.zza     // Catch:{ zzf -> 0x0116 }
            r8.zzk = r6     // Catch:{ zzf -> 0x0116 }
            if (r6 == 0) goto L_0x0090
            goto L_0x007b
        L_0x0075:
            int r6 = r3.zzk     // Catch:{ zzf -> 0x0116 }
            if (r6 != r5) goto L_0x008e
            r8.zzk = r1     // Catch:{ zzf -> 0x0116 }
        L_0x007b:
            int r3 = r3.zzk     // Catch:{ zzf -> 0x0116 }
            if (r3 == r5) goto L_0x0090
            int r3 = r4.zzf     // Catch:{ zzf -> 0x0116 }
            r4 = -1
            if (r3 == r4) goto L_0x0090
            com.google.android.gms.ads.internal.overlay.zzk r3 = new com.google.android.gms.ads.internal.overlay.zzk     // Catch:{ zzf -> 0x0116 }
            r4 = 0
            r3.<init>(r8, r4)     // Catch:{ zzf -> 0x0116 }
            r3.zzb()     // Catch:{ zzf -> 0x0116 }
            goto L_0x0090
        L_0x008e:
            r8.zzk = r0     // Catch:{ zzf -> 0x0116 }
        L_0x0090:
            if (r9 != 0) goto L_0x00be
            boolean r9 = r8.zzu     // Catch:{ zzf -> 0x0116 }
            if (r9 == 0) goto L_0x00a8
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.internal.ads.zzcxy r9 = r9.zzt     // Catch:{ zzf -> 0x0116 }
            if (r9 == 0) goto L_0x009f
            r9.zze()     // Catch:{ zzf -> 0x0116 }
        L_0x009f:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.ads.internal.overlay.zzo r9 = r9.zzc     // Catch:{ zzf -> 0x0116 }
            if (r9 == 0) goto L_0x00a8
            r9.zzbv()     // Catch:{ zzf -> 0x0116 }
        L_0x00a8:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x0116 }
            int r3 = r9.zzk     // Catch:{ zzf -> 0x0116 }
            if (r3 == r1) goto L_0x00be
            com.google.android.gms.ads.internal.client.zza r9 = r9.zzb     // Catch:{ zzf -> 0x0116 }
            if (r9 == 0) goto L_0x00b5
            r9.onAdClicked()     // Catch:{ zzf -> 0x0116 }
        L_0x00b5:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.internal.ads.zzdfd r9 = r9.zzu     // Catch:{ zzf -> 0x0116 }
            if (r9 == 0) goto L_0x00be
            r9.zzbK()     // Catch:{ zzf -> 0x0116 }
        L_0x00be:
            com.google.android.gms.ads.internal.overlay.zzg r9 = new com.google.android.gms.ads.internal.overlay.zzg     // Catch:{ zzf -> 0x0116 }
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.zzc     // Catch:{ zzf -> 0x0116 }
            java.lang.String r6 = r4.zzn     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.internal.ads.zzcaz r7 = r4.zzm     // Catch:{ zzf -> 0x0116 }
            java.lang.String r7 = r7.zza     // Catch:{ zzf -> 0x0116 }
            java.lang.String r4 = r4.zzs     // Catch:{ zzf -> 0x0116 }
            r9.<init>(r3, r6, r7, r4)     // Catch:{ zzf -> 0x0116 }
            r8.zzl = r9     // Catch:{ zzf -> 0x0116 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r3)     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.ads.internal.util.zzab r9 = com.google.android.gms.ads.internal.zzt.zzq()     // Catch:{ zzf -> 0x0116 }
            android.app.Activity r3 = r8.zzb     // Catch:{ zzf -> 0x0116 }
            r9.zzl(r3)     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.zzc     // Catch:{ zzf -> 0x0116 }
            int r3 = r9.zzk     // Catch:{ zzf -> 0x0116 }
            if (r3 == r1) goto L_0x010a
            r4 = 2
            if (r3 == r4) goto L_0x00fd
            r9 = 3
            if (r3 == r9) goto L_0x00f9
            if (r3 != r5) goto L_0x00f1
            r8.zzD(r0)     // Catch:{ zzf -> 0x0116 }
            return
        L_0x00f1:
            com.google.android.gms.ads.internal.overlay.zzf r9 = new com.google.android.gms.ads.internal.overlay.zzf     // Catch:{ zzf -> 0x0116 }
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch:{ zzf -> 0x0116 }
            throw r9     // Catch:{ zzf -> 0x0116 }
        L_0x00f9:
            r8.zzD(r1)     // Catch:{ zzf -> 0x0116 }
            return
        L_0x00fd:
            com.google.android.gms.ads.internal.overlay.zzh r1 = new com.google.android.gms.ads.internal.overlay.zzh     // Catch:{ zzf -> 0x0116 }
            com.google.android.gms.internal.ads.zzcgb r9 = r9.zzd     // Catch:{ zzf -> 0x0116 }
            r1.<init>(r9)     // Catch:{ zzf -> 0x0116 }
            r8.zze = r1     // Catch:{ zzf -> 0x0116 }
            r8.zzD(r0)     // Catch:{ zzf -> 0x0116 }
            return
        L_0x010a:
            r8.zzD(r0)     // Catch:{ zzf -> 0x0116 }
            return
        L_0x010e:
            com.google.android.gms.ads.internal.overlay.zzf r9 = new com.google.android.gms.ads.internal.overlay.zzf     // Catch:{ zzf -> 0x0116 }
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch:{ zzf -> 0x0116 }
            throw r9     // Catch:{ zzf -> 0x0116 }
        L_0x0116:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.google.android.gms.internal.ads.zzcat.zzj(r9)
            r8.zzn = r2
            android.app.Activity r9 = r8.zzb
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzl(android.os.Bundle):void");
    }

    public final void zzm() {
        zzcgb zzcgb = this.zzd;
        if (zzcgb != null) {
            try {
                this.zzl.removeView(zzcgb.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    public final void zzo() {
        zzo zzo2;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (!(adOverlayInfoParcel == null || (zzo2 = adOverlayInfoParcel.zzc) == null)) {
            zzo2.zzbo();
        }
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeI)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    public final void zzp(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.zzb;
            zzeea zze2 = zzeeb.zze();
            zze2.zza(activity);
            zze2.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzf(strArr, iArr, ObjectWrapper.wrap(zze2.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzq() {
    }

    public final void zzr() {
        zzo zzo2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (!(adOverlayInfoParcel == null || (zzo2 = adOverlayInfoParcel.zzc) == null)) {
            zzo2.zzbL();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeI)).booleanValue()) {
            zzcgb zzcgb = this.zzd;
            if (zzcgb == null || zzcgb.zzaz()) {
                zzcat.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    public final void zzt() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeI)).booleanValue()) {
            zzcgb zzcgb = this.zzd;
            if (zzcgb == null || zzcgb.zzaz()) {
                zzcat.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    public final void zzu() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeI)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    public final void zzv() {
        zzo zzo2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzo2 = adOverlayInfoParcel.zzc) != null) {
            zzo2.zzbx();
        }
    }

    public final void zzw(boolean z10) {
        int intValue = ((Integer) zzba.zzc().zzb(zzbci.zzeL)).intValue();
        int i10 = 0;
        boolean z11 = ((Boolean) zzba.zzc().zzb(zzbci.zzaZ)).booleanValue() || z10;
        zzq zzq2 = new zzq();
        zzq2.zzd = 50;
        zzq2.zza = true != z11 ? 0 : intValue;
        if (true != z11) {
            i10 = intValue;
        }
        zzq2.zzb = i10;
        zzq2.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzq2, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        int i11 = 11;
        if (!this.zzc.zzw || this.zzd == null) {
            if (true != z11) {
                i11 = 9;
            }
            layoutParams.addRule(i11);
        } else {
            layoutParams.addRule(11);
            layoutParams.addRule(2, this.zzd.zzF().getId());
        }
        zzy(z10, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    public final void zzx() {
        this.zzr = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.zzc).zzo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzy(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzaX
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzc
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.zzj r0 = r0.zzo
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.zzh
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbci.zzaY
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzc
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.zzj r3 = r3.zzo
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.zzi
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzbry r7 = new com.google.android.gms.internal.ads.zzbry
            com.google.android.gms.internal.ads.zzcgb r4 = r6.zzd
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.zzg(r4)
        L_0x005a:
            com.google.android.gms.ads.internal.overlay.zzr r7 = r6.zzf
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            r7.zzb(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzy(boolean, boolean):void");
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
