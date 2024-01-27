package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzk extends RemoteCreator {
    private zzbua zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzq, String str, zzbox zzbox, int i10) {
        zzbci.zza(context);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) zzcax.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(ObjectWrapper.wrap(context), zzq, str, zzbox, 233702000, i10);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
            } catch (RemoteException | zzcaw | NullPointerException e10) {
                zzbua zza2 = zzbty.zza(context);
                this.zza = zza2;
                zza2.zzf(e10, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcat.zzl("#007 Could not call remote method.", e10);
                return null;
            }
        } else {
            try {
                IBinder zze2 = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzq, str, zzbox, 233702000, i10);
                if (zze2 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface2 instanceof zzbu ? (zzbu) queryLocalInterface2 : new zzbs(zze2);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e11) {
                zzcat.zzf("Could not create remote AdManager.", e11);
                return null;
            }
        }
    }
}
