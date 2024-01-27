package com.google.android.gms.internal.ads;

import androidx.collection.h;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdju {
    public static final zzdju zza = new zzdju(new zzdjs());
    private final zzbgp zzb;
    private final zzbgm zzc;
    private final zzbhc zzd;
    private final zzbgz zze;
    private final zzbmb zzf;
    private final h zzg;
    private final h zzh;

    private zzdju(zzdjs zzdjs) {
        this.zzb = zzdjs.zza;
        this.zzc = zzdjs.zzb;
        this.zzd = zzdjs.zzc;
        this.zzg = new h(zzdjs.zzf);
        this.zzh = new h(zzdjs.zzg);
        this.zze = zzdjs.zzd;
        this.zzf = zzdjs.zze;
    }

    public final zzbgm zza() {
        return this.zzc;
    }

    public final zzbgp zzb() {
        return this.zzb;
    }

    public final zzbgs zzc(String str) {
        return (zzbgs) this.zzh.get(str);
    }

    public final zzbgv zzd(String str) {
        return (zzbgv) this.zzg.get(str);
    }

    public final zzbgz zze() {
        return this.zze;
    }

    public final zzbhc zzf() {
        return this.zzd;
    }

    public final zzbmb zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i10 = 0; i10 < this.zzg.size(); i10++) {
            arrayList.add((String) this.zzg.i(i10));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
