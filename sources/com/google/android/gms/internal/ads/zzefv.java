package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzefv implements zzeeu {
    private final zzcrs zza;
    private final Context zzb;
    private final zzdpt zzc;
    private final zzfdn zzd;
    private final Executor zze;
    private final zzfsk zzf;

    public zzefv(zzcrs zzcrs, Context context, Executor executor, zzdpt zzdpt, zzfdn zzfdn, zzfsk zzfsk) {
        this.zzb = context;
        this.zza = zzcrs;
        this.zze = executor;
        this.zzc = zzdpt;
        this.zzd = zzfdn;
        this.zzf = zzfsk;
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        return zzfzt.zzn(zzfzt.zzh((Object) null), new zzefu(this, zzfde, zzfcr), this.zze);
    }

    public final boolean zzb(zzfde zzfde, zzfcr zzfcr) {
        zzfcx zzfcx = zzfcr.zzu;
        return (zzfcx == null || zzfcx.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(zzfde zzfde, zzfcr zzfcr, Object obj) {
        View view;
        zzq zza2 = zzfdr.zza(this.zzb, zzfcr.zzw);
        zzcgb zza3 = this.zzc.zza(zza2, zzfcr, zzfde.zzb.zzb);
        zza3.zzZ(zzfcr.zzY);
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhD)).booleanValue() || !zzfcr.zzai) {
            view = new zzdpw(this.zzb, (View) zza3, (zzau) this.zzf.apply(zzfcr));
        } else {
            view = zzcsj.zza(this.zzb, (View) zza3, zzfcr);
        }
        zzcqw zza4 = this.zza.zza(new zzctm(zzfde, zzfcr, (String) null), new zzcrc(view, zza3, new zzefp(zza3), zzfdr.zzb(zza2)));
        zza4.zzh().zzi(zza3, false, (zzbjl) null);
        zzcyd zzc2 = zza4.zzc();
        zzefq zzefq = new zzefq(zza3);
        zzgad zzgad = zzcbg.zzf;
        zzc2.zzo(zzefq, zzgad);
        zza4.zzh();
        zzfcx zzfcx = zzfcr.zzu;
        e zzj = zzdps.zzj(zza3, zzfcx.zzb, zzfcx.zza);
        if (zzfcr.zzO) {
            zzj.addListener(new zzefr(zza3), this.zze);
        }
        zzj.addListener(new zzefs(this, zza3), this.zze);
        return zzfzt.zzm(zzj, new zzeft(zza4), zzgad);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcgb zzcgb) {
        zzcgb.zzY();
        zzcgx zzq = zzcgb.zzq();
        zzfl zzfl = this.zzd.zza;
        if (zzfl != null && zzq != null) {
            zzq.zzs(zzfl);
        }
    }
}
