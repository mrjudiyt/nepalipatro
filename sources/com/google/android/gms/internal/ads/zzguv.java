package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzguv extends zzgux {
    private zzguv() {
        super((zzguw) null);
    }

    /* synthetic */ zzguv(zzguu zzguu) {
        super((zzguw) null);
    }

    /* access modifiers changed from: package-private */
    public final List zza(Object obj, long j10) {
        zzgui zzgui = (zzgui) zzgxd.zzh(obj, j10);
        if (zzgui.zzc()) {
            return zzgui;
        }
        int size = zzgui.size();
        zzgui zzd = zzgui.zzd(size == 0 ? 10 : size + size);
        zzgxd.zzv(obj, j10, zzd);
        return zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j10) {
        ((zzgui) zzgxd.zzh(obj, j10)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj, Object obj2, long j10) {
        zzgui zzgui = (zzgui) zzgxd.zzh(obj, j10);
        zzgui zzgui2 = (zzgui) zzgxd.zzh(obj2, j10);
        int size = zzgui.size();
        int size2 = zzgui2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgui.zzc()) {
                zzgui = zzgui.zzd(size2 + size);
            }
            zzgui.addAll(zzgui2);
        }
        if (size > 0) {
            zzgui2 = zzgui;
        }
        zzgxd.zzv(obj, j10, zzgui2);
    }
}
