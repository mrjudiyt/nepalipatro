package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzfsp {
    private final String zza;
    private final zzfsn zzb;
    private zzfsn zzc;

    /* synthetic */ zzfsp(String str, zzfso zzfso) {
        zzfsn zzfsn = new zzfsn((zzfsm) null);
        this.zzb = zzfsn;
        this.zzc = zzfsn;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfsn zzfsn = this.zzb.zzb;
        String str = "";
        while (zzfsn != null) {
            Object obj = zzfsn.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzfsn = zzfsn.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfsp zza(Object obj) {
        zzfsn zzfsn = new zzfsn((zzfsm) null);
        this.zzc.zzb = zzfsn;
        this.zzc = zzfsn;
        zzfsn.zza = obj;
        return this;
    }
}
