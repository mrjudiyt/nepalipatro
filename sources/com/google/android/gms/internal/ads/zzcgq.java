package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcgq extends FrameLayout implements zzcgb {
    private final zzcgb zza;
    private final zzccr zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzcgq(zzcgb zzcgb) {
        super(zzcgb.getContext());
        this.zza = zzcgb;
        this.zzb = new zzccr(zzcgb.zzE(), this, this);
        addView((View) zzcgb);
    }

    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    public final void destroy() {
        zzfkc zzQ = zzQ();
        if (zzQ != null) {
            zzfps zzfps = zzt.zza;
            zzfps.post(new zzcgo(zzQ));
            zzcgb zzcgb = this.zza;
            zzcgb.getClass();
            zzfps.postDelayed(new zzcgp(zzcgb), (long) ((Integer) zzba.zzc().zzb(zzbci.zzeT)).intValue());
            return;
        }
        this.zza.destroy();
    }

    public final void goBack() {
        this.zza.goBack();
    }

    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    public final void onAdClicked() {
        zzcgb zzcgb = this.zza;
        if (zzcgb != null) {
            zzcgb.onAdClicked();
        }
    }

    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    public final void onResume() {
        this.zza.onResume();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    public final void zzA(int i10) {
        this.zza.zzA(i10);
    }

    public final void zzB(int i10) {
        this.zzb.zzg(i10);
    }

    public final void zzC(zzcgx zzcgx) {
        this.zza.zzC(zzcgx);
    }

    public final zzfcr zzD() {
        return this.zza.zzD();
    }

    public final Context zzE() {
        return this.zza.zzE();
    }

    public final View zzF() {
        return this;
    }

    public final WebView zzG() {
        return (WebView) this.zza;
    }

    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    public final zzaro zzI() {
        return this.zza.zzI();
    }

    public final zzawj zzJ() {
        return this.zza.zzJ();
    }

    public final zzbfb zzK() {
        return this.zza.zzK();
    }

    public final zzl zzL() {
        return this.zza.zzL();
    }

    public final zzl zzM() {
        return this.zza.zzM();
    }

    public final zzcho zzN() {
        return ((zzcgu) this.zza).zzaJ();
    }

    public final zzchq zzO() {
        return this.zza.zzO();
    }

    public final zzfcv zzP() {
        return this.zza.zzP();
    }

    public final zzfkc zzQ() {
        return this.zza.zzQ();
    }

    public final e zzR() {
        return this.zza.zzR();
    }

    public final String zzS() {
        return this.zza.zzS();
    }

    public final void zzT(zzfcr zzfcr, zzfcv zzfcv) {
        this.zza.zzT(zzfcr, zzfcv);
    }

    public final void zzU() {
        this.zzb.zze();
        this.zza.zzU();
    }

    public final void zzV() {
        this.zza.zzV();
    }

    public final void zzW(int i10) {
        this.zza.zzW(i10);
    }

    public final void zzX() {
        this.zza.zzX();
    }

    public final void zzY() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zza()));
        zzcgu zzcgu = (zzcgu) this.zza;
        hashMap.put("device_volume", String.valueOf(zzac.zzb(zzcgu.getContext())));
        zzcgu.zzd("volume", hashMap);
    }

    public final void zzZ(boolean z10) {
        this.zza.zzZ(z10);
    }

    public final void zza(String str) {
        ((zzcgu) this.zza).zzaO(str);
    }

    public final boolean zzaA() {
        return this.zza.zzaA();
    }

    public final boolean zzaB() {
        return this.zzc.get();
    }

    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    public final void zzaD(zzc zzc2, boolean z10) {
        this.zza.zzaD(zzc2, z10);
    }

    public final void zzaE(String str, String str2, int i10) {
        this.zza.zzaE(str, str2, 14);
    }

    public final void zzaF(boolean z10, int i10, boolean z11) {
        this.zza.zzaF(z10, i10, z11);
    }

    public final void zzaG(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zza.zzaG(z10, i10, str, str2, z11);
    }

    public final void zzaH(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zza.zzaH(z10, i10, str, z11, z12);
    }

    public final void zzaa() {
        this.zza.zzaa();
    }

    public final void zzab(String str, String str2, String str3) {
        this.zza.zzab(str, str2, (String) null);
    }

    public final void zzac() {
        this.zza.zzac();
    }

    public final void zzad(String str, zzbjj zzbjj) {
        this.zza.zzad(str, zzbjj);
    }

    public final void zzae() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzp();
        textView.setText(zzt.zzx());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final void zzaf(zzl zzl) {
        this.zza.zzaf(zzl);
    }

    public final void zzag(zzchq zzchq) {
        this.zza.zzag(zzchq);
    }

    public final void zzah(zzawj zzawj) {
        this.zza.zzah(zzawj);
    }

    public final void zzai(boolean z10) {
        this.zza.zzai(z10);
    }

    public final void zzaj() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    public final void zzak(Context context) {
        this.zza.zzak(context);
    }

    public final void zzal(boolean z10) {
        this.zza.zzal(z10);
    }

    public final void zzam(zzbez zzbez) {
        this.zza.zzam(zzbez);
    }

    public final void zzan(boolean z10) {
        this.zza.zzan(z10);
    }

    public final void zzao(zzbfb zzbfb) {
        this.zza.zzao(zzbfb);
    }

    public final void zzap(zzfkc zzfkc) {
        this.zza.zzap(zzfkc);
    }

    public final void zzaq(int i10) {
        this.zza.zzaq(i10);
    }

    public final void zzar(zzl zzl) {
        this.zza.zzar(zzl);
    }

    public final void zzas(boolean z10) {
        this.zza.zzas(z10);
    }

    public final void zzat(boolean z10) {
        this.zza.zzat(z10);
    }

    public final void zzau(String str, zzbjj zzbjj) {
        this.zza.zzau(str, zzbjj);
    }

    public final void zzav(String str, Predicate predicate) {
        this.zza.zzav(str, predicate);
    }

    public final boolean zzaw() {
        return this.zza.zzaw();
    }

    public final boolean zzax() {
        return this.zza.zzax();
    }

    public final boolean zzay(boolean z10, int i10) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzaK)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzay(z10, i10);
        return true;
    }

    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    public final void zzbK() {
        zzcgb zzcgb = this.zza;
        if (zzcgb != null) {
            zzcgb.zzbK();
        }
    }

    public final void zzbj() {
        this.zza.zzbj();
    }

    public final void zzbk() {
        this.zza.zzbk();
    }

    public final String zzbl() {
        return this.zza.zzbl();
    }

    public final String zzbm() {
        return this.zza.zzbm();
    }

    public final void zzbt(zzauv zzauv) {
        this.zza.zzbt(zzauv);
    }

    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    public final int zzf() {
        return this.zza.zzf();
    }

    public final int zzg() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdH)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    public final int zzh() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdH)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    public final Activity zzi() {
        return this.zza.zzi();
    }

    public final zza zzj() {
        return this.zza.zzj();
    }

    public final zzbcx zzk() {
        return this.zza.zzk();
    }

    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcgu) this.zza).zzb(str, jSONObject.toString());
    }

    public final zzbcy zzm() {
        return this.zza.zzm();
    }

    public final zzcaz zzn() {
        return this.zza.zzn();
    }

    public final zzccr zzo() {
        return this.zzb;
    }

    public final zzcen zzp(String str) {
        return this.zza.zzp(str);
    }

    public final zzcgx zzq() {
        return this.zza.zzq();
    }

    public final void zzs() {
        zzcgb zzcgb = this.zza;
        if (zzcgb != null) {
            zzcgb.zzs();
        }
    }

    public final void zzt(String str, zzcen zzcen) {
        this.zza.zzt(str, zzcen);
    }

    public final void zzu() {
        this.zza.zzu();
    }

    public final void zzv(boolean z10, long j10) {
        this.zza.zzv(z10, j10);
    }

    public final void zzw() {
        this.zza.zzw();
    }

    public final void zzx(int i10) {
    }

    public final void zzy(int i10) {
    }

    public final void zzz(boolean z10) {
        this.zza.zzz(false);
    }
}
