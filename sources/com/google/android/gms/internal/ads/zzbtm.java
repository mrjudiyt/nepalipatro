package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbtm {
    private static zzbzk zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final zzdx zzd;
    private final String zze;

    public zzbtm(Context context, AdFormat adFormat, zzdx zzdx, String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdx;
        this.zze = str;
    }

    public static zzbzk zza(Context context) {
        zzbzk zzbzk;
        synchronized (zzbtm.class) {
            if (zza == null) {
                zza = zzay.zza().zzr(context, new zzbou());
            }
            zzbzk = zza;
        }
        return zzbzk;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzl zzl;
        zzbzk zza2 = zza(this.zzb);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        zzdx zzdx = this.zzd;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        if (zzdx == null) {
            zzl = new zzm().zza();
        } else {
            zzl = zzp.zza.zza(this.zzb, zzdx);
        }
        try {
            zza2.zze(wrap, new zzbzo(this.zze, this.zzc.name(), (zzq) null, zzl), new zzbtl(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
