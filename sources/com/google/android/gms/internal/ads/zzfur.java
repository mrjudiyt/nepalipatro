package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfur {
    static boolean zza(Collection collection, Object obj) {
        Objects.requireNonNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
