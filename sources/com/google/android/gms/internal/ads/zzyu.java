package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzyu implements zzaah, zzdj {
    private final Context zza;
    private final zzaaf zzb;
    private final zzdk zzc;
    private final zzet zzd = new zzet(16);
    private final zzfh zze = new zzfh(10);
    private final zzfh zzf = new zzfh(10);
    private final Handler zzg;
    private final ArrayList zzh;
    private final zzae zzi;
    private zzaae zzj;
    private Executor zzk;
    private zzzj zzl;
    private zzam zzm;
    private Pair zzn;
    private final zzdm zzo;
    private final zzdm zzp;
    private boolean zzq;

    public zzyu(Context context, zzdi zzdi, zzaaf zzaaf, zzam zzam) {
        zzs zzs;
        int i10;
        int i11;
        this.zza = context;
        this.zzb = zzaaf;
        zzfk.zzG(context);
        zzdm zzdm = zzdm.zza;
        this.zzo = zzdm;
        this.zzp = zzdm;
        zzae zzae = null;
        Handler zzv = zzfk.zzv((Handler.Callback) null);
        this.zzg = zzv;
        zzs zzs2 = zzam.zzy;
        if (zzs2 == null || !((i11 = zzs2.zzf) == 7 || i11 == 6)) {
            zzs2 = zzs.zza;
        }
        zzs zzs3 = zzs2;
        if (zzs3.zzf == 7) {
            zzr zzc2 = zzs3.zzc();
            zzc2.zzc(6);
            zzs = zzc2.zzd();
        } else {
            zzs = zzs3;
        }
        this.zzc = zzdi.zza(context, zzv.zzb, zzs3, zzs, false, new zzys(zzv), this);
        Pair pair = this.zzn;
        if (pair == null) {
            this.zzh = new ArrayList();
            if (zzfk.zza < 21 && (i10 = zzam.zzu) != 0) {
                zzae = zzyt.zza((float) i10);
            }
            this.zzi = zzae;
            return;
        }
        zzfc zzfc = (zzfc) pair.second;
        throw null;
    }

    private final void zzh() {
        if (this.zzm != null) {
            ArrayList arrayList = new ArrayList();
            zzae zzae = this.zzi;
            if (zzae != null) {
                arrayList.add(zzae);
            }
            arrayList.addAll(this.zzh);
            if (this.zzm == null) {
                throw null;
            }
            throw null;
        }
    }

    public final void zza(int i10, zzam zzam) {
        this.zzm = zzam;
        zzh();
    }

    public final void zzb(zzaae zzaae, Executor executor) {
        if (zzfk.zzE(this.zzj, zzaae)) {
            zzdx.zzf(zzfk.zzE(this.zzk, executor));
            return;
        }
        this.zzj = zzaae;
        this.zzk = executor;
    }

    public final void zzc(Surface surface, zzfc zzfc) {
        Pair pair = this.zzn;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((zzfc) this.zzn.second).equals(zzfc)) {
            Pair pair2 = this.zzn;
            boolean z10 = true;
            if (pair2 != null && !((Surface) pair2.first).equals(surface)) {
                z10 = false;
            }
            this.zzq = z10;
            this.zzn = Pair.create(surface, zzfc);
            throw null;
        }
    }

    public final void zzd(List list) {
        this.zzh.clear();
        this.zzh.addAll(list);
        zzh();
    }

    public final void zze(zzzj zzzj) {
        this.zzl = zzzj;
    }

    public final boolean zzf() {
        return zzfk.zzG(this.zza);
    }

    public final boolean zzg() {
        return this.zzq;
    }
}
