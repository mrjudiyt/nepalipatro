package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzftq {
    private static final Object zza;
    private static final Method zzb;
    private static final Method zzc;

    static {
        Method method;
        Object zza2 = zza();
        zza = zza2;
        Method method2 = null;
        if (zza2 == null) {
            method = null;
        } else {
            method = zzb("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        zzb = method;
        if (zza2 != null) {
            method2 = zzc(zza2);
        }
        zzc = method2;
    }

    private static Object zza() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzb(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzc(Object obj) {
        try {
            Method zzb2 = zzb("getStackTraceDepth", Throwable.class);
            if (zzb2 == null) {
                return null;
            }
            zzb2.invoke(obj, new Object[]{new Throwable()});
            return zzb2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
