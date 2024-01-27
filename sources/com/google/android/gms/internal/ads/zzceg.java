package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzceg implements Iterable {
    private final List zza = new ArrayList();

    public final Iterator iterator() {
        return this.zza.iterator();
    }

    /* access modifiers changed from: package-private */
    public final zzcef zza(zzcdc zzcdc) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcef zzcef = (zzcef) it.next();
            if (zzcef.zza == zzcdc) {
                return zzcef;
            }
        }
        return null;
    }

    public final void zzb(zzcef zzcef) {
        this.zza.add(zzcef);
    }

    public final void zzc(zzcef zzcef) {
        this.zza.remove(zzcef);
    }

    public final boolean zzd(zzcdc zzcdc) {
        ArrayList<zzcef> arrayList = new ArrayList<>();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcef zzcef = (zzcef) it.next();
            if (zzcef.zza == zzcdc) {
                arrayList.add(zzcef);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzcef zzcef2 : arrayList) {
            zzcef2.zzb.zzf();
        }
        return true;
    }
}
