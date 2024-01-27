package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zznc;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zza extends AppMeasurement.zza {
    private final zzhf zza;
    private final zziq zzb;

    public zza(zzhf zzhf) {
        super();
        Preconditions.checkNotNull(zzhf);
        this.zza = zzhf;
        this.zzb = zzhf.zzp();
    }

    public final int zza(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    public final Boolean zzb() {
        return this.zzb.zzaa();
    }

    public final Double zzc() {
        return this.zzb.zzab();
    }

    public final Integer zzd() {
        return this.zzb.zzac();
    }

    public final Long zze() {
        return this.zzb.zzad();
    }

    public final String zzf() {
        return this.zzb.zzae();
    }

    public final String zzg() {
        return this.zzb.zzaf();
    }

    public final String zzh() {
        return this.zzb.zzag();
    }

    public final String zzi() {
        return this.zzb.zzae();
    }

    public final String zzj() {
        return this.zzb.zzai();
    }

    public final long zza() {
        return this.zza.zzt().zzm();
    }

    public final void zzb(String str) {
        this.zza.zze().zza(str, this.zza.zzb().elapsedRealtime());
    }

    public final void zzc(String str) {
        this.zza.zze().zzb(str, this.zza.zzb().elapsedRealtime());
    }

    public final Object zza(int i10) {
        if (i10 == 0) {
            return zzj();
        }
        if (i10 == 1) {
            return zze();
        }
        if (i10 == 2) {
            return zzc();
        }
        if (i10 == 3) {
            return zzd();
        }
        if (i10 != 4) {
            return null;
        }
        return zzb();
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        this.zzb.zzb(str, str2, bundle);
    }

    public final void zzb(zzil zzil) {
        this.zzb.zzb(zzil);
    }

    public final List<Bundle> zza(String str, String str2) {
        return this.zzb.zza(str, str2);
    }

    public final Map<String, Object> zza(boolean z10) {
        List<zznc> zza2 = this.zzb.zza(z10);
        a aVar = new a(zza2.size());
        for (zznc next : zza2) {
            Object zza3 = next.zza();
            if (zza3 != null) {
                aVar.put(next.zza, zza3);
            }
        }
        return aVar;
    }

    public final Map<String, Object> zza(String str, String str2, boolean z10) {
        return this.zzb.zza(str, str2, z10);
    }

    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.zzp().zza(str, str2, bundle);
    }

    public final void zza(String str, String str2, Bundle bundle, long j10) {
        this.zzb.zza(str, str2, bundle, true, false, j10);
    }

    public final void zza(zzil zzil) {
        this.zzb.zza(zzil);
    }

    public final void zza(Bundle bundle) {
        this.zzb.zzb(bundle);
    }

    public final void zza(zzim zzim) {
        this.zzb.zza(zzim);
    }
}
