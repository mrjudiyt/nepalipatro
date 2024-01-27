package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzac extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbox zzb;

    zzac(zzaw zzaw, Context context, zzbox zzbox) {
        this.zza = context;
        this.zzb = zzbox;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbci.zza(context);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzje)).booleanValue()) {
            return zzce.zzh(wrap, this.zzb, 233702000);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbci.zza(context);
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzje)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdk) zzcax.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzab.zza)).zze(wrap, this.zzb, 233702000);
        } catch (RemoteException | zzcaw | NullPointerException e10) {
            zzbty.zza(this.zza).zzf(e10, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
