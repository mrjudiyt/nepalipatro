package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzavy implements Comparator {
    zzavy(zzawa zzawa) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzawe zzawe = (zzawe) obj;
        zzawe zzawe2 = (zzawe) obj2;
        int i10 = zzawe.zzc - zzawe2.zzc;
        if (i10 != 0) {
            return i10;
        }
        return (zzawe.zza > zzawe2.zza ? 1 : (zzawe.zza == zzawe2.zza ? 0 : -1));
    }
}
