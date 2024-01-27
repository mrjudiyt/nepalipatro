package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgjq extends RuntimeException {
    public zzgjq(String str) {
        super(str);
    }

    public static Object zza(zzgjp zzgjp) {
        try {
            return zzgjp.zza();
        } catch (Exception e10) {
            throw new zzgjq((Throwable) e10);
        }
    }

    public zzgjq(String str, Throwable th) {
        super("Creating a protokey serialization failed", th);
    }

    public zzgjq(Throwable th) {
        super(th);
    }
}
