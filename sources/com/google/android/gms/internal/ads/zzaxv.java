package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaxv {
    private final zzayb zza;
    private final zzazk zzb;
    private final boolean zzc;

    private zzaxv() {
        this.zzb = zzazl.zzd();
        this.zzc = false;
        this.zza = new zzayb();
    }

    public static zzaxv zza() {
        return new zzaxv();
    }

    private final synchronized String zzd(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.zzb.zzk(), Long.valueOf(zzt.zzB().elapsedRealtime()), Integer.valueOf(i10 - 1), Base64.encodeToString(((zzazl) this.zzb.zzal()).zzax(), 3)});
    }

    private final synchronized void zze(int i10) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(zzd(i10).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zze.zza("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized void zzf(int i10) {
        zzazk zzazk = this.zzb;
        zzazk.zzd();
        zzazk.zzc(com.google.android.gms.ads.internal.util.zzt.zzd());
        zzaya zzaya = new zzaya(this.zza, ((zzazl) this.zzb.zzal()).zzax(), (zzaxz) null);
        int i11 = i10 - 1;
        zzaya.zza(i11);
        zzaya.zzc();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void zzb(zzaxu zzaxu) {
        if (this.zzc) {
            try {
                zzaxu.zza(this.zzb);
            } catch (NullPointerException e10) {
                zzt.zzo().zzu(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (this.zzc) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzeN)).booleanValue()) {
                zze(i10);
            } else {
                zzf(i10);
            }
        }
    }

    public zzaxv(zzayb zzayb) {
        this.zzb = zzazl.zzd();
        this.zza = zzayb;
        this.zzc = ((Boolean) zzba.zzc().zzb(zzbci.zzeM)).booleanValue();
    }
}
