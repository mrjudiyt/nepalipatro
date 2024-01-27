package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdda {
    /* access modifiers changed from: private */
    public final Set zza = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzb = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzc = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzd = new HashSet();
    /* access modifiers changed from: private */
    public final Set zze = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzf = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzg = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzh = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzi = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzj = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzk = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzl = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzm = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzn = new HashSet();
    /* access modifiers changed from: private */
    public zzfaf zzo;

    public final zzdda zza(zza zza2, Executor executor) {
        this.zzc.add(new zzdev(zza2, executor));
        return this;
    }

    public final zzdda zzb(zzcxo zzcxo, Executor executor) {
        this.zzi.add(new zzdev(zzcxo, executor));
        return this;
    }

    public final zzdda zzc(zzcyb zzcyb, Executor executor) {
        this.zzl.add(new zzdev(zzcyb, executor));
        return this;
    }

    public final zzdda zzd(zzcyf zzcyf, Executor executor) {
        this.zzf.add(new zzdev(zzcyf, executor));
        return this;
    }

    public final zzdda zze(zzcxl zzcxl, Executor executor) {
        this.zze.add(new zzdev(zzcxl, executor));
        return this;
    }

    public final zzdda zzf(zzcyz zzcyz, Executor executor) {
        this.zzh.add(new zzdev(zzcyz, executor));
        return this;
    }

    public final zzdda zzg(zzczk zzczk, Executor executor) {
        this.zzg.add(new zzdev(zzczk, executor));
        return this;
    }

    public final zzdda zzh(zzo zzo2, Executor executor) {
        this.zzn.add(new zzdev(zzo2, executor));
        return this;
    }

    public final zzdda zzi(zzczw zzczw, Executor executor) {
        this.zzm.add(new zzdev(zzczw, executor));
        return this;
    }

    public final zzdda zzj(zzdag zzdag, Executor executor) {
        this.zzb.add(new zzdev(zzdag, executor));
        return this;
    }

    public final zzdda zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdev(appEventListener, executor));
        return this;
    }

    public final zzdda zzl(zzdfd zzdfd, Executor executor) {
        this.zzd.add(new zzdev(zzdfd, executor));
        return this;
    }

    public final zzdda zzm(zzfaf zzfaf) {
        this.zzo = zzfaf;
        return this;
    }

    public final zzddc zzn() {
        return new zzddc(this, (zzddb) null);
    }
}
