package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfoo {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfop zzc;
    private final zzfmq zzd;
    private final zzfml zze;
    private zzfod zzf;
    private final Object zzg = new Object();

    public zzfoo(Context context, zzfop zzfop, zzfmq zzfmq, zzfml zzfml) {
        this.zzb = context;
        this.zzc = zzfop;
        this.zzd = zzfmq;
        this.zze = zzfml;
    }

    private final synchronized Class zzd(zzfoe zzfoe) {
        String zzk = zzfoe.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfoe.zzc())) {
                File zzb2 = zzfoe.zzb();
                if (!zzb2.exists()) {
                    zzb2.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfoe.zzc().getAbsolutePath(), zzb2.getAbsolutePath(), (String) null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            }
            throw new zzfon(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e10) {
            throw new zzfon(2026, (Throwable) e10);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e11) {
            throw new zzfon((int) AdError.REMOTE_ADS_SERVICE_ERROR, e11);
        }
    }

    public final zzfmt zza() {
        zzfod zzfod;
        synchronized (this.zzg) {
            zzfod = this.zzf;
        }
        return zzfod;
    }

    public final zzfoe zzb() {
        synchronized (this.zzg) {
            zzfod zzfod = this.zzf;
            if (zzfod == null) {
                return null;
            }
            zzfoe zzf2 = zzfod.zzf();
            return zzf2;
        }
    }

    public final boolean zzc(zzfoe zzfoe) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class zzd2 = zzd(zzfoe);
            zzfod zzfod = new zzfod(zzd2.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.zzb, "msa-r", zzfoe.zze(), null, new Bundle(), 2}), zzfoe, this.zzc, this.zzd);
            if (zzfod.zzh()) {
                int zze2 = zzfod.zze();
                if (zze2 == 0) {
                    synchronized (this.zzg) {
                        zzfod zzfod2 = this.zzf;
                        if (zzfod2 != null) {
                            try {
                                zzfod2.zzg();
                            } catch (zzfon e10) {
                                this.zzd.zzc(e10.zza(), -1, e10);
                            }
                        }
                        this.zzf = zzfod;
                    }
                    this.zzd.zzd(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfon(4001, "ci: " + zze2);
            }
            throw new zzfon(4000, "init failed");
        } catch (Exception e11) {
            throw new zzfon((int) AdError.INTERNAL_ERROR_2004, (Throwable) e11);
        } catch (zzfon e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e13);
            return false;
        }
    }
}
