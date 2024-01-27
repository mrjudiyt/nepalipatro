package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
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
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzell extends zzbt {
    private final Context zza;
    private final zzbh zzb;
    private final zzfdn zzc;
    private final zzcqv zzd;
    private final ViewGroup zze;
    private final zzdso zzf;

    public zzell(Context context, zzbh zzbh, zzfdn zzfdn, zzcqv zzcqv, zzdso zzdso) {
        this.zza = context;
        this.zzb = zzbh;
        this.zzc = zzfdn;
        this.zzd = zzcqv;
        this.zzf = zzdso;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzc2 = zzcqv.zzc();
        zzt.zzp();
        frameLayout.addView(zzc2, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    public final void zzA() {
        this.zzd.zzg();
    }

    public final void zzB() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc((Context) null);
    }

    public final void zzC(zzbe zzbe) {
        zzcat.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzD(zzbh zzbh) {
        zzcat.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzE(zzby zzby) {
        zzcat.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzF(zzq zzq) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcqv zzcqv = this.zzd;
        if (zzcqv != null) {
            zzcqv.zzh(this.zze, zzq);
        }
    }

    public final void zzG(zzcb zzcb) {
        zzemk zzemk = this.zzc.zzc;
        if (zzemk != null) {
            zzemk.zzm(zzcb);
        }
    }

    public final void zzH(zzaws zzaws) {
    }

    public final void zzI(zzw zzw) {
    }

    public final void zzJ(zzci zzci) {
    }

    public final void zzK(zzdu zzdu) {
    }

    public final void zzL(boolean z10) {
    }

    public final void zzM(zzbte zzbte) {
    }

    public final void zzN(boolean z10) {
        zzcat.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzO(zzbdg zzbdg) {
        zzcat.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzP(zzdg zzdg) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkC)).booleanValue()) {
            zzemk zzemk = this.zzc.zzc;
            if (zzemk != null) {
                try {
                    if (!zzdg.zzf()) {
                        this.zzf.zze();
                    }
                } catch (RemoteException e10) {
                    zzcat.zzf("Error in making CSI ping for reporting paid event callback", e10);
                }
                zzemk.zzl(zzdg);
                return;
            }
            return;
        }
        zzcat.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzQ(zzbth zzbth, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzbwc zzbwc) {
    }

    public final void zzT(String str) {
    }

    public final void zzU(zzfl zzfl) {
        zzcat.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() {
    }

    public final boolean zzY() {
        return false;
    }

    public final boolean zzZ() {
        return false;
    }

    public final boolean zzaa(zzl zzl) {
        zzcat.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzab(zzcf zzcf) {
        zzcat.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final Bundle zzd() {
        zzcat.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    public final zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfdr.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    public final zzbh zzi() {
        return this.zzb;
    }

    public final zzcb zzj() {
        return this.zzc.zzn;
    }

    public final zzdn zzk() {
        return this.zzd.zzl();
    }

    public final zzdq zzl() {
        return this.zzd.zzd();
    }

    public final IObjectWrapper zzn() {
        return ObjectWrapper.wrap(this.zze);
    }

    public final String zzr() {
        return this.zzc.zzf;
    }

    public final String zzs() {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final String zzt() {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    public final void zzy(zzl zzl, zzbk zzbk) {
    }

    public final void zzz() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb((Context) null);
    }
}
