package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgbi {
    private static final Logger zza = Logger.getLogger(zzgbi.class.getName());
    private final ConcurrentMap zzb;

    zzgbi() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzgbh zze(String str) {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgbh) this.zzb.get(str);
    }

    private final synchronized void zzf(zzgbh zzgbh, boolean z10) {
        String zzc = zzgbh.zza().zzc();
        zzgbh zzgbh2 = (zzgbh) this.zzb.get(zzc);
        if (zzgbh2 != null) {
            if (!zzgbh2.zza.getClass().equals(zzgbh.zza.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzc));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zzc, zzgbh2.zza.getClass().getName(), zzgbh.zza.getClass().getName()}));
            }
        }
        this.zzb.putIfAbsent(zzc, zzgbh);
    }

    /* access modifiers changed from: package-private */
    public final zzgbf zza(String str, Class cls) {
        zzgbh zze = zze(str);
        if (zze.zza.zzl().contains(cls)) {
            try {
                return new zzgbg(zze.zza, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        } else {
            String name = cls.getName();
            zzghv zzghv = zze.zza;
            String valueOf = String.valueOf(zzghv.getClass());
            Set<Class> zzl = zzghv.zzl();
            StringBuilder sb = new StringBuilder();
            boolean z10 = true;
            for (Class cls2 : zzl) {
                if (!z10) {
                    sb.append(", ");
                }
                sb.append(cls2.getCanonicalName());
                z10 = false;
            }
            String sb2 = sb.toString();
            throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzgbf zzb(String str) {
        return zze(str).zza();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzc(zzghv zzghv) {
        if (zzghf.zza(zzghv.zzf())) {
            zzf(new zzgbh(zzghv), false);
        } else {
            String valueOf = String.valueOf(zzghv.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzd(String str) {
        return this.zzb.containsKey(str);
    }

    zzgbi(zzgbi zzgbi) {
        this.zzb = new ConcurrentHashMap(zzgbi.zzb);
    }
}
