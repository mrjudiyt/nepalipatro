package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzyt {
    private static Constructor zza;
    private static Method zzb;
    private static Method zzc;

    public static zzae zza(float f10) {
        try {
            if (zza == null || zzb == null || zzc == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                zza = cls.getConstructor(new Class[0]);
                zzb = cls.getMethod("setRotationDegrees", new Class[]{Float.TYPE});
                zzc = cls.getMethod("build", new Class[0]);
            }
            Object newInstance = zza.newInstance(new Object[0]);
            zzb.invoke(newInstance, new Object[]{Float.valueOf(f10)});
            Object invoke = zzc.invoke(newInstance, new Object[0]);
            Objects.requireNonNull(invoke);
            return (zzae) invoke;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }
}
