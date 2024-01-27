package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzgj extends IOException {
    public final int zza;

    public zzgj(int i10) {
        this.zza = i10;
    }

    public zzgj(String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzgj(String str, Throwable th, int i10) {
        super(str, th);
        this.zza = i10;
    }

    public zzgj(Throwable th, int i10) {
        super(th);
        this.zza = i10;
    }
}
