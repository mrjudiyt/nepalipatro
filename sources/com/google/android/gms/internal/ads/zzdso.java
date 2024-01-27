package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdso {
    /* access modifiers changed from: private */
    public final zzdst zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    /* access modifiers changed from: private */
    public final Map zzc;

    public zzdso(zzdst zzdst, Executor executor) {
        this.zza = zzdst;
        this.zzc = zzdst.zza();
        this.zzb = executor;
    }

    public final zzdsn zza() {
        zzdsn zzdsn = new zzdsn(this);
        zzdsn unused = zzdsn.zzb.putAll(zzdsn.zza.zzc);
        return zzdsn;
    }

    public final void zze() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkF)).booleanValue()) {
            zzdsn zza2 = zza();
            zza2.zzb(NativeProtocol.WEB_DIALOG_ACTION, "pecr");
            zza2.zzg();
        }
    }
}
