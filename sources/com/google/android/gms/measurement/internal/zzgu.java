package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzgu implements zzv {
    private final /* synthetic */ zzgp zza;

    zzgu(zzgp zzgp) {
        this.zza = zzgp;
    }

    public final void zza(zzs zzs, String str, List<String> list, boolean z10, boolean z11) {
        zzft zzft;
        int i10 = zzgw.zza[zzs.ordinal()];
        if (i10 == 1) {
            zzft = this.zza.zzj().zzc();
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    zzft = this.zza.zzj().zzn();
                } else {
                    zzft = this.zza.zzj().zzp();
                }
            } else if (z10) {
                zzft = this.zza.zzj().zzw();
            } else if (!z11) {
                zzft = this.zza.zzj().zzv();
            } else {
                zzft = this.zza.zzj().zzu();
            }
        } else if (z10) {
            zzft = this.zza.zzj().zzm();
        } else if (!z11) {
            zzft = this.zza.zzj().zzh();
        } else {
            zzft = this.zza.zzj().zzg();
        }
        int size = list.size();
        if (size == 1) {
            zzft.zza(str, list.get(0));
        } else if (size == 2) {
            zzft.zza(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzft.zza(str);
        } else {
            zzft.zza(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
