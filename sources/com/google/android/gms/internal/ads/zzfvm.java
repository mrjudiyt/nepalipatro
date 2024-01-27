package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfvm {
    zzfvm() {
    }

    static int zze(int i10, int i11) {
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int highestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = highestOneBit + highestOneBit;
        }
        return i12 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i12;
    }

    public abstract zzfvm zzb(Object obj);
}
