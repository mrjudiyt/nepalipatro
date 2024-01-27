package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgbu {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzgbt zza(String str) {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzgbt zzgbt = (zzgbt) it.next();
            if (zzgbt.zza()) {
                return zzgbt;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
