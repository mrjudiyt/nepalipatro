package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbid implements zzfsk {
    public static final /* synthetic */ zzbid zza = new zzbid();

    private /* synthetic */ zzbid() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbjj zzbjj = zzbji.zza;
        if (!((Boolean) zzbea.zzk.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        zzt.zzo().zzu(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
