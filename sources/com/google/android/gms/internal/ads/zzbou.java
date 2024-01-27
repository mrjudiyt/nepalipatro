package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbou extends zzbow {
    private static final zzbqz zza = new zzbqz();

    public final zzbpa zzb(String str) {
        try {
            Class<?> cls = Class.forName(str, false, zzbou.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                return new zzbpy((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            if (Adapter.class.isAssignableFrom(cls)) {
                return new zzbpy((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            zzcat.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
            throw new RemoteException();
        } catch (Throwable th) {
            zzcat.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
        }
        throw new RemoteException();
    }

    public final zzbqv zzc(String str) {
        try {
            return new zzbrh((RtbAdapter) Class.forName(str, false, zzbqz.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    public final boolean zzd(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbou.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcat.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    public final boolean zze(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbou.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcat.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
