package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcpg implements zzcxl, zzcyz, zzcyf, zza, zzcyb {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    /* access modifiers changed from: private */
    public final zzfde zze;
    /* access modifiers changed from: private */
    public final zzfcr zzf;
    /* access modifiers changed from: private */
    public final zzfjt zzg;
    /* access modifiers changed from: private */
    public final zzfdx zzh;
    private final zzaro zzi;
    private final zzbdk zzj;
    private final zzfje zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzcwn zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbdm zzq;

    zzcpg(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfde zzfde, zzfcr zzfcr, zzfjt zzfjt, zzfdx zzfdx, View view, zzcgb zzcgb, zzaro zzaro, zzbdk zzbdk, zzbdm zzbdm, zzfje zzfje, zzcwn zzcwn) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfde;
        this.zzf = zzfcr;
        this.zzg = zzfjt;
        this.zzh = zzfdx;
        this.zzi = zzaro;
        View view2 = view;
        this.zzl = new WeakReference(view);
        zzcgb zzcgb2 = zzcgb;
        this.zzm = new WeakReference(zzcgb);
        this.zzj = zzbdk;
        this.zzq = zzbdm;
        this.zzk = zzfje;
        this.zzn = zzcwn;
    }

    /* access modifiers changed from: private */
    public final void zzs() {
        String str;
        int i10;
        List list;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzkE)).booleanValue() || ((list = this.zzf.zzd) != null && !list.isEmpty())) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzdm)).booleanValue()) {
                str = this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), (Activity) null);
            } else {
                str = null;
            }
            if ((!((Boolean) zzba.zzc().zzb(zzbci.zzan)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbea.zzh.zze()).booleanValue()) {
                if (((Boolean) zzbea.zzg.zze()).booleanValue() && ((i10 = this.zzf.zzb) == 1 || i10 == 2 || i10 == 5)) {
                    zzcgb zzcgb = (zzcgb) this.zzm.get();
                }
                zzfzt.zzr((zzfzk) zzfzt.zzo(zzfzk.zzu(zzfzt.zzh((Object) null)), ((Long) zzba.zzc().zzb(zzbci.zzaU)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcpf(this, str), this.zzb);
                return;
            }
            zzfdx zzfdx = this.zzh;
            zzfjt zzfjt = this.zzg;
            zzfde zzfde = this.zze;
            zzfcr zzfcr = this.zzf;
            zzfdx.zza(zzfjt.zzd(zzfde, zzfcr, false, str, (String) null, zzfcr.zzd));
        }
    }

    private final void zzt(int i10, int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new zzcpd(this, i10, i11), (long) i11, TimeUnit.MILLISECONDS);
        }
    }

    public final void onAdClicked() {
        if ((!((Boolean) zzba.zzc().zzb(zzbci.zzan)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbea.zzd.zze()).booleanValue()) {
            zzfzt.zzr(zzfzt.zze(zzfzk.zzu(this.zzj.zza()), Throwable.class, zzcpa.zza, zzcbg.zzf), new zzcpe(this), this.zzb);
            return;
        }
        zzfdx zzfdx = this.zzh;
        zzfjt zzfjt = this.zzg;
        zzfde zzfde = this.zze;
        zzfcr zzfcr = this.zzf;
        Context context = this.zza;
        List zzc2 = zzfjt.zzc(zzfde, zzfcr, zzfcr.zzc);
        int i10 = 1;
        if (true == zzt.zzo().zzx(context)) {
            i10 = 2;
        }
        zzfdx.zzc(zzc2, i10);
    }

    public final void zza() {
    }

    public final void zzb() {
    }

    public final void zzbw(zzbvw zzbvw, String str, String str2) {
        zzfjt zzfjt = this.zzg;
        zzfcr zzfcr = this.zzf;
        this.zzh.zza(zzfjt.zze(zzfcr, zzfcr.zzj, zzbvw));
    }

    public final void zzc() {
    }

    public final void zze() {
        zzfjt zzfjt = this.zzg;
        zzfde zzfde = this.zze;
        zzfcr zzfcr = this.zzf;
        this.zzh.zza(zzfjt.zzc(zzfde, zzfcr, zzfcr.zzk));
    }

    public final void zzf() {
        zzfjt zzfjt = this.zzg;
        zzfde zzfde = this.zze;
        zzfcr zzfcr = this.zzf;
        this.zzh.zza(zzfjt.zzc(zzfde, zzfcr, zzfcr.zzi));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzb.execute(new zzcpc(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(int i10, int i11) {
        zzt(i10 - 1, i11);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(int i10, int i11) {
        this.zzb.execute(new zzcpb(this, i10, i11));
    }

    public final void zzp(zze zze2) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbt)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfjt.zzf(2, zze2.zza, this.zzf.zzq)));
        }
    }

    public final void zzq() {
        if (this.zzp.compareAndSet(false, true)) {
            int intValue = ((Integer) zzba.zzc().zzb(zzbci.zzdv)).intValue();
            if (intValue > 0) {
                zzt(intValue, ((Integer) zzba.zzc().zzb(zzbci.zzdw)).intValue());
                return;
            }
            if (((Boolean) zzba.zzc().zzb(zzbci.zzdu)).booleanValue()) {
                this.zzc.execute(new zzcoz(this));
            } else {
                zzs();
            }
        }
    }

    public final synchronized void zzr() {
        zzcwn zzcwn;
        if (this.zzo) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, (String) null, (String) null, arrayList));
        } else {
            zzfdx zzfdx = this.zzh;
            zzfjt zzfjt = this.zzg;
            zzfde zzfde = this.zze;
            zzfcr zzfcr = this.zzf;
            zzfdx.zza(zzfjt.zzc(zzfde, zzfcr, zzfcr.zzo));
            if (((Boolean) zzba.zzc().zzb(zzbci.zzdr)).booleanValue() && (zzcwn = this.zzn) != null) {
                List zzh2 = zzfjt.zzh(zzfjt.zzg(zzcwn.zzb().zzo, zzcwn.zza().zzg()), this.zzn.zza().zza());
                zzfdx zzfdx2 = this.zzh;
                zzfjt zzfjt2 = this.zzg;
                zzcwn zzcwn2 = this.zzn;
                zzfdx2.zza(zzfjt2.zzc(zzcwn2.zzc(), zzcwn2.zzb(), zzh2));
            }
            zzfdx zzfdx3 = this.zzh;
            zzfjt zzfjt3 = this.zzg;
            zzfde zzfde2 = this.zze;
            zzfcr zzfcr2 = this.zzf;
            zzfdx3.zza(zzfjt3.zzc(zzfde2, zzfcr2, zzfcr2.zzg));
        }
        this.zzo = true;
    }
}
