package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.e;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcwp {
    private final zzfhr zza;
    private final zzcaz zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhaw zzg;
    private final String zzh;
    private final zzetz zzi;
    private final zzg zzj;
    private final zzfdn zzk;
    private final zzdcu zzl;

    public zzcwp(zzfhr zzfhr, zzcaz zzcaz, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhaw zzhaw, zzg zzg2, String str2, zzetz zzetz, zzfdn zzfdn, zzdcu zzdcu) {
        this.zza = zzfhr;
        this.zzb = zzcaz;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhaw;
        this.zzh = str2;
        this.zzi = zzetz;
        this.zzj = zzg2;
        this.zzk = zzfdn;
        this.zzl = zzdcu;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbvg zza(e eVar) {
        Bundle bundle = (Bundle) eVar.get();
        String str = (String) ((e) this.zzg.zzb()).get();
        boolean z10 = ((Boolean) zzba.zzc().zzb(zzbci.zzhe)).booleanValue() && this.zzj.zzQ();
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbvg(bundle, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, (zzffh) null, (String) null, z10, this.zzk.zzb());
    }

    public final e zzb() {
        this.zzl.zza();
        return zzfhb.zzc(this.zzi.zza(new Bundle()), zzfhl.SIGNALS, this.zza).zza();
    }

    public final e zzc() {
        e zzb2 = zzb();
        return this.zza.zza(zzfhl.REQUEST_PARCEL, zzb2, (e) this.zzg.zzb()).zza(new zzcwo(this, zzb2)).zza();
    }
}
