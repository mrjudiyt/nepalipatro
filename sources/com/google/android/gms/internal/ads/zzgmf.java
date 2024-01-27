package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgmf {
    private ArrayList zza = new ArrayList();
    private zzgmc zzb = zzgmc.zza;
    private Integer zzc = null;

    public final zzgmf zza(zzgbj zzgbj, int i10, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzgmh(zzgbj, i10, str, str2, (zzgmg) null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzgmf zzb(zzgmc zzgmc) {
        if (this.zza != null) {
            this.zzb = zzgmc;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzgmf zzc(int i10) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i10);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzgmj zzd() {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int zza2 = ((zzgmh) arrayList.get(i10)).zza();
                    i10++;
                    if (zza2 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzgmj zzgmj = new zzgmj(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, (zzgmi) null);
            this.zza = null;
            return zzgmj;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
