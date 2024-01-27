package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfpv {
    private static zzfpv zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfpv(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static zzfpv zzb(Context context) {
        if (zza == null) {
            zza = new zzfpv(context);
        }
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final long zza(String str, long j10) {
        return this.zzc.getLong(str, -1);
    }

    /* access modifiers changed from: package-private */
    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(String str, Object obj) {
        boolean z10;
        if (obj instanceof String) {
            z10 = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            z10 = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            z10 = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            String valueOf = String.valueOf(obj.getClass());
            String str2 = this.zzb;
            throw new IllegalArgumentException("Unexpected object class " + valueOf + " for app " + str2);
        }
        if (!z10) {
            String str3 = this.zzb;
            throw new IOException("Failed to store " + str + " for app " + str3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zze(String str) {
        if (!this.zzc.edit().remove(str).commit()) {
            String str2 = this.zzb;
            throw new IOException("Failed to remove " + str + " for app " + str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf(String str, boolean z10) {
        return this.zzc.getBoolean(str, true);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
