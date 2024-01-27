package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfeu implements zzcxo {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcag zzc;

    public zzfeu(Context context, zzcag zzcag) {
        this.zzb = context;
        this.zzc = zzcag;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final synchronized void zzbF(zze zze) {
        if (zze.zza != 3) {
            this.zzc.zzl(this.zza);
        }
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }
}
