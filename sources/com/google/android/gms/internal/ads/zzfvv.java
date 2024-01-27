package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfvv implements Map, Serializable {
    private transient zzfvx zza;
    private transient zzfvx zzb;
    private transient zzfvn zzc;

    zzfvv() {
    }

    public static zzfvv zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfvu zzfvu = new zzfvu(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfvu.zzb(entrySet);
        return zzfvu.zzc();
    }

    public static zzfvv zzd() {
        return zzfxh.zza;
    }

    public static zzfvv zze(Object obj, Object obj2) {
        zzfup.zzb("dialog_not_shown_reason", obj2);
        return zzfxh.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, (zzfvu) null);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        return zzfwn.zzb(this, obj);
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zzfxo.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfup.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract zzfvn zza();

    /* renamed from: zzb */
    public final zzfvn values() {
        zzfvn zzfvn = this.zzc;
        if (zzfvn != null) {
            return zzfvn;
        }
        zzfvn zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzfvx zzf();

    /* access modifiers changed from: package-private */
    public abstract zzfvx zzg();

    /* renamed from: zzh */
    public final zzfvx entrySet() {
        zzfvx zzfvx = this.zza;
        if (zzfvx != null) {
            return zzfvx;
        }
        zzfvx zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    /* renamed from: zzi */
    public final zzfvx keySet() {
        zzfvx zzfvx = this.zzb;
        if (zzfvx != null) {
            return zzfvx;
        }
        zzfvx zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }
}
