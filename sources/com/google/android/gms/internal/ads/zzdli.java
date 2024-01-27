package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdli implements zzcyf {
    private final zzdjj zza;
    private final zzdjo zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdli(zzdjj zzdjj, zzdjo zzdjo, Executor executor, Executor executor2) {
        this.zza = zzdjj;
        this.zzb = zzdjo;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzcgb zzcgb) {
        this.zzc.execute(new zzdlg(zzcgb));
    }

    public final void zzq() {
        if (this.zzb.zzd()) {
            zzdjj zzdjj = this.zza;
            zzfkc zzu = zzdjj.zzu();
            if (zzu == null && zzdjj.zzw() != null) {
                if (((Boolean) zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
                    zzdjj zzdjj2 = this.zza;
                    e zzw = zzdjj2.zzw();
                    zzcbl zzp = zzdjj2.zzp();
                    if (zzw != null && zzp != null) {
                        zzfzt.zzr(zzfzt.zzl(zzw, zzp), new zzdlh(this), this.zzd);
                        return;
                    }
                    return;
                }
            }
            if (zzu != null) {
                zzdjj zzdjj3 = this.zza;
                zzcgb zzr = zzdjj3.zzr();
                zzcgb zzs = zzdjj3.zzs();
                if (zzr == null) {
                    zzr = zzs != null ? zzs : null;
                }
                if (zzr != null) {
                    zzb(zzr);
                }
            }
        }
    }
}
