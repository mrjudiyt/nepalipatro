package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbif implements zzfsk {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbif(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbjj zzbjj = zzbji.zza;
        if (((Boolean) zzbea.zzk.zze()).booleanValue()) {
            zzt.zzo().zzu(th, "prepareClickUrl.attestation2");
        }
        return this.zza;
    }
}
