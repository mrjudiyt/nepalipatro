package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzauc {
    protected static final String zza = "zzauc";
    private final zzasp zzb;
    private final String zzc;
    private final String zzd;
    private volatile Method zze = null;
    private final Class[] zzf;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzauc(zzasp zzasp, String str, String str2, Class... clsArr) {
        this.zzb = zzasp;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzasp.zzk().submit(new zzaub(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzauc zzauc) {
        CountDownLatch countDownLatch;
        try {
            zzasp zzasp = zzauc.zzb;
            Class loadClass = zzasp.zzi().loadClass(zzauc.zzc(zzasp.zzu(), zzauc.zzc));
            if (loadClass == null) {
                countDownLatch = zzauc.zzg;
            } else {
                zzauc.zze = loadClass.getMethod(zzauc.zzc(zzauc.zzb.zzu(), zzauc.zzd), zzauc.zzf);
                if (zzauc.zze == null) {
                    countDownLatch = zzauc.zzg;
                }
                countDownLatch = zzauc.zzg;
            }
        } catch (zzart | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzauc.zzg;
        } catch (Throwable th) {
            zzauc.zzg.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (!this.zzg.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zze;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
