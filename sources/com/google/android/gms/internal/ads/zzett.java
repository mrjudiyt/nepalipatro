package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzett implements zzetw {
    private final zzgad zza;
    private final Context zzb;

    zzett(zzgad zzgad, Context context) {
        this.zza = zzgad;
        this.zzb = context;
    }

    public final int zza() {
        return 37;
    }

    public final e zzb() {
        return this.zza.zzb(new zzetr(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetv zzc() {
        zzbca zzbca = zzbci.zzgb;
        Bundle zzb2 = zzad.zzb(this.zzb, (String) zzba.zzc().zzb(zzbca));
        if (zzb2.isEmpty()) {
            return null;
        }
        return new zzets(zzb2);
    }
}
