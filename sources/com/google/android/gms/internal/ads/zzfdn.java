package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfdn {
    public final zzfl zza;
    public final zzbls zzb;
    public final zzemk zzc;
    public final zzl zzd;
    public final zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbfc zzi;
    public final zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzcb zzn;
    public final zzfda zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final zzcf zzr;

    /* synthetic */ zzfdn(zzfdl zzfdl, zzfdm zzfdm) {
        zzfl zzfl;
        zzbfc zzbfc;
        this.zze = zzfdl.zzb;
        this.zzf = zzfdl.zzc;
        this.zzr = zzfdl.zzs;
        int i10 = zzfdl.zza.zza;
        long j10 = zzfdl.zza.zzb;
        Bundle bundle = zzfdl.zza.zzc;
        int i11 = zzfdl.zza.zzd;
        List list = zzfdl.zza.zze;
        boolean z10 = zzfdl.zza.zzf;
        int i12 = zzfdl.zza.zzg;
        boolean z11 = true;
        if (!zzfdl.zza.zzh && !zzfdl.zze) {
            z11 = false;
        }
        this.zzd = new zzl(i10, j10, bundle, i11, list, z10, i12, z11, zzfdl.zza.zzi, zzfdl.zza.zzj, zzfdl.zza.zzk, zzfdl.zza.zzl, zzfdl.zza.zzm, zzfdl.zza.zzn, zzfdl.zza.zzo, zzfdl.zza.zzp, zzfdl.zza.zzq, zzfdl.zza.zzr, zzfdl.zza.zzs, zzfdl.zza.zzt, zzfdl.zza.zzu, zzfdl.zza.zzv, zzt.zza(zzfdl.zza.zzw), zzfdl.zza.zzx, zzfdl.zza.zzy);
        if (zzfdl.zzd != null) {
            zzfl = zzfdl.zzd;
        } else {
            zzfl = zzfdl.zzh != null ? zzfdl.zzh.zzf : null;
        }
        this.zza = zzfl;
        this.zzg = zzfdl.zzf;
        this.zzh = zzfdl.zzg;
        if (zzfdl.zzf == null) {
            zzbfc = null;
        } else {
            zzbfc = zzfdl.zzh == null ? new zzbfc(new NativeAdOptions.Builder().build()) : zzfdl.zzh;
        }
        this.zzi = zzbfc;
        this.zzj = zzfdl.zzi;
        this.zzk = zzfdl.zzm;
        this.zzl = zzfdl.zzj;
        this.zzm = zzfdl.zzk;
        this.zzn = zzfdl.zzl;
        this.zzb = zzfdl.zzn;
        this.zzo = new zzfda(zzfdl.zzo, (zzfcz) null);
        this.zzp = zzfdl.zzp;
        this.zzc = zzfdl.zzq;
        this.zzq = zzfdl.zzr;
    }

    public final zzbhf zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }

    public final boolean zzb() {
        zzbca zzbca = zzbci.zzcT;
        return this.zzf.matches((String) zzba.zzc().zzb(zzbca));
    }
}
