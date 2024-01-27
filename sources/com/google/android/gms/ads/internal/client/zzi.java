package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbr(iBinder);
    }

    public final zzbq zza(Context context, String str, zzbox zzbox) {
        try {
            IBinder zze = ((zzbr) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), str, zzbox, 233702000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            zzcat.zzk("Could not create remote builder for AdLoader.", e10);
            return null;
        }
    }
}
