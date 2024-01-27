package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcf;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzchw implements zzcni {
    private static zzchw zza;

    private static synchronized zzchw zzD(Context context, zzbox zzbox, int i10, boolean z10, int i11, zzcja zzcja) {
        synchronized (zzchw.class) {
            zzchw zzchw = zza;
            if (zzchw != null) {
                return zzchw;
            }
            zzbci.zza(context);
            zzfeh zzd = zzfeh.zzd(context);
            zzcaz zzc = zzd.zzc(233702000, false, i11);
            zzd.zzf(zzbox);
            zzcko zzcko = new zzcko((zzckn) null);
            zzchx zzchx = new zzchx();
            zzchx.zzd(zzc);
            zzchx.zzc(context);
            zzcko.zzb(new zzchz(zzchx, (zzchy) null));
            zzcko.zzc(new zzcmb(zzcja));
            zzchw zza2 = zzcko.zza();
            zzt.zzo().zzs(context, zzc);
            zzt.zzc().zzi(context);
            zzt.zzp().zzl(context);
            zzt.zzp().zzk(context);
            zzd.zza(context);
            zzt.zzb().zzd(context);
            zzt.zzv().zzb(context);
            zza2.zza().zzc();
            zzbyz.zzd(context);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzgf)).booleanValue()) {
                if (!((Boolean) zzba.zzc().zzb(zzbci.zzau)).booleanValue()) {
                    zzaxv zzaxv = new zzaxv(new zzayb(context));
                    zzech zzech = new zzech(new zzecd(context), zza2.zzA());
                    zzt.zzp();
                    new zzedd(context, zzc, zzaxv, zzech, UUID.randomUUID().toString(), zza2.zzy()).zzb(zzt.zzo().zzh().zzQ());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzchw zzb(Context context, zzbox zzbox, int i10) {
        return zzD(context, zzbox, 233702000, false, i10, new zzcja());
    }

    public abstract zzgad zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract zzcf zza();

    public abstract zzcml zzc();

    public abstract zzcqi zzd();

    public abstract zzcrr zze();

    public abstract zzdaa zzf();

    public abstract zzdgw zzg();

    public abstract zzdhs zzh();

    public abstract zzdpb zzi();

    public abstract zzdtx zzj();

    public abstract zzdvm zzk();

    public abstract zzdwg zzl();

    public abstract zzedz zzm();

    public abstract zzc zzn();

    public abstract zzg zzo();

    public abstract zzaa zzp();

    public final zzeuu zzq(zzbvg zzbvg, int i10) {
        return zzr(new zzeww(zzbvg, i10));
    }

    /* access modifiers changed from: protected */
    public abstract zzeuu zzr(zzeww zzeww);

    public abstract zzexr zzs();

    public abstract zzezf zzt();

    public abstract zzfaw zzu();

    public abstract zzfck zzv();

    public abstract zzfea zzw();

    public abstract zzfek zzx();

    public abstract zzfib zzy();

    public abstract zzfjh zzz();
}
