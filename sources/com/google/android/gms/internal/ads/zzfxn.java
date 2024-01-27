package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzfxn extends AbstractSet {
    zzfxn() {
    }

    public boolean removeAll(Collection collection) {
        return zzfxo.zzd(this, collection);
    }

    public boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
