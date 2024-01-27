package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcac {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final zzj zzb;
    private final zzcag zzc;
    private boolean zzd;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public zzcaz zzf;
    private String zzg;
    /* access modifiers changed from: private */
    public zzbcq zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final zzcab zzk;
    private final Object zzl;
    private e zzm;
    /* access modifiers changed from: private */
    public final AtomicBoolean zzn;

    public zzcac() {
        zzj zzj2 = new zzj();
        this.zzb = zzj2;
        this.zzc = new zzcag(zzay.zzd(), zzj2);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new zzcab((zzcaa) null);
        this.zzl = new Object();
        this.zzn = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzj.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzjW)).booleanValue()) {
                return zzcax.zza(this.zze).getResources();
            }
            zzcax.zza(this.zze).getResources();
            return null;
        } catch (zzcaw e10) {
            zzcat.zzk("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final zzbcq zzf() {
        zzbcq zzbcq;
        synchronized (this.zza) {
            zzbcq = this.zzh;
        }
        return zzbcq;
    }

    public final zzcag zzg() {
        return this.zzc;
    }

    public final zzg zzh() {
        zzj zzj2;
        synchronized (this.zza) {
            zzj2 = this.zzb;
        }
        return zzj2;
    }

    public final e zzj() {
        if (this.zze != null) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzcy)).booleanValue()) {
                synchronized (this.zzl) {
                    e eVar = this.zzm;
                    if (eVar != null) {
                        return eVar;
                    }
                    e zzb2 = zzcbg.zza.zzb(new zzbzx(this));
                    this.zzm = zzb2;
                    return zzb2;
                }
            }
        }
        return zzfzt.zzh(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzm() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzn() {
        Context zza2 = zzbvu.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza2).getPackageInfo(zza2.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzp() {
        this.zzk.zza();
    }

    public final void zzq() {
        this.zzj.decrementAndGet();
    }

    public final void zzr() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzs(Context context, zzcaz zzcaz) {
        zzbcq zzbcq;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzcaz;
                zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbty.zzb(this.zze, this.zzf);
                zzt.zze();
                if (!((Boolean) zzbdv.zzc.zze()).booleanValue()) {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbcq = null;
                } else {
                    zzbcq = new zzbcq();
                }
                this.zzh = zzbcq;
                if (zzbcq != null) {
                    zzcbj.zza(new zzbzy(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) zzba.zzc().zzb(zzbci.zzih)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbzz(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        zzt.zzp().zzc(context, zzcaz.zza);
    }

    public final void zzt(Throwable th, String str) {
        zzbty.zzb(this.zze, this.zzf).zzg(th, str, ((Double) zzbek.zzg.zze()).floatValue());
    }

    public final void zzu(Throwable th, String str) {
        zzbty.zzb(this.zze, this.zzf).zzf(th, str);
    }

    public final void zzv(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzw(String str) {
        this.zzg = str;
    }

    public final boolean zzx(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzih)).booleanValue()) {
                return this.zzn.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
