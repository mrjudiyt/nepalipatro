package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzauq extends zzaun implements zzaur {
    public static zzaur zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof zzaur ? (zzaur) queryLocalInterface : new zzaup(iBinder);
    }
}
