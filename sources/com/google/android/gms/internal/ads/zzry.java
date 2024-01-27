package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzry {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = zzfk.zzb;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = zzfk.zzd;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10);
                    for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                        if (supportedPerformancePoints.get(i12).covers(performancePoint)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
