package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzsx implements zzty {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzuf zzc = new zzuf();
    private final zzqx zzd = new zzqx();
    private Looper zze;
    private zzcv zzf;
    private zzol zzg;

    public /* synthetic */ zzcv zzM() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final zzol zzb() {
        zzol zzol = this.zzg;
        zzdx.zzb(zzol);
        return zzol;
    }

    /* access modifiers changed from: protected */
    public final zzqx zzc(zztw zztw) {
        return this.zzd.zza(0, zztw);
    }

    /* access modifiers changed from: protected */
    public final zzqx zzd(int i10, zztw zztw) {
        return this.zzd.zza(0, zztw);
    }

    /* access modifiers changed from: protected */
    public final zzuf zze(zztw zztw) {
        return this.zzc.zza(0, zztw);
    }

    /* access modifiers changed from: protected */
    public final zzuf zzf(int i10, zztw zztw) {
        return this.zzc.zza(0, zztw);
    }

    public final void zzg(Handler handler, zzqy zzqy) {
        this.zzd.zzb(handler, zzqy);
    }

    public final void zzh(Handler handler, zzug zzug) {
        this.zzc.zzb(handler, zzug);
    }

    public final void zzi(zztx zztx) {
        boolean z10 = !this.zzb.isEmpty();
        this.zzb.remove(zztx);
        if (z10 && this.zzb.isEmpty()) {
            zzj();
        }
    }

    /* access modifiers changed from: protected */
    public void zzj() {
    }

    public final void zzk(zztx zztx) {
        Objects.requireNonNull(this.zze);
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zztx);
        if (isEmpty) {
            zzl();
        }
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    public final void zzm(zztx zztx, zzhk zzhk, zzol zzol) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (!(looper == null || looper == myLooper)) {
            z10 = false;
        }
        zzdx.zzd(z10);
        this.zzg = zzol;
        zzcv zzcv = this.zzf;
        this.zza.add(zztx);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zztx);
            zzn(zzhk);
        } else if (zzcv != null) {
            zzk(zztx);
            zztx.zza(this, zzcv);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzn(zzhk zzhk);

    /* access modifiers changed from: protected */
    public final void zzo(zzcv zzcv) {
        this.zzf = zzcv;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zztx) arrayList.get(i10)).zza(this, zzcv);
        }
    }

    public final void zzp(zztx zztx) {
        this.zza.remove(zztx);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zztx);
    }

    /* access modifiers changed from: protected */
    public abstract void zzq();

    public final void zzr(zzqy zzqy) {
        this.zzd.zzc(zzqy);
    }

    public final void zzs(zzug zzug) {
        this.zzc.zzh(zzug);
    }

    public /* synthetic */ void zzt(zzbp zzbp) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    public /* synthetic */ boolean zzv() {
        return true;
    }
}
