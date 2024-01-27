package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzsq implements zzso {
    private zzsq() {
    }

    /* synthetic */ zzsq(zzsp zzsp) {
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo zzb(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    public final boolean zze() {
        return false;
    }
}
