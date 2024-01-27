package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
class zzfvl extends zzfvm {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    zzfvl(int i10) {
        this.zza = new Object[i10];
    }

    private final void zzf(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i10) {
            this.zza = Arrays.copyOf(objArr, zzfvm.zze(length, i10));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzfvl zza(Object obj) {
        Objects.requireNonNull(obj);
        zzf(this.zzb + 1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public /* bridge */ /* synthetic */ zzfvm zzb(Object obj) {
        throw null;
    }

    public final zzfvm zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(this.zzb + collection.size());
            if (collection instanceof zzfvn) {
                this.zzb = ((zzfvn) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object zzb2 : iterable) {
            zzb(zzb2);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Object[] objArr, int i10) {
        zzfxa.zzb(objArr, 2);
        zzf(this.zzb + 2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }
}
