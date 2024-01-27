package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zztf extends zzsx {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhk zzc;

    protected zztf() {
    }

    /* access modifiers changed from: protected */
    public abstract void zzA(Object obj, zzty zzty, zzcv zzcv);

    /* access modifiers changed from: protected */
    public final void zzB(Object obj, zzty zzty) {
        zzdx.zzd(!this.zza.containsKey(obj));
        zztc zztc = new zztc(this, obj);
        zztd zztd = new zztd(this, obj);
        this.zza.put(obj, new zzte(zzty, zztc, zztd));
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zzty.zzh(handler, zztd);
        Handler handler2 = this.zzb;
        Objects.requireNonNull(handler2);
        zzty.zzg(handler2, zztd);
        zzty.zzm(zztc, this.zzc, zzb());
        if (!zzu()) {
            zzty.zzi(zztc);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj() {
        for (zzte zzte : this.zza.values()) {
            zzte.zza.zzi(zzte.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        for (zzte zzte : this.zza.values()) {
            zzte.zza.zzk(zzte.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public void zzn(zzhk zzhk) {
        this.zzc = zzhk;
        this.zzb = zzfk.zzv((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    public void zzq() {
        for (zzte zzte : this.zza.values()) {
            zzte.zza.zzp(zzte.zzb);
            zzte.zza.zzs(zzte.zzc);
            zzte.zza.zzr(zzte.zzc);
        }
        this.zza.clear();
    }

    /* access modifiers changed from: protected */
    public int zzw(Object obj, int i10) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public long zzx(Object obj, long j10) {
        return j10;
    }

    /* access modifiers changed from: protected */
    public zztw zzy(Object obj, zztw zztw) {
        throw null;
    }

    public void zzz() {
        for (zzte zzte : this.zza.values()) {
            zzte.zza.zzz();
        }
    }
}
