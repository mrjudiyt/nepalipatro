package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfkc {
    public static zzfkc zza(zzfkd zzfkd, zzfke zzfke) {
        if (zzfka.zzb()) {
            return new zzfkg(zzfkd, zzfke);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, zzfkj zzfkj, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
