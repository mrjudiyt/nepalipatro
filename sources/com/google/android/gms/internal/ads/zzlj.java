package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzlj {
    private final zzol zza;
    private final List zzb = new ArrayList();
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final zzli zze;
    private final HashMap zzf;
    private final Set zzg;
    /* access modifiers changed from: private */
    public final zzmb zzh;
    /* access modifiers changed from: private */
    public final zzei zzi;
    private boolean zzj;
    private zzhk zzk;
    private zzvr zzl = new zzvr(0);

    public zzlj(zzli zzli, zzmb zzmb, zzei zzei, zzol zzol) {
        this.zza = zzol;
        this.zze = zzli;
        this.zzh = zzmb;
        this.zzi = zzei;
        this.zzf = new HashMap();
        this.zzg = new HashSet();
    }

    private final void zzr(int i10, int i11) {
        while (i10 < this.zzb.size()) {
            ((zzlh) this.zzb.get(i10)).zzd += i11;
            i10++;
        }
    }

    private final void zzs(zzlh zzlh) {
        zzlg zzlg = (zzlg) this.zzf.get(zzlh);
        if (zzlg != null) {
            zzlg.zza.zzi(zzlg.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlh zzlh = (zzlh) it.next();
            if (zzlh.zzc.isEmpty()) {
                zzs(zzlh);
                it.remove();
            }
        }
    }

    private final void zzu(zzlh zzlh) {
        if (zzlh.zze && zzlh.zzc.isEmpty()) {
            zzlg zzlg = (zzlg) this.zzf.remove(zzlh);
            Objects.requireNonNull(zzlg);
            zzlg.zza.zzp(zzlg.zzb);
            zzlg.zza.zzs(zzlg.zzc);
            zzlg.zza.zzr(zzlg.zzc);
            this.zzg.remove(zzlh);
        }
    }

    private final void zzv(zzlh zzlh) {
        zztr zztr = zzlh.zza;
        zzkz zzkz = new zzkz(this);
        zzlf zzlf = new zzlf(this, zzlh);
        this.zzf.put(zzlh, new zzlg(zztr, zzkz, zzlf));
        zztr.zzh(new Handler(zzfk.zzw(), (Handler.Callback) null), zzlf);
        zztr.zzg(new Handler(zzfk.zzw(), (Handler.Callback) null), zzlf);
        zztr.zzm(zzkz, this.zzk, this.zza);
    }

    private final void zzw(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 >= i10) {
                zzlh zzlh = (zzlh) this.zzb.remove(i11);
                this.zzd.remove(zzlh.zzb);
                zzr(i11, -zzlh.zza.zzC().zzc());
                zzlh.zze = true;
                if (this.zzj) {
                    zzu(zzlh);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcv zzb() {
        if (this.zzb.isEmpty()) {
            return zzcv.zza;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb.size(); i11++) {
            zzlh zzlh = (zzlh) this.zzb.get(i11);
            zzlh.zzd = i10;
            i10 += zzlh.zza.zzC().zzc();
        }
        return new zzlp(this.zzb, this.zzl);
    }

    public final zzcv zzc(int i10, int i11, List list) {
        boolean z10 = true;
        zzdx.zzd(i10 >= 0 && i10 <= i11 && i11 <= zza());
        if (list.size() != i11 - i10) {
            z10 = false;
        }
        zzdx.zzd(z10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((zzlh) this.zzb.get(i12)).zza.zzt((zzbp) list.get(i12 - i10));
        }
        return zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzty zzty, zzcv zzcv) {
        this.zze.zzh();
    }

    public final void zzg(zzhk zzhk) {
        zzdx.zzf(!this.zzj);
        this.zzk = zzhk;
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzlh zzlh = (zzlh) this.zzb.get(i10);
            zzv(zzlh);
            this.zzg.add(zzlh);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzlg zzlg : this.zzf.values()) {
            try {
                zzlg.zza.zzp(zzlg.zzb);
            } catch (RuntimeException e10) {
                zzer.zzd("MediaSourceList", "Failed to release child source.", e10);
            }
            zzlg.zza.zzs(zzlg.zzc);
            zzlg.zza.zzr(zzlg.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zztu zztu) {
        zzlh zzlh = (zzlh) this.zzc.remove(zztu);
        Objects.requireNonNull(zzlh);
        zzlh.zza.zzG(zztu);
        zzlh.zzc.remove(((zzto) zztu).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzlh);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzcv zzk(int i10, List list, zzvr zzvr) {
        if (!list.isEmpty()) {
            this.zzl = zzvr;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                zzlh zzlh = (zzlh) list.get(i11 - i10);
                if (i11 > 0) {
                    zzlh zzlh2 = (zzlh) this.zzb.get(i11 - 1);
                    zzlh.zzc(zzlh2.zzd + zzlh2.zza.zzC().zzc());
                } else {
                    zzlh.zzc(0);
                }
                zzr(i11, zzlh.zza.zzC().zzc());
                this.zzb.add(i11, zzlh);
                this.zzd.put(zzlh.zzb, zzlh);
                if (this.zzj) {
                    zzv(zzlh);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlh);
                    } else {
                        zzs(zzlh);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcv zzl(int i10, int i11, int i12, zzvr zzvr) {
        zzdx.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcv zzm(int i10, int i11, zzvr zzvr) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= zza()) {
            z10 = true;
        }
        zzdx.zzd(z10);
        this.zzl = zzvr;
        zzw(i10, i11);
        return zzb();
    }

    public final zzcv zzn(List list, zzvr zzvr) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzvr);
    }

    public final zzcv zzo(zzvr zzvr) {
        int zza2 = zza();
        if (zzvr.zzc() != zza2) {
            zzvr = zzvr.zzf().zzg(0, zza2);
        }
        this.zzl = zzvr;
        return zzb();
    }

    public final zztu zzp(zztw zztw, zzxz zzxz, long j10) {
        int i10 = zzlp.zzc;
        Object obj = zztw.zza;
        Object obj2 = ((Pair) obj).first;
        zztw zza2 = zztw.zza(((Pair) obj).second);
        zzlh zzlh = (zzlh) this.zzd.get(obj2);
        Objects.requireNonNull(zzlh);
        this.zzg.add(zzlh);
        zzlg zzlg = (zzlg) this.zzf.get(zzlh);
        if (zzlg != null) {
            zzlg.zza.zzk(zzlg.zzb);
        }
        zzlh.zzc.add(zza2);
        zzto zzH = zzlh.zza.zzI(zza2, zzxz, j10);
        this.zzc.put(zzH, zzlh);
        zzt();
        return zzH;
    }

    public final zzvr zzq() {
        return this.zzl;
    }
}
