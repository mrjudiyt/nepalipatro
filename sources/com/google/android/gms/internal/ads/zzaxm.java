package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzaxm implements Runnable {
    public final /* synthetic */ zzaxp zza;
    public final /* synthetic */ zzaxg zzb;
    public final /* synthetic */ zzaxh zzc;
    public final /* synthetic */ zzcbl zzd;

    public /* synthetic */ zzaxm(zzaxp zzaxp, zzaxg zzaxg, zzaxh zzaxh, zzcbl zzcbl) {
        this.zza = zzaxp;
        this.zzb = zzaxg;
        this.zzc = zzaxh;
        this.zzd = zzcbl;
    }

    public final void run() {
        zzaxe zzaxe;
        zzaxp zzaxp = this.zza;
        zzaxg zzaxg = this.zzb;
        zzcbl zzcbl = this.zzd;
        try {
            zzaxj zzq = zzaxg.zzq();
            boolean zzp = zzaxg.zzp();
            zzaxh zzaxh = this.zzc;
            if (zzp) {
                zzaxe = zzq.zzg(zzaxh);
            } else {
                zzaxe = zzq.zzf(zzaxh);
            }
            if (!zzaxe.zze()) {
                zzcbl.zzd(new RuntimeException("No entry contents."));
                zzaxr.zze(zzaxp.zzc);
                return;
            }
            zzaxo zzaxo = new zzaxo(zzaxp, zzaxe.zzc(), 1);
            int read = zzaxo.read();
            if (read != -1) {
                zzaxo.unread(read);
                zzcbl.zzc(zzaxt.zzb(zzaxo, zzaxe.zzd(), zzaxe.zzg(), zzaxe.zza(), zzaxe.zzf()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e10) {
            zzcat.zzh("Unable to obtain a cache service instance.", e10);
            zzcbl.zzd(e10);
            zzaxr.zze(zzaxp.zzc);
        }
    }
}
