package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzfwj extends zzfxn {
    zzfwj() {
    }

    public final void clear() {
        zza().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object zza = zzfwn.zza(zza(), key);
        if (!zzfsr.zza(zza, entry.getValue())) {
            return false;
        }
        if (zza != null || zza().containsKey(key)) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        return zza().keySet().remove(((Map.Entry) obj).getKey());
    }

    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        try {
            return zzfxo.zzd(this, collection);
        } catch (UnsupportedOperationException unused) {
            return zzfxo.zze(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection collection) {
        int i10;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzfup.zza(size, "expectedSize");
                i10 = size + 1;
            } else {
                i10 = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return zza().keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return zza().size();
    }

    /* access modifiers changed from: package-private */
    public abstract Map zza();
}
