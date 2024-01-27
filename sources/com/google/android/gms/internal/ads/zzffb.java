package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Api;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzffb implements zzffa {
    private final ConcurrentHashMap zza;
    private final zzffh zzb;
    private final zzffd zzc = new zzffd();

    public zzffb(zzffh zzffh) {
        this.zza = new ConcurrentHashMap(zzffh.zzd);
        this.zzb = zzffh;
    }

    private final void zzf() {
        Parcelable.Creator<zzffh> creator = zzffh.CREATOR;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgo)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb.append(i10);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzffk) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i11 = 0; i11 < ((zzfez) entry.getValue()).zzb(); i11++) {
                    sb.append("[O]");
                }
                for (int zzb2 = ((zzfez) entry.getValue()).zzb(); zzb2 < this.zzb.zzd; zzb2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfez) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i10 < this.zzb.zzc) {
                i10++;
                sb.append(i10);
                sb.append(".\n");
            }
            zzcat.zze(sb.toString());
        }
    }

    public final zzffh zza() {
        return this.zzb;
    }

    public final synchronized zzffj zzb(zzffk zzffk) {
        zzffj zzffj;
        zzfez zzfez = (zzfez) this.zza.get(zzffk);
        if (zzfez != null) {
            zzffj = zzfez.zze();
            if (zzffj == null) {
                this.zzc.zze();
            }
            zzffx zzf = zzfez.zzf();
            if (zzffj != null) {
                zzayk zza2 = zzayq.zza();
                zzayi zza3 = zzayj.zza();
                zza3.zzd(2);
                zzaym zza4 = zzayn.zza();
                zza4.zza(zzf.zza);
                zza4.zzb(zzf.zzb);
                zza3.zza(zza4);
                zza2.zza(zza3);
                zzffj.zza.zzb().zzc().zzi((zzayq) zza2.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzffj = null;
        }
        return zzffj;
    }

    @Deprecated
    public final zzffk zzc(zzl zzl, String str, zzw zzw) {
        return new zzffl(zzl, str, new zzbvk(this.zzb.zza).zza().zzk, this.zzb.zzf, zzw);
    }

    public final synchronized boolean zzd(zzffk zzffk, zzffj zzffj) {
        boolean zzh;
        zzfez zzfez = (zzfez) this.zza.get(zzffk);
        zzffj.zzd = zzt.zzB().currentTimeMillis();
        if (zzfez == null) {
            zzffh zzffh = this.zzb;
            zzfez zzfez2 = new zzfez(zzffh.zzd, zzffh.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i10 = this.zzb.zzg;
                int i11 = i10 - 1;
                zzffk zzffk2 = null;
                if (i10 != 0) {
                    long j10 = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfez) entry.getValue()).zzc() < j10) {
                                j10 = ((zzfez) entry.getValue()).zzc();
                                zzffk2 = (zzffk) entry.getKey();
                            }
                        }
                        if (zzffk2 != null) {
                            this.zza.remove(zzffk2);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfez) entry2.getValue()).zzd() < j10) {
                                j10 = ((zzfez) entry2.getValue()).zzd();
                                zzffk2 = (zzffk) entry2.getKey();
                            }
                        }
                        if (zzffk2 != null) {
                            this.zza.remove(zzffk2);
                        }
                    } else if (i11 == 2) {
                        int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfez) entry3.getValue()).zza() < i12) {
                                i12 = ((zzfez) entry3.getValue()).zza();
                                zzffk2 = (zzffk) entry3.getKey();
                            }
                        }
                        if (zzffk2 != null) {
                            this.zza.remove(zzffk2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzffk, zzfez2);
            this.zzc.zzd();
            zzfez = zzfez2;
        }
        zzh = zzfez.zzh(zzffj);
        this.zzc.zzc();
        zzffc zza2 = this.zzc.zza();
        zzffx zzf = zzfez.zzf();
        zzayk zza3 = zzayq.zza();
        zzayi zza4 = zzayj.zza();
        zza4.zzd(2);
        zzayo zza5 = zzayp.zza();
        zza5.zza(zza2.zza);
        zza5.zzb(zza2.zzb);
        zza5.zzc(zzf.zzb);
        zza4.zzc(zza5);
        zza3.zza(zza4);
        zzffj.zza.zzb().zzc().zzj((zzayq) zza3.zzal());
        zzf();
        return zzh;
    }

    public final synchronized boolean zze(zzffk zzffk) {
        zzfez zzfez = (zzfez) this.zza.get(zzffk);
        if (zzfez == null) {
            return true;
        }
        if (zzfez.zzb() < this.zzb.zzd) {
            return true;
        }
        return false;
    }
}
