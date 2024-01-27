package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzagw extends zzagy {
    public final long zza;
    public final List zzb = new ArrayList();
    public final List zzc = new ArrayList();

    public zzagw(int i10, long j10) {
        super(i10);
        this.zza = j10;
    }

    public final String toString() {
        List list = this.zzb;
        String zzf = zzagy.zzf(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzf + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzagw zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzagw zzagw = (zzagw) this.zzc.get(i11);
            if (zzagw.zzd == i10) {
                return zzagw;
            }
        }
        return null;
    }

    public final zzagx zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzagx zzagx = (zzagx) this.zzb.get(i11);
            if (zzagx.zzd == i10) {
                return zzagx;
            }
        }
        return null;
    }

    public final void zzc(zzagw zzagw) {
        this.zzc.add(zzagw);
    }

    public final void zzd(zzagx zzagx) {
        this.zzb.add(zzagx);
    }
}
