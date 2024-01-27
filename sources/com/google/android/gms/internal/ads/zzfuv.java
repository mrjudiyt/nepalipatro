package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfuv extends AbstractSet {
    final /* synthetic */ zzfvb zza;

    zzfuv(zzfvb zzfvb) {
        this.zza = zzfvb;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzd = this.zza.zzq(entry.getKey());
            if (zzd != -1) {
                Object[] objArr = this.zza.zzc;
                objArr.getClass();
                if (zzfsr.zza(objArr[zzd], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Iterator iterator() {
        zzfvb zzfvb = this.zza;
        Map zzj = zzfvb.zzj();
        if (zzj != null) {
            return zzj.entrySet().iterator();
        }
        return new zzfut(zzfvb);
    }

    public final boolean remove(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfvb zzfvb = this.zza;
        if (zzfvb.zzo()) {
            return false;
        }
        int zzc = zzfvb.zzp();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfvb zzfvb2 = this.zza;
        Object zzh = zzfvb.zzh(zzfvb2);
        int[] iArr = zzfvb2.zza;
        iArr.getClass();
        zzfvb zzfvb3 = this.zza;
        Object[] objArr = zzfvb3.zzb;
        objArr.getClass();
        Object[] objArr2 = zzfvb3.zzc;
        objArr2.getClass();
        int zzb = zzfvc.zzb(key, value, zzc, zzh, iArr, objArr, objArr2);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzn(zzb, zzc);
        zzfvb zzfvb4 = this.zza;
        zzfvb4.zzg = zzfvb4.zzg - 1;
        this.zza.zzl();
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
