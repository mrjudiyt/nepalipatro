package com.google.android.gms.internal.ads;

import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdip implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzdip(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcaz zza2 = ((zzcio) this.zza).zza();
        zzt.zzp();
        return new zzaus(UUID.randomUUID().toString(), zza2, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, new JSONObject(), false, true);
    }
}
