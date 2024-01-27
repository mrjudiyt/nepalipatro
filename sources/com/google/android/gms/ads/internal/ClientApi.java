package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzchw;
import com.google.android.gms.internal.ads.zzdkd;
import com.google.android.gms.internal.ads.zzdkf;
import com.google.android.gms.internal.ads.zzdtx;
import com.google.android.gms.internal.ads.zzeln;
import com.google.android.gms.internal.ads.zzexr;
import com.google.android.gms.internal.ads.zzexs;
import com.google.android.gms.internal.ads.zzezf;
import com.google.android.gms.internal.ads.zzfaw;
import com.google.android.gms.internal.ads.zzfck;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class ClientApi extends zzcd {
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbox zzbox, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzeln(zzchw.zzb(context, zzbox, i10), context, str);
    }

    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbox zzbox, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexr zzs = zzchw.zzb(context, zzbox, i10).zzs();
        zzs.zza(str);
        zzs.zzb(context);
        zzexs zzc = zzs.zzc();
        if (i10 >= ((Integer) zzba.zzc().zzb(zzbci.zzfe)).intValue()) {
            return zzc.zza();
        }
        return new zzew();
    }

    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbox zzbox, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezf zzt = zzchw.zzb(context, zzbox, i10).zzt();
        zzt.zzc(context);
        zzt.zza(zzq);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbox zzbox, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfaw zzu = zzchw.zzb(context, zzbox, i10).zzu();
        zzu.zzc(context);
        zzu.zza(zzq);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzq, String str, int i10) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzq, str, new zzcaz(233702000, i10, true, false));
    }

    public final zzco zzg(IObjectWrapper iObjectWrapper, int i10) {
        return zzchw.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), (zzbox) null, i10).zzc();
    }

    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbox zzbox, int i10) {
        return zzchw.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbox, i10).zzl();
    }

    public final zzbfs zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdkf((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 233702000);
    }

    public final zzbfy zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdkd((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final zzbkk zzk(IObjectWrapper iObjectWrapper, zzbox zzbox, int i10, zzbkh zzbkh) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdtx zzj = zzchw.zzb(context, zzbox, i10).zzj();
        zzj.zzb(context);
        zzj.zza(zzbkh);
        return zzj.zzc().zzd();
    }

    public final zzbso zzl(IObjectWrapper iObjectWrapper, zzbox zzbox, int i10) {
        return zzchw.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbox, i10).zzm();
    }

    public final zzbsv zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzt(activity);
        }
        int i10 = zza.zzk;
        if (i10 == 1) {
            return new zzs(activity);
        }
        if (i10 == 2) {
            return new zzae(activity);
        }
        if (i10 == 3) {
            return new zzaf(activity);
        }
        if (i10 == 4) {
            return new zzy(activity, zza);
        }
        if (i10 != 5) {
            return new zzt(activity);
        }
        return new zzac(activity);
    }

    public final zzbvz zzn(IObjectWrapper iObjectWrapper, zzbox zzbox, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfck zzv = zzchw.zzb(context, zzbox, i10).zzv();
        zzv.zzb(context);
        return zzv.zzc().zzb();
    }

    public final zzbwp zzo(IObjectWrapper iObjectWrapper, String str, zzbox zzbox, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfck zzv = zzchw.zzb(context, zzbox, i10).zzv();
        zzv.zzb(context);
        zzv.zza(str);
        return zzv.zzc().zza();
    }

    public final zzbzk zzp(IObjectWrapper iObjectWrapper, zzbox zzbox, int i10) {
        return zzchw.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbox, i10).zzp();
    }
}
