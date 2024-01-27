package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzfyp extends zzfzj implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    e zza;
    Object zzb;

    zzfyp(e eVar, Object obj) {
        Objects.requireNonNull(eVar);
        this.zza = eVar;
        this.zzb = obj;
    }

    public final void run() {
        e eVar = this.zza;
        Object obj = this.zzb;
        boolean z10 = true;
        boolean isCancelled = isCancelled() | (eVar == null);
        if (obj != null) {
            z10 = false;
        }
        if (!isCancelled && !z10) {
            this.zza = null;
            if (eVar.isCancelled()) {
                zzs(eVar);
                return;
            }
            try {
                try {
                    Object zze = zze(obj, zzfzt.zzp(eVar));
                    this.zzb = null;
                    zzf(zze);
                } catch (Throwable th) {
                    this.zzb = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e10) {
                zzd(e10.getCause());
            } catch (RuntimeException e11) {
                zzd(e11);
            } catch (Error e12) {
                zzd(e12);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        String str;
        e eVar = this.zza;
        Object obj = this.zzb;
        String zza2 = super.zza();
        if (eVar != null) {
            str = "inputFuture=[" + eVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + "]";
        } else if (zza2 != null) {
            return str.concat(zza2);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zze(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract void zzf(Object obj);
}
