package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzcat;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzaw {
    /* access modifiers changed from: private */
    public final zzk zza;
    /* access modifiers changed from: private */
    public final zzi zzb;
    /* access modifiers changed from: private */
    public final zzeq zzc;
    /* access modifiers changed from: private */
    public final zzbhn zzd;
    private final zzbxb zze;
    /* access modifiers changed from: private */
    public final zzbss zzf;
    /* access modifiers changed from: private */
    public final zzbho zzg;
    /* access modifiers changed from: private */
    public zzbua zzh;

    public zzaw(zzk zzk, zzi zzi, zzeq zzeq, zzbhn zzbhn, zzbxb zzbxb, zzbss zzbss, zzbho zzbho) {
        this.zza = zzk;
        this.zzb = zzi;
        this.zzc = zzeq;
        this.zzd = zzbhn;
        this.zze = zzbxb;
        this.zzf = zzbss;
        this.zzg = zzbho;
    }

    static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(NativeProtocol.WEB_DIALOG_ACTION, "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbox zzbox) {
        return (zzbq) new zzao(this, context, str, zzbox).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzq, String str, zzbox zzbox) {
        return (zzbu) new zzak(this, context, zzq, str, zzbox).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzq, String str, zzbox zzbox) {
        return (zzbu) new zzam(this, context, zzq, str, zzbox).zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbox zzbox) {
        return (zzdj) new zzac(this, context, zzbox).zzd(context, false);
    }

    public final zzbfs zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbfs) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbfy zzi(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbfy) new zzau(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbkk zzl(Context context, zzbox zzbox, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbkk) new zzai(this, context, zzbox, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbso zzm(Context context, zzbox zzbox) {
        return (zzbso) new zzag(this, context, zzbox).zzd(context, false);
    }

    public final zzbsv zzo(Activity activity) {
        zzaa zzaa = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcat.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbsv) zzaa.zzd(activity, z10);
    }

    public final zzbwp zzq(Context context, String str, zzbox zzbox) {
        return (zzbwp) new zzav(this, context, str, zzbox).zzd(context, false);
    }

    public final zzbzk zzr(Context context, zzbox zzbox) {
        return (zzbzk) new zzae(this, context, zzbox).zzd(context, false);
    }
}
