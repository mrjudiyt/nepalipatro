package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public interface zzcgb extends zza, zzdfd, zzcfs, zzbmd, zzcgy, zzchc, zzbmq, zzauw, zzchg, zzl, zzchj, zzchk, zzcdc, zzchl {
    boolean canGoBack();

    void destroy();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    void onPause();

    void onResume();

    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void zzC(zzcgx zzcgx);

    zzfcr zzD();

    Context zzE();

    View zzF();

    WebView zzG();

    WebViewClient zzH();

    zzaro zzI();

    zzawj zzJ();

    zzbfb zzK();

    com.google.android.gms.ads.internal.overlay.zzl zzL();

    com.google.android.gms.ads.internal.overlay.zzl zzM();

    zzcho zzN();

    zzchq zzO();

    zzfcv zzP();

    zzfkc zzQ();

    e zzR();

    String zzS();

    void zzT(zzfcr zzfcr, zzfcv zzfcv);

    void zzU();

    void zzV();

    void zzW(int i10);

    void zzX();

    void zzY();

    void zzZ(boolean z10);

    boolean zzaA();

    boolean zzaB();

    boolean zzaC();

    void zzaa();

    void zzab(String str, String str2, String str3);

    void zzac();

    void zzad(String str, zzbjj zzbjj);

    void zzae();

    void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzl);

    void zzag(zzchq zzchq);

    void zzah(zzawj zzawj);

    void zzai(boolean z10);

    void zzaj();

    void zzak(Context context);

    void zzal(boolean z10);

    void zzam(zzbez zzbez);

    void zzan(boolean z10);

    void zzao(zzbfb zzbfb);

    void zzap(zzfkc zzfkc);

    void zzaq(int i10);

    void zzar(com.google.android.gms.ads.internal.overlay.zzl zzl);

    void zzas(boolean z10);

    void zzat(boolean z10);

    void zzau(String str, zzbjj zzbjj);

    void zzav(String str, Predicate predicate);

    boolean zzaw();

    boolean zzax();

    boolean zzay(boolean z10, int i10);

    boolean zzaz();

    Activity zzi();

    com.google.android.gms.ads.internal.zza zzj();

    zzbcy zzm();

    zzcaz zzn();

    zzcgx zzq();

    void zzt(String str, zzcen zzcen);
}
