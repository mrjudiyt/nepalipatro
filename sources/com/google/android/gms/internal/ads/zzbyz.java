package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzbyz {
    static zzbyz zza;

    public static synchronized zzbyz zzd(Context context) {
        synchronized (zzbyz.class) {
            zzbyz zzbyz = zza;
            if (zzbyz != null) {
                return zzbyz;
            }
            Context applicationContext = context.getApplicationContext();
            zzbci.zza(applicationContext);
            zzg zzh = zzt.zzo().zzh();
            zzh.zzr(applicationContext);
            zzbyd zzbyd = new zzbyd((zzbyc) null);
            zzbyd.zzb(applicationContext);
            zzbyd.zzc(zzt.zzB());
            zzbyd.zza(zzh);
            zzbyd.zzd(zzt.zzn());
            zzbyz zze = zzbyd.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzbzd zzc = zza.zzc();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzaq)).booleanValue()) {
                zzt.zzp();
                Map zzu = com.google.android.gms.ads.internal.util.zzt.zzu((String) zzba.zzc().zzb(zzbci.zzas));
                for (String zzc2 : zzu.keySet()) {
                    zzc.zzc(zzc2);
                }
                zzc.zzd(new zzbzb(zzc, zzu));
            }
            zzbyz zzbyz2 = zza;
            return zzbyz2;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract zzbxw zza();

    /* access modifiers changed from: package-private */
    public abstract zzbya zzb();

    /* access modifiers changed from: package-private */
    public abstract zzbzd zzc();
}
