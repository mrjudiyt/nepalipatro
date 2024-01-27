package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzaud implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzasp zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzaom zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzaud(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11) {
        this.zzb = zzasp;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzaom;
        this.zzg = i10;
        this.zzh = i11;
    }

    public /* bridge */ /* synthetic */ Object call() {
        zzl();
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract void zza();

    public Void zzl() {
        int i10;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
            if (zzj == null) {
                return null;
            }
            zza();
            zzarj zzd2 = this.zzb.zzd();
            if (!(zzd2 == null || (i10 = this.zzg) == Integer.MIN_VALUE)) {
                zzd2.zzc(this.zzh, i10, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
