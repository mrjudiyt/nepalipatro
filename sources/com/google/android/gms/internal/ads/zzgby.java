package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgby {
    private final Class zza;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private final List zzc = new ArrayList();
    private zzgbz zzd;
    private zzgmc zze;

    /* synthetic */ zzgby(Class cls, zzgbx zzgbx) {
        this.zza = cls;
        this.zze = zzgmc.zza;
    }

    private final zzgby zze(Object obj, Object obj2, zzgpl zzgpl, boolean z10) {
        byte[] bArr;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        } else if (zzgpl.zzk() == 3) {
            Integer valueOf = Integer.valueOf(zzgpl.zza());
            if (zzgpl.zzf() == zzgqf.RAW) {
                valueOf = null;
            }
            zzgbe zza2 = zzgii.zzb().zza(zzgjc.zza(zzgpl.zzc().zzg(), zzgpl.zzc().zzf(), zzgpl.zzc().zzc(), zzgpl.zzf(), valueOf), zzgch.zza());
            int ordinal = zzgpl.zzf().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = zzgbc.zza;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgpl.zza()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgpl.zza()).array();
            }
            zzgbz zzgbz = new zzgbz(obj, obj2, bArr, zzgpl.zzk(), zzgpl.zzf(), zzgpl.zza(), zzgpl.zzc().zzg(), zza2);
            ConcurrentMap concurrentMap = this.zzb;
            List list = this.zzc;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzgbz);
            zzgcb zzgcb = new zzgcb(zzgbz.zzg(), (zzgca) null);
            List list2 = (List) concurrentMap.put(zzgcb, Collections.unmodifiableList(arrayList));
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list2);
                arrayList2.add(zzgbz);
                concurrentMap.put(zzgcb, Collections.unmodifiableList(arrayList2));
            }
            list.add(zzgbz);
            if (z10) {
                if (this.zzd == null) {
                    this.zzd = zzgbz;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    public final zzgby zza(Object obj, Object obj2, zzgpl zzgpl) {
        zze(obj, obj2, zzgpl, false);
        return this;
    }

    public final zzgby zzb(Object obj, Object obj2, zzgpl zzgpl) {
        zze(obj, obj2, zzgpl, true);
        return this;
    }

    public final zzgby zzc(zzgmc zzgmc) {
        if (this.zzb != null) {
            this.zze = zzgmc;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzgcd zzd() {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzgcd zzgcd = new zzgcd(concurrentMap, this.zzc, this.zzd, this.zze, this.zza, (zzgcc) null);
            this.zzb = null;
            return zzgcd;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
