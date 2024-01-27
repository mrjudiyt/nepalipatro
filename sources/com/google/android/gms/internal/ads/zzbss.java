package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbss extends RemoteCreator {
    public zzbss() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbsy ? (zzbsy) queryLocalInterface : new zzbsw(iBinder);
    }

    public final zzbsv zza(Activity activity) {
        try {
            IBinder zze = ((zzbsy) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbsv ? (zzbsv) queryLocalInterface : new zzbst(zze);
        } catch (RemoteException e10) {
            zzcat.zzk("Could not create remote AdOverlay.", e10);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            zzcat.zzk("Could not create remote AdOverlay.", e11);
            return null;
        }
    }
}
