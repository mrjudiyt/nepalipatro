package com.google.android.gms.measurement.internal;

import androidx.collection.f;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzb;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzgv extends f<String, zzb> {
    private final /* synthetic */ zzgp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgv(zzgp zzgp, int i10) {
        super(20);
        this.zza = zzgp;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzgp.zza(this.zza, str);
    }
}
