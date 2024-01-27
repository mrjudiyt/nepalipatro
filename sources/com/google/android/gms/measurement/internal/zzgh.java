package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzgh {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final /* synthetic */ zzgd zze;

    private zzgh(zzgd zzgd, String str, long j10) {
        this.zze = zzgd;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j10 > 0);
        this.zza = str + ":start";
        this.zzb = str + ":count";
        this.zzc = str + ":value";
        this.zzd = j10;
    }

    private final long zzb() {
        return this.zze.zzc().getLong(this.zza, 0);
    }

    private final void zzc() {
        this.zze.zzt();
        long currentTimeMillis = this.zze.zzb().currentTimeMillis();
        SharedPreferences.Editor edit = this.zze.zzc().edit();
        edit.remove(this.zzb);
        edit.remove(this.zzc);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    public final Pair<String, Long> zza() {
        long j10;
        this.zze.zzt();
        this.zze.zzt();
        long zzb2 = zzb();
        if (zzb2 == 0) {
            zzc();
            j10 = 0;
        } else {
            j10 = Math.abs(zzb2 - this.zze.zzb().currentTimeMillis());
        }
        long j11 = this.zzd;
        if (j10 < j11) {
            return null;
        }
        if (j10 > (j11 << 1)) {
            zzc();
            return null;
        }
        String string = this.zze.zzc().getString(this.zzc, (String) null);
        long j12 = this.zze.zzc().getLong(this.zzb, 0);
        zzc();
        if (string == null || j12 <= 0) {
            return zzgd.zza;
        }
        return new Pair<>(string, Long.valueOf(j12));
    }

    public final void zza(String str, long j10) {
        this.zze.zzt();
        if (zzb() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.zze.zzc().getLong(this.zzb, 0);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.zze.zzc().edit();
            edit.putString(this.zzc, str);
            edit.putLong(this.zzb, 1);
            edit.apply();
            return;
        }
        long j12 = j11 + 1;
        boolean z10 = (this.zze.zzq().zzv().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.zze.zzc().edit();
        if (z10) {
            edit2.putString(this.zzc, str);
        }
        edit2.putLong(this.zzb, j12);
        edit2.apply();
    }
}
