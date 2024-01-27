package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzib implements Callable<List<zzmh>> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ zzhj zzc;

    zzib(zzhj zzhj, zzo zzo, Bundle bundle) {
        this.zzc = zzhj;
        this.zza = zzo;
        this.zzb = bundle;
    }

    public final /* synthetic */ Object call() {
        this.zzc.zza.zzr();
        zzmp zza2 = this.zzc.zza;
        zzo zzo = this.zza;
        Bundle bundle = this.zzb;
        zza2.zzl().zzt();
        if (!zzpg.zza() || !zza2.zze().zze(zzo.zza, zzbi.zzcf) || zzo.zza == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zza2.zzj().zzg().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        zzao zzf = zza2.zzf();
                        String str = zzo.zza;
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        Preconditions.checkNotEmpty(str);
                        zzf.zzt();
                        zzf.zzak();
                        try {
                            int delete = zzf.e_().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            zzft zzp = zzf.zzj().zzp();
                            zzp.zza("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            zzf.zzj().zzg().zza("Error pruning trigger URIs. appId", zzfr.zza(str), e10);
                        }
                    }
                }
            }
        }
        return zza2.zzf().zzh(zzo.zza);
    }
}
