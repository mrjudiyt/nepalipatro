package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzezw {
    public static void zza(AtomicReference atomicReference, zzezv zzezv) {
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                zzezv.zza(obj);
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                zzcat.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
    }
}
