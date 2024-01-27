package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzezo implements zzfai {
    private final zzfai zza;
    private final zzfai zzb;
    private final zzffw zzc;
    private final String zzd;
    private zzcws zze;
    private final Executor zzf;

    public zzezo(zzfai zzfai, zzfai zzfai2, zzffw zzffw, String str, Executor executor) {
        this.zza = zzfai;
        this.zzb = zzfai2;
        this.zzc = zzffw;
        this.zzd = str;
        this.zzf = executor;
    }

    private final e zzg(zzffj zzffj, zzfaj zzfaj) {
        zzcws zzcws = zzffj.zza;
        this.zze = zzcws;
        if (zzffj.zzc != null) {
            if (zzcws.zzf() != null) {
                zzffj.zzc.zzo().zzl(zzffj.zza.zzf());
            }
            return zzfzt.zzh(zzffj.zzc);
        }
        zzcws.zzb().zzl(zzffj.zzb);
        return ((zzezy) this.zza).zzb(zzfaj, (zzfah) null, zzffj.zza);
    }

    /* renamed from: zza */
    public final synchronized zzcws zzd() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzb(zzfaj zzfaj, zzezn zzezn, zzfah zzfah, zzcws zzcws, zzezt zzezt) {
        if (zzezt != null) {
            zzezn zzezn2 = new zzezn(zzezn.zza, zzezn.zzb, zzezn.zzc, zzezn.zzd, zzezn.zze, zzezn.zzf, zzezt.zza);
            if (zzezt.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzezn2);
                return zzg(zzezt.zzc, zzfaj);
            }
            e zza2 = this.zzc.zza(zzezn2);
            if (zza2 != null) {
                this.zze = null;
                return zzfzt.zzn(zza2, new zzezk(this), this.zzf);
            }
            this.zzc.zze(zzezn2);
            zzfaj = new zzfaj(zzfaj.zzb, zzezt.zzb);
        }
        e zzb2 = ((zzezy) this.zza).zzb(zzfaj, zzfah, zzcws);
        this.zze = zzcws;
        return zzb2;
    }

    public final /* bridge */ /* synthetic */ e zzc(zzfaj zzfaj, zzfah zzfah, Object obj) {
        return zzf(zzfaj, zzfah, (zzcws) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zze(zzfft zzfft) {
        zzffv zzffv;
        if (zzfft == null || zzfft.zza == null || (zzffv = zzfft.zzb) == null) {
            throw new zzdwm(1, "Empty prefetch");
        }
        zzayk zza2 = zzayq.zza();
        zzayi zza3 = zzayj.zza();
        zza3.zzd(2);
        zza3.zzb(zzayn.zzd());
        zza2.zza(zza3);
        zzfft.zza.zza.zzb().zzc().zzm((zzayq) zza2.zzal());
        return zzg(zzfft.zza, ((zzezn) zzffv).zzb);
    }

    public final synchronized e zzf(zzfaj zzfaj, zzfah zzfah, zzcws zzcws) {
        zzfaj zzfaj2 = zzfaj;
        zzfah zzfah2 = zzfah;
        synchronized (this) {
            zzcwr zza2 = zzfah2.zza(zzfaj2.zzb);
            zza2.zza(new zzezp(this.zzd));
            zzcws zzcws2 = (zzcws) zza2.zzh();
            zzcws2.zzg();
            zzcws2.zzg();
            zzl zzl = zzcws2.zzg().zzd;
            if (zzl.zzs == null) {
                if (zzl.zzx == null) {
                    zzfdn zzg = zzcws2.zzg();
                    zzfah zzfah3 = zzfah;
                    zzfaj zzfaj3 = zzfaj;
                    e zzn = zzfzt.zzn(zzfzk.zzu(((zzezu) this.zzb).zzb(zzfaj2, zzfah2, zzcws2)), new zzezl(this, zzfaj, new zzezn(zzfah3, zzfaj3, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, (zzffk) null), zzfah, zzcws2), this.zzf);
                    return zzn;
                }
            }
            this.zze = zzcws2;
            e zzb2 = ((zzezy) this.zza).zzb(zzfaj2, zzfah2, zzcws2);
            return zzb2;
        }
    }
}
