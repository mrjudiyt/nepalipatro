package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgwl implements Iterator {
    final /* synthetic */ zzgwp zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzgwl(zzgwp zzgwp, zzgwk zzgwk) {
        this.zza = zzgwp;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        if (this.zzb + 1 >= this.zza.zzb.size()) {
            return !this.zza.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 < this.zza.zzb.size()) {
            return (Map.Entry) this.zza.zzb.get(this.zzb);
        }
        return (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            if (this.zzb < this.zza.zzb.size()) {
                zzgwp zzgwp = this.zza;
                int i10 = this.zzb;
                this.zzb = i10 - 1;
                Object unused = zzgwp.zzl(i10);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
