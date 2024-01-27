package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfrh extends zzaun implements zzfri {
    public static zzfri zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof zzfri ? (zzfri) queryLocalInterface : new zzfrg(iBinder);
    }
}
