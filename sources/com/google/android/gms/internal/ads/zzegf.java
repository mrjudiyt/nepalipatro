package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzegf implements zzefa {
    private final Context zza;
    private final zzcrs zzb;
    /* access modifiers changed from: private */
    public View zzc;
    /* access modifiers changed from: private */
    public zzbpg zzd;

    public zzegf(Context context, zzcrs zzcrs) {
        this.zza = context;
        this.zzb = zzcrs;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        View view;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhD)).booleanValue() || !zzfcr.zzai) {
            view = this.zzc;
        } else {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfds(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (zzf) {
                    try {
                        view = (View) zzfzt.zzn(zzfzt.zzh((Object) null), new zzegc(this, view, zzfcr), zzcbg.zze).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfds(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfds(e11);
            }
        }
        zzcqw zza2 = this.zzb.zza(new zzctm(zzfde, zzfcr, zzeex.zza), new zzcrc(view, (zzcgb) null, new zzegb(zzeex), (zzfcs) zzfcr.zzw.get(0)));
        zza2.zzg().zza(view);
        ((zzegq) zzeex.zzc).zzc(zza2.zzi());
        return zza2.zza();
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        try {
            ((zzbqv) zzeex.zzb).zzq(zzfcr.zzab);
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzhD)).booleanValue() || !zzfcr.zzai) {
                ((zzbqv) zzeex.zzb).zzj(zzfcr.zzW, zzfcr.zzx.toString(), zzfde.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzege(this, zzeex, (zzegd) null), (zzbpd) zzeex.zzc, zzfde.zza.zza.zze);
            } else {
                ((zzbqv) zzeex.zzb).zzk(zzfcr.zzW, zzfcr.zzx.toString(), zzfde.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzege(this, zzeex, (zzegd) null), (zzbpd) zzeex.zzc, zzfde.zza.zza.zze);
            }
        } catch (RemoteException e10) {
            throw new zzfds(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(View view, zzfcr zzfcr, Object obj) {
        return zzfzt.zzh(zzcsj.zza(this.zza, view, zzfcr));
    }
}
