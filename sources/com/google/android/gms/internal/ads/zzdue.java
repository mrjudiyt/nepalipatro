package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdue implements zzdto {
    /* access modifiers changed from: private */
    public final long zza;
    /* access modifiers changed from: private */
    public final zzdtt zzb;
    private final zzfci zzc;

    zzdue(long j10, Context context, zzdtt zzdtt, zzchw zzchw, String str) {
        this.zza = j10;
        this.zzb = zzdtt;
        zzfck zzv = zzchw.zzv();
        zzv.zzb(context);
        zzv.zza(str);
        this.zzc = zzv.zzc().zza();
    }

    public final void zza() {
    }

    public final void zzb(zzl zzl) {
        try {
            this.zzc.zzf(zzl, new zzduc(this));
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzc() {
        try {
            this.zzc.zzk(new zzdud(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }
}
