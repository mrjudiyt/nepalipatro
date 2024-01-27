package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgrr extends ThreadLocal {
    final /* synthetic */ zzgrs zza;

    zzgrr(zzgrs zzgrs) {
        this.zza = zzgrs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzgrf.zzb.zza(this.zza.zzb);
            mac.init(this.zza.zzc);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
