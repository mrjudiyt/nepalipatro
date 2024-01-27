package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.zzt;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfeh {
    private static zzfeh zza;
    private final Context zzb;
    private final zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfeh(Context context, zzcl zzcl) {
        this.zzb = context;
        this.zzc = zzcl;
    }

    static zzcl zza(Context context) {
        try {
            return zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            zzcat.zzh("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    public static zzfeh zzd(Context context) {
        synchronized (zzfeh.class) {
            zzfeh zzfeh = zza;
            if (zzfeh != null) {
                return zzfeh;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbed.zzb.zze()).longValue();
            zzcl zzcl = null;
            if (longValue > 0 && longValue <= 233702200) {
                zzcl = zza(applicationContext);
            }
            zzfeh zzfeh2 = new zzfeh(applicationContext, zzcl);
            zza = zzfeh2;
            return zzfeh2;
        }
    }

    private final zzen zzg() {
        zzcl zzcl = this.zzc;
        if (zzcl != null) {
            try {
                return zzcl.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbox zzb() {
        return (zzbox) this.zzd.get();
    }

    public final zzcaz zzc(int i10, boolean z10, int i11) {
        zzen zzg;
        zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.zzb);
        zzcaz zzcaz = new zzcaz(233702000, i11, true, zzD);
        if (((Boolean) zzbed.zzc.zze()).booleanValue() && (zzg = zzg()) != null) {
            return new zzcaz(233702000, zzg.zza(), true, zzD);
        }
        return zzcaz;
    }

    public final String zze() {
        zzen zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(com.google.android.gms.internal.ads.zzbox r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbdn r0 = com.google.android.gms.internal.ads.zzbed.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.client.zzcl r0 = r3.zzc
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x0019
        L_0x0015:
            com.google.android.gms.internal.ads.zzbox r0 = r0.getAdapterCreator()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L_0x001e
            r4 = r0
        L_0x001e:
            com.google.android.gms.internal.ads.zzfeg.zza(r2, r1, r4)
            return
        L_0x0022:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfeg.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfeh.zzf(com.google.android.gms.internal.ads.zzbox):void");
    }
}
