package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcqy extends zzcqv {
    private final Context zzc;
    private final View zzd;
    private final zzcgb zze;
    private final zzfcs zzf;
    private final zzcsv zzg;
    private final zzdju zzh;
    private final zzdff zzi;
    private final zzhaw zzj;
    private final Executor zzk;
    private zzq zzl;

    zzcqy(zzcsw zzcsw, Context context, zzfcs zzfcs, View view, zzcgb zzcgb, zzcsv zzcsv, zzdju zzdju, zzdff zzdff, zzhaw zzhaw, Executor executor) {
        super(zzcsw);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcgb;
        this.zzf = zzfcs;
        this.zzg = zzcsv;
        this.zzh = zzdju;
        this.zzi = zzdff;
        this.zzj = zzhaw;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcqy zzcqy) {
        zzdju zzdju = zzcqy.zzh;
        if (zzdju.zze() != null) {
            try {
                zzdju.zze().zze((zzbu) zzcqy.zzj.zzb(), ObjectWrapper.wrap(zzcqy.zzc));
            } catch (RemoteException e10) {
                zzcat.zzh("RemoteException when notifyAdLoad is called", e10);
            }
        }
    }

    public final int zza() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhD)).booleanValue() && this.zzb.zzai) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzhE)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    public final View zzc() {
        return this.zzd;
    }

    public final zzdq zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfds unused) {
            return null;
        }
    }

    public final zzfcs zze() {
        zzq zzq = this.zzl;
        if (zzq != null) {
            return zzfdr.zzb(zzq);
        }
        zzfcr zzfcr = this.zzb;
        if (zzfcr.zzae) {
            for (String str : zzfcr.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfcs(view.getWidth(), view.getHeight(), false);
        }
        return (zzfcs) this.zzb.zzt.get(0);
    }

    public final zzfcs zzf() {
        return this.zzf;
    }

    public final void zzg() {
        this.zzi.zza();
    }

    public final void zzh(ViewGroup viewGroup, zzq zzq) {
        zzcgb zzcgb;
        if (viewGroup != null && (zzcgb = this.zze) != null) {
            zzcgb.zzag(zzchq.zzc(zzq));
            viewGroup.setMinimumHeight(zzq.zzc);
            viewGroup.setMinimumWidth(zzq.zzf);
            this.zzl = zzq;
        }
    }

    public final void zzj() {
        this.zzk.execute(new zzcqx(this));
        super.zzj();
    }
}
