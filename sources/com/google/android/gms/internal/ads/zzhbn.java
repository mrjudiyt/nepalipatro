package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhbn implements zzhbc {
    private static final zzhbc zza = zzhbd.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    /* synthetic */ zzhbn(List list, List list2, zzhbl zzhbl) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzhbm zza(int i10, int i11) {
        return new zzhbm(i10, i11, (zzhbl) null);
    }

    /* renamed from: zzc */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((zzhbp) this.zzc.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza2 = zzhaz.zza(size);
        int size3 = this.zzb.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object zzb2 = ((zzhbp) this.zzb.get(i11)).zzb();
            Objects.requireNonNull(zzb2);
            zza2.add(zzb2);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object next : (Collection) arrayList.get(i12)) {
                Objects.requireNonNull(next);
                zza2.add(next);
            }
        }
        return Collections.unmodifiableSet(zza2);
    }
}
