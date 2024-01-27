package com.google.android.gms.internal.ads;

import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcpv implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzcpv(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        String str = (String) this.zzc.zzb();
        boolean equals = AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE.equals(str);
        zzt.zzp();
        return new zzaus(UUID.randomUUID().toString(), ((zzcio) this.zza).zza(), str, (JSONObject) this.zzb.zzb(), false, equals);
    }
}
