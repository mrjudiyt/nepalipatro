package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
final class zzn {
    static final zzl zza = new zzf(zzj.zze("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
    static final zzl zzb = new zzg(zzj.zze("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
    static final zzl zzc = new zzh(zzj.zze("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));
    static final zzl zzd = new zzi(zzj.zze("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));
    private static volatile zzag zze;
    private static final Object zzf = new Object();
    private static Context zzg;

    static zzx zza(String str, zzj zzj, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzj, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static zzx zzb(String str, boolean z10, boolean z11, boolean z12) {
        return zzi(str, z10, false, false, true);
    }

    static zzx zzc(String str, boolean z10, boolean z11, boolean z12) {
        return zzi(str, z10, false, false, false);
    }

    static /* synthetic */ String zzd(boolean z10, String str, zzj zzj) {
        String str2 = true != (!z10 && zzh(str, zzj, true, false).zza) ? "not allowed" : "debug cert rejected";
        MessageDigest zza2 = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(zza2);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, Hex.bytesToStringLowercase(zza2.digest(zzj.zzf())), Boolean.valueOf(z10), "12451000.false"});
    }

    static synchronized void zze(Context context) {
        synchronized (zzn.class) {
            if (zzg != null) {
                return;
            }
            if (context != null) {
                zzg = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    static boolean zzf() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzj();
            boolean zzg2 = zze.zzg();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzg2;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    static boolean zzg() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzj();
            boolean zzi = zze.zzi();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzi;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static zzx zzh(String str, zzj zzj, boolean z10, boolean z11) {
        try {
            zzj();
            Preconditions.checkNotNull(zzg);
            try {
                return zze.zzh(new zzs(str, zzj, z10, z11), ObjectWrapper.wrap(zzg.getPackageManager())) ? zzx.zzb() : new zzv(new zze(z10, str, zzj), (zzu) null);
            } catch (RemoteException e10) {
                return zzx.zzd("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            return zzx.zzd("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    private static zzx zzi(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        zzx zzx;
        zzq zzq;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(zzg);
            try {
                zzj();
                zzo zzo = new zzo(str, z10, false, ObjectWrapper.wrap(zzg), false, true);
                if (z13) {
                    zzq = zze.zze(zzo);
                } else {
                    zzq = zze.zzf(zzo);
                }
                if (zzq.zzb()) {
                    zzx = zzx.zzf(zzq.zzc());
                } else {
                    String zza2 = zzq.zza();
                    PackageManager.NameNotFoundException nameNotFoundException = zzq.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (zza2 == null) {
                        zza2 = "error checking package certificate";
                    }
                    zzx = zzx.zzg(zzq.zzc(), zzq.zzd(), zza2, nameNotFoundException);
                }
            } catch (DynamiteModule.LoadingException e10) {
                zzx = zzx.zzd("module init: ".concat(String.valueOf(e10.getMessage())), e10);
            }
        } catch (RemoteException e11) {
            zzx = zzx.zzd("module call", e11);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return zzx;
    }

    private static void zzj() {
        if (zze == null) {
            Preconditions.checkNotNull(zzg);
            synchronized (zzf) {
                if (zze == null) {
                    zze = zzaf.zzb(DynamiteModule.load(zzg, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
