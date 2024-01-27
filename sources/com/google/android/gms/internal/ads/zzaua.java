package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaua extends zzaud {
    private final View zzi;

    public zzaua(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11, View view) {
        super(zzasp, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", zzaom, i10, 57);
        this.zzi = view;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        if (this.zzi != null) {
            Boolean bool = (Boolean) zzba.zzc().zzb(zzbci.zzdh);
            Boolean bool2 = (Boolean) zzba.zzc().zzb(zzbci.zzka);
            DisplayMetrics displayMetrics = this.zzb.zzb().getResources().getDisplayMetrics();
            zzast zzast = new zzast((String) this.zzf.invoke((Object) null, new Object[]{this.zzi, displayMetrics, bool, bool2}));
            zzaph zza = zzapi.zza();
            zza.zzb(zzast.zza.longValue());
            zza.zzd(zzast.zzb.longValue());
            zza.zze(zzast.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzast.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzast.zzd.longValue());
            }
            this.zze.zzY((zzapi) zza.zzal());
        }
    }
}
