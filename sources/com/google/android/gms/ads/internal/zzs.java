package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzarp;
import com.google.android.gms.internal.ads.zzaws;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdp;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbwc;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbg;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzs extends zzbt {
    /* access modifiers changed from: private */
    public final zzcaz zza;
    private final zzq zzb;
    /* access modifiers changed from: private */
    public final Future zzc = zzcbg.zza.zzb(new zzo(this));
    /* access modifiers changed from: private */
    public final Context zzd;
    private final zzr zze;
    /* access modifiers changed from: private */
    public WebView zzf;
    /* access modifiers changed from: private */
    public zzbh zzg;
    /* access modifiers changed from: private */
    public zzaro zzh;
    private AsyncTask zzi;

    public zzs(Context context, zzq zzq, String str, zzcaz zzcaz) {
        this.zzd = context;
        this.zza = zzcaz;
        this.zzb = zzq;
        this.zzf = new WebView(context);
        this.zze = new zzr(context, str);
        zzV(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzm(this));
        this.zzf.setOnTouchListener(new zzn(this));
    }

    static /* bridge */ /* synthetic */ String zzo(zzs zzs, String str) {
        if (zzs.zzh == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = zzs.zzh.zza(parse, zzs.zzd, (View) null, (Activity) null);
        } catch (zzarp e10) {
            zzcat.zzk("Unable to process ad data", e10);
        }
        return parse.toString();
    }

    static /* bridge */ /* synthetic */ void zzw(zzs zzs, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzs.zzd.startActivity(intent);
    }

    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    public final void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zzC(zzbe zzbe) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzD(zzbh zzbh) {
        this.zzg = zzbh;
    }

    public final void zzE(zzby zzby) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzF(zzq zzq) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zzG(zzcb zzcb) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzH(zzaws zzaws) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzI(zzw zzw) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzJ(zzci zzci) {
    }

    public final void zzK(zzdu zzdu) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzL(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzM(zzbte zzbte) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzN(boolean z10) {
    }

    public final void zzO(zzbdg zzbdg) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzP(zzdg zzdg) {
    }

    public final void zzQ(zzbth zzbth, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzS(zzbwc zzbwc) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzU(zzfl zzfl) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final void zzV(int i10) {
        if (this.zzf != null) {
            this.zzf.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
        }
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    public final boolean zzY() {
        return false;
    }

    public final boolean zzZ() {
        return false;
    }

    public final boolean zzaa(zzl zzl) {
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zzf(zzl, this.zza);
        this.zzi = new zzq(this, (zzp) null).execute(new Void[0]);
        return true;
    }

    public final void zzab(zzcf zzcf) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzay.zzb();
            return zzcam.zzx(this.zzd, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    public final zzq zzg() {
        return this.zzb;
    }

    public final zzbh zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final zzcb zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzdn zzk() {
        return null;
    }

    public final zzdq zzl() {
        return null;
    }

    public final IObjectWrapper zzn() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbdp.zzd.zze());
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zze.zzd());
        builder.appendQueryParameter("pubId", this.zze.zzc());
        builder.appendQueryParameter("mappver", this.zze.zza());
        Map zze2 = this.zze.zze();
        for (String str : zze2.keySet()) {
            builder.appendQueryParameter(str, (String) zze2.get(str));
        }
        Uri build = builder.build();
        zzaro zzaro = this.zzh;
        if (zzaro != null) {
            try {
                build = zzaro.zzb(build, this.zzd);
            } catch (zzarp e10) {
                zzcat.zzk("Unable to process ad data", e10);
            }
        }
        String zzq = zzq();
        String encodedQuery = build.getEncodedQuery();
        return zzq + "#" + encodedQuery;
    }

    /* access modifiers changed from: package-private */
    public final String zzq() {
        String zzb2 = this.zze.zzb();
        if (true == TextUtils.isEmpty(zzb2)) {
            zzb2 = "www.google.com";
        }
        return "https://" + zzb2 + ((String) zzbdp.zzd.zze());
    }

    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String zzs() {
        return null;
    }

    public final String zzt() {
        return null;
    }

    public final void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(true);
        this.zzf.destroy();
        this.zzf = null;
    }

    public final void zzy(zzl zzl, zzbk zzbk) {
    }

    public final void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
