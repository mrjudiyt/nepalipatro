package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcsd extends zzcqv {
    private final zzbhf zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcsd(zzcsw zzcsw, zzbhf zzbhf, Runnable runnable, Executor executor) {
        super(zzcsw);
        this.zzc = zzbhf;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int zza() {
        return 0;
    }

    public final View zzc() {
        return null;
    }

    public final zzdq zzd() {
        return null;
    }

    public final zzfcs zze() {
        return null;
    }

    public final zzfcs zzf() {
        return null;
    }

    public final void zzg() {
    }

    public final void zzh(ViewGroup viewGroup, zzq zzq) {
    }

    public final void zzj() {
        this.zze.execute(new zzcsc(this, new zzcsb(new AtomicReference(this.zzd))));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (!this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                zzi(((zzcsb) runnable).zza);
            }
        } catch (RemoteException unused) {
            zzi(((zzcsb) runnable).zza);
        }
    }
}
