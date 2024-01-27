package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzetz {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfje zzd;
    private final zzdso zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzetz(Context context, Executor executor, Set set, zzfje zzfje, zzdso zzdso) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfje;
        this.zze = zzdso;
    }

    public final e zza(Object obj) {
        zzfit zza2 = zzfis.zza(this.zza, 8);
        zza2.zzh();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbca zzbca = zzbci.zzkL;
        if (!((String) zzba.zzc().zzb(zzbca)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzba.zzc().zzb(zzbca)).split(","));
        }
        this.zzf = zzt.zzB().elapsedRealtime();
        for (zzetw zzetw : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzetw.zza()))) {
                long elapsedRealtime = zzt.zzB().elapsedRealtime();
                e zzb2 = zzetw.zzb();
                zzb2.addListener(new zzetx(this, elapsedRealtime, zzetw), zzcbg.zzf);
                arrayList.add(zzb2);
            }
        }
        e zza3 = zzfzt.zzb(arrayList).zza(new zzety(arrayList, obj), this.zzc);
        if (zzfjh.zza()) {
            zzfjd.zza(zza3, this.zzd, zza2);
        }
        return zza3;
    }

    public final void zzb(long j10, zzetw zzetw) {
        long elapsedRealtime = zzt.zzB().elapsedRealtime() - j10;
        if (((Boolean) zzbee.zza.zze()).booleanValue()) {
            zze.zza("Signal runtime (ms) : " + zzftl.zzc(zzetw.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbY)).booleanValue()) {
            zzdsn zza2 = this.zze.zza();
            zza2.zzb(NativeProtocol.WEB_DIALOG_ACTION, "lat_ms");
            zza2.zzb("lat_grp", "sig_lat_grp");
            zza2.zzb("lat_id", String.valueOf(zzetw.zza()));
            zza2.zzb("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) zzba.zzc().zzb(zzbci.zzbZ)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza2.zzb("seq_num", zzt.zzo().zzg().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String valueOf = String.valueOf(zzt.zzB().elapsedRealtime() - this.zzf);
                        if (zzetw.zza() <= 39 || zzetw.zza() >= 52) {
                            zza2.zzb("lat_clsg", valueOf);
                        } else {
                            zza2.zzb("lat_gmssg", valueOf);
                        }
                    }
                }
            }
            zza2.zzh();
        }
    }
}
