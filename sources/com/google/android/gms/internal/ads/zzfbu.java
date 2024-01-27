package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfbu implements OnAdMetadataChangedListener, zzcyz, zzcxo, zzcxl, zzcyb, zzczw, zzfaf, zzdfd {
    private final zzfew zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfbu(zzfew zzfew) {
        this.zza = zzfew;
    }

    public final void onAdMetadataChanged() {
        zzezw.zza(this.zzb, zzfbi.zza);
    }

    public final void zza() {
        this.zza.zza();
        zzezw.zza(this.zzd, zzfbq.zza);
        zzezw.zza(this.zze, zzfbr.zza);
    }

    public final void zzb() {
        zzezw.zza(this.zze, zzfbs.zza);
    }

    public final void zzbF(zze zze2) {
        int i10 = zze2.zza;
        zzezw.zza(this.zzc, new zzfbn(zze2));
        zzezw.zza(this.zzc, new zzfbo(i10));
        zzezw.zza(this.zze, new zzfbp(i10));
    }

    public final void zzbK() {
        zzezw.zza(this.zzd, zzfbj.zza);
    }

    public final void zzbw(zzbvw zzbvw, String str, String str2) {
        zzezw.zza(this.zzd, new zzfbt(zzbvw));
        zzezw.zza(this.zzf, new zzfaz(zzbvw, str, str2));
        zzezw.zza(this.zze, new zzfba(zzbvw));
        zzezw.zza(this.zzg, new zzfbb(zzbvw, str, str2));
    }

    public final void zzc() {
        zzezw.zza(this.zzd, zzfbc.zza);
        zzezw.zza(this.zze, zzfbd.zza);
        zzezw.zza(this.zzd, zzfbe.zza);
    }

    public final void zze() {
        zzezw.zza(this.zze, zzfbm.zza);
    }

    public final void zzf() {
        zzezw.zza(this.zze, zzfay.zza);
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzh(zzs zzs) {
        zzezw.zza(this.zzh, new zzfbf(zzs));
    }

    public final void zzi(zzdg zzdg) {
        this.zzh.set(zzdg);
    }

    public final void zzj(zzbws zzbws) {
        this.zzd.set(zzbws);
    }

    public final void zzk(zzbww zzbww) {
        this.zzc.set(zzbww);
    }

    public final void zzl(zzfaf zzfaf) {
        throw null;
    }

    @Deprecated
    public final void zzm(zzbwc zzbwc) {
        this.zze.set(zzbwc);
    }

    @Deprecated
    public final void zzn(zzbvx zzbvx) {
        this.zzg.set(zzbvx);
    }

    public final void zzo(zzbwx zzbwx) {
        this.zzf.set(zzbwx);
    }

    public final void zzp(zze zze2) {
        zzezw.zza(this.zzd, new zzfbk(zze2));
        zzezw.zza(this.zzd, new zzfbl(zze2));
    }

    public final void zzr() {
        zzezw.zza(this.zzc, zzfbg.zza);
        zzezw.zza(this.zze, zzfbh.zza);
    }

    public final void zzs() {
    }
}
