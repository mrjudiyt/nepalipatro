package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzsi implements zzss {
    public static final /* synthetic */ zzsi zza = new zzsi();

    private /* synthetic */ zzsi() {
    }

    public final int zza(Object obj) {
        int i10 = zzst.zza;
        String str = ((zzrz) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (zzfk.zza >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
