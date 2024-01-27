package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzepe implements zzetw {
    private static final Object zzb = new Object();
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final zzcuq zze;
    private final zzfeu zzf;
    private final zzfdn zzg;
    private final zzg zzh = zzt.zzo().zzh();
    private final zzdsj zzi;
    private final zzcvc zzj;

    public zzepe(Context context, String str, String str2, zzcuq zzcuq, zzfeu zzfeu, zzfdn zzfdn, zzdsj zzdsj, zzcvc zzcvc) {
        this.zza = context;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzcuq;
        this.zzf = zzfeu;
        this.zzg = zzfdn;
        this.zzi = zzdsj;
        this.zzj = zzcvc;
    }

    public final int zza() {
        return 12;
    }

    public final e zzb() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhv)).booleanValue()) {
            zzdsj zzdsj = this.zzi;
            zzdsj.zza().put("seq_num", this.zzc);
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfx)).booleanValue()) {
            this.zze.zzk(this.zzg.zzd);
            bundle.putAll(this.zzf.zzb());
        }
        return zzfzt.zzh(new zzepd(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfx)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzfw)).booleanValue()) {
                synchronized (zzb) {
                    this.zze.zzk(this.zzg.zzd);
                    bundle2.putBundle("quality_signals", this.zzf.zzb());
                }
            } else {
                this.zze.zzk(this.zzg.zzd);
                bundle2.putBundle("quality_signals", this.zzf.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzc);
        if (!this.zzh.zzQ()) {
            bundle2.putString("session_id", this.zzd);
        }
        bundle2.putBoolean("client_purpose_one", !this.zzh.zzQ());
        zzt.zzp();
        bundle2.putString("_app_id", com.google.android.gms.ads.internal.util.zzt.zzp(this.zza));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfy)).booleanValue() && this.zzg.zzf != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.zzj.zzb(this.zzg.zzf));
            bundle3.putInt("pcc", this.zzj.zza(this.zzg.zzf));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
    }
}
