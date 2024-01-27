package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgrk implements zzgrn {
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
