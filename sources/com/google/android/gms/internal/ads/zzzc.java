package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzzc implements zzftm {
    public static final /* synthetic */ zzzc zza = new zzzc();

    private /* synthetic */ zzzc() {
    }

    public final Object zza() {
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object invoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
            Objects.requireNonNull(invoke);
            return (zzdi) invoke;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }
}
