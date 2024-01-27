package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbhn extends RemoteCreator {
    public zzbhn() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbfv ? (zzbfv) queryLocalInterface : new zzbft(iBinder);
    }

    public final zzbfs zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zze = ((zzbfv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 233702000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzbfs ? (zzbfs) queryLocalInterface : new zzbfq(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            zzcat.zzk("Could not create remote NativeAdViewDelegate.", e10);
            return null;
        }
    }
}
