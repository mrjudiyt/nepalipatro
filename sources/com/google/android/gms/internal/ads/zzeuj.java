package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.c;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeuj implements zzfza {
    public static final /* synthetic */ zzeuj zza = new zzeuj();

    private /* synthetic */ zzeuj() {
    }

    public final e zza(Object obj) {
        zzgxr zza2 = zzgxs.zza();
        for (androidx.privacysandbox.ads.adservices.topics.e next : ((c) obj).a()) {
            zzgxp zza3 = zzgxq.zza();
            zza3.zzc(next.c());
            zza3.zza(next.a());
            zza3.zzb(next.b());
            zza2.zza((zzgxq) zza3.zzal());
        }
        return zzfzt.zzh(new zzeun(Base64.encodeToString(((zzgxs) zza2.zzal()).zzax(), 1), 1, (zzeum) null));
    }
}
