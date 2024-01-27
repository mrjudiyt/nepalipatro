package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zziv {
    final Context zza;
    zzdy zzb = zzdy.zza;
    zzftm zzc;
    zzftm zzd;
    zzftm zze;
    zzftm zzf;
    zzftm zzg;
    zzfsk zzh;
    Looper zzi = zzfk.zzw();
    zzk zzj = zzk.zza;
    int zzk = 1;
    boolean zzl = true;
    zzlv zzm = zzlv.zze;
    long zzn = 500;
    long zzo = 2000;
    boolean zzp = true;
    boolean zzq;
    zzig zzr = new zzig(0.97f, 1.03f, 1000, 1.0E-7f, zzfk.zzq(20), zzfk.zzq(500), 0.999f, (zzif) null);

    public zziv(Context context, zzcfl zzcfl) {
        Context context2 = context;
        zzio zzio = new zzio(zzcfl);
        zzip zzip = new zzip(context2);
        zziq zziq = new zziq(context2);
        zzir zzir = zzir.zza;
        zzis zzis = new zzis(context2);
        zzit zzit = zzit.zza;
        Objects.requireNonNull(context);
        this.zza = context2;
        this.zzc = zzio;
        this.zzd = zzip;
        this.zze = zziq;
        this.zzf = zzir;
        this.zzg = zzis;
        this.zzh = zzit;
    }

    static /* synthetic */ zztv zza(Context context) {
        return new zztj(context, new zzabh());
    }
}
