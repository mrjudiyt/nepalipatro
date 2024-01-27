package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.e;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdps {
    private final zzcxj zza;
    private final zzdfb zzb;
    /* access modifiers changed from: private */
    public final zzcys zzc;
    private final zzczf zzd;
    private final zzczr zze;
    private final zzdcf zzf;
    private final Executor zzg;
    private final zzdex zzh;
    private final zzcpr zzi;
    private final zzb zzj;
    private final zzbxu zzk;
    private final zzaro zzl;
    /* access modifiers changed from: private */
    public final zzdbw zzm;
    private final zzedo zzn;
    private final zzfjx zzo;
    private final zzdso zzp;
    private final zzfib zzq;
    private final zzcou zzr;
    private final zzdpy zzs;

    public zzdps(zzcxj zzcxj, zzcys zzcys, zzczf zzczf, zzczr zzczr, zzdcf zzdcf, Executor executor, zzdex zzdex, zzcpr zzcpr, zzb zzb2, zzbxu zzbxu, zzaro zzaro, zzdbw zzdbw, zzedo zzedo, zzfjx zzfjx, zzdso zzdso, zzfib zzfib, zzdfb zzdfb, zzcou zzcou, zzdpy zzdpy) {
        this.zza = zzcxj;
        this.zzc = zzcys;
        this.zzd = zzczf;
        this.zze = zzczr;
        this.zzf = zzdcf;
        this.zzg = executor;
        this.zzh = zzdex;
        this.zzi = zzcpr;
        this.zzj = zzb2;
        this.zzk = zzbxu;
        this.zzl = zzaro;
        this.zzm = zzdbw;
        this.zzn = zzedo;
        this.zzo = zzfjx;
        this.zzp = zzdso;
        this.zzq = zzfib;
        this.zzb = zzdfb;
        this.zzr = zzcou;
        this.zzs = zzdpy;
    }

    public static final e zzj(zzcgb zzcgb, String str, String str2) {
        zzcbl zzcbl = new zzcbl();
        zzcgb.zzN().zzA(new zzdpj(zzcbl));
        zzcgb.zzab(str, str2, (String) null);
        return zzcbl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcgb zzcgb, zzcgb zzcgb2, Map map) {
        this.zzi.zzh(zzcgb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzju)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzs.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void zzi(zzcgb zzcgb, boolean z10, zzbjl zzbjl) {
        zzcgb zzcgb2 = zzcgb;
        zzcho zzN = zzcgb.zzN();
        zzdpk zzdpk = r4;
        zzdpk zzdpk2 = new zzdpk(this);
        zzdpl zzdpl = r4;
        zzdpl zzdpl2 = new zzdpl(this);
        zzdpm zzdpm = r4;
        zzdpm zzdpm2 = new zzdpm(this);
        zzdpr zzdpr = r4;
        zzdpr zzdpr2 = new zzdpr(this);
        zzbxu zzbxu = this.zzk;
        zzedo zzedo = this.zzn;
        zzfjx zzfjx = this.zzo;
        zzdso zzdso = this.zzp;
        zzczf zzczf = this.zzd;
        zzfib zzfib = this.zzq;
        zzN.zzM(zzdpk, zzczf, this.zze, zzdpl, zzdpm, z10, zzbjl, this.zzj, zzdpr, zzbxu, zzedo, zzfjx, zzdso, zzfib, (zzbkc) null, this.zzb, (zzbkb) null, (zzbjv) null, this.zzr);
        zzcgb zzcgb3 = zzcgb;
        zzcgb3.setOnTouchListener(new zzdpn(this));
        zzcgb3.setOnClickListener(new zzdpo(this));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcs)).booleanValue()) {
            this.zzl.zzc().zzo((View) zzcgb3);
        }
        this.zzh.zzo(zzcgb3, this.zzg);
        this.zzh.zzo(new zzdpp(zzcgb3), this.zzg);
        this.zzh.zza((View) zzcgb3);
        zzcgb3.zzad("/trackActiveViewUnit", new zzdpq(this, zzcgb3));
        this.zzi.zzi(zzcgb3);
    }
}
