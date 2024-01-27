package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcgk implements zzftm {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzchq zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzaro zzf;
    public final /* synthetic */ zzbdk zzg;
    public final /* synthetic */ zzcaz zzh;
    public final /* synthetic */ zzl zzi;
    public final /* synthetic */ zza zzj;
    public final /* synthetic */ zzaxv zzk;
    public final /* synthetic */ zzfcr zzl;
    public final /* synthetic */ zzfcv zzm;
    public final /* synthetic */ zzedz zzn;

    public /* synthetic */ zzcgk(Context context, zzchq zzchq, String str, boolean z10, boolean z11, zzaro zzaro, zzbdk zzbdk, zzcaz zzcaz, zzbda zzbda, zzl zzl2, zza zza2, zzaxv zzaxv, zzfcr zzfcr, zzfcv zzfcv, zzedz zzedz) {
        this.zza = context;
        this.zzb = zzchq;
        this.zzc = str;
        this.zzd = z10;
        this.zze = z11;
        this.zzf = zzaro;
        this.zzg = zzbdk;
        this.zzh = zzcaz;
        this.zzi = zzl2;
        this.zzj = zza2;
        this.zzk = zzaxv;
        this.zzl = zzfcr;
        this.zzm = zzfcv;
        this.zzn = zzedz;
    }

    public final Object zza() {
        zzchq zzchq = this.zzb;
        String str = this.zzc;
        boolean z10 = this.zzd;
        zzaxv zzaxv = this.zzk;
        boolean z11 = this.zze;
        zzaro zzaro = this.zzf;
        zzbdk zzbdk = this.zzg;
        zzl zzl2 = this.zzi;
        zzfcr zzfcr = this.zzl;
        Context context = this.zza;
        zzcaz zzcaz = this.zzh;
        zza zza2 = this.zzj;
        zzfcv zzfcv = this.zzm;
        zzedz zzedz = this.zzn;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = zzcgu.zza;
            zzcgu zzcgu = r2;
            boolean z12 = z11;
            zzcgu zzcgu2 = new zzcgu(new zzchp(context), zzchq, str, z10, z11, zzaro, zzbdk, zzcaz, (zzbda) null, zzl2, zza2, zzaxv, zzfcr, zzfcv);
            zzcgq zzcgq = new zzcgq(zzcgu);
            zzcgq.setWebViewClient(zzt.zzq().zzd(zzcgq, zzaxv, z12, zzedz));
            zzcgq.setWebChromeClient(new zzcga(zzcgq));
            return zzcgq;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
