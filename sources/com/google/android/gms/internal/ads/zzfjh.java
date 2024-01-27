package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfjh implements Runnable {
    public static final Object zza = new Object();
    public static Boolean zzb;
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final Context zze;
    private final zzcaz zzf;
    private final zzfjm zzg = zzfjp.zzc();
    private String zzh = "";
    private int zzi;
    private final zzdqg zzj;
    private final List zzk;
    private boolean zzl = false;
    private final zzebk zzm;
    private final zzbvs zzn;

    public zzfjh(Context context, zzcaz zzcaz, zzdqg zzdqg, zzebk zzebk, zzbvs zzbvs) {
        this.zze = context;
        this.zzf = zzcaz;
        this.zzj = zzdqg;
        this.zzm = zzebk;
        this.zzn = zzbvs;
        if (((Boolean) zzba.zzc().zzb(zzbci.zziB)).booleanValue()) {
            this.zzk = zzt.zzd();
        } else {
            this.zzk = zzfvs.zzl();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (!((Boolean) zzbdu.zzb.zze()).booleanValue()) {
                    zzb = Boolean.FALSE;
                } else {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbdu.zza.zze()).doubleValue());
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    public final void run() {
        byte[] zzax;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() != 0) {
                    try {
                        synchronized (obj) {
                            zzax = ((zzfjp) this.zzg.zzal()).zzax();
                            this.zzg.zzc();
                        }
                        new zzebj(this.zze, this.zzf.zza, this.zzn, Binder.getCallingUid()).zza(new zzebh((String) zzba.zzc().zzb(zzbci.zziv), 60000, new HashMap(), zzax, "application/x-protobuf", false));
                    } catch (Exception e10) {
                        if (!(e10 instanceof zzdwm) || ((zzdwm) e10).zza() != 3) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "CuiMonitor.sendCuiPing");
                        }
                    }
                }
            }
        }
    }

    public final void zzb(zzfix zzfix) {
        zzcbg.zza.zza(new zzfjg(this, zzfix));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzfix zzfix) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzh = zzt.zzp(this.zze);
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((Integer) zzba.zzc().zzb(zzbci.zziw)).intValue();
                    if (((Boolean) zzba.zzc().zzb(zzbci.zzkO)).booleanValue()) {
                        long j10 = (long) intValue;
                        zzcbg.zzd.scheduleWithFixedDelay(this, j10, j10, TimeUnit.MILLISECONDS);
                    } else {
                        long j11 = (long) intValue;
                        zzcbg.zzd.scheduleAtFixedRate(this, j11, j11, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzfix != null) {
            synchronized (zzc) {
                if (this.zzg.zza() < ((Integer) zzba.zzc().zzb(zzbci.zzix)).intValue()) {
                    zzfjj zza2 = zzfjk.zza();
                    zza2.zzt(zzfix.zzl());
                    zza2.zzp(zzfix.zzk());
                    zza2.zzg(zzfix.zzb());
                    zza2.zzv(3);
                    zza2.zzm(this.zzf.zza);
                    zza2.zzb(this.zzh);
                    zza2.zzk(Build.VERSION.RELEASE);
                    zza2.zzq(Build.VERSION.SDK_INT);
                    zza2.zzu(zzfix.zzn());
                    zza2.zzj(zzfix.zza());
                    zza2.zze((long) this.zzi);
                    zza2.zzs(zzfix.zzm());
                    zza2.zzc(zzfix.zzd());
                    zza2.zzf(zzfix.zzf());
                    zza2.zzh(zzfix.zzg());
                    zza2.zzi(this.zzj.zzc(zzfix.zzg()));
                    zza2.zzl(zzfix.zzh());
                    zza2.zzd(zzfix.zze());
                    zza2.zzr(zzfix.zzj());
                    zza2.zzn(zzfix.zzi());
                    zza2.zzo(zzfix.zzc());
                    if (((Boolean) zzba.zzc().zzb(zzbci.zziB)).booleanValue()) {
                        zza2.zza(this.zzk);
                    }
                    zzfjm zzfjm = this.zzg;
                    zzfjn zza3 = zzfjo.zza();
                    zza3.zza(zza2);
                    zzfjm.zzb(zza3);
                }
            }
        }
    }
}
