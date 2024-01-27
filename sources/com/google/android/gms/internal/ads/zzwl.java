package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzwl implements Comparator {
    public static final /* synthetic */ zzwl zza = new zzwl();

    private /* synthetic */ zzwl() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((zzwq) Collections.max((List) obj)).compareTo((zzwq) Collections.max((List) obj2));
    }
}
