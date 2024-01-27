package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeun implements zzetv {
    final String zza;
    final int zzb;

    /* synthetic */ zzeun(String str, int i10, zzeum zzeum) {
        this.zza = str;
        this.zzb = i10;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjC)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                bundle.putString("topics", this.zza);
            }
            int i10 = this.zzb;
            if (i10 != -1) {
                bundle.putInt("atps", i10);
            }
        }
    }
}
