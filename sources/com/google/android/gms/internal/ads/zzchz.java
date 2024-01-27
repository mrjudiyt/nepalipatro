package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzchz {
    private final zzcaz zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* synthetic */ zzchz(zzchx zzchx, zzchy zzchy) {
        this.zza = zzchx.zza;
        this.zzb = zzchx.zzb;
        this.zzc = zzchx.zzc;
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzb;
    }

    public final zzaro zzb() {
        return new zzaro(new zzi(this.zzb, this.zza));
    }

    /* access modifiers changed from: package-private */
    public final zzbev zzc() {
        return new zzbev(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final zzcaz zzd() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final String zze() {
        return zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    /* access modifiers changed from: package-private */
    public final WeakReference zzf() {
        return this.zzc;
    }
}
