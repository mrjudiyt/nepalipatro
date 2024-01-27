package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzffo {
    private final HashMap zza = new HashMap();

    public final zzffn zza(zzffe zzffe, Context context, zzfew zzfew, zzffu zzffu) {
        zzffn zzffn = (zzffn) this.zza.get(zzffe);
        if (zzffn != null) {
            return zzffn;
        }
        zzffb zzffb = new zzffb(zzffh.zza(zzffe, context));
        zzffn zzffn2 = new zzffn(zzffb, new zzffw(zzffb, zzfew, zzffu));
        this.zza.put(zzffe, zzffn2);
        return zzffn2;
    }
}
