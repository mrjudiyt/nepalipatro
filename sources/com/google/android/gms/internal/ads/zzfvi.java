package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfvi extends zzfvj implements Map {
    protected zzfvi() {
    }

    public final void clear() {
        zzb().clear();
    }

    public boolean containsKey(Object obj) {
        return zzb().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return zzb().containsValue(obj);
    }

    public Set entrySet() {
        return zzb().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || zzb().equals(obj);
    }

    public Object get(Object obj) {
        return zzb().get(obj);
    }

    public int hashCode() {
        return zzb().hashCode();
    }

    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    public Set keySet() {
        return zzb().keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    public final Object remove(Object obj) {
        return zzb().remove(obj);
    }

    public int size() {
        return zzb().size();
    }

    public final Collection values() {
        return zzb().values();
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract Map zzb();

    /* access modifiers changed from: protected */
    public final int zzc() {
        return zzfxo.zza(entrySet());
    }

    /* access modifiers changed from: protected */
    public final boolean zzd(Object obj) {
        zzfwi zzfwi = new zzfwi(entrySet().iterator());
        if (obj == null) {
            while (zzfwi.hasNext()) {
                if (zzfwi.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfwi.hasNext()) {
                if (obj.equals(zzfwi.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean zze(Object obj) {
        return zzfwn.zzb(this, obj);
    }
}
